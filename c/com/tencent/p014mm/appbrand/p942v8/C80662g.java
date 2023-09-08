package com.tencent.p014mm.appbrand.p942v8;

import android.text.TextUtils;
import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.MultiContextNodeJS;
import com.eclipsesource.mmv8.MultiContextV8;
import com.tencent.p014mm.appbrand.p942v8.C80667i;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import p774zg.C91740p0;
import p774zg.a$$b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.appbrand.v8.g */
public final class C80662g extends C80649a {

    /* renamed from: A */
    public C80667i f236028A;

    /* renamed from: y */
    public MultiContextNodeJS f236029y;

    /* renamed from: z */
    public volatile C80669j f236030z;

    /* renamed from: com.tencent.mm.appbrand.v8.g$a */
    public class C80663a implements Runnable {
        public C80663a() {
        }

        public void run() {
            C80662g.this.f236028A.mo112492m();
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.g$b */
    public class C80664b implements C80135V8.JavaTaskScheduler {
        public C80664b() {
        }

        public void Schedule(Runnable runnable) {
            C80662g.this.f236028A.mo112484h(runnable, false);
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.g$c */
    public class C80665c implements C80667i.C80668a {
        public C80665c() {
        }
    }

    public C80662g(IJSRuntime.Config config) {
        super(config);
    }

    /* renamed from: b */
    public void mo112468b() {
        C119179t tVar = C119157j.f356862d;
        a$$b a__b = new a$$b();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183886q(a__b, 30000, (String) null);
        Log.m105924i("MicroMsg.NodeJSRuntime", "cleanUpRuntimeWhenThreadEnd");
        try {
            this.f236029y.release();
            Log.m105924i("MicroMsg.NodeJSRuntime", "cleanUpRuntimeWhenThreadEnd done");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NodeJSRuntime", "cleanUpWhenThreadEnd exp = %s", e);
        }
    }

    /* renamed from: k */
    public C80656d mo112471k() {
        C80665c cVar = new C80665c();
        boolean z = this.f236012u.f235982j;
        ThreadLocal<C80667i> threadLocal = C80667i.f236035o;
        if (threadLocal.get() == null) {
            C80667i iVar = new C80667i(cVar, z);
            threadLocal.set(iVar);
            this.f236028A = iVar;
            return iVar;
        }
        throw new RuntimeException("Only one Looper may be created per thread");
    }

    /* renamed from: l */
    public MultiContextV8 mo112472l() {
        IJSRuntime.C80648a aVar = this.f236012u.f235989q;
        if (aVar != null) {
            aVar.mo112457a();
        }
        if (!C91740p0.f262776e.mo115438uY()) {
            int i = this.f236003l;
            String str = this.f235999h;
            byte[] bArr = this.f236000i;
            String str2 = this.f236001j;
            this.f236029y = MultiContextNodeJS.createMultiContextNodeJS(1, i, str, bArr, str2, !TextUtils.isEmpty(str2) && this.f236002k, this.f236005n);
        } else {
            synchronized (C80662g.class) {
                int i2 = this.f236003l;
                String str3 = this.f235999h;
                byte[] bArr2 = this.f236000i;
                String str4 = this.f236001j;
                this.f236029y = MultiContextNodeJS.createMultiContextNodeJS(1, i2, str3, bArr2, str4, !TextUtils.isEmpty(str4) && this.f236002k, this.f236005n);
            }
        }
        MultiContextNodeJS.CreateStats createStats = this.f236029y.createStats;
        Log.m105925i("MicroMsg.NodeJSRuntime", "prepareV8WhenThreadStart, isolateCreateDurationMills: %d, mainContextCreateDurationMills: %d, nodeEnvCreateDurationMills: %d", Long.valueOf(createStats.isolateCreateDurationMills), Long.valueOf(createStats.mainContextCreateDurationMills), Long.valueOf(createStats.nodeEnvCreateDurationMills));
        long j = createStats.isolateCreateDurationMills;
        long j2 = createStats.mainContextCreateDurationMills;
        IJSRuntime.C80648a aVar2 = this.f236012u.f235989q;
        if (aVar2 != null) {
            aVar2.mo112458b(j, j2);
        }
        this.f236029y.getRuntime().getV8().setNativeJavaCallback(new C80663a());
        this.f236029y.getRuntime().getV8().setJavaTaskScheduler(new C80664b());
        this.f236000i = null;
        return this.f236029y.getRuntime();
    }
}
