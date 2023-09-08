package com.tencent.p014mm.plugin.wallet_payu.security_question.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion */
public class PayUSecurityQuestion implements Parcelable {
    public static final Parcelable.Creator<PayUSecurityQuestion> CREATOR = new C72585a();

    /* renamed from: d */
    public String f211175d;

    /* renamed from: e */
    public String f211176e;

    /* renamed from: com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion$a */
    public class C72585a implements Parcelable.Creator<PayUSecurityQuestion> {
        public Object createFromParcel(Parcel parcel) {
            return new PayUSecurityQuestion(parcel);
        }

        public Object[] newArray(int i) {
            return new PayUSecurityQuestion[i];
        }
    }

    public PayUSecurityQuestion(String str, String str2) {
        this.f211175d = str;
        this.f211176e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f211175d);
        parcel.writeString(this.f211176e);
    }

    public PayUSecurityQuestion(Parcel parcel) {
        this.f211175d = parcel.readString();
        this.f211176e = parcel.readString();
    }
}
