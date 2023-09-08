package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.FontChooserView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.WebViewUI$$l0 */
public class WebViewUI$$l0 implements FontChooserView.C44211a {

    /* renamed from: a */
    public final /* synthetic */ WebViewUI f118646a;

    public WebViewUI$$l0(WebViewUI webViewUI, WebViewUI.C438121 r2) {
        this.f118646a = webViewUI;
    }

    /* renamed from: a */
    public void mo68356a(int i) {
        int i2;
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 8;
                    break;
                default:
                    i2 = 2;
                    break;
            }
        } else {
            i2 = 1;
        }
        this.f118646a.f118513b1.mo67828z1(i2);
        try {
            if (this.f118646a.f118511a1.mo68094Fu()) {
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("WebViewFontUtil", 2);
                mmkv.putBoolean("webview_key_font_has_set", true);
                mmkv.putBoolean("webview_key_has_transfer_mp", true);
                mmkv.apply();
                MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("WebViewFontUtil", 2);
                mmkv2.putBoolean("webview_key_font_use_system", false);
                mmkv2.apply();
                this.f118646a.f118511a1.Yu0(16384, i2);
                this.f118646a.f118511a1.Yu0(16388, i2);
            }
        } catch (Exception e) {
            Log.m105928w("MicroMsg.WebViewUI", "onCheckedChanged, ex = " + e.getMessage());
        }
    }
}
