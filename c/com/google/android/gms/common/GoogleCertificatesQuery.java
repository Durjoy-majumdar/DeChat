package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleCertificates;
import com.google.android.gms.common.internal.ICertData;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR = new GoogleCertificatesQueryCreator();
    private final String zzbh;
    private final GoogleCertificates.CertData zzbi;
    private final boolean zzbj;

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z) {
        this.zzbh = str;
        this.zzbi = zza(iBinder);
        this.zzbj = z;
    }

    public GoogleCertificatesQuery(String str, GoogleCertificates.CertData certData, boolean z) {
        this.zzbh = str;
        this.zzbi = certData;
        this.zzbj = z;
    }

    private static GoogleCertificates.CertData zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper bytesWrapped = ICertData.Stub.asInterface(iBinder).getBytesWrapped();
            byte[] bArr = bytesWrapped == null ? null : (byte[]) ObjectWrapper.unwrap(bytesWrapped);
            if (bArr != null) {
                return new zzb(bArr);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean getAllowTestKeys() {
        return this.zzbj;
    }

    public IBinder getCallingCertificateBinder() {
        GoogleCertificates.CertData certData = this.zzbi;
        if (certData == null) {
            return null;
        }
        return certData.asBinder();
    }

    public String getCallingPackage() {
        return this.zzbh;
    }

    public GoogleCertificates.CertData getCertificate() {
        return this.zzbi;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getCallingPackage(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, getCallingCertificateBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, getAllowTestKeys());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
