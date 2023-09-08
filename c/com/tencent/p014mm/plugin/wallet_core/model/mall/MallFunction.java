package com.tencent.p014mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.mall.MallFunction */
public class MallFunction implements Parcelable {
    public static final Parcelable.Creator<MallFunction> CREATOR = new C72196a();

    /* renamed from: d */
    public String f209731d;

    /* renamed from: e */
    public String f209732e;

    /* renamed from: f */
    public String f209733f;

    /* renamed from: g */
    public String f209734g;

    /* renamed from: h */
    public String f209735h;

    /* renamed from: i */
    public String f209736i;

    /* renamed from: j */
    public String f209737j;

    /* renamed from: n */
    public ArrayList<String> f209738n;

    /* renamed from: o */
    public MallNews f209739o;

    /* renamed from: p */
    public int f209740p;

    /* renamed from: q */
    public String f209741q;

    /* renamed from: r */
    public int f209742r = 0;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.mall.MallFunction$a */
    public class C72196a implements Parcelable.Creator<MallFunction> {
        public Object createFromParcel(Parcel parcel) {
            return new MallFunction(parcel);
        }

        public Object[] newArray(int i) {
            return new MallFunction[i];
        }
    }

    public MallFunction() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f209731d);
        parcel.writeString(this.f209732e);
        parcel.writeString(this.f209733f);
        parcel.writeString(this.f209734g);
        parcel.writeString(this.f209735h);
        parcel.writeString(this.f209736i);
        parcel.writeString(this.f209737j);
        parcel.writeStringList(this.f209738n);
        parcel.writeParcelable(this.f209739o, i);
        parcel.writeInt(this.f209740p);
        parcel.writeString(this.f209741q);
        parcel.writeInt(this.f209742r);
    }

    public MallFunction(Parcel parcel) {
        this.f209731d = parcel.readString();
        this.f209732e = parcel.readString();
        this.f209733f = parcel.readString();
        this.f209734g = parcel.readString();
        this.f209735h = parcel.readString();
        this.f209736i = parcel.readString();
        this.f209737j = parcel.readString();
        ArrayList<String> arrayList = new ArrayList<>();
        this.f209738n = arrayList;
        parcel.readStringList(arrayList);
        this.f209739o = (MallNews) parcel.readParcelable(MallNews.class.getClassLoader());
        this.f209740p = parcel.readInt();
        this.f209741q = parcel.readString();
        this.f209742r = parcel.readInt();
    }
}
