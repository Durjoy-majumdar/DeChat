package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import vx2.C37860g;
import vx2.C65900i;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.d0 */
public final class C30485d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TaskBarViewPresenter f82157d;

    public C30485d0(TaskBarViewPresenter taskBarViewPresenter) {
        this.f82157d = taskBarViewPresenter;
    }

    public final void run() {
        TaskBarViewPresenter taskBarViewPresenter = this.f82157d;
        synchronized (taskBarViewPresenter) {
            Log.m105925i("MicroMsg.TaskBarViewPresenter", "removeExceedData %d", Integer.valueOf(taskBarViewPresenter.f206530i.size()));
            for (MultiTaskInfo multiTaskInfo : taskBarViewPresenter.f206530i) {
                ((C65900i) C86312j.m106911c(C65900i.class)).yx0(multiTaskInfo);
                ((C37860g) C86312j.m106911c(C37860g.class)).mo61365E1(multiTaskInfo.field_id, false, 4);
                taskBarViewPresenter.mo98237g(multiTaskInfo, 0, 2, 4);
            }
            taskBarViewPresenter.f206530i.clear();
        }
    }
}
