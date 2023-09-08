package cj1;

import al1.C54129i;
import al1.C54131l;
import android.os.SystemClock;
import android.util.SparseArray;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import dj1.C58272a1;
import fj1.C45795b;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import it1.C60625c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64175a0;
import sx3.C90364q0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C50512n91;
import te3.ge4;
import zc1.C66785b;

/* renamed from: cj1.z3 */
public final class C54847z3 implements C58272a1.C58273a {

    /* renamed from: a */
    public final PriorityQueue<C54848a<? extends C47465a>> f153752a = new PriorityQueue<>();

    /* renamed from: b */
    public Map<Integer, C54848a<? extends C47465a>> f153753b = new HashMap();

    /* renamed from: c */
    public final SparseArray<C54849b<? extends C47465a>> f153754c = new SparseArray<>();

    /* renamed from: d */
    public final List<Integer> f153755d = new LinkedList();

    /* renamed from: e */
    public final List<Integer> f153756e = new LinkedList();

    /* renamed from: f */
    public C45795b f153757f;

    /* renamed from: g */
    public final MMHandler f153758g = new MMHandler("FinderLivePollingService");

    /* renamed from: h */
    public final Runnable f153759h = new C54850c(this);

    /* renamed from: cj1.z3$a */
    public static final class C54848a<T extends C47465a> implements Comparable<C54848a<T>> {

        /* renamed from: d */
        public final int f153760d;

        /* renamed from: e */
        public T f153761e;

        /* renamed from: f */
        public boolean f153762f;

        /* renamed from: g */
        public int f153763g = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_polling_minimal_duration, 5);

        /* renamed from: h */
        public long f153764h;

        /* renamed from: i */
        public C60625c<? extends C49335eu3> f153765i;

        public C54848a(int i, T t) {
            C87412m.m108594g(t, "req");
            this.f153760d = i;
            this.f153761e = t;
        }

        public int compareTo(Object obj) {
            C54848a aVar = (C54848a) obj;
            C87412m.m108594g(aVar, "other");
            return C87412m.m108597j(this.f153764h, aVar.f153764h);
        }

