package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.p136ui.conversation.C74720p;
import com.tencent.p014mm.storage.C72996z1;

/* renamed from: com.tencent.mm.ui.conversation.t0 */
public class C74743t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MainUI f219787d;

    public C74743t0(MainUI mainUI) {
        this.f219787d = mainUI;
    }

    public void run() {
        int i = 0;
        while (i < this.f219787d.f219476o.getChildCount()) {
            C74720p.C74733m mVar = (C74720p.C74733m) this.f219787d.f219476o.getChildAt(i).getTag();
            if (mVar == null || !C72996z1.m85813P4(mVar.f219757l)) {
                i++;
            } else {
                this.f219787d.f219476o.setHighLightChildNew(i);
                return;
            }
        }
    }
}
