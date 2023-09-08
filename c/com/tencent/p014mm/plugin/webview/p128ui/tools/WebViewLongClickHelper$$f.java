package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import java.util.ArrayList;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$f */
public class WebViewLongClickHelper$$f implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f118428d;

    /* renamed from: e */
    public final /* synthetic */ WebViewLongClickHelper f118429e;

    public WebViewLongClickHelper$$f(WebViewLongClickHelper webViewLongClickHelper, String str) {
        this.f118429e = webViewLongClickHelper;
        this.f118428d = str;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        ImageQBarDataBean imageQBarDataBean = null;
        if (itemId == 1) {
            WebViewLongClickHelper.m47786c(this.f118429e, 1, (ImageQBarDataBean) null);
            WebViewLongClickHelper webViewLongClickHelper = this.f118429e;
            String str = this.f118428d;
            try {
                C44625c2.m49072e(webViewLongClickHelper.mo68194h(), str, webViewLongClickHelper.f118400i, CookieManager.getInstance().getCookie(str), webViewLongClickHelper.mo68193g(), new C43857f1(webViewLongClickHelper));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e.getMessage());
            }
        } else if (itemId == 2) {
            WebViewLongClickHelper webViewLongClickHelper2 = this.f118429e;
            ArrayList<ImageQBarDataBean> arrayList = webViewLongClickHelper2.f118392a;
            if (arrayList != null && arrayList.size() > 0) {
                imageQBarDataBean = this.f118429e.f118392a.get(0);
            }
            WebViewLongClickHelper.m47786c(webViewLongClickHelper2, 2, imageQBarDataBean);
            WebViewLongClickHelper webViewLongClickHelper3 = this.f118429e;
            String str2 = this.f118428d;
            webViewLongClickHelper3.getClass();
            try {
                C44625c2.m49077j(webViewLongClickHelper3.mo68194h(), str2, webViewLongClickHelper3.f118400i, CookieManager.getInstance().getCookie(str2), webViewLongClickHelper3.mo68193g());
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.WebViewLongClickHelper", "save to sdcard failed : %s", e2.getMessage());
            }
        } else if (itemId == 3) {
            WebViewLongClickHelper.m47786c(this.f118429e, 3, (ImageQBarDataBean) null);
            WebViewLongClickHelper webViewLongClickHelper4 = this.f118429e;
            String str3 = this.f118428d;
            webViewLongClickHelper4.getClass();
            try {
                boolean g = webViewLongClickHelper4.mo68193g();
                String replaceAll = str3.replaceAll("tp=webp", "");
                C44625c2.m49072e(webViewLongClickHelper4.mo68194h(), replaceAll, webViewLongClickHelper4.f118400i, CookieManager.getInstance().getCookie(replaceAll), g, new C43831a1(webViewLongClickHelper4));
            } catch (Exception e3) {
                Log.m105920e("MicroMsg.WebViewLongClickHelper", "onMenuItemClick fail, ex = " + e3.getMessage());
            }
        } else if (itemId == 5) {
            WebViewLongClickHelper.m47786c(this.f118429e, 7, (ImageQBarDataBean) null);
            WebViewLongClickHelper webViewLongClickHelper5 = this.f118429e;
            String str4 = this.f118428d;
            webViewLongClickHelper5.getClass();
            if (Util.isNullOrNil(str4)) {
                Log.m105928w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic mResultOfImageUrl nil");
                return;
            }
            try {
                C44625c2.m49072e(webViewLongClickHelper5.mo68194h(), str4, webViewLongClickHelper5.f118400i, CookieManager.getInstance().getCookie(str4), webViewLongClickHelper5.mo68193g(), new C43834b1(webViewLongClickHelper5));
            } catch (Exception e4) {
                Log.m105929w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic Exception:%s", e4.getLocalizedMessage());
            }
            Log.m105924i("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic");
        }
    }
}
