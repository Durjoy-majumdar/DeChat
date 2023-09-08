package com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view;

import android.view.View;
import com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view.BrowserSettingDialogView;
import j20.C117292a;
import java.util.ArrayList;
import m93.C46973j;
import n93.C47212c;
import p93.C11874a;
import sx3.C110818d0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.c */
public final class C43843c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BrowserSettingDialogView f118751d;

    /* renamed from: e */
    public final /* synthetic */ BrowserSettingDialogView.C43840b f118752e;

    /* renamed from: f */
    public final /* synthetic */ BrowserSettingDialogView.C43839a f118753f;

    public C43843c(BrowserSettingDialogView browserSettingDialogView, BrowserSettingDialogView.C43840b bVar, BrowserSettingDialogView.C43839a aVar) {
        this.f118751d = browserSettingDialogView;
        this.f118752e = bVar;
        this.f118753f = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$BrowserItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f118751d.f118736o = this.f118752e.mo17363j();
        BrowserSettingDialogView browserSettingDialogView = this.f118751d;
        C47212c cVar = browserSettingDialogView.f118734j;
        if (cVar != null) {
            C11874a aVar = browserSettingDialogView.f118733i;
            int i = browserSettingDialogView.f118736o;
            cVar.mo72137c(aVar, view, i, (C46973j) C110818d0.m150917O(this.f118753f.f118738e, i));
        }
        this.f118753f.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserSettingDialogView$BrowserItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
