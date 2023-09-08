package com.tencent.p014mm.plugin.game.p061ui.message;

import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76912y0;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import vw1.C53004a0;
import vw1.C53006b0;

/* renamed from: com.tencent.mm.plugin.game.ui.message.p */
public class C42361p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C47350c.C47352b f114585d;

    /* renamed from: e */
    public final /* synthetic */ InteractiveMsgMRecycleView f114586e;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.p$a */
    public class C42362a implements l0$$e {
        public C42362a() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            String str2;
            C53006b0 b0Var = (C53006b0) cVar.f127056b.f127083a;
            if (b0Var == null) {
                Log.m105920e("MicroMsg.InteractiveMsgMRecycleView", "cgi 返回错误");
                return 0;
            }
            C53004a0 a0Var = b0Var.f147920d;
            if (!(a0Var == null || (str2 = a0Var.f147918e) == null || "".equals(str2))) {
                C76912y0.m92767f(C42361p.this.f114586e.f114489C1, b0Var.f147920d.f147918e);
            }
            return 0;
        }
    }

    public C42361p(InteractiveMsgMRecycleView interactiveMsgMRecycleView, C47350c.C47352b bVar) {
        this.f114586e = interactiveMsgMRecycleView;
        this.f114585d = bVar;
    }

    public void run() {
        C89144l0.m111429e(this.f114585d.mo72403a(), new C42362a(), false);
    }
}
