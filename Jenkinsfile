pipeline{
  agent any
  stages {
    stages("Parallel Execution"){
      steps {
        parallel (
              a: {
                bat "mvn clean"
              },
              b: {
                bat "mvn test"
              },
              c: {
                bat "mvn package"
              }
          )
      }
    }
    stage("Consolidate Results"){
       steps {
        input("Do you want to capture results?")
        junit '**/target/surefire-reports/TEST-*.xml'
        archive 'target/*.jar'
       }
    }
  }
}
