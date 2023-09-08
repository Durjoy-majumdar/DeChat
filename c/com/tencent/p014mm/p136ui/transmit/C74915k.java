package com.tencent.p014mm.p136ui.transmit;

import com.tencent.p014mm.p136ui.transmit.C74917p;
import com.tencent.p014mm.sdk.platformtools.Log;
import kb0.C76529i;

/* renamed from: com.tencent.mm.ui.transmit.k */
public class C74915k implements C76529i.C76532c {

    /* renamed from: a */
    public final /* synthetic */ SendAppMessageWrapperUI f220282a;

    public C74915k(SendAppMessageWrapperUI sendAppMessageWrapperUI) {
        this.f220282a = sendAppMessageWrapperUI;
    }

    /* renamed from: a */
    public void mo104153a(boolean z) {
        this.f220282a.f250380y = z;
        Log.m105924i("MicroMsg.SendAppMessageWrapperUI", "onSetTodo: ifSetTodo:" + this.f220282a.f250380y);
    }

    /* renamed from: b */
    public void mo104154b() {
        C74917p.m89752a(this.f220282a, (C74917p.C74919b) null);
    }
}
