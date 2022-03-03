# CSCI2020U-Assigment-1

## Install
Simply clone the repo from Github, using git.

```shell
git clone https://github.com/Seg-fau1t/CSCI2020U-Assigment-1.git
```

## Running/Viewing the code
After installation change into the project directory, and run gradle to view its
output,

```shell
gradle run
```

If you want to look at the source code in depth head into the following 
directory.

```shell
cd app/src/main/java/facade/
```

## Overview of the project
This is an example of the facade build pattern it takes the form of a wallet.
The App.java file is the driver code that shows off what user interaction with
the facade is like for the user. The wallet.java file contains the facade,
it manages the debit card, credit card, and cash classes for the user.
The credit.java, debit.java, and cash.java contains some of the basic 
functionality they have in real life. The template.java file contains the
interface that they are all implementing.

