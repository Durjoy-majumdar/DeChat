package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.sdk.platformtools.Log;
import p261wl.C15510f;
import p261wl.C38172g;
import p727vq.C37801b;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.t$$a */
public final /* synthetic */ class t$$a implements C38172g {

    /* renamed from: a */
    public final /* synthetic */ C69843t f81764a;

    public /* synthetic */ t$$a(C69843t tVar) {
        this.f81764a = tVar;
    }

    public final boolean invoke(C15510f fVar) {
        C69843t tVar = this.f81764a;
        C37801b bVar = (C37801b) fVar;
        tVar.getClass();
        Log.m105925i("MessengerStorageService", "add AbstractMessageStorage %s", bVar);
        try {
            tVar.f201503g.mo101074Lo(bVar.j20(tVar.f201503g));
        } catch (Exception e) {
            Log.printErrStackTrace("MessengerStorageService", e, (String) null, new Object[0]);
        }
        return false;
    }
}
