pipelines{
  agent any
  stages{
    stage('Build'){
      steps{
        echo 'building project;
        bat 'javac userfinder.java'
      }
    }
    stage('test'){
      steps{
        echo 'testing project;
        bat java 'userfinder'
      }
    }
  }
}
      
