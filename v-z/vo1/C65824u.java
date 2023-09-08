package vo1;

import ch1.C0504g;
import ch1.C0505p;
import ch1.C54717b;
import ch1.C54718c;
import ch1.C54719d;
import ch1.C54723j;
import ch1.C54724k;
import ch1.C54726m;
import ch1.C54727n;
import ch1.C54728o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.List;
import sx3.C64197v;
import yg1.C39014a;
import yg1.C39016i;
import yg1.C66636e;
import zg1.C16178l;

/* renamed from: vo1.u */
public final class C65824u extends C66636e {

    /* renamed from: i */
    public final List<C39016i> f189295i;

    /* renamed from: vo1.u$b */
    public final class C37796b implements C39016i {

        /* renamed from: a */
        public final String f100111a = "ReplayMsgRespLegalInterceptor";

        /* renamed from: b */
        public final /* synthetic */ C65824u f100112b;

        public C37796b(C65824u uVar, C45795b bVar) {
            C87412m.m108594g(bVar, "liveContext");
            this.f100112b = uVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
            r4 = r4.f105072a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo55917a(yg1.C39014a r14) {
            /*
                r13 = this;
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                java.lang.Class<bp1.d> r1 = bp1.C54519d.class
                java.lang.String r2 = "cgiResp"
                gy3.C87412m.m108594g(r14, r2)
                int r2 = r14.f105068a
                int r3 = r14.f105069b
                yg1.a$a r4 = r14.f105070c
                r5 = 0
                if (r4 == 0) goto L_0x0019
                te3.ao0 r4 = r4.f105072a
                if (r4 == 0) goto L_0x0019
                te3.c21 r4 = r4.f130678f
                goto L_0x001a
            L_0x0019:
                r4 = r5
            L_0x001a:
                java.lang.String r14 = r14.f105071d
                r6 = 1
                r7 = 0
                if (r4 == 0) goto L_0x0036
                long r8 = r4.f182392d
                vo1.u r10 = r13.f100112b
                fj1.b r10 = r10.f107146d
                androidx.lifecycle.i0 r10 = r10.mo71262a(r1)
                bp1.d r10 = (bp1.C54519d) r10
                long r10 = r10.mo75371d3()
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 != 0) goto L_0x0036
                r8 = 1
                goto L_0x0037
            L_0x0036:
                r8 = 0
            L_0x0037:
                if (r8 == 0) goto L_0x0071
                vo1.u r8 = r13.f100112b
                fj1.b r8 = r8.f107146d
                androidx.lifecycle.i0 r8 = r8.mo71262a(r0)
                cl1.u r8 = (cl1.C55001u) r8
                java.lang.String r8 = r8.f154426w
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r14, (java.lang.String) r8)
                if (r8 != 0) goto L_0x004c
                goto L_0x0071
            L_0x004c:
                if (r3 != 0) goto L_0x0052
                if (r2 == 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                return r6
            L_0x0052:
                java.lang.String r14 = r13.f100111a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "handleReplayLiveMsgResp errCode:"
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = ",errType:"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                return r7
            L_0x0071:
                java.lang.String r2 = r13.f100111a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r6 = "handleReplayLiveMsgResp localUniqId:"
                r3.append(r6)
                vo1.u r6 = r13.f100112b
                fj1.b r6 = r6.f107146d
                androidx.lifecycle.i0 r0 = r6.mo71262a(r0)
                cl1.u r0 = (cl1.C55001u) r0
                java.lang.String r0 = r0.f154426w
                r3.append(r0)
                java.lang.String r0 = ", respUniqId:"
                r3.append(r0)
                r3.append(r14)
                java.lang.String r14 = ", local liveId:"
                r3.append(r14)
                vo1.u r14 = r13.f100112b
                fj1.b r14 = r14.f107146d
                androidx.lifecycle.i0 r14 = r14.mo71262a(r1)
                bp1.d r14 = (bp1.C54519d) r14
                long r0 = r14.mo75371d3()
                r3.append(r0)
                java.lang.String r14 = ", resp.liveId:"
                r3.append(r14)
                if (r4 == 0) goto L_0x00b7
                long r0 = r4.f182392d
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
            L_0x00b7:
                r3.append(r5)
                java.lang.String r14 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r14)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: vo1.C65824u.C37796b.mo55917a(yg1.a):boolean");
        }
    }

    /* renamed from: vo1.u$a */
    public final class C65825a extends C54724k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65825a(C65824u uVar, C45795b bVar) {
            super(bVar);
            C87412m.m108594g(bVar, "liveContext");
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo49b(yg1.C39014a.C39015a r5) {
            /*
                r4 = this;
                java.lang.String r0 = "respWrapper"
                gy3.C87412m.m108594g(r5, r0)
                te3.ao0 r5 = r5.f105072a
                r0 = 1
                if (r5 == 0) goto L_0x0044
                te3.c21 r5 = r5.f130678f
                if (r5 == 0) goto L_0x0044
                te3.dy0 r5 = r5.f182399n
                if (r5 == 0) goto L_0x0044
                pe3.b r5 = r5.f132564d
                if (r5 == 0) goto L_0x0044
                te3.oo2 r1 = new te3.oo2
                r1.<init>()
                byte[] r5 = r5.f257327a
                r2 = 0
                if (r5 != 0) goto L_0x0022
            L_0x0020:
                r1 = r2
                goto L_0x0034
            L_0x0022:
                r1.parseFrom(r5)     // Catch:{ Exception -> 0x0026 }
                goto L_0x0034
            L_0x0026:
                r5 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r3 = 0
                r1[r3] = r5
                java.lang.String r5 = "safeParser"
                java.lang.String r3 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r3, r1)
                goto L_0x0020
            L_0x0034:
                if (r1 == 0) goto L_0x0044
                fj1.b r5 = r4.f153366a
                java.lang.Class<cl1.o> r2 = cl1.C54991o.class
                androidx.lifecycle.i0 r5 = r5.mo71262a(r2)
                cl1.o r5 = (cl1.C54991o) r5
                r2 = 2
                r5.mo75968K4(r1, r2)
            L_0x0044:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vo1.C65824u.C65825a.mo49b(yg1.a$a):boolean");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65824u(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        this.f189295i = C64197v.m75537f(new C37796b(this, bVar), new C54727n(bVar), new C54723j(bVar), new C65825a(this, bVar), new C0505p(bVar), new C54728o(bVar), new C54726m(bVar), new C0504g(bVar), new C16178l(bVar), new C54718c(), new C54719d(bVar), new C54717b(bVar));
    }

    /* renamed from: e3 */
    public boolean mo89859e3(C39014a aVar) {
        C87412m.m108594g(aVar, "cgiResp");
        boolean z = false;
        for (C39016i next : this.f189295i) {
            boolean a = next.mo55917a(aVar);
            if (!a) {
                Log.m105924i("FinderLiveReplayMsgRespChain", "dealWithResp interceptor:" + next.getClass().getSimpleName() + " break!");
                return a;
            }
            z = a;
        }
        return z;
    }

    /* renamed from: f3 */
    public List<C39016i> mo89860f3() {
        return this.f189295i;
    }
}
