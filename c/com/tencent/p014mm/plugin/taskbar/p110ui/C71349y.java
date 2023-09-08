package com.tencent.p014mm.plugin.taskbar.p110ui;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import ey2.C75665a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.y */
public class C71349y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TaskBarView f206656d;

    public C71349y(TaskBarView taskBarView) {
        this.f206656d = taskBarView;
    }

    public void run() {
        C75665a aVar;
        T t;
        boolean z;
        if (this.f206656d.f206468B1.contains(4) && (aVar = this.f206656d.f206476J1) != null) {
            Iterator it = ((ArrayList) aVar.getViewModel().f192729d).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((MultiTaskInfo) it.next()).field_type == 21) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                Iterator<T> it4 = aVar.getViewModel().f192728c.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it4.next();
                    if (((MultiTaskInfo) t).field_type == 21) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                MultiTaskInfo multiTaskInfo = (MultiTaskInfo) t;
                if (multiTaskInfo != null) {
                    ((ArrayList) aVar.getViewModel().f192729d).set(i, multiTaskInfo);
                }
                aVar.f222263n.notifyItemChanged(i);
            }
        }
    }
}
