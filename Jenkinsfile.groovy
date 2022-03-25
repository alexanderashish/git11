pipeline {
    agent any
    parameters {
        string(name: 'Username', defaultValue: '' , description: 'Please write your username')
        string(name: 'EmailID', defaultValue: '' , description: 'Please write your email')
	  password(name: 'Password', defaultValue: '' , description: '')
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
                    params.Username == 'abc'
                }
            }
            steps {
                    
                    echo "deploy to production"
                }
            }
    } 
    }
