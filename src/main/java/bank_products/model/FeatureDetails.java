package bank_products.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "allowOnlineAccountOpen",
        "allowDeposits",
        "allowWithdrawals",
        "allowSavingsGoal",
        "allowBillPay",
        "allowMailCheck",
        "allowCashierCheck",
        "allowCheckbook",
        "allowFreeCheckbook",
        "allowPersonToPerson",
        "allowRemoteDepositCheck",
        "allowWires",
        "allowCardByDefault",
        "allowCardOnRequest",
        "allowNewCardOrder",
        "isCardNetworkAllPoint",
        "isCardInNetwork",
        "allowFreeSavingTransfer",
        "allowOverdraftLineOfCredit",
        "allowCourtesyOverdraft",
        "allowNextDayGrace",
        "allowOverrideOverdraftLimit"
})
public class FeatureDetails {

    @JsonProperty("allowOnlineAccountOpen")
    private boolean allowOnlineAccountOpen;
    @JsonProperty("allowDeposits")
    private boolean allowDeposits;
    @JsonProperty("allowWithdrawals")
    private boolean allowWithdrawals;
    @JsonProperty("allowSavingsGoal")
    private boolean allowSavingsGoal;
    @JsonProperty("allowBillPay")
    private boolean allowBillPay;
    @JsonProperty("allowMailCheck")
    private boolean allowMailCheck;
    @JsonProperty("allowCashierCheck")
    private boolean allowCashierCheck;
    @JsonProperty("allowCheckbook")
    private boolean allowCheckbook;
    @JsonProperty("allowFreeCheckbook")
    private boolean allowFreeCheckbook;
    @JsonProperty("allowPersonToPerson")
    private boolean allowPersonToPerson;
    @JsonProperty("allowRemoteDepositCheck")
    private boolean allowRemoteDepositCheck;
    @JsonProperty("allowWires")
    private boolean allowWires;
    @JsonProperty("allowCardByDefault")
    private boolean allowCardByDefault;
    @JsonProperty("allowCardOnRequest")
    private boolean allowCardOnRequest;
    @JsonProperty("allowNewCardOrder")
    private boolean allowNewCardOrder;
    @JsonProperty("isCardNetworkAllPoint")
    private boolean isCardNetworkAllPoint;
    @JsonProperty("isCardInNetwork")
    private boolean isCardInNetwork;
    @JsonProperty("allowFreeSavingTransfer")
    private boolean allowFreeSavingTransfer;
    @JsonProperty("allowOverdraftLineOfCredit")
    private boolean allowOverdraftLineOfCredit;
    @JsonProperty("allowCourtesyOverdraft")
    private boolean allowCourtesyOverdraft;
    @JsonProperty("allowNextDayGrace")
    private boolean allowNextDayGrace;
    @JsonProperty("allowOverrideOverdraftLimit")
    private boolean allowOverrideOverdraftLimit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * No args constructor for use in serialization
     */
    public FeatureDetails() {
    }

