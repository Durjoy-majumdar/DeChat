package p709um;

import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84273a0;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.plugin.appbrand.task.C84311k0;
import com.tencent.p014mm.plugin.appbrand.task.C84315o;
import com.tencent.p014mm.plugin.magicbrush.C85282s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import p235sm.C90228b;
import p235sm.C90229c;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import z04.C112551y;

@C86522b
/* renamed from: um.c */
public final class C90699c extends C86301e implements C90229c {

    /* renamed from: um.c$a */
    public static final class C90700a implements C90229c.C90230a {

        /* renamed from: a */
        public final List<C90229c.C90231b> f260532a;

        /* renamed from: b */
        public final /* synthetic */ C84310k f260533b;

        public C90700a(C84310k kVar, C90699c cVar) {
            this.f260533b = kVar;
            Collection<C80264l> f = kVar.mo111361f();
            ArrayList arrayList = new ArrayList(C36907w.m41090l(f, 10));
            for (C80264l lVar : f) {
                C87412m.m108592e(lVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                cVar.getClass();
                arrayList.add(new C90702d((C84315o) lVar));
            }
            this.f260532a = arrayList;
        }

        /* renamed from: a */
        public String mo124463a() {
            return this.f260533b.mo111363h();
        }

        /* renamed from: b */
        public /* synthetic */ List mo124464b() {
            return C90228b.m112961a(this);
        }

        /* renamed from: c */
        public C90229c.C90232c mo124465c() {
            return this.f260533b.f234942c == LuggageServiceType.WAGAME ? C90229c.C90232c.WAGAME : C90229c.C90232c.WASERVICE;
        }

        /* renamed from: d */
        public List<C90229c.C90231b> mo124466d() {
            return this.f260532a;
        }

        /* renamed from: e */
        public boolean mo124467e() {
            C84310k kVar = this.f260533b;
            kVar.mo111365j();
            return kVar.mo111367l();
        }

        /* renamed from: f */
        public void mo124468f() {
            if (((ArrayList) this.f260532a).isEmpty()) {
                String a = mo124463a();
                if (a == null) {
                    a = "";
                }
                if (!C112551y.m153808h(a, "appbrand1", false, 2, (Object) null) || !C85282s0.f248438c) {
                    mo124469u0();
                } else {
                    Log.m105924i("MicroMsg.AppBrandProcessManagerServiceImpl", "releasePreloadedAndSparedEnvironment skip appbrand1 for mb2.0");
                }
            } else {
                String h = this.f260533b.mo111363h();
                if (h != null) {
                    XIPCInvoker.m98748a(h, IPCVoid.f10316d, C84311k0.class, (C1256g) null);
                }
            }
        }

        /* renamed from: u0 */
        public void mo124469u0() {
            this.f260533b.mo111369n();
        }
    }

    /* renamed from: um.c$b */
    public static final class C90701b implements C90229c.C90230a {

        /* renamed from: a */
        public final LinkedList<C84310k> f260534a = new LinkedList<>();

        /* renamed from: b */
        public final LinkedList<C90229c.C90231b> f260535b = new LinkedList<>();

        /* renamed from: a */
        public String mo124463a() {
            return ((C84310k) C110818d0.m150914L(this.f260534a)).mo111363h();
        }

        /* renamed from: b */
        public /* synthetic */ List mo124464b() {
            return C90228b.m112961a(this);
        }

        /* renamed from: c */
        public C90229c.C90232c mo124465c() {
            return C87412m.m108589b(C84273a0.f246143j, mo124463a()) ? C90229c.C90232c.WASERVICE : C90229c.C90232c.WAGAME;
        }

        /* renamed from: d */
        public List<C90229c.C90231b> mo124466d() {
            return this.f260535b;
        }

        /* renamed from: e */
        public boolean mo124467e() {
            C84310k kVar = (C84310k) C110818d0.m150914L(this.f260534a);
            kVar.mo111365j();
            return kVar.mo111367l();
        }

        /* renamed from: f */
        public void mo124468f() {
            if (this.f260535b.isEmpty()) {
                String a = mo124463a();
                if (a == null) {
                    a = "";
                }
                if (!C112551y.m153808h(a, "appbrand1", false, 2, (Object) null) || !C85282s0.f248438c) {
                    mo124469u0();
                } else {
                    Log.m105924i("MicroMsg.AppBrandProcessManagerServiceImpl", "releasePreloadedAndSparedEnvironment skip appbrand1 for mb2.0");
                }
            } else {
                String h = ((C84310k) C110818d0.m150914L(this.f260534a)).mo111363h();
                if (h != null) {
                    XIPCInvoker.m98748a(h, IPCVoid.f10316d, C84311k0.class, (C1256g) null);
                }
            }
        }

        /* renamed from: u0 */
        public void mo124469u0() {
            ((C84310k) C110818d0.m150914L(this.f260534a)).mo111369n();
            for (C84310k kVar : this.f260534a) {
                kVar.f234942c = LuggageServiceType.NIL;
                kVar.f234940a.clear();
                kVar.mo111365j();
            }
        }
    }

    public List<C90229c.C90230a> L10() {
        AppBrandProcessesManager appBrandProcessesManager;
        try {
            appBrandProcessesManager = AppBrandProcessesManager.f246131g.mo116962a();
        } catch (Throwable th) {
            if (MMApplicationContext.isMainProcess()) {
                appBrandProcessesManager = null;
            } else {
                throw new UnsupportedOperationException("Only supported in main process", th);
            }
        }
        if (appBrandProcessesManager == null) {
            return C64186f0.f181907d;
        }
        if (appBrandProcessesManager instanceof C84273a0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C84310k kVar : ((C84273a0) appBrandProcessesManager).mo111395j()) {
                String h = kVar.mo111363h();
                if (h != null) {
                    C90701b bVar = (C90701b) linkedHashMap.get(h);
                    if (bVar == null) {
                        bVar = new C90701b();
                        linkedHashMap.put(h, bVar);
                    }
                    bVar.f260534a.add(kVar);
                    for (C80264l lVar : kVar.mo111361f()) {
                        LinkedList<C90229c.C90231b> linkedList = bVar.f260535b;
                        C87412m.m108592e(lVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.task.AppBrandMiniProgramRecord");
                        linkedList.add(new C90702d((C84315o) lVar));
                    }
                }
            }
            return new LinkedList(linkedHashMap.values());
        }
        List<C84310k> j = appBrandProcessesManager.mo111395j();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(j, 10));
        for (C84310k aVar : j) {
            arrayList.add(new C90700a(aVar, this));
        }
        return arrayList;
    }
}
