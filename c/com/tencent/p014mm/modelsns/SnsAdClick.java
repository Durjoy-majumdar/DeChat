package com.tencent.p014mm.modelsns;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.modelsns.SnsAdClick */
public class SnsAdClick implements Parcelable {
    public static final Parcelable.Creator<SnsAdClick> CREATOR = new C92858a();

    /* renamed from: d */
    public int f267469d;

    /* renamed from: e */
    public int f267470e;

    /* renamed from: f */
    public long f267471f;

    /* renamed from: g */
    public int f267472g;

    /* renamed from: h */
    public int f267473h;

    /* renamed from: i */
    public long f267474i;

    /* renamed from: j */
    public int f267475j;

    /* renamed from: n */
    public int f267476n;

    /* renamed from: o */
    public long f267477o;

    /* renamed from: p */
    public long f267478p;

    /* renamed from: q */
    public int f267479q;

    /* renamed from: r */
    public long f267480r;

    /* renamed from: s */
    public long f267481s;

    /* renamed from: t */
    public int f267482t;

    /* renamed from: com.tencent.mm.modelsns.SnsAdClick$a */
    public class C92858a implements Parcelable.Creator<SnsAdClick> {
        public Object createFromParcel(Parcel parcel) {
            SnsAdClick snsAdClick = new SnsAdClick();
            snsAdClick.f267469d = parcel.readInt();
            snsAdClick.f267470e = parcel.readInt();
            snsAdClick.f267471f = parcel.readLong();
            snsAdClick.f267472g = parcel.readInt();
            snsAdClick.f267473h = parcel.readInt();
            snsAdClick.f267475j = parcel.readInt();
            snsAdClick.f267476n = parcel.readInt();
            snsAdClick.f267474i = parcel.readLong();
            snsAdClick.f267478p = parcel.readLong();
            snsAdClick.f267480r = parcel.readLong();
            snsAdClick.f267481s = parcel.readLong();
            snsAdClick.f267482t = parcel.readInt();
            return snsAdClick;
        }

        public Object[] newArray(int i) {
            return new SnsAdClick[i];
        }
    }

    public SnsAdClick() {
        this.f267470e = 0;
        this.f267472g = 0;
        this.f267473h = 0;
        this.f267474i = 0;
        this.f267475j = 0;
        this.f267476n = 0;
        this.f267477o = 0;
        this.f267478p = 0;
        this.f267479q = 0;
        this.f267480r = 0;
        this.f267481s = 0;
        this.f267482t = 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f267469d);
        parcel.writeInt(this.f267470e);
        parcel.writeLong(this.f267471f);
        parcel.writeInt(this.f267472g);
        parcel.writeInt(this.f267473h);
        parcel.writeInt(this.f267475j);
        parcel.writeInt(this.f267476n);
        parcel.writeLong(this.f267474i);
        parcel.writeLong(this.f267478p);
        parcel.writeLong(this.f267480r);
        parcel.writeLong(this.f267481s);
        parcel.writeInt(this.f267482t);
    }

    public SnsAdClick(int i, int i2, long j, int i3, int i4) {
        this(i, i2, j, i3, i4, 0, 0, 0);
    }

    public SnsAdClick(int i, int i2, long j, int i3, int i4, int i5) {
        this(i, i2, j, i3, i4, 0, 0, i5);
    }

    public SnsAdClick(int i, int i2, long j, int i3, int i4, int i5, int i6, int i7) {
        this.f267474i = 0;
        this.f267477o = 0;
        this.f267478p = 0;
        this.f267480r = 0;
        this.f267481s = 0;
        this.f267482t = 0;
        this.f267469d = i;
        this.f267470e = i2;
        this.f267471f = j;
        this.f267472g = i3;
        this.f267473h = i4;
        this.f267475j = i5;
        this.f267476n = i6;
        this.f267479q = i7;
        this.f267474i = System.currentTimeMillis();
    }
}
