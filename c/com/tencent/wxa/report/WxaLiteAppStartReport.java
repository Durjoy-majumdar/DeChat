package com.tencent.wxa.report;

import android.os.Parcel;
import android.os.Parcelable;

public class WxaLiteAppStartReport implements Parcelable {
    public static final Parcelable.Creator<WxaLiteAppStartReport> CREATOR = new C7111a();

    /* renamed from: A */
    public long f25042A;

    /* renamed from: B */
    public long f25043B;

    /* renamed from: C */
    public int f25044C;

    /* renamed from: D */
    public long f25045D;

    /* renamed from: E */
    public long f25046E;

    /* renamed from: F */
    public long f25047F;

    /* renamed from: G */
    public long f25048G;

    /* renamed from: d */
    public String f25049d;

    /* renamed from: e */
    public String f25050e;

    /* renamed from: f */
    public String f25051f;

    /* renamed from: g */
    public boolean f25052g;

    /* renamed from: h */
    public boolean f25053h;

    /* renamed from: i */
    public long f25054i;

    /* renamed from: j */
    public boolean f25055j;

    /* renamed from: n */
    public long f25056n;

    /* renamed from: o */
    public long f25057o;

    /* renamed from: p */
    public boolean f25058p;

    /* renamed from: q */
    public boolean f25059q;

    /* renamed from: r */
    public long f25060r;

    /* renamed from: s */
    public long f25061s;

    /* renamed from: t */
    public boolean f25062t;

    /* renamed from: u */
    public long f25063u;

    /* renamed from: v */
    public long f25064v;

    /* renamed from: w */
    public boolean f25065w;

    /* renamed from: x */
    public long f25066x;

    /* renamed from: y */
    public long f25067y;

    /* renamed from: z */
    public boolean f25068z;

    /* renamed from: com.tencent.wxa.report.WxaLiteAppStartReport$a */
    public class C7111a implements Parcelable.Creator<WxaLiteAppStartReport> {
        public Object createFromParcel(Parcel parcel) {
            return new WxaLiteAppStartReport(parcel);
        }

        public Object[] newArray(int i) {
            return new WxaLiteAppStartReport[i];
        }
    }

    public WxaLiteAppStartReport() {
        this.f25049d = "";
        this.f25050e = "";
        this.f25051f = "";
        this.f25052g = false;
        this.f25053h = false;
        this.f25054i = 0;
        this.f25055j = false;
        this.f25056n = 0;
        this.f25057o = 0;
        this.f25058p = false;
        this.f25059q = false;
        this.f25060r = 0;
        this.f25061s = 0;
        this.f25062t = false;
        this.f25063u = 0;
        this.f25064v = 0;
        this.f25065w = false;
        this.f25066x = 0;
        this.f25067y = 0;
        this.f25068z = false;
        this.f25042A = 0;
        this.f25043B = 0;
        this.f25044C = 0;
        this.f25045D = 0;
        this.f25046E = 0;
        this.f25047F = 0;
        this.f25048G = 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25049d);
        parcel.writeString(this.f25050e);
        parcel.writeString(this.f25051f);
        parcel.writeByte(this.f25052g ? (byte) 1 : 0);
        parcel.writeByte(this.f25053h ? (byte) 1 : 0);
        parcel.writeLong(this.f25054i);
        parcel.writeByte(this.f25055j ? (byte) 1 : 0);
        parcel.writeLong(this.f25056n);
        parcel.writeLong(this.f25057o);
        parcel.writeByte(this.f25058p ? (byte) 1 : 0);
        parcel.writeByte(this.f25059q ? (byte) 1 : 0);
        parcel.writeLong(this.f25060r);
        parcel.writeLong(this.f25061s);
        parcel.writeByte(this.f25062t ? (byte) 1 : 0);
        parcel.writeLong(this.f25063u);
        parcel.writeLong(this.f25064v);
        parcel.writeByte(this.f25065w ? (byte) 1 : 0);
        parcel.writeLong(this.f25066x);
        parcel.writeLong(this.f25067y);
        parcel.writeByte(this.f25068z ? (byte) 1 : 0);
        parcel.writeLong(this.f25042A);
        parcel.writeLong(this.f25043B);
        parcel.writeInt(this.f25044C);
        parcel.writeLong(this.f25045D);
        parcel.writeLong(this.f25046E);
        parcel.writeLong(this.f25047F);
        parcel.writeLong(this.f25048G);
    }

    public WxaLiteAppStartReport(Parcel parcel) {
        this.f25049d = "";
        this.f25050e = "";
        this.f25051f = "";
        boolean z = false;
        this.f25052g = false;
        this.f25053h = false;
        this.f25054i = 0;
        this.f25055j = false;
        this.f25056n = 0;
        this.f25057o = 0;
        this.f25058p = false;
        this.f25059q = false;
        this.f25060r = 0;
        this.f25061s = 0;
        this.f25062t = false;
        this.f25063u = 0;
        this.f25064v = 0;
        this.f25065w = false;
        this.f25066x = 0;
        this.f25067y = 0;
        this.f25068z = false;
        this.f25042A = 0;
        this.f25043B = 0;
        this.f25044C = 0;
        this.f25045D = 0;
        this.f25046E = 0;
        this.f25047F = 0;
        this.f25048G = 0;
        this.f25049d = parcel.readString();
        this.f25050e = parcel.readString();
        this.f25051f = parcel.readString();
        this.f25052g = parcel.readByte() != 0;
        this.f25053h = parcel.readByte() != 0;
        this.f25054i = parcel.readLong();
        this.f25055j = parcel.readByte() != 0;
        this.f25056n = parcel.readLong();
        this.f25057o = parcel.readLong();
        this.f25058p = parcel.readByte() != 0;
        this.f25059q = parcel.readByte() != 0;
        this.f25060r = parcel.readLong();
        this.f25061s = parcel.readLong();
        this.f25062t = parcel.readByte() != 0;
        this.f25063u = parcel.readLong();
        this.f25064v = parcel.readLong();
        this.f25065w = parcel.readByte() != 0;
        this.f25066x = parcel.readLong();
        this.f25067y = parcel.readLong();
        this.f25068z = parcel.readByte() != 0 ? true : z;
        this.f25042A = parcel.readLong();
        this.f25043B = parcel.readLong();
        this.f25044C = parcel.readInt();
        this.f25045D = parcel.readLong();
        this.f25046E = parcel.readLong();
        this.f25047F = parcel.readLong();
        this.f25048G = parcel.readLong();
    }
}
