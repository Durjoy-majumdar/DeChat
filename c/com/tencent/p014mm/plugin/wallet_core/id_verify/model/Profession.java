package com.tencent.p014mm.plugin.wallet_core.id_verify.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.model.Profession */
public class Profession implements Parcelable {
    public static final Parcelable.Creator<Profession> CREATOR = new C72154a();

    /* renamed from: d */
    public String f209290d;

    /* renamed from: e */
    public int f209291e;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.model.Profession$a */
    public class C72154a implements Parcelable.Creator<Profession> {
        public Object createFromParcel(Parcel parcel) {
            return new Profession(parcel);
        }

        public Object[] newArray(int i) {
            return new Profession[i];
        }
    }

    public Profession(String str, int i) {
        this.f209290d = str;
        this.f209291e = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f209290d);
        parcel.writeInt(this.f209291e);
    }

    public Profession(Parcel parcel) {
        this.f209290d = parcel.readString();
        this.f209291e = parcel.readInt();
    }
}
