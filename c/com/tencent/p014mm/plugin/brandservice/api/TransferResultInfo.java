package com.tencent.p014mm.plugin.brandservice.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C52278zk2;

/* renamed from: com.tencent.mm.plugin.brandservice.api.TransferResultInfo */
public class TransferResultInfo implements Parcelable {
    public static final Parcelable.Creator<TransferResultInfo> CREATOR = new C40597a();

    /* renamed from: d */
    public int f109036d;

    /* renamed from: e */
    public String f109037e;

    /* renamed from: f */
    public C52278zk2 f109038f;

    /* renamed from: com.tencent.mm.plugin.brandservice.api.TransferResultInfo$a */
    public class C40597a implements Parcelable.Creator<TransferResultInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new TransferResultInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new TransferResultInfo[i];
        }
    }

    public TransferResultInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f109036d);
        parcel.writeString(this.f109037e);
        try {
            C52278zk2 zk22 = this.f109038f;
            if (zk22 != null) {
                byte[] byteArray = zk22.toByteArray();
                if (byteArray == null || byteArray.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(byteArray.length);
                parcel.writeByteArray(byteArray);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TransferResultInfo", e, "writeToParcel exception", new Object[0]);
            parcel.writeInt(0);
        }
    }

    public TransferResultInfo(Parcel parcel) {
        this.f109036d = parcel.readInt();
        this.f109037e = parcel.readString();
        try {
            int readInt = parcel.readInt();
            if (readInt > 0) {
                this.f109038f = new C52278zk2();
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                this.f109038f.parseFrom(bArr);
            }
        } catch (Exception e) {
            this.f109038f = null;
            Log.printErrStackTrace("MicroMsg.TransferResultInfo", e, "parse jsApiResponse exception", new Object[0]);
        }
    }
}
