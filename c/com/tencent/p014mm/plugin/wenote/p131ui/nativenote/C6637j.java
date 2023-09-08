package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.j */
public class C6637j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f23917d;

    /* renamed from: e */
    public final /* synthetic */ NoteEditorUI f23918e;

    public C6637j(NoteEditorUI noteEditorUI, int i) {
        this.f23918e = noteEditorUI;
        this.f23917d = i;
    }

    public void run() {
        RecyclerView recyclerView = this.f23918e.f283257n;
        int i = this.f23917d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$38", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/wenote/ui/nativenote/NoteEditorUI$38", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
