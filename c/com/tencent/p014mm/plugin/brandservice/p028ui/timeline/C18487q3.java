package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C19641z0;
import java.util.List;
import rb0.C48009v0;
import te3.C64522lg;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.q3 */
public final class C18487q3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f51329d;

    /* renamed from: e */
    public final /* synthetic */ int f51330e;

    /* renamed from: f */
    public final /* synthetic */ List<C19623o0> f51331f;

    /* renamed from: g */
    public final /* synthetic */ C18412m3.C18415c<String, C18412m3.C18414b> f51332g;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.q3$a */
    public static final class C18488a implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f51333d;

        /* renamed from: e */
        public final /* synthetic */ int f51334e;

        /* renamed from: f */
        public final /* synthetic */ List f51335f;

        /* renamed from: g */
        public final /* synthetic */ C18412m3.C18415c f51336g;

        public C18488a(C19623o0 o0Var, int i, List list, C18412m3.C18415c cVar) {
            this.f51333d = o0Var;
            this.f51334e = i;
            this.f51335f = list;
            this.f51336g = cVar;
        }

        public boolean queueIdle() {
            Looper.myQueue().removeIdleHandler(this);
            if (!C19636w0.f55627d) {
                C19641z0.f55645a.mo25867j(111);
                return false;
            }
            int nP = C48009v0.Jx0().mo25810nP(this.f51333d.field_orderFlag);
            if (nP < 0) {
                Log.m105924i("MicroMsg.BizTimeLineResortHelper", "onEnter maxWeight < 0");
                C19641z0.f55645a.mo25867j(46);
                return false;
            }
            C19641z0 z0Var = C19641z0.f55645a;
            z0Var.mo25867j(35);
            C64522lg a = C18418o3.m19037a(C18418o3.f51098a, this.f51334e, this.f51335f, this.f51336g, -1, 3);
            a.f184091f = nP;
            z0Var.mo25866i(3, a, this.f51333d.field_orderFlag);
            return false;
        }
    }

    public C18487q3(C19623o0 o0Var, int i, List<? extends C19623o0> list, C18412m3.C18415c<String, C18412m3.C18414b> cVar) {
        this.f51329d = o0Var;
        this.f51330e = i;
        this.f51331f = list;
        this.f51332g = cVar;
    }

    public final void run() {
        Looper.myQueue().addIdleHandler(new C18488a(this.f51329d, this.f51330e, this.f51331f, this.f51332g));
    }
}
