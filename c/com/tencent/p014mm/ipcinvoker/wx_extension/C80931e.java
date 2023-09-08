package com.tencent.p014mm.ipcinvoker.wx_extension;

import android.os.Parcel;
import com.tencent.p014mm.ipcinvoker.extension.C80891a;
import com.tencent.p014mm.ipcinvoker.extension.C80893c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ob0.C47350c;
import pe3.C47465a;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.e */
public final class C80931e implements C80891a {
    /* renamed from: a */
    public Object mo56342a(Parcel parcel) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = (C47465a) C80893c.m98762c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
        if (MMApplicationContext.isMMProcess()) {
            try {
                bVar.f127067b = (C47465a) Class.forName(parcel.readString()).newInstance();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.XIPC.CommReqRespTransfer", "readFromParcel, mm process initiate resp e = %s", e);
                bVar.f127067b = new C47465a();
            }
        } else {
            C47465a aVar = (C47465a) C80893c.m98762c("com.tencent.mm.ipcinvoker.wx_extension.MMProtoBufTransfer", parcel);
            if (aVar == null) {
                aVar = new C47465a();
            }
            bVar.f127067b = aVar;
        }
        bVar.f127068c = parcel.readString();
        bVar.f127069d = parcel.readInt();
        bVar.f127070e = parcel.readInt();
        bVar.f127071f = parcel.readInt();
        bVar.f127074i = parcel.readInt();
        return bVar.mo72403a();
    }

    /* renamed from: b */
    public boolean mo56343b(Object obj) {
        return obj instanceof C47350c;
    }

    /* renamed from: c */
    public void mo56344c(Object obj, Parcel parcel) {
        C47350c cVar = (C47350c) obj;
        C80893c.m98763d(cVar.f127055a.f127080a, parcel);
        if (MMApplicationContext.isMMProcess()) {
            C80893c.m98763d(cVar.f127056b.f127083a, parcel);
        } else {
            parcel.writeString(cVar.f127056b.f127083a.getClass().getName());
        }
        parcel.writeString(cVar.f127057c);
        parcel.writeInt(cVar.f127058d);
        parcel.writeInt(cVar.f127055a.f127082c);
        parcel.writeInt(cVar.f127056b.f127084b);
        parcel.writeInt(cVar.f127060f);
    }

    public String getName() {
        return "com.tencent.mm.ipcinvoker.wx_extension.CommReqRespTransfer";
    }
}
