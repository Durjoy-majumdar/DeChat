package com.tencent.p014mm.pluginsdk.model;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.concurrent.ExecutorService;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.pluginsdk.model.x0 */
public abstract class C85609x0<Params, Progress, Result> {

    /* renamed from: a */
    public boolean f249536a = false;

    /* renamed from: b */
    public MMHandler f249537b = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.pluginsdk.model.x0$a */
    public class C85610a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object[] f249538d;

        /* renamed from: com.tencent.mm.pluginsdk.model.x0$a$a */
        public class C85611a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Object f249540d;

            public C85611a(Object obj) {
                this.f249540d = obj;
            }

            public void run() {
                C85609x0.this.mo57376c(this.f249540d);
            }
        }

        public C85610a(Object[] objArr) {
            this.f249538d = objArr;
        }

        public void run() {
            C85609x0.this.f249537b.post(new C85611a(C85609x0.this.mo57374a(this.f249538d)));
        }
    }

    /* renamed from: a */
    public abstract Result mo57374a(Params... paramsArr);

    /* renamed from: b */
    public abstract ExecutorService mo57375b();

    /* renamed from: c */
    public abstract void mo57376c(Result result);

    /* renamed from: d */
    public void mo119141d(Params... paramsArr) {
    }

    /* renamed from: e */
    public void mo119142e(Progress... progressArr) {
    }

    /* renamed from: f */
    public boolean mo119143f(Params... paramsArr) {
        if (this.f249536a) {
            Assert.assertTrue("MicroMsg.MMAsyncTask Should construct a new Task", false);
        }
        this.f249536a = true;
        mo119141d(paramsArr);
        ExecutorService b = mo57375b();
        if (b == null) {
            return false;
        }
        b.execute(new C85610a(paramsArr));
        return true;
    }
}
