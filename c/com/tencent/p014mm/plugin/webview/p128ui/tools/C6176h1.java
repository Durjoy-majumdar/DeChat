package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import nj3.C47268j0;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.h1 */
public class C6176h1 implements C47268j0 {

    /* renamed from: a */
    public final /* synthetic */ C43977g1 f22646a;

    public C6176h1(C43977g1 g1Var) {
        this.f22646a = g1Var;
    }

    /* renamed from: a */
    public void mo7130a(TextView textView, MenuItem menuItem) {
        String str = menuItem.getTitle() + "";
        if (textView != null) {
            String str2 = this.f22646a.f119132e.get(str);
            if (Util.isNullOrNil(str2)) {
                this.f22646a.getClass();
                textView.setText(str);
                return;
            }
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f22646a.mo68388b(), str2, textView.getTextSize()));
        }
    }
}
