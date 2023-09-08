package com.tencent.p014mm.plugin.taskbar.p110ui;

import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.a0 */
public class C5519a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TaskBarView f21366d;

    public C5519a0(TaskBarView taskBarView) {
        this.f21366d = taskBarView;
    }

    public void run() {
        TaskBarView taskBarView = this.f21366d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(taskBarView, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/TaskBarView$8", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        taskBarView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(taskBarView, "com/tencent/mm/plugin/taskbar/ui/TaskBarView$8", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        this.f21366d.setTranslationY(0.0f);
    }
}
