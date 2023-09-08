package cl1;

import a14.C0000n0;
import android.content.Context;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58052j1;
import d14.C58056k1;
import d14.C58087u0;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.ResultKt;
import ls3.C61398h;
import o40.C61926c;
import o40.C61937h;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C48922bx2;
import te3.C50895q01;
import te3.C52172yv;
import te3.C64300cx2;
import te3.C64308d82;
import te3.C64538lx2;
import te3.C64622p31;
import te3.C64646q31;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: cl1.x0 */
public final class C55006x0 extends C39970c<C45795b> {

    /* renamed from: f */
    public final String f154451f = "Finder.LiveMilestoneLotterySlice";

    /* renamed from: g */
    public C58087u0<C64646q31> f154452g = C58056k1.m67214a(null);

    /* renamed from: h */
    public final ConcurrentHashMap<String, C64622p31> f154453h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public C58087u0<C64622p31> f154454i = C58056k1.m67214a(null);

    /* renamed from: j */
    public C0697b f154455j;

    /* renamed from: n */
    public C58087u0<C64622p31> f154456n = C58056k1.m67214a(null);

    /* renamed from: o */
    public HashMap<String, Object> f154457o;

    /* renamed from: cl1.x0$b */
    public static final class C0697b {

        /* renamed from: a */
        public int f1648a;

        /* renamed from: b */
        public int f1649b;

        /* renamed from: c */
        public boolean f1650c;

        /* renamed from: d */
        public C64622p31 f1651d;

