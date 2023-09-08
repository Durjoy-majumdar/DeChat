package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zze();
    private final int zzh;
    @Deprecated
    private String zzj;
    private int zzl;
    private Account zzn;

    public AccountChangeEventsRequest() {
        this.zzh = 1;
    }

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.zzh = i;
        this.zzl = i2;
        this.zzj = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.zzn = account;
        } else {
            this.zzn = new Account(str, "com.google");
        }
    }

    public Account getAccount() {
        return this.zzn;
    }

    @Deprecated
    public String getAccountName() {
        return this.zzj;
    }

    public int getEventIndex() {
        return this.zzl;
    }

    public AccountChangeEventsRequest setAccount(Account account) {
        this.zzn = account;
        return this;
    }

    @Deprecated
    public AccountChangeEventsRequest setAccountName(String str) {
        this.zzj = str;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int i) {
        this.zzl = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzh);
        SafeParcelWriter.writeInt(parcel, 2, this.zzl);
        SafeParcelWriter.writeString(parcel, 3, this.zzj, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzn, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
