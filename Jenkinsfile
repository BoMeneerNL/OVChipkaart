pipeline{
  agent any
  stages{
  
    stage("env-test"){
      steps{
        echo'Started Enviroment Tests...'
        sh 'gradle -v'
        
      } 
    }
    stage("build"){
      steps{
        echo'Started building...'
        sh 'gradlew build'
      } 
    }
  stage("cleanup"){
      steps{
       echo'Çleaning up...'
       sh 'gradlew clean'
      } 
    }
  }
}
