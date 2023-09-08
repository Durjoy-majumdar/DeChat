package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat */
public class ScanSettingsCompat implements Parcelable {
    public static final Parcelable.Creator<ScanSettingsCompat> CREATOR = new C82259a();

    /* renamed from: d */
    public final int f241166d;

    /* renamed from: e */
    public final int f241167e;

    /* renamed from: f */
    public final long f241168f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat$a */
    public class C82259a implements Parcelable.Creator<ScanSettingsCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new ScanSettingsCompat(parcel, (C82259a) null);
        }

        public Object[] newArray(int i) {
            return new ScanSettingsCompat[i];
        }
    }

    public ScanSettingsCompat(int i, int i2, long j, C82259a aVar) {
        this.f241166d = i;
        this.f241167e = i2;
        this.f241168f = j;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f241166d);
        parcel.writeInt(this.f241167e);
        parcel.writeLong(this.f241168f);
    }

    public ScanSettingsCompat(Parcel parcel, C82259a aVar) {
        this.f241166d = parcel.readInt();
        this.f241167e = parcel.readInt();
        this.f241168f = parcel.readLong();
    }
}
