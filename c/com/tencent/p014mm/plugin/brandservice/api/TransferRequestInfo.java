package com.tencent.p014mm.plugin.brandservice.api;

import android.os.Parcel;
import android.os.Parcelable;
import te3.C51018qv3;
import te3.C52129yk2;

/* renamed from: com.tencent.mm.plugin.brandservice.api.TransferRequestInfo */
public class TransferRequestInfo implements Parcelable {
    public static final Parcelable.Creator<TransferRequestInfo> CREATOR = new C40596a();

    /* renamed from: d */
    public int f109024d;

    /* renamed from: e */
    public String f109025e;

    /* renamed from: f */
    public String f109026f;

    /* renamed from: g */
    public String f109027g;

    /* renamed from: h */
    public C52129yk2 f109028h;

    /* renamed from: i */
    public boolean f109029i;

    /* renamed from: j */
    public C51018qv3 f109030j;

    /* renamed from: n */
    public boolean f109031n;

    /* renamed from: o */
    public String f109032o;

    /* renamed from: p */
    public String f109033p;

    /* renamed from: q */
    public boolean f109034q;

    /* renamed from: r */
    public String f109035r;

    /* renamed from: com.tencent.mm.plugin.brandservice.api.TransferRequestInfo$a */
    public class C40596a implements Parcelable.Creator<TransferRequestInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new TransferRequestInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new TransferRequestInfo[i];
        }
    }

    public TransferRequestInfo() {
        this.f109024d = -1;
        this.f109025e = "";
        this.f109026f = "";
        this.f109027g = "";
        this.f109028h = null;
        this.f109029i = false;
        this.f109030j = null;
        this.f109031n = false;
        this.f109032o = null;
        this.f109033p = null;
        this.f109034q = false;
        this.f109035r = null;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[Catch:{ Exception -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[Catch:{ Exception -> 0x005d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            int r4 = r2.f109024d
            r3.writeInt(r4)
            java.lang.String r4 = r2.f109025e
            r3.writeString(r4)
            java.lang.String r4 = r2.f109026f
            r3.writeString(r4)
            java.lang.String r4 = r2.f109027g
            r3.writeString(r4)
            boolean r4 = r2.f109029i
            r3.writeByte(r4)
            boolean r4 = r2.f109031n
            r3.writeByte(r4)
            java.lang.String r4 = r2.f109032o
            r3.writeString(r4)
            boolean r4 = r2.f109034q
            r3.writeByte(r4)
            r4 = 0
            te3.yk2 r0 = r2.f109028h     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x0041
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0041 }
            if (r0 == 0) goto L_0x003e
            int r1 = r0.length     // Catch:{ Exception -> 0x0041 }
            if (r1 <= 0) goto L_0x003e
            int r1 = r0.length     // Catch:{ Exception -> 0x0041 }
            r3.writeInt(r1)     // Catch:{ Exception -> 0x0041 }
            r3.writeByteArray(r0)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0041
        L_0x003e:
            r3.writeInt(r4)     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            boolean r0 = r2.f109029i     // Catch:{ Exception -> 0x005d }
            if (r0 == 0) goto L_0x005d
            te3.qv3 r0 = r2.f109030j     // Catch:{ Exception -> 0x005d }
            if (r0 == 0) goto L_0x005d
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x005d }
            if (r0 == 0) goto L_0x005a
            int r1 = r0.length     // Catch:{ Exception -> 0x005d }
            if (r1 <= 0) goto L_0x005a
            int r4 = r0.length     // Catch:{ Exception -> 0x005d }
            r3.writeInt(r4)     // Catch:{ Exception -> 0x005d }
            r3.writeByteArray(r0)     // Catch:{ Exception -> 0x005d }
            goto L_0x005d
        L_0x005a:
            r3.writeInt(r4)     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            java.lang.String r4 = r2.f109035r
            java.lang.String r0 = ""
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r0)
            r3.writeString(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.api.TransferRequestInfo.writeToParcel(android.os.Parcel, int):void");
    }

    public TransferRequestInfo(Parcel parcel) {
        this.f109024d = -1;
        this.f109025e = "";
        this.f109026f = "";
        this.f109027g = "";
        this.f109028h = null;
        boolean z = false;
        this.f109029i = false;
        this.f109030j = null;
        this.f109031n = false;
        this.f109032o = null;
        this.f109033p = null;
        this.f109034q = false;
        this.f109035r = null;
        this.f109024d = parcel.readInt();
        this.f109025e = parcel.readString();
        this.f109026f = parcel.readString();
        this.f109027g = parcel.readString();
        this.f109029i = parcel.readByte() != 0;
        this.f109031n = parcel.readByte() != 0;
        this.f109032o = parcel.readString();
        this.f109034q = parcel.readByte() != 0 ? true : z;
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                C52129yk2 yk22 = new C52129yk2();
                this.f109028h = yk22;
                yk22.parseFrom(bArr);
            }
        } catch (Exception unused) {
        }
        if (this.f109029i) {
            try {
                int readInt2 = parcel.readInt();
                if (readInt2 > 0) {
                    byte[] bArr2 = new byte[readInt2];
                    parcel.readByteArray(bArr2);
                    C51018qv3 qv32 = new C51018qv3();
                    this.f109030j = qv32;
                    qv32.mo73348f(bArr2);
                }
            } catch (Exception unused2) {
            }
        }
        this.f109035r = parcel.readString();
    }
}
