package ck2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sj2.C63924f;
import sj2.C63935h;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ck2.f0 */
public final class C54891f0 extends UIComponent {

    /* renamed from: d */
    public C53973z1 f153855d;

    /* renamed from: e */
    public boolean f153856e = true;

    /* renamed from: f */
    public final C13601g f153857f = C36568h.m40985a(C54893b.f153866d);

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.uic.RingtoneSelectDataUIC$loadMore$1", mo125469f = "RingtoneSelectDataUIC.kt", mo125470l = {57, 67, 71}, mo125471m = "invokeSuspend")
    /* renamed from: ck2.f0$a */
    public static final class C54892a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f153858d;

        /* renamed from: e */
        public Object f153859e;

        /* renamed from: f */
        public Object f153860f;

        /* renamed from: g */
        public Object f153861g;

        /* renamed from: h */
        public int f153862h;

        /* renamed from: i */
        public final /* synthetic */ C54891f0 f153863i;

        /* renamed from: j */
        public final /* synthetic */ boolean f153864j;

        /* renamed from: n */
        public final /* synthetic */ C66132f f153865n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54892a(C54891f0 f0Var, boolean z, C66132f fVar, C15601d<? super C54892a> dVar) {
            super(2, dVar);
            this.f153863i = f0Var;
            this.f153864j = z;
            this.f153865n = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54892a(this.f153863i, this.f153864j, this.f153865n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54892a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0111  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0127  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x018b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Class<com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC> r0 = com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC.class
                java.lang.Class<ck2.a> r1 = ck2.C54873a.class
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r3 = r13.f153862h
                r4 = 2
                r5 = 3
                r6 = 0
                r7 = 1
                if (r3 == 0) goto L_0x0044
                if (r3 == r7) goto L_0x0040
                if (r3 == r4) goto L_0x0031
                if (r3 != r5) goto L_0x0029
                java.lang.Object r2 = r13.f153861g
                ve3.n0 r2 = (ve3.C65685n0) r2
                java.lang.Object r3 = r13.f153860f
                ck2.f0 r3 = (ck2.C54891f0) r3
                java.lang.Object r4 = r13.f153859e
                java.util.List r4 = (java.util.List) r4
                java.lang.Object r8 = r13.f153858d
                sj2.e r8 = (sj2.C63923e) r8
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x0107
            L_0x0029:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0031:
                java.lang.Object r3 = r13.f153859e
                java.util.List r3 = (java.util.List) r3
                java.lang.Object r4 = r13.f153858d
                sj2.e r4 = (sj2.C63923e) r4
                kotlin.ResultKt.throwOnFailure(r14)
                r8 = r4
            L_0x003d:
                r4 = r3
                goto L_0x00dd
            L_0x0040:
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x007a
            L_0x0044:
                kotlin.ResultKt.throwOnFailure(r14)
                ck2.f0 r14 = r13.f153863i
                sj2.h r14 = r14.mo75830c3()
                ck2.f0 r3 = r13.f153863i
                r3.getClass()
                bl3.r r8 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()
                bl3.r$a r3 = r8.mo62444c(r3)
                androidx.lifecycle.i0 r3 = r3.mo75002a(r0)
                com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r3 = (com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC) r3
                int r3 = r3.f164074g
                boolean r8 = r13.f153864j
                ck2.f0 r9 = r13.f153863i
                boolean r9 = r9.f153856e
                if (r9 == 0) goto L_0x0070
                if (r8 == 0) goto L_0x0070
                r9 = 1
                goto L_0x0071
            L_0x0070:
                r9 = 0
            L_0x0071:
                r13.f153862h = r7
                java.lang.Object r14 = r14.mo13066a(r3, r8, r9, r13)
                if (r14 != r2) goto L_0x007a
                return r2
            L_0x007a:
                sj2.e r14 = (sj2.C63923e) r14
                ck2.f0 r3 = r13.f153863i
                r3.f153856e = r6
                boolean r8 = r14.f181197c
                if (r8 != 0) goto L_0x009a
                bl3.r r14 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
                bl3.r$a r14 = r14.mo62444c(r0)
                androidx.lifecycle.i0 r14 = r14.mo75002a(r1)
                ck2.a r14 = (ck2.C54873a) r14
                r14.mo75817c3()
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x009a:
                java.util.List<pj2.d> r3 = r14.f181195a
                java.util.List r3 = sx3.C110818d0.m150900B0(r3)
                wj2.f r8 = r13.f153865n
                if (r8 == 0) goto L_0x0172
                r13.f153858d = r14
                r13.f153859e = r3
                r13.f153862h = r4
                boolean r4 = r8.mo90179j()
                r9 = 0
                if (r4 == 0) goto L_0x00c1
                long r10 = r8.f190092o
                java.lang.String r4 = r8.f190093p
                a14.h0 r8 = a14.C53872d1.f151119c
                nj2.e r12 = new nj2.e
                r12.<init>(r10, r4, r9)
                java.lang.Object r4 = a14.C53895h.m60469g(r8, r12, r13)
                goto L_0x00d6
            L_0x00c1:
                boolean r4 = r8.mo90180k()
                if (r4 == 0) goto L_0x00d5
                int r4 = r8.f190094q
                a14.h0 r8 = a14.C53872d1.f151119c
                nj2.f r10 = new nj2.f
                r10.<init>(r4, r9)
                java.lang.Object r4 = a14.C53895h.m60469g(r8, r10, r13)
                goto L_0x00d6
            L_0x00d5:
                r4 = r9
            L_0x00d6:
                if (r4 != r2) goto L_0x00d9
                return r2
            L_0x00d9:
                r8 = r14
                r14 = r4
                goto L_0x003d
            L_0x00dd:
                ve3.a0 r14 = (ve3.C52823a0) r14
                if (r14 == 0) goto L_0x0170
                ve3.n0 r14 = r14.f147573d
                if (r14 == 0) goto L_0x0170
                ck2.f0 r3 = r13.f153863i
                pj2.e r9 = new pj2.e
                r9.<init>(r14)
                sj2.h r10 = r3.mo75830c3()
                java.util.List r9 = sx3.C26236u.m33719b(r9)
                r13.f153858d = r8
                r13.f153859e = r4
                r13.f153860f = r3
                r13.f153861g = r14
                r13.f153862h = r5
                java.lang.Object r9 = r10.mo88699b(r9, r13)
                if (r9 != r2) goto L_0x0105
                return r2
            L_0x0105:
                r2 = r14
                r14 = r9
            L_0x0107:
                java.util.List r14 = (java.util.List) r14
                java.lang.Object r14 = sx3.C110818d0.m150916N(r14)
                pj2.e r14 = (pj2.C62324e) r14
                if (r14 != 0) goto L_0x0127
                bl3.r r14 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r0 = r3.getActivity()
                bl3.r$a r14 = r14.mo62444c(r0)
                androidx.lifecycle.i0 r14 = r14.mo75002a(r1)
                ck2.a r14 = (ck2.C54873a) r14
                r14.mo75817c3()
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x0127:
                r14.f177156f = r7
                bl3.r r9 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r10 = r3.getActivity()
                bl3.r$a r9 = r9.mo62444c(r10)
                androidx.lifecycle.i0 r0 = r9.mo75002a(r0)
                com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r0 = (com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC) r0
                java.lang.String r0 = r0.f164073f
                java.lang.Class<d62.i> r9 = d62.C75339i.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                d62.i r9 = (d62.C75339i) r9
                java.lang.String r0 = r9.getDisplayName(r0)
                if (r0 != 0) goto L_0x014b
                java.lang.String r0 = ""
            L_0x014b:
                ve3.g r2 = r2.f189022f
                if (r2 != 0) goto L_0x0150
                goto L_0x0152
            L_0x0150:
                r2.f189008u = r5
            L_0x0152:
                if (r2 != 0) goto L_0x0155
                goto L_0x016d
            L_0x0155:
                ve3.o0 r5 = new ve3.o0
                r5.<init>()
                androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()
                r9 = 2131834893(0x7f11380d, float:1.930291E38)
                java.lang.Object[] r7 = new java.lang.Object[r7]
                r7[r6] = r0
                java.lang.String r0 = r3.getString(r9, r7)
                r5.f147612d = r0
                r2.f189009v = r5
            L_0x016d:
                r4.add(r6, r14)
            L_0x0170:
                r3 = r4
                r14 = r8
            L_0x0172:
                bl3.r r0 = bl3.C39818r.f106831a
                ck2.f0 r2 = r13.f153863i
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                bl3.r$a r2 = r0.mo62444c(r2)
                androidx.lifecycle.i0 r2 = r2.mo75002a(r1)
                ck2.a r2 = (ck2.C54873a) r2
                r2.mo75818d3(r3)
                boolean r14 = r14.f181196b
                if (r14 != 0) goto L_0x019e
                ck2.f0 r14 = r13.f153863i
                androidx.appcompat.app.AppCompatActivity r14 = r14.getActivity()
                bl3.r$a r14 = r0.mo62444c(r14)
                androidx.lifecycle.i0 r14 = r14.mo75002a(r1)
                ck2.a r14 = (ck2.C54873a) r14
                r14.mo75817c3()
            L_0x019e:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ck2.C54891f0.C54892a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: ck2.f0$b */
    public static final class C54893b extends C87413o implements C32224a<C63935h> {

        /* renamed from: d */
        public static final C54893b f153866d = new C54893b();

        public C54893b() {
            super(0);
        }

        public Object invoke() {
            C63924f a = C63924f.f181198b.mo88701a(1);
            C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.ringtone.flow.RingtoneSelectDataLoader");
            return (C63935h) a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54891f0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final C63935h mo75830c3() {
        return (C63935h) ((C36570n) this.f153857f).getValue();
    }

    /* renamed from: d3 */
    public final void mo75831d3(boolean z, C66132f fVar) {
        if (z || mo75830c3().f181231g) {
            C53973z1 z1Var = this.f153855d;
            boolean z2 = true;
            if (z1Var == null || !z1Var.mo74466a()) {
                z2 = false;
            }
            if (!z2) {
                this.f153855d = C53895h.m60466d(getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54892a(this, z, fVar, (C15601d<? super C54892a>) null), 3, (Object) null);
                return;
            }
            return;
        }
        ((C54873a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C54873a.class)).mo75817c3();
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        C39818r rVar = C39818r.f106831a;
        ((RingtoneDataUIC) rVar.mo62444c(getActivity()).mo75002a(RingtoneDataUIC.class)).getClass();
        mo75830c3().f181229e = ((C54913i0) rVar.mo62444c(getActivity()).mo75002a(C54913i0.class)).f153914e;
    }

    public void onDestroy() {
        mo75830c3().mo88700c(1);
        C53973z1 z1Var = this.f153855d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        super.onDestroy();
    }

    public void onPause() {
        C53973z1 z1Var = this.f153855d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
