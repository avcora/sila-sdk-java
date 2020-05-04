package com.silamoney.client.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Object sent in redeem sila method.
 *
 * @author Karlo Lorenzana
 */
public class RedeemMsg {

    @SerializedName("amount")
    private final int amount;

    @SerializedName("account_name")
    private final String accountName;

    @SerializedName("header")
    private final Header header;

    @SerializedName("message")
    private final String message;
    
    @SerializedName("descriptor")
    private final String descriptor;
    
    @SerializedName("business_uuid")
    private final String businessUuid;

    /**
     * Constructor for RedeemMsg object.
     *
     * @param userHandle
     * @param amount
     * @param accountName
     * @param descriptor
     * @param businessUuid
     * @param appHandle
     */
    public RedeemMsg(String userHandle, int amount, String accountName, String descriptor, String businessUuid,
            String appHandle) {
        this.header = new Header(userHandle, appHandle);
        this.amount = amount;
        this.accountName = accountName;
        this.message = Message.ValueEnum.REDEEM_MSG.getValue();
        this.descriptor = descriptor;
        this.businessUuid = businessUuid;
    }
}
