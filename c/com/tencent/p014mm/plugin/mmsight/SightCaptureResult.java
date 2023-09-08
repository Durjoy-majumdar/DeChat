package com.tencent.p014mm.plugin.mmsight;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C101783gu2;

/* renamed from: com.tencent.mm.plugin.mmsight.SightCaptureResult */
public class SightCaptureResult implements Parcelable {
    public static final Parcelable.Creator<SightCaptureResult> CREATOR = new C69844a();

    /* renamed from: d */
    public boolean f201514d;

    /* renamed from: e */
    public boolean f201515e;

    /* renamed from: f */
    public boolean f201516f;

    /* renamed from: g */
    public String f201517g;

    /* renamed from: h */
    public String f201518h;

    /* renamed from: i */
    public String f201519i;

    /* renamed from: j */
    public String f201520j;

    /* renamed from: n */
    public int f201521n;

    /* renamed from: o */
    public C101783gu2 f201522o;

    /* renamed from: p */
    public String f201523p;

    /* renamed from: com.tencent.mm.plugin.mmsight.SightCaptureResult$a */
    public class C69844a implements Parcelable.Creator<SightCaptureResult> {
        public Object createFromParcel(Parcel parcel) {
            return new SightCaptureResult(parcel);
        }

        public Object[] newArray(int i) {
            return new SightCaptureResult[i];
        }
    }

    public SightCaptureResult(boolean z, String str, String str2, String str3, String str4, int i, C101783gu2 gu22) {
        this.f201514d = false;
        this.f201515e = false;
        this.f201516f = true;
        this.f201517g = "";
        this.f201518h = "";
        this.f201519i = "";
        this.f201520j = "";
        this.f201521n = 0;
        new C101783gu2();
        this.f201523p = "";
        this.f201516f = z;
        this.f201517g = str;
        this.f201518h = str2;
        this.f201519i = str3;
        this.f201521n = i;
        this.f201522o = gu22;
        this.f201520j = str4;
        this.f201514d = true;
        this.f201515e = false;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f201514d ? (byte) 1 : 0);
        parcel.writeByte(this.f201515e ? (byte) 1 : 0);
        parcel.writeByte(this.f201516f ? (byte) 1 : 0);
        parcel.writeString(this.f201517g);
        parcel.writeString(this.f201518h);
        parcel.writeString(this.f201519i);
        parcel.writeString(this.f201520j);
        parcel.writeInt(this.f201521n);
        parcel.writeString(this.f201523p);
        try {
            byte[] byteArray = this.f201522o.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.SightCaptureResult", "write ext info error");
        }
    }

    public SightCaptureResult(boolean z, String str) {
        this.f201514d = false;
        this.f201515e = false;
        this.f201516f = true;
        this.f201517g = "";
        this.f201518h = "";
        this.f201519i = "";
        this.f201520j = "";
        this.f201521n = 0;
        this.f201522o = new C101783gu2();
        this.f201516f = z;
        this.f201523p = str;
        this.f201514d = false;
        this.f201515e = true;
    }

    public SightCaptureResult(Parcel parcel) {
        this.f201514d = false;
        this.f201515e = false;
        this.f201516f = true;
        this.f201517g = "";
        this.f201518h = "";
        this.f201519i = "";
        this.f201520j = "";
        this.f201521n = 0;
        this.f201522o = new C101783gu2();
        this.f201523p = "";
        this.f201514d = parcel.readByte() != 0;
        this.f201515e = parcel.readByte() != 0;
        this.f201516f = parcel.readByte() != 0;
        this.f201517g = parcel.readString();
        this.f201518h = parcel.readString();
        this.f201519i = parcel.readString();
        this.f201520j = parcel.readString();
        this.f201521n = parcel.readInt();
        this.f201523p = parcel.readString();
        try {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            C101783gu2 gu22 = new C101783gu2();
            this.f201522o = gu22;
            gu22.parseFrom(bArr);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SightCaptureResult", "read ext info error: %s", e.getMessage());
        }
    }
}
