package com.tencent.p014mm.p136ui.chatting.component;

import ck3.C67391b;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.component.n4 */
public class C73555n4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C73534m4 f216055d;

    public C73555n4(C73534m4 m4Var) {
        this.f216055d = m4Var;
    }

    public void run() {
        C73534m4 m4Var = this.f216055d;
        if (!m4Var.f216005x) {
            m4Var.f216005x = true;
            m4Var.f215996o = -1;
            C67391b bVar = m4Var.f215752d;
            if (bVar != null) {
                bVar.mo91540A();
            }
            Log.m105924i("MicroMsg.ChattingUI.SearchComponent", "dismiss fts highlight");
        }
    }
}
