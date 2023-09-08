package com.tencent.p014mm.plugin.game.luggage.jsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.plugin.wepkg.version.WepkgVersionUpdater;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import k00.C46633d;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$$c */
public final /* synthetic */ class JsApiOpenGameUrlWithExtraWebView$$c implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ JsApiOpenGameUrlWithExtraWebView f19217d;

    /* renamed from: e */
    public final /* synthetic */ C53096b.C53097a f19218e;

    public /* synthetic */ JsApiOpenGameUrlWithExtraWebView$$c(JsApiOpenGameUrlWithExtraWebView jsApiOpenGameUrlWithExtraWebView, C53096b.C53097a aVar) {
        this.f19217d = jsApiOpenGameUrlWithExtraWebView;
        this.f19218e = aVar;
    }

    /* renamed from: a */
    public final void mo894a(Object obj) {
        JsApiOpenGameUrlWithExtraWebView jsApiOpenGameUrlWithExtraWebView = this.f19217d;
        C53096b.C53097a aVar = this.f19218e;
        jsApiOpenGameUrlWithExtraWebView.getClass();
        if (((IPCBoolean) obj).f10312d) {
            Log.m105924i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openLiteApp success");
            aVar.mo73776a();
            String optString = aVar.f148190b.f129368c.optString("url");
            Object obj2 = C44536d.f120770a;
            String a = C46633d.m51936a(optString);
            if (!Util.isNullOrNil(a)) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(a);
                WepkgVersionUpdater.m48921a(linkedList, 4);
                return;
            }
            return;
        }
        jsApiOpenGameUrlWithExtraWebView.mo5386f(aVar);
    }
}
