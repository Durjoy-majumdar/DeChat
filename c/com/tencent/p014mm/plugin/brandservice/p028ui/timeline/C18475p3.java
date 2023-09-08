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

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.p3 */
public final class C18475p3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f51293d;

    /* renamed from: e */
    public final /* synthetic */ int f51294e;

    /* renamed from: f */
    public final /* synthetic */ List<C19623o0> f51295f;

    /* renamed from: g */
    public final /* synthetic */ C18412m3.C18415c<String, C18412m3.C18414b> f51296g;

    /* renamed from: h */
    public final /* synthetic */ int f51297h;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.p3$a */
    public static final class C18476a implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f51298d;

        /* renamed from: e */
        public final /* synthetic */ int f51299e;

        /* renamed from: f */
        public final /* synthetic */ List f51300f;

        /* renamed from: g */
        public final /* synthetic */ C18412m3.C18415c f51301g;

        /* renamed from: h */
        public final /* synthetic */ int f51302h;

        public C18476a(C19623o0 o0Var, int i, List list, C18412m3.C18415c cVar, int i2) {
            this.f51298d = o0Var;
            this.f51299e = i;
            this.f51300f = list;
            this.f51301g = cVar;
            this.f51302h = i2;
        }

        public boolean queueIdle() {
            Looper.myQueue().removeIdleHandler(this);
            int nP = C48009v0.Jx0().mo25810nP(this.f51298d.field_orderFlag);
            if (nP < 0) {
                Log.m105918d("MicroMsg.BizTimeLineResortHelper", "onClick maxWeight < 0");
                C19641z0.f55645a.mo25867j(47);
                return false;
            }
            C19641z0 z0Var = C19641z0.f55645a;
            z0Var.mo25867j(36);
            C64522lg a = C18418o3.m19037a(C18418o3.f51098a, this.f51299e, this.f51300f, this.f51301g, this.f51302h, 5);
            a.f184091f = nP;
            z0Var.mo25866i(5, a, this.f51298d.field_orderFlag);
            return false;
        }
    }

    public C18475p3(C19623o0 o0Var, int i, List<? extends C19623o0> list, C18412m3.C18415c<String, C18412m3.C18414b> cVar, int i2) {
        this.f51293d = o0Var;
        this.f51294e = i;
        this.f51295f = list;
        this.f51296g = cVar;
        this.f51297h = i2;
    }

    public final void run() {
        Looper.myQueue().addIdleHandler(new C18476a(this.f51293d, this.f51294e, this.f51295f, this.f51296g, this.f51297h));
    }
}
