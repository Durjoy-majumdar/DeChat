package p1022pe;

import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p1028re.C89928a;
import p1028re.C89929b;
import p1028re.C89930c;
import p1028re.C89931d;
import p1028re.C89933e;
import p1060we.C90970b;
import p659qe.C89607c;
import p659qe.C89609d;
import p659qe.C89612g;
import p659qe.C89613l;
import p659qe.C89615m;
import p659qe.C89616n;
import p723vf.C118672d;
import p723vf.C90779e;
import p761yd.C91441c;

/* renamed from: pe.b */
public final class C89348b extends C90970b {

    /* renamed from: h */
    public final C89347a f257326h;

    public C89348b(C89347a aVar) {
        C87412m.m108594g(aVar, "memoryCanaryConfig");
        this.f257326h = aVar;
    }

    /* renamed from: b */
    public String mo112098b() {
        return "Matrix.MemoryCanaryPlugin";
    }

    /* renamed from: d */
    public void mo112100d() {
        boolean z;
        boolean z2;
        if (this.f261039g == 2) {
            C118672d.m167352b("Matrix.MemoryCanaryPlugin", "already started", new Object[0]);
            return;
        }
        super.mo112100d();
        C89347a aVar = this.f257326h;
        try {
            z = ProcessSupervisor.f235421k.mo111977d();
        } catch (Throwable th) {
            C118672d.m167354d("Matrix.MemoryCanaryPlugin", th, "", new Object[0]);
            z = false;
        }
        if (z) {
            C118672d.m167351a("Matrix.MemoryCanaryPlugin", "supervisor is " + C90779e.m113846a(this.f261037e), new Object[0]);
            C89612g[] gVarArr = aVar.f257323a;
            C87412m.m108594g(gVarArr, "configs");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C89612g gVar : gVarArr) {
                Long valueOf = Long.valueOf(gVar.f257809e);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((List) obj).add(gVar);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object next : (Iterable) entry.getValue()) {
                    IBackgroundStatefulOwner iBackgroundStatefulOwner = ((C89612g) next).f257808d;
                    Object obj2 = linkedHashMap2.get(iBackgroundStatefulOwner);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap2.put(iBackgroundStatefulOwner, obj2);
                    }
                    ((List) obj2).add(next);
                }
                Iterator it = linkedHashMap2.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        long longValue = ((Number) entry.getKey()).longValue();
                        IBackgroundStatefulOwner iBackgroundStatefulOwner2 = (IBackgroundStatefulOwner) entry2.getKey();
                        Object[] array = ((Collection) entry2.getValue()).toArray(new C89612g[0]);
                        if (array != null) {
                            C89607c cVar = new C89607c(longValue, iBackgroundStatefulOwner2, (C89612g[]) array);
                            String arrays = Arrays.toString(cVar.f257800e);
                            C87412m.m108593f(arrays, "java.util.Arrays.toString(this)");
                            C118672d.m167353c("Matrix.monitor.AppBgSumPssMonitor", arrays, new Object[0]);
                            C89612g[] gVarArr2 = cVar.f257800e;
                            int length = gVarArr2.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    z2 = true;
                                    break;
                                } else if (gVarArr2[i].f257807c) {
                                    z2 = false;
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            if (z2) {
                                C118672d.m167353c("Matrix.monitor.AppBgSumPssMonitor", "none enabled", new Object[0]);
                            } else {
                                cVar.f257799d.addLifecycleCallback((C80401d) new C89609d(cVar));
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                }
            }
        }
        for (C89616n lVar : aVar.f257324b) {
            C89613l lVar2 = new C89613l(lVar);
            C118672d.m167353c("Matrix.monitor.BackgroundMemoryMonitor", String.valueOf(lVar2.f257814c), new Object[0]);
            C89616n nVar = lVar2.f257814c;
            if (nVar.f257821e) {
                nVar.f257822f.observeForever(new C89615m(lVar2));
            }
        }
        ArrayList<C89928a> arrayList = C89931d.f258424a;
        C89929b bVar = aVar.f257325c;
        C87412m.m108594g(bVar, "config");
        if (bVar.f258421a) {
            if (bVar.f258422b.isEmpty()) {
                throw new IllegalArgumentException("config.delayMillis is empty");
            } else if (!C91441c.m114729c()) {
                C118672d.m167352b("Matrix.TrimMemoryNotifier", "Matrix NOT installed yet", new Object[0]);
            } else {
                C91441c d = C91441c.m114730d();
                C87412m.m108593f(d, "Matrix.with()");
                d.f262168b.registerComponentCallbacks(new C89933e());
                ProcessStagedBackgroundOwner processStagedBackgroundOwner = ProcessStagedBackgroundOwner.INSTANCE;
                ArrayList<C89928a> arrayList2 = C89931d.f258424a;
                C89931d.C89932a aVar2 = new C89931d.C89932a("ProcessStagedBg", processStagedBackgroundOwner, arrayList2, bVar, false);
                aVar2.f258430g.addLifecycleCallback((C80401d) new C89930c(aVar2));
                C89931d.C89932a aVar3 = new C89931d.C89932a("ProcessDeepBg", ProcessDeepBackgroundOwner.INSTANCE, arrayList2, bVar, true);
                aVar3.f258430g.addLifecycleCallback((C80401d) new C89930c(aVar3));
                AppStagedBackgroundOwner appStagedBackgroundOwner = AppStagedBackgroundOwner.INSTANCE;
                ArrayList<C89928a> arrayList3 = C89931d.f258425b;
                C89931d.C89932a aVar4 = new C89931d.C89932a("AppStagedBg", appStagedBackgroundOwner, arrayList3, bVar, false);
                aVar4.f258430g.addLifecycleCallback((C80401d) new C89930c(aVar4));
                C89931d.C89932a aVar5 = new C89931d.C89932a("AppDeepBg", AppDeepBackgroundOwner.INSTANCE, arrayList3, bVar, true);
                aVar5.f258430g.addLifecycleCallback((C80401d) new C89930c(aVar5));
            }
        }
    }
}
