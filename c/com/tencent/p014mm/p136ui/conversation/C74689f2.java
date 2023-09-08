package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.conversation.f2 */
public class C74689f2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74685d2 f219583d;

    public C74689f2(C74685d2 d2Var) {
        this.f219583d = d2Var;
    }

    public void run() {
        C74685d2 d2Var = this.f219583d;
        if (!d2Var.f219572d) {
            int lastVisiblePosition = d2Var.f219569a.getLastVisiblePosition();
            int firstVisiblePosition = this.f219583d.f219569a.getFirstVisiblePosition();
            int i = lastVisiblePosition - firstVisiblePosition;
            C74685d2 d2Var2 = this.f219583d;
            if (firstVisiblePosition != d2Var2.f219575g) {
                d2Var2.f219575g = firstVisiblePosition;
                Log.m105919d("MicroMsg.PreLoadHelper", "Jacks PreLod to Show, fistVisibleItem: %d, visibleItemCout: %d", Integer.valueOf(firstVisiblePosition), Integer.valueOf(i));
                int i2 = lastVisiblePosition + 1;
                while (i2 < this.f219583d.f219570b.getCount() && i2 < (i * 1) + lastVisiblePosition) {
                    try {
                        this.f219583d.f219570b.mo103886M(i2);
                        i2++;
                    } catch (RuntimeException e) {
                        Log.printErrStackTrace("MicroMsg.PreLoadHelper", e, "Failed to preload MainUI avatars", new Object[0]);
                        return;
                    }
                }
                int i3 = firstVisiblePosition - 1;
                while (i3 >= 0 && i3 > firstVisiblePosition - (i * 1)) {
                    this.f219583d.f219570b.mo103886M(i3);
                    i3--;
                }
            }
        }
    }
}
