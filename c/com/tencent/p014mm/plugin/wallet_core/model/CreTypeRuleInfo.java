package com.tencent.p014mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo */
public class CreTypeRuleInfo implements Parcelable {
    public static final Parcelable.Creator<CreTypeRuleInfo> CREATOR = new C72176a();

    /* renamed from: d */
    public int f209485d;

    /* renamed from: e */
    public CreExtInfo f209486e;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo$a */
    public class C72176a implements Parcelable.Creator<CreTypeRuleInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new CreTypeRuleInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new CreTypeRuleInfo[i];
        }
    }

    public CreTypeRuleInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f209485d);
        parcel.writeParcelable(this.f209486e, i);
    }

    public CreTypeRuleInfo(Parcel parcel) {
        this.f209485d = parcel.readInt();
        this.f209486e = (CreExtInfo) parcel.readParcelable(CreExtInfo.class.getClassLoader());
    }
}
