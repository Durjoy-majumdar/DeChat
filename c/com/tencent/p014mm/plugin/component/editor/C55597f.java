package com.tencent.p014mm.plugin.component.editor;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.component.editor.f */
public class C55597f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f158278d;

    /* renamed from: e */
    public final /* synthetic */ EditorUI f158279e;

    public C55597f(EditorUI editorUI, int i) {
        this.f158279e = editorUI;
        this.f158278d = i;
    }

    public void run() {
        RecyclerView recyclerView = this.f158279e.f268042d;
        int i = this.f158278d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/component/editor/EditorUI$11", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/component/editor/EditorUI$11", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
    }
}
