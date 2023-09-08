package com.tencent.p014mm.plugin.setting.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.setting.model.SwitchAccountModel */
public class SwitchAccountModel implements Parcelable {
    public static final Parcelable.Creator<SwitchAccountModel> CREATOR = new C85416a();

    /* renamed from: d */
    public final String f248934d;

    /* renamed from: e */
    public final String f248935e;

    /* renamed from: f */
    public final String f248936f;

    /* renamed from: g */
    public final String f248937g;

    /* renamed from: h */
    public final int f248938h;

    /* renamed from: i */
    public final String f248939i;

    /* renamed from: com.tencent.mm.plugin.setting.model.SwitchAccountModel$a */
    public class C85416a implements Parcelable.Creator<SwitchAccountModel> {
        public Object createFromParcel(Parcel parcel) {
            return new SwitchAccountModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new SwitchAccountModel[i];
        }
    }

    public SwitchAccountModel(String str, String str2, String str3, String str4, int i, String str5) {
        this.f248934d = str;
        this.f248935e = str2;
        this.f248936f = str3;
        this.f248937g = str4;
        this.f248938h = i;
        this.f248939i = str5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f248934d);
        parcel.writeString(this.f248935e);
        parcel.writeString(this.f248936f);
        parcel.writeString(this.f248937g);
        parcel.writeInt(this.f248938h);
        parcel.writeString(this.f248939i);
    }
}
