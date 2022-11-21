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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.verifyElementPresent(findTestObject('Contact/a_Contact'), 0)

WebUI.click(findTestObject('Object Repository/Contact/a_Contact'))

WebUI.verifyElementPresent(findTestObject('Contact/input_Contact Email_recipient-email'), 0)

WebUI.verifyElementPresent(findTestObject('Contact/input_Contact Name_recipient-name'), 0)

WebUI.verifyElementPresent(findTestObject('Contact/textarea_Message_message-text'), 0)

WebUI.verifyElementPresent(findTestObject('Contact/button_Send message'), 0)

WebUI.setText(findTestObject('Object Repository/Contact/input_Contact Email_recipient-email'), 'abc@mail.com')

WebUI.setText(findTestObject('Object Repository/Contact/input_Contact Name_recipient-name'), 'abc')

WebUI.setText(findTestObject('Object Repository/Contact/textarea_Message_message-text'), 'abc')

WebUI.click(findTestObject('Object Repository/Contact/button_Send message'))

WebUI.closeBrowser()

