package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kr0.C33994g0;
import rx3.C13598b0;

@C86522b(dependencies = {C81161g2.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.a */
public final class C29177a extends C86301e implements C33994g0 {

    /* renamed from: d */
    public final C29178a f79803d;

    /* renamed from: e */
    public final ConcurrentHashMap<String, List<C33994g0.C33996b>> f79804e;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.a$a */
    public static final class C29178a implements C33994g0.C33995a {

        /* renamed from: a */
        public final Object f79805a = new Object();

        /* renamed from: b */
        public List<String> f79806b;

        /* renamed from: c */
        public C32226l<? super String, C13598b0> f79807c;

        /* renamed from: a */
        public boolean mo56494a(String str) {
            boolean remove;
            C87412m.m108594g(str, "appId");
            synchronized (this.f79805a) {
                List<String> list = this.f79806b;
                remove = list != null ? ((ArrayList) list).remove(str) : false;
                C32226l<? super String, C13598b0> lVar = this.f79807c;
                if (lVar != null) {
                    lVar.invoke(str);
                }
            }
            return remove;
        }

        /* renamed from: b */
        public void mo56495b(List<String> list) {
            C87412m.m108594g(list, "appIdList");
            synchronized (this.f79805a) {
                this.f79806b = new ArrayList(list);
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }

        public void release() {
            synchronized (this.f79805a) {
                List<String> list = this.f79806b;
                if (list != null) {
                    ((ArrayList) list).clear();
                }
                this.f79807c = null;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.a$b */
    public static final class C29179b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C29177a f79808d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29179b(C29177a aVar) {
            super(1);
            this.f79808d = aVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "appId");
            List list = this.f79808d.f79804e.get(str);
            if (list != null) {
                Iterator it = new ArrayList(list).iterator();
                while (it.hasNext()) {
                    ((C33994g0.C33996b) it.next()).mo56819a();
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C29177a() {
        C29178a aVar = new C29178a();
        C29179b bVar = new C29179b(this);
        synchronized (aVar.f79805a) {
            aVar.f79807c = bVar;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        this.f79803d = aVar;
        this.f79804e = new ConcurrentHashMap<>();
    }

    public void Dg0(String str, C33994g0.C33996b bVar) {
        boolean contains;
        C87412m.m108594g(str, "appId");
        if (bVar != null) {
            ConcurrentHashMap<String, List<C33994g0.C33996b>> concurrentHashMap = this.f79804e;
            Object obj = concurrentHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
            }
            concurrentHashMap.put(str, obj);
            List<C33994g0.C33996b> list = this.f79804e.get(str);
            C87412m.m108591d(list);
            list.add(bVar);
            C29178a aVar = this.f79803d;
            aVar.getClass();
            synchronized (aVar.f79805a) {
                List<String> list2 = aVar.f79806b;
                contains = list2 != null ? ((ArrayList) list2).contains(str) : false;
            }
            if (!contains) {
                bVar.mo56819a();
            }
        }
    }

    /* renamed from: ST */
    public void mo56492ST(String str, C33994g0.C33996b bVar) {
        C87412m.m108594g(str, "appId");
        if (bVar != null) {
            List list = this.f79804e.get(str);
            if (list != null) {
                list.remove(bVar);
            }
            List list2 = this.f79804e.get(str);
            boolean z = true;
            if (list2 == null || !list2.isEmpty()) {
                z = false;
            }
            if (z) {
                this.f79804e.remove(str);
            }
        }
    }

    /* renamed from: Xl */
    public C33994g0.C33995a mo56493Xl() {
        return this.f79803d;
    }
}
