package qj1;

import a14.C0000n0;
import a14.C53934p0;
import androidx.lifecycle.C0120a0;
import bl1.C39807u;
import cl1.C39975j;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import d60.C58124b;
import fy3.C32227p;
import java.util.concurrent.ConcurrentHashMap;
import jp3.C46566c;
import jp3.C9486a;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import rx3.C13598b0;
import rx3.C13600d;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qj1.k4 */
public final class C47851k4 extends C62660c {

    /* renamed from: p */
    public final C58124b f128440p;

    /* renamed from: q */
    public final MMActivity f128441q;

    /* renamed from: r */
    public C46566c<C9486a> f128442r;

    /* renamed from: s */
    public String f128443s;

    /* renamed from: t */
    public final C39975j f128444t;

    /* renamed from: u */
    public long f128445u;

    /* renamed from: v */
    public ConcurrentHashMap<String, C39807u> f128446v;

    /* renamed from: w */
    public final C0120a0<ConcurrentHashMap<String, C39807u>> f128447w;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxPlugin$statusChange$1", mo125469f = "FinderLiveBoxPlugin.kt", mo125470l = {99}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.k4$a */
    public static final class C47852a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f128448d;

        /* renamed from: e */
        public final /* synthetic */ C47851k4 f128449e;

        /* renamed from: f */
        public final /* synthetic */ boolean f128450f;

        /* renamed from: qj1.k4$a$a */
        public static final class C47853a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ boolean f128451d;

            /* renamed from: e */
            public final /* synthetic */ C47851k4 f128452e;

            public C47853a(boolean z, C47851k4 k4Var) {
                this.f128451d = z;
                this.f128452e = k4Var;
            }

