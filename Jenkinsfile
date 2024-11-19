pipeline {

    agent any

    tools{
        gradle "Gradle"
   }
    stages{
        stage("Tarea de Limpieza"){
            steps{
                git branch: 'main',
                url: 'https://github.com/JhonHiguita99/SelenuimUdemy.git'
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