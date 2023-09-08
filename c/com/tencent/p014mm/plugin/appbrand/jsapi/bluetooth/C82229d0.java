package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningMonitor;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81590r;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.floatball.C81845c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82234f;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82250m;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fl0.C86917b;
import fl0.C86920e;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import kotlin.Metadata;
import li0.C88509c;
import li0.C88514d;
import mk0.C88738b;
import ok0.C89232a;
import p447aw.C103918d;
import qk0.C89689d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d0 */
public final class C82229d0 implements C82250m {

    /* renamed from: u */
    public static final C82230b f241111u = new C82230b((C8480h) null);

    /* renamed from: v */
    public static final C13601g<C81590r> f241112v = C36568h.m40985a(C29508a.f80385d);

    /* renamed from: w */
    public static final String f241113w = "WCBluetoothBackgroundSupportClientFactory";

    /* renamed from: d */
    public final AppBrandRuntime f241114d;

    /* renamed from: e */
    public final String f241115e;

    /* renamed from: f */
    public final String f241116f;

    /* renamed from: g */
    public volatile C82239h f241117g;

    /* renamed from: h */
    public volatile C88509c.C88512b f241118h;

    /* renamed from: i */
    public volatile C82247k f241119i;

    /* renamed from: j */
    public volatile C83231l.C83234d f241120j;

    /* renamed from: n */
    public volatile C81590r.C29457a f241121n;

    /* renamed from: o */
    public volatile C81845c f241122o;

    /* renamed from: p */
    public final List<C82250m.C82253c> f241123p = new CopyOnWriteArrayList();

    /* renamed from: q */
    public volatile boolean f241124q;

    /* renamed from: r */
    public volatile boolean f241125r;

    /* renamed from: s */
    public final Set<String> f241126s = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: t */
    public volatile Future<?> f241127t;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d0$a */
    public static final class C29508a extends C87413o implements C32224a<C81590r> {

        /* renamed from: d */
        public static final C29508a f80385d = new C29508a();

        public C29508a() {
            super(0);
        }

        public Object invoke() {
            C81590r rVar = (C81590r) C86312j.m106911c(C81590r.class);
            if (rVar == null) {
                Log.m105928w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "initializer#backgroundRunningManagerService, service is null");
            }
            return rVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d0$b */
    public static final class C82230b implements C82250m.C82252b {
        public C82230b(C8480h hVar) {
        }

        /* renamed from: a */
        public C82250m mo114628a(AppBrandRuntime appBrandRuntime) {
            C87412m.m108594g(appBrandRuntime, "runtime");
            return new C82229d0(appBrandRuntime);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d0$c */
    public static final class C82231c<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C82231c<InputType, ResultType> f241128d = new C82231c<>();

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (bundle == null) {
                Log.m105928w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "record#MainProcess, data is null");
                return;
            }
            bundle.setClassLoader(WCBluetoothBackgroundApp.class.getClassLoader());
            boolean z = bundle.getBoolean("enable");
            WCBluetoothBackgroundApp wCBluetoothBackgroundApp = (WCBluetoothBackgroundApp) bundle.getParcelable("app");
            if (wCBluetoothBackgroundApp == null) {
                Log.m105928w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "record#MainProcess, app is null");
                return;
            }
            Log.m105918d("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "record#MainProcess, enable: " + z + ", app: " + wCBluetoothBackgroundApp);
            if (z) {
                synchronized (C82227c0.f241105a) {
                    C82227c0.f241106b.add(wCBluetoothBackgroundApp);
                }
                return;
            }
            synchronized (C82227c0.f241105a) {
                C82227c0.f241106b.remove(wCBluetoothBackgroundApp);
            }
        }
    }

    public C82229d0(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        this.f241114d = appBrandRuntime;
        StringBuilder sb = new StringBuilder();
        sb.append("MicroMsg.AppBrand.WCBluetoothBackgroundSupports#");
        C82234f.C82235a aVar = C82234f.f241133b;
        sb.append(aVar.mo114635d(appBrandRuntime));
        this.f241115e = sb.toString();
        this.f241116f = "WCBluetoothBackgroundSupportClient#" + aVar.mo114635d(appBrandRuntime);
    }

