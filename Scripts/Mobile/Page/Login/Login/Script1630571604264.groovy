import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import org.openqa.selenium.Keys as Keys

//def location = RunConfiguration.getProjectDir() + GlobalVariable.locationAPK
//
////Open App
//Mobile.startApplication(location, true)

if (isLogin == 1) {
	//Klik Login
	Mobile.tap(findTestObject('Mobile/Page/Dashboard/Button - Login'), 0)
} else if (isLogin == 0) {
	
}

//Login
Mobile.tap(findTestObject('Mobile/Page/Login/Tap - UserID or Email'), 0)
Mobile.delay(1)
Mobile.setText(findTestObject('Mobile/Page/Login/Input - UserID or Email'), 'testingqa1@getnada.com', 0)
Mobile.delay(1)
Mobile.hideKeyboard()
Mobile.delay(GlobalVariable.delayShort)

Mobile.tap(findTestObject('Mobile/Page/Login/Tap - Password'), 0)
Mobile.delay(1)
Mobile.setText(findTestObject('Mobile/Page/Login/Input - Password'), 'Mirae1234', 0)
Mobile.delay(1)
Mobile.hideKeyboard()
Mobile.delay(GlobalVariable.delayShort)

Mobile.tap(findTestObject('Mobile/Page/Login/Button - Sign In'), 0)