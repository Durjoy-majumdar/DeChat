package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import gy3.C87412m;
import p749xh.C112150i9;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.model.g0$$g */
public final /* synthetic */ class g0$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f317316d;

    /* renamed from: e */
    public final /* synthetic */ int f317317e;

    /* renamed from: f */
    public final /* synthetic */ String f317318f;

    /* renamed from: g */
    public final /* synthetic */ String f317319g;

    /* renamed from: h */
    public final /* synthetic */ int f317320h;

    /* renamed from: i */
    public final /* synthetic */ boolean f317321i;

    /* renamed from: j */
    public final /* synthetic */ C106369n f317322j;

    /* renamed from: n */
    public final /* synthetic */ C32226l f317323n;

    public /* synthetic */ g0$$g(String str, int i, String str2, String str3, int i2, boolean z, C106369n nVar, C32226l lVar) {
        this.f317316d = str;
        this.f317317e = i;
        this.f317318f = str2;
        this.f317319g = str3;
        this.f317320h = i2;
        this.f317321i = z;
        this.f317322j = nVar;
        this.f317323n = lVar;
    }

    public final void run() {
        long j;
        String str = this.f317316d;
        int i = this.f317317e;
        String str2 = this.f317318f;
        String str3 = this.f317319g;
        int i2 = this.f317320h;
        boolean z = this.f317321i;
        C106369n nVar = this.f317322j;
        C32226l lVar = this.f317323n;
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108733M2(C75604z3.m90843o(str));
        f4Var.mo108740T2(i);
        f4Var.setType(50);
        f4Var.mo108749c3(str);
        f4Var.mo101012p4(str2);
        f4Var.mo108732L2(str3);
        f4Var.mo100991d(i2);
        if (z) {
            f4Var.mo108743W2(f4Var.f230723F | 8);
        }
        if (C106357m.m143310c()) {
            synchronized (C106357m.class) {
                C87412m.m108594g(nVar, "voipInfo");
                Log.m105924i("MicroMsg.VoIPBubbleHelper", "insertMsg() called with: voipInfo = " + nVar + ", msgInfo = " + f4Var);
                C106357m mVar = C106357m.f317386a;
                C112150i9 e = mVar.mo152648e(nVar);
                boolean z2 = false;
                if (e != null && e.mo163959x2() == 4) {
                    z2 = true;
                }
                if (z2) {
                    Log.m105928w("MicroMsg.VoIPBubbleHelper", "insertMsg: already has bubble msg");
                    j = e.mo163956u2();
                } else if (e != null) {
                    j = mVar.mo152651j(e, f4Var);
                } else {
                    Log.m105920e("MicroMsg.VoIPBubbleHelper", "insertMsg: get bubble info error");
                    j = 0;
                }
            }
        } else {
            j = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
        }
        if (j < 0) {
            Log.m105920e("MicroMsg.VoipPluginManager", "inset voip  failed!");
        }
        Log.m105918d("MicroMsg.VoipPluginManager", "inset voip  msgId " + j);
        ((C119157j) C119157j.f356862d).mo183895z(new g0$$l(lVar, j));
    }
}
