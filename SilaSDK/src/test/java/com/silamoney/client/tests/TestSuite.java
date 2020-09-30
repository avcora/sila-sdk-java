package com.silamoney.client.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author Karlo Lorenzana
 */
@RunWith(Suite.class)
@SuiteClasses({
    GetBusinessTypesTests.class,
    GetBusinessRolesTests.class,
    GetNaicsCategoriesTest.class,
    GetDocumentTypesTests.class,
    GetEntitiesTests.class,
    CheckHandleTests.class,
    RegisterTests.class,
    RegisterBusinessTests.class,
    LinkBusinessMemberTests.class,
    UnlinkBusinessMemberTests.class,
    RequestKYCTests.class,
    CheckKYCTests.class,
    GetEntityTests.class,
    certifyBeneficialOwnerTests.class,
    CertifyBusinessTests.class,
    LinkAccountTests.class,
    GetAccountsTests.class,
    GetAccountBalanceTests.class,
    IssueSilaTests.class,
    TransferSilaTests.class, 
    RedeemSilaTests.class,
    GetTransactionsTests.class,
    PlaidSameDayAuthTests.class,
    RegisterWalletTests.class,
    GetWalletTests.class,
    GetWalletsTests.class,
    UpdateWalletTests.class,
    DeleteWalletTests.class,
    SilaBalanceTests.class
})
public class TestSuite {}