    /* renamed from: e */
    public static final C81845c m100955e(AppBrandRuntime appBrandRuntime) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C82250m a = C82234f.f241133b.mo114632a(appBrandRuntime);
        C82229d0 d0Var = a instanceof C82229d0 ? (C82229d0) a : null;
        if (d0Var != null) {
            return d0Var.f241122o;
        }
        return null;
    }

    /* renamed from: P */
    public boolean mo114618P() {
        return this.f241125r;
    }

    /* renamed from: T */
    public void mo114619T(C82250m.C82253c cVar) {
        C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String str = this.f241115e;
        Log.m105924i(str, "removeListener, listener: " + cVar.mo114244b());
        ((CopyOnWriteArrayList) this.f241123p).remove(cVar);
    }

    /* renamed from: a */
    public void mo114620a() {
        Log.m105924i(this.f241115e, "enable");
        if (this.f241124q) {
            Log.m105924i(this.f241115e, "enable, already enabled");
            Future<?> future = this.f241127t;
            if (future != null) {
                future.cancel(false);
                return;
            }
            return;
        }
        List<C89689d> list = null;
        if (!C82234f.f241133b.mo114636e(this.f241114d) || ((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(this.f241114d.f238141d)) {
            this.f241124q = true;
            mo114625k(true);
            if (this.f241117g == null) {
                Log.m105924i(this.f241115e, "registerBluetoothStateChangeListenerIfNeed, create and enable");
                C82245j0 j0Var = new C82245j0(this, this.f241114d);
                Log.m105924i(j0Var.f241141b, "enable");
                if (j0Var.f241142c) {
                    Log.m105924i(j0Var.f241141b, "enable, already enabled");
                } else {
                    j0Var.f241142c = true;
                    C82225c b = C82220a.m100947b(j0Var.f241140a.f238147j);
                    if (b == null) {
                        Log.m105924i(j0Var.f241141b, "enable, bleWorker is null");
                    } else {
                        ((CopyOnWriteArrayList) b.f241103g).add(j0Var);
                        C88738b h = b.mo114615h();
                        if (h != null) {
                            list = h.f256136a.mo123373a();
                        }
                        if (list != null) {
                            for (C89689d dVar : list) {
                                String str = dVar.f257958b;
                                if (str == null) {
                                    Log.m105928w(j0Var.f241141b, "enable, deviceId is null");
                                } else {
                                    j0Var.mo114637b(str, true);
                                }
                            }
                        }
                        ((CopyOnWriteArrayList) b.f241104h).add(j0Var);
                    }
                }
                this.f241117g = j0Var;
            }
            if (this.f241118h == null) {
                Log.m105924i(this.f241115e, "registerAppRunningStateChangeListenerIfNeed, create and enable");
                C82238g0 g0Var = new C82238g0(this);
                C88509c cVar = this.f241114d.f238113K;
                if (cVar != null) {
                    cVar.mo122978a(g0Var);
                }
                this.f241118h = g0Var;
                return;
            }
            return;
        }
        Log.m105924i(this.f241115e, "enable, in background, float window permission is not allowed");
        throw new C82237g(C86920e.f252313c, (String) null, 2, (C8480h) null);
    }

    /* renamed from: b */
    public String mo114621b() {
        return this.f241116f;
    }

    /* renamed from: c */
    public final void mo114622c() {
        boolean z = this.f241125r;
        String str = this.f241115e;
        Log.m105924i(str, "dispatchStateChange, isEnabled: " + z);
        for (C82250m.C82253c a : this.f241123p) {
            a.mo114243a(z);
        }
    }

    /* renamed from: d */
    public final void mo114623d() {
        Log.m105924i(this.f241115e, "doRealDisable");
        if (!this.f241125r) {
            Log.m105924i(this.f241115e, "doRealDisable, already disabled");
            return;
        }
        this.f241125r = false;
        Log.m105924i(this.f241115e, "releaseHostKeepMeAlive");
        C81925i2 b0 = this.f241114d.mo113047b0();
        if (b0 == null) {
            Log.m105928w(this.f241115e, "releaseHostKeepMeAlive, service is null");
        } else {
            AppBrandBackgroundRunningMonitor.m100056a(b0, 2, 32, false);
        }
        this.f241114d.f238113K.f255667a.mo122987s(C88514d.C88522g.ON_STOP_BACKGROUND_BLUETOOTH, (Object) null);
        mo114622c();
        C81845c cVar = this.f241122o;
        if (cVar != null) {
            Log.m105924i(this.f241115e, "destroyFloatBallHelperIfNeed, destroy");
            cVar.mo67996A0();
            this.f241122o = null;
        }
        C81590r.C29457a aVar = this.f241121n;
        if (aVar != null) {
            Log.m105924i(this.f241115e, "unregisterBackgroundRunningOpListenerIfNeed, remove");
            C81590r rVar = (C81590r) ((C36570n) f241112v).getValue();
            if (rVar != null) {
                rVar.mo56707O7(aVar);
            }
            this.f241121n = null;
        }
        C83231l.C83234d dVar = this.f241120j;
        if (dVar != null) {
            Log.m105924i(this.f241115e, "unregisterLifeCycleListenerIfNeed, remove");
            C83231l.m102144e(this.f241114d.f238147j, dVar);
            this.f241120j = null;
        }
        C82247k kVar = this.f241119i;
        if (kVar != null) {
            Log.m105924i(this.f241115e, "unregisterAuthStateListenerIfNeed, remove");
            C82232e.f241129a.mo114630b(this.f241114d.f238147j, kVar);
            this.f241119i = null;
        }
    }

    /* renamed from: j */
    public void mo114624j() {
        Log.m105924i(this.f241115e, "checkCanIEnable");
        if (!this.f241124q) {
            String str = this.f241114d.f238147j;
            boolean z = false;
            if (str == null) {
                Log.m105928w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount, appId is null");
            } else {
                Bundle bundle = new Bundle();
                bundle.setClassLoader(WCBluetoothBackgroundApp.class.getClassLoader());
                bundle.putParcelable("app", new WCBluetoothBackgroundApp(str, this.f241114d.f238149o.f239365g));
                bundle.putInt("maxCount", AppBrandGlobalSystemConfig.m100099b().f239296T);
                IPCBoolean iPCBoolean = (IPCBoolean) C15618a.m14628d(bundle, C82236f0.f241136a);
                if (iPCBoolean != null) {
                    z = iPCBoolean.f10312d;
                }
                Log.m105924i("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "isReachMaxCount, canIEnableBackgroundSupport: " + z);
                z ^= true;
            }
            if (z) {
                Log.m105924i(this.f241115e, "checkCanIEnable, reach max count");
                throw new C82237g(C86917b.f252277O, (String) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: k */
    public final void mo114625k(boolean z) {
        Log.m105918d("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "record, enable: " + z);
        String str = this.f241114d.f238147j;
        if (str == null) {
            Log.m105928w("MicroMsg.AppBrand.WCBluetoothBackgroundSupports", "record, appId is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.setClassLoader(WCBluetoothBackgroundApp.class.getClassLoader());
        bundle.putBoolean("enable", z);
        bundle.putParcelable("app", new WCBluetoothBackgroundApp(str, this.f241114d.f238149o.f239365g));
        C15618a.m14627c(bundle, C82231c.f241128d, (C1256g) null, 4, (Object) null);
    }

    /* renamed from: n */
    public void mo114626n(C82250m.C82253c cVar) {
        C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        String str = this.f241115e;
        Log.m105924i(str, "addListener, listener: " + cVar.mo114244b());
        ((CopyOnWriteArrayList) this.f241123p).add(cVar);
    }

    /* renamed from: t */
    public void mo114627t(boolean z) {
        String str = this.f241115e;
        Log.m105924i(str, "disable, closeConnection: " + z);
        if (!this.f241124q) {
            Log.m105924i(this.f241115e, "disable, not enabled");
            return;
        }
        this.f241124q = false;
        mo114625k(false);
        if (z) {
            Set<String> set = this.f241126s;
            C87412m.m108593f(set, "connectedDevices");
            String str2 = this.f241114d.f238147j;
            String str3 = this.f241115e;
            Log.m105924i(str3, "closeAllConnection, appId: " + str2);
            C82225c b = C82220a.m100947b(str2);
            if (b == null) {
                Log.m105928w(this.f241115e, "closeAllConnection, bleWorker is null");
            } else {
                for (String str4 : set) {
                    b.mo114614g(str4, new C89232a(), new C82233e0(this, str4));
                }
            }
        }
        C88509c.C88512b bVar = this.f241118h;
        if (bVar != null) {
            Log.m105924i(this.f241115e, "unregisterAppRunningStateChangeListenerIfNeed, disable");
            C88509c cVar = this.f241114d.f238113K;
            if (cVar != null) {
                cVar.mo122982e(bVar);
            }
            this.f241118h = null;
        }
        C82239h hVar = this.f241117g;
        if (hVar != null) {
            Log.m105924i(this.f241115e, "unregisterBluetoothStateChangeListenerIfNeed, disable");
            this.f241126s.clear();
            Log.m105924i(hVar.f241141b, "disable");
            if (!hVar.f241142c) {
                Log.m105924i(hVar.f241141b, "disable, already disabled");
            } else {
                hVar.f241142c = false;
                C82225c b2 = C82220a.m100947b(hVar.f241140a.f238147j);
                if (b2 == null) {
                    Log.m105924i(hVar.f241141b, "disable, bleWorker is null");
                } else {
                    ((CopyOnWriteArrayList) b2.f241104h).remove(hVar);
                    ((CopyOnWriteArrayList) b2.f241103g).remove(hVar);
                }
            }
            this.f241117g = null;
        }
        mo114623d();
    }
}
