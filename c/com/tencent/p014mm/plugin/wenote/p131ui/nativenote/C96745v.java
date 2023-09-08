package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import ab3.C91983a;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.v */
public class C96745v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91983a f283391d;

    /* renamed from: e */
    public final /* synthetic */ C96728e0 f283392e;

    public C96745v(C96728e0 e0Var, C91983a aVar) {
        this.f283392e = e0Var;
        this.f283391d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C96728e0 e0Var = this.f283392e;
        View view2 = e0Var.f283353a;
        int i = (view2 == null || view2.getVisibility() == 8) ? 0 : e0Var.f283355c.getVisibility() == 0 ? 3 : 1;
        Log.m105925i("MicroMsg.WNNoteFootPannel", "WNNoteFootPanel styleButton onClick, ret:%s", Integer.valueOf(i));
        if (i == 1) {
            ((NoteEditorUI) this.f283391d).mo134937e8(false, 0);
            ((NoteEditorUI) this.f283391d).mo134936d8(3, 100);
        } else if (i == 3) {
            ((NoteEditorUI) this.f283391d).mo134937e8(true, 50);
            ((NoteEditorUI) this.f283391d).mo134936d8(1, 0);
        } else if (i == 2) {
            ((NoteEditorUI) this.f283391d).mo134936d8(3, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteFootPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
