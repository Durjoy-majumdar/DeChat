package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import aw0.C79635e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.floatball.C81844b;
import com.tencent.p014mm.plugin.appbrand.floatball.C81845c;
import com.tencent.p014mm.plugin.appbrand.floatball.C81855i;
import com.tencent.p014mm.plugin.appbrand.floatball.C81856j;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82229d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.Future;
import li0.C88507a;
import li0.C88514d;
import rx3.C36570n;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j0 */
public final class C82245j0 extends C82239h {

    /* renamed from: d */
    public final /* synthetic */ C82229d0 f241148d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j0$a */
    public static final class C82246a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82229d0 f241149d;

        public C82246a(C82229d0 d0Var) {
            this.f241149d = d0Var;
        }

        public final void run() {
            Log.m105924i(this.f241149d.f241115e, "run#onConnectStateChange, do disable");
            C82250m.C82251a.m101007a(this.f241149d, false, 1, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82245j0(C82229d0 d0Var, AppBrandRuntime appBrandRuntime) {
        super(appBrandRuntime);
        this.f241148d = d0Var;
    }

    /* renamed from: b */
    public void mo114637b(String str, boolean z) {
        C81845c cVar;
        C87412m.m108594g(str, "deviceId");
        Log.m105924i(this.f241148d.f241115e, "onConnectStateChange, deviceId: " + str + ", connected: " + z);
        boolean isEmpty = this.f241148d.f241126s.isEmpty();
        if (z) {
            this.f241148d.f241126s.add(str);
            if (isEmpty && this.f241148d.f241124q) {
                Log.m105924i(this.f241148d.f241115e, "onConnectStateChange, origin not connected and enable() called");
                C82229d0 d0Var = this.f241148d;
                Log.m105924i(d0Var.f241115e, "doRealEnable");
                if (!d0Var.f241124q) {
                    Log.m105928w(d0Var.f241115e, "doRealEnable, must call enable() first");
                    return;
                }
                boolean z2 = !((C88507a) d0Var.f241114d.mo113018M(C88507a.class)).f255659f;
                Log.m105924i(d0Var.f241115e, "doRealEnable, isBanned: " + z2);
                if (!z2) {
                    if (d0Var.f241125r) {
                        Log.m105924i(d0Var.f241115e, "doRealEnable, already enabled");
                        return;
                    }
                    d0Var.f241125r = true;
                    Log.m105924i(d0Var.f241115e, "requireHostKeepMeAlive");
                    C81925i2 b0 = d0Var.f241114d.mo113047b0();
                    if (b0 == null) {
                        Log.m105928w(d0Var.f241115e, "requireHostKeepMeAlive, service is null");
                    } else {
                        AppBrandBackgroundRunningMonitor.m100056a(b0, 1, 32, false);
                    }
                    if (d0Var.f241119i == null) {
                        Log.m105924i(d0Var.f241115e, "registerAuthStateListenerIfNeed, create and add");
                        C82240h0 h0Var = new C82240h0(d0Var);
                        C82232e.f241129a.mo114629a(d0Var.f241114d.f238147j, h0Var);
                        d0Var.f241119i = h0Var;
                    }
                    if (d0Var.f241120j == null) {
                        Log.m105924i(d0Var.f241115e, "registerLifeCycleListenerIfNeed, create and add");
                        C82248k0 k0Var = new C82248k0(d0Var);
                        C83231l.m102140a(d0Var.f241114d.f238147j, k0Var);
                        d0Var.f241120j = k0Var;
                    }
                    if (d0Var.f241121n == null) {
                        Log.m105924i(d0Var.f241115e, "registerBackgroundRunningOpListenerIfNeed, create and add");
                        C82242i0 i0Var = new C82242i0(d0Var);
                        C82229d0.C82230b bVar = C82229d0.f241111u;
                        C81590r rVar = (C81590r) ((C36570n) C82229d0.f241112v).getValue();
                        if (rVar != null) {
                            rVar.mo56708jr(i0Var);
                        }
                        d0Var.f241121n = i0Var;
                    }
                    if (d0Var.f241122o == null) {
                        Log.m105924i(d0Var.f241115e, "createFloatBallHelperIfNeed, create");
                        AppBrandRuntime appBrandRuntime = d0Var.f241114d;
                        C87412m.m108594g(appBrandRuntime, "runtime");
                        if (!(appBrandRuntime instanceof AppBrandRuntimeWC)) {
                            Log.m105928w("MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper", "create, runtime is not AppBrandRuntimeWC");
                            cVar = null;
                        } else {
                            AppBrandRuntimeWC appBrandRuntimeWC = (AppBrandRuntimeWC) appBrandRuntime;
                            cVar = new C81845c(new C81856j(appBrandRuntimeWC.mo113026R(), appBrandRuntimeWC), appBrandRuntime);
                            cVar.mo35648A(33, C79635e.m96713a(appBrandRuntimeWC.f238147j, appBrandRuntimeWC.f238149o.f239365g));
                            AppBrandInitConfigWC M1 = appBrandRuntimeWC.mo113210l1();
                            Log.m105924i(cVar.f240118t, "updateBallInfoWithInitConfig, initConfig: " + M1);
                            if (M1 != null) {
                                BallInfo ballInfo = cVar.f311726d;
                                ballInfo.f311695p = M1.f239364f;
                                ballInfo.f311699t = M1.f239363e;
                                int i = cVar.f240117s.f238149o.f239365g;
                                ballInfo.f311701v = i != 1 ? i != 2 ? null : cVar.f240117s.f238141d.getString(C0966R.string.f7601l2) : cVar.f240117s.f238141d.getString(C0966R.string.f7602l3);
                                C81855i.m100487c(cVar, M1);
                                ballInfo.f311683H.f311717f = 20;
                                cVar.mo68414O();
                            }
                            appBrandRuntime.mo113020N0(new C81844b(appBrandRuntime, cVar));
                        }
                        d0Var.f241122o = cVar;
                    }
                    d0Var.mo114622c();
                    AppBrandRuntime appBrandRuntime2 = d0Var.f241114d;
                    if ((appBrandRuntime2 instanceof AppBrandRuntimeWC) && ((AppBrandRuntimeWC) appBrandRuntime2).mo121250f1()) {
                        ((AppBrandRuntimeWC) d0Var.f241114d).f238113K.f255667a.mo122987s(C88514d.C88522g.ON_START_BACKGROUND_BLUETOOTH, (Object) null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f241148d.f241126s.remove(str);
        if (this.f241148d.f241126s.isEmpty()) {
            Log.m105924i(this.f241148d.f241115e, "onConnectStateChange, all device disconnect");
            C82229d0 d0Var2 = this.f241148d;
            if (d0Var2.f241114d.f238122S) {
                Log.m105924i(d0Var2.f241115e, "onConnectStateChange, do real disable");
                this.f241148d.mo114623d();
                return;
            }
            Future<?> future = d0Var2.f241127t;
            if (future != null) {
                future.cancel(false);
            }
            C82229d0 d0Var3 = this.f241148d;
            C119179t tVar = C119157j.f356862d;
            C82246a aVar = new C82246a(d0Var3);
            C82229d0.C82230b bVar2 = C82229d0.f241111u;
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            d0Var3.f241127t = jVar.mo183886q(aVar, AppBrandGlobalSystemConfig.m100099b().f239295S * 1000, (String) null);
        }
    }

    public void onBluetoothStateChange(boolean z) {
        String str = this.f241148d.f241115e;
        Log.m105924i(str, "onBluetoothStateChange, isOn: " + z);
        if (!z) {
            Log.m105924i(this.f241148d.f241115e, "onBluetoothStateChange, do disable");
            C82250m.C82251a.m101007a(this.f241148d, false, 1, (Object) null);
        }
    }
}
