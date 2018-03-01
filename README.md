# ABOUT

This is an example on how to use the official iota java library ([iota.lib.java](https://github.com/iotaledger/iota.lib.java)) together with Maven.

# INSTALLATION

## 1. GET THE REQUIREMENTS (JRE & MAVEN)

Please make sure you have the **JRE** (Java Runtime Environment) and **Maven** installed. Here is how to do that:

### UBUNTU

Depending on your permissions, you might have to write `sudo` in front of each line.

	$ apt update
	$ add-apt-repository ppa:webupd8team/java
	$ apt-get update
	$ apt-get install oracle-java8-installer
	$ apt-get install -y maven 
	$ apt-get install oracle-java8-set-default

To check whether the installations went successfully, execute these commands:

	$ java -version
	$ mvn --version

credits to [this guide](https://medium.com/@scott.tudd/an-almost-complete-guide-to-setting-up-a-full-iota-node-d9784dfdc80).

### WINDOWS

Please install the **JRE** from [oracle.com](http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html). You can check whether it works by executing `java -version` in your console. After that, proceed to install **Maven**:

1. download the latest version of Maven from [maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

2. unzip it into the folder where you want to install Maven (e.g. C:\Program Files\Apache\maven)

3. add both `M2_HOME` and `MAVEN_HOME` variables in the Windows system enviroment and point it to the maven folder (C:\Program Files\Apache\maven)

4. update the `PATH` variable, append Maven bin folder: %M2_HOME%\bin (now you can run maven commands everywhere)

5. to test whether it works, execute `mvn --version` in cmd, this should show you details about the installed version, directory etc.

## 2. INSTALL THE DEPENDENCIES

You need to install the official IOTA java library **JOTA** ([iota.lib.java](https://github.com/iotaledger/iota.lib.java)) locally. There are several ways to do that:

### METHOD A: DOWNLOAD VIA WGET

	$ cd ~/somewhere-over-the-rainbow/
	$ wget https://github.com/iotaledger/iota.lib.java/archive/master.zip
	$ unzip master.zip
	$ cd iota.lib.java-master
	$ mvn install
	
### METHOD B: DOWNLOAD VIA GIT

For this you will need the GIT plugin (installation on UBUNTU via: `sudo apt-get install git`)

	$ cd ~/somewhere-over-the-rainbow/
	$ git clone https://github.com/iotaledger/iota.lib.java
	$ cd iota.lib.java
	$ mvn install
	
### METHOD C: MANUAL DOWNLOAD

1. go to [github.com/iotaledger/iota.lib.java](https://github.com/iotaledger/iota.lib.java)

2. click on `Clone or download` and select `Download ZIP`

3. unzip the downloaded master.zip file

4. open you console (CMD on windows) and `cd` yourself into the directory `iota.lib.java-master/` you just unzipped

5. execute `mvn install` to locally install the iota.lib.java repository

## 3. CREATE THE JAR FILE

Simply create the executable .jar directly from the GitHub source code. Again, there are several ways to do that:

### METHOD A: DOWNLOAD VIA WGET

	$ cd ~/my-favorite-directory/
	$ wget https://github.com/mikrohash/jota-example/archive/master.zip
	$ unzip master.zip
	$ cd jota-example-master
	$ mvn versions:use-latest-versions -DallowSnapshots=true -DexcludeReactor=false
	$ mvn install

### METHOD B: DOWNLOAD VIA GIT

For this you will need the GIT plugin (installation on UBUNTU via: `sudo apt-get install git`)
	
	$ cd ~/my-favorite-directory/
	$ git clone https://github.com/mikrohash/jota-example
	$ cd jota-example
	$ mvn versions:use-latest-versions -DallowSnapshots=true -DexcludeReactor=false
	$ mvn install
	
### METHOD C: MANUAL DOWNLOAD

1. go to [github.com/mikrohash/jota-example](https://github.com/mikrohash/jota-example)

2. click on `Clone or download` and select `Download ZIP`

3. unzip the downloaded master.zip file

4. open you console (CMD on windows) and `cd` yourself into the directory `jota-example-master/` you just unzipped

5. run `mvn versions:use-latest-versions -DallowSnapshots=true -DexcludeReactor=false` to update all dependencies to the newest versions

5. execute `mvn install` to locally install the iota.lib.java repository

## 4. RUN THE JAR FILE

Simply start the .jar with your JRE:

	$ java -jar target/jota-example-[VERSION].jar