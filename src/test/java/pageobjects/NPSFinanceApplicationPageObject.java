package pageobjects;

import com.github.javafaker.Faker;
import helpers.PopupWindow;
import helpers.WritePropertiesFile;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

//import com.sharepoint.qa.base.TestBase;

public class NPSFinanceApplicationPageObject extends BaseClass {

	private Faker faker = new Faker();

	@FindBy(xpath = "//a[@href='/sites/NPSFinance/SitePages/Vendor-Data.aspx']")
	public WebElement vendorMasterDataMenuName;

	@FindBy(xpath = "//a[@href='/sites/NPSFinance/SitePages/AP-BACS-Payment.aspx']")
	public WebElement APBascPayment;

	@FindBy(xpath = "//a[@href='/sites/NPSFinance/SitePages/AR-InterCompany.aspx']")
	public WebElement ARInterCompany;

	@FindBy(xpath = "//a[@href='/sites/NPSFinance/SitePages/AR-Journal.aspx']")
	public WebElement ARJournal;

	@FindBy(xpath = "//a[@href='/sites/NPSFinance/SitePages/Contra-Process.aspx']")
	public WebElement ARContraProcess;

	@FindBy(xpath = "//a[@href='/sites/NPSFinance/SitePages/Group-Treasury-Transfers.aspx']")
	public WebElement GrpTreasuryTransfer;

	@FindBy(xpath = "//a[@href='/sites/NPSFinance/SitePages/AP-Vendor.aspx']")
	public WebElement APVendor;

	@FindBy(xpath = "//a[@href='/sites/NPSFinance/SitePages/AP-Vendor.aspx']")
	public WebElement ARRefund;

	@FindBy(xpath = "//a[@href='/sites/NPSFinance/SitePages/BU-Employee-and-Payroll.aspx']")
	public WebElement RFPBUEmployee;

	@FindBy(xpath = "//img[@alt='Vendor Data Master']")
	public WebElement VendorMasterDataOption;

	@FindBy(xpath = "//img[@alt='AR Journal']")
	public WebElement ARJournalOption;

	@FindBy(xpath = "//img[@alt='Group Treasury Transfers']")
	public WebElement GrpTransfersOption;

	@FindBy(xpath = "//img[@alt='Contra Process']")
	public WebElement ContraProcessOption;

	@FindBy(xpath = "//img[@alt='ICOControlAR']")
	public WebElement ARInterCompanyOption;

	@FindBy(xpath = "//img[@alt='RFP AP Vendor']")
	public WebElement APVendorOption;

	@FindBy(xpath = "//img[@alt='AR Refund ']")
	public WebElement ARRefundOption;

	@FindBy(xpath = "//img[@alt='RFP BU Employee and Payroll']")
	public WebElement RFPBUEmpolyeeAOption;

	@FindBy(xpath = "//img[@alt='AP BACS Payments']")
	public WebElement APBacsPaymentOption;

	@FindBy(xpath = "//span[contains(@class,'CommandBarItem-commandText') and text()='Create']")
	public WebElement createbtnClick;

	@FindBy (xpath = "//iframe[contains(@src,'/sites/NPSFinance/_layouts/15/listform.aspx')]")
	WebElement raiseRequestFrame;

	@FindBy(xpath = "//input[@title='Vendor Name Required Field']")
	public static WebElement vendorName;
			//newly added  ref number field
	@FindBy(xpath = "//input[@title='Ref No Required Field']")
	public static WebElement refNumberFiled;

	@FindBy(xpath = "//input[@title='Vendor Number Required Field']")
	public static WebElement vendorNumber;

	@FindBy(xpath = "//input[@title='AP Administrator Required Field']")
	public static WebElement APAdministration;

	@FindBy(xpath = "//input[@title='Requestor Required Field']")
	public static WebElement RequestRequiredField;

	@FindBy(xpath = "//input[@title='Payee Name Required Field']")
	public static WebElement PayNameRequiredField;

	@FindBy(xpath = "//input[@title='Customer number Required Field']")
	public static WebElement ARInterComPanyCustomerNumber;

	@FindBy(xpath = "//input[@title='Line 1: Customer Name Required Field']")
	public static WebElement ARJournalCustomerName;

	@FindBy(xpath = "//input[@title='Line 1: Account Number Required Field']")
	public static WebElement ARJournalAccNumber;

	@FindBy(xpath = "//input[@title='Line 1: Amount Required Field']")
	public static WebElement ARJournalAmount;

	@FindBy(xpath = "//input[@title='Line 1: Reference Required Field']")
	public static WebElement ARJournalReferenceNumber;

	@FindBy(xpath = "//input[@title='Line 1: GL Code Required Field']")
	public static WebElement ARJournalGLCode;

	@FindBy(xpath = "//input[@title='Customer Name Required Field']")
	public static WebElement ARInterComPanyCustomerName;

	@FindBy(xpath = "//input[@title='Value Required Field']")
	public static WebElement ARInterComPanyValue;

	@FindBy(xpath = "//input[@title='Document Reference of Customer posting Required Field']")
	public static WebElement ARInterComPanyDocument;

	@FindBy(xpath = "//input[@title='Requester']")
	public static WebElement APRequester;

	@FindBy(xpath = "//input[@title='Vendor Name Required Field']")
	public static WebElement APVendorName;

	@FindBy(xpath = "//input[@title='Vendor Category Required Field']")
	public static WebElement VendorCatyRequired;

	@FindBy(xpath = "//input[@title='Vendor Type/Batch Type Required Field']")
	public static WebElement VendorTypeRequired;

	@FindBy(xpath = "//input[@title='Amount Required Field']")
	public static WebElement AmountRequiredFld;

	@FindBy(xpath = "//span[@class='ms-RadioText' and @title='Telephone -- {Vendor email request}']//input")
	 WebElement telephoneNumberCheckBox;

	@FindBy(xpath = "(//input[@value='Save'])[2]")
	public WebElement SaveBtn;

	@FindBy(xpath = "//span[@class='CommandBarItem-icon']/i[contains(@class,'od-IconGlyph ms-Icon ms-Icon--Filter')]")
	public WebElement filterIcon;



	@FindBy(xpath = "//input[@title='Reason for request Required Field']")
	public static WebElement reasonForRequest;

	@FindBy(xpath = "//input[@title='Requester Required Field']")
	public static WebElement RequesterReqField;

	@FindBy(xpath = "//input[@title='Customer Name Required Field']")
	public static WebElement ARRefundCustomerName;

	@FindBy(xpath = "//input[@title='Amount Required Field']")
	public static WebElement ARRefundAmountRequiredFld;

	@FindBy(xpath = "//input[@title='Amount in Word Required Field']")
	public static WebElement ARRefundAmountInWords;

	@FindBy(xpath = "//input[@title='Sort Code/IBAN Required Field']")
	public static WebElement ARRefundSortCode;

	@FindBy(xpath = "//input[@title='Account Number to be credited Required Field']")
	public static WebElement ARRefundAccNo;








	@FindBy(xpath = "//img[@alt='Raise Invoice']")
	public WebElement raiseRequestLink;


	@FindBy(xpath = "//img[@alt='Backlog And Unblock Archival Log']")
	public WebElement backlogAndUnblockArchivalLog;

	@FindBy(xpath = "//*[text()='Backlog And Unblock Archival Log']")
	public WebElement backlogAndUnblockArchivalLogHomePage;






	@FindBy(xpath = "//span[@class='ms-Dropdown-title is-placeholder' and @aria-expanded='false']")
	public static WebElement DropDownClick;



	@FindBy(xpath= "//span[text()='Raise Request' and @role]")
	public static WebElement RaiseRequestPage;

	@FindBy(xpath = "//span[text()='Create Invoice' and @role]")
	public WebElement createInvoice;

	@FindBy(xpath = "(//div[contains(@id,'Dropdown') and contains(@class,'ms-Dropdown')])[1]")
	public WebElement selectcustomerDrpDown;

	@FindBy(xpath = "(//div[contains(@id,'Dropdown') and contains(@class,'ms-Dropdown')])[2]")
	public WebElement selectCRMDropDowm;

	//ContraProcess

	@FindBy(xpath= "//input[@title='Request Date Required Field']")
	public static WebElement ContraProcessRequestDate;

	@FindBy(xpath= "//input[@title='Credit Controller Required Field']")
	public static WebElement creditControllerRequireField;

	@FindBy(xpath= "//select[@title='Region From Required Field']")
	public static WebElement regionFromRequiredField;

	@FindBy(xpath= "//select[@title='Region To Required Field']")
	public static WebElement regionToRequiredField;


	@FindBy(xpath= "//select[@title='Legal Entity To Required Field']")
	public static WebElement LegalEntityTOReqField;

	@FindBy(xpath= "//input[@title='Customer Number/s Required Field']")
	public static WebElement ContraProcesscustomerNumbers;

	@FindBy(xpath= "//input[@title='Customer Name/s Required Field']")
	public static WebElement ContraProcesscustomerName;

	@FindBy(xpath= "//input[@title='Vendor Number/s Required Field']")
	public static WebElement ContraProcessVendorNumbers;

