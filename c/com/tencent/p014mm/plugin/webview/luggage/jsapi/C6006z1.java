package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.z1 */
public class C6006z1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "setPageTitle";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiSetPageTitle", "invokeInOwn");
        String optString = aVar.f148190b.f129368c.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (!Util.isNullOrNil(aVar.f148190b.f129368c.optString("color"))) {
            ((C43658n) aVar.f148189a).mo65818R(optString, C6600v.m6908c(aVar.f148190b.f129368c.optString("color"), ((C43658n) aVar.f148189a).f148196d.getResources().getColor(C0966R.color.f3009c6)));
        } else {
            ((C43658n) aVar.f148189a).mo65818R(optString, 0);
        }
        aVar.mo73776a();
    }
}
