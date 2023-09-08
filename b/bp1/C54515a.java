package bp1;

import cj1.C54843w3;
import cl1.C39970c;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import cp1.C57941h;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C63947a;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C48742ao0;
import te3.C49030co0;
import te3.C50996qq1;
import te3.C51343t41;
import te3.C52013xs0;
import te3.C64674r41;
import vo1.C65770a0;
import yo1.C66688d;
import yo1.C66689e;

/* renamed from: bp1.a */
public final class C54515a extends C39970c<C45795b> {

    /* renamed from: f */
    public volatile String f152821f = "";

    /* renamed from: g */
    public volatile boolean f152822g;

    /* renamed from: h */
    public C66689e f152823h = new C66689e(0, 0, 0, false, 15, (C8480h) null);

    /* renamed from: i */
    public C66688d f152824i;

    /* renamed from: j */
    public CopyOnWriteArrayList<C50996qq1> f152825j = new CopyOnWriteArrayList<>();

    /* renamed from: n */
    public final C13601g f152826n = C36568h.m40985a(C54517b.f152836d);

    /* renamed from: o */
    public boolean f152827o;

    /* renamed from: p */
    public boolean f152828p;

    /* renamed from: q */
    public int f152829q;

    /* renamed from: r */
    public C49030co0 f152830r;

    /* renamed from: s */
    public int f152831s;

    /* renamed from: bp1.a$a */
    public static final class C54516a extends C87413o implements C32226l<C89132b.C89134c<C49030co0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54515a f152832d;

        /* renamed from: e */
        public final /* synthetic */ int f152833e;

        /* renamed from: f */
        public final /* synthetic */ boolean f152834f;

        /* renamed from: g */
        public final /* synthetic */ C8477a0 f152835g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54516a(C54515a aVar, int i, boolean z, C8477a0 a0Var) {
            super(1);
            this.f152832d = aVar;
            this.f152833e = i;
            this.f152834f = z;
            this.f152835g = a0Var;
        }

