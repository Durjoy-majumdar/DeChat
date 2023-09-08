package com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view;

import android.graphics.drawable.Drawable;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserSettingDialogView;
import m93.C46971i;
import m93.C46973j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.d */
public final class C43844d implements C46971i.C46972a {

    /* renamed from: a */
    public final /* synthetic */ C46973j f118754a;

    /* renamed from: b */
    public final /* synthetic */ BrowserSettingDialogView.C43839a f118755b;

    /* renamed from: c */
    public final /* synthetic */ int f118756c;

    public C43844d(C46973j jVar, BrowserSettingDialogView.C43839a aVar, int i) {
        this.f118754a = jVar;
        this.f118755b = aVar;
        this.f118756c = i;
    }

    /* renamed from: a */
    public void mo68403a(Drawable drawable) {
        this.f118754a.f126287c = drawable;
        this.f118755b.notifyItemChanged(this.f118756c);
    }
}
