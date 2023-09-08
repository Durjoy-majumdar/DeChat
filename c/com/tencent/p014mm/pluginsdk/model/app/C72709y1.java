package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import ld2.C46848g;
import p206nj.C11171e;
import p763ym.C53543s;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.pluginsdk.model.app.y1 */
public class C72709y1 extends C86301e {

    /* renamed from: d */
    public C72704x1 f211573d = null;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.y1$a */
    public class C72710a implements Runnable {
        public C72710a(C72709y1 y1Var) {
        }

        public void run() {
            SightVideoJNI.registerALL();
        }
    }

    public static C96776s Ax0() {
        return (C96776s) ((C53543s) C86312j.m106911c(C53543s.class)).mo74023HM();
    }

    public static C44550e0 Bx0() {
        return (C44550e0) ((C53543s) C86312j.m106911c(C53543s.class)).mo74025px();
    }

    public static C72684e vx0() {
        return (C72684e) ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ();
    }

    public static C44552f wx0() {
        return (C44552f) ((C53543s) C86312j.m106911c(C53543s.class)).mo74027t8();
    }

    public static C44577o xx0() {
        return C46848g.Ax0();
    }

    public static C44579p yx0() {
        return (C44579p) ((C53543s) C86312j.m106911c(C53543s.class)).Gk0();
    }

    public static C72704x1 zx0() {
        Class cls = C72709y1.class;
        C86709a0.m107523b().mo121108c();
        if (((C72709y1) C86312j.m106911c(cls)).f211573d == null) {
            ((C72709y1) C86312j.m106911c(cls)).f211573d = new C72704x1();
        }
        return ((C72709y1) C86312j.m106911c(cls)).f211573d;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C72710a aVar = new C72710a(this);
        try {
            aVar.run();
        } catch (Throwable th) {
            if (C11171e.m11044a(20)) {
                aVar.run();
                return;
            }
            throw th;
        }
    }

    public void onAccountReleased(Context context) {
        int size;
        C72704x1 x1Var = ((C72709y1) C86312j.m106911c(C72709y1.class)).f211573d;
        if (x1Var != null) {
            x1Var.f211558o = 0;
        }
        synchronized (C96790t0.f283533w) {
            size = C96790t0.f283532v.size();
            C96790t0.f283532v.clear();
        }
        if (C96790t0.f283534x == null) {
            Log.m105925i("MicroMsg.ImportMultiVideo", "do clear remuxing job, worker is null, setCount %d", Integer.valueOf(size));
            return;
        }
        Log.m105925i("MicroMsg.ImportMultiVideo", "do clear remuxing job, setCount %d, workerJobCount %d", Integer.valueOf(size), Integer.valueOf(C96790t0.f283534x.getQueueSize()));
        C96790t0.f283534x.clear();
        C96790t0.f283534x = null;
    }
}
