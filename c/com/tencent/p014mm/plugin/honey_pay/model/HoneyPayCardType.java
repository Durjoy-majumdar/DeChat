package com.tencent.p014mm.plugin.honey_pay.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import te3.C51687ve2;

/* renamed from: com.tencent.mm.plugin.honey_pay.model.HoneyPayCardType */
public class HoneyPayCardType implements Parcelable {
    public static final Parcelable.Creator<HoneyPayCardType> CREATOR = new C42408a();

    /* renamed from: d */
    public byte[] f114711d;

    /* renamed from: com.tencent.mm.plugin.honey_pay.model.HoneyPayCardType$a */
    public class C42408a implements Parcelable.Creator<HoneyPayCardType> {
        public Object createFromParcel(Parcel parcel) {
            return new HoneyPayCardType(parcel);
        }

        public Object[] newArray(int i) {
            return new HoneyPayCardType[i];
        }
    }

    public HoneyPayCardType(C51687ve2 ve22) {
        try {
            this.f114711d = ve22.toByteArray();
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.HoneyPayCardType", e, "", new Object[0]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f114711d.length);
        parcel.writeByteArray(this.f114711d);
    }

    public HoneyPayCardType(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.f114711d = bArr;
        parcel.readByteArray(bArr);
    }
}
