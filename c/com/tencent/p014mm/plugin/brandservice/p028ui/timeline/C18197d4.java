package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.d4 */
public class C18197d4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f50295d;

    /* renamed from: e */
    public final /* synthetic */ int f50296e;

    /* renamed from: f */
    public final /* synthetic */ BizTimeLineUI f50297f;

    public C18197d4(BizTimeLineUI bizTimeLineUI, C19623o0 o0Var, int i) {
        this.f50297f = bizTimeLineUI;
        this.f50295d = o0Var;
        this.f50296e = i;
    }

    public void run() {
        BizTimeLineUI bizTimeLineUI = this.f50297f;
        int i = bizTimeLineUI.f50228V;
        bizTimeLineUI.f50228V = i + 1;
        if (i > 20 || bizTimeLineUI.f50218K || bizTimeLineUI.f50217J != 0) {
            bizTimeLineUI.mo22783K7(this.f50295d);
            Log.m105925i("MicroMsg.BizTimeLineUI", "tryToScrollToPosition fail userTouched: %b state: %d tryScrollTimes: %d", Boolean.valueOf(this.f50297f.f50218K), Integer.valueOf(this.f50297f.f50217J), Integer.valueOf(this.f50297f.f50228V));
            return;
        }
        bizTimeLineUI.mo22784L7(this.f50295d, this.f50296e);
    }
}
