#!/bin/sh
source /etc/profile
source /root/.bash_profile
SERVER_NAME="bpRoast"
SERVICE_HOME="/opt/webapp/"${SERVER_NAME}
mkdir -p ${SERVICE_HOME}
cd ..
git status
branch="develop"
if [ ! -n "$1" ] ;then
    echo "going to deploy "${branch}
else
    branch=$1
    echo "going to deploy "${branch}
fi
git checkout ${branch}
git pull origin ${branch}
git push origin ${branch}
mvn clean install -U -Dmaven.test.skip=true -Ptest
cd target
rm -rf ${SERVICE_HOME}/*
cp ./*.war ${SERVICE_HOME}
cd ${SERVICE_HOME}
unzip ./*.war
rm -rf ./*.war
echo "DEPLOY ${SERVER_NAME}  success ... "