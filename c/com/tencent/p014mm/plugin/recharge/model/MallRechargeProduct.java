package com.tencent.p014mm.plugin.recharge.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.recharge.model.MallRechargeProduct */
public class MallRechargeProduct implements Parcelable {
    public static final Parcelable.Creator<MallRechargeProduct> CREATOR = new C70417a();

    /* renamed from: d */
    public String f203467d;

    /* renamed from: e */
    public String f203468e;

    /* renamed from: f */
    public String f203469f;

    /* renamed from: g */
    public String f203470g;

    /* renamed from: h */
    public String f203471h;

    /* renamed from: i */
    public float f203472i = 0.0f;

    /* renamed from: j */
    public float f203473j = 0.0f;

    /* renamed from: n */
    public boolean f203474n;

    /* renamed from: o */
    public int f203475o;

    /* renamed from: p */
    public int f203476p;

    /* renamed from: q */
    public boolean f203477q;

    /* renamed from: r */
    public int f203478r;

    /* renamed from: s */
    public final boolean f203479s;

    /* renamed from: com.tencent.mm.plugin.recharge.model.MallRechargeProduct$a */
    public class C70417a implements Parcelable.Creator<MallRechargeProduct> {
        public Object createFromParcel(Parcel parcel) {
            return new MallRechargeProduct(parcel);
        }

        public Object[] newArray(int i) {
            return new MallRechargeProduct[i];
        }
    }

    public MallRechargeProduct(boolean z) {
        this.f203479s = z;
    }

    /* renamed from: a */
    public boolean mo96998a() {
        return !this.f203474n || this.f203475o > 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f203467d);
        parcel.writeString(this.f203468e);
        parcel.writeString(this.f203469f);
        parcel.writeString(this.f203470g);
        parcel.writeString(this.f203471h);
        parcel.writeFloat(this.f203472i);
        parcel.writeFloat(this.f203473j);
        parcel.writeInt(this.f203474n ? 1 : 0);
        parcel.writeInt(this.f203475o);
        parcel.writeInt(this.f203476p);
        parcel.writeInt(this.f203477q ? 1 : 0);
        parcel.writeInt(this.f203479s ? 1 : 0);
        parcel.writeInt(this.f203478r);
    }

    public MallRechargeProduct(Parcel parcel) {
        this.f203467d = parcel.readString();
        this.f203468e = parcel.readString();
        this.f203469f = parcel.readString();
        this.f203470g = parcel.readString();
        this.f203471h = parcel.readString();
        this.f203472i = parcel.readFloat();
        this.f203473j = parcel.readFloat();
        boolean z = false;
        this.f203474n = parcel.readInt() == 1;
        this.f203475o = parcel.readInt();
        this.f203476p = parcel.readInt();
        this.f203477q = parcel.readInt() == 1;
        this.f203479s = parcel.readInt() == 1 ? true : z;
        this.f203478r = parcel.readInt();
    }
}
