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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_29.99'), '$29.99')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'Name')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'user')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '12345')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/form_Cancel'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_29.99'), '$29.99')

WebUI.rightClick(findTestObject('Object Repository/Page_Swag Labs/div_Item total 29.99'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_Item total 29.99'), 'Item total: $29.99')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_Tax 2.40'), 'Tax: $2.40')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Total 32.39'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_Total 32.39'), 'Total: $32.39')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Back Home'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_Logout'))

WebUI.closeBrowser()

