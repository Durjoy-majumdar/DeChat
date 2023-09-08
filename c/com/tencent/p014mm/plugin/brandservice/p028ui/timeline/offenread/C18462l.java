package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.l */
public final class C18462l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineHotView f51240d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18462l(BizTimeLineHotView bizTimeLineHotView) {
        super(0);
        this.f51240d = bizTimeLineHotView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r4 = this;
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            java.lang.ref.WeakReference r0 = r0.getMContextWeakRef()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isFinishing()
            if (r0 != r1) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x001f
            goto L_0x00be
        L_0x001f:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r> r0 = r0.f51172n
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            r3 = 8
            if (r0 == 0) goto L_0x0040
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            boolean r0 = r0.mo23029a()
            if (r0 != 0) goto L_0x0040
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            android.widget.LinearLayout r0 = r0.f51167f
            if (r0 != 0) goto L_0x003b
            goto L_0x00be
        L_0x003b:
            r0.setVisibility(r3)
            goto L_0x00be
        L_0x0040:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r> r0 = r0.f51172n
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 == 0) goto L_0x0055
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            android.widget.TextView r0 = r0.f51168g
            if (r0 != 0) goto L_0x0051
            goto L_0x005f
        L_0x0051:
            r0.setVisibility(r3)
            goto L_0x005f
        L_0x0055:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            android.widget.TextView r0 = r0.f51168g
            if (r0 != 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            r0.setVisibility(r2)
        L_0x005f:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            boolean r0 = r0.mo23029a()
            if (r0 == 0) goto L_0x0072
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            android.widget.TextView r0 = r0.f51169h
            if (r0 != 0) goto L_0x006e
            goto L_0x007c
        L_0x006e:
            r0.setVisibility(r2)
            goto L_0x007c
        L_0x0072:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            android.widget.TextView r0 = r0.f51169h
            if (r0 != 0) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r0.setVisibility(r3)
        L_0x007c:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            android.widget.LinearLayout r0 = r0.f51167f
            if (r0 == 0) goto L_0x0089
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            if (r1 != 0) goto L_0x0096
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            android.widget.LinearLayout r0 = r0.f51167f
            if (r0 != 0) goto L_0x0093
            goto L_0x0096
        L_0x0093:
            r0.setVisibility(r2)
        L_0x0096:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r0 = r4.f51240d
            boolean r1 = r0.f51180v
            if (r1 == 0) goto L_0x00a8
            r0.f51180v = r2
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r1 = r0.f51166e
            if (r1 == 0) goto L_0x00be
            java.util.concurrent.CopyOnWriteArrayList<com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r> r0 = r0.f51172n
            r1.mo23002I1(r0, r2)
            goto L_0x00be
        L_0x00a8:
            android.os.MessageQueue r0 = android.os.Looper.myQueue()
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r1 = r4.f51240d
            android.os.MessageQueue$IdleHandler r1 = r1.f51181w
            r0.removeIdleHandler(r1)
            android.os.MessageQueue r0 = android.os.Looper.myQueue()
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView r1 = r4.f51240d
            android.os.MessageQueue$IdleHandler r1 = r1.f51181w
            r0.addIdleHandler(r1)
        L_0x00be:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18462l.invoke():java.lang.Object");
    }
}
