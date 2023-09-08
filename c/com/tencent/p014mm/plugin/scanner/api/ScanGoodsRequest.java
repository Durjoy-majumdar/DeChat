package com.tencent.p014mm.plugin.scanner.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.scanner.api.ScanGoodsRequest */
public class ScanGoodsRequest extends BaseScanRequest {
    public static final Parcelable.Creator<ScanGoodsRequest> CREATOR = new C85410a();

    /* renamed from: j */
    public int f248902j;

    /* renamed from: n */
    public int f248903n;

    /* renamed from: o */
    public int f248904o;

    /* renamed from: p */
    public String f248905p;

    /* renamed from: q */
    public String f248906q;

    /* renamed from: r */
    public String f248907r;

    /* renamed from: s */
    public String f248908s;

    /* renamed from: t */
    public int f248909t;

    /* renamed from: u */
    public boolean f248910u;

    /* renamed from: v */
    public boolean f248911v;

    /* renamed from: w */
    public String f248912w;

    /* renamed from: com.tencent.mm.plugin.scanner.api.ScanGoodsRequest$a */
    public class C85410a implements Parcelable.Creator<ScanGoodsRequest> {
        public Object createFromParcel(Parcel parcel) {
            return new ScanGoodsRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new ScanGoodsRequest[i];
        }
    }

    public ScanGoodsRequest() {
        this.f248909t = 0;
        this.f248896d = true;
        this.f248897e = true;
        this.f248898f = true;
        this.f248899g = true;
        this.f248900h = true;
        this.f248910u = true;
        this.f248911v = false;
        this.f248904o = 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f248902j);
        parcel.writeInt(this.f248903n);
        parcel.writeInt(this.f248904o);
        parcel.writeString(this.f248905p);
        parcel.writeString(this.f248906q);
        parcel.writeString(this.f248907r);
        parcel.writeString(this.f248908s);
        parcel.writeInt(this.f248909t);
        parcel.writeByte(this.f248910u ? (byte) 1 : 0);
        parcel.writeByte(this.f248911v ? (byte) 1 : 0);
        parcel.writeString(this.f248912w);
    }

    public ScanGoodsRequest(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.f248909t = 0;
        this.f248910u = true;
        this.f248911v = false;
        this.f248902j = parcel.readInt();
        this.f248903n = parcel.readInt();
        this.f248904o = parcel.readInt();
        this.f248905p = parcel.readString();
        this.f248906q = parcel.readString();
        this.f248907r = parcel.readString();
        this.f248908s = parcel.readString();
        this.f248909t = parcel.readInt();
        this.f248910u = parcel.readByte() != 0;
        this.f248911v = parcel.readByte() != 0 ? true : z;
        this.f248912w = parcel.readString();
    }
}
