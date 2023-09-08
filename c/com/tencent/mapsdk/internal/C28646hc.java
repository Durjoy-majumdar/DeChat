package com.tencent.mapsdk.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mapsdk.internal.hc */
public final class C28646hc {
    /* renamed from: a */
    private static <T extends Parcelable> T m38310a(T t) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(t, 0);
        obtain.setDataPosition(0);
        T readParcelable = obtain.readParcelable(t.getClass().getClassLoader());
        obtain.recycle();
        return readParcelable;
    }
}
