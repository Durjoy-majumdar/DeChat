package com.tencent.p014mm.plugin.remittance.bankcard.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import te3.rj4;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel */
public class TransferRecordParcel implements Parcelable {
    public static final Parcelable.Creator<TransferRecordParcel> CREATOR = new C42808a();

    /* renamed from: d */
    public String f115911d;

    /* renamed from: e */
    public String f115912e;

    /* renamed from: f */
    public String f115913f;

    /* renamed from: g */
    public String f115914g;

    /* renamed from: h */
    public String f115915h;

    /* renamed from: i */
    public String f115916i;

    /* renamed from: j */
    public String f115917j;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel$a */
    public class C42808a implements Parcelable.Creator<TransferRecordParcel> {
        public Object createFromParcel(Parcel parcel) {
            return new TransferRecordParcel(parcel);
        }

        public Object[] newArray(int i) {
            return new TransferRecordParcel[i];
        }
    }

    public TransferRecordParcel() {
    }

    /* renamed from: a */
    public static ArrayList<TransferRecordParcel> m46479a(List<rj4> list) {
        if (list == null) {
            return null;
        }
        ArrayList<TransferRecordParcel> arrayList = new ArrayList<>();
        for (rj4 transferRecordParcel : list) {
            arrayList.add(new TransferRecordParcel(transferRecordParcel));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115911d);
        parcel.writeString(this.f115912e);
        parcel.writeString(this.f115913f);
        parcel.writeString(this.f115914g);
        parcel.writeString(this.f115915h);
        parcel.writeString(this.f115916i);
        parcel.writeString(this.f115917j);
    }

    public TransferRecordParcel(rj4 rj4) {
        this.f115911d = rj4.f140960d;
        this.f115912e = rj4.f140961e;
        this.f115913f = rj4.f140962f;
        this.f115914g = rj4.f140963g;
        this.f115915h = rj4.f140964h;
        this.f115916i = rj4.f140965i;
        this.f115917j = rj4.f140966j;
    }

    public TransferRecordParcel(Parcel parcel) {
        this.f115911d = parcel.readString();
        this.f115912e = parcel.readString();
        this.f115913f = parcel.readString();
        this.f115914g = parcel.readString();
        this.f115915h = parcel.readString();
        this.f115916i = parcel.readString();
        this.f115917j = parcel.readString();
    }
}