    /**
     * @param allowNextDayGrace
     * @param allowCheckbook
     * @param isCardNetworkAllPoint
     * @param allowCardByDefault
     * @param allowCardOnRequest
     * @param allowCourtesyOverdraft
     * @param allowOnlineAccountOpen
     * @param allowDeposits
     * @param isCardInNetwork
     * @param allowFreeCheckbook
     * @param allowWithdrawals
     * @param allowFreeSavingTransfer
     * @param allowSavingsGoal
     * @param allowRemoteDepositCheck
     * @param allowBillPay
     * @param allowWires
     * @param allowPersonToPerson
     * @param allowMailCheck
     * @param allowNewCardOrder
     * @param allowCashierCheck
     * @param allowOverdraftLineOfCredit
     * @param allowOverrideOverdraftLimit
     */
    public FeatureDetails(boolean allowOnlineAccountOpen, boolean allowDeposits, boolean allowWithdrawals, boolean allowSavingsGoal, boolean allowBillPay, boolean allowMailCheck, boolean allowCashierCheck, boolean allowCheckbook, boolean allowFreeCheckbook, boolean allowPersonToPerson, boolean allowRemoteDepositCheck, boolean allowWires, boolean allowCardByDefault, boolean allowCardOnRequest, boolean allowNewCardOrder, boolean isCardNetworkAllPoint, boolean isCardInNetwork, boolean allowFreeSavingTransfer, boolean allowOverdraftLineOfCredit, boolean allowCourtesyOverdraft, boolean allowNextDayGrace, boolean allowOverrideOverdraftLimit) {
        super();
        this.allowOnlineAccountOpen = allowOnlineAccountOpen;
        this.allowDeposits = allowDeposits;
        this.allowWithdrawals = allowWithdrawals;
        this.allowSavingsGoal = allowSavingsGoal;
        this.allowBillPay = allowBillPay;
        this.allowMailCheck = allowMailCheck;
        this.allowCashierCheck = allowCashierCheck;
        this.allowCheckbook = allowCheckbook;
        this.allowFreeCheckbook = allowFreeCheckbook;
        this.allowPersonToPerson = allowPersonToPerson;
        this.allowRemoteDepositCheck = allowRemoteDepositCheck;
        this.allowWires = allowWires;
        this.allowCardByDefault = allowCardByDefault;
        this.allowCardOnRequest = allowCardOnRequest;
        this.allowNewCardOrder = allowNewCardOrder;
        this.isCardNetworkAllPoint = isCardNetworkAllPoint;
        this.isCardInNetwork = isCardInNetwork;
        this.allowFreeSavingTransfer = allowFreeSavingTransfer;
        this.allowOverdraftLineOfCredit = allowOverdraftLineOfCredit;
        this.allowCourtesyOverdraft = allowCourtesyOverdraft;
        this.allowNextDayGrace = allowNextDayGrace;
        this.allowOverrideOverdraftLimit = allowOverrideOverdraftLimit;
    }

    @JsonProperty("allowOnlineAccountOpen")
    public boolean isAllowOnlineAccountOpen() {
        return allowOnlineAccountOpen;
    }

    @JsonProperty("allowOnlineAccountOpen")
    public void setAllowOnlineAccountOpen(boolean allowOnlineAccountOpen) {
        this.allowOnlineAccountOpen = allowOnlineAccountOpen;
    }

    @JsonProperty("allowDeposits")
    public boolean isAllowDeposits() {
        return allowDeposits;
    }

    @JsonProperty("allowDeposits")
    public void setAllowDeposits(boolean allowDeposits) {
        this.allowDeposits = allowDeposits;
    }

    @JsonProperty("allowWithdrawals")
    public boolean isAllowWithdrawals() {
        return allowWithdrawals;
    }

    @JsonProperty("allowWithdrawals")
    public void setAllowWithdrawals(boolean allowWithdrawals) {
        this.allowWithdrawals = allowWithdrawals;
    }

    @JsonProperty("allowSavingsGoal")
    public boolean isAllowSavingsGoal() {
        return allowSavingsGoal;
    }

    @JsonProperty("allowSavingsGoal")
    public void setAllowSavingsGoal(boolean allowSavingsGoal) {
        this.allowSavingsGoal = allowSavingsGoal;
    }

    @JsonProperty("allowBillPay")
    public boolean isAllowBillPay() {
        return allowBillPay;
    }

    @JsonProperty("allowBillPay")
    public void setAllowBillPay(boolean allowBillPay) {
        this.allowBillPay = allowBillPay;
    }

    @JsonProperty("allowMailCheck")
    public boolean isAllowMailCheck() {
        return allowMailCheck;
    }

    @JsonProperty("allowMailCheck")
    public void setAllowMailCheck(boolean allowMailCheck) {
        this.allowMailCheck = allowMailCheck;
    }

    @JsonProperty("allowCashierCheck")
    public boolean isAllowCashierCheck() {
        return allowCashierCheck;
    }

    @JsonProperty("allowCashierCheck")
    public void setAllowCashierCheck(boolean allowCashierCheck) {
        this.allowCashierCheck = allowCashierCheck;
    }

