pipeline{
	agent any
	tools{
		ant "Ant_1.10.15"
	}
	
	stages{
		
		stage("Source"){
			steps{
				git branch:"main", url:"https://github.com/samruddhij07/student-system-testing.git"
			}
		}
	
		stage("Build and compile"){
			steps{
				bat "ant -f student-system-testing.xml compile"
			}
		}

		stage("Unit testing"){
			steps{
				bat "ant -f student-system-testing.xml test"
			}
		}

		stage("SonarQube Analysis") {
            steps {
                withSonarQubeEnv('SonarServer') {
                    bat "ant -f student-system-testing.xml sonar"
                }
            }
        }

		stage("Quality Gate") {
		    steps {
		        // This is the "Hook" that asks SonarQube: "Did she pass or fail?"
		        waitForQualityGate abortPipeline: true
			    }
			}

		stage("Publish to Artifactory") {
            steps {
                bat "ant -f student-system-testing.xml publish"
            	}
        	}
		}

	post{
		always{
			junit "test-reports/*.xml"
		}
		success{
			echo "Student grade system tested successfully!"
		}
		failure{
			echo "Testing failed! Please check test results!"
		}
	}
}
