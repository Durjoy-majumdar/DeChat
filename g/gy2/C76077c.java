package gy2;

import android.view.View;
import ay2.C67113b;
import c00.C0406o;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import u73.C101982p;
import u73.C14134p0;

/* renamed from: gy2.c */
public final class C76077c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C67113b.C67114a f222944d;

    public C76077c(C67113b.C67114a aVar) {
        this.f222944d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TaskBarView taskBarView = (TaskBarView) this.f222944d;
        Class cls = C101982p.class;
        taskBarView.f206489W1 = false;
        taskBarView.f206490X1 = false;
        taskBarView.f206491Y1 = false;
        if (((C101982p) C86312j.m106911c(cls)) != null) {
            taskBarView.f206486T1 = true;
            C14134p0 p0Var = new C14134p0();
            p0Var.f39545b = 42;
            p0Var.f39546c = 262208;
            p0Var.f39565v = true ^ ((C0406o) C86312j.m106911c(C0406o.class)).yv0(42, 262208);
            ((C101982p) C86312j.m106911c(cls)).mo6883yJ(taskBarView.f206470D1, p0Var);
        }
        taskBarView.mo94380R(12, false, false, (String) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionSearchView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