        public Object invoke(Object obj) {
            int i;
            ArrayList<C64674r41> arrayList;
            LinkedList<C64674r41> linkedList;
            LinkedList<C64674r41> linkedList2;
            int i2;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C54991o.class;
            this.f152832d.f152822g = false;
            if (cVar != null && cVar.f256793a == 0) {
                if (cVar != null && cVar.f256794b == 0) {
                    if (!Util.equals(((C49030co0) cVar.f256796d).f131869o, this.f152832d.f152821f)) {
                        Log.m105920e("LiveMsgOffsetSlice", "reps unique_cod:" + ((C49030co0) cVar.f256796d).f131869o + ", local last request unique_cod:" + this.f152832d.f152821f + " not equal!");
                    } else {
                        if (C58739j4.f168176a.mo83692U()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("CgiFinderGetLiveMsgWithOffset resp info:");
                            C63947a aVar = C63947a.f181274a;
                            T t = cVar.f256796d;
                            C87412m.m108593f(t, "it.resp");
                            sb.append(aVar.mo88722g((C49030co0) t));
                            Log.m105924i("LiveMsgOffsetSlice", sb.toString());
                        }
                        C50996qq1 qq12 = (C50996qq1) C110818d0.m150925W(this.f152832d.f152825j);
                        int i3 = qq12 != null ? qq12.f140454d : 0;
                        C54515a aVar2 = this.f152832d;
                        T t2 = cVar.f256796d;
                        C87412m.m108593f(t2, "it.resp");
                        C49030co0 co02 = (C49030co0) t2;
                        int i4 = this.f152833e;
                        if (aVar2.f152827o) {
                            LinkedList<C50996qq1> linkedList3 = co02.f131861d;
                            C87412m.m108593f(linkedList3, "resp.items");
                            LinkedList linkedList4 = null;
                            for (C50996qq1 qq13 : linkedList3) {
                                if (qq13.f140454d > i3) {
                                    C48742ao0 ao02 = qq13.f140455e;
                                    if (ao02 == null || (linkedList2 = ao02.f130677e) == null) {
                                        arrayList = null;
                                    } else {
                                        synchronized (linkedList2) {
                                            arrayList = new ArrayList<>();
                                            for (T next : linkedList2) {
                                                C64674r41 r412 = (C64674r41) next;
                                                if (C58739j4.f168176a.mo83692U() && linkedList4 != null) {
                                                    Iterator it = linkedList4.iterator();
                                                    int i5 = 0;
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            i2 = -1;
                                                            break;
                                                        }
                                                        C64674r41 r413 = ((C51343t41) it.next()).f141953d;
                                                        if (C87412m.m108589b(r413 != null ? r413.f185130j : null, r412.f185130j)) {
                                                            i2 = i5;
                                                            break;
                                                        }
                                                        i5++;
                                                    }
                                                    if (!(i2 == -1)) {
                                                        Log.m105920e("LiveMsgOffsetSlice", "processBulletMsg have repeat msg!");
                                                    }
                                                }
                                                if (r412.f185127g == 1) {
                                                    arrayList.add(next);
                                                }
                                            }
                                        }
                                        Iterator it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            ((C64674r41) it4.next()).f185138u = qq13.f140454d;
                                        }
                                    }
                                    if (!(arrayList == null || arrayList.isEmpty())) {
                                        C48742ao0 ao03 = qq13.f140455e;
                                        if (!(ao03 == null || (linkedList = ao03.f130677e) == null)) {
                                            Pattern pattern = C61926c.f176038a;
                                            C87412m.m108594g(arrayList, "elements");
                                            synchronized (linkedList) {
                                                try {
                                                    linkedList.removeAll(arrayList);
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        if (linkedList4 == null) {
                                            linkedList4 = new LinkedList();
                                        }
                                        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                                        for (C64674r41 r414 : arrayList) {
                                            C51343t41 t412 = new C51343t41();
                                            t412.f141953d = r414;
                                            t412.f141954e = qq13.f140456f;
                                            arrayList2.add(t412);
                                        }
                                        linkedList4.addAll(arrayList2);
                                    }
                                } else if (C58739j4.f168176a.mo83692U()) {
                                    Log.m105924i("LiveMsgOffsetSlice", "processBulletMsg reqOffset:" + i4 + ",localLastOffset:" + i3 + ",but frame offset:" + qq13.f140454d);
                                }
                            }
                            aVar2.mo75355c3().clear();
                            if (!(linkedList4 == null || linkedList4.isEmpty())) {
                                LinkedList<C51343t41> c3 = aVar2.mo75355c3();
                                C87412m.m108591d(linkedList4);
                                c3.addAll(linkedList4);
                            }
                        }
                        LinkedList<C50996qq1> linkedList5 = ((C49030co0) cVar.f256796d).f131861d;
                        C87412m.m108593f(linkedList5, "frameItems");
                        C50996qq1 qq14 = (C50996qq1) C110818d0.m150916N(linkedList5);
                        int i6 = qq14 != null ? qq14.f140454d : 0;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("getMessage(force:");
                        sb4.append(this.f152834f);
                        sb4.append(",localForce:");
                        sb4.append(this.f152835g.f27482d);
                        sb4.append(") offsetSecond:");
                        sb4.append(this.f152833e);
                        sb4.append(",lastLocalItemOffer:");
                        sb4.append(i3);
                        sb4.append(",firstRemoteItemOffset:");
                        sb4.append(i6);
                        sb4.append(",local info:");
                        C63947a aVar3 = C63947a.f181274a;
                        sb4.append(aVar3.mo88719d(this.f152832d.f152825j));
                        sb4.append(",resp info:");
                        T t3 = cVar.f256796d;
                        C87412m.m108593f(t3, "it.resp");
                        sb4.append(aVar3.mo88722g((C49030co0) t3));
                        sb4.append(", resp desc: ");
                        sb4.append(((C49030co0) cVar.f256796d).f131867j);
                        Log.m105924i("LiveMsgOffsetSlice", sb4.toString());
                        C54515a aVar4 = this.f152832d;
                        boolean z = this.f152835g.f27482d;
                        int i7 = this.f152833e;
                        if (z) {
                            aVar4.f152825j.clear();
                        } else if (i7 <= i3) {
                            aVar4.getClass();
                            while (true) {
                                Iterator<C50996qq1> it5 = linkedList5.iterator();
                                int i8 = 0;
                                while (true) {
                                    if (!it5.hasNext()) {
                                        i = -1;
                                        i8 = -1;
                                        break;
                                    }
                                    if (it5.next().f140454d == i7) {
                                        i = -1;
                                        break;
                                    }
                                    i8++;
                                }
                                if (i8 != i) {
                                    C61926c.m72674S(aVar4.f152825j, new C39827b(i7));
                                }
                                if (i7 == i3) {
                                    break;
                                }
                                i7++;
                            }
                        }
                        aVar4.f152825j.addAll(linkedList5);
                        ((C54991o) this.f152832d.business(cls)).f154230N = ((C49030co0) cVar.f256796d).f131868n;
                        C57941h hVar = C65770a0.f189184r.mo89819a().f189192f;
                        if (hVar != null) {
                            hVar.mo82740n();
                        }
                        ((C54991o) this.f152832d.business(cls)).f154237P.postValue(((C49030co0) cVar.f256796d).f131868n);
                        C54515a aVar5 = this.f152832d;
                        C49030co0 co03 = (C49030co0) cVar.f256796d;
                        aVar5.getClass();
                        if ((co03 != null ? co03.f131863f : null) == null) {
                            Log.m105924i("LiveMsgOffsetSlice", "set offsetMsgInfo last buffer to null!");
                        }
                        aVar5.f152830r = co03;
                        C66688d dVar = this.f152832d.f152824i;
                        if (dVar != null) {
                            T t4 = cVar.f256796d;
                            C87412m.m108593f(t4, "it.resp");
                            dVar.mo89821a((C49030co0) t4, this.f152835g.f27482d, this.f152832d.mo75355c3(), (List<? extends C52013xs0>) null);
                        }
                        C54515a aVar6 = this.f152832d;
                        if (!aVar6.f152828p) {
                            C54843w3.f153747a.mo75793h(aVar6.f107146d, ((C49030co0) cVar.f256796d).f131867j);
                            this.f152832d.f152828p = true;
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bp1.a$b */
    public static final class C54517b extends C87413o implements C32224a<LinkedList<C51343t41>> {

        /* renamed from: d */
        public static final C54517b f152836d = new C54517b();

        public C54517b() {
            super(0);
        }

        public Object invoke() {
            return new LinkedList();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54515a(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveBuContext");
    }

    /* renamed from: c3 */
    public final LinkedList<C51343t41> mo75355c3() {
        return (LinkedList) ((C36570n) this.f152826n).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo75356d3(int r23, boolean r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r24
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            monitor-enter(r22)
            if (r0 != 0) goto L_0x0016
            boolean r3 = r1.f152822g     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0016
            java.lang.String r0 = "LiveMsgOffsetSlice"
            java.lang.String r2 = "getMessage invalid,message requesting!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r22)
            return
        L_0x0016:
            gy3.a0 r3 = new gy3.a0     // Catch:{ all -> 0x00b3 }
            r3.<init>()     // Catch:{ all -> 0x00b3 }
            r4 = 0
            r5 = 0
            r6 = 1
            if (r0 != 0) goto L_0x002d
            te3.co0 r7 = r1.f152830r     // Catch:{ all -> 0x00b3 }
            if (r7 == 0) goto L_0x0027
            pe3.b r7 = r7.f131863f     // Catch:{ all -> 0x00b3 }
            goto L_0x0028
        L_0x0027:
            r7 = r5
        L_0x0028:
            if (r7 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r7 = 0
            goto L_0x002e
        L_0x002d:
            r7 = 1
        L_0x002e:
            r3.f27482d = r7     // Catch:{ all -> 0x00b3 }
            r1.f152822g = r6     // Catch:{ all -> 0x00b3 }
            androidx.lifecycle.i0 r7 = r1.business(r2)     // Catch:{ all -> 0x00b3 }
            cl1.u r7 = (cl1.C55001u) r7     // Catch:{ all -> 0x00b3 }
            te3.c21 r7 = r7.f154420q     // Catch:{ all -> 0x00b3 }
            long r10 = r7.f182392d     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            r7.<init>()     // Catch:{ all -> 0x00b3 }
            r7.append(r10)     // Catch:{ all -> 0x00b3 }
            r8 = 45
            r7.append(r8)     // Catch:{ all -> 0x00b3 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b3 }
            r7.append(r8)     // Catch:{ all -> 0x00b3 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b3 }
            r1.f152821f = r7     // Catch:{ all -> 0x00b3 }
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            androidx.lifecycle.i0 r7 = r1.business(r7)     // Catch:{ all -> 0x00b3 }
            cl1.o r7 = (cl1.C54991o) r7     // Catch:{ all -> 0x00b3 }
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.f154341n     // Catch:{ all -> 0x00b3 }
            if (r7 == 0) goto L_0x0066
            java.lang.String r7 = r7.username     // Catch:{ all -> 0x00b3 }
            if (r7 != 0) goto L_0x0068
        L_0x0066:
            java.lang.String r7 = ""
        L_0x0068:
            r9 = r7
            androidx.lifecycle.i0 r7 = r1.business(r2)     // Catch:{ all -> 0x00b3 }
            cl1.u r7 = (cl1.C55001u) r7     // Catch:{ all -> 0x00b3 }
            long r12 = r7.f154416j     // Catch:{ all -> 0x00b3 }
            androidx.lifecycle.i0 r2 = r1.business(r2)     // Catch:{ all -> 0x00b3 }
            cl1.u r2 = (cl1.C55001u) r2     // Catch:{ all -> 0x00b3 }
            java.lang.String r14 = r2.f154423t     // Catch:{ all -> 0x00b3 }
            te3.hj1 r17 = new te3.hj1     // Catch:{ all -> 0x00b3 }
            r17.<init>()     // Catch:{ all -> 0x00b3 }
            int r15 = r1.f152831s     // Catch:{ all -> 0x00b3 }
            boolean r2 = r3.f27482d     // Catch:{ all -> 0x00b3 }
            if (r2 != 0) goto L_0x0087
            r19 = 1
            goto L_0x0089
        L_0x0087:
            r19 = 0
        L_0x0089:
            if (r2 == 0) goto L_0x008e
        L_0x008b:
            r20 = r5
            goto L_0x0095
        L_0x008e:
            te3.co0 r2 = r1.f152830r     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x008b
            pe3.b r5 = r2.f131863f     // Catch:{ all -> 0x00b3 }
            goto L_0x008b
        L_0x0095:
            java.lang.String r2 = r1.f152821f     // Catch:{ all -> 0x00b3 }
            je1.h0 r4 = new je1.h0     // Catch:{ all -> 0x00b3 }
            java.lang.String r16 = ""
            r8 = r4
            r18 = r23
            r21 = r2
            r8.<init>(r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00b3 }
            nr3.e r2 = r4.mo9225i()     // Catch:{ all -> 0x00b3 }
            bp1.a$a r4 = new bp1.a$a     // Catch:{ all -> 0x00b3 }
            r5 = r23
            r4.<init>(r1, r5, r0, r3)     // Catch:{ all -> 0x00b3 }
            o40.C61926c.m72665J(r2, r4)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r22)
            return
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bp1.C54515a.mo75356d3(int, boolean):void");
    }

    /* renamed from: e3 */
    public final void mo75357e3(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("ReplayMsgInfo:");
        sb.append(str);
        sb.append(" msg size:");
        sb.append(this.f152825j.size());
        sb.append("(second:");
        C50996qq1 qq12 = (C50996qq1) C110818d0.m150916N(this.f152825j);
        int i = 0;
        sb.append(qq12 != null ? qq12.f140454d : 0);
        sb.append('~');
        C50996qq1 qq13 = (C50996qq1) C110818d0.m150925W(this.f152825j);
        if (qq13 != null) {
            i = qq13.f140454d;
        }
        sb.append(i);
        sb.append(')');
        Log.m105924i("LiveMsgOffsetSlice", sb.toString());
    }

    /* renamed from: f3 */
    public final void mo75358f3(int i) {
        if (i != this.f152829q) {
            Log.m105924i("LiveMsgOffsetSlice", "startOffsetSec from:" + this.f152829q + " to " + i);
            this.f152829q = i;
        }
    }

    /* renamed from: g3 */
    public final void mo75359g3(int i, boolean z) {
        boolean z2 = ((C54519d) business(C54519d.class)).f152842D;
        int i2 = this.f152823h.f191728c;
        Log.m105924i("LiveMsgOffsetSlice", "tryGetMessage playerOffsetSecond:" + i + "(total:" + i2 + "),force:" + z + ",replayTransitioning:" + z2);
        if (i >= 0 && !z2) {
            if (z) {
                mo75356d3(i, z);
                return;
            }
            C50996qq1 qq12 = (C50996qq1) C110818d0.m150925W(this.f152825j);
            boolean z3 = false;
            int i3 = qq12 != null ? qq12.f140454d : 0;
            int i4 = i3 - i;
            if (i4 >= 0 && i4 < 3) {
                if (1 <= i3 && i3 < i2) {
                    z3 = true;
                }
                if (z3) {
                    mo75356d3(i3 + 1, z);
                }
            }
        }
    }

    public void onCleared() {
        super.onCleared();
        Log.m105924i("LiveMsgOffsetSlice", "onCleared");
        this.f152821f = "";
        this.f152822g = false;
        this.f152825j.clear();
        mo75355c3().clear();
        this.f152824i = null;
        Log.m105924i("LiveMsgOffsetSlice", "set offsetMsgInfo last buffer to null!");
        this.f152830r = null;
    }
}
