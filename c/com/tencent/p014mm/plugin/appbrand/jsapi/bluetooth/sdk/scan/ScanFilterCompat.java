package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import rk0.C118230k;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat */
public class ScanFilterCompat implements Parcelable {
    public static final Parcelable.Creator<ScanFilterCompat> CREATOR = new C82257a();

    /* renamed from: d */
    public final String f241151d;

    /* renamed from: e */
    public final String f241152e;

    /* renamed from: f */
    public final ParcelUuid f241153f;

    /* renamed from: g */
    public final ParcelUuid f241154g;

    /* renamed from: h */
    public final ParcelUuid f241155h;

    /* renamed from: i */
    public final byte[] f241156i;

    /* renamed from: j */
    public final byte[] f241157j;

    /* renamed from: n */
    public final int f241158n;

    /* renamed from: o */
    public final byte[] f241159o;

    /* renamed from: p */
    public final byte[] f241160p;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat$a */
    public class C82257a implements Parcelable.Creator<ScanFilterCompat> {
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object createFromParcel(android.os.Parcel r17) {
            /*
                r16 = this;
                r0 = r17
                int r1 = r17.readInt()
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L_0x0010
                java.lang.String r1 = r17.readString()
                r5 = r1
                goto L_0x0011
            L_0x0010:
                r5 = r3
            L_0x0011:
                int r1 = r17.readInt()
                if (r1 != r2) goto L_0x003d
                java.lang.String r1 = r17.readString()
                if (r1 == 0) goto L_0x003b
                boolean r4 = android.bluetooth.BluetoothAdapter.checkBluetoothAddress(r1)
                if (r4 == 0) goto L_0x0024
                goto L_0x003b
            L_0x0024:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "invalid device address "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x003b:
                r6 = r1
                goto L_0x003e
            L_0x003d:
                r6 = r3
            L_0x003e:
                int r1 = r17.readInt()
                if (r1 != r2) goto L_0x0068
                java.lang.Class<android.os.ParcelUuid> r1 = android.os.ParcelUuid.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                android.os.Parcelable r1 = r0.readParcelable(r1)
                android.os.ParcelUuid r1 = (android.os.ParcelUuid) r1
                int r4 = r17.readInt()
                if (r4 != r2) goto L_0x0065
                java.lang.Class<android.os.ParcelUuid> r4 = android.os.ParcelUuid.class
                java.lang.ClassLoader r4 = r4.getClassLoader()
                android.os.Parcelable r4 = r0.readParcelable(r4)
                android.os.ParcelUuid r4 = (android.os.ParcelUuid) r4
                r7 = r1
                r8 = r4
                goto L_0x006a
            L_0x0065:
                r7 = r1
                r8 = r3
                goto L_0x006a
            L_0x0068:
                r7 = r3
                r8 = r7
            L_0x006a:
                int r1 = r17.readInt()
                if (r1 != r2) goto L_0x00b5
                java.lang.Class<android.os.ParcelUuid> r1 = android.os.ParcelUuid.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                android.os.Parcelable r1 = r0.readParcelable(r1)
                android.os.ParcelUuid r1 = (android.os.ParcelUuid) r1
                int r4 = r17.readInt()
                if (r4 != r2) goto L_0x00b5
                int r4 = r17.readInt()
                byte[] r4 = new byte[r4]
                r0.readByteArray(r4)
                int r9 = r17.readInt()
                java.lang.String r10 = "serviceDataUuid is null"
                if (r9 != 0) goto L_0x00a0
                if (r1 == 0) goto L_0x009a
                r9 = r1
                r11 = r3
                r10 = r4
                goto L_0x00b8
            L_0x009a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r10)
                throw r0
            L_0x00a0:
                int r9 = r17.readInt()
                byte[] r9 = new byte[r9]
                r0.readByteArray(r9)
                if (r1 == 0) goto L_0x00af
                r10 = r4
                r11 = r9
                r9 = r1
                goto L_0x00b8
            L_0x00af:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r10)
                throw r0
            L_0x00b5:
                r9 = r3
                r10 = r9
                r11 = r10
            L_0x00b8:
                int r1 = r17.readInt()
                int r4 = r17.readInt()
                if (r4 != r2) goto L_0x00f1
                int r2 = r17.readInt()
                byte[] r2 = new byte[r2]
                r0.readByteArray(r2)
                int r4 = r17.readInt()
                java.lang.String r12 = "invalid manufacture id"
                if (r4 != 0) goto L_0x00dc
                if (r1 < 0) goto L_0x00d6
                goto L_0x00e7
            L_0x00d6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r12)
                throw r0
            L_0x00dc:
                int r3 = r17.readInt()
                byte[] r3 = new byte[r3]
                r0.readByteArray(r3)
                if (r1 < 0) goto L_0x00eb
            L_0x00e7:
                r12 = r1
                r13 = r2
                r14 = r3
                goto L_0x00f5
            L_0x00eb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r12)
                throw r0
            L_0x00f1:
                r0 = -1
                r13 = r3
                r14 = r13
                r12 = -1
            L_0x00f5:
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat r0 = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat
                r15 = 0
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat.C82257a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        public Object[] newArray(int i) {
            return new ScanFilterCompat[i];
        }
    }

    public ScanFilterCompat(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, C82257a aVar) {
        this.f241151d = str;
        this.f241153f = parcelUuid;
        this.f241154g = parcelUuid2;
        this.f241152e = str2;
        this.f241155h = parcelUuid3;
        this.f241156i = bArr;
        this.f241157j = bArr2;
        this.f241158n = i;
        this.f241159o = bArr3;
        this.f241160p = bArr4;
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
        ScanFilterCompat scanFilterCompat = (ScanFilterCompat) obj;
        return C118230k.m166791b(this.f241151d, scanFilterCompat.f241151d) && C118230k.m166791b(this.f241152e, scanFilterCompat.f241152e) && this.f241158n == scanFilterCompat.f241158n && C118230k.m166790a(this.f241159o, scanFilterCompat.f241159o) && C118230k.m166790a(this.f241160p, scanFilterCompat.f241160p) && C118230k.m166790a(this.f241155h, scanFilterCompat.f241155h) && C118230k.m166790a(this.f241156i, scanFilterCompat.f241156i) && C118230k.m166790a(this.f241157j, scanFilterCompat.f241157j) && C118230k.m166791b(this.f241153f, scanFilterCompat.f241153f) && C118230k.m166791b(this.f241154g, scanFilterCompat.f241154g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f241151d, this.f241152e, Integer.valueOf(this.f241158n), this.f241159o, this.f241160p, this.f241155h, this.f241156i, this.f241157j, this.f241153f, this.f241154g});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BluetoothLeScanFilter [mDeviceName=");
        sb.append(this.f241151d);
        sb.append(", mDeviceAddress=");
        sb.append(this.f241152e);
        sb.append(", mUuid=");
        sb.append(this.f241153f);
        sb.append(", mUuidMask=");
        sb.append(this.f241154g);
        sb.append(", mServiceDataUuid=");
        ParcelUuid parcelUuid = this.f241155h;
        sb.append(parcelUuid == null ? "null" : parcelUuid.toString());
        sb.append(", mServiceData=");
        sb.append(Arrays.toString(this.f241156i));
        sb.append(", mServiceDataMask=");
        sb.append(Arrays.toString(this.f241157j));
        sb.append(", mManufacturerId=");
        sb.append(this.f241158n);
        sb.append(", mManufacturerData=");
        sb.append(Arrays.toString(this.f241159o));
        sb.append(", mManufacturerDataMask=");
        sb.append(Arrays.toString(this.f241160p));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeInt(this.f241151d == null ? 0 : 1);
        String str = this.f241151d;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f241152e == null ? 0 : 1);
        String str2 = this.f241152e;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.f241153f == null ? 0 : 1);
        ParcelUuid parcelUuid = this.f241153f;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i);
            parcel.writeInt(this.f241154g == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.f241154g;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i);
            }
        }
        parcel.writeInt(this.f241155h == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.f241155h;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i);
            parcel.writeInt(this.f241156i == null ? 0 : 1);
            byte[] bArr = this.f241156i;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f241156i);
                parcel.writeInt(this.f241157j == null ? 0 : 1);
                byte[] bArr2 = this.f241157j;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f241157j);
                }
            }
        }
        parcel.writeInt(this.f241158n);
        parcel.writeInt(this.f241159o == null ? 0 : 1);
        byte[] bArr3 = this.f241159o;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f241159o);
            if (this.f241160p != null) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            byte[] bArr4 = this.f241160p;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f241160p);
            }
        }
    }
}
