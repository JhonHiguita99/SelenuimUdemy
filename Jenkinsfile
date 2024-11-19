pipeline {

    agent any

    tools{
        gradle "Gradle"
   }
    stages{
        stage("Tarea de Limpieza"){
            steps{
                checkout scmGit(branches: [[name: 'main']],
                userRemoteConfigs: [[url: 'https:'https://github.com/JhonHiguita99/SelenuimUdemy.git'']])
                //Ejecutar la tarea Clean
                sh 'gradle clean'
           }
       }
       stage("Imprimo Cositas"){
            steps{
                echo "Soy Un stage aparte"
            }
       }
   }
}