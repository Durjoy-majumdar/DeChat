package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.webview.luggage.n1 */
public class C43663n1 {

    /* renamed from: a */
    public boolean f118026a;

    /* renamed from: b */
    public String f118027b;

    /* renamed from: c */
    public String f118028c;

    /* renamed from: d */
    public String f118029d;

    /* renamed from: e */
    public String f118030e;

    /* renamed from: f */
    public String f118031f;

    /* renamed from: g */
    public String f118032g;

    /* renamed from: h */
    public String f118033h = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());

    public C43663n1(Bundle bundle) {
        this.f118026a = bundle.getBoolean("close_window_confirm_dialog_switch");
        this.f118027b = bundle.getString("close_window_confirm_dialog_title_cn");
        this.f118028c = bundle.getString("close_window_confirm_dialog_title_eng");
        this.f118029d = bundle.getString("close_window_confirm_dialog_ok_cn");
        this.f118030e = bundle.getString("close_window_confirm_dialog_ok_eng");
        this.f118031f = bundle.getString("close_window_confirm_dialog_cancel_cn");
        this.f118032g = bundle.getString("close_window_confirm_dialog_cancel_eng");
    }
}
