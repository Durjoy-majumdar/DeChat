package com.tencent.p014mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.CreExtInfo */
public class CreExtInfo implements Parcelable {
    public static final Parcelable.Creator<CreExtInfo> CREATOR = new C72175a();

    /* renamed from: d */
    public int f209481d;

    /* renamed from: e */
    public int f209482e;

    /* renamed from: f */
    public int f209483f;

    /* renamed from: g */
    public int f209484g;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.CreExtInfo$a */
    public class C72175a implements Parcelable.Creator<CreExtInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new CreExtInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new CreExtInfo[i];
        }
    }

    public CreExtInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f209481d);
        parcel.writeInt(this.f209482e);
        parcel.writeInt(this.f209483f);
        parcel.writeInt(this.f209484g);
    }

    public CreExtInfo(Parcel parcel) {
        this.f209481d = parcel.readInt();
        this.f209482e = parcel.readInt();
        this.f209483f = parcel.readInt();
        this.f209484g = parcel.readInt();
    }
}
