package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged */
public class EventLocationBackgroundStateChanged implements Parcelable {
    public static final Parcelable.Creator<EventLocationBackgroundStateChanged> CREATOR = new C81978a();

    /* renamed from: d */
    public boolean f240381d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.EventLocationBackgroundStateChanged$a */
    public class C81978a implements Parcelable.Creator<EventLocationBackgroundStateChanged> {
        public Object createFromParcel(Parcel parcel) {
            return new EventLocationBackgroundStateChanged(parcel);
        }

        public Object[] newArray(int i) {
            return new EventLocationBackgroundStateChanged[i];
        }
    }

    public EventLocationBackgroundStateChanged(boolean z) {
        this.f240381d = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f240381d ? (byte) 1 : 0);
    }

    public EventLocationBackgroundStateChanged(Parcel parcel) {
        this.f240381d = parcel.readByte() != 0;
    }
}