            public Object emit(Object obj, C15601d dVar) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (this.f128451d && !booleanValue) {
                    Log.m105924i("Finder.FinderLiveBoxPlugin", "box finish");
                    C47851k4 k4Var = this.f128452e;
                    k4Var.getClass();
                    Log.m105924i("Finder.FinderLiveBoxPlugin", "stopBox " + C61926c.m72691p(k4Var.f128445u));
                    C11207i.m11072h(k4Var, (C66212f) null, (C53934p0) null, new C47855l4(k4Var, (C15601d<? super C47855l4>) null), 3, (Object) null);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47852a(C47851k4 k4Var, boolean z, C15601d<? super C47852a> dVar) {
            super(2, dVar);
            this.f128449e = k4Var;
            this.f128450f = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C47852a(this.f128449e, this.f128450f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C47852a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            return C15911a.COROUTINE_SUSPENDED;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f128448d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58087u0<Boolean> u0Var = ((C39975j) this.f128449e.mo87696x0(C39975j.class)).f107166f;
                C47853a aVar2 = new C47853a(this.f128450f, this.f128449e);
                this.f128448d = 1;
                if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47851k4(android.view.ViewGroup r3, d60.C58124b r4, com.tencent.p014mm.p136ui.MMActivity r5, te3.C49712hj1 r6, int r7, gy3.C8480h r8) {
        /*
            r2 = this;
            r7 = r7 & 8
            if (r7 == 0) goto L_0x0005
            r6 = 0
        L_0x0005:
            java.lang.String r7 = "root"
            gy3.C87412m.m108594g(r3, r7)
            java.lang.String r7 = "statusMonitor"
            gy3.C87412m.m108594g(r4, r7)
            java.lang.String r7 = "activity"
            gy3.C87412m.m108594g(r5, r7)
            r2.<init>(r3, r4, r6)
            r2.f128440p = r4
            r2.f128441q = r5
            jp3.c r3 = new jp3.c
            r3.<init>()
            r2.f128442r = r3
            java.lang.String r3 = ""
            r2.f128443s = r3
            java.lang.Class<cl1.j> r4 = cl1.C39975j.class
            androidx.lifecycle.i0 r4 = r2.mo87696x0(r4)
            cl1.j r4 = (cl1.C39975j) r4
            r2.f128444t = r4
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r2.f128446v = r4
            qj1.i4 r4 = new qj1.i4
            r4.<init>(r2)
            r2.f128447w = r4
            android.content.Intent r4 = r5.getIntent()
            r6 = 0
            java.lang.String r8 = "KEY_ENTER_LIVE_PARAM_BOX_GROUP_TO_LIVEID"
            long r6 = r4.getLongExtra(r8, r6)
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r4 = r2.mo87696x0(r4)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            long r0 = r4.f182392d
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0079
            java.lang.String r4 = "Finder.FinderLiveBoxPlugin"
            java.lang.String r6 = "hit targetId, consume fromGroupId"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            android.content.Intent r4 = r5.getIntent()
            java.lang.String r6 = "KEY_ENTER_LIVE_PARAM_BOX_GROUP_ID"
            java.lang.String r4 = r4.getStringExtra(r6)
            if (r4 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r3 = r4
        L_0x0070:
            r2.f128443s = r3
            android.content.Intent r3 = r5.getIntent()
            r3.removeExtra(r6)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C47851k4.<init>(android.view.ViewGroup, d60.b, com.tencent.mm.ui.MMActivity, te3.hj1, int, gy3.h):void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        this.f128442r = new C46566c<>();
        super.mo8357i0();
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r6 = r15
            r0 = r17
            java.lang.String r1 = "status"
            r2 = r16
            gy3.C87412m.m108594g(r2, r1)
            int r1 = r16.ordinal()
            r2 = 0
            r3 = 7
            r7 = 0
            if (r1 == r3) goto L_0x0065
            r3 = 34
            if (r1 == r3) goto L_0x001a
            goto L_0x00ec
        L_0x001a:
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = "PARAM_FINDER_LIVE_BOX_MSG_TYPE"
            int r2 = r0.getInt(r1)
        L_0x0022:
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = "PARAM_FINDER_LIVE_BOX_MSG_CONTENT"
            java.lang.String r7 = r0.getString(r1)
        L_0x002a:
            java.lang.String r0 = ""
            if (r7 != 0) goto L_0x0030
            r9 = r0
            goto L_0x0031
        L_0x0030:
            r9 = r7
        L_0x0031:
            java.lang.Class<ak1.w> r1 = ak1.C54116w.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r8 = r1
            ak1.w r8 = (ak1.C54116w) r8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.lang.Class<cl1.j> r1 = cl1.C39975j.class
            androidx.lifecycle.i0 r1 = r15.mo87696x0(r1)
            cl1.j r1 = (cl1.C39975j) r1
            androidx.lifecycle.z<te3.lw0> r1 = r1.f107170j
            java.lang.Object r1 = r1.getValue()
            te3.lw0 r1 = (te3.C50317lw0) r1
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = r1.f137677e
            if (r1 != 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r14 = r1
            goto L_0x0058
        L_0x0057:
            r14 = r0
        L_0x0058:
            r8.getClass()
            r13 = 1
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r8.Dx0(r9, r10, r11, r12, r13, r14)
            goto L_0x00ec
        L_0x0065:
            er1.k r1 = er1.C45684k.f123488a
            fj1.b r3 = r15.mo87684A0()
            java.lang.String r4 = "<this>"
            gy3.C87412m.m108594g(r3, r4)
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99245O1
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = 1
            if (r3 != r4) goto L_0x0085
            r2 = 1
        L_0x0085:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "local enable:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "Finder.BoxCommon"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            if (r2 == 0) goto L_0x00ec
            fj1.b r2 = r15.mo87684A0()
            boolean r8 = r1.mo71181b(r2)
            if (r8 == 0) goto L_0x00df
            java.lang.Class<cl1.u> r1 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r15.mo87696x0(r1)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r1 = r1.f182392d
            r6.f128445u = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startBox "
            r1.append(r2)
            long r2 = r6.f128445u
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.FinderLiveBoxPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 0
            r2 = 0
            qj1.j4 r3 = new qj1.j4
            r3.<init>(r15, r0, r7)
            r4 = 3
            r5 = 0
            r0 = r15
            nk1.C11207i.m11072h(r0, r1, r2, r3, r4, r5)
        L_0x00df:
            r1 = 0
            r2 = 0
            qj1.k4$a r3 = new qj1.k4$a
            r3.<init>(r15, r8, r7)
            r4 = 3
            r5 = 0
            r0 = r15
            nk1.C11207i.m11072h(r0, r1, r2, r3, r4, r5)
        L_0x00ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C47851k4.mo3210u0(d60.b$b, android.os.Bundle):void");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        this.f128442r.dead();
        this.f128446v = new ConcurrentHashMap<>();
        this.f128443s = "";
        super.mo3211w0();
        this.f128445u = 0;
    }
}
