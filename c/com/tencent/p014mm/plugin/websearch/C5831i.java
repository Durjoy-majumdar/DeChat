package com.tencent.p014mm.plugin.websearch;

import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import p166hy.C8830s0;

/* renamed from: com.tencent.mm.plugin.websearch.i */
public class C5831i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TimeLineObject f21991d;

    public C5831i(FTSWebViewLogic fTSWebViewLogic, TimeLineObject timeLineObject) {
        this.f21991d = timeLineObject;
    }

    public void run() {
        ((C8830s0) C86312j.m106911c(C8830s0.class)).mo9666Zn(MMApplicationContext.getContext(), this.f21991d, 1);
    }
}
