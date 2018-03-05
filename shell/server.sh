#!/bin/sh
source /etc/profile

usage()
{
    echo "Usage: ${0##*/} {start|stop|restart} [ CONFIGS ... ] "
    exit 1
}

[ $# -gt 0 ] || usage

SERVER_NAME="bpRoast"
SERVICE_HOME="/opt/webapp/"${SERVER_NAME}
ONLINE_ENV=" -Dconfig.product=true  "


start()
{
    mkdir -p /opt/logs/gc
    echo "${SERVER_NAME} is going to start ..."
   /opt/apps/resin/bin/resin.sh -conf /opt/nuc_git/bp-roast/resinConf/resin_bp_roast_server.xml --resin-home /opt/apps_install/resin-4.0.44 start
    echo "${SERVER_NAME} is started ..."
    ps aux | grep -i ${SERVER_NAME}

}

stop()
{
   /opt/apps/resin/bin/resin.sh -conf /opt/nuc_git/bp-roast/resinConf/resin_bp_roast_server.xml --resin-home /opt/apps_install/resin-4.0.44 stop
}

forceStop()
{
    echo "${SERVER_NAME} is going to stop ..."
    ps aux |grep ${SERVER_NAME} | grep -v grep |awk '{print $2}'|while read pid
    do
        kill -9 $pid
    done
    echo  "${SERVER_NAME} is stoped ..."
}

status()
{
    ps aux |grep ${SERVER_NAME} | grep -v grep |awk '{print $2}'|while read pid
    do
    echo "${SERVER_NAME} pid is $pid "
    ps -p $pid -olstart
    done
}


case "$1" in
start)
  start  $2
  ;;
stop)
  stop
  ;;
status)
  status
  ;;
forceStop)
 forceStop
 ;;
restart)
  stop
  sleep 3
  start   $2
  ;;
*)
  printf "Usage: ${0##*/} {start|stop|restart} [ CONFIGS ... ] "
  exit 1
  ;;
esac