        public String toString() {
            return "Command(cmdId=" + this.f153760d + ", disabled=" + this.f153762f + ", req=" + this.f153761e + ", intervalSec=" + this.f153763g + ", requestTime=" + this.f153764h + ", requestingCgi=" + this.f153765i + ')';
        }
    }

    /* renamed from: cj1.z3$b */
    public static abstract class C54849b<R extends C47465a> {

        /* renamed from: a */
        public final Class<R> f153766a;

        public C54849b(Class<R> cls) {
            C87412m.m108594g(cls, "resultClass");
            this.f153766a = cls;
        }

        /* renamed from: a */
        public abstract void mo9116a(R r);
    }

    /* renamed from: cj1.z3$c */
    public static final class C54850c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54847z3 f153767d;

        public C54850c(C54847z3 z3Var) {
            this.f153767d = z3Var;
        }

        public final void run() {
            C54131l lVar;
            C54131l lVar2;
            Class cls = C54991o.class;
            Class cls2 = C55001u.class;
            if (this.f153767d.f153757f == null) {
                Log.m105924i("MicroMsg.FinderLivePollingService", "doPollingRequestRunnable liveContext is null, cancel:" + this.f153767d.mo75797c());
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            LinkedList<C54848a> linkedList = new LinkedList<>();
            Iterator<C54848a<? extends C47465a>> it = this.f153767d.f153752a.iterator();
            C87412m.m108593f(it, "pendingCommandList.iterator()");
            StringBuilder sb = new StringBuilder();
            while (it.hasNext()) {
                C54848a next = it.next();
                long j = next.f153764h;
                this.f153767d.getClass();
                if (j > ((long) (C32444a.f86219y1.mo60266n().intValue() * 1000)) + uptimeMillis) {
                    break;
                } else if (!next.f153762f) {
                    linkedList.add(next);
                    sb.append(next.toString());
                    sb.append(",");
                    it.remove();
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("doPollingRequest mergeGap:");
            this.f153767d.getClass();
            sb4.append(C32444a.f86219y1.mo60266n().intValue());
            sb4.append(", ");
            sb4.append(sb);
            sb4.append(' ');
            sb4.append(this.f153767d.mo75797c());
            Log.m105924i("MicroMsg.FinderLivePollingService", sb4.toString());
            C54847z3 z3Var = this.f153767d;
            C45795b bVar = z3Var.f153757f;
            if (bVar != null) {
                Map<Integer, C54848a<? extends C47465a>> map = z3Var.f153753b;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C54848a aVar : linkedList) {
                    arrayList.add(new C13604l(Integer.valueOf(aVar.f153760d), aVar));
                }
                C90364q0.m113150i(map, arrayList);
                C66785b bVar2 = C66785b.f191882e;
                int i = 0;
                boolean z = bVar2.mo90673n0().f131584h == 3;
                C49712hj1 hj12 = new C49712hj1();
                FinderLiveService.f159376d.getClass();
                C54129i iVar = FinderLiveService.f159398z;
                hj12.f134677n = (iVar == null || (lVar2 = iVar.f151988c) == null) ? 0 : lVar2.f152031k;
                if (!(iVar == null || (lVar = iVar.f151988c) == null)) {
                    i = lVar.f152031k;
                }
                hj12.f134675i = i;
                long j2 = ((C55001u) bVar.mo71262a(cls2)).f154420q.f182392d;
                long j3 = ((C55001u) bVar.mo71262a(cls2)).f154416j;
                String str = ((C55001u) bVar.mo71262a(cls2)).f154423t;
                String str2 = ((C54991o) bVar.mo71262a(cls)).f154345o;
                String O5 = z ? bVar2.mo90662O5() : null;
                C89349b a = C89349b.m111674a(((C55001u) bVar.mo71262a(cls2)).f154417n);
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
                Iterator it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    C54848a aVar2 = (C54848a) it4.next();
                    Iterator it5 = it4;
                    ge4 ge4 = new ge4();
                    ge4.f183319d = aVar2.f153760d;
                    ge4.f183320e = C89349b.m111674a(aVar2.f153761e.toByteArray());
                    arrayList2.add(ge4);
                    it4 = it5;
                    hj12 = hj12;
                }
                C49712hj1 hj13 = hj12;
                C89349b bVar3 = a;
                C49712hj1 hj14 = hj13;
                C58272a1 a1Var = new C58272a1(j2, j3, str, str2, O5, bVar3, new LinkedList(arrayList2), ((C54991o) bVar.mo71262a(cls)).f154357q3, z3Var, hj13);
                for (C54848a aVar3 : linkedList) {
                    aVar3.f153765i = a1Var;
                }
                a1Var.mo9225i();
            }
            C54847z3.m61835b(this.f153767d);
        }
    }

    /* renamed from: cj1.z3$d */
    public static final class C54851d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54847z3 f153768d;

        /* renamed from: e */
        public final /* synthetic */ C58272a1 f153769e;

        /* renamed from: f */
        public final /* synthetic */ int f153770f;

        /* renamed from: g */
        public final /* synthetic */ int f153771g;

        /* renamed from: h */
        public final /* synthetic */ C50512n91 f153772h;

        /* renamed from: i */
        public final /* synthetic */ String f153773i;

        public C54851d(C54847z3 z3Var, C58272a1 a1Var, int i, int i2, C50512n91 n912, String str) {
            this.f153768d = z3Var;
            this.f153769e = a1Var;
            this.f153770f = i;
            this.f153771g = i2;
            this.f153772h = n912;
            this.f153773i = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r0 = ((cl1.C55001u) r0.mo71262a(cl1.C55001u.class)).f154420q;
         */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0147  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x018d  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0190  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01fe A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r17 = this;
                r1 = r17
                h81.h$c r2 = h81.C32735h.C32737c.clicfg_finder_live_polling_minimal_duration
                java.lang.Class<h81.h> r3 = h81.C32735h.class
                cj1.z3 r0 = r1.f153768d
                fj1.b r0 = r0.f153757f
                if (r0 == 0) goto L_0x001b
                java.lang.Class<cl1.u> r4 = cl1.C55001u.class
                androidx.lifecycle.i0 r0 = r0.mo71262a(r4)
                cl1.u r0 = (cl1.C55001u) r0
                te3.c21 r0 = r0.f154420q
                if (r0 == 0) goto L_0x001b
                long r4 = r0.f182392d
                goto L_0x001d
            L_0x001b:
                r4 = 0
            L_0x001d:
                dj1.a1 r0 = r1.f153769e
                te3.m91 r6 = r0.f166858v
                long r6 = r6.f184244i
                java.lang.String r8 = "MicroMsg.FinderLivePollingService"
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 == 0) goto L_0x004c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "liveId not match: "
                r0.append(r2)
                dj1.a1 r2 = r1.f153769e
                te3.m91 r2 = r2.f166858v
                long r2 = r2.f184244i
                r0.append(r2)
                java.lang.String r2 = " now: "
                r0.append(r2)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
                return
            L_0x004c:
                int r4 = r1.f153770f
                java.lang.String r5 = " not found"
                java.lang.String r6 = "callback for "
                r7 = 32
                java.lang.String r9 = "errMsg"
                r10 = 1
                r11 = 0
                if (r4 != 0) goto L_0x0202
                int r4 = r1.f153771g
                if (r4 != 0) goto L_0x0202
                te3.n91 r4 = r1.f153772h
                java.util.LinkedList<te3.he4> r4 = r4.f138495d
                if (r4 == 0) goto L_0x0202
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "cgiSuccess "
                r0.append(r4)
                te3.n91 r4 = r1.f153772h
                java.util.LinkedList<te3.he4> r4 = r4.f138495d
                int r4 = r4.size()
                r0.append(r4)
                r0.append(r7)
                cj1.z3 r4 = r1.f153768d
                java.lang.String r4 = r4.mo75797c()
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                te3.n91 r0 = r1.f153772h
                java.util.LinkedList<te3.he4> r0 = r0.f138495d
                if (r0 == 0) goto L_0x02dd
                java.util.List r0 = sx3.C110818d0.m150912J(r0)
                cj1.z3 r4 = r1.f153768d
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.util.Iterator r7 = r0.iterator()
            L_0x009e:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto L_0x02dd
                java.lang.Object r0 = r7.next()
                r13 = r0
                te3.he4 r13 = (te3.he4) r13
                int r0 = r13.f134586e
                if (r0 != 0) goto L_0x01b3
                android.util.SparseArray<cj1.z3$b<? extends pe3.a>> r0 = r4.f153754c
                int r14 = r13.f134585d
                java.lang.Object r0 = r0.get(r14)
                r14 = r0
                cj1.z3$b r14 = (cj1.C54847z3.C54849b) r14
                if (r14 == 0) goto L_0x011b
                pe3.b r0 = r13.f134587f
                if (r0 != 0) goto L_0x00c8
                java.lang.String r0 = "result payload is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
                r16 = r7
                goto L_0x0118
            L_0x00c8:
                java.lang.Class<R> r15 = r14.f153766a     // Catch:{ Exception -> 0x00fa }
                java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x00fa }
                java.lang.reflect.Constructor r12 = r15.getConstructor(r12)     // Catch:{ Exception -> 0x00fa }
                java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x00fa }
                java.lang.Object r12 = r12.newInstance(r15)     // Catch:{ Exception -> 0x00fa }
                pe3.a r12 = (pe3.C47465a) r12     // Catch:{ Exception -> 0x00fa }
                byte[] r0 = r0.mo123703f()     // Catch:{ Exception -> 0x00fa }
                r12.parseFrom(r0)     // Catch:{ Exception -> 0x00e2 }
                r16 = r7
                goto L_0x00f2
            L_0x00e2:
                r0 = move-exception
                r12 = r0
                java.lang.String r0 = "safeParser"
                java.lang.String r15 = ""
                r16 = r7
                java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00f8 }
                r7[r11] = r12     // Catch:{ Exception -> 0x00f8 }
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r15, r7)     // Catch:{ Exception -> 0x00f8 }
                r12 = 0
            L_0x00f2:
                if (r12 == 0) goto L_0x0118
                r14.mo9116a(r12)     // Catch:{ Exception -> 0x00f8 }
                goto L_0x0118
            L_0x00f8:
                r0 = move-exception
                goto L_0x00fd
            L_0x00fa:
                r0 = move-exception
                r16 = r7
            L_0x00fd:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r12 = "parse result payload error: "
                r7.append(r12)
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                gy3.C87412m.m108594g(r7, r9)
                java.lang.Object[] r7 = new java.lang.Object[r11]
                java.lang.String r12 = "callback with data error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r12, r7)
            L_0x0118:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x011e
            L_0x011b:
                r16 = r7
                r0 = 0
            L_0x011e:
                if (r0 != 0) goto L_0x0137
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                int r7 = r13.f134585d
                r0.append(r7)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            L_0x0137:
                java.util.Map<java.lang.Integer, cj1.z3$a<? extends pe3.a>> r0 = r4.f153753b
                int r7 = r13.f134585d
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.Object r0 = r0.get(r7)
                cj1.z3$a r0 = (cj1.C54847z3.C54848a) r0
                if (r0 == 0) goto L_0x018d
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r12 = "update command "
                r7.append(r12)
                r7.append(r0)
                java.lang.String r12 = ", remoteInterval: "
                r7.append(r12)
                int r12 = r13.f134588g
                r7.append(r12)
                java.lang.String r12 = ", minimalIntervalSec:"
                r7.append(r12)
                di3.d r12 = di3.C86312j.m106911c(r3)
                h81.h r12 = (h81.C32735h) r12
                r14 = 5
                int r12 = r12.mo58779Qe(r2, r14)
                r7.append(r12)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
                int r7 = r13.f134588g
                di3.d r12 = di3.C86312j.m106911c(r3)
                h81.h r12 = (h81.C32735h) r12
                int r12 = r12.mo58779Qe(r2, r14)
                if (r7 >= r12) goto L_0x0188
                r7 = r12
            L_0x0188:
                r0.f153763g = r7
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x018e
            L_0x018d:
                r0 = 0
            L_0x018e:
                if (r0 != 0) goto L_0x01fe
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r7 = "requesting command for "
                r0.append(r7)
                int r7 = r13.f134585d
                r0.append(r7)
                java.lang.String r7 = " not found, "
                r0.append(r7)
                java.lang.String r7 = r4.mo75797c()
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                goto L_0x01fe
            L_0x01b3:
                r16 = r7
                android.util.SparseArray<cj1.z3$b<? extends pe3.a>> r0 = r4.f153754c
                int r7 = r13.f134585d
                java.lang.Object r0 = r0.get(r7)
                cj1.z3$b r0 = (cj1.C54847z3.C54849b) r0
                if (r0 == 0) goto L_0x01c4
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x01c5
            L_0x01c4:
                r0 = 0
            L_0x01c5:
                if (r0 != 0) goto L_0x01de
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                int r7 = r13.f134585d
                r0.append(r7)
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            L_0x01de:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r7 = "ret for "
                r0.append(r7)
                int r7 = r13.f134585d
                r0.append(r7)
                java.lang.String r7 = " is "
                r0.append(r7)
                int r7 = r13.f134586e
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            L_0x01fe:
                r7 = r16
                goto L_0x009e
            L_0x0202:
                cj1.z3 r2 = r1.f153768d
                java.util.Map<java.lang.Integer, cj1.z3$a<? extends pe3.a>> r2 = r2.f153753b
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>()
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x0213:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x0239
                java.lang.Object r4 = r2.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r12 = r4.getValue()
                cj1.z3$a r12 = (cj1.C54847z3.C54848a) r12
                it1.c<? extends te3.eu3> r12 = r12.f153765i
                boolean r12 = gy3.C87412m.m108589b(r12, r0)
                if (r12 == 0) goto L_0x0213
                java.lang.Object r12 = r4.getKey()
                java.lang.Object r4 = r4.getValue()
                r3.put(r12, r4)
                goto L_0x0213
            L_0x0239:
                cj1.z3 r0 = r1.f153768d
                int r2 = r1.f153771g
                int r4 = r1.f153770f
                java.lang.String r12 = r1.f153773i
                java.util.Set r3 = r3.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x0249:
                boolean r13 = r3.hasNext()
                if (r13 == 0) goto L_0x02ab
                java.lang.Object r13 = r3.next()
                java.util.Map$Entry r13 = (java.util.Map.Entry) r13
                android.util.SparseArray<cj1.z3$b<? extends pe3.a>> r14 = r0.f153754c
                java.lang.Object r15 = r13.getValue()
                cj1.z3$a r15 = (cj1.C54847z3.C54848a) r15
                int r15 = r15.f153760d
                java.lang.Object r14 = r14.get(r15)
                cj1.z3$b r14 = (cj1.C54847z3.C54849b) r14
                if (r14 == 0) goto L_0x028a
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = "cgiRespError "
                r14.append(r15)
                r14.append(r4)
                r14.append(r7)
                r14.append(r2)
                r14.append(r7)
                r14.append(r12)
                java.lang.String r14 = r14.toString()
                gy3.C87412m.m108594g(r14, r9)
                rx3.b0 r14 = rx3.C13598b0.f38549a
                goto L_0x028b
            L_0x028a:
                r14 = 0
            L_0x028b:
                if (r14 != 0) goto L_0x0249
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r6)
                java.lang.Object r13 = r13.getValue()
                cj1.z3$a r13 = (cj1.C54847z3.C54848a) r13
                int r13 = r13.f153760d
                r14.append(r13)
                r14.append(r5)
                java.lang.String r13 = r14.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r13)
                goto L_0x0249
            L_0x02ab:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "cgiError: "
                r0.append(r2)
                int r2 = r1.f153770f
                r0.append(r2)
                r0.append(r7)
                int r2 = r1.f153771g
                r0.append(r2)
                r0.append(r7)
                java.lang.String r2 = r1.f153773i
                r0.append(r2)
                r0.append(r7)
                cj1.z3 r2 = r1.f153768d
                java.lang.String r2 = r2.mo75797c()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            L_0x02dd:
                cj1.z3 r0 = r1.f153768d
                java.util.Map<java.lang.Integer, cj1.z3$a<? extends pe3.a>> r2 = r0.f153753b
                dj1.a1 r3 = r1.f153769e
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x02f0:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x0334
                java.lang.Object r5 = r2.next()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r6 = r5.getValue()
                cj1.z3$a r6 = (cj1.C54847z3.C54848a) r6
                it1.c<? extends te3.eu3> r7 = r6.f153765i
                boolean r7 = gy3.C87412m.m108589b(r7, r3)
                if (r7 == 0) goto L_0x0324
                r7 = 0
                r6.f153765i = r7
                boolean r8 = r6.f153762f
                if (r8 != 0) goto L_0x031d
                long r8 = android.os.SystemClock.uptimeMillis()
                int r12 = r6.f153763g
                int r12 = r12 * 1000
                long r12 = (long) r12
                long r8 = r8 + r12
                r6.f153764h = r8
            L_0x031d:
                java.util.PriorityQueue<cj1.z3$a<? extends pe3.a>> r8 = r0.f153752a
                r8.add(r6)
                r6 = 0
                goto L_0x0326
            L_0x0324:
                r7 = 0
                r6 = 1
            L_0x0326:
                if (r6 == 0) goto L_0x02f0
                java.lang.Object r6 = r5.getKey()
                java.lang.Object r5 = r5.getValue()
                r4.put(r6, r5)
                goto L_0x02f0
            L_0x0334:
                java.util.Map r2 = sx3.C90364q0.m113155n(r4)
                r0.f153753b = r2
                cj1.z3 r0 = r1.f153768d
                cj1.C54847z3.m61835b(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cj1.C54847z3.C54851d.run():void");
        }
    }

    /* renamed from: cj1.z3$e */
    public static final class C54852e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54847z3 f153774d;

        /* renamed from: e */
        public final /* synthetic */ int f153775e;

        /* renamed from: f */
        public final /* synthetic */ T f153776f;

        /* renamed from: g */
        public final /* synthetic */ C54849b<R> f153777g;

        /* renamed from: h */
        public final /* synthetic */ boolean f153778h;

        /* renamed from: cj1.z3$e$a */
        public static final class C54853a extends C87413o implements C32226l<C54848a<? extends C47465a>, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ int f153779d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54853a(int i) {
                super(1);
                this.f153779d = i;
            }

            public Object invoke(Object obj) {
                return Boolean.valueOf(((C54848a) obj).f153760d == this.f153779d);
            }
        }

        public C54852e(C54847z3 z3Var, int i, T t, C54849b<R> bVar, boolean z) {
            this.f153774d = z3Var;
            this.f153775e = i;
            this.f153776f = t;
            this.f153777g = bVar;
            this.f153778h = z;
        }

        public final void run() {
            if (this.f153774d.f153757f == null) {
                Log.m105928w("MicroMsg.FinderLivePollingService", "startPolling but liveContext = null: " + this.f153775e + ", " + this.f153774d.mo75797c());
                return;
            }
            Log.m105924i("MicroMsg.FinderLivePollingService", "startPolling " + this.f153775e + ' ' + this.f153776f + ' ' + this.f153774d.mo75797c());
            this.f153774d.f153754c.put(this.f153775e, this.f153777g);
            C54848a aVar = new C54848a(this.f153775e, this.f153776f);
            C64175a0.m75511s(this.f153774d.f153752a, new C54853a(this.f153775e));
            this.f153774d.f153753b.remove(Integer.valueOf(this.f153775e));
            if (!((LinkedList) this.f153774d.f153755d).contains(Integer.valueOf(this.f153775e))) {
                Log.m105924i("MicroMsg.FinderLivePollingService", "startPolling but cmdId not in enabled list " + this.f153775e);
                aVar.f153762f = true;
                aVar.f153764h = MAlarmHandler.NEXT_FIRE_INTERVAL;
            }
            if (this.f153778h) {
                ((LinkedList) this.f153774d.f153756e).add(Integer.valueOf(this.f153775e));
            }
            this.f153774d.f153752a.add(aVar);
            C54847z3.m61835b(this.f153774d);
        }
    }

    /* renamed from: cj1.z3$f */
    public static final class C54854f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f153780d;

        /* renamed from: e */
        public final /* synthetic */ C54847z3 f153781e;

        /* renamed from: cj1.z3$f$a */
        public static final class C54855a extends C87413o implements C32226l<C54848a<? extends C47465a>, Boolean> {

            /* renamed from: d */
            public final /* synthetic */ int f153782d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C54855a(int i) {
                super(1);
                this.f153782d = i;
            }

            public Object invoke(Object obj) {
                return Boolean.valueOf(((C54848a) obj).f153760d == this.f153782d);
            }
        }

        public C54854f(int i, C54847z3 z3Var) {
            this.f153780d = i;
            this.f153781e = z3Var;
        }

        public final void run() {
            Log.m105924i("MicroMsg.FinderLivePollingService", "stopPolling " + this.f153780d + ' ' + this.f153781e.mo75797c());
            this.f153781e.f153754c.remove(this.f153780d);
            ((LinkedList) this.f153781e.f153756e).remove(Integer.valueOf(this.f153780d));
            C64175a0.m75511s(this.f153781e.f153752a, new C54855a(this.f153780d));
            this.f153781e.f153753b.remove(Integer.valueOf(this.f153780d));
            C54847z3.m61835b(this.f153781e);
        }
    }

    /* renamed from: cj1.z3$g */
    public static final class C54856g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f153783d;

        /* renamed from: e */
        public final /* synthetic */ T f153784e;

        /* renamed from: f */
        public final /* synthetic */ C54847z3 f153785f;

        public C54856g(int i, T t, C54847z3 z3Var) {
            this.f153783d = i;
            this.f153784e = t;
            this.f153785f = z3Var;
        }

        public final void run() {
            C54848a aVar;
            C54848a<? extends C47465a> aVar2;
            boolean z;
            Log.m105924i("MicroMsg.FinderLivePollingService", "update req for " + this.f153783d + ' ' + this.f153784e);
            PriorityQueue<C54848a<? extends C47465a>> priorityQueue = this.f153785f.f153752a;
            int i = this.f153783d;
            Iterator<C54848a<? extends C47465a>> it = priorityQueue.iterator();
            while (true) {
                aVar = null;
                if (!it.hasNext()) {
                    aVar2 = null;
                    break;
                }
                aVar2 = it.next();
                if (aVar2.f153760d == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C54848a aVar3 = aVar2 instanceof C54848a ? aVar2 : null;
            if (aVar3 != null) {
                T t = this.f153784e;
                C87412m.m108594g(t, "<set-?>");
                aVar3.f153761e = t;
            }
            C54848a<? extends C47465a> aVar4 = this.f153785f.f153753b.get(Integer.valueOf(this.f153783d));
            if (aVar4 instanceof C54848a) {
                aVar = aVar4;
            }
            if (aVar != null) {
                T t2 = this.f153784e;
                C87412m.m108594g(t2, "<set-?>");
                aVar.f153761e = t2;
            }
        }
    }

    /* renamed from: b */
    public static final void m61835b(C54847z3 z3Var) {
        C13598b0 b0Var;
        z3Var.f153758g.removeCallbacks(z3Var.f153759h);
        HashSet hashSet = new HashSet();
        Iterator<C54848a<? extends C47465a>> it = z3Var.f153752a.iterator();
        C87412m.m108593f(it, "pendingCommandList.iterator()");
        while (it.hasNext()) {
            C54848a next = it.next();
            if (hashSet.contains(Integer.valueOf(next.f153760d))) {
                Log.m105928w("MicroMsg.FinderLivePollingService", "duplicate pending command found, remove it " + z3Var.mo75797c());
                it.remove();
            } else {
                hashSet.add(Integer.valueOf(next.f153760d));
            }
        }
        C54848a peek = z3Var.f153752a.peek();
        if (peek != null) {
            if (peek.f153762f) {
                Log.m105924i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime first command is disabled " + z3Var.mo75797c());
            } else {
                long j = peek.f153764h;
                if (j == 0 || j <= SystemClock.uptimeMillis()) {
                    Log.m105924i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime doRequestNow:" + peek + ' ' + z3Var.mo75797c());
                    z3Var.f153758g.post(z3Var.f153759h);
                } else {
                    Log.m105924i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime pendingRequest:" + peek + ' ' + z3Var.mo75797c());
                    z3Var.f153758g.postAtTime(z3Var.f153759h, j);
                }
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i("MicroMsg.FinderLivePollingService", "checkNextPollingRequestTime pendingList is empty " + z3Var.mo75797c());
        }
    }

    /* renamed from: a */
    public void mo75796a(C58272a1 a1Var, int i, int i2, String str, C50512n91 n912) {
        C87412m.m108594g(a1Var, "cgi");
        C87412m.m108594g(n912, "resp");
        this.f153758g.post(new C54851d(this, a1Var, i, i2, n912, str));
    }

    /* renamed from: c */
    public final String mo75797c() {
        StringBuilder sb = new StringBuilder();
        sb.append(" || pendingCommandList: [");
        for (C54848a aVar : this.f153752a) {
            sb.append(aVar.toString());
            sb.append(",");
        }
        sb.append("] requestingCommandList: [");
        for (C54848a aVar2 : this.f153753b.values()) {
            sb.append(aVar2.toString());
            sb.append(",");
        }
        sb.append("] enabledCmdIds:[" + mo75798d(this.f153755d) + ']');
        sb.append("] enabledCmdIdsInMiniMode:[" + mo75798d(this.f153756e) + ']');
        sb.append(" now:[" + SystemClock.uptimeMillis() + ']');
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: d */
    public final String mo75798d(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (Number intValue : list) {
            sb.append(intValue.intValue());
            sb.append(",");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    /* renamed from: e */
    public final <T extends C47465a, R extends C47465a> void mo75799e(int i, T t, C54849b<R> bVar, boolean z) {
        C87412m.m108594g(t, "req");
        C87412m.m108594g(bVar, "callback");
        this.f153758g.post(new C54852e(this, i, t, bVar, z));
    }

    /* renamed from: f */
    public final void mo75800f(int i) {
        this.f153758g.post(new C54854f(i, this));
    }

    /* renamed from: g */
    public final void mo75801g(int i, boolean z, boolean z2) {
        C54848a<? extends C47465a> aVar;
        boolean z3;
        C54848a aVar2 = this.f153753b.get(Integer.valueOf(i));
        if (aVar2 != null) {
            aVar2.f153762f = z;
            if (z) {
                aVar2.f153764h = MAlarmHandler.NEXT_FIRE_INTERVAL;
            }
        }
        Iterator<C54848a<? extends C47465a>> it = this.f153752a.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (aVar.f153760d == i) {
                z3 = true;
                continue;
            } else {
                z3 = false;
                continue;
            }
            if (z3) {
                break;
            }
        }
        C54848a aVar3 = aVar;
        if (aVar3 != null) {
            this.f153752a.remove(aVar3);
            aVar3.f153762f = z;
            if (z) {
                aVar3.f153764h = MAlarmHandler.NEXT_FIRE_INTERVAL;
            }
            if (!z) {
                aVar3.f153764h = z2 ? 0 : SystemClock.uptimeMillis() + ((long) (aVar3.f153763g * 1000));
            }
            this.f153752a.add(aVar3);
            Log.m105924i("MicroMsg.FinderLivePollingService", "updateCmdIdDisabledState " + i + ' ' + z + ' ' + z2 + ' ' + mo75797c());
        }
    }

    /* renamed from: h */
    public final <T extends C47465a> void mo75802h(int i, T t) {
        C87412m.m108594g(t, "req");
        this.f153758g.post(new C54856g(i, t, this));
    }
}
