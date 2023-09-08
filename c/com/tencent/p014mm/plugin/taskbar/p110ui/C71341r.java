package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.r */
public class C71341r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TaskBarContainer f206636d;

    public C71341r(TaskBarContainer taskBarContainer) {
        this.f206636d = taskBarContainer;
    }

    public void run() {
        TaskBarContainer taskBarContainer = this.f206636d;
        int i = TaskBarContainer.f206434K;
        taskBarContainer.mo98170g();
        if (C85875k4.m106211z()) {
            TaskBarContainer taskBarContainer2 = this.f206636d;
            int color = taskBarContainer2.getResources().getColor(C0966R.color.f3275lu);
            TaskBarBottomView taskBarBottomView = taskBarContainer2.f206463y;
            if (taskBarBottomView != null) {
                taskBarBottomView.setDrawColor(color);
                return;
            }
            return;
        }
        TaskBarContainer taskBarContainer3 = this.f206636d;
        int color2 = taskBarContainer3.getResources().getColor(C0966R.color.a7_);
        TaskBarBottomView taskBarBottomView2 = taskBarContainer3.f206463y;
        if (taskBarBottomView2 != null) {
            taskBarBottomView2.setDrawColor(color2);
        }
    }
}
