package com.tencent.p014mm.ipcinvoker.extension;

import android.os.Parcel;
import com.tencent.p014mm.ipcinvoker.C80938z;
import java.util.Map;
import u20.C90594b;

/* renamed from: com.tencent.mm.ipcinvoker.extension.g */
public class C80897g implements C80891a {
    /* renamed from: a */
    public Object mo56342a(Parcel parcel) {
        Map<String, C80894e> map = C80938z.f237797a;
        C80896f fVar = (C80896f) C90594b.m113496d(parcel.readString(), C80896f.class);
        if (fVar == null) {
            return null;
        }
        fVar.mo112691a(parcel);
        return fVar;
    }

    /* renamed from: b */
    public boolean mo56343b(Object obj) {
        return obj instanceof C80896f;
    }

    /* renamed from: c */
    public void mo56344c(Object obj, Parcel parcel) {
        C80896f fVar = (C80896f) obj;
        parcel.writeString(fVar.getClass().getName());
        fVar.mo112692b(parcel);
    }

    public String getName() {
        return C80897g.class.getName();
    }
}
