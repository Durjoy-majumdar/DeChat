package hl1;

import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import dh1.C58268d;
import gy3.C8480h;
import gy3.C87412m;
import k14.C60949f;
import k14.C99088c;
import qj1.C12738xf;
import te3.C49712hj1;
import vk1.C65762c;

/* renamed from: hl1.g */
public final class C59974g extends C58268d {

    /* renamed from: i */
    public C12738xf f171121i;

    /* renamed from: j */
    public final LifecycleScope f171122j = new LifecycleScope("Finder.FinderLiveVisitorEndUIC", this.f171121i, 0, 4, (C8480h) null);

    /* renamed from: n */
    public final C99088c f171123n = C60949f.m71437a(false, 1, (Object) null);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59974g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, "context");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010f, code lost:
        if (r2 == null) goto L_0x0111;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m69854n(hl1.C59974g r15, wx3.C15601d r16) {
        /*
            r0 = r15
            r1 = r16
            r15.getClass()
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            boolean r4 = r1 instanceof hl1.C59970f
            if (r4 == 0) goto L_0x001d
            r4 = r1
            hl1.f r4 = (hl1.C59970f) r4
            int r5 = r4.f171115h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001d
            int r5 = r5 - r6
            r4.f171115h = r5
            goto L_0x0022
        L_0x001d:
            hl1.f r4 = new hl1.f
            r4.<init>(r15, r1)
        L_0x0022:
            java.lang.Object r1 = r4.f171113f
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f171115h
            r7 = 2
            r8 = 0
            r9 = 4
            r10 = 3
            r11 = 1
            if (r6 == 0) goto L_0x0067
            if (r6 == r11) goto L_0x005e
            if (r6 == r7) goto L_0x0051
            if (r6 == r10) goto L_0x0048
            if (r6 != r9) goto L_0x0040
            java.lang.Object r0 = r4.f171111d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x01c8
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            java.lang.Object r0 = r4.f171111d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x01ad
        L_0x0051:
            java.lang.Object r0 = r4.f171112e
            bi1.e r0 = (bi1.C0287e) r0
            java.lang.Object r2 = r4.f171111d
            hl1.g r2 = (hl1.C59974g) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x018d
        L_0x005e:
            java.lang.Object r0 = r4.f171111d
            hl1.g r0 = (hl1.C59974g) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x016b
        L_0x0067:
            kotlin.ResultKt.throwOnFailure(r1)
            qj1.xf r1 = r0.f171121i
            r6 = 0
            if (r1 == 0) goto L_0x007d
            com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView r1 = r1.f36493H
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            if (r1 != r11) goto L_0x007d
            r6 = 1
        L_0x007d:
            java.lang.String r1 = "Finder.FinderLiveVisitorEndUIC"
            if (r6 == 0) goto L_0x008a
            java.lang.String r0 = "#requestFinderLiveEndNav recommend view already shown. return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x01ca
        L_0x008a:
            androidx.lifecycle.i0 r6 = r15.mo83051g(r2)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.mo75997d4()
            if (r6 != 0) goto L_0x009f
            java.lang.String r0 = "#requestFinderLiveEndNav not the end. return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x01ca
        L_0x009f:
            te3.wx0 r1 = new te3.wx0
            r1.<init>()
            je1.h2 r6 = je1.C46523h2.f125330a
            r12 = 11681(0x2da1, float:1.6369E-41)
            te3.ig0 r13 = r6.mo71859a(r12)
            r1.f144331d = r13
            androidx.lifecycle.i0 r13 = r15.mo83051g(r3)
            cl1.u r13 = (cl1.C55001u) r13
            long r13 = r13.f154416j
            r1.f144332e = r13
            androidx.lifecycle.i0 r13 = r15.mo83051g(r3)
            cl1.u r13 = (cl1.C55001u) r13
            java.lang.String r13 = r13.f154423t
            r1.f144333f = r13
            bl3.r r13 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r14 = ht1.C60200t1.class
            bl3.r$a r13 = r13.mo62446e(r14)
            java.lang.Class<fe1.g> r14 = fe1.C8014g.class
            bl3.c r13 = r13.mo62447c(r14)
            fe1.g r13 = (fe1.C8014g) r13
            rx3.l r14 = r13.mo9104X0()
            A r14 = r14.f38555d
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1.f144334g = r14
            rx3.l r13 = r13.mo9104X0()
            B r13 = r13.f38556e
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            r1.f144335h = r13
            te3.hj1 r13 = r0.f166850h
            if (r13 == 0) goto L_0x0111
            java.lang.Class<tf0.p1> r14 = tf0.C64916p1.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            tf0.p1 r14 = (tf0.C64916p1) r14
            androidx.lifecycle.i0 r2 = r15.mo83051g(r2)
            cl1.o r2 = (cl1.C54991o) r2
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.f154341n
            if (r2 == 0) goto L_0x0107
            long r9 = r2.f164794id
            goto L_0x0109
        L_0x0107:
            r9 = 0
        L_0x0109:
            int r2 = r13.f134675i
            java.lang.String r2 = r14.mo76655Cu(r9, r2)
            if (r2 != 0) goto L_0x0113
        L_0x0111:
            java.lang.String r2 = ""
        L_0x0113:
            r1.f144336i = r2
            androidx.lifecycle.i0 r2 = r15.mo83051g(r3)
            cl1.u r2 = (cl1.C55001u) r2
            byte[] r2 = r2.f154417n
            pe3.b r2 = pe3.C89349b.m111674a(r2)
            r1.f144337j = r2
            te3.hh0 r2 = r6.mo71867j()
            r1.f144338n = r2
            cj1.n5 r2 = r15.mo83048k()
            if (r2 == 0) goto L_0x013e
            androidx.lifecycle.i0 r3 = r15.mo83051g(r3)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r9 = r3.f182392d
            te3.h71 r2 = r2.mo75732e0(r9)
            goto L_0x013f
        L_0x013e:
            r2 = r8
        L_0x013f:
            r1.f144340p = r2
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            al1.i r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r2 == 0) goto L_0x0151
            al1.l r2 = r2.f151988c
            if (r2 == 0) goto L_0x0151
            pe3.b r2 = r2.f152021a
            goto L_0x0152
        L_0x0151:
            r2 = r8
        L_0x0152:
            r1.f144341q = r2
            te3.xx0 r2 = new te3.xx0
            r2.<init>()
            bi1.c r3 = new bi1.c
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderliveendnav"
            r3.<init>(r2, r1, r6, r12)
            r4.f171111d = r0
            r4.f171115h = r11
            java.lang.Object r1 = bi1.C0283d.m245c(r3, r8, r4, r11, r8)
            if (r1 != r5) goto L_0x016b
            goto L_0x01ca
        L_0x016b:
            bi1.e r1 = (bi1.C0287e) r1
            boolean r2 = r1 instanceof bi1.C0288f
            if (r2 == 0) goto L_0x018b
            wx3.f r2 = r1.f854a
            if (r2 != 0) goto L_0x0179
            wx3.f r2 = r4.getContext()
        L_0x0179:
            hl1.e r3 = new hl1.e
            r3.<init>(r1, r8, r0)
            r4.f171111d = r0
            r4.f171112e = r1
            r4.f171115h = r7
            java.lang.Object r2 = a14.C53895h.m60469g(r2, r3, r4)
            if (r2 != r5) goto L_0x018b
            goto L_0x01ca
        L_0x018b:
            r2 = r0
            r0 = r1
        L_0x018d:
            boolean r1 = r0 instanceof bi1.C0281b
            if (r1 == 0) goto L_0x01ad
            wx3.f r1 = r0.f854a
            if (r1 != 0) goto L_0x019a
            wx3.f r1 = r4.getContext()
        L_0x019a:
            hl1.c r3 = new hl1.c
            r3.<init>(r0, r8, r2)
            r4.f171111d = r0
            r4.f171112e = r8
            r2 = 3
            r4.f171115h = r2
            java.lang.Object r1 = a14.C53895h.m60469g(r1, r3, r4)
            if (r1 != r5) goto L_0x01ad
            goto L_0x01ca
        L_0x01ad:
            wx3.f r1 = r0.f854a
            if (r1 != 0) goto L_0x01b5
            wx3.f r1 = r4.getContext()
        L_0x01b5:
            hl1.d r2 = new hl1.d
            r2.<init>(r8)
            r4.f171111d = r0
            r4.f171112e = r8
            r0 = 4
            r4.f171115h = r0
            java.lang.Object r0 = a14.C53895h.m60469g(r1, r2, r4)
            if (r0 != r5) goto L_0x01c8
            goto L_0x01ca
        L_0x01c8:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x01ca:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C59974g.m69854n(hl1.g, wx3.d):java.lang.Object");
    }

    /* renamed from: l */
    public void mo83049l(C65762c cVar, C49712hj1 hj12) {
        C87412m.m108594g(cVar, "baseRouter");
        super.mo83049l(cVar, hj12);
        C65762c cVar2 = this.f166848f;
        if (cVar2 != null && this.f171121i == null) {
            this.f171121i = new C12738xf((ViewGroup) mo83046i(C0966R.C0970id.e15, cVar2), cVar2, hj12);
        }
        C12738xf xfVar = this.f171121i;
        if (xfVar != null) {
            xfVar.mo10792g(8);
        }
    }
}
