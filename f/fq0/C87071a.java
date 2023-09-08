package fq0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83239l2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83181q;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq0.C86093e;
import dq0.C86392b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p963fc.C86812g;
import wq0.C91063e;
import wq0.C91065g;

/* renamed from: fq0.a */
public final class C87071a extends C86093e {

    /* renamed from: d */
    public C83239l2.C83242c f252660d;

    /* renamed from: fq0.a$a */
    public class C87072a implements C83239l2.C83242c {

        /* renamed from: fq0.a$a$a */
        public class C87073a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AppBrandRuntime f252662d;

            public C87073a(AppBrandRuntime appBrandRuntime) {
                this.f252662d = appBrandRuntime;
            }

            public void run() {
                AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle;
                C91063e eVar;
                if (!this.f252662d.mo113064k0()) {
                    Log.m105925i("MicroMsg.ProxyAppBrandServiceOnRuntimeReadyListener", "AppBrandRuntimeProfile| start prepareDataForNode %s", C87071a.this.f250577a.getAppId());
                    HashMap hashMap = new HashMap();
                    C87071a aVar = C87071a.this;
                    C91065g gVar = ((C86812g) this.f252662d).f251968f1;
                    aVar.getClass();
                    if (gVar == null) {
                        Log.m105928w("MicroMsg.ProxyAppBrandServiceOnRuntimeReadyListener", "fillPermissionBytes controller null");
                    } else {
                        synchronized (gVar.f261245e) {
                            appRuntimeApiPermissionBundle = gVar.f261246f;
                        }
                        if (appRuntimeApiPermissionBundle != null) {
                            byte[] bArr = appRuntimeApiPermissionBundle.f245266d;
                            byte[] bArr2 = appRuntimeApiPermissionBundle.f245267e;
                            hashMap.put("fg", bArr);
                            hashMap.put("bg", bArr2);
                        }
                        synchronized (gVar.f261247g) {
                            HashMap<String, AppRuntimeApiPermissionBundle> hashMap2 = gVar.f261248h;
                            if (hashMap2 != null) {
                                if (!hashMap2.isEmpty()) {
                                    eVar = new C91063e(gVar);
                                }
                            }
                            eVar = null;
                        }
                        C87074b.m108094d(hashMap, eVar);
                    }
                    hashMap.put("state", 0);
                    hashMap.put("wxaData", C86392b.m107057a(this.f252662d));
                    C87071a.this.mo120520c(hashMap);
                }
            }
        }

        public C87072a() {
        }

        /* renamed from: a */
        public void mo115476a() {
            Log.m105925i("MicroMsg.ProxyAppBrandServiceOnRuntimeReadyListener", "AppBrandRuntimeProfile| onRuntimeReady %s", C87071a.this.f250577a.getAppId());
            AppBrandRuntime runtime = C87071a.this.f250577a.getRuntime();
            if (runtime != null) {
                C83181q qVar = (C83181q) C87071a.this.f250577a.getJsRuntime().mo63321n0(C83181q.class);
                C87073a aVar = new C87073a(runtime);
                if (qVar.mo115422q()) {
                    aVar.run();
                } else {
                    qVar.post(aVar);
                }
            } else {
                throw new IllegalStateException("onRuntimeReady runtime null");
            }
        }
    }

    public C87071a(C86093e.C86094a aVar, C81925i2 i2Var) {
        super(aVar, i2Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo120518a() {
        /*
            r8 = this;
            com.tencent.mm.plugin.appbrand.l2 r0 = com.tencent.p014mm.plugin.appbrand.C83239l2.C83241b.f243111a
            com.tencent.mm.plugin.appbrand.i2 r1 = r8.f250577a
            com.tencent.mm.plugin.appbrand.l2$c r2 = r8.f252660d
            r0.getClass()
            int r1 = r1.hashCode()
            java.lang.String r3 = "MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr"
            java.lang.String r4 = "removeListener service:%d, listener:%d"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r5[r6] = r7
            r6 = 1
            int r7 = r2.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5[r6] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            monitor-enter(r0)
            android.util.SparseArray<java.util.List<com.tencent.mm.plugin.appbrand.l2$c>> r3 = r0.f243109a     // Catch:{ all -> 0x0047 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0047 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x0037
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0046
        L_0x0037:
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0045
            android.util.SparseArray<java.util.List<com.tencent.mm.plugin.appbrand.l2$c>> r2 = r0.f243109a     // Catch:{ all -> 0x0047 }
            r2.remove(r1)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
        L_0x0046:
            return
        L_0x0047:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fq0.C87071a.mo120518a():void");
    }

    /* renamed from: b */
    public void mo120519b() {
        C87072a aVar = new C87072a();
        this.f252660d = aVar;
        C83239l2 l2Var = C83239l2.C83241b.f243111a;
        C81925i2 i2Var = this.f250577a;
        l2Var.getClass();
        int hashCode = i2Var.hashCode();
        Log.m105925i("MicroMsg.AppBrandServiceOnRuntimeReadyListenerMgr", "addListener service:%d, listener:%d", Integer.valueOf(hashCode), Integer.valueOf(aVar.hashCode()));
        synchronized (l2Var) {
            List list = l2Var.f243109a.get(hashCode);
            if (list == null) {
                list = new ArrayList();
                l2Var.f243109a.put(hashCode, list);
            }
            list.add(aVar);
            l2Var.mo115475a(hashCode, list);
        }
    }
}
