pipeline {

    agent any

    tools{
        gradle "Gradle"
   }
    stages{
        stage("Tarea de Limpieza"){
            step{
                //Agarra el Repo donde se encuentra el codigo que se necesita correr
                git 'https://github.com/JhonHiguita99/SelenuimUdemy.git'

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