    @JsonProperty("allowCheckbook")
    public boolean isAllowCheckbook() {
        return allowCheckbook;
    }

    @JsonProperty("allowCheckbook")
    public void setAllowCheckbook(boolean allowCheckbook) {
        this.allowCheckbook = allowCheckbook;
    }

    @JsonProperty("allowFreeCheckbook")
    public boolean isAllowFreeCheckbook() {
        return allowFreeCheckbook;
    }

    @JsonProperty("allowFreeCheckbook")
    public void setAllowFreeCheckbook(boolean allowFreeCheckbook) {
        this.allowFreeCheckbook = allowFreeCheckbook;
    }

    @JsonProperty("allowPersonToPerson")
    public boolean isAllowPersonToPerson() {
        return allowPersonToPerson;
    }

    @JsonProperty("allowPersonToPerson")
    public void setAllowPersonToPerson(boolean allowPersonToPerson) {
        this.allowPersonToPerson = allowPersonToPerson;
    }

    @JsonProperty("allowRemoteDepositCheck")
    public boolean isAllowRemoteDepositCheck() {
        return allowRemoteDepositCheck;
    }

    @JsonProperty("allowRemoteDepositCheck")
    public void setAllowRemoteDepositCheck(boolean allowRemoteDepositCheck) {
        this.allowRemoteDepositCheck = allowRemoteDepositCheck;
    }

    @JsonProperty("allowWires")
    public boolean isAllowWires() {
        return allowWires;
    }

    @JsonProperty("allowWires")
    public void setAllowWires(boolean allowWires) {
        this.allowWires = allowWires;
    }

    @JsonProperty("allowCardByDefault")
    public boolean isAllowCardByDefault() {
        return allowCardByDefault;
    }

    @JsonProperty("allowCardByDefault")
    public void setAllowCardByDefault(boolean allowCardByDefault) {
        this.allowCardByDefault = allowCardByDefault;
    }

    @JsonProperty("allowCardOnRequest")
    public boolean isAllowCardOnRequest() {
        return allowCardOnRequest;
    }

    @JsonProperty("allowCardOnRequest")
    public void setAllowCardOnRequest(boolean allowCardOnRequest) {
        this.allowCardOnRequest = allowCardOnRequest;
    }

    @JsonProperty("allowNewCardOrder")
    public boolean isAllowNewCardOrder() {
        return allowNewCardOrder;
    }

    @JsonProperty("allowNewCardOrder")
    public void setAllowNewCardOrder(boolean allowNewCardOrder) {
        this.allowNewCardOrder = allowNewCardOrder;
    }

    @JsonProperty("isCardNetworkAllPoint")
    public boolean isIsCardNetworkAllPoint() {
        return isCardNetworkAllPoint;
    }

    @JsonProperty("isCardNetworkAllPoint")
    public void setIsCardNetworkAllPoint(boolean isCardNetworkAllPoint) {
        this.isCardNetworkAllPoint = isCardNetworkAllPoint;
    }

    @JsonProperty("isCardInNetwork")
    public boolean isIsCardInNetwork() {
        return isCardInNetwork;
    }

    @JsonProperty("isCardInNetwork")
    public void setIsCardInNetwork(boolean isCardInNetwork) {
        this.isCardInNetwork = isCardInNetwork;
    }

    @JsonProperty("allowFreeSavingTransfer")
    public boolean isAllowFreeSavingTransfer() {
        return allowFreeSavingTransfer;
    }

    @JsonProperty("allowFreeSavingTransfer")
    public void setAllowFreeSavingTransfer(boolean allowFreeSavingTransfer) {
        this.allowFreeSavingTransfer = allowFreeSavingTransfer;
    }

    @JsonProperty("allowOverdraftLineOfCredit")
    public boolean isAllowOverdraftLineOfCredit() {
        return allowOverdraftLineOfCredit;
    }

