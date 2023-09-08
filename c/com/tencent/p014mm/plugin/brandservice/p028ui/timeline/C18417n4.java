package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineUI;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.n4 */
public class C18417n4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI.C181783 f51097d;

    public C18417n4(BizTimeLineUI.C181783 r1) {
        this.f51097d = r1;
    }

    public void run() {
        BizTimeLineUI.this.f50246s.notifyDataSetChanged();
    }
}
