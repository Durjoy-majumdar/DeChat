package com.tencent.p014mm.plugin.taskbar.p110ui;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.p */
public class C71339p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TaskBarContainer f206634d;

    public C71339p(TaskBarContainer taskBarContainer) {
        this.f206634d = taskBarContainer;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C71331l lVar = this.f206634d.f206445d;
        if (lVar != null && lVar.mo98260g()) {
            this.f206634d.f206445d.mo98254a(16);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
