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

/* renamed from: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenGameUrlWithExtraWebView$$a */
public final /* synthetic */ class JsApiOpenGameUrlWithExtraWebView$$a implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ JsApiOpenGameUrlWithExtraWebView f19212d;

    /* renamed from: e */
    public final /* synthetic */ C53096b.C53097a f19213e;

    public /* synthetic */ JsApiOpenGameUrlWithExtraWebView$$a(JsApiOpenGameUrlWithExtraWebView jsApiOpenGameUrlWithExtraWebView, C53096b.C53097a aVar) {
        this.f19212d = jsApiOpenGameUrlWithExtraWebView;
        this.f19213e = aVar;
    }

    /* renamed from: a */
    public final void mo894a(Object obj) {
        JsApiOpenGameUrlWithExtraWebView jsApiOpenGameUrlWithExtraWebView = this.f19212d;
        C53096b.C53097a aVar = this.f19213e;
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
