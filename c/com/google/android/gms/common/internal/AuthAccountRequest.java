package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new AuthAccountRequestCreator();
    private final int zzal;
    @Deprecated
    private final IBinder zzqv;
    private final Scope[] zzqw;
    private Integer zzqx;
    private Integer zzqy;
    private Account zzs;

    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.zzal = i;
        this.zzqv = iBinder;
        this.zzqw = scopeArr;
        this.zzqx = num;
        this.zzqy = num2;
        this.zzs = account;
    }

    public AuthAccountRequest(Account account, Set<Scope> set) {
        this(3, (IBinder) null, (Scope[]) set.toArray(new Scope[set.size()]), (Integer) null, (Integer) null, (Account) Preconditions.checkNotNull(account));
    }

    @Deprecated
    public AuthAccountRequest(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        this(3, iAccountAccessor.asBinder(), (Scope[]) set.toArray(new Scope[set.size()]), (Integer) null, (Integer) null, (Account) null);
    }

    public Account getAccount() {
        Account account = this.zzs;
        if (account != null) {
            return account;
        }
        IBinder iBinder = this.zzqv;
        if (iBinder != null) {
            return AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder));
        }
        return null;
    }

    public Integer getOauthPolicy() {
        return this.zzqx;
    }

    public Integer getPolicyAction() {
        return this.zzqy;
    }

    public Set<Scope> getScopes() {
        return new HashSet(Arrays.asList(this.zzqw));
    }

    public AuthAccountRequest setOauthPolicy(Integer num) {
        this.zzqx = num;
        return this;
    }

    public AuthAccountRequest setPolicyAction(Integer num) {
        this.zzqy = num;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzal);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzqv, false);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzqw, i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 4, this.zzqx, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, this.zzqy, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzs, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
