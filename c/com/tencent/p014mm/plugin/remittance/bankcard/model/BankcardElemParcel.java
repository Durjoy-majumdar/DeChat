package com.tencent.p014mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import te3.C49674h90;
import te3.C51360t9;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel */
public class BankcardElemParcel implements Parcelable {
    public static final Parcelable.Creator<BankcardElemParcel> CREATOR = new C42806a();

    /* renamed from: d */
    public String f115895d;

    /* renamed from: e */
    public String f115896e;

    /* renamed from: f */
    public String f115897f;

    /* renamed from: g */
    public int f115898g;

    /* renamed from: h */
    public int f115899h;

    /* renamed from: i */
    public String f115900i;

    /* renamed from: j */
    public String f115901j;

    /* renamed from: n */
    public String f115902n;

    /* renamed from: o */
    public ArrayList<EnterTimeParcel> f115903o;

    /* renamed from: p */
    public String f115904p;

    /* renamed from: q */
    public long f115905q;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel$a */
    public class C42806a implements Parcelable.Creator<BankcardElemParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new BankcardElemParcel(parcel);
        }

        public Object[] newArray(int i) {
            return new BankcardElemParcel[i];
        }
    }

    public BankcardElemParcel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115895d);
        parcel.writeString(this.f115896e);
        parcel.writeString(this.f115897f);
        parcel.writeInt(this.f115898g);
        parcel.writeInt(this.f115899h);
        parcel.writeTypedList(this.f115903o);
        parcel.writeString(this.f115900i);
        parcel.writeString(this.f115901j);
        parcel.writeString(this.f115902n);
        parcel.writeString(this.f115904p);
        parcel.writeLong(this.f115905q);
    }

    public BankcardElemParcel(C51360t9 t9Var) {
        this.f115895d = t9Var.f142039d;
        this.f115896e = t9Var.f142040e;
        this.f115897f = t9Var.f142041f;
        this.f115898g = t9Var.f142042g;
        this.f115899h = t9Var.f142043h;
        this.f115900i = t9Var.f142045j;
        this.f115901j = t9Var.f142046n;
        this.f115902n = t9Var.f142047o;
        this.f115903o = new ArrayList<>();
        Iterator<C49674h90> it = t9Var.f142044i.iterator();
        while (it.hasNext()) {
            this.f115903o.add(new EnterTimeParcel(it.next()));
        }
        this.f115904p = t9Var.f142049q;
        this.f115905q = t9Var.f142050r;
    }

    public BankcardElemParcel(Parcel parcel) {
        this.f115895d = parcel.readString();
        this.f115896e = parcel.readString();
        this.f115897f = parcel.readString();
        this.f115898g = parcel.readInt();
        this.f115899h = parcel.readInt();
        ArrayList<EnterTimeParcel> arrayList = new ArrayList<>();
        this.f115903o = arrayList;
        parcel.readTypedList(arrayList, EnterTimeParcel.CREATOR);
        this.f115900i = parcel.readString();
        this.f115901j = parcel.readString();
        this.f115902n = parcel.readString();
        this.f115904p = parcel.readString();
        this.f115905q = parcel.readLong();
    }
}
