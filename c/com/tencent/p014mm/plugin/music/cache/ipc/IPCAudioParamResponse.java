package com.tencent.p014mm.plugin.music.cache.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import qc0.C101108q;

/* renamed from: com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse */
public class IPCAudioParamResponse implements Parcelable {
    public static final Parcelable.Creator<IPCAudioParamResponse> CREATOR = new C94202a();

    /* renamed from: d */
    public String f272151d;

    /* renamed from: e */
    public String f272152e;

    /* renamed from: f */
    public String f272153f;

    /* renamed from: g */
    public String f272154g;

    /* renamed from: h */
    public int f272155h;

    /* renamed from: i */
    public byte[] f272156i;

    /* renamed from: j */
    public int f272157j;

    /* renamed from: com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse$a */
    public class C94202a implements Parcelable.Creator<IPCAudioParamResponse> {
        public Object createFromParcel(Parcel parcel) {
            return new IPCAudioParamResponse(parcel);
        }

        public Object[] newArray(int i) {
            return new IPCAudioParamResponse[i];
        }
    }

    public IPCAudioParamResponse() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f272151d);
        parcel.writeString(this.f272152e);
        parcel.writeString(this.f272153f);
        parcel.writeString(this.f272154g);
        parcel.writeInt(this.f272155h);
        parcel.writeInt(this.f272157j);
        byte[] bArr = this.f272156i;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.f272156i);
            return;
        }
        parcel.writeInt(0);
    }

    public IPCAudioParamResponse(C101108q qVar) {
        this.f272151d = qVar.f295979a;
        this.f272152e = qVar.f295980b;
        this.f272153f = qVar.f295981c;
        this.f272155h = qVar.f295983e;
        this.f272154g = qVar.f295984f;
        this.f272156i = qVar.f295982d;
        this.f272157j = qVar.f295985g;
    }

    public IPCAudioParamResponse(Parcel parcel) {
        this.f272151d = parcel.readString();
        this.f272152e = parcel.readString();
        this.f272153f = parcel.readString();
        this.f272154g = parcel.readString();
        this.f272155h = parcel.readInt();
        this.f272157j = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f272156i = bArr;
            parcel.readByteArray(bArr);
        }
    }
}
