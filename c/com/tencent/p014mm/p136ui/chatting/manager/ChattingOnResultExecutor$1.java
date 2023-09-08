package com.tencent.p014mm.p136ui.chatting.manager;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;

/* renamed from: com.tencent.mm.ui.chatting.manager.ChattingOnResultExecutor$1 */
public class ChattingOnResultExecutor$1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Fragment f348350d;

    public ChattingOnResultExecutor$1(C73759b bVar, Fragment fragment) {
        this.f348350d = fragment;
    }

    public void run() {
        if (this.f348350d.getLifecycle().getCurrentState() == C39623j.C39626c.DESTROYED) {
            C73759b.f216516b.remove(this.f348350d);
        } else {
            this.f348350d.getLifecycle().addObserver(new C0124r() {
                @C112974b0(C39623j.C39625b.ON_DESTROY)
                public void onDestroy() {
                    C73759b.f216516b.remove(ChattingOnResultExecutor$1.this.f348350d);
                }
            });
        }
    }
}
