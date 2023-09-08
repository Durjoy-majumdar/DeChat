package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.os.Looper;
import android.os.MessageQueue;
import di3.C86312j;
import s00.C90110f;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.d0 */
public final class C40707d0 implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ int f109354d;

    public C40707d0(int i) {
        this.f109354d = i;
    }

    public boolean queueIdle() {
        Looper.myQueue().removeIdleHandler(this);
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        C40789z.f109640a.mo63722o(this.f109354d);
        C40789z.f109641b.set(false);
        return false;
    }
}
