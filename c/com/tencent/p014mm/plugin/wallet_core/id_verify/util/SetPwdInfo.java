package com.tencent.p014mm.plugin.wallet_core.id_verify.util;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo */
public class SetPwdInfo implements Parcelable {
    public static final Parcelable.Creator<SetPwdInfo> CREATOR = new C72165a();

    /* renamed from: d */
    public int f209338d;

    /* renamed from: e */
    public String f209339e;

    /* renamed from: f */
    public String f209340f = "";

    /* renamed from: g */
    public String f209341g = "";

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.util.SetPwdInfo$a */
    public class C72165a implements Parcelable.Creator<SetPwdInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new SetPwdInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new SetPwdInfo[i];
        }
    }

    public SetPwdInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f209338d);
        parcel.writeString(this.f209339e);
        parcel.writeString(this.f209340f);
        parcel.writeString(this.f209341g);
    }

    public SetPwdInfo(Parcel parcel) {
        this.f209338d = parcel.readInt();
        this.f209339e = parcel.readString();
        this.f209340f = parcel.readString();
        this.f209341g = parcel.readString();
    }
}
