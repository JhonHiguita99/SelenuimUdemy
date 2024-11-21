pipeline {

    agent any

    tools{
        gradle "Gradle"
   }
    stages{
        stage("Tarea de Limpieza"){
            steps{
                git 'https://github.com/JhonHiguita99/SelenuimUdemy.git'
                //Ejecutar la tarea Clean
                sh 'gradle clean'
           }
       }
   }
       post {
            failure {
                echo 'Siempre me voy a aparecer al job fallar'
           }
            success {
                echo 'la ejecución termino SUCCESS'
           }
      }

}
