package com.tencent.p014mm.plugin.component.editor;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import u21.C101943d;

/* renamed from: com.tencent.mm.plugin.component.editor.i */
public class C93075i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EditorUI f268122d;

    public C93075i(EditorUI editorUI) {
        this.f268122d = editorUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C101943d dVar = this.f268122d.f268047i;
        if (dVar != null) {
            dVar.f300124a.dismiss();
        }
        this.f268122d.f268046h.setVisibility(8);
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
