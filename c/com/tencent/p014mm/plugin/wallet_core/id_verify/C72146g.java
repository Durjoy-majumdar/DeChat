package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.rtmp.TXLiveConstants;
import di0.C86300q;
import gy3.C87412m;
import qo3.C77398g;
import te3.C77941hj;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.g */
public final class C72146g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77941hj f209277d;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.g$a */
    public static final class C72147a implements C86300q {

        /* renamed from: a */
        public final /* synthetic */ C77941hj f209278a;

        public C72147a(C77941hj hjVar) {
            this.f209278a = hjVar;
        }

        /* renamed from: a */
        public void mo63853a() {
        }

        /* renamed from: b */
        public void mo63854b(String str) {
        }

        /* renamed from: c */
        public void mo63855c() {
        }

        /* renamed from: d */
        public /* synthetic */ void mo63856d() {
        }

        /* renamed from: e */
        public void mo63857e() {
            Log.m105920e("MicroMsg.RealnameVerifySelectGuardianUI", "failed jump to: " + this.f209278a.f227569i + " after send msg");
            int i = RealnameVerifySelectGuardianUI.f209043E;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C77398g.C77402i iVar = new C77398g.C77402i(context);
            iVar.mo107550c(C0966R.string.kkj);
            iVar.mo107551d(C0966R.string.a18);
            iVar.mo107548a().show();
        }

        /* renamed from: f */
        public void mo63858f(boolean z) {
        }
    }

    public C72146g(C77941hj hjVar) {
        this.f209277d = hjVar;
    }

    public final void run() {
        C77941hj hjVar = this.f209277d;
        C75228t.m90225R(hjVar.f227569i, hjVar.f227570j, 0, TXLiveConstants.PUSH_EVT_ROOM_OUT, new C72147a(hjVar));
    }
}
