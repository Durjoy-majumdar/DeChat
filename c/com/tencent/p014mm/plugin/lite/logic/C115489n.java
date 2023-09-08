package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.liteapp.storage.WxaLiteAppBaselibInfo;
import com.tencent.p014mm.plugin.lite.api.C115476a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import tw0.C90586i;
import tw0.C90587j;

/* renamed from: com.tencent.mm.plugin.lite.logic.n */
public class C115489n implements C90586i {

    /* renamed from: a */
    public final /* synthetic */ C115476a f346237a;

    /* renamed from: b */
    public final /* synthetic */ WxaLiteAppBaselibInfo f346238b;

    public C115489n(C115492q qVar, C115476a aVar, WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo) {
        this.f346237a = aVar;
        this.f346238b = wxaLiteAppBaselibInfo;
    }

    /* renamed from: a */
    public /* synthetic */ void mo122087a(List list) {
    }

    /* renamed from: b */
    public void mo122088b(C90587j jVar) {
        if (!Util.isNullOrNil(jVar.f260272d)) {
            Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "start to download liteapp baselib filesize:%d url:%s", Integer.valueOf(jVar.f260276h), jVar.f260272d);
            C115485l.INSTANCE.mo175463b(jVar, "release", this.f346237a);
            return;
        }
        Log.m105925i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib, url is null errorCode:%d responseState:%d", Integer.valueOf(jVar.f260277i), jVar.f260270b);
        C115476a aVar = this.f346237a;
        if (aVar != null) {
            WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = this.f346238b;
            if (wxaLiteAppBaselibInfo != null) {
                aVar.mo175451b(wxaLiteAppBaselibInfo, 1);
            } else {
                aVar.mo175450a(2);
            }
        }
    }
}
