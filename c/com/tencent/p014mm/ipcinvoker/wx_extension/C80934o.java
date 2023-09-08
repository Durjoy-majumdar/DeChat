package com.tencent.p014mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import com.tencent.p014mm.ipcinvoker.extension.C80891a;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.o */
public class C80934o implements C80891a {
    /* renamed from: a */
    public Object mo56342a(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        obtain.setDataPosition(0);
        obtain.appendFrom(parcel, parcel.dataPosition(), parcel.readInt());
        obtain.setDataPosition(0);
        return obtain;
    }

    /* renamed from: b */
    public boolean mo56343b(Object obj) {
        return obj instanceof Parcel;
    }

    /* renamed from: c */
    public void mo56344c(Object obj, Parcel parcel) {
        Parcel parcel2 = (Parcel) obj;
        parcel2.setDataPosition(0);
        parcel.writeInt(parcel2.dataSize());
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
    }

    public String getName() {
        return C80934o.class.getName();
    }
}
