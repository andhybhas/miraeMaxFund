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

Mobile.delay(5)
Mobile.tap(findTestObject('Mobile/Page/Home/Button - Profile'), 0)
Mobile.delay(5)

if (menuProfile == 'Data Diri Investor') {
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Button - Data Diri Investor'), 0)
	Mobile.delay(5)
	Mobile.swipe(550, 930, 550, 780, FailureHandling.STOP_ON_FAILURE)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Button - Edit'), 0)
	Mobile.delay(5)
	
	////Jenis Identitas
	//Mobile.delay(2)
	//Mobile.tapAndHold(findTestObject('Mobile/Page/Profile/Data Diri Investor/Dropdown - Jenis Identitas'), 1, 0)
	//Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Dropdown - Jenis Identitas'), 0)
	//if (jenisIdentitas == 'KTP') {
	//    Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Select - Jenis Identitas KTP'), 0)
	//} else if (jenisIdentitas == '') {
	//	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Select - Jenis Identitas Passport'), 0)
	//}
	
	//Nomor Identitas
	Mobile.delay(2)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Input - Nomor Identitas'), 0)
	Mobile.clearText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Input - Nomor Identitas'), 0)
	Mobile.delay(2)
	Mobile.setText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Input - Nomor Identitas'), nomorIdentitas, 0)
	Mobile.hideKeyboard()
	
	//Tanggal Kadaluarsa
	
	////Nama Lengkap
	//Mobile.delay(2)
	//Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Tap - Nama Lengkap'), 0)
	//Mobile.clearText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Tap - Nama Lengkap'), 0)
	//Mobile.setText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Input - Nama Lengkap'), namaLengkap, 0)
	//Mobile.hideKeyboard()
	
	//TanggalLahir
	
	//Tempat Lahir
	Mobile.delay(2)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Tap - Tempat Lahir'), 0)
	Mobile.clearText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Tap - Tempat Lahir (1)'), 0)
	Mobile.setText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Input - Tempat Lahir'), tempatLahir, 0)
	Mobile.hideKeyboard()
	
	//Negara Lahir
	Mobile.delay(2)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Tap - Negara Lahir'), 0)
	Mobile.clearText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Tap - Negara Lahir'), 0)
	Mobile.setText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Input - Negara Lahir'), negaraLahir, 0)
	Mobile.hideKeyboard()
	
	//Jenis Kelamin
	Mobile.delay(2)
	Mobile.tapAndHold(findTestObject('Mobile/Page/Profile/Data Diri Investor/Dropdown - Jenis Kelamin'), 2, 0)
	//Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Dropdown - Jenis Kelamin'), 0)
	if (jenisKelamin == 'Male') {
		Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Select - Jenis Kelamin Male'), 0) //Male
	} else if (jenisKelamin == 'Female') {
		Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Select -Jenis Kelamin Female'), 0) //Female
	}
	Mobile.hideKeyboard()
	
	//Agama
	Mobile.delay(2)
	//Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Dropdown - Agama'), 0)
	Mobile.tapAndHold(findTestObject('Mobile/Page/Profile/Data Diri Investor/Dropdown - Agama'), 0, 0)
	if (agama == 'Islam') {
		Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Select - Agama Islam'), 0) //Islam
	} else if (agama == 'Protestant') {
		Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Select - Agama Protestant'), 0) //Protestant
	}
	Mobile.hideKeyboard()
	
	//Alamat Surat
	Mobile.delay(2)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Tap - Alamat Surat Menyurat'), 0)
	Mobile.clearText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Tap - Alamat Surat Menyurat (1)'), 0)
	Mobile.setText(findTestObject('Mobile/Page/Profile/Data Diri Investor/Input - Alamat Surat Menyurat (1)'), alamatSuratMenyurat, 0)
	Mobile.hideKeyboard()
	
	//Button OK
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Button - Simpan'), 0)
	Mobile.tap(findTestObject('Object Repository/Test/android.widget.Button (6)'), 0)
} else if (menuProfile == 'Data Pekerjaan dan Keuangan') {
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Button - Data Pekerjaan dan Keuangan'), 0)
	Mobile.delay(2)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Button - Edit'), 0)
	
	//Pekerjaan
	Mobile.delay(2)
	Mobile.tapAndHold(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Dropdown - Pekerjaan'), 0, 0)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Select - Pekerjaan Student'), 0)
	
	//Penghasilan / Tahun
	Mobile.delay(2)
	Mobile.tapAndHold(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Dropdown - Penghasilan per Tahun'), 0, 0)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Select - Penghasilan 10 Juta'), 0)
	
	//Sumber Penghasilan
	Mobile.delay(2)
	Mobile.tapAndHold(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Dropdown - Sumber Penghasilan'), 0, 0)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Select - Sumber Penghasilan Revenue'), 0)
	
	//Button Simpan
	Mobile.delay(2)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Button - Simpan'), 0)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Pekerjaan dan Keuangan/Button - Mengerti'), 0)
} else if (menuProfile == 'Account Contact') {
	Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Button - Account Contact'), 0)
	
	if (accountContact == 'Nomor Ponsel') {
		//Edit Nomor Ponsel
		Mobile.delay(2)
		Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Button - Edit Nomor Ponsel'), 0)
		
		//Kode Negara
		
		//Nomor Ponsel Baru
		Mobile.delay(2)
		Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Nomor Ponsel/Tap - Nomor Ponsel Baru'), 0)
		Mobile.setText(findTestObject('Mobile/Page/Profile/Account Contact/Nomor Ponsel/Input - Nomor Ponsel Baru'), nomorPonselBaru, 0)
		Mobile.hideKeyboard()
		
		//Save Nomor Ponsel Baru
		Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Nomor Ponsel/Button - Save Nomor Ponsel'), 0)
		
		//OTP
		
		//Save
		
		//Mengerti
	} else if (accountContact == 'Email') {
		//Edit Email
		Mobile.delay(2)
		Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Button - Edit Email'), 0)
		
		//Email Baru
		Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Email Baru/Tap - Email Baru'), 0)
		Mobile.setText(findTestObject('Mobile/Page/Profile/Account Contact/Email Baru/Input - Email Baru'), emailBaru, 0)
		
		//Save Email
		Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Email Baru/Button - Save'), 0)
		
//		//OTP
//		Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Email Baru/OTP/Tap - OTP'), 0)
//		Mobile.setText(findTestObject('Mobile/Page/Profile/Account Contact/Email Baru/OTP/Input - OTP'), '256313', 0)
//		Mobile.hideKeyboard()
//		
//		//Save
//		Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Email Baru/OTP/Button - Save'), 0)
//		
//		//Mengerti
//		Mobile.tap(findTestObject('Mobile/Page/Profile/Account Contact/Email Baru/OTP/Button - Mengerti'), 0)
	}
	
} else if (menuProfile == 'Akun Bank') {
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Button - Data Diri Investor'), 0)
	Mobile.delay(2)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Button - Data Diri Investor'), 0)
	Mobile.delay(2)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Akun Bank/Button - Akun Bank'), 0)
	
	//Edit Akun Bank
	Mobile.tap(findTestObject('Mobile/Page/Profile/Akun Bank/Button - Edit Akun Bank'), 0)
	
	//Bank
	if (bank == 'BTPN') {
		Mobile.tap(findTestObject('Mobile/Page/Profile/Akun Bank/Button - Bank BTPN'), 0)
	} else if (bank == 'BCA') {
		Mobile.tap(findTestObject('Mobile/Page/Profile/Akun Bank/Button - Bank BCA'), 0)
	}
	
	//Save
	Mobile.tap(findTestObject('Mobile/Page/Profile/Akun Bank/Button - Save'), 0)
	
	//Mengerti
	Mobile.tap(findTestObject('Mobile/Page/Profile/Akun Bank/Button - Mengerti'), 0)
} else if (menuProfile == 'Profil Resiko Anda') {
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Button - Data Diri Investor'), 0)
	Mobile.delay(2)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Data Diri Investor/Button - Data Diri Investor'), 0)
	Mobile.delay(2)
	//Edit
	Mobile.tap(findTestObject('Mobile/Page/Profile/Profile Resiko Anda/Button - Edit'), 0)
	Mobile.delay(2)
	
	if (pilihResiko == 'Rendah') {
		Mobile.tapAndHold(findTestObject('Mobile/Page/Profile/Profile Resiko Anda/RadioButton - Resiko Rendah'), 1, 0)
	} else if (pilihResiko == 'Menengah') {
		Mobile.tapAndHold(findTestObject('Mobile/Page/Profile/Profile Resiko Anda/RadioButton - Resiko Menengah'), 1, 0)
	} else if (pilihResiko == 'Tinggi') {
		Mobile.tapAndHold(findTestObject('Mobile/Page/Profile/Profile Resiko Anda/RadioButton - Resiko Tinggi'), 1, 0)
	}
	
	//Simpan
	Mobile.tap(findTestObject('Mobile/Page/Profile/Profile Resiko Anda/Button - Save'), 0)
	Mobile.tap(findTestObject('Mobile/Page/Profile/Profile Resiko Anda/Button - Mengerti'), 0)
}
