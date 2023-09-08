package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.ipcinvoker.C1254b;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import rx3.C13598b0;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.y2 */
public final class C2027y2 {

    /* renamed from: a */
    public static final C2027y2 f11975a = new C2027y2();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.ui.y2$a */
    public static final class C2028a<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C2028a<InputType, ResultType> f11976d = new C2028a<>();

        public void invoke(Object obj, C1256g gVar) {
            ConcurrentHashMap<String, C32224a<C13598b0>> concurrentHashMap = C2031z2.f11979a;
            String str = ((IPCString) obj).f10315d;
            C87412m.m108593f(str, "data.value");
            C2031z2.f11979a.put(str, new C2025x2(gVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.y2$b */
    public static final class C2029b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ String f11977d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference<AppBrandUI> f11978e;

        public C2029b(String str, WeakReference<AppBrandUI> weakReference) {
            this.f11977d = str;
            this.f11978e = weakReference;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackGuardIPCHelper", "callback invoke, key:" + this.f11977d);
            AppBrandUI appBrandUI = this.f11978e.get();
            if (appBrandUI != null) {
                appBrandUI.mo117108X7();
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/ui/y2$c", "Lcom/tencent/mm/ipcinvoker/b;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.ui.y2$c */
    public static final class C2030c extends C1254b<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(iPCString, "data");
            ConcurrentHashMap<String, C32224a<C13598b0>> concurrentHashMap = C2031z2.f11979a;
            String str = iPCString.f10315d;
            C87412m.m108593f(str, "data.value");
            C2031z2.f11979a.remove(str);
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    /* renamed from: b */
    public static final void m1978b(AppBrandUI appBrandUI) {
        C87412m.m108594g(appBrandUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!(appBrandUI instanceof AppBrandPluginUI) && !C85875k4.m106199o0()) {
            WeakReference weakReference = new WeakReference(appBrandUI);
            String a = f11975a.mo1962a(appBrandUI);
            C15618a.m14626b(new IPCString(a), C2028a.f11976d, new C2029b(a, weakReference));
        }
    }

    /* renamed from: c */
    public static final void m1979c(AppBrandUI appBrandUI) {
        C87412m.m108594g(appBrandUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!(appBrandUI instanceof AppBrandPluginUI)) {
            C15618a.m14626b(new IPCString(f11975a.mo1962a(appBrandUI)), new C2030c(), (C1256g) null);
        }
    }

    /* renamed from: a */
    public final String mo1962a(AppBrandUI appBrandUI) {
        return appBrandUI.getComponentName().getShortClassName() + '@' + appBrandUI.hashCode();
    }
}
