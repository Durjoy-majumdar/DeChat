package xn0;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import d93.C45310h;
import di3.C86312j;
import p235sm.C36694j0;

/* renamed from: xn0.a */
public abstract class C53389a {

    /* renamed from: d */
    public final C40478h f150228d;

    /* renamed from: e */
    public final MMWebView f150229e;

    /* renamed from: f */
    public C43791l f150230f;

    /* renamed from: g */
    public C45310h f150231g;

    public C53389a(C40478h hVar) {
        this.f150228d = hVar;
        this.f150229e = hVar.getWebView();
    }

    /* renamed from: a */
    public final Context mo74033a() {
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f150228d.getAndroidContext());
        return castActivityOrNull == null ? ((C36694j0) C86312j.m106911c(C36694j0.class)).fg0(MMApplicationContext.getContext()) : castActivityOrNull;
    }
}
