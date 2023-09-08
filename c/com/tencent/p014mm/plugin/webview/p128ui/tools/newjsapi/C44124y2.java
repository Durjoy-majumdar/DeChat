package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import gy3.C87412m;
import java.util.HashMap;
import nj3.C11184p0;
import t83.C13849g;
import t83.C13855j;
import t83.C48590l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.y2 */
public final class C44124y2 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C13855j f119524d;

    public C44124y2(C13855j jVar) {
        this.f119524d = jVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        switch (menuItem.getItemId()) {
            case 2147483645:
                C44111u2 u2Var = C44111u2.f119490d;
                u2Var.getClass();
                HashMap e = C44111u2.m48408e(u2Var, C44111u2.f119495i);
                Context context = this.f119524d.f38998a;
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                ((WebViewUI) context).f118513b1.mo67720g0().mo73238g0(0, e, 2);
                return;
            case 2147483646:
                C44111u2 u2Var2 = C44111u2.f119490d;
                u2Var2.getClass();
                HashMap e2 = C44111u2.m48408e(u2Var2, C44111u2.f119494h);
                Context context2 = this.f119524d.f38998a;
                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                ((WebViewUI) context2).f118513b1.mo67720g0().mo73237f0(e2, 3);
                return;
            default:
                HashMap hashMap = new HashMap();
                CharSequence title = menuItem.getTitle();
                C87412m.m108593f(title, "menuItem.title");
                hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
                hashMap.put("id", Integer.valueOf(menuItem.getItemId()));
                C13849g gVar = this.f119524d.f39001d;
                C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                ((C48590l) gVar).mo8701f("onShareCustomMenuItemClick", hashMap);
                return;
        }
    }
}
