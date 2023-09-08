package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import androidx.recyclerview.widget.LinearLayoutManager;
import xa3.C102587c;
import xa3.C102596l;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.e */
public class C96727e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NoteEditorUI f283352d;

    public C96727e(NoteEditorUI noteEditorUI) {
        this.f283352d = noteEditorUI;
    }

    public void run() {
        try {
            int D = ((LinearLayoutManager) this.f283352d.f283257n.getLayoutManager()).mo16958D();
            C102587c k = this.f283352d.f283238X0.mo126201k(D);
            if (k != null && k.mo142212c() == 4 && !((C102596l) k).f302100q) {
                this.f283352d.mo134940h2(D, 0);
            }
        } catch (NullPointerException unused) {
        }
    }
}
