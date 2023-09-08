package com.tencent.p014mm.plugin.wepkg.event;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wepkg.event.LiteInfoUpdateCompleteNotify */
public class LiteInfoUpdateCompleteNotify implements Parcelable {

    /* renamed from: d */
    public String f120605d;

    public LiteInfoUpdateCompleteNotify(String str) {
        this.f120605d = str;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120605d);
    }
}
