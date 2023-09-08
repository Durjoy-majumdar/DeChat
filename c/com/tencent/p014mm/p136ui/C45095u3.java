package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import p244tt.C14088e;

/* renamed from: com.tencent.mm.ui.u3 */
public class C45095u3 implements C14088e.C14090b {

    /* renamed from: a */
    public final /* synthetic */ SingleChatInfoUI f122329a;

    public C45095u3(SingleChatInfoUI singleChatInfoUI) {
        this.f122329a = singleChatInfoUI;
    }

    /* renamed from: a */
    public void mo1717a() {
        Log.m105924i("MicroMsg.SingleChatInfoUI", "OpenLiteApp success");
    }

    /* renamed from: b */
    public void mo1718b() {
        Log.m105924i("MicroMsg.SingleChatInfoUI", "OpenLiteApp fail");
        SingleChatInfoUI singleChatInfoUI = this.f122329a;
        boolean z = SingleChatInfoUI.f121192y;
        singleChatInfoUI.mo69885H7();
    }
}
