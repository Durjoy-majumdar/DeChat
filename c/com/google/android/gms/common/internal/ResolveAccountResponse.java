package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new ResolveAccountResponseCreator();
    private final int zzal;
    private ConnectionResult zzeu;
    private boolean zzhs;
    private IBinder zzqv;
    private boolean zzuv;

    public ResolveAccountResponse(int i) {
        this(new ConnectionResult(i, (PendingIntent) null));
    }

    public ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.zzal = i;
        this.zzqv = iBinder;
        this.zzeu = connectionResult;
        this.zzhs = z;
        this.zzuv = z2;
    }

    public ResolveAccountResponse(ConnectionResult connectionResult) {
        this(1, (IBinder) null, connectionResult, false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.zzeu.equals(resolveAccountResponse.zzeu) && getAccountAccessor().equals(resolveAccountResponse.getAccountAccessor());
    }

    public IAccountAccessor getAccountAccessor() {
        return IAccountAccessor.Stub.asInterface(this.zzqv);
    }

    public ConnectionResult getConnectionResult() {
        return this.zzeu;
    }

    public boolean getSaveDefaultAccount() {
        return this.zzhs;
    }

    public boolean isFromCrossClientAuth() {
        return this.zzuv;
    }

    public ResolveAccountResponse setAccountAccessor(IAccountAccessor iAccountAccessor) {
        this.zzqv = iAccountAccessor == null ? null : iAccountAccessor.asBinder();
        return this;
    }

    public ResolveAccountResponse setIsFromCrossClientAuth(boolean z) {
        this.zzuv = z;
        return this;
    }

    public ResolveAccountResponse setSaveDefaultAccount(boolean z) {
        this.zzhs = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzal);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzqv, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getConnectionResult(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, getSaveDefaultAccount());
        SafeParcelWriter.writeBoolean(parcel, 5, isFromCrossClientAuth());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
