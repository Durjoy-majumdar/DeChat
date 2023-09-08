package com.tencent.p014mm.plugin.setting.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.setting.model.UserAuthItemParcelable */
public class UserAuthItemParcelable implements Parcelable {
    public static final Parcelable.Creator<UserAuthItemParcelable> CREATOR = new C42920a();

    /* renamed from: d */
    public String f116217d;

    /* renamed from: e */
    public String f116218e;

    /* renamed from: f */
    public int f116219f;

    /* renamed from: g */
    public int f116220g;

    /* renamed from: com.tencent.mm.plugin.setting.model.UserAuthItemParcelable$a */
    public class C42920a implements Parcelable.Creator<UserAuthItemParcelable> {
        public Object createFromParcel(Parcel parcel) {
            UserAuthItemParcelable userAuthItemParcelable = new UserAuthItemParcelable();
            userAuthItemParcelable.f116217d = parcel.readString();
            userAuthItemParcelable.f116218e = parcel.readString();
            userAuthItemParcelable.f116219f = parcel.readInt();
            userAuthItemParcelable.f116220g = parcel.readInt();
            return userAuthItemParcelable;
        }

        public Object[] newArray(int i) {
            return new UserAuthItemParcelable[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f116217d);
        parcel.writeString(this.f116218e);
        parcel.writeInt(this.f116219f);
        parcel.writeInt(this.f116220g);
    }
}
