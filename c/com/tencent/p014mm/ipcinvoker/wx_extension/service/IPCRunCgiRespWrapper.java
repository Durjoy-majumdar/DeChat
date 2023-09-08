package com.tencent.p014mm.ipcinvoker.wx_extension.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.extension.C80893c;
import ob0.C47350c;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper */
public class IPCRunCgiRespWrapper implements Parcelable {
    public static final Parcelable.Creator<IPCRunCgiRespWrapper> CREATOR = new C80935a();

    /* renamed from: d */
    public int f237792d;

    /* renamed from: e */
    public int f237793e;

    /* renamed from: f */
    public String f237794f;

    /* renamed from: g */
    public C47350c f237795g;

    /* renamed from: com.tencent.mm.ipcinvoker.wx_extension.service.IPCRunCgiRespWrapper$a */
    public class C80935a implements Parcelable.Creator<IPCRunCgiRespWrapper> {
        public Object createFromParcel(Parcel parcel) {
            return new IPCRunCgiRespWrapper(parcel);
        }

        public Object[] newArray(int i) {
            return new IPCRunCgiRespWrapper[i];
        }
    }

    public IPCRunCgiRespWrapper() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f237792d);
        parcel.writeInt(this.f237793e);
        parcel.writeString(this.f237794f);
        C80893c.m98763d(this.f237795g, parcel);
    }

    public IPCRunCgiRespWrapper(Parcel parcel) {
        this.f237792d = parcel.readInt();
        this.f237793e = parcel.readInt();
        this.f237794f = parcel.readString();
        this.f237795g = (C47350c) C80893c.m98762c("com.tencent.mm.ipcinvoker.wx_extension.CommReqRespTransfer", parcel);
    }
}
