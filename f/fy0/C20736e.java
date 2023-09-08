package fy0;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import di3.C86312j;
import dx0.C31332a;
import gw0.C76073b;
import java.util.List;

/* renamed from: fy0.e */
public class C20736e implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ List f58621d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f58622e;

    /* renamed from: fy0.e$a */
    public class C20737a implements Runnable {
        public C20737a() {
        }

        public void run() {
            for (C19623o0 o0Var : C20736e.this.f58621d) {
                if (o0Var.mo25754B2()) {
                    ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(o0Var.field_msgId, o0Var.field_content);
                }
            }
            C20739g.m22695g(C20736e.this.f58621d);
            for (C19623o0 o0Var2 : C20736e.this.f58621d) {
                C19627t tVar = C19627t.f55586a;
                if (tVar.mo25833g() && o0Var2.mo25753A2()) {
                    tVar.mo25850x(o0Var2);
                } else if (tVar.mo25840n() && o0Var2.mo25758F2()) {
                    tVar.mo25850x(o0Var2);
                }
            }
            MMHandlerThread.postToMainThread(C20736e.this.f58622e);
        }
    }

    public C20736e(List list, Runnable runnable) {
        this.f58621d = list;
        this.f58622e = runnable;
    }

    public boolean queueIdle() {
        Looper.myQueue().removeIdleHandler(this);
        C31332a.m39373a("BrandServiceWorkerThread", new C20737a(), 0);
        return false;
    }
}
