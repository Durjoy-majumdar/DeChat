package com.tencent.p014mm.plugin.wepkg.event;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify */
public class DownloadBigPkgCompleteNotify implements Parcelable {
    public static final Parcelable.Creator<DownloadBigPkgCompleteNotify> CREATOR = new C44474a();

    /* renamed from: d */
    public String f120600d;

    /* renamed from: e */
    public boolean f120601e;

    /* renamed from: f */
    public boolean f120602f;

    /* renamed from: com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify$a */
    public class C44474a implements Parcelable.Creator<DownloadBigPkgCompleteNotify> {
        public Object createFromParcel(Parcel parcel) {
            return new DownloadBigPkgCompleteNotify(parcel, (C44474a) null);
        }

        public Object[] newArray(int i) {
            return new DownloadBigPkgCompleteNotify[i];
        }
    }

    public DownloadBigPkgCompleteNotify(String str, boolean z, boolean z2) {
        this.f120600d = str;
        this.f120601e = z;
        this.f120602f = z2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120600d);
        parcel.writeInt(this.f120601e ? 1 : 0);
        parcel.writeInt(this.f120602f ? 1 : 0);
    }

    public DownloadBigPkgCompleteNotify(Parcel parcel, C44474a aVar) {
        this.f120600d = parcel.readString();
        boolean z = false;
        this.f120601e = parcel.readInt() == 1;
        this.f120602f = parcel.readInt() == 1 ? true : z;
    }
}
