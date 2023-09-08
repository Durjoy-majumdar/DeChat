package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19641z0;
import java.util.List;
import rb0.C48009v0;
import te3.C64522lg;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.r3 */
public final class C18490r3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f51338d;

    /* renamed from: e */
    public final /* synthetic */ List<C19623o0> f51339e;

    /* renamed from: f */
    public final /* synthetic */ C18412m3.C18415c<String, C18412m3.C18414b> f51340f;

    /* renamed from: g */
    public final /* synthetic */ String f51341g;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.r3$a */
    public static final class C18491a implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f51342d;

        /* renamed from: e */
        public final /* synthetic */ List f51343e;

        /* renamed from: f */
        public final /* synthetic */ C18412m3.C18415c f51344f;

        /* renamed from: g */
        public final /* synthetic */ String f51345g;

        public C18491a(C19623o0 o0Var, List list, C18412m3.C18415c cVar, String str) {
            this.f51342d = o0Var;
            this.f51343e = list;
            this.f51344f = cVar;
            this.f51345g = str;
        }

        public boolean queueIdle() {
            Looper.myQueue().removeIdleHandler(this);
            int nP = C48009v0.Jx0().mo25810nP(this.f51342d.field_orderFlag);
            if (nP < 0) {
                Log.m105918d("MicroMsg.BizTimeLineResortHelper", "onOftenReadClick maxWeight < 0");
                C19641z0.f55645a.mo25867j(48);
                return false;
            }
            C19641z0 z0Var = C19641z0.f55645a;
            z0Var.mo25867j(37);
            C64522lg a = C18418o3.m19037a(C18418o3.f51098a, 0, this.f51343e, this.f51344f, -1, 4);
            a.f184090e = this.f51345g;
            a.f184091f = nP;
            z0Var.mo25866i(4, a, this.f51342d.field_orderFlag);
            return false;
        }
    }

    public C18490r3(C19623o0 o0Var, List<? extends C19623o0> list, C18412m3.C18415c<String, C18412m3.C18414b> cVar, String str) {
        this.f51338d = o0Var;
        this.f51339e = list;
        this.f51340f = cVar;
        this.f51341g = str;
    }

    public final void run() {
        Looper.myQueue().addIdleHandler(new C18491a(this.f51338d, this.f51339e, this.f51340f, this.f51341g));
    }
}