        public C0697b(int i, int i2, boolean z, C64622p31 p312, int i3, C8480h hVar) {
            i = (i3 & 1) != 0 ? 0 : i;
            i2 = (i3 & 2) != 0 ? -1 : i2;
            z = (i3 & 4) != 0 ? false : z;
            C87412m.m108594g(p312, "lotteryInfo");
            this.f1648a = i;
            this.f1649b = i2;
            this.f1650c = z;
            this.f1651d = p312;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0697b)) {
                return false;
            }
            C0697b bVar = (C0697b) obj;
            return this.f1648a == bVar.f1648a && this.f1649b == bVar.f1649b && this.f1650c == bVar.f1650c && C87412m.m108589b(this.f1651d, bVar.f1651d);
        }

        public int hashCode() {
            int i = ((this.f1648a * 31) + this.f1649b) * 31;
            boolean z = this.f1650c;
            if (z) {
                z = true;
            }
            return ((i + (z ? 1 : 0)) * 31) + this.f1651d.hashCode();
        }

        public String toString() {
            return "localStatus:" + this.f1648a + ",localRemainTime:" + this.f1649b + ",haveLottering:" + this.f1650c + ", lotteryInfo:" + C61937h.m72709h(this.f1651d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveMilestoneLotterySlice$getLotteryInfo$$inlined$fail$default$1", mo125469f = "LiveMilestoneLotterySlice.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: cl1.x0$c */
    public static final class C0698c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f1652d;

        /* renamed from: e */
        public final /* synthetic */ C55006x0 f1653e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0698c(C0287e eVar, C15601d dVar, C55006x0 x0Var) {
            super(2, dVar);
            this.f1652d = eVar;
            this.f1653e = x0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0698c(this.f1652d, dVar, this.f1653e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0698c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            String str = this.f1653e.f154451f;
            Log.m105924i(str, "getLotteryInfo " + ((C0280a) ((C0281b) this.f1652d).f843b));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveMilestoneLotterySlice$getLotteryInfo$$inlined$success$default$1", mo125469f = "LiveMilestoneLotterySlice.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: cl1.x0$d */
    public static final class C0699d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f1654d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0 f1655e;

        /* renamed from: f */
        public final /* synthetic */ C55006x0 f1656f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0699d(C0287e eVar, C15601d dVar, C8479f0 f0Var, C55006x0 x0Var) {
            super(2, dVar);
            this.f1654d = eVar;
            this.f1655e = f0Var;
            this.f1656f = x0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0699d(this.f1654d, dVar, this.f1655e, this.f1656f);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0699d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C50895q01 q012 = (C50895q01) ((C0288f) this.f1654d).f855b;
            C64622p31 p312 = q012.f140073d;
            if (p312 != null) {
                this.f1656f.mo76051c3(p312, "cgi");
            }
            this.f1655e.f27484d = q012.f140073d;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cl1.x0$a */
    public static final class C55007a {
        public C55007a(C8480h hVar) {
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveMilestoneLotterySlice", mo125469f = "LiveMilestoneLotterySlice.kt", mo125470l = {145, 354, 361}, mo125471m = "getLotteryInfo")
    /* renamed from: cl1.x0$e */
    public static final class C55008e extends C66704d {

        /* renamed from: d */
        public Object f154458d;

        /* renamed from: e */
        public Object f154459e;

        /* renamed from: f */
        public Object f154460f;

        /* renamed from: g */
        public Object f154461g;

        /* renamed from: h */
        public /* synthetic */ Object f154462h;

        /* renamed from: i */
        public final /* synthetic */ C55006x0 f154463i;

        /* renamed from: j */
        public int f154464j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55008e(C55006x0 x0Var, C15601d<? super C55008e> dVar) {
            super(dVar);
            this.f154463i = x0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f154462h = obj;
            this.f154464j |= Integer.MIN_VALUE;
            return this.f154463i.mo76054f3((String) null, (Context) null, false, this);
        }
    }

    static {
        new C55007a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55006x0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final void mo76051c3(C64622p31 p312, String str) {
        C52172yv yvVar;
        C52172yv yvVar2;
        LinkedList<C52172yv> linkedList;
        boolean z;
        LinkedList<C52172yv> linkedList2;
        T t;
        boolean z2;
        LinkedList<C52172yv> linkedList3;
        T t2;
        boolean z3;
        String str2 = p312.f184746d;
        if (!(str2 == null || str2.length() == 0)) {
            C64622p31 p313 = this.f154453h.get(str2);
            if (p313 != null) {
                Log.m105924i(this.f154451f, str + ", addOrReplaceLotteryInfo replace");
            } else {
                Log.m105924i(this.f154451f, str + ", addOrReplaceLotteryInfo add");
            }
            if (p313 == null) {
                Log.m105924i(this.f154451f, "diffLotteryInfo prev is null");
            } else {
                if (C61926c.m72696u(p313.f184749g, 1)) {
                    p312.f184749g |= 1;
                }
                C64300cx2 cx22 = p313.f184747e;
                C64300cx2 cx23 = p312.f184747e;
                if (!(cx22 == null || cx23 == null || cx23.f182601i >= cx22.f182601i)) {
                    Log.m105924i(this.f154451f, "curBaseInfo.participate_count " + cx23.f182601i + " < preBaseInfo.participate_count " + cx22.f182601i);
                    cx23.f182601i = cx22.f182601i;
                }
                C48922bx2 bx22 = p313.f184750h;
                T t3 = null;
                if (bx22 == null || (linkedList3 = bx22.f131371f) == null) {
                    yvVar = null;
                } else {
                    Iterator<T> it = linkedList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t2 = null;
                            break;
                        }
                        t2 = it.next();
                        if (((C52172yv) t2).f145529f > 0) {
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
                    yvVar = (C52172yv) t2;
                }
                C48922bx2 bx23 = p312.f184750h;
                if (bx23 == null || (linkedList2 = bx23.f131371f) == null) {
                    yvVar2 = null;
                } else {
                    Iterator<T> it4 = linkedList2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it4.next();
                        if (((C52172yv) t).f145529f > 0) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    yvVar2 = (C52172yv) t;
                }
                if (yvVar != null && yvVar2 == null) {
                    C48922bx2 bx24 = p312.f184750h;
                    if (!(bx24 == null || (linkedList = bx24.f131371f) == null)) {
                        Iterator<T> it5 = linkedList.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            T next = it5.next();
                            if (((C52172yv) next).f145527d == yvVar.f145527d) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                t3 = next;
                                break;
                            }
                        }
                        C52172yv yvVar3 = (C52172yv) t3;
                        if (yvVar3 != null) {
                            yvVar3.f145529f = yvVar.f145529f;
                            if (yvVar3.f145530g < yvVar.f145530g) {
                                Log.m105924i(this.f154451f, "current.select_count " + yvVar3.f145530g + " < preVotedChoice.select_count " + yvVar.f145530g);
                                yvVar3.f145530g = yvVar.f145530g;
                            }
                        }
                    }
                } else if (!(yvVar == null || yvVar2 == null || yvVar2.f145530g >= yvVar.f145530g)) {
                    Log.m105924i(this.f154451f, "current2.select_count " + yvVar2.f145530g + " < preVotedChoice.select_count " + yvVar.f145530g);
                    yvVar2.f145530g = yvVar.f145530g;
                }
            }
            if (p313 != null) {
                C55009y0.m62070a(p313, this.f154451f, "addOrReplaceLotteryInfo prev,");
            }
            C55009y0.m62070a(p312, this.f154451f, "addOrReplaceLotteryInfo cur,");
            this.f154453h.put(str2, p312);
            return;
        }
        Log.m105924i(this.f154451f, "addOrReplaceLotteryInfo lotteryId empty");
    }

    /* renamed from: d3 */
    public final Object mo76052d3(String str) {
        C87412m.m108594g(str, "lotteryId");
        HashMap<String, Object> hashMap = this.f154457o;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    /* renamed from: e3 */
    public final C0697b mo76053e3() {
        C0697b bVar;
        synchronized (this) {
            bVar = this.f154455j;
        }
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo76054f3(java.lang.String r21, android.content.Context r22, boolean r23, wx3.C15601d<? super te3.C64622p31> r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r24
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            boolean r4 = r2 instanceof cl1.C55006x0.C55008e
            if (r4 == 0) goto L_0x001b
            r4 = r2
            cl1.x0$e r4 = (cl1.C55006x0.C55008e) r4
            int r5 = r4.f154464j
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f154464j = r5
            goto L_0x0020
        L_0x001b:
            cl1.x0$e r4 = new cl1.x0$e
            r4.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r4.f154462h
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f154464j
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L_0x0077
            if (r6 == r9) goto L_0x0060
            if (r6 == r8) goto L_0x004b
            if (r6 != r7) goto L_0x0043
            java.lang.Object r1 = r4.f154460f
            bi1.e r1 = (bi1.C0287e) r1
            java.lang.Object r1 = r4.f154459e
            er1.i5 r1 = (er1.C7813i5) r1
            java.lang.Object r3 = r4.f154458d
            gy3.f0 r3 = (gy3.C8479f0) r3
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0186
        L_0x0043:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004b:
            java.lang.Object r1 = r4.f154461g
            bi1.e r1 = (bi1.C0287e) r1
            java.lang.Object r3 = r4.f154460f
            er1.i5 r3 = (er1.C7813i5) r3
            java.lang.Object r6 = r4.f154459e
            gy3.f0 r6 = (gy3.C8479f0) r6
            java.lang.Object r8 = r4.f154458d
            cl1.x0 r8 = (cl1.C55006x0) r8
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x015f
        L_0x0060:
            java.lang.Object r1 = r4.f154460f
            er1.i5 r1 = (er1.C7813i5) r1
            java.lang.Object r3 = r4.f154459e
            gy3.f0 r3 = (gy3.C8479f0) r3
            java.lang.Object r6 = r4.f154458d
            cl1.x0 r6 = (cl1.C55006x0) r6
            kotlin.ResultKt.throwOnFailure(r2)
            r19 = r3
            r3 = r1
            r1 = r6
            r6 = r19
            goto L_0x0139
        L_0x0077:
            kotlin.ResultKt.throwOnFailure(r2)
            gy3.f0 r2 = new gy3.f0
            r2.<init>()
            java.lang.String r6 = "lotteryId"
            gy3.C87412m.m108594g(r1, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, te3.p31> r6 = r0.f154453h
            java.lang.Object r6 = r6.get(r1)
            te3.p31 r6 = (te3.C64622p31) r6
            r2.f27484d = r6
            if (r6 != 0) goto L_0x018c
            if (r23 == 0) goto L_0x00b0
            if (r22 == 0) goto L_0x00b0
            er1.i5$a r11 = er1.C7813i5.f26336f
            android.content.res.Resources r6 = r22.getResources()
            r12 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r13 = r6.getString(r12)
            r14 = 500(0x1f4, double:2.47E-321)
            r16 = 0
            r17 = 8
            r18 = 0
            r12 = r22
            er1.i5 r6 = er1.C7813i5.C7814a.m7953a(r11, r12, r13, r14, r16, r17, r18)
            goto L_0x00b1
        L_0x00b0:
            r6 = r10
        L_0x00b1:
            if (r6 == 0) goto L_0x00b6
            r6.begin()
        L_0x00b6:
            te3.p01 r11 = new te3.p01
            r11.<init>()
            je1.h2 r12 = je1.C46523h2.f125330a
            r13 = 10102(0x2776, float:1.4156E-41)
            te3.ig0 r12 = r12.mo71859a(r13)
            r11.f139475d = r12
            java.lang.Class<cl1.o> r12 = cl1.C54991o.class
            androidx.lifecycle.i0 r12 = r0.business(r12)
            cl1.o r12 = (cl1.C54991o) r12
            java.lang.String r12 = r12.f154345o
            r11.f139476e = r12
            androidx.lifecycle.i0 r12 = r0.business(r3)
            cl1.u r12 = (cl1.C55001u) r12
            byte[] r12 = r12.f154417n
            pe3.b r12 = pe3.C89349b.m111674a(r12)
            r11.f139477f = r12
            zc1.b r12 = zc1.C66785b.f191882e
            java.lang.String r12 = r12.mo90662O5()
            r11.f139478g = r12
            androidx.lifecycle.i0 r12 = r0.business(r3)
            cl1.u r12 = (cl1.C55001u) r12
            long r14 = r12.f154416j
            r11.f139479h = r14
            androidx.lifecycle.i0 r3 = r0.business(r3)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r14 = r3.f182392d
            r11.f139480i = r14
            r11.f139481j = r1
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            r1.f127069d = r13
            java.lang.String r3 = "/cgi-bin/micromsg-bin/finderlivegetmilestonelottery"
            r1.f127068c = r3
            r1.f127066a = r11
            te3.q01 r3 = new te3.q01
            r3.<init>()
            r1.f127067b = r3
            ob0.c r1 = r1.mo72403a()
            java.lang.Class<ht1.s1> r3 = ht1.C8802s1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.s1 r3 = (ht1.C8802s1) r3
            ob0.b r3 = r3.mo9632ui()
            r3.mo123453j(r1)
            r4.f154458d = r0
            r4.f154459e = r2
            r4.f154460f = r6
            r4.f154464j = r9
            java.lang.Object r1 = bi1.C0283d.m245c(r3, r10, r4, r9, r10)
            if (r1 != r5) goto L_0x0135
            return r5
        L_0x0135:
            r3 = r6
            r6 = r2
            r2 = r1
            r1 = r0
        L_0x0139:
            bi1.e r2 = (bi1.C0287e) r2
            boolean r9 = r2 instanceof bi1.C0288f
            if (r9 == 0) goto L_0x0161
            wx3.f r9 = r2.f854a
            if (r9 != 0) goto L_0x0147
            wx3.f r9 = r4.getContext()
        L_0x0147:
            cl1.x0$d r11 = new cl1.x0$d
            r11.<init>(r2, r10, r6, r1)
            r4.f154458d = r1
            r4.f154459e = r6
            r4.f154460f = r3
            r4.f154461g = r2
            r4.f154464j = r8
            java.lang.Object r8 = a14.C53895h.m60469g(r9, r11, r4)
            if (r8 != r5) goto L_0x015d
            return r5
        L_0x015d:
            r8 = r1
            r1 = r2
        L_0x015f:
            r2 = r1
            goto L_0x0162
        L_0x0161:
            r8 = r1
        L_0x0162:
            r1 = r3
            r3 = r6
            boolean r6 = r2 instanceof bi1.C0281b
            if (r6 == 0) goto L_0x0186
            wx3.f r6 = r2.f854a
            if (r6 != 0) goto L_0x0170
            wx3.f r6 = r4.getContext()
        L_0x0170:
            cl1.x0$c r9 = new cl1.x0$c
            r9.<init>(r2, r10, r8)
            r4.f154458d = r3
            r4.f154459e = r1
            r4.f154460f = r2
            r4.f154461g = r10
            r4.f154464j = r7
            java.lang.Object r2 = a14.C53895h.m60469g(r6, r9, r4)
            if (r2 != r5) goto L_0x0186
            return r5
        L_0x0186:
            r2 = r3
            if (r1 == 0) goto L_0x018c
            r1.mo8913b()
        L_0x018c:
            T r1 = r2.f27484d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C55006x0.mo76054f3(java.lang.String, android.content.Context, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: g3 */
    public final void mo76055g3(C64646q31 q312, String str, String str2) {
        C87412m.m108594g(q312, "<this>");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "prefix");
        Log.m105924i(str, "FinderLiveMilestoneLotteryMetaInfo logInfo " + str2 + " wording:" + q312.f184943e + ", title:" + q312.f184946h + ", description:" + q312.f184947i);
        LinkedList<C64538lx2> linkedList = q312.f184942d;
        C87412m.m108593f(linkedList, "infos");
        for (C64538lx2 lx22 : linkedList) {
            Log.m105924i(str, str2 + " infos, title:" + lx22.f184166d + ", button_status:" + lx22.f184169g + ", is_reserved:" + lx22.f184171i + ", is_attended:" + lx22.f184173n + ", sub_title:" + lx22.f184167e + ", start_time:" + lx22.f184168f + ", notice_id:" + lx22.f184170h + ", lottery_id:" + lx22.f184172j);
        }
    }

    /* renamed from: i3 */
    public final C52172yv mo76056i3(String str, Integer num) {
        C64538lx2 lx22;
        C48922bx2 bx22;
        LinkedList<C52172yv> linkedList;
        boolean z;
        C64300cx2 cx22;
        LinkedList<C64538lx2> linkedList2;
        T t;
        Log.m105924i(this.f154451f, "participateLottery lottery:" + str + ", choiceId:" + num);
        T t2 = null;
        if (str == null || str.length() == 0) {
            Log.printInfoStack(this.f154451f, "participateLottery lotteryId empty", new Object[0]);
            return null;
        }
        C64646q31 q312 = (C64646q31) ((C58052j1) this.f154452g).getValue();
        if (q312 == null || (linkedList2 = q312.f184942d) == null) {
            lx22 = null;
        } else {
            Iterator<T> it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C64538lx2) t).f184172j, str)) {
                    break;
                }
            }
            lx22 = (C64538lx2) t;
        }
        if (lx22 != null) {
            lx22.f184173n = 1;
        }
        C87412m.m108594g(str, "lotteryId");
        C64622p31 p312 = this.f154453h.get(str);
        if (p312 != null) {
            int i = p312.f184749g;
            Pattern pattern = C61926c.f176038a;
            p312.f184749g = i | 1;
        }
        if (!(p312 == null || (cx22 = p312.f184747e) == null)) {
            cx22.f182601i++;
        }
        if (num != null) {
            if (!(p312 == null || (bx22 = p312.f184750h) == null || (linkedList = bx22.f131371f) == null)) {
                Iterator<T> it4 = linkedList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next = it4.next();
                    if (((C52172yv) next).f145527d == num.intValue()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                t2 = (C52172yv) t2;
            }
            if (t2 == null) {
                Log.m105920e(this.f154451f, "participateLottery choiceId:" + num + " not exist");
            } else {
                t2.f145529f = 1;
                t2.f145530g++;
            }
            if (p312 != null) {
                C55009y0.m62070a(p312, this.f154451f, "participateLottery");
            }
            return t2;
        }
        if (p312 != null) {
            C55009y0.m62070a(p312, this.f154451f, "participateLottery");
        }
        return null;
    }

    /* renamed from: j3 */
    public final <T extends C64308d82, R extends C47465a> Object mo76057j3(T t, Class<R> cls, C15601d<? super R> dVar) {
        Class cls2 = C55001u.class;
        String str = this.f154451f;
        String str2 = ((C54991o) business(C54991o.class)).f154345o;
        byte[] bArr = ((C55001u) business(cls2)).f154417n;
        long j = ((C55001u) business(cls2)).f154420q.f182392d;
        long j2 = ((C55001u) business(cls2)).f154416j;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        LinkedList linkedList = new LinkedList();
        linkedList.add(t);
        C13598b0 b0Var = C13598b0.f38549a;
        ((C61398h) C86312j.m106911c(C61398h.class)).xk0(str2, bArr, j, j2, linkedList).mo9225i().mo123420E(new C39987w0(hVar, cls, str));
        return hVar.mo90314b();
    }

    /* renamed from: k3 */
    public final void mo76058k3(String str, Object obj) {
        C87412m.m108594g(str, "lotteryId");
        C87412m.m108594g(obj, "resultInfo");
        HashMap<String, Object> hashMap = this.f154457o;
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        this.f154457o = hashMap;
        hashMap.put(str, obj);
        String str2 = this.f154451f;
        Log.m105924i(str2, "setClaimed lotteryId:" + str + ',' + C61937h.m72709h(obj));
    }

    public void onCleared() {
        ((C58052j1) this.f154452g).setValue(null);
        ((C58052j1) this.f154454i).setValue(null);
        ((C58052j1) this.f154456n).setValue(null);
        this.f154455j = null;
        this.f154453h.clear();
    }
}
