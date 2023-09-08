package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import de3.C45331f0;
import di0.C86299o;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import ke3.C88144b;
import kr0.C76630x0;
import or0.C47398l;
import or0.C47399m;
import p206nj.C117627q;
import pr0.C35624a;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.w */
public final class C40556w extends AbsWxaShortLinkLauncher {

    /* renamed from: b */
    public final /* synthetic */ C45331f0.C45333b f108941b;

    /* renamed from: c */
    public final /* synthetic */ int f108942c;

    /* renamed from: d */
    public final /* synthetic */ String f108943d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandCheckWxaShortLinkUI f108944e;

    /* renamed from: f */
    public final /* synthetic */ WeakReference<AppBrandCheckWxaShortLinkUI> f108945f;

    public C40556w(C45331f0.C45333b bVar, int i, String str, AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI, WeakReference<AppBrandCheckWxaShortLinkUI> weakReference) {
        this.f108941b = bVar;
        this.f108942c = i;
        this.f108943d = str;
        this.f108944e = appBrandCheckWxaShortLinkUI;
        this.f108945f = weakReference;
    }

    /* renamed from: a */
    public C47398l mo63355a() {
        return C47399m.f127176a;
    }

    /* renamed from: b */
    public void mo63356b(Context context, AbsWxaShortLinkLauncher.WxaShortLinkLaunchParams wxaShortLinkLaunchParams, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(wxaShortLinkLaunchParams, "params");
        C87412m.m108594g(lVar, "launchResultCallback");
        C86299o oVar = new C86299o();
        C45331f0.C45333b bVar = this.f108941b;
        int i = this.f108942c;
        String str = this.f108943d;
        oVar.f250930b = wxaShortLinkLaunchParams.f108856d;
        oVar.f250934f = wxaShortLinkLaunchParams.f108857e;
        oVar.f250932d = wxaShortLinkLaunchParams.f108858f;
        oVar.f250931c = wxaShortLinkLaunchParams.f108859g;
        oVar.f250920I = wxaShortLinkLaunchParams.f108860h;
        oVar.f250939k = bVar.f122801d;
        oVar.f250941m = bVar.f122802e;
        oVar.f250921J = i;
        oVar.f250940l = str;
        Log.m105924i("MicroMsg.AppBrandCheckWxaShortLinkUI", "launchWxa  appId=" + oVar.f250930b + " \nenterPath=" + oVar.f250934f + " \nversion=" + oVar.f250932d + " \nversionType=" + oVar.f250931c + " \nshortLink=" + oVar.f250920I + " \nscene=" + oVar.f250939k + " \nprescene=" + oVar.f250941m + 10);
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
        lVar.invoke(Boolean.TRUE);
    }

    /* renamed from: d */
    public boolean mo63358d(Activity activity, boolean z) {
        C87412m.m108594g(activity, "ctx");
        AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = this.f108945f.get();
        if (appBrandCheckWxaShortLinkUI == null) {
            return false;
        }
        if (appBrandCheckWxaShortLinkUI.f108876f.get()) {
            Log.m105924i("MicroMsg.AppBrandCheckWxaShortLinkUI", "CgiCheckWxaShortLink  callback , timeout, ignore cgi result");
            return false;
        }
        Runnable runnable = this.f108944e.f108875e;
        if (runnable != null) {
            MMHandlerThread.removeRunnable(runnable);
        }
        C89779i0 i0Var = this.f108944e.f108874d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (!z) {
            Log.m105924i("MicroMsg.AppBrandCheckWxaShortLinkUI", "CgiCheckWxaShortLink  CGI fail , go to fail H5 page");
            Intent intent = new Intent();
            String format = String.format("https://mp.weixin.qq.com/mp/waerrpage?appid=wx40f8626ddf43d362&type=tips&title=%s&msg=%s#wechat_redirect", Arrays.copyOf(new Object[]{C117627q.m165909b(activity.getString(C0966R.string.a8y), "UTF-8"), C117627q.m165909b(activity.getString(C0966R.string.a8x), "UTF-8")}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            intent.putExtra("rawUrl", format);
            intent.putExtra("forceHideShare", true);
            C88144b.m109791i(this.f108944e.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        return true;
    }

    /* renamed from: f */
    public C35624a mo63409f() {
        return this.f108944e.mo63378I7(this.f108941b);
    }
}
