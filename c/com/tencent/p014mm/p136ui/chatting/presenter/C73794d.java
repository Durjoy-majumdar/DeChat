package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.chatting.C73871v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import java.util.Set;
import rk3.C63462a;
import s90.C77632o;
import uj3.C78211g;

/* renamed from: com.tencent.mm.ui.chatting.presenter.d */
public class C73794d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f216586d;

    /* renamed from: e */
    public final /* synthetic */ Set f216587e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f216588f;

    /* renamed from: g */
    public final /* synthetic */ C73787b f216589g;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.d$a */
    public class C73795a implements C77632o {

        /* renamed from: com.tencent.mm.ui.chatting.presenter.d$a$a */
        public class C73796a extends C78211g.C78216c {
            public C73796a(C73795a aVar) {
            }

            /* renamed from: a */
            public int mo102836a() {
                return -1;
            }
        }

        public C73795a() {
        }

        /* renamed from: N */
        public boolean mo22497N() {
            return false;
        }

        /* renamed from: e0 */
        public boolean mo22498e0() {
            return false;
        }

        /* renamed from: g0 */
        public void mo22499g0(Bundle bundle) {
        }

        /* renamed from: m6 */
        public void mo22500m6(C77632o.C77633a aVar) {
        }

        /* renamed from: r7 */
        public void mo22502r7(C77632o.C77633a aVar) {
            Log.m105925i("MicroMsg.BaseHistoryListPresenter", "[requestExitSelectedMode] %s del ", Thread.currentThread(), aVar);
            if (aVar == C77632o.C77633a.del) {
                C73794d.this.f216589g.f216570g.notifyDataSetChanged();
            }
        }

        /* renamed from: s0 */
        public boolean mo22503s0() {
            return true;
        }

        /* renamed from: z1 */
        public void mo22504z1(C77632o.C77633a aVar) {
            if (aVar == C77632o.C77633a.del) {
                C73796a aVar2 = new C73796a(this);
                aVar2.f229172d = C73794d.this.f216588f.getMsgId();
                C73794d.this.f216589g.f216572i.remove(aVar2);
                C73794d.this.f216589g.f216573j.remove(aVar2);
            }
        }
    }

    public C73794d(C73787b bVar, int i, Set set, C72963f4 f4Var) {
        this.f216589g = bVar;
        this.f216586d = i;
        this.f216587e = set;
        this.f216588f = f4Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.BaseHistoryListPresenter", "delete message");
        C63462a.f180011a.mo88333h(19, this.f216586d);
        C73871v0.m87560a(this.f216589g.f216567d, this.f216587e, new C73795a());
    }
}
