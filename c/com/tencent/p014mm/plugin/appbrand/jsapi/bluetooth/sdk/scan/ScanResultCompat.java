package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import rk0.C118230k;
import rk0.C89999m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat */
public class ScanResultCompat implements Parcelable {
    public static final Parcelable.Creator<ScanResultCompat> CREATOR = new C82258a();

    /* renamed from: d */
    public BluetoothDevice f241161d;

    /* renamed from: e */
    public C89999m f241162e;

    /* renamed from: f */
    public int f241163f;

    /* renamed from: g */
    public long f241164g;

    /* renamed from: h */
    public Boolean f241165h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat$a */
    public class C82258a implements Parcelable.Creator<ScanResultCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new ScanResultCompat(parcel, (C82258a) null);
        }

        public Object[] newArray(int i) {
            return new ScanResultCompat[i];
        }
    }

    public ScanResultCompat(ScanResult scanResult) {
        this.f241161d = scanResult.getDevice();
        ScanRecord scanRecord = scanResult.getScanRecord();
        if (scanRecord != null) {
            this.f241162e = C89999m.m112593a(scanRecord.getBytes());
        }
        this.f241163f = scanResult.getRssi();
        this.f241164g = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f241165h = Boolean.valueOf(scanResult.isConnectable());
        } else {
            this.f241165h = null;
        }
    }

    /* renamed from: a */
    public BluetoothDevice mo114648a() {
        BluetoothDevice bluetoothDevice = this.f241161d;
        if (bluetoothDevice != null) {
            return bluetoothDevice;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanResultCompat scanResultCompat = (ScanResultCompat) obj;
        return C118230k.m166791b(this.f241161d, scanResultCompat.f241161d) && this.f241163f == scanResultCompat.f241163f && C118230k.m166791b(this.f241162e, scanResultCompat.f241162e) && this.f241164g == scanResultCompat.f241164g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f241161d, Integer.valueOf(this.f241163f), this.f241162e, Long.valueOf(this.f241164g)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScanResult{mDevice=");
        sb.append(this.f241161d);
        sb.append(", mScanRecord=");
        C89999m mVar = this.f241162e;
        sb.append(mVar == null ? "null" : mVar.toString());
        sb.append(", mRssi=");
        sb.append(this.f241163f);
        sb.append(", mTimestampNanos=");
        sb.append(this.f241164g);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f241161d != null) {
            parcel.writeInt(1);
            this.f241161d.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.f241162e != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.f241162e.f258579g);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f241163f);
        parcel.writeLong(this.f241164g);
        Boolean bool = this.f241165h;
        parcel.writeInt(bool == null ? -1 : bool.booleanValue());
    }

    public ScanResultCompat(Parcel parcel, C82258a aVar) {
        boolean z = true;
        if (parcel.readInt() == 1) {
            this.f241161d = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 1) {
            this.f241162e = C89999m.m112593a(parcel.createByteArray());
        }
        this.f241163f = parcel.readInt();
        this.f241164g = parcel.readLong();
        int readInt = parcel.readInt();
        if (-1 == readInt) {
            this.f241165h = null;
        } else {
            this.f241165h = Boolean.valueOf(1 != readInt ? false : z);
        }
    }
}
