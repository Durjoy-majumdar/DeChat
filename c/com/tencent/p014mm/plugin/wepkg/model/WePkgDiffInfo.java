package com.tencent.p014mm.plugin.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wepkg.model.WePkgDiffInfo */
public class WePkgDiffInfo implements Parcelable {
    public static final Parcelable.Creator<WePkgDiffInfo> CREATOR = new C44482a();

    /* renamed from: d */
    public String f120610d;

    /* renamed from: e */
    public String f120611e;

    /* renamed from: f */
    public String f120612f;

    /* renamed from: g */
    public String f120613g;

    /* renamed from: h */
    public String f120614h;

    /* renamed from: i */
    public String f120615i;

    /* renamed from: j */
    public int f120616j;

    /* renamed from: n */
    public int f120617n;

    /* renamed from: com.tencent.mm.plugin.wepkg.model.WePkgDiffInfo$a */
    public class C44482a implements Parcelable.Creator<WePkgDiffInfo> {
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return null;
        }

        public Object[] newArray(int i) {
            return new WePkgDiffInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120610d);
        parcel.writeString(this.f120611e);
        parcel.writeString(this.f120612f);
        parcel.writeString(this.f120613g);
        parcel.writeString(this.f120614h);
        parcel.writeString(this.f120615i);
        parcel.writeInt(this.f120616j);
        parcel.writeInt(this.f120617n);
    }
}
