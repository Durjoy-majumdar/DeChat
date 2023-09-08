package com.tencent.p014mm.plugin.webview.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.core.BaseWebViewController;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44255f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import gy3.C87412m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kg3.C76577a;
import kotlin.Metadata;
import v83.C52806b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/util/WebViewControllerPreloadMrg;", "", "<init>", "()V", "webview-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg */
public final class WebViewControllerPreloadMrg {

    /* renamed from: a */
    public static final WebViewControllerPreloadMrg f120348a = new WebViewControllerPreloadMrg();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, BaseWebViewController> f120349b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<String, C44255f1> f120350c = new ConcurrentHashMap<>();

    private WebViewControllerPreloadMrg() {
    }

    /* renamed from: a */
    public final void mo69174a(String str, BaseWebViewController baseWebViewController, boolean z, int i, int i2, int i3) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(baseWebViewController, "controller");
        if (!mo69176c(str)) {
            Log.m105928w("MicroMsg.WebViewControllerPreloadMrg", "addToCache, url=" + str + " has cached!");
            return;
        }
        Log.m105924i("MicroMsg.WebViewControllerPreloadMrg", "addToCache " + str);
        ConcurrentHashMap<String, BaseWebViewController> concurrentHashMap = f120349b;
        if (XWebSdk.isSysWebView()) {
            Context activityContextIfHas = baseWebViewController.f117553a.getActivityContextIfHas();
            if (activityContextIfHas instanceof Activity) {
                View decorView = ((Activity) activityContextIfHas).getWindow().getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null) {
                    FrameLayout frameLayout = new FrameLayout(activityContextIfHas);
                    frameLayout.setVisibility(4);
                    frameLayout.addView(baseWebViewController.f117553a);
                    viewGroup.addView(frameLayout, 0);
                }
            }
        }
        if (i <= 0) {
            i = C76577a.m92145A(baseWebViewController.f117553a.getContext());
        }
        int j = C76577a.m92159j(baseWebViewController.f117553a.getContext());
        if (i2 <= 0) {
            i2 = z ? (int) (((double) j) * 0.75d) : j;
        }
        baseWebViewController.f117553a.setWebContentsSize(i, i2);
        baseWebViewController.f117553a.setWebChromeClient(new WebViewControllerPreloadMrg$addToCache$1$2(baseWebViewController));
        C52806b bVar = baseWebViewController.f117573k;
        bVar.f147524b = z;
        bVar.f147534l = true;
        baseWebViewController.mo67741p(new WebViewControllerPreloadMrg$addToCache$1$3(baseWebViewController, str));
        baseWebViewController.init();
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("useJs", true);
        intent.putExtra("geta8key_scene", i3);
        baseWebViewController.mo67677I(intent);
        concurrentHashMap.put(str, baseWebViewController);
    }

    /* renamed from: b */
    public final int mo69175b() {
        MMWebView mMWebView;
        for (Map.Entry next : f120349b.entrySet()) {
            String str = (String) next.getKey();
            BaseWebViewController baseWebViewController = (BaseWebViewController) next.getValue();
            boolean z = false;
            if (baseWebViewController != null && !baseWebViewController.f117530G) {
                z = true;
            }
            if (z) {
                if (!(baseWebViewController == null || (mMWebView = baseWebViewController.f117553a) == null)) {
                    mMWebView.destroy();
                }
                if (baseWebViewController != null) {
                    baseWebViewController.onDestroy();
                }
                Log.m105924i("MicroMsg.WebViewControllerPreloadMrg", "destroy " + str);
            }
        }
        ConcurrentHashMap<String, BaseWebViewController> concurrentHashMap = f120349b;
        int size = concurrentHashMap.size();
        concurrentHashMap.clear();
        f120350c.clear();
        return size;
    }

    /* renamed from: c */
    public final boolean mo69176c(String str) {
        C87412m.m108594g(str, "url");
        ConcurrentHashMap<String, BaseWebViewController> concurrentHashMap = f120349b;
        if (concurrentHashMap.size() <= 2) {
            return concurrentHashMap.get(str) == null;
        }
        Log.m105928w("MicroMsg.WebViewControllerPreloadMrg", "shouldPreload, do not cache more than 2 WebViewController!!!");
        return false;
    }
}
