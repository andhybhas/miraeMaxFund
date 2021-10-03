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

if (isLogin == 0) {
    'Klik Product pada Menubar'
    Mobile.tap(findTestObject('Mobile/Page/Home/Button - Product'), 0)

    //Products
    'Klik Top Mutual Funds'
    Mobile.tap(findTestObject('Mobile/Page/Products/Button - Mutual Funds'), 0)

    'Klik Buy pada Bahana Revolving Fund'
    Mobile.tap(findTestObject('Mobile/Page/Products/Button - Buy Bahana Revolving Fund'), 0)

    WebUI.callTestCase(findTestCase('Mobile/Page/Login/Login'), [('isLogin') : isLogin])
} else if (isLogin == 1) {
    Mobile.delay(GlobalVariable.delayShort)
}

'Klik Products di Menubar'
Mobile.tap(findTestObject('Mobile/Page/Home/Button - Product'), 0)

Mobile.delay(GlobalVariable.delayMedium)

if (category == 'Money Market') {
    'Klik Top Mutual Funds'
    Mobile.tap(findTestObject('Mobile/Page/Products/Button - Mutual Funds'), 0)

    if (action == 'Product Detail') {
        'Klick - Bahana Revolving Fund'
        Mobile.tap(findTestObject('Mobile/Page/Products/Button - Bahana Revolving Fund'), 0)
    } else if (action == 'Buy') {
        'Klik Buy pada Bahana Revolving Fund'
        Mobile.tap(findTestObject('Mobile/Page/Products/Button - Buy Bahana Revolving Fund'), 0)
    }
    //=====BELI REKSADANA=====//
    //'Klik Buy pada Bahana Revolving Fund'
    //Mobile.tap(findTestObject('Mobile/Page/Products/Button - Buy Bahana Revolving Fund'), 0)
    //Beli Reksadana
    //Kode Promo
    //Metode Pembayaran
    //	'Klik Buy pada Bahana Revolving Fund'
    //	Mobile.tap(findTestObject('Mobile/Page/Products/Button - Buy Bahana Revolving Fund'), 0)
    //Beli Reksadana
    //Kode Promo
    //Metode Pembayaran
} else if (category == 'Fixed Income') {
    'Dropdown - Money Market'
    Mobile.tap(findTestObject('Mobile/Page/Products/Dropdown - Money Market'), 0)

    Mobile.delay(GlobalVariable.delayShort)

    'Dropdown - Fixed Income'
    Mobile.tapAndHold(findTestObject('Mobile/Page/Products/Dropdown - Fixed Income'), 0, 0)

    if (action == 'Product Detail') {
        'Button - CIMB Principal Bond'
        Mobile.tap(findTestObject('Mobile/Page/Products/Button - CIMB Principal Bond'), 0)
    } else if (action == 'Buy') {
        'Button - Buy CIMB Principal Bond'
        Mobile.tap(findTestObject('Mobile/Page/Products/Button - Buy CIMB Principal Bond'), 0)
    }
} else if (category == 'Balance') {
    'Dropdown - Money Market'
    Mobile.tap(findTestObject('Mobile/Page/Products/Dropdown - Money Market'), 0)

    Mobile.delay(GlobalVariable.delayShort)

    'Dropdown - Balance'
    Mobile.tapAndHold(findTestObject('Mobile/Page/Products/Dropdown - Balance'), 0, 0)

    if (action == 'Product Detail') {
        'Button - Product Detail Syaelendra Balanced Opportunity Fund'
        Mobile.tap(findTestObject('Mobile/Page/Products/Button - Product Detail Syaelendra Balanced Opportunity Fund'), 
            0)
    } else if (action == 'Buy') {
        'Button - Buy Syaelendra Balanced Opportunity Fund'
        Mobile.tap(findTestObject('Mobile/Page/Products/Button - Buy Syaelendra Balanced Opportunity Fund'), 0)
    }
} else if (category == 'Stock') {
    'Dropdown - Money Market'
    Mobile.tap(findTestObject('Mobile/Page/Products/Dropdown - Money Market'), 0)

    Mobile.delay(GlobalVariable.delayShort)

    'Dropdown - Stock'
    Mobile.tapAndHold(findTestObject('Mobile/Page/Products/Dropdown - Stock'), 0, 0)

    if (action == 'Product Detail') {
        'Button - Product Detail Shinhan Equity Growth'
        Mobile.tapAndHold(findTestObject('Mobile/Page/Products/Button - Product Detail Shinhan Equity Growth'), 0, 0)
    } else if (action == 'Buy') {
        'Button - Buy Shinhan Equity Growth'
        Mobile.tapAndHold(findTestObject('Mobile/Page/Products/Button - Buy Shinhan Equity Growth'), 0, 0)
    }
    
    if (action == 'Product Detail') {
        if (pageSelection == 'Performance') {
            'Tab Performance'
            Mobile.tap(findTestObject('Mobile/Page/Products/Button - Tab Performance'), 0)

            '1 Bulan'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Button - Performance 1 Month'), 0)

            '3 Bulan'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Button - Performance 3 Month'), 0)

            '6 Bulan'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Button - Performance 6 Month'), 0)

            '1 Year'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Button - Performance 1 Year'), 0)

            '3 Year'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Button - Performance 3 Year'), 0)

            '5 Year'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Button - Performance 5 Year'), 0)

            '10 Year'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Button - Performance 10 Year'), 0)

            Mobile.swipe(100, 1026, 100, 826, FailureHandling.STOP_ON_FAILURE)

            Mobile.delay(GlobalVariable.delayShort)

            if (isBuy == 1) {
                'Klik Buy'
                Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Button - Buy'), 0)

                Mobile.delay(GlobalVariable.delayShort)

                'Klik Jumlah Pembelian'
                Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Tap - Jumlah Pembelian'), 0)

                'Input 100.000'
                Mobile.setText(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Input - Jumlah Pembelian'), 
                    '100000', 0)

                Mobile.hideKeyboard()

                'Tap 500.000'
                Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Jumlah Pembelian 500 ribu'), 
                    0)

                'Tap 1.000.000'
                Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Jumlah Pembelian 1 juta'), 
                    0)

                'Tap 1.500.000'
                Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Jumlah Pembelian 1,5 juta'), 
                    0)

                'Tap 2.000.000'
                Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Jumlah Pembelian 2 juta'), 
                    0)

                if (gunakanKodePromo == 1) {
                    'Button - Pakai Promo/Kode Promo'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Pakai Promo or Kode Promo'), 
                        0)

                    'Button - Gunakan Kode Promo'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Kode Promo/Button - Gunakan Promo'), 
                        0)

                    'Button - Kembali'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Kode Promo/Button - Kembali'), 
                        0)

                    Mobile.hideKeyboard()
                } else {
                    Mobile.delay(GlobalVariable.delayShort)
                }
                
                'Klik Checkbox Agreement'
                Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Checkbox - Agreement'), 0)

                Mobile.swipe(77, 961, 77, 608, FailureHandling.STOP_ON_FAILURE)

                'Klik Ketentuan Penting'
                Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Ketentuan Penting'), 
                    0)

                if (actionBeliReksadana == 'Bayar') {
                    'Klik Bayar'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Bayar'), 0)

                    if (metodePambayaran == 'Rekening Data Nasabah') {
                        'Klik Radio Button BCA'
                        Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - Rekening Data Nasabah'), 
                            0)

                        Mobile.swipe(77, 939, 77, 439, FailureHandling.STOP_ON_FAILURE)
                    } else if (metodePambayaran == 'e-Wallet') {
                        if (eWallet == 'Gopay') {
                            'eWallet Gopay'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - Gopay'), 
                                0)

                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                        } else if (eWallet == 'OVO') {
                            'eWallet OVO'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - OVO'), 
                                0)

                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                        } else if (eWallet == 'Link Aja') {
                            'eWallet Link Aja'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - Link Aja'), 
                                0)

                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                        }
                    } else if (metodePambayaran == 'Bank Virtual Account') {
                        if (bankVirtualAccount == 'BCA') {
                            'VA BCA'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA BCA'), 
                                0)

                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                        } else if (bankVirtualAccount == 'BNI') {
                            'VA BNI'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA BNI'), 
                                0)

                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                        } else if (bankVirtualAccount == 'BNI Syariah') {
                            Mobile.swipe(77, 939, 77, 3839, FailureHandling.STOP_ON_FAILURE)

                            'VA BNI Syariah'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - BNI Syariah'), 
                                0)
                        } else if (bankVirtualAccount == 'Bank Mandiri') {
                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                            'VA Mandiri'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Mandiri'), 
                                0)
                        } else if (bankVirtualAccount == 'Bank Permata') {
                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                            'VA Permata'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank Permata'), 
                                0)
                        } else if (bankVirtualAccount == 'Bank Sahabat Sampoerna') {
                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                            'VA Sahabat Sampoerna'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank Sahabat Sampoerna'), 
                                0)
                        } else if (bankVirtualAccount == 'BRI') {
                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                            'VA BRI'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank BRI'), 
                                0)
                        } else if (bankVirtualAccount == 'Bank CIMB Niaga') {
                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                            'VA CIMB Niaga'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank CIMB Niaga'), 
                                0)
                        } else if (bankVirtualAccount == 'Bank Syariah Indonesia') {
                            Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                            'VA Bank Syariah Indonesia'
                            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank Syariah Indonesia'), 
                                0)
                        }
                    }
                    
                    'Klik Bayar'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Button - Bayar'), 0)
                } else if (actionBeliReksadana == 'Tambah Keranjang') {
                    'Button - Tambah ke Keranjang'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Tambah ke Keranjang'), 
                        0)
                }
            } else {
            }
        } else if (pageSelection == 'Detail') {
            'Tab Detail'
            Mobile.tap(findTestObject('Mobile/Page/Products/Button - Tab Detail'), 0)

            Mobile.delay(GlobalVariable.delayShort)

            Mobile.swipe(320, 800, 320, 180, FailureHandling.STOP_ON_FAILURE)

            'Button - View Prospectus'
            Mobile.tap(findTestObject('Mobile/Page/Products/Details/Button - View Prospectus'), 0)

            'Button - Mutual Fund Fact Sheet'
            Mobile.tap(findTestObject('Mobile/Page/Products/Details/Button - Mutual Fund Fact Sheet'), 0)
        }
    } else if (action == 'Buy') {
        'Klik Jumlah Pembelian'
        Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Tap - Jumlah Pembelian'), 0)

        'Input 100.000'
        Mobile.setText(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Input - Jumlah Pembelian'), '100000', 
            0)

        Mobile.hideKeyboard()

        'Tap 500.000'
        Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Jumlah Pembelian 500 ribu'), 
            0)

        'Tap 1.000.000'
        Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Jumlah Pembelian 1 juta'), 0)

        'Tap 1.500.000'
        Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Jumlah Pembelian 1,5 juta'), 
            0)

        'Tap 2.000.000'
        Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Jumlah Pembelian 2 juta'), 0)

        if (gunakanKodePromo == 1) {
            'Button - Pakai Promo/Kode Promo'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Pakai Promo or Kode Promo'), 
                0)

            'Button - Gunakan Kode Promo'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Kode Promo/Button - Gunakan Promo'), 
                0)

            'Button - Kembali'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Kode Promo/Button - Kembali'), 0)

            Mobile.hideKeyboard()
        }
        
        'Klik Checkbox Agreement'
        Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Checkbox - Agreement'), 0)

        Mobile.swipe(77, 961, 77, 608, FailureHandling.STOP_ON_FAILURE)

        'Klik Ketentuan Penting'
        Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Ketentuan Penting'), 0)

        if (actionBeliReksadana == 'Bayar') {
            'Klik Bayar'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Bayar'), 0)

            if (metodePambayaran == 'Rekening Data Nasabah') {
                'Klik Radio Button BCA'
                Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - Rekening Data Nasabah'), 
                    0)

                Mobile.swipe(77, 939, 77, 439, FailureHandling.STOP_ON_FAILURE)
            } else if (metodePambayaran == 'e-Wallet') {
                if (eWallet == 'Gopay') {
                    'eWallet Gopay'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - Gopay'), 
                        0)

                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                } else if (eWallet == 'OVO') {
                    'eWallet OVO'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - OVO'), 0)

                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                } else if (eWallet == 'Link Aja') {
                    'eWallet Link Aja'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - Link Aja'), 
                        0)

                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                }
            } else if (metodePambayaran == 'Bank Virtual Account') {
                if (bankVirtualAccount == 'BCA') {
                    'VA BCA'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA BCA'), 
                        0)

                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                } else if (bankVirtualAccount == 'BNI') {
                    'VA BNI'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA BNI'), 
                        0)

                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)
                } else if (bankVirtualAccount == 'BNI Syariah') {
                    Mobile.swipe(77, 939, 77, 3839, FailureHandling.STOP_ON_FAILURE)

                    'VA BNI Syariah'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - BNI Syariah'), 
                        0)
                } else if (bankVirtualAccount == 'Bank Mandiri') {
                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                    'VA Mandiri'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Mandiri'), 
                        0)
                } else if (bankVirtualAccount == 'Bank Permata') {
                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                    'VA Permata'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank Permata'), 
                        0)
                } else if (bankVirtualAccount == 'Bank Sahabat Sampoerna') {
                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                    'VA Sahabat Sampoerna'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank Sahabat Sampoerna'), 
                        0)
                } else if (bankVirtualAccount == 'BRI') {
                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                    'VA BRI'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank BRI'), 
                        0)
                } else if (bankVirtualAccount == 'Bank CIMB Niaga') {
                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                    'VA CIMB Niaga'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank CIMB Niaga'), 
                        0)
                } else if (bankVirtualAccount == 'Bank Syariah Indonesia') {
                    Mobile.swipe(77, 939, 77, 339, FailureHandling.STOP_ON_FAILURE)

                    'VA Bank Syariah Indonesia'
                    Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Radiobutton - VA Bank Syariah Indonesia'), 
                        0)
                }
            }
            
            'Klik Bayar'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Metode Pembayaran/Button - Bayar'), 0)
        } else if (actionBeliReksadana == 'Tambah Keranjang') {
            'Button - Tambah ke Keranjang'
            Mobile.tap(findTestObject('Mobile/Page/Products/Performance/Beli Reksadana/Button - Tambah ke Keranjang'), 0)
        }
    }
}

