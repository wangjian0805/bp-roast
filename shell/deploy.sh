#!/bin/sh
source /etc/profile
source /root/.bash_profile
SERVER_NAME="bpRoast"
SERVICE_HOME="/opt/webapp/"${SERVER_NAME}
mkdir -p ${SERVICE_HOME}
cd ..
git status
git checkout master
git pull origin master
git push origin master
mvn clean install -U -Dmaven.test.skip=true -Pproduction
cd target
rm -rf ${SERVICE_HOME}/*
cp ./*.war ${SERVICE_HOME}
cd ${SERVICE_HOME}
unzip ./*.war
rm -rf ./*.war
echo "DEPLOY ${SERVER_NAME} Server success ... "