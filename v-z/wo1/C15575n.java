package wo1;

import android.content.Context;
import bi1.C0283d;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32226l;
import hp3.C87581a;
import nj3.C11184p0;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51343t41;

/* renamed from: wo1.n */
public final class C15575n implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C51343t41 f42190d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Integer, C13598b0> f42191e;

    /* renamed from: f */
    public final /* synthetic */ C45795b f42192f;

    /* renamed from: g */
    public final /* synthetic */ Context f42193g;

    /* renamed from: wo1.n$a */
    public static final class C15576a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ Context f42194a;

        public C15576a(Context context) {
            this.f42194a = context;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (C0283d.m246d(cVar)) {
                Log.m105924i("ReplayBulletPopupHelper", "FinderLiveComplainReplayMsgRequest success!");
                C61926c.m72668M(new C15574m(this.f42194a));
            } else {
                Log.m105920e("ReplayBulletPopupHelper", "FinderLiveComplainReplayMsgRequest fail:" + cVar.f256794b + ',' + cVar.f256793a + ',' + cVar.f256795c);
            }
            return C13598b0.f38549a;
        }
    }

    public C15575n(C51343t41 t412, C32226l<? super Integer, C13598b0> lVar, C45795b bVar, Context context) {
        this.f42190d = t412;
        this.f42191e = lVar;
        this.f42192f = bVar;
        this.f42193g = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [it1.c] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMMMenuItemSelected(android.view.MenuItem r12, int r13) {
        /*
            r11 = this;
            java.lang.Class<bp1.d> r13 = bp1.C54519d.class
            int r0 = r12.getItemId()
            r1 = 45
            java.lang.String r2 = "ReplayBulletPopupHelper"
            r3 = 0
            r4 = 1
            if (r0 != r4) goto L_0x00da
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "complain msg:"
            r0.append(r4)
            te3.t41 r4 = r11.f42190d
            te3.r41 r4 = r4.f141953d
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = r4.f185124d
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            r0.append(r4)
            r0.append(r1)
            te3.t41 r1 = r11.f42190d
            te3.r41 r1 = r1.f141953d
            if (r1 == 0) goto L_0x0031
            java.lang.String r1 = r1.f185126f
            goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            te3.ex0 r0 = new te3.ex0
            r0.<init>()
            fj1.b r1 = r11.f42192f
            te3.t41 r2 = r11.f42190d
            je1.h2 r4 = je1.C46523h2.f125330a
            r5 = 10297(0x2839, float:1.4429E-41)
            te3.ig0 r4 = r4.mo71859a(r5)
            r0.f133155d = r4
            androidx.lifecycle.i0 r4 = r1.mo71262a(r13)
            bp1.d r4 = (bp1.C54519d) r4
            long r6 = r4.mo75373f3()
            r0.f133156e = r6
            androidx.lifecycle.i0 r13 = r1.mo71262a(r13)
            bp1.d r13 = (bp1.C54519d) r13
            long r6 = r13.mo75371d3()
            r0.f133157f = r6
            java.lang.String r13 = r2.f141954e
            r0.f133158g = r13
            te3.r41 r13 = r2.f141953d
            if (r13 == 0) goto L_0x0072
            long r1 = r13.f185129i
            goto L_0x0074
        L_0x0072:
            r1 = 0
        L_0x0074:
            r0.f133159h = r1
            ob0.c$b r13 = new ob0.c$b
            r13.<init>()
            r13.f127069d = r5
            java.lang.String r1 = "/cgi-bin/micromsg-bin/finderlivecomplainreplaymsg"
            r13.f127068c = r1
            r13.f127066a = r0
            te3.fx0 r0 = new te3.fx0
            r0.<init>()
            r13.f127067b = r0
            ob0.c r13 = r13.mo72403a()
            java.lang.Class<ht1.s1> r0 = ht1.C8802s1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.s1 r0 = (ht1.C8802s1) r0
            ob0.b r0 = r0.mo9632ui()
            r0.mo123453j(r13)
            boolean r13 = r0 instanceof it1.C60625c
            if (r13 == 0) goto L_0x00a4
            r3 = r0
            it1.c r3 = (it1.C60625c) r3
        L_0x00a4:
            if (r3 == 0) goto L_0x00cc
            android.content.Context r5 = r11.f42193g
            r6 = 0
            r7 = 0
            r9 = 6
            r10 = 0
            r4 = r3
            it1.C60625c.m70894l(r4, r5, r6, r7, r9, r10)
            nr3.e r13 = r3.mo9225i()
            if (r13 == 0) goto L_0x00cc
            wo1.n$a r0 = new wo1.n$a
            android.content.Context r1 = r11.f42193g
            r0.<init>(r1)
            r13.mo123420E(r0)
            android.content.Context r0 = r11.f42193g
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x00cc
            jp3.b r0 = (jp3.C9487b) r0
            r13.mo11397F(r0)
        L_0x00cc:
            fy3.l<java.lang.Integer, rx3.b0> r13 = r11.f42191e
            int r12 = r12.getItemId()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.invoke(r12)
            goto L_0x010c
        L_0x00da:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "select msg:"
            r12.append(r13)
            te3.t41 r13 = r11.f42190d
            te3.r41 r13 = r13.f141953d
            if (r13 == 0) goto L_0x00ee
            java.lang.String r13 = r13.f185124d
            goto L_0x00ef
        L_0x00ee:
            r13 = r3
        L_0x00ef:
            r12.append(r13)
            r12.append(r1)
            te3.t41 r13 = r11.f42190d
            te3.r41 r13 = r13.f141953d
            if (r13 == 0) goto L_0x00fd
            java.lang.String r3 = r13.f185126f
        L_0x00fd:
            r12.append(r3)
            java.lang.String r13 = ",but do nothing!"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r12)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wo1.C15575n.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }
}
