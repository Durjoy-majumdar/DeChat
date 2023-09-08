package com.tencent.p014mm.pluginsdk.p133ui.chat;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.r1 */
public class C72823r1 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C72826s1 f212221d;

    public C72823r1(C72826s1 s1Var) {
        this.f212221d = s1Var;
    }

    public boolean onTimerExpired() {
        C76901s0 s0Var = this.f212221d.f212231h;
        if (s0Var == null) {
            return false;
        }
        s0Var.dismiss();
        return false;
    }
}
