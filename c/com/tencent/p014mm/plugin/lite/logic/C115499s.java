package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.liteapp.storage.WxaLiteAppInfo;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import tw0.C90586i;
import tw0.C90587j;

/* renamed from: com.tencent.mm.plugin.lite.logic.s */
public class C115499s implements C90586i {

    /* renamed from: a */
    public final /* synthetic */ C115492q.C115496d f346270a;

    /* renamed from: b */
    public final /* synthetic */ String f346271b;

    /* renamed from: c */
    public final /* synthetic */ WxaLiteAppInfo f346272c;

    public C115499s(C115492q.C115497e eVar, C115492q.C115496d dVar, String str, WxaLiteAppInfo wxaLiteAppInfo) {
        this.f346270a = dVar;
        this.f346271b = str;
        this.f346272c = wxaLiteAppInfo;
    }

    /* renamed from: a */
    public /* synthetic */ void mo122087a(List list) {
    }

    /* renamed from: b */
    public void mo122088b(C90587j jVar) {
        C115492q.C115496d dVar = this.f346270a;
        if (dVar != null) {
            dVar.f346265e = System.currentTimeMillis();
            C115492q.C115496d dVar2 = this.f346270a;
            dVar2.f346266f = dVar2.f346265e;
        }
        if (!Util.isNullOrNil(jVar.f260272d)) {
            Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp:%s fileSize:%d url:%s", this.f346271b, Integer.valueOf(jVar.f260276h), jVar.f260272d);
            C115485l.INSTANCE.mo175462a(jVar, "release", this.f346270a, C115492q.m162360g().f346247a);
            return;
        }
        Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteApp, url is null, appId:%s errorCode:%d responseState:%d", this.f346271b, Integer.valueOf(jVar.f260277i), jVar.f260270b);
        if (C115492q.m162360g().f346247a == null) {
            return;
        }
        if (this.f346272c != null) {
            ((C115490o) C115492q.m162360g().f346247a).mo5701b(this.f346272c, 1);
            return;
        }
        ((C115490o) C115492q.m162360g().f346247a).mo5700a(this.f346271b, 2);
    }
}
