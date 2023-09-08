package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.sdk.platformtools.Util;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.v1 */
public class C5994v1 extends C5954n2<C43658n> {
    /* renamed from: b */
    public String mo5382b() {
        return "setDesktopInfo";
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
        String optString = aVar.f148190b.f129368c.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        String optString2 = aVar.f148190b.f129368c.optString("icon_url");
        String optString3 = aVar.f148190b.f129368c.optString("jump_url");
        Util.isNullOrNil(optString);
        Util.isNullOrNil(optString2);
        Util.isNullOrNil(optString3);
        aVar.mo73776a();
    }
}
