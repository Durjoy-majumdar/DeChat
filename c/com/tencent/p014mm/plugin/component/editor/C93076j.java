package com.tencent.p014mm.plugin.component.editor;

import androidx.recyclerview.widget.LinearLayoutManager;
import p21.C100616a;
import p21.C100631p;
import u21.C101941c;

/* renamed from: com.tencent.mm.plugin.component.editor.j */
public class C93076j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditorUI f268123d;

    public C93076j(EditorUI editorUI) {
        this.f268123d = editorUI;
    }

    public void run() {
        try {
            int D = ((LinearLayoutManager) this.f268123d.f268042d.getLayoutManager()).mo16958D();
            C100616a l = C101941c.m134173q().mo141456l(D);
            if (l != null && l.mo140076b() == 4 && !((C100631p) l).f294812q) {
                this.f268123d.mo94191h2(D, 0);
            }
        } catch (NullPointerException unused) {
        }
    }
}
