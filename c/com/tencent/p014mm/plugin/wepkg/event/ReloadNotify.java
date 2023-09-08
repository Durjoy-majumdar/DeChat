package com.tencent.p014mm.plugin.wepkg.event;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.wepkg.event.ReloadNotify */
public class ReloadNotify implements Parcelable {
    static {
        new HashSet();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray((String[]) null);
    }
}
