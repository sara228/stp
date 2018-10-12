# Linux Setup Instructions

## How To Install Java and Maven

1. Install the Java 8 Development Kit (JDK) for your operating system [link](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). For
    detailed instructions on compiling from source, go [here](https://www.java.com/en/download/help/linux_install.xml#install)
2. Install Maven using your Linux distribution’s package manager. For Ubuntu read [this](http://www.mkyong.com/maven/how-to-install-maven-in-ubuntu/) .
3. Open a new command-prompt and run **mvn -version** to confirm that it’s working. If it
    is, it will list the application and its version information. If it’s not working, it will display
    an error that should help you debug what’s wrong
4. Download and unzip an initial Maven project directory structure (with pre-loaded
    dependency file) from [here](https://github.com/selenium-guidebook/init-java/archive/master.zip)


## How To Setup Eclipse 

1. Download and install [Eclipse IDE for Java Developers](http://www.eclipse.org/downloads/packages/)
2. Launch Eclipse and select a workspace (click **OK** to accept the defaults provided)
3. Start the project import wizard by clicking **File** and **Open Projects from File System...**
4. Select the Maven project directory downloaded earlier (from the final Maven
    installation step) by clicking **Directory** , selecting the **init-java-master** directory,
    clicking **Open** , and then **Finish**.
5. Open the **Package Explorer** by clicking **Window** , **Show View** , **Package Explorer**

## Eclipse Troubleshooting

If you see a warning about the build path (e.g., Build path specifies execution
environment J2SE-1.5. There are no JREs installed in the workspace that are
strictly compatible with this environment. ) try the following:

1. Right-click on the project name
2. Click **Properties**
3. Click the **Java Compiler** in the left-hand pane
4. Under the **JDK Compliance** section in the right-hand pane, click on **Compiler compliance**
    **level** and select **1.**
5. Click **Apply and Close**
6. Click **Yes** when prompted to rebuild the project

## How To Install the Browser Driver for Firefox

1. Visit [the browser driver download page](https://github.com/mozilla/geckodriver/releases/tag/v0.23.0) for Mozilla’s **geckodriver**
2. Download the latest available version of the browser driver for your operating system
3. Unzip the file (if zipped) and place the file in a known folder on your system
4. Optional: Add this known folder to your system path



## How To Install the Browser Driver for Chrome

1. Visit [the browser driver download page](http://chromedriver.chromium.org/downloads) for chromedriver.
2. Download the latest available version of the browser driver for your operating system
3. Unzip the file (if zipped) and place the file in a known folder on your system
4. Optional: Add this known folder to your system path

