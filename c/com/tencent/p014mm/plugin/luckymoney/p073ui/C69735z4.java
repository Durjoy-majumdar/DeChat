package com.tencent.p014mm.plugin.luckymoney.p073ui;

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

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.z4 */
public final class C69735z4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77941hj f201163d;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.z4$a */
    public static final class C69736a implements C86300q {

        /* renamed from: a */
        public final /* synthetic */ C77941hj f201164a;

        public C69736a(C77941hj hjVar) {
            this.f201164a = hjVar;
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
            Log.m105920e("MicroMsg.LuckyMoneySpareActivityFirst", "failed jump to: " + this.f201164a.f227569i + " after send msg");
            int i = LuckyMoneySpareActivityFirst.f200800E;
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

    public C69735z4(C77941hj hjVar) {
        this.f201163d = hjVar;
    }

    public final void run() {
        C77941hj hjVar = this.f201163d;
        C75228t.m90225R(hjVar.f227569i, hjVar.f227570j, 0, TXLiveConstants.PUSH_EVT_ROOM_OUT, new C69736a(hjVar));
    }
}
