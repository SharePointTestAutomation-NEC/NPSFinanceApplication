package step_definitions;

import com.aventstack.extentreports.Status;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pageobjects.CreateNewContractCreationPage;
import pageobjects.HomePage;
import pageobjects.NPSFinanceApplicationPageObject;
import pageobjects.PropertiesPageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static pageobjects.NPSFinanceApplicationPageObject.*;

public class Generic_Steps extends BaseClass {

	CreateNewContractCreationPage createNewContractCreationPage = new CreateNewContractCreationPage();
	public String SubmissonDate;


	SoftAssert sa;

	@Given("^I have logged in full permission user model$")
	public void iHaveLoggedInFullPermissionUserModel() throws Exception {
		String Url = createNewContractCreationPage.fullPermission();
		driver.get(Url);
	}

	@And("^I click on Vendor Master Data menu from side bar option$")
	public void iClickOnVendorMasterDataFromSideBarOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Browser used: " + "");
		homepage.clickVendorMasterDataLink();
	}

	@And("^I click on AP BACS Payment menu from side bar option$")
	public void iClickOnAPBASCPaymentFromSideBarOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Browser used: " + "");
		homepage.clickAPBascPaymentLink();
	}

	@And("^I click on ARInterCompany Link menu from side bar option$")
	public void iClickOnclickARInterCompanyLinktFromSideBarOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Browser used: " + "");
		homepage.clickARInterCompanyLink();
	}

	@And("^I click on ARJournal Link menu from side bar option$")
	public void iClickOnclickARJournalLinktFromSideBarOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Browser used: " + "");
		homepage.clickARJournalLink();
	}

	@And("^I click on contra Process Link menu from side bar option$")
	public void iClickOnContraProcessLinktFromSideBarOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Browser used: " + "");
		homepage.clickARContraProcesslLink();
	}

	@And("^I click on Group Treasury Transfers Link menu from side bar option$")
	public void iClickOnGrpTreasuryTransfersLinktFromSideBarOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Browser used: " + "");
		homepage.clickGrpTreasurylLink();
	}

	@And("^I click on AP Vendor menu from side bar option$")
	public void iClickOnAPVendorFromSideBarOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Browser used: " + "");
		homepage.clickAPVendorLink();
	}

	@And("^I click on AR Refund menu from side bar option$")
	public void iClickOnARRefundLinkFromSideBarOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Browser used: " + "");
		homepage.clickARRefundLink();
	}

	@And("^I click on RFPBU employee menu from side bar option$")
	public void iClickOnRFPBUEmployeeFromSideBarOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Browser used: " + "");
		homepage.clickRFPBUEmployeeLink();
	}

	@And("^I click on Raise request for BackLog and UnblockLog request$")
	public void iClickOnRaiseRequestForBackLogAndUnblockLogRequest() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "click on Raise request for backLog And Unblock Link" + "");
		//homepage.clickRaiseRequest();
	}

	@And("^I click on Vendor Master Data$")
	public void iClickOnVendorMasterData() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Vendor Master Data: " + "");
		homepage.ClickOnVendorMasterDataOption();
	}

	@And("^I click on AP BACS Payment$")
	public void iClickOnAPBacsPayment() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "AP Bacs Payment: " + "");
		homepage.ClickOnAPBacsPaymentOption();
	}

	@And("^I click on ARInterCompany$")
	public void iClickOnClickOnARInterCompanyOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "AP Bacs Payment: " + "");
		homepage.ClickOnARInterCompanyOptionOption();
	}

	@And("^I click on AR Journal$")
	public void iClickARJournalOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "AR Journal: " + "");
		homepage.ClickOnARJournalOptionDataOption();
	}

	@And("^I click on Grp Treasury Transfers$")
	public void iClickGrpTreasuryOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "AR Journal: " + "");
		homepage.ClickOnGrpTreasuryTransfersOptionDataOption();
	}

	@And("^I click on Contra Process$")
	public void iClickContraProcessOption() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Contra Process: " + "");
		homepage.ClickOnContraProcessOptionDataOption();
	}

	@And("^I click on AP Vendor$")
	public void iClickOnAPVendor() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "AP Vendor: " + "");
		homepage.ClickOnAPVendorOption();
	}

	@And("^I click on AR Refund$")
	public void ClickOnARRefund() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "AP Vendor: " + "");
		homepage.ClickOnARRefundOptionOption();
	}

	@And("^I click on RFPBUEmployee$")
	public void ClickOnRFPBUEmployee() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "RFPBU Employee: " + "");
		homepage.ClickOnRFPBUEmployeeOptionOption();
	}


	@And("^I click on Create button for creating new request$")
	public void iClickOnNewPlusIconButtonAndCreatingTheFolderForArchival() throws InterruptedException {
		NPSFinanceApplicationPageObject homepage = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Click on Create button for new request: " + "");
		homepage.setCreatebtnClick();
	}


	public String getContractDataFromPropertyFile(String KeyName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/NPSFinanceApplicationData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyName = prop.getProperty(KeyName);
		return keyName;
	}

	public String getWorkFlowFromPropertyFile(String KeyName) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/java" + "/config/WorkFlowData.properties");
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String keyName = prop.getProperty(KeyName);
		return keyName;
	}

	@And("^I have to raise the vendor request$")
	public void setRaiseVendorRequest() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "NPSFinanceApplication");
		app.switchToCreateNewBidFrame();
		app.setInputVal(getContractDataFromPropertyFile("VendorName"),refNumberFiled);
		app.setInputVal(getContractDataFromPropertyFile("VendorName"),vendorName); //Services
		app.fillVendorNumber();
		app.telephoneNumberCheckBox();
	}

	@And("^I have to raise the AP Bacs Payment request$")
	public void setRaiseAPBacsPaymentRequest() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "NPSFinanceApplication");
		app.switchToCreateNewBidFrame();
		app.setInputVal(getContractDataFromPropertyFile("APAdministrator"),APAdministration); //Services
		app.setInputVal(getContractDataFromPropertyFile("APBacsRequester"),APRequester); //Services
		//app.setInputVal(getContractDataFromPropertyFile("VendorCategory"),VendorCatyRequired); //Services
		app.fillVendorCategory();
		app.setInputVal(getContractDataFromPropertyFile("BatchType"),VendorTypeRequired); //Services
		app.setInputVal(getContractDataFromPropertyFile("APBacsPaymentAmount"),AmountRequiredFld); //Services
	}

	@And("^I have to raise the AR InterCompany request$")
	public void setRaiseARInterCompanyRequest() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "NPSFinanceApplication");
		app.switchToCreateNewBidFrame();
		app.setInputVal(getContractDataFromPropertyFile("APAdministrator"),RequestRequiredField); //Services
		app.fillDetails(ARInterComPanyCustomerNumber,"CustomerNo","CustomerNumber");
		app.setInputVal(getContractDataFromPropertyFile("ARInterCustomerName"),ARInterComPanyCustomerName); //Services
		app.setInputVal(getContractDataFromPropertyFile("ARInterValue"),ARInterComPanyValue); //Services
		app.setInputVal(getContractDataFromPropertyFile("ARInterDocReference"),ARInterComPanyDocument); //Services
	}

	@And("^I have to raise the AR Journal request$")
	public void setRaiseARJournalRequest() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "NPSFinanceApplication");
		app.switchToCreateNewBidFrame();
		app.setInputVal(getContractDataFromPropertyFile("APAdministrator"),RequestRequiredField); //Services
		app.setInputVal(getContractDataFromPropertyFile("ARJournalCustomerName"),ARJournalCustomerName); //Services
		app.setAccountName(ARJournalAccNumber,"ARJournalAccNo");
		//app.fillDetails(ARJournalAccNumber,"AccNo","ARJournalAccNo");
		app.setInputVal(getContractDataFromPropertyFile("ARJournalAmount"),ARJournalAmount); //Services
		app.setInputVal(getContractDataFromPropertyFile("ARJournalReferenceNumber"),ARJournalReferenceNumber); //Services
		app.setInputVal(getContractDataFromPropertyFile("ARJournalGLCode"),ARJournalGLCode); //Services
	}

	@And("^I have to raise the Group Treasury Transfers request$")
	public void setRaiseGrpTreasuryTransfersRequest() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "NPSFinanceApplication");
		app.switchToCreateNewBidFrame();
		app.setInputVal(getContractDataFromPropertyFile("GrpTreasuryPaymentRequiredBy"),PaymentRequiredBy); //Services
		app.setInputVal(getContractDataFromPropertyFile("RequestEmailId"),RequestEmailId); //Services
		app.setDropDowns(getContractDataFromPropertyFile("LegalEntityFrom"),LegalEntityFromReqField);
		app.setInputVal(getContractDataFromPropertyFile("GrpTreasuryGLCC"),GLCCReqField); //Services
	}

	@And("^I have to raise the Contra Process request$")
	public void setRaiseContraProcessRequest() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "NPSFinanceApplication");
		app.switchToCreateNewBidFrame();
		app.setInputVal(getContractDataFromPropertyFile("ContraProcessReuestDate"),ContraProcessRequestDate); //Services
		app.setInputVal(getContractDataFromPropertyFile("CreditController"),creditControllerRequireField); //Services
		app.setDropDowns(getContractDataFromPropertyFile("RegionFrom"),regionFromRequiredField);
		app.setDropDowns(getContractDataFromPropertyFile("RegionTo"),regionToRequiredField);
		app.setDropDowns(getContractDataFromPropertyFile("LegalEntityFrom"),LegalEntityFromReqField);
		app.setDropDowns(getContractDataFromPropertyFile("LegalEntityTo"),LegalEntityTOReqField);
		app.fillDetails(ContraProcesscustomerNumbers,"No","CustomerNo");
		app.setInputVal(getContractDataFromPropertyFile("ContraProcesscustomerName"),ContraProcesscustomerName); //Services
		app.setInputVal(getContractDataFromPropertyFile("ContraProcessVendorNumbers"),ContraProcessVendorNumbers); //Services
		app.setInputVal(getContractDataFromPropertyFile("ContraProcessVendorName"),ContraProcessVendorName); //Services
		app.setInputVal(getContractDataFromPropertyFile("ContraProcessVendorTotalValue"),ContraProcessVendorTotalValue); //Services
		app.setInputVal(getContractDataFromPropertyFile("ContraProcessCustomerTotalValue"),ContraProcessCustomerTotalValue); //Services
		app.setInputVal(getContractDataFromPropertyFile("ContraProcessTotalContraValue"),ContraProcessTotalContraValue); //Services
	}

	@And("^I have to raise the AP Vendor request$")
	public void setRaiseAPVendorRequest() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "NPSFinanceApplication");
		app.switchToCreateNewBidFrame();
		app.setInputVal(getContractDataFromPropertyFile("APVendorequestor"),RequestRequiredField); //Services
		app.fillDetails(APVendorName,"VendorName:","APVendorName");
		/*app.setInputVal(getContractDataFromPropertyFile("BatchType"),VendorTypeRequired); //Services
		app.setInputVal(getContractDataFromPropertyFile("APBacsPaymentAmount"),AmountRequiredFld);*/ //Services
	}

	@And("^I have to raise the RFPBU Employee request$")
	public void setRaiseRFPBUEmpolyeeRequest() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "NPSFinanceApplication");
		app.switchToCreateNewBidFrame();
		app.setInputVal(getContractDataFromPropertyFile("RFBBUEmployeeRequester"),RequestRequiredField); //Services
		app.fillDetails(PayNameRequiredField,"PayName","PayNameField");
	}

	@And("^I have to raise the AR Refund request$")
	public void setRaiseARRefundRequest() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "NPSFinanceApplication");
		app.switchToCreateNewBidFrame();
		app.setInputVal(getContractDataFromPropertyFile("PaymentRequiredBy"),PaymentRequiredBy); //Services
		app.setInputVal(getContractDataFromPropertyFile("reasonForRequest"),reasonForRequest); //Services
		app.setInputVal(getContractDataFromPropertyFile("ARRefundRequester"),RequesterReqField); //Services
		app.fillDetails(ARRefundCustomerName,"Customer","ARRefundCustomerName");
		app.setInputVal(getContractDataFromPropertyFile("ARRefundAmount"),ARRefundAmountRequiredFld); //Services
		app.setInputVal(getContractDataFromPropertyFile("ARRefundAmountInWords"),ARRefundAmountInWords); //Services
		app.setInputVal(getContractDataFromPropertyFile("ARRefundSortCode"),ARRefundSortCode); //Services
		app.setInputVal(getContractDataFromPropertyFile("ARRefundAccNo"),ARRefundAccNo); //Services
	}

	@And("^I click on the the Save Button$")
	public void iClickTheOnTheSaveButton() throws InterruptedException, IOException {
		NPSFinanceApplicationPageObject app = new NPSFinanceApplicationPageObject();
		app.SaveBtnClick();
		createNewContractCreationPage.WaitForSpecificTime();
	}

	@And("^If alert popup exist then proceed with ok click$")
	public void alertPopupVerify() throws InterruptedException {
		PropertiesPageObject pro = new PropertiesPageObject();
		pro.alertPersentOrNot();
		createNewContractCreationPage.WaitForSpecificTime();
	}

	@And("^Verify the respective Records for current status should be (.*)$")
	public void verifyTheRespectiveRecordsInSignOnForApproval(String CurrentStatus) throws IOException, InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Status");
		homepage.VerifyRecordApprovalType();
		homepage.VerifyApprovalStatus(CurrentStatus);
	}

	@And("^Verify the respective Records for ARInterComapny current status should be (.*)$")
	public void verifyTheRespectiveRecordsForARInterComapny(String CurrentStatus) throws Exception {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Status");
		homepage.VerifyheaderAddedRecordApprovalType();
		homepage.collapseHeader();
		homepage.VerifyHeaderAddedApprovalStatus(CurrentStatus);
	}

	@And("^Verify the respective Records for AP Bacs Payment current status should be (.*)$")
	public void verifyTheRespectiveRecordsForAPBascPayment(String CurrentStatus) throws Exception {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Status");
		homepage.VerifyRecordApprovalTypeAPBascPayment();
		homepage.VerifyApprovalStatus(CurrentStatus);
	}

	@And("^Verify the respective Records for AP Vendor current status should be (.*)$")
	public void verifyTheRespectiveRecordsForAPVendor(String CurrentStatus) throws Exception {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Status");
		homepage.VerifyRecordApprovalTypeAPVendor();
		homepage.VerifyApprovalStatus(CurrentStatus);
	}

	@And("^Verify the header added respective Records for current status should be (.*)$")
	public void verifyTheRespectiveHeaderAddedRecordsInSignOnForApproval(String CurrentStatus) throws Exception {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Status");
		homepage.VerifyheaderAddedRecordApprovalType();
		homepage.VerifyHeaderAddedApprovalStatus(CurrentStatus);
	}

	@And("^Verify the header added respective Records for ARInterCompany current status should be (.*)$")
	public void verifyTheRespectiveHeaderAddedRecordsARInterCompay(String CurrentStatus) throws Exception {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Status");
		homepage.VerifyheaderAddedRecordApprovalType();
		homepage.collapseHeader();
		homepage.VerifyHeaderAddedApprovalStatus(CurrentStatus);
	}

	@And("^Verify the header added respective Records for AR Journal current status should be (.*)$")
	public void verifyTheRespectiveHeaderAddedRecordsARJournal(String CurrentStatus) throws Exception {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Status");
		homepage.VerifyheaderAddedRecordARJournal();
		homepage.collapseHeader();
		//homepage.VerifyHeaderAddedApprovalStatus(CurrentStatus);
	}


	@And("^I click on Respective Records and click on edit button for approver requires$")
	public void iClickOnRespectiveRecordsAndClickOnEditButtonForApproverRequires() throws IOException, InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Records requires Approvers");
		homepage.VerifyRecordsAndClickForEdit();
	}

	@And("^Verify the Current Status of raise request (.*)$")
	public void providedTheRequiredApproversAsApproved(String expectedStatus) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective Approvers provided");
		homepage.verifyCurrentStatus(expectedStatus);
	}

	@And("^Verify the Request Status of raise request (.*)$")
	public void verifyRequestStatus(String expectedStatus) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Verify Request Status");
		homepage.verifyRequestStatus(expectedStatus);
	}

	@And("^Select the required status of raise request (.*)$")
	public void RequiredStatus(String expectedStatus) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective required status");
		homepage.verifyRequiredStatus(expectedStatus);
	}

	@And("^Select the current status of raise request (.*)$")
	public void currntStatus(String expectedStatus) throws InterruptedException {
		PropertiesPageObject homepage = new PropertiesPageObject();
		test.log(Status.INFO, "Respective required status");
		homepage.verifycurrentStatus(expectedStatus);
	}

	@And("^I verify the Raise Request page$")
	public void iVerifyTheRaiseRequestPage() throws InterruptedException {
		NPSFinanceApplicationPageObject invoiceApp = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Raise Request home page");
		createNewContractCreationPage.WaitForSpecificTime();
		Assert.assertTrue(invoiceApp.RaiseRequestPage.isDisplayed(),"Raise request page navigated");
	}
	@And("^I click on Raise request option for billing raise$")
	public void iClickOnRaiseRequestOptionForBillingRaise() throws InterruptedException {
		NPSFinanceApplicationPageObject invoiceApp = new NPSFinanceApplicationPageObject();
		createNewContractCreationPage.WaitForSpecificTime();
		Assert.assertTrue(invoiceApp.raiseRequestLink.isDisplayed(),"Raise request page navigated");
		invoiceApp.raiseRequestLink.click();
	}

	@And("^I verify the Create Invoice page is navigated or not$")
	public void iVerifyTheCreateInvoicePageIsNavigatedOrNot() {
		NPSFinanceApplicationPageObject invoiceApp = new NPSFinanceApplicationPageObject();
		test.log(Status.INFO, "Create Invoice Page");
		Assert.assertTrue(invoiceApp.createInvoice.isDisplayed(),"Create Invoice page navigated");
	}

	@And("^Select the csutomer and CRM id from respective drop down$")
	public void selectTheCsutomerAndCRMIdFromRespectiveDropDown() throws IOException, InterruptedException {
		Thread.sleep(60000);
		NPSFinanceApplicationPageObject invoice = new NPSFinanceApplicationPageObject();
		invoice.selectcustomerDrpDown.click();
		invoice.setCustomerName(getContractDataFromPropertyFile("customerName"));
		Thread.sleep(10000);
		invoice.selectCRMDropDowm.click();
		invoice.setCRMID(getContractDataFromPropertyFile("CRMID"));
	}

	@Given("^I have logged in full permission user model(.*)$")
	public void iHaveLoggedInFullPermissionUserModel(String AdminRights) throws Exception {
		String permission= "AdminRights";
		try {
			if(permission.equals(AdminRights.trim())){
				String Url = createNewContractCreationPage.fullPermission();
				//driver.get();
				driver.navigate().to(Url);
				//Thread.sleep(10000);

			}else {
				String Url = createNewContractCreationPage.TestUser();
				driver.navigate().to(Url);

//				driver.get(Url);
				//Thread.sleep(10000);
				//driver.navigate().refresh();
			}
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			Thread.sleep(10000);
			HomePage homepage = new HomePage();
			sa = new SoftAssert();
			test = rep.createTest("Testing...");
			String expectedtitle = "Contracts - Contracts - All Items";
			String actualtitle = homepage.getPageTitle();
			System.out.println("------------------->actualtitle = " + actualtitle);
			sa.assertEquals(actualtitle, expectedtitle);
			test.log(Status.INFO, "Expected title = " + expectedtitle);
			test.log(Status.INFO, "Actual title = " + actualtitle);
			if (expectedtitle.equals(actualtitle.trim())) {
				test.log(Status.PASS, "Expected and Actual title is a match");
			} else {
				test.log(Status.FAIL, "Expected and Actual title does NOT match");
			}
		}

	}






	@Then("^Verify Archival Logs get created along with status No and Url should not be created$")
	public void verifyArchivalLogsGetCreatedAlongWithStatusNoAndUrlShouldNotBeCreated() {
		//todo;
	}

	@And("^Verify the Archival Status folder Yes and url should get generated\\.$")
	public void verifyTheArchivalStatusFolderYesAndUrlShouldGetGenerated() {
		//todo;
	}


	@And("^verify the records are present or not for this cutomer$")
	public void verifyTheRecordsArePresentOrNotForThisCutomer() {
		NPSFinanceApplicationPageObject invoice = new NPSFinanceApplicationPageObject();
		Assert.assertTrue(invoice.recordchkbox.isDisplayed(),"Records present for selected Customer");
	}

	@And("^I click on the records checkbox and raise the request$")
	public void iClickOnTheRecordsCheckboxAndRaiseTheRequest() throws InterruptedException {
		NPSFinanceApplicationPageObject invoice = new NPSFinanceApplicationPageObject();
		invoice.recordchkbox.click();
		invoice.fetchUnqRefNumbers();
		invoice.raiseInvoiceBtn.click();
	}

	@And("^Verify CRMNumber and Create Invoice$")
	public void verifyCRMNumberAndCreateInvoice() throws IOException, InterruptedException {
		NPSFinanceApplicationPageObject invoice = new NPSFinanceApplicationPageObject();
		invoice.fetchUnqRefNumbersAndActualCrm(getContractDataFromPropertyFile("CRMID"));
		invoice.CreateInvoiceBtn.click();
		invoice.InvoiceSussfullyCreated.isDisplayed();
		Thread.sleep(10000);
		invoice.cllLink.click();
	}
}
