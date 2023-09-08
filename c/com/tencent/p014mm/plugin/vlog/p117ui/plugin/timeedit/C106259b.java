package com.tencent.p014mm.plugin.vlog.p117ui.plugin.timeedit;

import ai2.C26815p;
import ai2.C92018l;
import ai2.C92023q;
import android.view.MenuItem;
import android.view.View;
import fy3.C32226l;
import gy3.C87412m;
import nj3.C11184p0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.b */
public final class C106259b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ TimeEditorItemContainer f316808d;

    public C106259b(TimeEditorItemContainer timeEditorItemContainer) {
        this.f316808d = timeEditorItemContainer;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C92018l lVar;
        C87412m.m108594g(menuItem, "<anonymous parameter 0>");
        this.f316808d.getItemLayout().removeView(this.f316808d.f316783v);
        View view = this.f316808d.f316783v;
        C26815p pVar = view instanceof C26815p ? (C26815p) view : null;
        if (pVar != null) {
            C92023q qVar = pVar.f74566j;
            if (!(qVar == null || (lVar = qVar.f263519r) == null)) {
                lVar.mo125916a();
            }
            pVar.f74567n = false;
        }
        C32226l<View, C13598b0> itemChangeListener = this.f316808d.getItemChangeListener();
        if (itemChangeListener != null) {
            itemChangeListener.invoke(this.f316808d.f316783v);
        }
        TimeEditorItemContainer timeEditorItemContainer = this.f316808d;
        timeEditorItemContainer.post(timeEditorItemContainer.f316770F);
        this.f316808d.getClass();
    }
}
