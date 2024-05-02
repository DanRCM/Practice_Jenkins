pipeline {
  agent any
  stages {
    stage("Clean up") {
      steps {
        deleteDir()
      }
    }
    stage("Clone Repo") {
      steps {
        bat "cmd /c git clone https://github.com/DanRCM/Practice_Jenkins.git"
      }
    }
    stage("Build") {
      steps {
        dir("Practice_Jenkins") { // This directory contains the pom.xml file
          bat "cmd /c mvn clean install"
        }
      }
    }
    stage("Test") {
      steps {
        dir("Practice_Jenkins") { // This directory contains the pom.xml file
          bat "cmd /c mvn test"
        }
      }
    }
  }
}

pipeline{
  agent any
  stages{
    stage("Hello proof"){
      steps{
        bat "cmd /c echo hola"
      }
    }
  }
}