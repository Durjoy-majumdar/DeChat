package j42;

import android.text.TextUtils;
import com.tencent.p014mm.appbrand.commonjni.AppBrandCommonBindingJniParams;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import p235sm.C90233i0;
import q52.C89465a;

/* renamed from: j42.b */
public final class C87859b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87830a f254350d;

    public C87859b(C87830a aVar) {
        this.f254350d = aVar;
    }

    public final void run() {
        int i;
        AppBrandCommonBindingJniParams appBrandCommonBindingJniParams = new AppBrandCommonBindingJniParams();
        String Ec = ((C90233i0) C86312j.m106911c(C90233i0.class)).mo124324Ec();
        appBrandCommonBindingJniParams.wasmCachePath = Ec;
        if (!TextUtils.isEmpty(Ec)) {
            appBrandCommonBindingJniParams.wasmCachePath = C86013q1.m106448i(appBrandCommonBindingJniParams.wasmCachePath, true);
        }
        String str = "enable";
        int i2 = -2;
        if (MMApplicationContext.getToolsProcesstPreference() == null || (i = MMApplicationContext.getToolsProcesstPreference().getInt("appbrand_wasm_opt", -2)) == -2) {
            i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_magic_emoji_wasm_opt_state, -2);
            if (i != -2) {
                Object[] objArr = new Object[1];
                if (i == 0) {
                    str = "disable";
                }
                objArr[0] = str;
                Log.m105925i("MBServerUtil", "[mb] wasm opt force %s by abtest", objArr);
            }
            appBrandCommonBindingJniParams.wasmOptState = i2;
            appBrandCommonBindingJniParams.enableInspector = this.f254350d.mo122292j0();
            this.f254350d.f254288n.notifyCreate(appBrandCommonBindingJniParams);
            Log.m105918d(this.f254350d.f254274E, "common binding created");
            C87830a aVar = this.f254350d;
            aVar.f254288n.notifyBindTo(aVar.mo122293k0().mo115417m(), this.f254350d.mo122293k0().mo115393J0(), this.f254350d.mo122293k0().mo115414j());
            C87830a aVar2 = this.f254350d;
            aVar2.f254289o.mo112427a(aVar2.mo122293k0().mo115417m(), this.f254350d.mo122293k0().mo115393J0());
            this.f254350d.mo122293k0().f242949d = new C89465a(this.f254350d.f254289o);
            Log.m105918d(this.f254350d.f254274E, "common binding bind done");
        }
        Object[] objArr2 = new Object[1];
        if (i == 0) {
            str = "disable";
        }
        objArr2[0] = str;
        Log.m105925i("MBServerUtil", "[mb] wasm opt force %s by cmd", objArr2);
        i2 = i;
        appBrandCommonBindingJniParams.wasmOptState = i2;
        appBrandCommonBindingJniParams.enableInspector = this.f254350d.mo122292j0();
        this.f254350d.f254288n.notifyCreate(appBrandCommonBindingJniParams);
        Log.m105918d(this.f254350d.f254274E, "common binding created");
        C87830a aVar3 = this.f254350d;
        aVar3.f254288n.notifyBindTo(aVar3.mo122293k0().mo115417m(), this.f254350d.mo122293k0().mo115393J0(), this.f254350d.mo122293k0().mo115414j());
        C87830a aVar22 = this.f254350d;
        aVar22.f254289o.mo112427a(aVar22.mo122293k0().mo115417m(), this.f254350d.mo122293k0().mo115393J0());
        this.f254350d.mo122293k0().f242949d = new C89465a(this.f254350d.f254289o);
        Log.m105918d(this.f254350d.f254274E, "common binding bind done");
    }
}
