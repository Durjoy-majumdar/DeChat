package cl1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import al1.C39612t;
import al1.C39620w;
import androidx.lifecycle.C54219z;
import bl1.C39775b;
import bl1.C39779f;
import bl1.C39786k;
import bl1.C39805s;
import bl1.C39807u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d14.C58056k1;
import d14.C58087u0;
import eb0.C31543z5;
import er1.C45684k;
import f14.C58901s;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C87412m;
import hp3.C87581a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46522h1;
import jp3.C46566c;
import jp3.C9486a;
import kotlin.ResultKt;
import ks3.C46739p;
import ks3.C46740q;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49897iu0;
import te3.C50131kh1;
import te3.C50317lw0;
import te3.C51977xi;
import te3.C52013xs0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: cl1.j */
public final class C39975j extends C39970c<C45795b> {

    /* renamed from: v */
    public static int f107165v;

    /* renamed from: f */
    public final C58087u0<Boolean> f107166f = C58056k1.m67214a(Boolean.FALSE);

    /* renamed from: g */
    public boolean f107167g;

    /* renamed from: h */
    public C46566c<C9486a> f107168h = new C46566c<>();

    /* renamed from: i */
    public boolean f107169i = true;

    /* renamed from: j */
    public C54219z<C50317lw0> f107170j = new C54219z<>();

    /* renamed from: n */
    public long f107171n;

    /* renamed from: o */
    public int f107172o = -1;

    /* renamed from: p */
    public boolean f107173p = true;

    /* renamed from: q */
    public long f107174q;

    /* renamed from: r */
    public int f107175r;

    /* renamed from: s */
    public C39786k f107176s;

    /* renamed from: t */
    public C49712hj1 f107177t;

    /* renamed from: u */
    public C39779f f107178u;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveBoxSlice", mo125469f = "LiveBoxSlice.kt", mo125470l = {90}, mo125471m = "initData")
    /* renamed from: cl1.j$a */
    public static final class C39976a extends C66704d {

        /* renamed from: d */
        public Object f107179d;

        /* renamed from: e */
        public /* synthetic */ Object f107180e;

        /* renamed from: f */
        public final /* synthetic */ C39975j f107181f;

        /* renamed from: g */
        public int f107182g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39976a(C39975j jVar, C15601d<? super C39976a> dVar) {
            super(dVar);
            this.f107181f = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f107180e = obj;
            this.f107182g |= Integer.MIN_VALUE;
            return this.f107181f.mo62579f3((C49712hj1) null, this);
        }
    }

    /* renamed from: cl1.j$b */
    public static final class C39977b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C39975j f107183a;

        /* renamed from: b */
        public final /* synthetic */ C52013xs0 f107184b;

