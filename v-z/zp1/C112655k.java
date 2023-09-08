package zp1;

import aq1.C26818b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p204mr.C109636p;
import p204mr.C61570q;
import sx3.C64175a0;

/* renamed from: zp1.k */
public final class C112655k {

    /* renamed from: a */
    public final C26818b f337350a = new C26818b();

    /* renamed from: b */
    public final List<C112648e> f337351b = new ArrayList();

    /* renamed from: c */
    public final C112657b f337352c = new C112657b();

    /* renamed from: zp1.k$a */
    public static final class C112656a {
        public C112656a(C8480h hVar) {
        }
    }

    /* renamed from: zp1.k$b */
    public static final class C112657b {

        /* renamed from: a */
        public final Map<C61570q, List<C112658a>> f337353a = new LinkedHashMap();

        /* renamed from: zp1.k$b$a */
        public static final class C112658a {

            /* renamed from: a */
            public final String f337354a;

            /* renamed from: b */
            public final C112648e f337355b;

            public C112658a(String str, C112648e eVar) {
                C87412m.m108594g(str, "matchKey");
                C87412m.m108594g(eVar, "node");
                this.f337354a = str;
                this.f337355b = eVar;
            }

            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            public int hashCode() {
                return (this.f337354a.hashCode() * 31) + this.f337355b.hashCode();
            }

            public String toString() {
                return "Value(matchKey=" + this.f337354a + ", node=" + this.f337355b + ')';
            }
        }
    }

    static {
        new C112656a((C8480h) null);
    }

    /* renamed from: a */
    public void mo164394a(C112648e eVar, String str) {
        Class cls = C109636p.class;
        C87412m.m108594g(eVar, "node");
        C87412m.m108594g(str, "matchKey");
        Log.m105924i("TraceWorker", "#beforeIn matchKey=" + str);
        if (((ArrayList) this.f337351b).size() >= ((C109636p) C86312j.m106911c(cls)).Mw0()) {
            C64175a0.m75514v(this.f337351b);
        }
        ((ArrayList) this.f337351b).add(eVar);
        Log.m105924i("TraceWorker", "#beforeIn node=" + eVar.hashCode());
        C112657b bVar = this.f337352c;
        bVar.getClass();
        Log.m105924i("EnterNodeSearcher", "#put scene=" + eVar.f337298a + " matchKey=" + str + " node=" + eVar.hashCode());
        Object obj = ((LinkedHashMap) bVar.f337353a).get(eVar.f337298a);
        if (obj == null) {
            obj = new ArrayList();
        }
        List list = (List) obj;
        list.add(new C112657b.C112658a(str, eVar));
        if (list.size() > ((C109636p) C86312j.m106911c(cls)).mo61070qP()) {
            C64175a0.m75514v(list);
        }
        bVar.f337353a.put(eVar.f337298a, list);
        Log.m105924i("EnterNodeSearcher", "#put list.size=" + list.size());
        this.f337350a.mo53791a(C112647d.m154027a(this, eVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00af, code lost:
        r5 = r5.f337355b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo164395b(zp1.C112648e r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "node"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "matchKey"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#beforeOut matchKey="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TraceWorker"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.util.List<zp1.e> r0 = r10.f337351b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            java.lang.Class<mr.p> r2 = p204mr.C109636p.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            mr.p r2 = (p204mr.C109636p) r2
            int r2 = r2.Mw0()
            if (r0 < r2) goto L_0x003b
            java.util.List<zp1.e> r0 = r10.f337351b
            sx3.C64175a0.m75514v(r0)
        L_0x003b:
            zp1.k$b r0 = r10.f337352c
            mr.q r2 = r11.f337298a
            r0.getClass()
            java.lang.String r3 = "scene"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#getAndRemove scene="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " matchKey="
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "EnterNodeSearcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            gy3.f0 r3 = new gy3.f0
            r3.<init>()
            java.util.Map<mr.q, java.util.List<zp1.k$b$a>> r5 = r0.f337353a
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r5 = r5.get(r2)
            java.util.List r5 = (java.util.List) r5
            r6 = 0
            if (r5 == 0) goto L_0x009f
            java.util.List r7 = sx3.C110818d0.m150936h0(r5)
            java.util.Iterator r7 = r7.iterator()
        L_0x007f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0095
            java.lang.Object r8 = r7.next()
            r9 = r8
            zp1.k$b$a r9 = (zp1.C112655k.C112657b.C112658a) r9
            java.lang.String r9 = r9.f337354a
            boolean r9 = gy3.C87412m.m108589b(r9, r12)
            if (r9 == 0) goto L_0x007f
            goto L_0x0096
        L_0x0095:
            r8 = r6
        L_0x0096:
            r3.f27484d = r8
            zp1.k$b$a r8 = (zp1.C112655k.C112657b.C112658a) r8
            if (r8 == 0) goto L_0x009f
            r5.remove(r8)
        L_0x009f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r5 = "#getAndRemove finallyNode="
            r12.append(r5)
            T r5 = r3.f27484d
            zp1.k$b$a r5 = (zp1.C112655k.C112657b.C112658a) r5
            if (r5 == 0) goto L_0x00bc
            zp1.e r5 = r5.f337355b
            if (r5 == 0) goto L_0x00bc
            int r5 = r5.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x00bd
        L_0x00bc:
            r5 = r6
        L_0x00bd:
            r12.append(r5)
            java.lang.String r5 = " now size="
            r12.append(r5)
            java.util.Map<mr.q, java.util.List<zp1.k$b$a>> r0 = r0.f337353a
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00da
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00db
        L_0x00da:
            r0 = r6
        L_0x00db:
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            T r12 = r3.f27484d
            zp1.k$b$a r12 = (zp1.C112655k.C112657b.C112658a) r12
            if (r12 == 0) goto L_0x00ed
            zp1.e r6 = r12.f337355b
        L_0x00ed:
            r11.f337301d = r6
            java.util.List<zp1.e> r12 = r10.f337351b
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.add(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "#beforeOut node="
            r12.append(r0)
            int r0 = r11.hashCode()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            aq1.b r12 = r10.f337350a
            aq1.a r11 = zp1.C112647d.m154027a(r10, r11)
            r12.mo53791a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zp1.C112655k.mo164395b(zp1.e, java.lang.String):void");
    }

    /* renamed from: c */
    public void mo164396c(C112648e eVar) {
        C87412m.m108594g(eVar, "node");
        if (((ArrayList) this.f337351b).size() >= ((C109636p) C86312j.m106911c(C109636p.class)).Mw0()) {
            C64175a0.m75514v(this.f337351b);
        }
        ((ArrayList) this.f337351b).add(eVar);
        Log.m105924i("TraceWorker", "#justOnce node=" + eVar.hashCode());
        this.f337350a.mo53791a(C112647d.m154027a(this, eVar));
    }
}
