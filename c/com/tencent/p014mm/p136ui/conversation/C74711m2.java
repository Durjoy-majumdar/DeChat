package com.tencent.p014mm.p136ui.conversation;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C97625j3;
import hg0.C59893x0;
import hg0.C76186t;
import p286zl.C79396l;

/* renamed from: com.tencent.mm.ui.conversation.m2 */
public class C74711m2 implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ C74739q2 f219662d;

    public C74711m2(C74739q2 q2Var) {
        this.f219662d = q2Var;
    }

    public boolean queueIdle() {
        Log.m105918d("MicroMsg.RefreshHelper", "dkuploadAddrBook idleHandler");
        this.f219662d.getClass();
        if (C97625j3.m125811a() && C76186t.m91534b() == C79396l.SUCC && !C76186t.m91539g()) {
            C97625j3.m125815e().mo123460f(new C59893x0(C76186t.m91538f(), C76186t.m91536d()));
        }
        Looper.myQueue().removeIdleHandler(this.f219662d.f219779j);
        return false;
    }
}
