package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.z */
public class C71350z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f206657d;

    /* renamed from: e */
    public final /* synthetic */ TaskBarView f206658e;

    public C71350z(TaskBarView taskBarView, int i) {
        this.f206658e = taskBarView;
        this.f206657d = i;
    }

    public void run() {
        boolean z = false;
        Log.m105925i("MicroMsg.TaskBarView", "onSectionDeleted %d", Integer.valueOf(this.f206657d));
        if (this.f206657d != 4 || ((ArrayList) this.f206658e.f206512z1.mo98231a(4).f192729d).isEmpty()) {
            TaskBarView taskBarView = this.f206658e;
            int i = this.f206657d;
            int i2 = TaskBarView.f206466s2;
            int indexOf = taskBarView.f206468B1.indexOf(Integer.valueOf(i));
            if (indexOf == -1) {
                Log.m105924i("MicroMsg.TaskBarView", "section not found!");
                return;
            }
            this.f206658e.f206468B1.remove(indexOf);
            this.f206658e.getAdapter().notifyItemRemoved(indexOf);
            int size = this.f206658e.f206468B1.size();
            boolean contains = this.f206658e.f206468B1.contains(5);
            if (size - (contains ? 1 : 0) == 1 && this.f206658e.f206468B1.get(contains).intValue() == 3) {
                z = true;
            }
            this.f206658e.mo98199H1();
            if (this.f206658e.f206468B1.size() <= size && !z) {
                return;
            }
            if (z) {
                this.f206658e.getAdapter().notifyItemChanged(this.f206658e.f206468B1.indexOf(3));
                return;
            }
            if (this.f206658e.f206468B1.size() > contains + true) {
                Log.m105924i("MicroMsg.TaskBarView", "other tips show[remove section], mark");
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TASKBAR_HAS_SHOWED_EMPTY_OTHER_TIPS_BOOLEAN_SYNC, Boolean.TRUE);
            }
            this.f206658e.getAdapter().notifyItemInserted(this.f206658e.f206468B1.size() - 1);
            return;
        }
        Log.m105924i("MicroMsg.TaskBarView", "showDataList not empty!");
    }
}
