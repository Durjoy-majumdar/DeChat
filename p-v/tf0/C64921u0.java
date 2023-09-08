package tf0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import eu1.C58803a;
import gy3.C87412m;
import ht1.C60192p2;
import lt1.C10652c;
import lt1.C61401a;
import lt1.C61402b;
import p565ir.C60606n;
import pe3.C89349b;
import ph1.C62287a;
import ph1.C62288c;
import ph1.C62289d;
import ph1.C62293i;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64293cq2;
import te3.C64890zp2;
import up1.C37521f;

@C86522b
/* renamed from: tf0.u0 */
public final class C64921u0 extends C86301e implements C60192p2 {

    /* renamed from: d */
    public final String f186947d = "FinderFluentSwitchServi";

    /* renamed from: I1 */
    public boolean mo85190I1(C64273c21 c212) {
        return ((C60606n) C86312j.m106911c(C60606n.class)).mo85008I1(c212);
    }

    /* renamed from: Mh */
    public int mo85191Mh() {
        return C0966R.C0970id.f358239e11;
    }

    /* renamed from: OA */
    public void mo85192OA() {
        C62293i.f177081a.mo87358c();
    }

    /* renamed from: Pz */
    public C10652c mo85193Pz(C61401a aVar, long j, ViewGroup viewGroup, View view, String str, boolean z, C64273c21 c212) {
        C87412m.m108594g(aVar, "fluentScene");
        C87412m.m108594g(viewGroup, "parentView");
        C87412m.m108594g(view, "imageView");
        String str2 = str;
        C87412m.m108594g(str2, "liveUrl");
        return new C58803a(aVar, j, viewGroup, view, str2, z, c212);
    }

    /* renamed from: Ui */
    public C61402b mo85194Ui(Context context, C10652c cVar) {
        C64265bq2 bq22;
        C89349b bVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "params");
        C64890zp2 zp22 = null;
        if (!(cVar instanceof C58803a)) {
            return null;
        }
        C58803a aVar = (C58803a) cVar;
        if (!vx0(context, aVar)) {
            return null;
        }
        C62293i iVar = C62293i.f177081a;
        C61401a aVar2 = aVar.f168353a;
        long j = aVar.f168354b;
        ViewGroup viewGroup = aVar.f168355c;
        View view = aVar.f168356d;
        String str = aVar.f168357e;
        boolean z = aVar.f168358f;
        C64273c21 c212 = aVar.f168359g;
        if (!(c212 == null || (bq22 = c212.f182358D) == null || (bVar = bq22.f182318j) == null)) {
            C64293cq2 cq22 = new C64293cq2();
            cq22.parseFrom(bVar.mo123703f());
            zp22 = cq22.f182556f;
        }
        return iVar.mo87363h(context, new C62289d(aVar2, j, viewGroup, view, str, z, zp22));
    }

    public boolean Xl0() {
        C37521f.f99374d.getClass();
        if (C37521f.f99292T4.mo60266n().intValue() != 1) {
            return false;
        }
        C37521f.f99374d.getClass();
        return C37521f.f99578z6.mo60266n().intValue() == 1 && !C85875k4.m106157N() && !C85875k4.m106167X();
    }

    /* renamed from: co */
    public C61402b mo85196co(Context context, C10652c cVar) {
        C64265bq2 bq22;
        C89349b bVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "params");
        C64890zp2 zp22 = null;
        if (!(cVar instanceof C58803a)) {
            return null;
        }
        C58803a aVar = (C58803a) cVar;
        if (!vx0(context, aVar)) {
            return null;
        }
        C62287a aVar2 = C62287a.f177060a;
        C61401a aVar3 = aVar.f168353a;
        long j = aVar.f168354b;
        ViewGroup viewGroup = aVar.f168355c;
        View view = aVar.f168356d;
        String str = aVar.f168357e;
        boolean z = aVar.f168358f;
        C64273c21 c212 = aVar.f168359g;
        if (!(c212 == null || (bq22 = c212.f182358D) == null || (bVar = bq22.f182318j) == null)) {
            C64293cq2 cq22 = new C64293cq2();
            cq22.parseFrom(bVar.mo123703f());
            zp22 = cq22.f182556f;
        }
        C62289d dVar = new C62289d(aVar3, j, viewGroup, view, str, z, zp22);
        long j2 = dVar.f177090b;
        Context applicationContext = context.getApplicationContext();
        C87412m.m108593f(applicationContext, "context.applicationContext");
        C62288c cVar2 = new C62288c(applicationContext);
        cVar2.mo84319d(dVar);
        Log.m105924i("FinderFluentReplaySwitchManager", "startSwitchOutFromSquare feedId: " + j2 + " director: " + cVar2 + ' ');
        C62287a.f177061b.put(Long.valueOf(j2), cVar2);
        return cVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean vx0(android.content.Context r7, eu1.C58803a r8) {
        /*
            r6 = this;
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            boolean r0 = r0.mo85002F()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            java.lang.String r7 = r6.f186947d
            java.lang.String r8 = "startSwitchOutFromSquare isAnchorLiving return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            return r1
        L_0x0018:
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106157N()
            if (r0 != 0) goto L_0x00b3
            te3.c21 r8 = r8.f168359g
            r2 = 0
            if (r8 == 0) goto L_0x0027
            long r4 = r8.f182392d
            goto L_0x0028
        L_0x0027:
            r4 = r2
        L_0x0028:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "isFluentEnable finderObject liveId: "
            r8.append(r0)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "FinderFluentSwitchABTes"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            r8 = 1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0062
            fj1.b$a r0 = fj1.C45795b.f123697j
            fj1.b r0 = fj1.C45795b.f123698n
            if (r0 == 0) goto L_0x005d
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            if (r0 == 0) goto L_0x005d
            long r2 = r0.f182392d
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x005d
            r0 = 1
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            if (r0 == 0) goto L_0x0062
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 != 0) goto L_0x00b3
            r0 = 0
            boolean r7 = p182kk.C61104a.m71657m(r7, r1, r0)
            if (r7 != 0) goto L_0x00b3
            java.lang.Class<tf0.r1> r7 = tf0.C64918r1.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            tf0.r1 r7 = (tf0.C64918r1) r7
            boolean r7 = r7.mo89068xA()
            if (r7 != 0) goto L_0x007b
            goto L_0x00b3
        L_0x007b:
            java.lang.Class<ky2.i> r7 = ky2.C10432i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ky2.i r7 = (ky2.C10432i) r7
            boolean r7 = r7.mo10750e()
            if (r7 == 0) goto L_0x00b2
            java.lang.Class<ht1.v4> r7 = ht1.C8808v4.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.v4 r7 = (ht1.C8808v4) r7
            boolean r7 = r7.mo9636zX()
            if (r7 != 0) goto L_0x00b2
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ht1.t1 r7 = (ht1.C60200t1) r7
            ht1.z4 r7 = r7.mo76861l7()
            boolean r7 = r7.mo83771R5()
            if (r7 == 0) goto L_0x00b2
            java.lang.String r7 = r6.f186947d
            java.lang.String r8 = "startSwitchOutFromSquare isTeenMode invalid status return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            return r1
        L_0x00b2:
            return r8
        L_0x00b3:
            java.lang.String r7 = r6.f186947d
            java.lang.String r8 = "startSwitchOutFromSquare invalid status return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C64921u0.vx0(android.content.Context, eu1.a):boolean");
    }

    /* renamed from: zC */
    public C61402b mo85197zC(long j) {
        return C62293i.f177081a.mo87362g(j, true);
    }
}
