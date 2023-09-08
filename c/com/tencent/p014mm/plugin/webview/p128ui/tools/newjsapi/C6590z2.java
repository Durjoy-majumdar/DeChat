package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import java.util.HashMap;
import nj3.C11184p0;
import t83.C13849g;
import t83.C13855j;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.z2 */
public final class C6590z2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23833d;

    public C6590z2(C13855j jVar) {
        this.f23833d = jVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        HashMap hashMap = new HashMap();
        CharSequence title = menuItem.getTitle();
        C87412m.m108593f(title, "menuItem.title");
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
        hashMap.put("id", Integer.valueOf(menuItem.getItemId()));
        C13849g gVar = this.f23833d.f39001d;
        C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        ((C48590l) gVar).mo8701f("onShareCustomMenuItemClick", hashMap);
    }
}