        public C39977b(C39975j jVar, C52013xs0 xs02) {
            this.f107183a = jVar;
            this.f107184b = xs02;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C49897iu0 iu02 = null;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                return C13598b0.f38549a;
            }
            Log.m105924i("Finder.LiveBoxSlice", "localLikeLog cgi failed, revert like op");
            C39786k kVar = this.f107183a.f107176s;
            if (kVar == null) {
                return null;
            }
            C52013xs0 xs02 = this.f107184b;
            C49897iu0 iu03 = new C49897iu0();
            C89349b bVar = xs02.f144906h;
            byte[] f = bVar != null ? bVar.mo123703f() : null;
            if (f != null) {
                try {
                    iu03.parseFrom(f);
                    iu02 = iu03;
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                }
            }
            if (iu02 != null) {
                int i = iu02.f135667f;
                int i2 = C46739p.f125819a;
                if (i == 1) {
                    iu02.f135667f = 2;
                    iu02.f135668g--;
                } else if (i == 2) {
                    iu02.f135667f = 1;
                    iu02.f135668g++;
                }
                iu02.f135668g = Math.max(0, iu02.f135668g);
            }
            return Boolean.valueOf(kVar.mo62416g(xs02));
        }
    }

    /* renamed from: cl1.j$c */
    public static final class C39978c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C39775b f107185a;

        /* renamed from: b */
        public final /* synthetic */ C39975j f107186b;

        public C39978c(C39775b bVar, C39975j jVar) {
            this.f107185a = bVar;
            this.f107186b = jVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                T t = cVar.f256796d;
                C39775b bVar = this.f107185a;
                C39975j jVar = this.f107186b;
                if (t == null || bVar == null) {
                    return null;
                }
                C61926c.m72668M(new C39980k(bVar, (C50131kh1) t, jVar));
                return C13598b0.f38549a;
            }
            if (cVar.f256794b == -200014) {
                this.f107186b.f107169i = false;
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getResources().getString(C0966R.string.e6l), 0).show();
            }
            Log.m105920e("Finder.LiveBoxSlice", "postMsg error errType: " + cVar.f256793a + " errCode: " + cVar.f256794b + " errMsg: " + cVar.f256795c);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveBoxSlice$prepareBox$2", mo125469f = "LiveBoxSlice.kt", mo125470l = {99}, mo125471m = "invokeSuspend")
    /* renamed from: cl1.j$d */
    public static final class C39979d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f107187d;

        /* renamed from: e */
        public final /* synthetic */ String f107188e;

        /* renamed from: f */
        public final /* synthetic */ C39975j f107189f;

        /* renamed from: g */
        public final /* synthetic */ boolean f107190g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39979d(String str, C39975j jVar, boolean z, C15601d<? super C39979d> dVar) {
            super(2, dVar);
            this.f107188e = str;
            this.f107189f = jVar;
            this.f107190g = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C39979d(this.f107188e, this.f107189f, this.f107190g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C39979d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C39807u c;
            C51977xi xiVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f107187d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = "LiveBoxSlice prepareBox, groupId:" + this.f107188e;
                C87412m.m108594g(str, "str");
                Log.m105924i("Finder.LiveBoxSlice", "mainFlowLog " + str);
                C39786k kVar = this.f107189f.f107176s;
                if (kVar != null) {
                    String str2 = this.f107188e;
                    boolean z = this.f107190g;
                    this.f107187d = 1;
                    if (kVar.mo62414e(str2, z, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C39786k kVar2 = this.f107189f.f107176s;
            if (kVar2 == null || (c = kVar2.mo62412c()) == null || (xiVar = c.f106817d) == null) {
                return null;
            }
            C39975j jVar = this.f107189f;
            C45684k kVar3 = C45684k.f123488a;
            kVar3.mo71183d("Finder.LiveBoxSlice", "LiveBoxSlice startPollingRedDot, boxContext:" + kVar3.mo71182c(xiVar));
            C39786k kVar4 = jVar.f107176s;
            if (kVar4 == null) {
                return null;
            }
            C49712hj1 hj12 = jVar.f107177t;
            Log.m105924i("Finder.BoxDataStore", "startPollingRedDot");
            Log.m105924i("Finder.BoxDataStore", "stopPollingRedDot");
            C39612t tVar = kVar4.f106769h;
            if (tVar != null) {
                C53973z1 z1Var = tVar.f106367e;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                tVar.f106367e = null;
            }
            C39612t tVar2 = new C39612t(new C39786k.C39791e(kVar4, xiVar, hj12), C53872d1.f151119c, 1000);
            kVar4.f106769h = tVar2;
            C0000n0 a = C53930o0.m60554a(tVar2.f106364b);
            tVar2.f106366d = a;
            tVar2.f106367e = C53895h.m60466d(a, (C66212f) null, (C53934p0) null, new C39620w(tVar2, (C15601d<? super C39620w>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39975j(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: c3 */
    public final void mo62576c3(C50317lw0 lw02) {
        C39807u c;
        C51977xi xiVar;
        C39807u uVar;
        C87412m.m108594g(lw02, "box");
        C45684k kVar = C45684k.f123488a;
        kVar.mo71183d("Finder.LiveBoxSlice", "LiveBoxSlice enterBox: " + lw02.f137677e);
        String str = lw02.f137677e;
        if (str == null) {
            str = "";
        }
        boolean z = false;
        if (str.length() == 0) {
            Log.m105928w("Finder.LiveBoxSlice", "enterBox but boxId isEmpty");
            return;
        }
        C50317lw0 value = this.f107170j.getValue();
        if (!C87412m.m108589b(value != null ? value.f137677e : null, str)) {
            C39786k kVar2 = this.f107176s;
            if (kVar2 != null) {
                long c2 = C31543z5.m39453c();
                ConcurrentHashMap value2 = kVar2.f106764c.getValue();
                if (value2 != null && value2.containsKey(str)) {
                    z = true;
                }
                if (z) {
                    ConcurrentHashMap value3 = kVar2.f106764c.getValue();
                    if (!(value3 == null || (uVar = (C39807u) value3.get(str)) == null)) {
                        uVar.f106816c = c2;
                        uVar.f106817d.f144668h = c2;
                    }
                } else {
                    Log.m105920e("Finder.BoxDataStore", "enterBox without prepare");
                }
            }
            C39786k kVar3 = this.f107176s;
            if (!(kVar3 == null || (c = kVar3.mo62412c()) == null || (xiVar = c.f106817d) == null)) {
                kVar.mo71183d("Finder.LiveBoxSlice", "LiveBoxSlice startPollingMsg, boxContext hashCode:" + xiVar.hashCode() + ", logInfo: " + kVar.mo71182c(xiVar));
                C39786k kVar4 = this.f107176s;
                if (kVar4 != null) {
                    C49712hj1 hj12 = this.f107177t;
                    Log.m105924i("Finder.BoxDataStore", "startPollingMsg, boxId:" + lw02.f137677e + ", boxContext " + kVar.mo71182c(xiVar) + ", " + xiVar.f144665e);
                    Log.m105924i("Finder.BoxDataStore", "stopPollingMsg");
                    C39612t tVar = kVar4.f106768g;
                    if (tVar != null) {
                        C53973z1 z1Var = tVar.f106367e;
                        if (z1Var != null) {
                            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                        }
                        tVar.f106367e = null;
                    }
                    C39612t tVar2 = new C39612t(new C39786k.C39789c(kVar4, lw02, xiVar, hj12), C53872d1.f151119c, 1000);
                    kVar4.f106768g = tVar2;
                    C0000n0 a = C53930o0.m60554a(tVar2.f106364b);
                    tVar2.f106366d = a;
                    tVar2.f106367e = C53895h.m60466d(a, (C66212f) null, (C53934p0) null, new C39620w(tVar2, (C15601d<? super C39620w>) null), 3, (Object) null);
                }
            }
            this.f107170j.setValue(lw02);
            this.f107171n = C31543z5.m39453c();
        }
    }

    /* renamed from: d3 */
    public final void mo62577d3() {
        StringBuilder sb = new StringBuilder();
        sb.append("LiveBoxSlice exitBox: ");
        C50317lw0 value = this.f107170j.getValue();
        sb.append(value != null ? value.f137677e : null);
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, "str");
        Log.m105924i("Finder.LiveBoxSlice", "mainFlowLog " + sb4);
        if (this.f107170j.getValue() != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("LiveBoxSlice stopPollingMsg: ");
            C50317lw0 value2 = this.f107170j.getValue();
            sb5.append(value2 != null ? value2.f137677e : null);
            String sb6 = sb5.toString();
            C87412m.m108594g(sb6, "str");
            Log.m105924i("Finder.LiveBoxSlice", "mainFlowLog " + sb6);
            C39786k kVar = this.f107176s;
            if (kVar != null) {
                Log.m105924i("Finder.BoxDataStore", "stopPollingMsg");
                C39612t tVar = kVar.f106768g;
                if (tVar != null) {
                    C53973z1 z1Var = tVar.f106367e;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                    tVar.f106367e = null;
                }
            }
            this.f107170j.setValue(null);
            this.f107171n = 0;
        }
    }

    /* renamed from: e3 */
    public final boolean mo62578e3() {
        C50317lw0 value = this.f107170j.getValue();
        if (value == null) {
            return false;
        }
        int i = value.f137676d;
        int i2 = C46740q.f125820a;
        return i != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62579f3(te3.C49712hj1 r7, wx3.C15601d<? super rx3.C13598b0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof cl1.C39975j.C39976a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            cl1.j$a r0 = (cl1.C39975j.C39976a) r0
            int r1 = r0.f107182g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f107182g = r1
            goto L_0x0018
        L_0x0013:
            cl1.j$a r0 = new cl1.j$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f107180e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f107182g
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r7 = r0.f107179d
            cl1.j r7 = (cl1.C39975j) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0094
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "Finder.LiveBoxSlice"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "LiveBoxSlice initData, hasInit:"
            r2.append(r4)
            boolean r4 = r6.f107167g
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "str"
            gy3.C87412m.m108594g(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mainFlowLog "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            r6.f107177t = r7
            boolean r7 = r6.f107167g
            if (r7 != 0) goto L_0x00ad
            r6.f107167g = r3
            bl1.h r7 = bl1.C39780h.f106743a
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            androidx.lifecycle.i0 r7 = r6.business(r7)
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r7 = r7.f182392d
            r0.f107179d = r6
            r0.f107182g = r3
            bl1.i r2 = new bl1.i
            r3 = 0
            java.lang.String r4 = "initData"
            r2.<init>(r4, r7, r3)
            java.lang.Object r7 = a14.C53930o0.m60559f(r2, r0)
            if (r7 != r1) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            rx3.b0 r7 = rx3.C13598b0.f38549a
        L_0x0090:
            if (r7 != r1) goto L_0x0093
            return r1
        L_0x0093:
            r7 = r6
        L_0x0094:
            bl1.f r8 = new bl1.f
            r8.<init>()
            r7.f107178u = r8
            bl1.k r8 = new bl1.k
            fj1.b r0 = r7.f107146d
            bl1.f r1 = r7.f107178u
            if (r1 != 0) goto L_0x00a8
            bl1.f r1 = new bl1.f
            r1.<init>()
        L_0x00a8:
            r8.<init>(r0, r1)
            r7.f107176s = r8
        L_0x00ad:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cl1.C39975j.mo62579f3(te3.hj1, wx3.d):java.lang.Object");
    }

    /* renamed from: g3 */
    public final void mo62580g3() {
        Log.m105924i("Finder.LiveBoxSlice", "redDotFlowLog " + "pauseRedDotPolling");
        C39786k kVar = this.f107176s;
        if (kVar != null) {
            kVar.f106767f = false;
        }
    }

    /* renamed from: i3 */
    public final void mo62581i3(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        String str = "postLikeMsg, seq:" + xs02.f144913r;
        C87412m.m108594g(str, "str");
        Log.m105924i("Finder.LiveBoxSlice", "localLikeLog " + str);
        C39786k kVar = this.f107176s;
        if (!(kVar != null ? kVar.mo62416g(xs02) : false)) {
            Log.m105924i("Finder.LiveBoxSlice", "update failed, don't request cgi");
            return;
        }
        C46522h1 h1Var = new C46522h1(xs02, this.f107146d, this.f107177t);
        C49842ig0 ig02 = h1Var.f125329t.f136119d;
        if (ig02 != null) {
            ig02.f135318j = 1;
        }
        C89059e i = h1Var.mo9225i();
        i.mo11397F(this.f107168h);
        i.mo123420E(new C39977b(this, xs02));
    }

    /* renamed from: j3 */
    public final void mo62582j3(String str, C52013xs0 xs02) {
        C39775b bVar;
        C87412m.m108594g(str, "boxId");
        C87412m.m108594g(xs02, "msg");
        C39786k kVar = this.f107176s;
        if (kVar != null) {
            Log.m105924i("Finder.BoxDataStore", "insertLocal " + xs02.f144904f);
            bVar = C39786k.f106760i.mo62421b(xs02);
            if (bVar != null) {
                bVar.f106733d = true;
                C61926c.m72668M(new C39805s(kVar, str, bVar));
            }
        } else {
            bVar = null;
        }
        C46522h1 h1Var = new C46522h1(xs02, this.f107146d, this.f107177t);
        C49842ig0 ig02 = h1Var.f125329t.f136119d;
        if (ig02 != null) {
            ig02.f135318j = 1;
        }
        C89059e i = h1Var.mo9225i();
        i.mo11397F(this.f107168h);
        i.mo123420E(new C39978c(bVar, this));
    }

    /* renamed from: k3 */
    public final Object mo62583k3(String str, boolean z, C15601d<? super C13598b0> dVar) {
        C53896h0 h0Var = C53872d1.f151117a;
        return C53895h.m60469g(C58901s.f168555a, new C39979d(str, this, z, (C15601d<? super C39979d>) null), dVar);
    }

    /* renamed from: l3 */
    public final void mo62584l3(boolean z) {
        if (z != this.f107173p) {
            Log.m105924i("Finder.LiveBoxSlice", "reachLastVisibleComment from " + this.f107173p + " to " + z + '!');
        }
        this.f107173p = z;
    }

    /* renamed from: m3 */
    public final void mo62585m3(int i) {
        if (i != this.f107175r) {
            Log.m105924i("Finder.LiveBoxSlice", "unReadAtMeMsgPos from " + this.f107175r + " to " + i);
        }
        this.f107175r = i;
    }

    public void onCleared() {
        super.onCleared();
        this.f107168h.dead();
        this.f107170j = new C54219z<>();
        C39786k kVar = this.f107176s;
        if (kVar != null) {
            Log.m105924i("Finder.BoxDataStore", "release");
            kVar.f106764c = new C54219z<>(new ConcurrentHashMap());
            kVar.f106765d.clear();
            kVar.f106766e = new C54219z<>(new ConcurrentHashMap());
            C39612t tVar = kVar.f106768g;
            if (tVar != null) {
                C53973z1 z1Var = tVar.f106367e;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                tVar.f106367e = null;
            }
            kVar.f106768g = null;
            C39612t tVar2 = kVar.f106769h;
            if (tVar2 != null) {
                C53973z1 z1Var2 = tVar2.f106367e;
                if (z1Var2 != null) {
                    C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
                }
                tVar2.f106367e = null;
            }
            kVar.f106769h = null;
        }
        this.f107176s = null;
        this.f107178u = null;
        this.f107172o = -1;
        mo62584l3(true);
        this.f107167g = false;
        this.f107174q = 0;
        mo62585m3(0);
        this.f107171n = 0;
    }
}
