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
import org.openqa.selenium.Keys as Keys

int isLogin = 1

String category = 'Fixed Income'

String action = 'Product Detail'

String pageSelection = 'Detail'

int isBuy = 9999

int gunakanKodePromo = 9999

String actionBeliReksadana = null

String metodePambayaran = null

String eWallet = null

WebUI.callTestCase(findTestCase('Mobile/Page/Run App/Run App'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mobile/Page/Login/Login'), [
	('isLogin') : isLogin])

WebUI.callTestCase(findTestCase('Mobile/Page/Product/Product'), [
		('isLogin') : isLogin,
		('category') : category,
		('action') : action,
		('pageSelection') : pageSelection,
		('isBuy') : isBuy,
		('gunakanKodePromo') : gunakanKodePromo,
		('actionBeliReksadana') : actionBeliReksadana,
		('metodePambayaran') : metodePambayaran,
		('eWallet') : eWallet])