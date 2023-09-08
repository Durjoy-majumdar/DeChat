package com.tencent.p014mm.ipcinvoker.extension;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.ipcinvoker.extension.d */
public class C28949d implements C80891a {
    /* renamed from: a */
    public Object mo56342a(Parcel parcel) {
        return parcel.readParcelable(C28949d.class.getClassLoader());
    }

    /* renamed from: b */
    public boolean mo56343b(Object obj) {
        return obj instanceof Parcelable;
    }

    /* renamed from: c */
    public void mo56344c(Object obj, Parcel parcel) {
        parcel.writeParcelable((Parcelable) obj, 0);
    }

    public String getName() {
        return C28949d.class.getName();
    }
}