    @JsonProperty("allowOverdraftLineOfCredit")
    public void setAllowOverdraftLineOfCredit(boolean allowOverdraftLineOfCredit) {
        this.allowOverdraftLineOfCredit = allowOverdraftLineOfCredit;
    }

    @JsonProperty("allowCourtesyOverdraft")
    public boolean isAllowCourtesyOverdraft() {
        return allowCourtesyOverdraft;
    }

    @JsonProperty("allowCourtesyOverdraft")
    public void setAllowCourtesyOverdraft(boolean allowCourtesyOverdraft) {
        this.allowCourtesyOverdraft = allowCourtesyOverdraft;
    }

    @JsonProperty("allowNextDayGrace")
    public boolean isAllowNextDayGrace() {
        return allowNextDayGrace;
    }

    @JsonProperty("allowNextDayGrace")
    public void setAllowNextDayGrace(boolean allowNextDayGrace) {
        this.allowNextDayGrace = allowNextDayGrace;
    }

    @JsonProperty("allowOverrideOverdraftLimit")
    public boolean isAllowOverrideOverdraftLimit() {
        return allowOverrideOverdraftLimit;
    }

    @JsonProperty("allowOverrideOverdraftLimit")
    public void setAllowOverrideOverdraftLimit(boolean allowOverrideOverdraftLimit) {
        this.allowOverrideOverdraftLimit = allowOverrideOverdraftLimit;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FeatureDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allowOnlineAccountOpen");
        sb.append('=');
        sb.append(this.allowOnlineAccountOpen);
        sb.append(',');
        sb.append("allowDeposits");
        sb.append('=');
        sb.append(this.allowDeposits);
        sb.append(',');
        sb.append("allowWithdrawals");
        sb.append('=');
        sb.append(this.allowWithdrawals);
        sb.append(',');
        sb.append("allowSavingsGoal");
        sb.append('=');
        sb.append(this.allowSavingsGoal);
        sb.append(',');
        sb.append("allowBillPay");
        sb.append('=');
        sb.append(this.allowBillPay);
        sb.append(',');
        sb.append("allowMailCheck");
        sb.append('=');
        sb.append(this.allowMailCheck);
        sb.append(',');
        sb.append("allowCashierCheck");
        sb.append('=');
        sb.append(this.allowCashierCheck);
        sb.append(',');
        sb.append("allowCheckbook");
        sb.append('=');
        sb.append(this.allowCheckbook);
        sb.append(',');
        sb.append("allowFreeCheckbook");
        sb.append('=');
        sb.append(this.allowFreeCheckbook);
        sb.append(',');
        sb.append("allowPersonToPerson");
        sb.append('=');
        sb.append(this.allowPersonToPerson);
        sb.append(',');
        sb.append("allowRemoteDepositCheck");
        sb.append('=');
        sb.append(this.allowRemoteDepositCheck);
        sb.append(',');
        sb.append("allowWires");
        sb.append('=');
        sb.append(this.allowWires);
        sb.append(',');
        sb.append("allowCardByDefault");
        sb.append('=');
        sb.append(this.allowCardByDefault);
        sb.append(',');
        sb.append("allowCardOnRequest");
        sb.append('=');
        sb.append(this.allowCardOnRequest);
        sb.append(',');
        sb.append("allowNewCardOrder");
        sb.append('=');
        sb.append(this.allowNewCardOrder);
        sb.append(',');
        sb.append("isCardNetworkAllPoint");
        sb.append('=');
        sb.append(this.isCardNetworkAllPoint);
        sb.append(',');
        sb.append("isCardInNetwork");
        sb.append('=');
        sb.append(this.isCardInNetwork);
        sb.append(',');
        sb.append("allowFreeSavingTransfer");
        sb.append('=');
        sb.append(this.allowFreeSavingTransfer);
        sb.append(',');
        sb.append("allowOverdraftLineOfCredit");
        sb.append('=');
        sb.append(this.allowOverdraftLineOfCredit);
        sb.append(',');
        sb.append("allowCourtesyOverdraft");
        sb.append('=');
        sb.append(this.allowCourtesyOverdraft);
        sb.append(',');
        sb.append("allowNextDayGrace");
        sb.append('=');
        sb.append(this.allowNextDayGrace);
        sb.append(',');
        sb.append("allowOverrideOverdraftLimit");
        sb.append('=');
        sb.append(this.allowOverrideOverdraftLimit);
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + (this.allowNextDayGrace ? 1 : 0));
        result = ((result * 31) + (this.allowCheckbook ? 1 : 0));
        result = ((result * 31) + (this.isCardNetworkAllPoint ? 1 : 0));
        result = ((result * 31) + (this.allowCardByDefault ? 1 : 0));
        result = ((result * 31) + (this.allowCardOnRequest ? 1 : 0));
        result = ((result * 31) + (this.allowCourtesyOverdraft ? 1 : 0));
        result = ((result * 31) + (this.allowOnlineAccountOpen ? 1 : 0));
        result = ((result * 31) + (this.allowDeposits ? 1 : 0));
        result = ((result * 31) + (this.isCardInNetwork ? 1 : 0));
        result = ((result * 31) + (this.allowFreeCheckbook ? 1 : 0));
        result = ((result * 31) + (this.allowWithdrawals ? 1 : 0));
        result = ((result * 31) + (this.allowFreeSavingTransfer ? 1 : 0));
        result = ((result * 31) + (this.allowSavingsGoal ? 1 : 0));
        result = ((result * 31) + (this.allowRemoteDepositCheck ? 1 : 0));
        result = ((result * 31) + (this.allowBillPay ? 1 : 0));
        result = ((result * 31) + (this.allowWires ? 1 : 0));
        result = ((result * 31) + (this.allowPersonToPerson ? 1 : 0));
        result = ((result * 31) + (this.allowMailCheck ? 1 : 0));
        result = ((result * 31) + (this.allowNewCardOrder ? 1 : 0));
        result = ((result * 31) + (this.allowCashierCheck ? 1 : 0));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + (this.allowOverdraftLineOfCredit ? 1 : 0));
        result = ((result * 31) + (this.allowOverrideOverdraftLimit ? 1 : 0));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FeatureDetails)) {
            return false;
        }
        FeatureDetails rhs = ((FeatureDetails) other);
        return (((((((((((((((((((((((this.allowNextDayGrace == rhs.allowNextDayGrace) && (this.allowCheckbook == rhs.allowCheckbook)) && (this.isCardNetworkAllPoint == rhs.isCardNetworkAllPoint)) && (this.allowCardByDefault == rhs.allowCardByDefault)) && (this.allowCardOnRequest == rhs.allowCardOnRequest)) && (this.allowCourtesyOverdraft == rhs.allowCourtesyOverdraft)) && (this.allowOnlineAccountOpen == rhs.allowOnlineAccountOpen)) && (this.allowDeposits == rhs.allowDeposits)) && (this.isCardInNetwork == rhs.isCardInNetwork)) && (this.allowFreeCheckbook == rhs.allowFreeCheckbook)) && (this.allowWithdrawals == rhs.allowWithdrawals)) && (this.allowFreeSavingTransfer == rhs.allowFreeSavingTransfer)) && (this.allowSavingsGoal == rhs.allowSavingsGoal)) && (this.allowRemoteDepositCheck == rhs.allowRemoteDepositCheck)) && (this.allowBillPay == rhs.allowBillPay)) && (this.allowWires == rhs.allowWires)) && (this.allowPersonToPerson == rhs.allowPersonToPerson)) && (this.allowMailCheck == rhs.allowMailCheck)) && (this.allowNewCardOrder == rhs.allowNewCardOrder)) && (this.allowCashierCheck == rhs.allowCashierCheck)) && (Objects.equals(this.additionalProperties, rhs.additionalProperties))) && (this.allowOverdraftLineOfCredit == rhs.allowOverdraftLineOfCredit)) && (this.allowOverrideOverdraftLimit == rhs.allowOverrideOverdraftLimit));
    }

}