	@FindBy(xpath= "//input[@title='Vendor Name/s Required Field']")
	public static WebElement ContraProcessVendorName;

	@FindBy(xpath= "//input[@title='Vendor Total Value Required Field']")
	public static WebElement ContraProcessVendorTotalValue;

	@FindBy(xpath= "//input[@title='Customer Total Value Required Field']")
	public static WebElement ContraProcessCustomerTotalValue;

	@FindBy(xpath= "//input[@title='Total Contra Value Required Field']")
	public static WebElement ContraProcessTotalContraValue;

	//Group Treasury Transfers

	@FindBy(xpath = "//input[@title='Payment Required by Required Field']")
	public static  WebElement PaymentRequiredBy;

	@FindBy(xpath = "//input[@title='Requestor E-mail Required Field']")
	public static  WebElement RequestEmailId;

	@FindBy(xpath= "//select[@title='Legal Entity From Required Field']")
	public static WebElement LegalEntityFromReqField;

	@FindBy(xpath = "//input[@title='GL/CC From Required Field']")
	public static  WebElement GLCCReqField;























	public void clickVendorMasterDataLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(vendorMasterDataMenuName));
		vendorMasterDataMenuName.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickAPBascPaymentLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(APBascPayment));
		APBascPayment.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickARInterCompanyLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ARInterCompany));
		ARInterCompany.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickARJournalLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ARJournal));
		ARJournal.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickARContraProcesslLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ARContraProcess));
		ARContraProcess.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickGrpTreasurylLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GrpTreasuryTransfer));
		GrpTreasuryTransfer.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickContraProessLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ARJournal));
		ARJournal.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}



	public void clickAPVendorLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(APVendor));
		APVendor.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickARRefundLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ARRefund));
		ARRefund.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void clickRFPBUEmployeeLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(RFPBUEmployee));
		RFPBUEmployee.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void filterOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(filterIcon));
		filterIcon.click();
		Thread.sleep(5000);

	}

	public void telephoneNumberCheckBox() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(telephoneNumberCheckBox));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", telephoneNumberCheckBox);
		Thread.sleep(10000);

	}

	public void ClickOnVendorMasterDataOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(VendorMasterDataOption));
		VendorMasterDataOption.isDisplayed();
		VendorMasterDataOption.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void ClickOnARJournalOptionDataOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ARJournalOption));
		ARJournalOption.isDisplayed();
		ARJournalOption.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void ClickOnGrpTreasuryTransfersOptionDataOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(GrpTransfersOption));
		GrpTransfersOption.isDisplayed();
		GrpTransfersOption.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void ClickOnContraProcessOptionDataOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ContraProcessOption));
		ContraProcessOption.isDisplayed();
		ContraProcessOption.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}




	public void ClickOnARInterCompanyOptionOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ARInterCompanyOption));
		ARInterCompanyOption.isDisplayed();
		ARInterCompanyOption.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void ClickOnAPVendorOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(APVendorOption));
		APVendorOption.isDisplayed();
		APVendorOption.click();
		Thread.sleep(10000);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void ClickOnARRefundOptionOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(ARRefundOption));
		ARRefundOption.isDisplayed();
		ARRefundOption.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void ClickOnRFPBUEmployeeOptionOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(RFPBUEmpolyeeAOption));
		RFPBUEmpolyeeAOption.isDisplayed();
		RFPBUEmpolyeeAOption.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void ClickOnAPBacsPaymentOption() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(APBacsPaymentOption));
		APBacsPaymentOption.isDisplayed();
		APBacsPaymentOption.click();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void setCreatebtnClick() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(createbtnClick));
		createbtnClick.isDisplayed();
		createbtnClick.click();
	}

	public Integer setVendorNumber() throws InterruptedException {
		Thread.sleep(20000);
		Integer a = ThreadLocalRandom.current().nextInt();
		return  a;
	}

	public void fillVendorNumber() throws InterruptedException, IOException {
		PropertiesPageObject obj = new PropertiesPageObject();
		vendorNumber.sendKeys("Vendor"+setVendorNumber());
		String getCrmID = vendorNumber.getAttribute("value").trim();
		obj.WriteDataIntoConfig("VendorNumber",getCrmID);
	}

	public void fillVendorCategory() throws InterruptedException, IOException {
		PropertiesPageObject obj = new PropertiesPageObject();
		VendorCatyRequired.sendKeys("VendorCat"+setVendorNumber());
		String VendorCat = VendorCatyRequired.getAttribute("value").trim();
		obj.WriteDataIntoConfig("VendorCategory",VendorCat);
	}

	public void fillDetails(WebElement webElement,String string,String writeData) throws InterruptedException, IOException {
		PropertiesPageObject obj = new PropertiesPageObject();
		webElement.sendKeys(string+setVendorNumber());
		String VendorCat = webElement.getAttribute("value").trim();
		obj.WriteDataIntoConfig(writeData,VendorCat);
	}
	public void fillAccountDetails(WebElement webElement,String writeData) throws InterruptedException, IOException {
		PropertiesPageObject obj = new PropertiesPageObject();
		//webElement.sendKeys(setVendorNumber());
		String VendorCat = webElement.getAttribute("value").trim();
		obj.WriteDataIntoConfig(writeData,VendorCat);
	}

	public void SaveBtnClick() throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", SaveBtn);
	}







	public void setInputVal(String inputVal,WebElement webElement) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(webElement));
		webElement.clear();
		webElement.sendKeys(inputVal);
		Thread.sleep(2000);
		webElement.sendKeys(Keys.ENTER);
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String formattedLocalDate = dtf.format(now);
		this.CustSignDate.sendKeys(formattedLocalDate);
		Thread.sleep(2000);
		return formattedLocalDate;*/

	}



	public void setArchivaltypDropDown(String ArchivalType) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//span[@class='od-ContextualMenu-linkText' and contains(text(),'"+ArchivalType+"')]"));
		ele.click();
	}

	public void setCustomerName(String cutomerName) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'Dropdown')]//following::span[contains(text(),'"+cutomerName+"')]"));
		ele.click();
	}

	public void setCRMID(String CRMNumber) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//div[contains(@id,'Dropdown')]//following::span[contains(text(),'"+CRMNumber+"')]"));
		ele.click();
	}

	public void fetchUnqRefNumbers() throws InterruptedException
	{
		String unqRefNumber= fetchUnqRefNumber.getText().trim();
		WritePropertiesFile writePropertiesFile = new WritePropertiesFile();
		writePropertiesFile.WritePropertiesFile("UnqRefNum",unqRefNumber,System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
	}

	public void fetchUnqRefNumbersAndActualCrm(String CRMNumber) throws InterruptedException
	{
		String unqRefNumber= CRMNumber;
		String actualCrm=ActualCrmNumber.getAttribute("value").trim();
		Assert.assertEquals("Verify Crm Numbers", unqRefNumber.equals(actualCrm), true);
	}
























































































































































































	@FindBy(xpath = "//select[@title='Customer Name (as per contract)' and contains(@id,'CustomeSoldTo')]")
	public WebElement customerName;

	@FindBy(xpath = "//*[@class='ms-long' and contains(@id,'SoldToAddress')]")
	public WebElement PoBillingAddress;

	@FindBy(xpath = "//select[@title='End User (Ship To)' and contains(@id,'EndUser')]")
	public WebElement Enduser;

	@FindBy(xpath = "//*[@class='ms-long' and contains(@id,'ShipToAddress')]")
	public WebElement ShipToAddress;

	@FindBy(xpath = "//select[@title='Customer /Payer' and contains(@id,'CustomerPayer')]")
	public WebElement CustomerPayer;

	@FindBy(xpath = "//*[@class='ms-long' and contains(@id,'PayerAddress')]")
	public WebElement PayAddress;

	@FindBy(xpath = "//*[@title='Sales Desk Indicator' and contains(@id,'SalesDeskSale')]")
	public WebElement SalesDeskIndicatorChkBox;

	@FindBy(xpath = "//select[@title='Is this a contract extension?' and contains(@id,'ContractExtension')]")
	public WebElement conractExtension;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'ParentOrChild')]")
	public WebElement prentExtraction;

	@FindBy(xpath = "//input[@title='Parent Contract Ref' and contains(@id,'ParentContractDetails')]")
	public WebElement parentContactRef;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'DoesthisorderSupersedeanyother')]")
	public WebElement supersedeAnyOther;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'TerminationCheck')]")
	public WebElement terminatedCheck;

	@FindBy(xpath = "//select[@title='Sales Person' and contains(@id,'SalesPerson')]")
	public WebElement SalesPersonDropDown;

	@FindBy(xpath = "//input[@title='Sales Person Number' and contains(@id,'SalesPerson_Number')]")
	public WebElement SalesPerson_Number;

	@FindBy(xpath = "//select[@title='Sales Account Manager' and contains(@id,'SalesAcctManager')]")
	public WebElement SalesAccManger;


	@FindBy(xpath = "//input[@title='Sales Account Manager SAP Refno' and contains(@id,'SAM_SAPRefNo')]")
	public WebElement SAMRefNo;


	@FindBy(xpath = "//select[@title='Sales Manager' and contains(@id,'SalesManager')]")
	public WebElement salesMangerDropDown;

	@FindBy(xpath = "//input[@title='SalesMgr SAP Refno' and contains(@id,'SalesMgr_SAPRefNo')]")
	public WebElement salesMangerRefNo;

	@FindBy(xpath = "//select[@title='Sales Director' and contains(@id,'SalesDirector')]")
	public WebElement salesDirector;

	@FindBy(xpath = "//input[@title='SalesDir SAP Refno' and contains(@id,'SalesDir_SAPRefNo')]")
	public WebElement salesDirectorRefNo;

	@FindBy(xpath = "//select[@title='Commission Person' and contains(@id,'CommissionPerson')]")
	public WebElement commonPerson;

	@FindBy(xpath = "//input[@title='Comission SAP Refno' and contains(@id,'Comission_SAPRefNo')]")
	public WebElement commonPersonRefNo;

	@FindBy(xpath = "//select[@title='Project Manager' and contains(@id,'ProjectManager')]")
	public WebElement ProjectManager;

	@FindBy(xpath = "//input[@title='Customer PO' and contains(@id,'CustomerPO')]")
	public WebElement cutomerPO;

	@FindBy(xpath = "//select[@title='Salutation Required Field' and contains(@id,'CustomerContractSalutation')]")
	public WebElement salutationDropDown;

	@FindBy(xpath = "//input[@title='First Name Required Field' and contains(@id,'CustomerContractFirstName')]")
	public WebElement CustomerContractFirstName;

	@FindBy(xpath = "//input[@title='Surname Required Field' and contains(@id,'BillToCustomerContractName')]")
	public WebElement CustomerSurname;

	@FindBy(xpath = "//input[@title='Bill To Customer Contact Email Required Field' and contains(@id,'BillToCustomerContactEmail')]")
	public WebElement CustomerEmail;

	@FindBy(xpath = "//input[@title='Bill to Contract Telephone Number' and contains(@id,'BilltoContractTelephoneNumber')]")
	public WebElement cutomaerTelephoneNo;

	@FindBy(xpath = "//input[@title='Ship To Contract Name' and contains(@id,'ShipToContractName')]")
	public WebElement ShipToContractName;

	@FindBy(xpath = "//input[@title='Ship To Contract Email' and contains(@id,'ShipToContractEmail')]")
	public WebElement ShipToContractEmail;

	@FindBy(xpath = "//input[@title='Ship To Contract Telephone' and contains(@id,'ShipToContractTelephone')]")
	public WebElement ShipToContractTelephone;

	@FindBy(xpath = "//input[@title='Is this a Framework order?' and @type='checkbox']")
	public WebElement isThisFraeworkOrderCheckbox;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'Currency')]")
	public WebElement currencyDropDown;

	@FindBy(xpath = "//input[@class='ms-input' and @title='Total Contract Value']")
	public WebElement contractValueTotal;

	@FindBy(xpath = "//input[@class='ms-input' and @title='Total Margin']")
	public WebElement totalMargin;

	@FindBy(xpath = "//input[@class='ms-input' and @title='Total Margin Percentage']")
	public WebElement totalMarginPercentage;

	@FindBy(xpath = "//select[@class='ms-RadioText' and @title='Is this CREM Exempt']")
	public WebElement isThisCREMExempt;

	@FindBy(xpath = "//input[@class='ms-long' and contains(@id,'HyperlinktoAPPROVEDCREMitem')][1]")
	public WebElement hyperlinkWebUrl;

	@FindBy(xpath = "//input[@class='ms-long' and contains(@id,'HyperlinktoAPPROVEDCREMitem')][2]")
	public WebElement hyperlinkWebUrlDescription;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'OrderExpenses')]")
	public WebElement OrderExpenses;

	@FindBy(xpath = "//input[@class='ms-input' and contains(@id,'CustSignDate')]")
	public WebElement CustSignDate;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'Kimble')]")
	public WebElement KimbleDropDown;

	@FindBy(xpath = "//select[@class='ms-RadioText' and contains(@id,'ESOFStatus')]")
	public WebElement ESOFStatus;

	@FindBy(xpath = "(//input[@value='Save'])[2]")
	WebElement SaveContractBtn;

	@FindBy(xpath =   "//iframe[contains(@src,'/sites/contracts/_layouts/15/listform.aspx')]" )    //"(//iframe)[1]")
			WebElement CreateContractFrame;


	@FindBy(xpath = "//span[text()='More']")
	public WebElement workFlowMoreMenu;

	@FindBy(xpath = "//span[text()='Workflow']")
	public WebElement menuWorkflowOption;

	@FindBy(xpath = "//*[contains(text(),'Running Workflows')]")
	public  WebElement RunningWorkFlowSection;

	@FindBy(xpath = "//*[contains(text(),'There are no running workflows on this item')]")
	public WebElement noWorkFlowRunning;

	@FindBy(xpath = "//a[@title='Order Processing 2013 Mode' and contains(@href,'/sites/contracts')]")
	WebElement orderProcessing2013ModelLink;

	@FindBy(id = "WorkflowInternalStatus")
	WebElement InernalStatus;

	@FindBy(xpath = "//a[@class='ms-subtleLink' and text()='PS Orders']")
	WebElement PSOrders;

	@FindBy(xpath = "//a[@class='ms-subtleLink' and text()='PS Orders']//following::a[text()='Validate sales order']")
	WebElement  ValidateSalesOrderLink;

	@FindBy(xpath = "(//a[@class='ms-subtleLink' and text()='PS Orders']//following::a[text()='Validate sales order']//following::td[text()='Not Started'])[1]")
    WebElement  PSOrderNoStartedStatus;

	@FindBy(xpath = "//iframe[@class='ms-dlgFrame']")
	WebElement uplaodFrame;

	@FindBy(xpath = "//input[@title='Task Name Required Field']")
	WebElement TaskName;

	@FindBy(xpath = "//select[@title='Finance Response Required Field' and contains(@id,'FinanceResponse_')]")
	public WebElement financeApprovers;

	@FindBy(xpath = "//select[@title='Application Delivery Response Required Field' and contains(@id,'ApplicationDeliveryResponse_')]")
	public WebElement applicationDeliveryApproversDropDown;

	@FindBy(xpath = "//select[@title='Application Support Response Required Field' and contains(@id,'ApplicationSupportResponse_')]")
	public WebElement applicationSupportApproversDropDown;

	@FindBy(xpath = "//select[@title='Services Response Required Field' and contains(@id,'ServicesResponse_')]")
	public WebElement ServiceApproversDropDown;

	@FindBy(xpath = "//select[@title='WRB Status Required Field' and contains(@id,'WRBStatus')]")
	public WebElement WRBStatus;

	@FindBy(xpath = "//select[@title='Order Status Required Field' and contains(@id,'OrderStatus')]")
	public WebElement OrderStatus;

	@FindBy(xpath = "//input[@value='Complete Task' and @type='button']")
	public WebElement completeTaskBtn;

	@FindBy(xpath = "//input[contains(@title,'SAP Order') and contains(@id,'SAP')]")
	public WebElement SAPOrderNumber;

	@FindBy(xpath = "//input[contains(@id,'ApplicationDeliveryApprovers_') and @title='Application Delivery Approvers']")
	public WebElement  ApplicationDeliveryApprovers;

	@FindBy(xpath = "//input[contains(@id,'ApplicationSupportApprovers_') and @title='Application Support Approvers']")
	public WebElement  AppliationSupportApprovers;

	@FindBy(xpath = "//input[contains(@id,'ServicesApprovers_') and @title='Services Approvers']")
	public  WebElement ServiceApprovers;

	@FindBy(xpath = "//input[contains(@id,'FinanceApprovers_') and @title='Finance Approvers']")
	public WebElement FinanceApprovers;

	@FindBy(xpath = "//input[contains(@id,'LegalApprovers') and @title='Legal Approvers']")
	public WebElement LegalSendApproverInputs;

	@FindBy(xpath = "//a[text()='Finance approval']")
	public  WebElement financeApprovesLink;

	@FindBy(xpath = "//a[text()='Services approval']")
	public  WebElement serviceApproversLink;

	@FindBy(xpath = "//a[text()='Application support approval']")
	public  WebElement applicationSupportApproversLink;

	@FindBy(xpath = "//a[text()='Application delivery approval']")
	public  WebElement applicationDeliveryApproversLink;

	@FindBy(xpath = "//a[text()='Finance approval (over 25K)']")
	public  WebElement financeApprovesLink25k;

	@FindBy(xpath = "Legal approval (over 25K)")
	public  WebElement legalApprovesLink25k;

	@FindBy(xpath = "//select[@title='Finance Approval Response Required Field' and contains(@id,'FinanceApprovalResponse_')]")
	public  WebElement financeApprovers25k;

	@FindBy(xpath = "//select[@title='Legal Approval Response Required Field' and contains(@id,'LegalApprovalResponse_')]")
	public  WebElement legalApprovers25k;

	@FindBy(xpath = "//*[text()='SOF Log' and (contains(@class,'ms-Nav-linkText linkText') or @class='menu-item-text')]")
	public WebElement SofLogLob;

	@FindBy(xpath = "//*[contains(@class,'od-IconGlyph ms-Icon ms-Icon--Filter') and @data-icon-name='Filter']")
	public WebElement filterBtn;

	@FindBy(xpath = "(//div[@class='FiltersPane-section' and @data-section-key='CRMRef'])[1]//following-sibling::div[@class='FiltersPane-sectionFooter']/a")
	public  WebElement CrmRefSeeAllLink;

	@FindBy(xpath = "//input[contains(@class,'ms-BasePicker-input pickerInput')]")
	public WebElement filterInputVal;

	@FindBy(xpath = "//div[contains(@class,'ms-Button-label') and contains(@id,'id') and text()='Apply']")
	public  WebElement filterApplyBtn;


	@FindBy(xpath = "//h2[@class='StandaloneList-title']")
	WebElement PageHeaderName;

	@FindBy(xpath = "(//div[contains(@class,'ms-DetailsHeader') and @data-item-key='CRMRef'])[1]")
	public WebElement crmRefNumberColumn;

	@FindBy(xpath = "(//div[contains(@class,'ms-DetailsHeader') and @data-item-key='Status'])[1]")
	public WebElement statusColumn;

	@FindBy(xpath = "(//div[contains(@class,'ms-DetailsHeader') and @data-item-key='ESOFStatus'])[1]")
	public  WebElement EsofStatus;






































	public Integer setCRMRefNumber() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOf(this.CRMRefNumber));
		String dynamicCRMID = String.valueOf(ThreadLocalRandom.current().nextInt());
		//this.CRMRefNumber.sendKeys(dynamicCRMID);
		return Integer.valueOf(dynamicCRMID);
	}

	public Integer setCCN() throws InterruptedException {
		Thread.sleep(2000);
		String dynamicCRMID = String.valueOf(ThreadLocalRandom.current().nextInt());
		//this.CCN.sendKeys(dynamicCRMID);
		return Integer.valueOf(dynamicCRMID);
	}

	public void setContractCreationInputVal(String inputVal,WebElement webElement) throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(webElement));
		    webElement.clear();
			webElement.sendKeys(inputVal);
			Thread.sleep(500);

	}

	public Integer setAccountName(WebElement webElement,String writeData ) throws InterruptedException, FileNotFoundException {
		PropertiesPageObject obj = new PropertiesPageObject();
		String dynamicCRMID = String.valueOf(ThreadLocalRandom.current().nextInt());
		webElement.sendKeys(dynamicCRMID);
		webElement.sendKeys(Keys.ENTER);
		String accNo = webElement.getAttribute("value").trim();
		obj.WriteDataIntoConfig(writeData,accNo);
		return Integer.valueOf(accNo);
	}


	public void setContractCreationClickBtn(WebElement webElement) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(webElement));
		webElement.click();
		Thread.sleep(500);

	}

	public void setClickBtn(WebElement webElement) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(webElement));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", webElement);

	}


	public void setContractCreationDropDowns(String customerNameDropDown,WebElement webElement) throws InterruptedException{
		Select bidType = new Select(webElement);
		bidType.selectByVisibleText(customerNameDropDown);
		Thread.sleep(500);

	}

	public void setContractCreationValueDropDowns(String customerNameDropDown,WebElement webElement) throws InterruptedException{
		Select bidType = new Select(webElement);
		//bidType.selectByVisibleText(customerNameDropDown);
		bidType.selectByValue(customerNameDropDown);
		Thread.sleep(500);

	}

	public String setSignatureDate() throws InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String formattedLocalDate = dtf.format(now);
		this.CustSignDate.sendKeys(formattedLocalDate);
		Thread.sleep(2000);
		return formattedLocalDate;
	}

	public void setDropDowns(String DropDown,WebElement webElement) throws InterruptedException{
		Select bidType = new Select(webElement);
		bidType.selectByVisibleText(DropDown);
		Thread.sleep(500);

	}

	public void switchToCreateNewBidFrame() throws InterruptedException {
		Thread.sleep(20000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(raiseRequestFrame));
		driver.getTitle();
		System.out.println(driver.getTitle());
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(raiseRequestFrame);
	}


	public void clickSaveButton() {
		try {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", SaveContractBtn);
			Thread.sleep(20000);
			//Save.click();
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}

	}


	public boolean ContractWorkFlow() {
		boolean contractFlow= false;
		try {
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String crmID = prop.getProperty("CRMID");
			System.out.println("ContractNo*************** "+crmID);
			WebElement workFlowMenu  = driver.findElement(By.xpath("//div[@class='ms-List-cell']//following::span[text()='"+crmID+"']//following::button[@class='od-FieldRenderer-dot'][1]"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", workFlowMenu);
			contractFlow=true;
			Thread.sleep(5000);
			//Save.click();
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return contractFlow;
	}


	public boolean isMoreOption() throws Exception{
		Boolean moreMenu= false;
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", workFlowMoreMenu);
			//advanceMenuOption.click();
			Thread.sleep(5000);
			moreMenu=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return moreMenu;
	}

	public boolean isWorkFlowMenuOption() throws Exception{
		Boolean moreMenu= false;
		try {
			//Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", menuWorkflowOption);
			//advanceMenuOption.click();
			Thread.sleep(5000);
			moreMenu=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return moreMenu;
	}


	//
	public Boolean VerifyContract() throws InterruptedException {
		boolean contractCreated= false;
		WaitForSpecificTime();
		WaitForSpecificTime();
		try {
			try {
				FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
				Properties prop = new Properties();
				prop.load(fileInputStream);
				String crmID = prop.getProperty("CRMID");
				System.out.println("bid*************** "+crmID);
				contractCreated= driver.findElement(By.xpath("//div[@class='ms-List-cell']//following::span[text()='"+crmID+"']")).isDisplayed();
				if(contractCreated) {
					contractCreated=true;
				}else{
					contractCreated=false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return contractCreated;
	}

	public boolean runningWorkFlowSectionView() {
		Boolean runningWorkFlow =false;
		try {
			runningWorkFlow = this.RunningWorkFlowSection.isDisplayed();
			if(runningWorkFlow){
				runningWorkFlow=true;
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return runningWorkFlow;
	}

	public boolean noWorkFlowRunning() {
		Boolean runningWorkFlow =false;
		try {
			runningWorkFlow = this.noWorkFlowRunning.isDisplayed();
			if(runningWorkFlow){
				runningWorkFlow=true;
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return runningWorkFlow;
	}

	public boolean orderProcession2013Modelink() {
		Boolean runningWorkFlow =false;
		try {
			runningWorkFlow = this.orderProcessing2013ModelLink.isDisplayed();
			if(runningWorkFlow){
				this.orderProcessing2013ModelLink.click();
				Thread.sleep(10000);
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return runningWorkFlow;
	}


	public boolean InernalStatus(String StatusExpected) throws InterruptedException {
		Boolean runningWorkFlow =false;
		for(int i=0;i<=5;i++){
			WaitForSpecificTime();
			driver.navigate().refresh();
			try{
				boolean element = InernalStatus.isDisplayed();
				String status = this.InernalStatus.getText();
				if(element && status.equals(StatusExpected)){
					runningWorkFlow=true;
					break;
				}else {
					if(i==5){
						runningWorkFlow=false;
					}else {
						continue;
					}
				}
			}catch (Exception e){
				continue;
			}
		}



		/*Thread.sleep(10000);
		try {
			runningWorkFlow = this.InernalStatus.isDisplayed();
			if(runningWorkFlow){
				String status = this.InernalStatus.getText();
				Thread.sleep(10000);
				if(status.equals(StatusExpected)){
					runningWorkFlow=true;
				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return runningWorkFlow;*/
		return runningWorkFlow;
	}

	public boolean PSOrderFunction() {
		Boolean psOrderStatus =false;
		try {
			psOrderStatus = this.PSOrders.isDisplayed();
			if(psOrderStatus){
				boolean validateLink = ValidateSalesOrderLink.isDisplayed();
				if(validateLink){
					boolean notStarted = PSOrderNoStartedStatus.isDisplayed();
					if(notStarted){
						if(PSOrderNoStartedStatus.getText().trim().equals("Not Started")){
							ValidateSalesOrderLink.click();
							psOrderStatus=true;
						}
					}

				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return psOrderStatus;
	}

	public Boolean uploadFrameSwitch()throws InterruptedException{
		Boolean iframe=false;
		try{
			//Thread.sleep(8000);
			waitForPageToLoad(uplaodFrame);
			driver.switchTo().frame(uplaodFrame);
			iframe=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return iframe;
	}


	public Boolean validateSalesOrder(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Validate sales order")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Validate sales order");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return taskNameFlag;
	}

	public Boolean processOrderTaskName(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Process Order Form")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Process Order Form");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}

	public boolean PSOrderStatusCompleted() throws InterruptedException {
		Boolean psOrderStatus =false;
		Thread.sleep(5000);
		try {
			psOrderStatus = this.PSOrders.isDisplayed();
			if(psOrderStatus){
				boolean validateLink = ValidateSalesOrderLink.isDisplayed();
				if(validateLink){
					boolean completed = PSOrderNoStartedStatus.isDisplayed();
					if(completed){
						if(PSOrderNoStartedStatus.getText().trim().equals("Completed")){
							psOrderStatus=true;
							driver.navigate().refresh();
							WaitForSpecificTime();
						}
					}

				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return psOrderStatus;
	}

	public String getWorkFlowFromPropertyFile(String KeyName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/WorkFlowData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyName = prop.getProperty(KeyName);
		return keyName;
	}

	public boolean ProcessOrderForm() throws IOException {
		Boolean PrcoessOrderStatus =false;
		String userName = getWorkFlowFromPropertyFile("ProcessOrderFormUserName").trim();
		WebElement UserName = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']"));
		WebElement PrcoessOrderFormLink = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']//following::a[contains(text(),'Process Order Form')]"));
		WebElement ProcessOrdrStatus = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']//following::a[contains(text(),'Process Order Form')]//following::td[text()='Not Started']"));
		try {
			Boolean UserNameIsExist = UserName.isDisplayed();
			if(UserNameIsExist){
				boolean PrcoessOrdrStatus = PrcoessOrderFormLink.isDisplayed();
				if(PrcoessOrdrStatus){
					boolean notStarted = ProcessOrdrStatus.isDisplayed();
					if(notStarted){
						if(ProcessOrdrStatus.getText().trim().equals("Not Started")){
							PrcoessOrderFormLink.click();
							PrcoessOrderStatus=true;
						}
					}

				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return PrcoessOrderStatus;
	}

	public boolean ProcessOrderFormCompleted() throws IOException {
		Boolean PrcoessOrderStatus =false;
		String userName = getWorkFlowFromPropertyFile("ProcessOrderFormUserName").trim();
		WebElement UserName = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']"));
		WebElement PrcoessOrderFormLink = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']//following::a[contains(text(),'Process Order Form')]"));
		WebElement ProcessOrdrStatus = driver.findElement(By.xpath("//a[@class='ms-subtleLink' and text()='"+userName+"']//following::a[contains(text(),'Process Order Form')]//following::td[text()='Completed']"));
		try {
			Boolean UserNameIsExist = UserName.isDisplayed();
			if(UserNameIsExist){
				boolean PrcoessOrdrStatus = PrcoessOrderFormLink.isDisplayed();
				if(PrcoessOrdrStatus){
					boolean notStarted = ProcessOrdrStatus.isDisplayed();
					if(notStarted){
						if(ProcessOrdrStatus.getText().trim().equals("Completed")){
							PrcoessOrderStatus=true;
							driver.navigate().refresh();
						}
					}

				}
			}
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}
		return PrcoessOrderStatus;
	}

	public void WaitForSpecificTime() throws InterruptedException {
		Thread.sleep(20000);
	}

	public void WaitFor10k() throws InterruptedException {
		Thread.sleep(10000);
	}


	public Boolean validateFinanceApprovrs(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Finance approval")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Finance approval");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}

	public Boolean validateApplicationDeliveryApprovrs(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Application delivery approval")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Application delivery approval");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}


	public Boolean validateApplicationSupportApprovrs(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Application support approval")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Application support approval");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}

	public Boolean validateServiceApprovrs(){
		Boolean taskNameFlag=false;
		try{
			String taskName = this.TaskName.getText().trim();
			if(taskName.equals("Services approval")){
				taskNameFlag=true;
			}else{
				this.TaskName.clear();
				this.TaskName.sendKeys("Services approval");
				taskNameFlag=true;
			}
		}catch (Exception e){
			e.printStackTrace();

		}
		return taskNameFlag;
	}

	public Boolean verifyPageHeader(String titleName)throws InterruptedException{
		Boolean pageTtitle=false;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(PageHeaderName));
			Boolean tbodyExist = PageHeaderName.isDisplayed();
			String pageTitleName = PageHeaderName.getText().trim();
			if(tbodyExist && pageTitleName.equals(titleName)){
				pageTtitle=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return pageTtitle;
	}

	public Boolean verifyCrmNumberAndStatus(String todo)throws InterruptedException{
		Boolean verifyStatus=false;
		try{
			Thread.sleep(20000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", CrmRefSeeAllLink);
			//CrmRefSeeAllLink.click();
			Thread.sleep(20000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String crmID = prop.getProperty("CRMID");
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(filterInputVal));
			filterInputVal.clear();
			filterInputVal.sendKeys(crmID);
			Thread.sleep(10000);
			filterInputVal.sendKeys(Keys.ENTER);
			filterApplyBtn.click();
			/*Thread.sleep(2000);
			js.executeScript("arguments[0].click();", CrmRefSeeAllLink);
			//CrmRefSeeAllLink.click();*/
			WaitForSpecificTime();
			verifyStatus=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return verifyStatus;
	}


	public Boolean verifyCrmRefAndStatuCoumnIndex(String StatusState,String Eofstatus)throws InterruptedException{
		Boolean verifyCrmNameAndStatus=false;
		try{
			String crmRefColumnNo = crmRefNumberColumn.getAttribute("aria-colindex").trim();
			String CRMRefNameActaul = driver.findElement(By.xpath("//div[contains(@class,'ms-DetailsRow') and @aria-colindex='"+crmRefColumnNo+"']")).getText().trim();
			String statusColumnNo = statusColumn.getAttribute("aria-colindex").trim();
			String statusActualState = driver.findElement(By.xpath("//div[contains(@class,'ms-DetailsRow') and @aria-colindex='"+statusColumnNo+"']")).getText().trim();
			String eofColumnNo = EsofStatus.getAttribute("aria-colindex").trim();
			String EofStatusActualState = driver.findElement(By.xpath("//div[contains(@class,'ms-DetailsRow') and @aria-colindex='"+eofColumnNo+"']")).getText().trim();

			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String crmID = prop.getProperty("CRMID");
			System.out.println("CRMREfActaul is"+CRMRefNameActaul+"CRMID expected"+crmID+"working fine");
			System.out.println("statusActualState is"+statusActualState+"CRMID expected"+StatusState+"working fine");
			if(CRMRefNameActaul.equals(crmID) && statusActualState.equals(StatusState))
			{
				verifyCrmNameAndStatus= true;
				System.out.println("Working fine as expected");

			}
			if(EofStatusActualState.equals(Eofstatus)){
				verifyCrmNameAndStatus= true;
				System.out.println("Working fine as expected");
			}else {
				verifyCrmNameAndStatus= false;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return verifyCrmNameAndStatus;
	}


	public boolean SofLogMenu() throws Exception{
		boolean sofLog=false;
		try{
			sofLog = SofLogLob.isDisplayed();
			if(sofLog){
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", SofLogLob);
				Thread.sleep(20000);
				sofLog=true;
			}
		}catch (Exception e){
			System.out.println("try catch");
			e.printStackTrace();
		}
		finally {
			return sofLog;
		}
	}

	public boolean SofLogMenuForDaftStatus() throws Exception{
		boolean sofLog=false;
		try{
			driver.navigate().back();
			Thread.sleep(10000);
			driver.navigate().refresh();
			Thread.sleep(10000);
			sofLog = SofLogLob.isDisplayed();
			if(sofLog){
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();", SofLogLob);
				Thread.sleep(20000);
				sofLog=true;
			}
		}catch (Exception e){
			System.out.println("try catch");
			e.printStackTrace();
		}
		finally {
			return sofLog;
		}
	}




































//	WebConnnector con;

	@FindBy(xpath = "//a[@title='Bid List']")
	WebElement BidList;

	@FindBy(xpath = "//input[@title='Name Required Field']")
	WebElement Name;

	@FindBy(xpath = "//input[@title='Bid Title Required Field']")
	WebElement BidTitle;

	@FindBy(xpath = "//input[@title='Client Name Required Field']")
	WebElement ClientName;

	@FindBy(xpath = "//select[@title='Bid Event Type Required Field']")
	WebElement BidEventType;

	@FindBy(xpath = "//select[@id='DropdownNr1']")
	WebElement BidManager;

	@FindBy(xpath = "//select[@id='DropdownNr2']")
	WebElement SalesLead;

	@FindBy(xpath = "//input[@title='Submission Date Required Field']")
	WebElement SubmissonDate;

	@FindBy(xpath = "//select[@title='Sensitivity level Required Field']")
	WebElement SensitivityLevel;

	@FindBy(xpath = "//textarea[contains(@id,'Notes')]")  //"//textarea[@title='Notes']")
	WebElement Notes;

	@FindBy(xpath = "//textarea[contains(@id,'Security')]") //"//textarea[@title='Security clearance requirements Required Field']")
	WebElement SecurityClearanceRequirements;

	@FindBy(xpath = "//textarea[contains(@id,'Submission')]")//"//textarea[@title='Submission instructions Required Field']")
	WebElement SubmissionInstructions;

	//@FindBy(xpath = "//input[@title='CRM ID']")
	//WebElement CRMID;



	@FindBy(xpath = "//input[@value='Save']")
	WebElement Save;

	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//td[@valign='top']/../td[3]")
	List<WebElement> FinalBidValues;



	@FindBy(xpath = "//*[@title='Upload a document from your computer to this library.']/span[1]")
	WebElement uploadBtn;

	@FindBy(xpath ="//*[@id='dialogTitleSpan']")
	WebElement addDocumentDialogBox;


	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement addDocmentPageClose;



	@FindBy(xpath = "//input[@title='Choose a file']")
	WebElement uploadFilePath;

	@FindBy(xpath = "//*[@title='Version Comments']")
	WebElement versionComment;

	@FindBy(xpath = "//*[@value='OK']")
	WebElement okUploadBnt;

	@FindBy(xpath = "//*[text()='Sub Group']//following::input[@value='Check In']")
	WebElement checkInbtn;

	@FindBy(xpath = "//*[@title='Select files and download as a zip file']/span/img")
	WebElement zipFileBtn;

	@FindBy(xpath = "//*[@title='Click here for Final Submission']/span/img")
	WebElement finalSubmission;

	@FindBy(xpath = "//*[@class='ms-List-cell']")
	WebElement bidRecordsCnt;

	@FindBy(xpath = "(((//*[@class='ms-List-cell'])[1]//following::span[contains(@class,'FieldRenderer-NameRenderer-SignalField')])[1]//following::a)[1]")
	WebElement bidCreationBtn;

	@FindBy(xpath = "(//div[@role='checkbox'])[1]")
	WebElement bidAttachmentChkBox;




	@FindBy(xpath = "//input[@value='OK']")
	WebElement FinalSubmissionOk;

	@FindBy(xpath  ="//a[@id='ViewPropsLink']")
	WebElement viewAllPropertiesLink;

	@FindBy(xpath = "//a[contains(@name,'SPBookmark_Frameworks_')]//following::input[@value='Close']")
	WebElement CloseBtn;

	@FindBy(xpath  ="//a[@id='EditPropsLink']")
	WebElement EditPropertiesLink;

	@FindBy(xpath = "//input[@title='Bid Title Required Field']")
	WebElement  bidTitle;

	@FindBy(xpath = "//*[contains(@id,'Frameworks')]//following::input[@value='Save']")
	WebElement SaveBtns;

	@FindBy(xpath = "//*[text()='Copy Documents']")
	WebElement copyDocument;

	@FindBy(xpath = "//select[@id='crmIDList']")
	WebElement crmIdDropDown;

	@FindBy(xpath = "//input[@id='copyDoc']")
	WebElement copyBtn;

	@FindBy(xpath = "//p[@id='msgCopy']")
	WebElement CopySuccessFulMsg;

	@FindBy(xpath = "//iframe[contains(@id,'DlgFrame') and @class='ms-dlgFrame']")
	WebElement DlgFrame;

	@FindBy(xpath = "//a[@id='destBidUrl']")
	WebElement destinationBidLink;

	@FindBy(xpath = "//span[text()='Edit' and @class='CommandBarItem-commandText']")
	WebElement editMenu;

	@FindBy(xpath = "//span[text()='Delete' and @class='CommandBarItem-commandText']")
	WebElement deleteBidManager;

	@FindBy(xpath = "//span[text()='Delete' and @class='od-Button-label']")
	WebElement deleteConfirmBtn;

	@FindBy(xpath = "//*[contains(text(),'Deleted 1 item from ')]")
	WebElement deletedMsg;

	// new document added
	@FindBy(xpath = "//input[@value='SharePoint Test case (2)' and contains(@title,'Name Required Field')]")
	WebElement DocName;  // i want to take this xpath directly into script as value will get change



    @FindBy(xpath = "//select[contains(@title,'Document Group Required') or contains(@id,'Document')]")
	WebElement documentRequiredDropDown;

    @FindBy(xpath = "//select[contains(@title,'Sub Group Required') or contains(@id,'Sub')]")
	WebElement subgroup;

    @FindBy(xpath = "//span[@id='idDocsetName']")
	WebElement BidId;

    @FindBy(xpath = "//*[text()='More']/span[2]")
	WebElement moreBtn;

    @FindBy(xpath = "//a[@id='ID_AdvancedMenu']")
	WebElement advanceMenuOption;

	@FindBy(xpath = "//a[@id='ID_DeleteMenu']")
	WebElement deleteMenuOption;

	@FindBy(xpath = "//a[@id='ID_Checkout' or @id='ID_Checkin']")
	WebElement checkInAndCheckOut;

	@FindBy(xpath = "//*[@id='CheckinDescription']")
	WebElement CheckInComments;

	@FindBy(xpath = "//input[@id='CheckinOk']")
	WebElement checkInBtnOk;

	@FindBy(xpath = "//input[@id='inplaceSearchDiv_WPQ7_lsinput']")
	WebElement insideBidCreation;

	@FindBy(xpath = "//div[@id='WebPartWPQ1']//input[1]")
	WebElement BidRecordKeyContent;

	@FindBy(id = "Result")
	public WebElement SearchContentBid;

	@FindBy(xpath = "//span[@id='inplaceSearchDiv_WPQ7_lsimgspan']")
	WebElement SearchMagnifierBtn;

	@FindBy(xpath = "//table[@summary='Bid List']/tbody")
	WebElement BidRecords;

	@FindBy(name = "Search")
	WebElement SearchAsKey;

	@FindBy(xpath = "//span[text()='Share']")
	WebElement shareBtnDispay;

	@FindBy(xpath = "//div[@id='selected-suggestion-alert']//following::input[1]")
	WebElement enterSenderName;

	@FindBy(xpath = "//div[contains(@id,'id__') and text()='Send']")
	WebElement  sendRecepientBtn;

	@FindBy(xpath = "//div[@class='od-ShareNotification-icon']")
	WebElement shareNotificatioDisplay;

	@FindBy(xpath = "//*[@class='ms-standardheader' and text()='CRM ID']//following::td[2]")
	WebElement getCRMID;

	@FindBy(xpath = "(//span[@class='ag-selection-checkbox'])[1]")
	public WebElement recordchkbox;

	@FindBy(xpath = "(//span[@class='ag-selection-checkbox'])[1]//following::span[@ref='eCellValue'][1]")
	public WebElement fetchUnqRefNumber;

	@FindBy(xpath = "//div[contains(@id,'id') and text()='Raise Invoice']")
	public WebElement raiseInvoiceBtn;

	@FindBy(xpath = "//div[contains(@id,'id') and text()='Create Invoice']")
	public  WebElement CreateInvoiceBtn;

	@FindBy(xpath = "//label[text()='CRM Number:']//following::input[1]")
	public WebElement ActualCrmNumber;

	@FindBy(xpath = "//label[text()='Your Invoice have been successfully created']")
	public WebElement InvoiceSussfullyCreated;

	@FindBy(xpath = "//a[text()='Click here to view']")
	public  WebElement cllLink;


	public NPSFinanceApplicationPageObject() {
		PageFactory.initElements(driver, this);
	}

	public boolean isNameTextBoxDisplayed() {
		return (Name.isDisplayed());
	}

	public boolean isNameTextBoxEnabled() {
		return (Name.isEnabled());
	}


	public void switchToDefaultWindow() {
		driver.switchTo().defaultContent();
	}

	public String bidIDNumber(){
		BidId.isDisplayed();
	    return BidId.getText().trim();
	}


	public boolean isBidListRightSideOptionDisplayed() {
		return (BidList.isDisplayed());
	}

	public boolean isBidListRightSideOptionsEnabled() {
		return (BidList.isEnabled());
	}

	public boolean isBidTitleTextBoxDisplayed() {
		return (BidTitle.isDisplayed());
	}

	public boolean isBidTitleTextBoxEnabled() {
		return (BidTitle.isEnabled());
	}

	public boolean isClientNameTextBoxDisplayed() {
		return (ClientName.isDisplayed());
	}

	public boolean isClientNameTextBoxEnabled() {
		return (ClientName.isEnabled());
	}

	public boolean isBidEventTypeDropDownBoxDisplayed() {
		return (BidEventType.isDisplayed());
	}

	public boolean isBidEventTypeDropDownBoxEnabled() {
		return (BidEventType.isEnabled());
	}

	public boolean isBidManagerDropDownDisplayed() {
		return (BidManager.isDisplayed());
	}

	public boolean isBidManagerDropDownEnabled() {
		return (BidManager.isEnabled());
	}

	public boolean isSalesLeadDropDownDisplayed() {
		return (SalesLead.isDisplayed());
	}

	public boolean isSalesLeadDropDownEnabled() {
		return (SalesLead.isEnabled());
	}

	public boolean isSubmissionDateFieldDisplayed() {
		return (SubmissonDate.isDisplayed());
	}

	public boolean isSubmissionDateFieldEnabled() {
		return (SubmissonDate.isEnabled());
	}

	public boolean isSensitivityLevelDropDownDisplayed() {
		return (SensitivityLevel.isDisplayed());
	}

	public boolean isSensitivityLevelDropDownEnabled() {
		return (SensitivityLevel.isEnabled());
	}

	public boolean isNotesTextDisplayed() {
		return (Notes.isDisplayed());
	}

	public boolean isNotesTextEnabled() {
		return (Notes.isEnabled());
	}

	public boolean isSecurityClearanceRequirementsTextDisplayed() {
		return (SecurityClearanceRequirements.isDisplayed());
	}

	public boolean isSecurityClearanceRequirementsTextEnabled() {
		return (SecurityClearanceRequirements.isEnabled());
	}

	public boolean isSubmissionInstructionsTextDisplayed() {
		return (SubmissionInstructions.isDisplayed());
	}

	public boolean isSubmissionInstructionsTextEnabled() {
		return (SubmissionInstructions.isEnabled());
	}




	public boolean isSaveButtonDisplayed() {
		return (Save.isDisplayed());
	}

	public boolean isSaveButtonEnabled() {
		return (Save.isEnabled());
	}

	public boolean isCancelButtonDisplayed() {
		return (Cancel.isDisplayed());
	}

	public boolean isCancelButtonEnabled() {
		return (Cancel.isEnabled());
	}

	public void clickBidListRightHandSideOption() {
		try {
			BidList.click();
			WaitForSpecificTime();
		} catch (StaleElementReferenceException e) {
			System.out.println("StaleElementReferenceException occured while clicking Ok button...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occured while clicking Ok button...");
		}

	}




	public void clickCancelButton() {
		Cancel.click();
	}

	public void setName(String Name) throws InterruptedException {
		this.Name.sendKeys(Name);
		Thread.sleep(2000);
	}


	public ArrayList<String> getFinalBidValues() {
		ArrayList<String> temp = new ArrayList<String>();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(FinalBidValues.get(1)));
		
		for (int i = 0; i < FinalBidValues.size(); i++) {
			temp.add(FinalBidValues.get(i).getText());
		}
		return temp;
	}



	public void uploadBtnVeriy()throws InterruptedException{
		try{
			Thread.sleep(10000);
			uploadBtn.click();
			WaitForSpecificTime();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void uploadFile()throws InterruptedException{
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			prop.load(ip);
			String docName = prop.getProperty("attachmentName");
			uploadFilePath.sendKeys( System.getProperty("user.dir")+"/Attachments/"+docName);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void versionCommits()throws InterruptedException{
		try{
			versionComment.sendKeys("Test Uplaod");
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void addDocumentSpanWindow()throws InterruptedException{
		try{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", addDocumentDialogBox);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void okUploadBnt()throws InterruptedException{
		try{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", okUploadBnt);
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void checkIn()throws InterruptedException{
		try{

			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", checkInbtn);
			Thread.sleep(20000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}



	public void finalSubmissionOk()throws InterruptedException{
		try{
			FinalSubmissionOk.click();
			driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
			//Thread.sleep(20000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void zipBtnVerify()throws InterruptedException{
		System.out.println("JummmmmmmmmmmmmmmmmmmmmmmmmmmmmmPPPPPPPPing");
		driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", zipFileBtn);
		Thread.sleep(5000);

	}

	public void verifyZipGetsDownloaded() throws  Exception{
		Thread.sleep(20000);
		String crmId =getCRMID.getText().trim();
		System.out.println("sdjfkjdsfksdkfkdskf :" +crmId);
		String path = "C:\\Users\\Parmeshwar.Sakole\\Downloads";
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();
		boolean found = false;
		File f = null;
		//Look for the file in the files
		// You should write smart REGEX according to the filename
		for (File listOfFile : listOfFiles) {
			if (listOfFile.isFile()) {
				String fileName = listOfFile.getName();
				System.out.println("File " + listOfFile.getName());
				if (fileName.matches("CRMID_"+crmId+".zip")) {
					f = new File(fileName);
					found = true;
				}
			}
		}
		Assert.assertTrue("Downloaded document is not found",found);
		f.deleteOnExit();
		//if(Directory.Exist)
	}

	public  void finalSubmissionVerify()throws InterruptedException{
		try{
			Thread.sleep(5000);
			finalSubmission.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void alertPersentOrNot()throws InterruptedException{
		try{
			WebDriverWait wait = new WebDriverWait(driver, 60 /*timeout in seconds*/);
			if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
				System.out.println("alert  present");
				Alert alert = driver.switchTo().alert();
				alert.accept();
				Thread.sleep(5000);
			}else{
				System.out.println("alert was present");
			}
		}catch (Exception e){

		}
	}
	public String getTitle="";
	public void checkExistBidCreation()throws InterruptedException{
		try{
			Thread.sleep(10000);
			List<WebElement> bidRecords =  driver.findElements(By.xpath("(//*[@class='ms-List-cell'])[1]//following::span[contains(@class,'FieldRenderer-NameRenderer-SignalField')]"));
			System.out.println("bidRecords count "+ bidRecords);
			if(!bidRecords.isEmpty()){
					getTitle=  bidCreationBtn.getText();
					System.out.println("---------*****"+getTitle);
						bidCreationBtn.click();
			}else{
					System.out.println("We don't have a bid creation records");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public boolean BidReturnSearchContent()throws  Exception{
		Boolean flag= false;
		try{
			Boolean tbodyExist = BidRecords.isDisplayed();
			if(tbodyExist){
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	public boolean SearchContentBidDisplay()throws  Exception{
		Boolean flag= false;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(SearchContentBid));
			Boolean tbodyExist = SearchContentBid.isDisplayed();
			if(tbodyExist){
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}


	public boolean BidReturnAsKeyContent()throws  Exception{
		Boolean flag= false;
		Thread.sleep(10000);
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		try{

			String docName = prop.getProperty("BidListKey");
			Boolean tbodyExist = driver.findElement(By.xpath("//span[text()='"+docName+"']")).isDisplayed();
			if(tbodyExist){
				flag=true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		finally {
			ip.close();
		}
		return flag;
	}

	public boolean  bidListViewDocSelect(String uploadedDocName) throws Exception{
		boolean docFlag=false;
		try{
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			WebElement test = driver.findElement(
					By.xpath("(//a[text()='"+uploadedDocName+"']//preceding::div[@role='checkbox'and @aria-checked='false'])[1]"));
			driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
			System.out.println("**************************************************test Id one "+ test);
			test.click();
			Thread.sleep(2000);
			docFlag=true;
			/*
			WebDriverWait wait = new WebDriverWait(driver, 30 );
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table[@summary='Bid List']/thead/tr/th"))));
			List<WebElement> bidRecords =  driver.findElements(By.xpath("//table[@summary='Bid List']/thead/tr/th"));
			Lable1:
			for(int i=1;i<=bidRecords.size();i++)
			{
						String bidListHeaderName = driver.findElement(By.xpath("(//table[@summary='Bid List']/thead/tr/th)["+i+"]")).getText().trim();
						if(bidListHeaderName.equals("Name")){
							System.out.println("first Loop Success"+i);
							boolean tbody = driver.findElement(By.xpath("//table[@summary='Bid List']/tbody/tr")).isDisplayed();
							 if(tbody)
							 {
								 System.out.println("secod Loop Success");
								 List<WebElement> tblDocNameCnt = driver.findElements(By.xpath("(//table[@summary='Bid List']/tbody/tr/td["+i+"]/div/a)"));
									for(int j=1;j<=tblDocNameCnt.size();j++)
									{
										System.out.println("third Loop Success"+(i)+"("+j+")");
										String docName = driver.findElement(By.xpath("(//table[@summary='Bid List']/tbody/tr/td["+i+"]/div/a)["+j+"]")).getText().trim();
										if(docName.equals(uploadedDocName))
										{

											 driver.findElement(By.xpath("(//table[@summary='Bid List']/tbody/tr/td["+i+"]/div/a)["+j+"]//preceding::div[@role='checkbox'][1]")).click();
											*//*JavascriptExecutor js = (JavascriptExecutor)driver;
											js.executeScript("arguments[0].click();", chkbox);*//*
											System.out.println("Last Loop Success"+j);
											docFlag=true;
											System.out.println("break1");
											break;
										}
									}
							 }else {
							 	Assert.fail("Attachment not present for this bid");
							 }
							if(docFlag)
								System.out.println("break5");
								break;

						}
			}*/
		}catch (Exception e){
			e.printStackTrace();
		}
		return docFlag;
	}

	public void switchWindow() throws InterruptedException {
		PopupWindow window = new PopupWindow();
		window.getTitleOfNewPage(driver,getTitle);
	}
	public void selectItemInBidList()throws InterruptedException{
		try{
			driver.switchTo().defaultContent();
			bidAttachmentChkBox.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void viewAllPropertiesLink()throws InterruptedException{
		try{
			driver.switchTo().defaultContent();
			viewAllPropertiesLink.click();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void CloseBtn()throws InterruptedException{
			CloseBtn.click();
	}
	public void SaveBtn()throws InterruptedException{
			SaveBtn.click();
	}
	public void EditPropertiesLink()throws InterruptedException{
			driver.switchTo().defaultContent();
			EditPropertiesLink.click();
	}



	public void UpdateTheBidTitle(String changeTitleName){
		try{
			bidTitle.clear();
			bidTitle.sendKeys(changeTitleName);

		}catch (Exception e){
			e.printStackTrace();

		}
	}

	public void copyDocument()throws InterruptedException{
			copyDocument.click();
	}

	public void  SelectCrmId() throws InterruptedException, IOException {
		//Dropdown dropdown = new Dropdown();
		//dropdown.selectValueFromUnorderedList((WebElement) driver,val);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String crmId = prop.getProperty("CRMID");
		Select bidmanager = new Select(this.crmIdDropDown);
		bidmanager.selectByVisibleText(crmId);
	}

	public void CopyDocumentBtn()throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", copyBtn);
	}

	public void waitTillMsgDisply() throws InterruptedException {
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(DlgFrame);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(CopySuccessFulMsg));
		Thread.sleep(2000);
	}
	public void destinationLink()throws InterruptedException{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", destinationBidLink);
		    Thread.sleep(2000);

	}

public void clickOnBIdMangerSelection(String titleName) throws InterruptedException {
			System.out.println("titleName......>"+titleName);
			driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
			WebElement slectCheckbox = driver.findElement(By.xpath("(//button[contains(@class,'ms-Link titleField') and @title='"+titleName+"'])[1]//preceding::div[contains(@class,'ms-Check root')][1]"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", slectCheckbox);
}

public void editMenuBar()throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(editMenu));
			editMenu.click();
}

	public void deleteBidManager()throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(deleteBidManager));
			deleteBidManager.click();

	}

	public void deleteConfirmBtn()throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(deleteConfirmBtn));
			deleteConfirmBtn.click();
	}

	public void confirmDeletMessage()throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(deletedMsg));
	}

	public void verifyEditTitleName(String bidName)throws InterruptedException{
			Thread.sleep(5000);
			WebElement updatedElemnt = driver.findElement(By.xpath("//button[@title='"+bidName+"' and text()='"+bidName+"']"));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(updatedElemnt));
			Assert.assertTrue(updatedElemnt.isDisplayed());

	}

	public void SelectBidCreated(String bidName)throws InterruptedException{
		Thread.sleep(5000);
		WebElement updatedElemnt = driver.findElement(By.xpath("//button[@title='"+bidName+"' and text()='"+bidName+"']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(updatedElemnt));
		Assert.assertTrue(updatedElemnt.isDisplayed());

	}


	public void VerifyDocumentStatus() throws  InterruptedException{
		driver.manage().timeouts().pageLoadTimeout(30, SECONDS);
		List<WebElement> tblHeader = driver.findElements(By.xpath("(//table//thead/tr/th)"));
		for(int i=0;i<tblHeader.size();i++){
			String status = tblHeader.get(i).getText().trim();
			System.out.println("status "+ status);
			if(status.equalsIgnoreCase("Document Group")){
				WebElement docuStatuswebElement = driver.findElement(By.xpath("(//table//thead//tr//th//following::tbody[1]/tr/td)["+(i+1)+"]"));
				String docstatus = docuStatuswebElement.getText().trim();
				System.out.println("docstatus "+ status);
				if(docstatus.equalsIgnoreCase("Final Submission")){
						Assert.assertTrue(docuStatuswebElement.isDisplayed());
						break;
					}else{
						Assert.fail("Document Status not in Final Status");
					}
			}
		}
}

	public void SelectAutoGeneratedBidID() throws InterruptedException, IOException {
		driver.manage().timeouts().pageLoadTimeout(60, SECONDS);
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String bidNumber = prop.getProperty("BidId");
		WebElement slectCheckbox = driver.findElement(By.xpath("//*[text()='"+bidNumber+"']//preceding::div[@role='checkbox' and @aria-checked='false' ][1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", slectCheckbox);

	}

	public void clickOnBidRecord() throws InterruptedException, IOException {
		try {
			Thread.sleep(10000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String bidNumber = prop.getProperty("BidId");
			System.out.println("bid*************** "+bidNumber);
			fileInputStream.close();
			WebElement bidNumberExist = driver.findElement(By.xpath("//a[text()='"+ bidNumber +"']"));
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(bidNumberExist));
			bidNumberExist.click();
		}catch (Exception e){

			e.printStackTrace();
		}
	}

	public void clickOnBidForSearchAttachMentContent() throws InterruptedException, IOException {
		try {
			Thread.sleep(10000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String bidNumber = prop.getProperty("BidNumberForSearch");
			System.out.println("bid*************** "+bidNumber);
			fileInputStream.close();
			WebElement bidNumberExist = driver.findElement(By.xpath("//a[text()='"+ bidNumber +"']"));
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(bidNumberExist));
			bidNumberExist.click();
		}catch (Exception e){

			e.printStackTrace();
		}
	}



	public boolean isAdvanceMenu() throws Exception{
		try {


			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", advanceMenuOption);
			//advanceMenuOption.click();
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public boolean isDeleteOption() throws Exception{
		try {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", deleteMenuOption);
			Thread.sleep(2000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}


	public boolean isCheckInAndCheckOut() throws Exception{
		try {
			Thread.sleep(5000);
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("arguments[0].click();", checkInAndCheckOut);
			checkInAndCheckOut.click();
			Thread.sleep(2000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public void isSearchContentChecked() throws Exception{
		try{
			Thread.sleep(5000);
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			prop.load(ip);
			String docName = prop.getProperty("InsideBidContentSearch");
			insideBidCreation.sendKeys( docName);
			SearchMagnifierBtn.click();
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public void isSearchBidRecordKeyContent() throws Exception{
		try{
			Thread.sleep(5000);
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
			prop.load(ip);
			String docName = prop.getProperty("InsideBidContentSearch");
			BidRecordKeyContent.sendKeys(docName);
			BidRecordKeyContent.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
	}




	public void isSearchContentKey() throws Exception{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		try{
			Thread.sleep(5000);

			String docName = prop.getProperty("BidListKey");
			SearchAsKey.sendKeys( docName);
			SearchAsKey.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
		finally {
			ip.close();
		}
	}

	public boolean isSharebtnDisplay() throws Exception{
		boolean chkbtn=false;
		try{
			Thread.sleep(10000);
			shareBtnDispay.isDisplayed();
			shareBtnDispay.click();
			chkbtn=true;
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return chkbtn;
	}


	public void isAddSenderName(String Name) throws InterruptedException {
		this.enterSenderName.sendKeys(Name);
		Thread.sleep(5000);
		this.enterSenderName.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	}

	public boolean isSendBtn() throws Exception{
		boolean sendBtnEnabled = false;
		try {
			 sendBtnEnabled=this.sendRecepientBtn.isDisplayed();
			 this.sendRecepientBtn.click();
		}catch (Exception e){
			e.printStackTrace();
		}
		return sendBtnEnabled;
	}

	public boolean isShareNotification() throws Exception{
		boolean shareNotifiaction = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(shareNotificatioDisplay));
			shareNotifiaction=this.shareNotificatioDisplay.isDisplayed();
		}catch (Exception e){
			e.printStackTrace();
		}
		return shareNotifiaction;
	}


	public boolean isCheckOutExistOrNot() throws Exception{
		Boolean CheckOutOption= false;
		try{
			WebDriverWait wait = new WebDriverWait(driver, 60 /*timeout in seconds*/);
			if(wait.until(ExpectedConditions.alertIsPresent())!=null) {
				System.out.println("alert  present");
				Alert alert = driver.switchTo().alert();
				String alertMsg =alert.getText();
				System.out.println("*************************************************"+alertMsg);
				alert.accept();
				CheckOutOption= true;
				Thread.sleep(5000);
			}else{
				System.out.println("alert was present");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return CheckOutOption;
	}

	public boolean isCheckInPopupIsExist() throws Exception{
		Boolean checkIn= false;
		try{
			Thread.sleep(2000);
			CheckInComments.sendKeys("TestCheckIn");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", checkInBtnOk);
			Thread.sleep(5000);
			checkIn=true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return checkIn;
	}

	public void clickOnBidRecordForShare() throws InterruptedException, IOException {
		try {
			Thread.sleep(3000);
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/RunTimeData.properties");
			Properties prop = new Properties();
			prop.load(fileInputStream);
			String bidNumber = prop.getProperty("BidId");
			System.out.println("bid*************** "+bidNumber);
			fileInputStream.close();
			WebElement bidNumberExist = driver.findElement(By.xpath("//a[text()='"+ bidNumber +"']//preceding::div[@role='checkbox'][1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", bidNumberExist);
			//bidNumberExist.click();
		}catch (Exception e){

			e.printStackTrace();
		}
	}




	public String  fullPermission() throws Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		String Username = prop.getProperty("fullPermissionUseName");
		String pwd  =  prop.getProperty("fullPermissionPwd");
		String url = "tc3-v-devsp06/sites/invoicesportal/SitePages/Home.aspx\n";
		String Url = "http://"+Username+":"+pwd+"@"+url;
		return Url;
	}

	public String TestUser() throws  Exception{
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/config.properties");
		prop.load(ip);
		String Username = prop.getProperty("testUsername");
		String pwd  =  prop.getProperty("testPwd");
		String url = "tc3-v-devsp06/sites/invoicesportal/SitePages/Home.aspx\n";
		String Url = "http://"+Username+":"+pwd+"@"+url;
		return Url;
	}



}
