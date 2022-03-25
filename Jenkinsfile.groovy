pipeline {
    agent any
    parameters {
        string(name: 'Username', defaultValue: '' , description: 'Please write your username')
        string(name: 'EmailID', defaultValue: '' , description: 'Please write your email')
        choice(name: 'Country', choices:[ 'US','India','Canada','UK','China'] , description: 'Please select your country')
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('User Data') {
            when {
                expression { 
                   return params.Username == 'abc'
                }
            }
            steps {
                    sh """
                    echo "deploy to production"
                    """
                }
            }
    } 
    }
