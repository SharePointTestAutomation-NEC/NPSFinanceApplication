@NPSFinanceTestCases
Feature:Vendor Master Data covers the raise request and process the request to complete.

  Background:
   # Given I have logged into sharepoint

  @TC001_VendorMasterData   #done
  Scenario: Verify to Create Back Order Archival folder for Current month Archival
    Given I have logged in full permission user model AdminRights
    And   I click on Vendor Master Data menu from side bar option
    And   I click on Vendor Master Data
    And   I click on Create button for creating new request
    And   I have to raise the vendor request
    And   I click on the the Save Button
    And   If alert popup exist then proceed with ok click
    And   Verify the respective Records for current status should be Sent for Approval AP
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Sent for Approval AP
    And   Select the required status of raise request Approved
    And   I click on the the Save Button
    And   If alert popup exist then proceed with ok click
    And   Verify the respective Records for current status should be Sent for Approval Finance
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Sent for Approval Finance
    And   Select the required status of raise request Approved
    And   I click on the the Save Button
    And   If alert popup exist then proceed with ok click
    And   Verify the respective Records for current status should be Sent to Master Data Team
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Sent to Master Data Team
    And   Select the required status of raise request Complete
    And   I click on the the Save Button
    And   If alert popup exist then proceed with ok click
    Then  Verify the respective Records for current status should be Complete


  @TC002_APBacsPayment   #done
  Scenario: Verify to Create Back Order Archival folder for Current month Archival
    Given I have logged in full permission user model AdminRights
    And   I click on AP BACS Payment menu from side bar option
    And   I click on AP BACS Payment
    And   I click on Create button for creating new request
    And   I have to raise the AP Bacs Payment request
    And   I click on the the Save Button
    And   Verify the respective Records for AP Bacs Payment current status should be Payment Proposal Created - Refer to AP FM
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Payment Proposal Created - Refer to AP FM
    And   Select the required status of raise request Approved - AP FM
    And   I click on the the Save Button
    And   Verify the respective Records for AP Bacs Payment current status should be Approved - AP FM
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Approved - AP FM
    And   Select the required status of raise request Payment Run File Created
    And   I click on the the Save Button
    And   Verify the respective Records for AP Bacs Payment current status should be Payment Run File Created
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Payment Run File Created
    And   Select the required status of raise request Payment Run Released to Banking System
    And   I click on the the Save Button
    And   Verify the respective Records for AP Bacs Payment current status should be Payment Run Released to Banking System
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Payment Run Released to Banking System
    And   Select the required status of raise request Payment Run Released
    And   I click on the the Save Button
    And   Verify the respective Records for AP Bacs Payment current status should be Payment Run Released
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Payment Run Released
    And   Select the required status of raise request Proof of Payment attached
    And   I click on the the Save Button
    And   Verify the respective Records for AP Bacs Payment current status should be Proof of Payment attached
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Proof of Payment attached
    And   Select the required status of raise request Payment run complete
    And   I click on the the Save Button
    Then  Verify the respective Records for AP Bacs Payment current status should be Payment run complete

  @TC003_APVendor   #done
  Scenario: Verify to Create Back Order Archival folder for Current month Archival
    Given I have logged in full permission user model AdminRights
    And   I click on AP Vendor menu from side bar option
    And   I click on AP Vendor
    And   I click on Create button for creating new request
    And   I have to raise the AP Vendor request
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be Validation
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Validation
    And   Select the current status of raise request Additional Information required - Treasury
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be Additional Information required - Treasury
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Additional Information required - Treasury
    And   Select the current status of raise request Additional information provided - Treasury
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be Additional information provided - Treasury
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Additional information provided - Treasury
    And   Select the current status of raise request B Signatory - Required
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be B Signatory - Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request B Signatory - Required
    And   Select the current status of raise request B Signatory - Awaiting Information
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be B Signatory - Awaiting Information
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request B Signatory - Awaiting Information
    And   Select the current status of raise request Information Attached for B signatory
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be Information Attached for B signatory
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Information Attached for B signatory
    And   Select the current status of raise request B Signatory approved - A Signatory required
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be B Signatory approved - A Signatory required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request B Signatory approved - A Signatory required
    And   Select the current status of raise request A Signatory - Awaiting Information
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be A Signatory - Awaiting Information
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request A Signatory - Awaiting Information
    And   Select the current status of raise request Information Attached for A signatory
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be Information Attached for A signatory
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Information Attached for A signatory
    And   Select the current status of raise request A Signatory - Approved
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be A Signatory - Approved
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request A Signatory - Approved
    And   Select the current status of raise request Payment processed
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be Payment processed
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Payment processed
    And   Select the current status of raise request Payment Released (1) - Banking Confirmation
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be Payment Released (1) - Banking Confirmation
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Payment Released (1) - Banking Confirmation
    And   Select the current status of raise request AP Post and allocate
    And   I click on the the Save Button
    And   Verify the respective Records for AP Vendor current status should be AP Post and allocate
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request AP Post and allocate
    And   Select the current status of raise request Payment complete
    And   I click on the the Save Button
    Then  Verify the respective Records for current status should be Payment complete

  @TC004_ARInterCompany  #done
  Scenario: Verify to Create Back Order Archival folder for Current month Archival
    Given I have logged in full permission user model AdminRights
    And   I click on ARInterCompany Link menu from side bar option
    And   I click on ARInterCompany
    And   I click on Create button for creating new request
    And   I have to raise the AR InterCompany request
    And   I click on the the Save Button
    And   Verify the header added respective Records for ARInterCompany current status should be AR Ico Payment to customer posted
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AR Ico Payment to customer posted
    And   Select the required status of raise request Posting approved
    And   I click on the the Save Button
    And   Verify the header added respective Records for ARInterCompany current status should be Posting approved
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Posting approved
    And   Select the required status of raise request AR ICO Journal Created
    And   I click on the the Save Button
    And   Verify the header added respective Records for ARInterCompany current status should be AR ICO Journal Created
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AR ICO Journal Created
    And   Select the required status of raise request AR OPS Error please review
    And   I click on the the Save Button
    And   Verify the header added respective Records for ARInterCompany current status should be AR OPS Error please review
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AR OPS Error please review
    And   Select the required status of raise request AR ICO Journal Created
    And   I click on the the Save Button
    And   Verify the header added respective Records for ARInterCompany current status should be AR ICO Journal Created
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AR ICO Journal Created
    And   Select the required status of raise request Journal Uploaded
    And   I click on the the Save Button
    And   Verify the header added respective Records for ARInterCompany current status should be Journal Uploaded
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Journal Uploaded
    And   Select the required status of raise request Posting Complete
    And   I click on the the Save Button
    Then  Verify the respective Records for ARInterComapny current status should be Posting Complete

  @TC005_ARJournal  #done
  Scenario: Verify to Create Back Order Archival folder for Current month Archival
    Given I have logged in full permission user model AdminRights
    And   I click on ARJournal Link menu from side bar option
    And   I click on AR Journal
    And   I click on Create button for creating new request
    And   I have to raise the AR Journal request
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be CC Admin WO request
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request CC Admin WO request
    And   Select the required status of raise request CC TM - Approval Required
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be CC TM - Approval Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request CC TM - Approval Required
    And   Select the required status of raise request CC TM - Additional Information Required
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be CC TM - Additional Information Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request CC TM - Additional Information Required
    And   Select the required status of raise request CC TM - Information Attached
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be CC TM - Information Attached
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request CC TM - Information Attached
    And   Select the required status of raise request CC TM - Journal Approved
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be CC TM - Journal Approved
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request CC TM - Journal Approved
    And   Select the required status of raise request AR Ops - Additional Information Required
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be AR Ops - Additional Information Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AR Ops - Additional Information Required
    And   Select the required status of raise request AR Ops - Request Valid
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be AR Ops - Request Valid
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AR Ops - Request Valid
    And   Select the required status of raise request AR TL - OK to Create
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be AR TL - OK to Create
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AR TL - OK to Create
    And   Select the required status of raise request AR OPS - Journal Raised
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be AR OPS - Journal Raised
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AR OPS - Journal Raised
    And   Select the required status of raise request CC - Journal Complete
    And   I click on the the Save Button
    And   Verify the header added respective Records for AR Journal current status should be CC - Journal Complete


  @TC006_ARRefund   #done
  Scenario: Verify to Create Back Order Archival folder for Current month Archival
    Given I have logged in full permission user model AdminRights
    And   I click on AR Refund menu from side bar option
    And   I click on AR Refund
    And   I click on Create button for creating new request
    And   I have to raise the AR Refund request
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be CC TM - Approval Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request CC TM - Approval Required
    And   Select the current status of raise request CC TM - Additional Information Required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be CC TM - Additional Information Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request CC TM - Additional Information Required
    And   Select the current status of raise request CC TM - Information Attached
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be CC TM - Information Attached
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request CC TM - Information Attached
    And   Select the current status of raise request CC TM - Approved - GCM Approval Required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be CC TM - Approved - GCM Approval Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request CC TM - Approved - GCM Approval Required
    And   Select the current status of raise request GCM - Additional Information Required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be GCM - Additional Information Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request GCM - Additional Information Required
    And   Select the current status of raise request GCM - Information Attached
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be GCM - Information Attached
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request GCM - Information Attached
    And   Select the current status of raise request GCM - Approved - GSSD Approval Required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be GCM - Approved - GSSD Approval Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request GCM - Approved - GSSD Approval Required
    And   Select the current status of raise request GSSD – Approved
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be GSSD – Approved
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request GSSD – Approved
    And   Select the current status of raise request B Signatory required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be B Signatory required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request B Signatory required
    And   Select the current status of raise request B Signatory approved - A Signatory required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be B Signatory approved - A Signatory required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request B Signatory approved - A Signatory required
    And   Select the current status of raise request A Signatory - Awaiting Information
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be A Signatory - Awaiting Information
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request A Signatory - Awaiting Information
    And   Select the current status of raise request A Signatory - Approved
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be A Signatory - Approved
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request A Signatory - Approved
    And   Select the current status of raise request Payment processed
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Payment processed
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Payment processed
    And   Select the current status of raise request Payment Released (1) - Banking confirmation
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Payment Released (1) - Banking confirmation
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Payment Released (1) - Banking confirmation
    And   Select the current status of raise request Banking Confirmation - Post payment
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Banking Confirmation - Post payment
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Banking Confirmation - Post payment
    And   Select the current status of raise request Refund Journal Raised
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Refund Journal Raised
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Refund Journal Raised
    And   Select the current status of raise request Refund Journal Complete
    And   I click on the the Save Button
    Then  Verify the respective Records for current status should be Refund Journal Complete


  @TC006_RFPBU  #done
  Scenario: Verify to Create Back Order Archival folder for Current month Archival
    Given I have logged in full permission user model AdminRights
    And   I click on AR Refund menu from side bar option
    And   I click on RFPBUEmployee
    And   I click on Create button for creating new request
    And   I have to raise the RFPBU Employee request
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Validations
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Validations
    And   Select the current status of raise request Additional information
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Additional information
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Additional information
    And   Select the current status of raise request Validation
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Validation
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Validation
    And   Select the current status of raise request Validation Complete - Payroll Approver
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Validation Complete - Payroll Approver
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Validation Complete - Payroll Approver
    And   Select the current status of raise request Awaiting Information - Payroll Approver
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Awaiting Information - Payroll Approver
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Awaiting Information - Payroll Approver
    And   Select the current status of raise request Validation
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Validation
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Validation
    And   Select the current status of raise request B Signatory – Required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be B Signatory – Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request B Signatory – Required
    And   Select the current status of raise request B Signatory approved - A Signatory required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be B Signatory approved - A Signatory required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request B Signatory approved - A Signatory required
    And   Select the current status of raise request A Signatory – Approved
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be A Signatory – Approved
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request A Signatory – Approved
    And   Select the current status of raise request Payment processed
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Payment processed
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Payment processed
    And   Select the current status of raise request Payment Released (1) - Banking confirmation
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Payment Released (1) - Banking confirmation
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Payment Released (1) - Banking confirmation
    And   Select the current status of raise request Payment Released (1) - Banking Confirmation
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Payment Released (1) - Banking Confirmation
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Payment Released (1) - Banking Confirmation
    And   Select the current status of raise request Banking confirmation - Post and Allocate
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Banking confirmation - Post and Allocate
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Request Status of raise request Banking confirmation - Post and Allocate
    And   Select the current status of raise request Payment complete
    And   I click on the the Save Button
    Then  Verify the respective Records for current status should be Payment complete


  @TC007_ContraProcess  #done
  Scenario: Verify to Create Back Order Archival folder for Current month Archival
    Given I have logged in full permission user model AdminRights
    And   I click on contra Process Link menu from side bar option
    And   I click on Contra Process
    And   I click on Create button for creating new request
    And   I have to raise the Contra Process request
    And   I click on the the Save Button
    And   Verify the header added respective Records for current status should be AP - Check Open Items
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AP - Check Open Items
    And   Select the required status of raise request AP - Awaiting Information Invoice Approver
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be AP - Awaiting Information Invoice Approver
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AP - Awaiting Information Invoice Approver
    And   Select the required status of raise request CC Admin Back up needed
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be CC Admin Back up needed
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request CC Admin Back up needed
    And   Select the required status of raise request AP - Check Open Items
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be AP - Check Open Items
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AP - Check Open Items
    And   Select the required status of raise request GCM - Approval Required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be GCM - Approval Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request GCM - Approval Required
    And   Select the required status of raise request GCM - Contra Approved
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be GCM - Contra Approved
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request GCM - Contra Approved
    And   Select the required status of raise request APFM - Contra Approved
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be APFM - Contra Approved
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request APFM - Contra Approved
    And   Select the required status of raise request Payment due from Customer
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Payment due from Customer
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Payment due from Customer
    And   Select the required status of raise request AR - Post Contra Account
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be AR - Post Contra Account
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request AR - Post Contra Account
    And   Select the required status of raise request AP - Posting Complete
    And   I click on the the Save Button
    Then  Verify the respective Records for current status should be AP - Posting Complete

  @TC008_GroupTreasuryTransfers
  Scenario: Verify to Create Back Order Archival folder for Current month Archival
    Given I have logged in full permission user model AdminRights
    And   I click on Group Treasury Transfers Link menu from side bar option
    And   I click on Grp Treasury Transfers
    And   I click on Create button for creating new request
    And   I have to raise the Group Treasury Transfers request
    And   I click on the the Save Button
    And   Verify the header added respective Records for current status should be Validation
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Validation
    And   Select the required status of raise request Treasury Approval
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Treasury Approval
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Treasury Approval
    And   Select the required status of raise request Approved to be processed
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Approved to be processed
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Approved to be processed
    And   Select the required status of raise request B Signatory (1) – Required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be B Signatory (1) – Required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request B Signatory (1) – Required
    And   Select the required status of raise request B Signatory (1) approved - A Signatory (1) required
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be B Signatory (1) approved - A Signatory (1) required
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request B Signatory (1) approved - A Signatory (1) required
    And   Select the required status of raise request A Signatory (1) – Approved
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be A Signatory (1) – Approved
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request A Signatory (1) – Approved
    And   Select the required status of raise request Payment processed
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Payment processed
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Payment processed
    And   Select the required status of raise request Payment Released (1) - Banking Confirmation
    And   I click on the the Save Button
    And   Verify the respective Records for current status should be Payment Released (1) - Banking Confirmation
    And   I click on Respective Records and click on edit button for approver requires
    And   Verify the Current Status of raise request Payment Released (1) - Banking Confirmation
    And   Select the required status of raise request Post and allocate
    And   I click on the the Save Button
    Then  Verify the respective Records for current status should be Post and allocate