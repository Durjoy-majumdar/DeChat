package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.ShareInfo */
public class ShareInfo implements Parcelable {
    public static final Parcelable.Creator<ShareInfo> CREATOR = new C82949a();

    /* renamed from: d */
    public String f242575d;

    /* renamed from: e */
    public String f242576e;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.ShareInfo$a */
    public class C82949a implements Parcelable.Creator<ShareInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ShareInfo(parcel, (C82949a) null);
        }

        public Object[] newArray(int i) {
            return new ShareInfo[i];
        }
    }

    public ShareInfo(String str, String str2) {
        this.f242575d = str;
        this.f242576e = str2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242575d);
        parcel.writeString(this.f242576e);
    }

    public ShareInfo(Parcel parcel, C82949a aVar) {
        this.f242575d = parcel.readString();
        this.f242576e = parcel.readString();
    }
}
