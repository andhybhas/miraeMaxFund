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

int loginFirst = 1

String menuProfile = 'Data Diri Investor'

String jenisIdentitas = 'KTP'

String nomorIdentitas = '3201290108950002'

String namaLengkap = 'Automation QA'

String tanggalLahir = ''

String tempatLahir = 'Banjarbaru'

String negaraLahir = 'Kalimantan'

String jenisKelamin = 'Male'

String agama = 'Islam'

String alamatSuratMenyurat = 'Komplek Ciomas Permai C2'

WebUI.callTestCase(findTestCase('Mobile/Page/Run App/Run App'), [:])

WebUI.callTestCase(findTestCase('Mobile/Page/Login/Login'), [
	('loginFirst') : loginFirst])

WebUI.callTestCase(findTestCase('Mobile/Page/Profile/Profile'), [
	('menuProfile') : menuProfile,
	('jenisIdentitas') : jenisIdentitas,
	('nomorIdentitas') : nomorIdentitas,
	('namaLengkap') : namaLengkap,
	('tanggalLahir') : tanggalLahir,
	('tempatLahir') : tempatLahir,
	('negaraLahir') : negaraLahir,
	('jenisKelamin') : jenisKelamin,
	('agama') : agama,
	('alamatSuratMenyurat') : alamatSuratMenyurat])

