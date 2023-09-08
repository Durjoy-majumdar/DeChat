package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import android.os.MessageQueue;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.j */
public final class C18460j implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineHotView f51237d;

    public C18460j(BizTimeLineHotView bizTimeLineHotView) {
        this.f51237d = bizTimeLineHotView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r0 = r0.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean queueIdle() {
        /*
            r4 = this;
            android.os.MessageQueue r0 = android.os.Looper.myQueue()
            r0.removeIdleHandler(r4)
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51237d
            java.lang.ref.WeakReference r0 = r0.getMContextWeakRef()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.isFinishing()
            if (r0 != r1) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0025
            return r2
        L_0x0025:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51237d
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r3 = r0.f51166e
            if (r3 == 0) goto L_0x0030
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r> r0 = r0.f51172n
            r3.mo23002I1(r0, r1)
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18460j.queueIdle():boolean");
    }
}
