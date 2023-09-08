package com.tencent.p014mm.pluginsdk.nfc;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.pluginsdk.nfc.NfcAID */
public class NfcAID implements Parcelable {
    public static final Parcelable.Creator<NfcAID> CREATOR = new C115865a();

    /* renamed from: d */
    public String f347639d = null;

    /* renamed from: e */
    public String f347640e = null;

    /* renamed from: com.tencent.mm.pluginsdk.nfc.NfcAID$a */
    public class C115865a implements Parcelable.Creator<NfcAID> {
        public Object createFromParcel(Parcel parcel) {
            return new NfcAID(parcel);
        }

        public Object[] newArray(int i) {
            return new NfcAID[i];
        }
    }

    public NfcAID(Parcel parcel) {
        this.f347639d = parcel.readString();
        this.f347640e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f347639d);
        parcel.writeString(this.f347640e);
    }
}
