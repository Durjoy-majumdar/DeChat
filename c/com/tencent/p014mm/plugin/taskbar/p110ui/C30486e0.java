package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.LinkedList;
import vx2.C37860g;
import vx2.C65900i;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.e0 */
public final class C30486e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<MultiTaskInfo> f82158d;

    /* renamed from: e */
    public final /* synthetic */ TaskBarViewPresenter f82159e;

    public C30486e0(LinkedList<MultiTaskInfo> linkedList, TaskBarViewPresenter taskBarViewPresenter) {
        this.f82158d = linkedList;
        this.f82159e = taskBarViewPresenter;
    }

    public final void run() {
        Log.m105924i("MicroMsg.TaskBarViewPresenter", "async remove timeout taskbar item");
        LinkedList<MultiTaskInfo> linkedList = this.f82158d;
        TaskBarViewPresenter taskBarViewPresenter = this.f82159e;
        for (MultiTaskInfo multiTaskInfo : linkedList) {
            taskBarViewPresenter.mo98237g(multiTaskInfo, 0, 2, 5);
            ((C65900i) C86312j.m106911c(C65900i.class)).yx0(multiTaskInfo);
            ((C37860g) C86312j.m106911c(C37860g.class)).mo61365E1(multiTaskInfo.field_id, false, 5);
        }
    }
}
