Pour compiler le logiciel resaTC vous devez exécuter les commandes suivantes dans votre terminal préféré:


#Pour décompresser l'archive
#Se placer dans le dossier contenant le fichier .tar.gz
cd anbarasu-boller
#Extraire les fichiers contenue dans l'archive
tar zxvf SI3_MiniProjet_Java-Mini\ Projet\ Java-anbarasu-boller-src.gz 

#Pour compiler le projet
#Créer les dossier ou seront compilés les fichier
mkdir -p build/classes
#Compiler les fichier .java
javac -d build/classes `find . -name "*.java"`


#pour exécuter le logiciel
java -cp build/classes v2.Admin