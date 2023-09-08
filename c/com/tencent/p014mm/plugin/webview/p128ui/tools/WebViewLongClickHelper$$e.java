package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.bottomsheet.ViewTitleWithAnimation;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import p248ug.C52570c0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$$e */
public class WebViewLongClickHelper$$e implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ WebViewLongClickHelper f118427d;

    public WebViewLongClickHelper$$e(WebViewLongClickHelper webViewLongClickHelper) {
        this.f118427d = webViewLongClickHelper;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        boolean z;
        WebViewLongClickHelper webViewLongClickHelper = this.f118427d;
        boolean l = webViewLongClickHelper.mo68198l();
        try {
            z = webViewLongClickHelper.f118406o.getController().f117601y.mo68094Fu();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebViewLongClickHelper", "get has setuin failed : %s", e.getMessage());
            z = false;
        }
        boolean e2 = webViewLongClickHelper.f118406o.getController().f117539M.mo70859b().mo69434e();
        boolean a = webViewLongClickHelper.f118406o.getController().f117539M.mo70859b().mo69429a();
        Log.m105925i("MicroMsg.WebViewLongClickHelper", "installMenuItems hasSetAcc = %b, canShareImage = %b, canFavImage = %b", Boolean.valueOf(z), Boolean.valueOf(e2), Boolean.valueOf(a));
        ArrayList arrayList = new ArrayList();
        if (!l) {
            if (z && e2) {
                arrayList.add(new WebViewLongClickHelper$$h(1, webViewLongClickHelper.mo68194h().getString(C0966R.string.hre)));
            }
            arrayList.add(new WebViewLongClickHelper$$h(2, webViewLongClickHelper.mo68194h().getString(C0966R.string.iaq)));
            if (z && a) {
                arrayList.add(new WebViewLongClickHelper$$h(3, webViewLongClickHelper.mo68194h().getString(C0966R.string.f361137hk2)));
            }
            if (!((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58182e()) {
                arrayList.add(new WebViewLongClickHelper$$h(5, webViewLongClickHelper.mo68194h().getString(C0966R.string.hlo)));
                Bundle bundle = new Bundle();
                try {
                    bundle.putString("web_search_data_ui_image_path", webViewLongClickHelper.f118393b);
                    bundle.putString("web_search_data_ui_image_path_origin_url", webViewLongClickHelper.f118400i);
                    webViewLongClickHelper.f118406o.getController().f117601y.mo68145pG(54, bundle, webViewLongClickHelper.f118406o.getController().mo67719g());
                } catch (RemoteException e3) {
                    Log.m105929w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic exp:%s", e3.getLocalizedMessage());
                }
            }
        }
        if (!Util.isNullOrNil((List) webViewLongClickHelper.f118392a)) {
            arrayList.add(new WebViewLongClickHelper$$h(4, ((ScanCodeSheetItemLogic) webViewLongClickHelper.f118398g).mo67082m(webViewLongClickHelper.f118392a)));
        }
        webViewLongClickHelper.f118397f.mo107567l((View) null);
        e0Var.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            WebViewLongClickHelper$$h webViewLongClickHelper$$h = (WebViewLongClickHelper$$h) arrayList.get(i);
            int i2 = webViewLongClickHelper$$h.f118431a;
            if (i2 == 4) {
                C43847d1 d1Var = new C43847d1(webViewLongClickHelper);
                View c = ((ScanCodeSheetItemLogic) webViewLongClickHelper.f118398g).mo67072c(d1Var, webViewLongClickHelper.f118392a, (ImageQBarDataBean) null, 7);
                webViewLongClickHelper.f118397f.mo107567l(c);
                if (c instanceof ViewTitleWithAnimation) {
                    if (arrayList.size() > 1) {
                        ((ViewTitleWithAnimation) c).setTopPaddingVisibility(0);
                    } else {
                        ((ViewTitleWithAnimation) c).setTopPaddingVisibility(8);
                    }
                }
            } else {
                e0Var.mo107142f(i2, webViewLongClickHelper$$h.f118432b);
            }
        }
    }
}
