package com.tencent.p014mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import te3.C49674h90;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel */
public class EnterTimeParcel implements Parcelable {
    public static final Parcelable.Creator<EnterTimeParcel> CREATOR = new C42807a();

    /* renamed from: d */
    public int f115906d;

    /* renamed from: e */
    public String f115907e;

    /* renamed from: f */
    public String f115908f;

    /* renamed from: g */
    public int f115909g;

    /* renamed from: h */
    public String f115910h;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.model.EnterTimeParcel$a */
    public class C42807a implements Parcelable.Creator<EnterTimeParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new EnterTimeParcel(parcel);
        }

        public Object[] newArray(int i) {
            return new EnterTimeParcel[i];
        }
    }

    public EnterTimeParcel() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f115906d);
        parcel.writeString(this.f115907e);
        parcel.writeString(this.f115908f);
        parcel.writeInt(this.f115909g);
        parcel.writeString(this.f115910h);
    }

    public EnterTimeParcel(C49674h90 h902) {
        this.f115906d = h902.f134511d;
        this.f115907e = h902.f134512e;
        this.f115908f = h902.f134513f;
        this.f115909g = h902.f134514g;
        this.f115910h = h902.f134515h;
    }

    public EnterTimeParcel(Parcel parcel) {
        this.f115906d = parcel.readInt();
        this.f115907e = parcel.readString();
        this.f115908f = parcel.readString();
        this.f115909g = parcel.readInt();
        this.f115910h = parcel.readString();
    }
}
