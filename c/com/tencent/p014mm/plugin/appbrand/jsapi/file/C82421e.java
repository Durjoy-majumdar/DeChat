package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82430g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.e */
public abstract class C82421e<T extends C82430g> extends C82268c {

    /* renamed from: h */
    public static final ThreadPoolExecutor f241505h = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* renamed from: g */
    public final T f241506g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.e$a */
    public class C82422a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241507d;

        /* renamed from: e */
        public final /* synthetic */ C40482o f241508e;

        /* renamed from: f */
        public final /* synthetic */ JSONObject f241509f;

        /* renamed from: g */
        public final /* synthetic */ int f241510g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.e$a$a */
        public class C82423a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Throwable f241512d;

            public C82423a(C82422a aVar, Throwable th) {
                this.f241512d = th;
            }

            public void run() {
                throw this.f241512d;
            }
        }

        public C82422a(C82381f fVar, C40482o oVar, JSONObject jSONObject, int i) {
            this.f241507d = fVar;
            this.f241508e = oVar;
            this.f241509f = jSONObject;
            this.f241510g = i;
        }

        public void run() {
            if (this.f241507d.isRunning()) {
                try {
                    C82446i a = C82421e.this.f241506g.mo114811a(this.f241507d, this.f241508e, this.f241509f);
                    C82381f fVar = this.f241507d;
                    fVar.mo109647a(this.f241510g, C82421e.this.mo115117r(fVar, a.f242317b, a.f242316a));
                } catch (Throwable th) {
                    Log.printErrStackTrace("Luggage.BaseNFSApiAsync", th, "%s.invoke, appId=%s, callbackId=%d", C82421e.this.f241506g.getClass().getName(), this.f241507d.getAppId(), Integer.valueOf(this.f241510g));
                    MMHandlerThread.postToMainThread(new C82423a(this, th));
                    this.f241507d.mo109647a(this.f241510g, C82421e.this.mo115109j("fail:internal error"));
                }
            }
        }
    }

    public C82421e(T t) {
        this.f241506g = t;
        t.f241517a = this;
    }

    /* renamed from: h */
    public boolean mo114532h() {
        return true;
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo114531v(fVar, jSONObject, i, fVar.getJsRuntime());
    }

    /* renamed from: v */
    public final void mo114531v(C82381f fVar, JSONObject jSONObject, int i, C40482o oVar) {
        f241505h.submit(new C82422a(fVar, oVar, jSONObject, i));
    }
}
