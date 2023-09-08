package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI */
public class QRCodeIntroductionWebViewUI extends WebViewUI {

    /* renamed from: I2 */
    public static final /* synthetic */ int f118342I2 = 0;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI$a */
    public class C43798a implements MenuItem.OnMenuItemClickListener {
        public C43798a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI = QRCodeIntroductionWebViewUI.this;
            int i = QRCodeIntroductionWebViewUI.f118342I2;
            C76879j.m92737h(qRCodeIntroductionWebViewUI, "", new String[]{qRCodeIntroductionWebViewUI.getString(C0966R.string.jgc), qRCodeIntroductionWebViewUI.getString(C0966R.string.hqb)}, "", false, new C44195s(qRCodeIntroductionWebViewUI));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI$b */
    public class C43799b implements MenuItem.OnMenuItemClickListener {
        public C43799b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            QRCodeIntroductionWebViewUI.this.finish();
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C43798a());
        setBackBtn(new C43799b());
    }
}
