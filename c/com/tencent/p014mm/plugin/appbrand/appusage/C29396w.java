package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Parcel;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.appusage.C81531v;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.w */
public class C29396w implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public final /* synthetic */ C1256g f80194d;

    public C29396w(C81531v.C81536d dVar, C1256g gVar) {
        this.f80194d = gVar;
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (this.f80194d != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeString(str);
            obtain.writeInt(mStorageEventData.eventId);
            Object obj = mStorageEventData.obj;
            obtain.writeString(obj == null ? null : obj.toString());
            this.f80194d.mo894a(obtain);
        }
    }
}
