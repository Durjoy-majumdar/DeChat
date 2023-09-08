package com.tencent.p014mm.ipcinvoker.extension;

import android.os.Bundle;
import android.os.Parcel;
import com.tencent.p014mm.ipcinvoker.C80938z;
import java.util.Map;
import r20.C89865a;
import u20.C90594b;

/* renamed from: com.tencent.mm.ipcinvoker.extension.b */
public class C80892b implements C80891a {
    /* renamed from: a */
    public Object mo56342a(Parcel parcel) {
        String readString = parcel.readString();
        Bundle readBundle = parcel.readBundle();
        Map<String, C80894e> map = C80938z.f237797a;
        C89865a aVar = (C89865a) C90594b.m113496d(readString, C89865a.class);
        if (aVar == null) {
            return null;
        }
        aVar.fromBundle(readBundle);
        return aVar;
    }

    /* renamed from: b */
    public boolean mo56343b(Object obj) {
        return obj instanceof C89865a;
    }

    /* renamed from: c */
    public void mo56344c(Object obj, Parcel parcel) {
        C89865a aVar = (C89865a) obj;
        parcel.writeString(aVar.getClass().getName());
        parcel.writeBundle(aVar.toBundle());
    }

    public String getName() {
        return C80892b.class.getName();
    }
}
