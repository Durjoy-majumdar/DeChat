package com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view;

import android.graphics.drawable.Drawable;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserChooseDialogView;
import m93.C46971i;
import m93.C46973j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.a */
public final class C43841a implements C46971i.C46972a {

    /* renamed from: a */
    public final /* synthetic */ C46973j f118745a;

    /* renamed from: b */
    public final /* synthetic */ BrowserChooseDialogView.C43837a f118746b;

    /* renamed from: c */
    public final /* synthetic */ int f118747c;

    public C43841a(C46973j jVar, BrowserChooseDialogView.C43837a aVar, int i) {
        this.f118745a = jVar;
        this.f118746b = aVar;
        this.f118747c = i;
    }

    /* renamed from: a */
    public void mo68403a(Drawable drawable) {
        this.f118745a.f126287c = drawable;
        this.f118746b.notifyItemChanged(this.f118747c);
    }
}
