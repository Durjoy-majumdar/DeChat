package com.tencent.p014mm.plugin.music.cache.ipc;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest */
public class IPCAudioParamRequest implements Parcelable {
    public static final Parcelable.Creator<IPCAudioParamRequest> CREATOR = new C94201a();

    /* renamed from: d */
    public String f272147d = "";

    /* renamed from: e */
    public int f272148e = 0;

    /* renamed from: f */
    public String f272149f = "";

    /* renamed from: g */
    public byte[] f272150g;

    /* renamed from: com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest$a */
    public class C94201a implements Parcelable.Creator<IPCAudioParamRequest> {
        public Object createFromParcel(Parcel parcel) {
            return new IPCAudioParamRequest(parcel);
        }

        public Object[] newArray(int i) {
            return new IPCAudioParamRequest[i];
        }
    }

    public IPCAudioParamRequest() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f272147d);
        parcel.writeInt(this.f272148e);
        parcel.writeString(this.f272149f);
        byte[] bArr = this.f272150g;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f272150g);
            return;
        }
        parcel.writeInt(0);
    }

    public IPCAudioParamRequest(Parcel parcel) {
        this.f272147d = parcel.readString();
        this.f272148e = parcel.readInt();
        this.f272149f = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f272150g = bArr;
            parcel.readByteArray(bArr);
        }
    }
}
