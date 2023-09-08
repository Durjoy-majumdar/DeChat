package p284zb;

import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJni;

/* renamed from: zb.k */
public class C91644k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f262616d;

    /* renamed from: e */
    public final /* synthetic */ Class f262617e;

    /* renamed from: f */
    public final /* synthetic */ C91640i f262618f;

    public C91644k(C91640i iVar, long j, Class cls) {
        this.f262618f = iVar;
        this.f262616d = j;
        this.f262617e = cls;
    }

    public void run() {
        AppBrandCommonBindingJni appBrandCommonBindingJni = this.f262618f.f262600f.f262484a;
        if (appBrandCommonBindingJni != null) {
            appBrandCommonBindingJni.notifyPostRuntimeReady(this.f262616d, this.f262617e);
        }
    }
}
