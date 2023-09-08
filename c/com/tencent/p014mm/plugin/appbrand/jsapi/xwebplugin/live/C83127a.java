package com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C81594v;
import com.tencent.p014mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.PhoneStatusWatcher;
import di3.C86312j;
import gy3.C87412m;
import io0.C33372i;
import io0.C33373j;
import io0.g$$a;
import io0.g$$b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p1066yc.C91424t;
import p292ad.C79502b;
import p301cd.C80005q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.a */
public class C83127a extends C81594v {

    /* renamed from: d */
    public String f242924d = "MicroMsg.AppBrandRuntimeLiveVOIPStateManager";

    /* renamed from: e */
    public final AppBrandRuntime f242925e;

    /* renamed from: f */
    public final C33373j f242926f;

    /* renamed from: g */
    public volatile boolean f242927g;

    /* renamed from: h */
    public boolean f242928h;

    /* renamed from: i */
    public volatile C91424t f242929i;

    /* renamed from: j */
    public final Set<C91424t> f242930j;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.a$a */
    public class C83128a extends C83231l.C83234d {
        public C83128a() {
        }

        /* renamed from: c */
        public void mo109497c() {
            C33373j jVar = C83127a.this.f242926f;
            jVar.getClass();
            ((PhoneStatusWatcher) C86312j.m106911c(PhoneStatusWatcher.class)).removePhoneCallListener(jVar);
        }
    }

    public C83127a(AppBrandRuntime appBrandRuntime) {
        C33373j jVar = new C33373j(new g$$a(this), new g$$b(this));
        this.f242926f = jVar;
        this.f242927g = false;
        this.f242928h = true;
        this.f242930j = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f242924d += "#" + hashCode() + "Runtime#" + appBrandRuntime.hashCode();
        this.f242925e = appBrandRuntime;
        C87412m.m108594g(appBrandRuntime.f238141d, "context");
        ((C119157j) C119157j.f356862d).mo183895z(new C33372i(jVar));
        C83231l.m102140a(appBrandRuntime.f238147j, new C83128a());
    }

    /* renamed from: c */
    public boolean mo113872c() {
        return this.f242929i != null && !this.f242930j.isEmpty();
    }

    /* renamed from: d */
    public void mo115365d(AppBrandRuntime appBrandRuntime, boolean z) {
        boolean c = mo113872c();
        Log.m105925i(this.f242924d, "enableMic, enable:%s, isVOIPing: %b", Boolean.valueOf(z), Boolean.valueOf(c));
        if (c) {
            boolean z2 = this.f242928h;
            this.f242928h = z;
            if (z2 != z) {
                mo115366e(appBrandRuntime, 1);
            }
        }
    }

    /* renamed from: e */
    public final void mo115366e(AppBrandRuntime appBrandRuntime, int i) {
        AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new AppBrandBackgroundRunningOperationEvent();
        appBrandBackgroundRunningOperationEvent.f242920d.f242921a = appBrandRuntime.f238147j;
        AppBrandBackgroundRunningOperationEvent.C83126a aVar = appBrandBackgroundRunningOperationEvent.f242920d;
        aVar.f242922b = 4;
        aVar.f242923c = i;
        appBrandBackgroundRunningOperationEvent.publish();
    }

    /* renamed from: k */
    public boolean mo115367k(C91424t tVar, int i) {
        boolean z;
        if (mo113872c() && i != 3) {
            if (tVar instanceof C80005q) {
                if (this.f242929i == tVar) {
                    z = true;
                    Log.m105925i(this.f242924d, "shouldInterceptEnterBackground, result:%s, isVOIPing:%s, type:%s", Boolean.valueOf(z), Boolean.valueOf(mo113872c()), Integer.valueOf(i));
                    return z;
                }
            } else if (tVar instanceof C79502b) {
                z = this.f242930j.contains(tVar);
                Log.m105925i(this.f242924d, "shouldInterceptEnterBackground, result:%s, isVOIPing:%s, type:%s", Boolean.valueOf(z), Boolean.valueOf(mo113872c()), Integer.valueOf(i));
                return z;
            }
        }
        z = false;
        Log.m105925i(this.f242924d, "shouldInterceptEnterBackground, result:%s, isVOIPing:%s, type:%s", Boolean.valueOf(z), Boolean.valueOf(mo113872c()), Integer.valueOf(i));
        return z;
    }
}
