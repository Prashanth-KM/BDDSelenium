#!/bin/bash
set +e

# shellcheck disable=SC1090
source /build_scripts/${CICD_SCRIPTS_VERSION}/app/init.sh


function sectionHeader(){
    echo
    echo "##########################################################"
    echo "$1"
    echo "##########################################################"
    echo
}


sectionHeader "Begin Maven Test Cases Execution"

sectionHeader "Running MVN test cases"
mvn clean test -DTestNG.xml=testng.xml -DEnv=$1

sectionHeader "Successfully completed Maven test cases"

