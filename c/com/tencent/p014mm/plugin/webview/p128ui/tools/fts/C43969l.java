package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.view.MenuItem;
import android.widget.ImageView;
import gc0.C20828a;
import java.util.List;
import nj3.C76878h0;
import u73.C52466o0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.l */
public class C43969l implements C76878h0 {

    /* renamed from: a */
    public final /* synthetic */ List f119106a;

    /* renamed from: b */
    public final /* synthetic */ C43973p f119107b;

    public C43969l(C43973p pVar, List list) {
        this.f119107b = pVar;
        this.f119106a = list;
    }

    /* renamed from: a */
    public void mo6974a(ImageView imageView, ImageView imageView2, MenuItem menuItem) {
        C20828a.m22825b().mo32519h(((C52466o0) this.f119106a.get(menuItem.getItemId())).f146600a, imageView, this.f119107b.f119118b);
    }
}
