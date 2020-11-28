set projectLocation=C:\Users\hp\Desktop\Mounika\JAVA\Org.hrms
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause