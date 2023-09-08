package com.tencent.p014mm.p136ui.chatting.component;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p504em.C75626b;
import s00.C90110f;

/* renamed from: com.tencent.mm.ui.chatting.component.k3 */
public class C73514k3 implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ C73497i3 f215958d;

    public C73514k3(C73497i3 i3Var) {
        this.f215958d = i3Var;
    }

    public boolean queueIdle() {
        Looper.myQueue().removeIdleHandler(this);
        if (this.f215958d.f215752d != null && !((C75626b) C86312j.m106911c(C75626b.class)).mo58021Xy()) {
            Log.m105924i("MicroMsg.ChattingUI.MessBoxComponent", "now try to activity the tools process");
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        }
        return false;
    }
}
