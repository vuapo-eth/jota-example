# ABOUT

This is an example on how to use the official iota java library ([iota.lib.java](https://github.com/iotaledger/iota.lib.java)) together with Maven.

# INSTALLATION

## 1) REQUIREMENTS

You need to have Maven and the JRE (or the JDK, which includes the JRE) installed.

## 2) DOWNLOAD THE PROJECT

There are three ways to download this project:

### MANUAL DOWNLOAD

1) [download](https://github.com/mikrohash/jota-example/archive/master.zip) this repository and unzip it

2) open your console and `cd` yourself into the unzipped directory 
    
### DOWNLOAD VIA WGET

    $ wget https://github.com/mikrohash/jota-example/archive/master.zip
    $ unzip master.zip
    $ cd jota-example-master
    
### DOWNLOAD VIA GIT

	$ git clone https://github.com/mikrohash/jota-example/
    $ cd jota-example

## 3) CREATE AN EXECUTABLE JAR FILE

    $ mvn install
    
This will create a '*target/*' directory, in which you will find your executable jar file.

## 4) EXECUTING THE JAR FILE

Simply start the .jar with your JRE:

	$ java -jar target/jota-example-1.0.jar