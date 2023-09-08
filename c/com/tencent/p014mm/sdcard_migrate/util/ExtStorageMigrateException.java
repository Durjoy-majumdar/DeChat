package com.tencent.p014mm.sdcard_migrate.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.tencent.mm.sdcard_migrate.util.ExtStorageMigrateException */
public final class ExtStorageMigrateException extends RemoteException implements Parcelable {
    public static final Parcelable.Creator<ExtStorageMigrateException> CREATOR = new C30707a();

    /* renamed from: com.tencent.mm.sdcard_migrate.util.ExtStorageMigrateException$a */
    public class C30707a implements Parcelable.Creator<ExtStorageMigrateException> {
        public Object createFromParcel(Parcel parcel) {
            return (ExtStorageMigrateException) parcel.readParcelable(ExtStorageMigrateException.class.getClassLoader());
        }

        public Object[] newArray(int i) {
            return new ExtStorageMigrateException[i];
        }
    }

    public ExtStorageMigrateException(Throwable th) {
        initCause(th);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this, i);
    }
}
