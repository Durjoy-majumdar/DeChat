package p284zb;

import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJni;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;

/* renamed from: zb.i$$h */
public class i$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f262608d;

    /* renamed from: e */
    public final /* synthetic */ C91640i f262609e;

    public i$$h(C91640i iVar, AppBrandRuntime appBrandRuntime) {
        this.f262609e = iVar;
        this.f262608d = appBrandRuntime;
    }

    public void run() {
        String str;
        C91640i iVar = this.f262609e;
        AppBrandCommonBindingJni appBrandCommonBindingJni = iVar.f262600f.f262484a;
        String g0 = iVar.mo125521g0();
        String str2 = this.f262608d.mo113051d0().f261072r.md5;
        if (this.f262609e.mo124764Z() == null || ((C91635f) this.f262609e.mo124764Z()).mo114272k() == null) {
            str = "";
        } else {
            str = "v" + ((C91635f) this.f262609e.mo124764Z()).mo114272k().mo113371a();
        }
        appBrandCommonBindingJni.notifyRuntimeReady(g0, str2, str);
    }
}
