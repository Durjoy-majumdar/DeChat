package com.tencent.p014mm.plugin.game.luggage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.tencent.p014mm.plugin.game.luggage.page.C41962j;
import com.tencent.p014mm.plugin.webview.luggage.C43629l;
import com.tencent.p014mm.plugin.webview.luggage.LuggageMMLocalResourceProvider;
import com.tencent.xweb.WebView;
import js0.C88016e;
import kb3.C46677m;
import org.json.JSONObject;
import p828wa.C53099d;
import p828wa.C53135u;

/* renamed from: com.tencent.mm.plugin.game.luggage.t */
public class C41993t extends C41962j {

    /* renamed from: com.tencent.mm.plugin.game.luggage.t$a */
    public class C41994a extends C53099d {
        public C41994a(C41993t tVar) {
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            return null;
        }

        /* renamed from: b */
        public String mo14702b() {
            return "onJsApiReady";
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.t$b */
    public class C41995b extends C53135u {
        public C41995b(C41993t tVar) {
        }

        /* renamed from: a */
        public String mo65889a() {
            return C88016e.m109548e("preload_game_adapter.js");
        }

        /* renamed from: b */
        public void mo65890b(String str) {
        }

        /* renamed from: c */
        public void mo65891c(String str) {
        }

        /* renamed from: d */
        public WebResourceResponse mo65892d(WebResourceRequest webResourceRequest, Bundle bundle) {
            return null;
        }

        /* renamed from: e */
        public WebResourceResponse mo65893e(String str) {
            return null;
        }
    }

    public C41993t(Context context) {
        super(context);
        C46677m mVar = this.f113034B;
        if (mVar != null) {
            mVar.f125667t = true;
        }
    }

    /* renamed from: l0 */
    public void mo62123l0() {
        getWebCore().f148244h = new C41995b(this);
        if (getWebCore().f148248o != null) {
            getWebCore().f148248o.mo73445a(new LuggageMMLocalResourceProvider());
            getWebCore().f148248o.mo73445a(new C43629l(C88016e.m109548e("preload_game_adapter.js")));
        }
    }

    public void loadUrl(String str) {
        super.loadUrl(str);
        C41927m.m45504a(getWebCore(), str, true);
    }

    /* renamed from: o0 */
    public void mo65859o0(WebView webView, String str) {
        super.mo65859o0(webView, str);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWebCore().mo73815b(new C41994a(this));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: p0 */
    public void mo65862p0(WebView webView, String str, Bitmap bitmap) {
        super.mo65862p0(webView, str, bitmap);
    }
}
