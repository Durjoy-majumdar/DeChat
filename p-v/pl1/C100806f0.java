package pl1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import bl3.C0327w;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import k60.C60979d;
import n60.C100070a;
import n60.C100071b;
import n60.C100075f;
import p60.C100632a;
import p996kj.C88155a;
import pe1.C35464c;
import pl1.C11978e0;
import q90.C101060a;
import s60.C101536b;
import s60.C101539c;
import up1.C37521f;
import uq1.C65460t;

/* renamed from: pl1.f0 */
public final class C100806f0 extends C0327w<FinderCommonFeatureService> implements C11990s0 {

    /* renamed from: A */
    public final C100075f f295284A;

    /* renamed from: B */
    public final C100075f f295285B;

    /* renamed from: C */
    public final C100075f f295286C;

    /* renamed from: D */
    public final C100075f f295287D;

    /* renamed from: E */
    public final C100075f f295288E;

    /* renamed from: F */
    public final C60979d<C100810g0> f295289F;

    /* renamed from: G */
    public final C60979d<C100810g0> f295290G;

    /* renamed from: H */
    public final C60979d<C100810g0> f295291H;

    /* renamed from: I */
    public final C60979d<C100810g0> f295292I;

    /* renamed from: J */
    public final C60979d<C100810g0> f295293J;

    /* renamed from: K */
    public final C60979d<C100810g0> f295294K;

    /* renamed from: L */
    public final C60979d<C100810g0> f295295L;

    /* renamed from: M */
    public final C60979d<C100810g0> f295296M;

    /* renamed from: N */
    public final C60979d<C100810g0> f295297N;

    /* renamed from: P */
    public final C60979d<C100810g0> f295298P;

    /* renamed from: Q */
    public final C60979d<C100810g0> f295299Q;

    /* renamed from: e */
    public final C100075f f295300e;

    /* renamed from: f */
    public final C100075f f295301f;

    /* renamed from: g */
    public final C100075f f295302g;

    /* renamed from: h */
    public final C100075f f295303h;

    /* renamed from: i */
    public final C100075f f295304i;

    /* renamed from: j */
    public final C100075f f295305j;

    /* renamed from: n */
    public final C100075f f295306n;

    /* renamed from: o */
    public final C100075f f295307o;

    /* renamed from: p */
    public final C100075f f295308p;

    /* renamed from: q */
    public final C100075f f295309q;

    /* renamed from: r */
    public final C100075f f295310r;

    /* renamed from: s */
    public final C100075f f295311s;

    /* renamed from: t */
    public final C100075f f295312t;

    /* renamed from: u */
    public final C100075f f295313u;

    /* renamed from: v */
    public final C100075f f295314v;

    /* renamed from: w */
    public final C100075f f295315w;

    /* renamed from: x */
    public final C100075f f295316x;

    /* renamed from: y */
    public final C100075f f295317y;

    /* renamed from: z */
    public final C100075f f295318z;

    public C100806f0() {
        C100075f.C100076a aVar = new C100075f.C100076a();
        aVar.f293176b = true;
        aVar.f293175a = true;
        C37521f fVar = C37521f.f99374d;
        aVar.f293181g = fVar.mo61198x();
        aVar.f293180f = fVar.mo61199y();
        C100075f a = aVar.mo139398a();
        this.f295300e = a;
        C100075f.C100076a aVar2 = new C100075f.C100076a();
        aVar2.f293176b = true;
        aVar2.f293175a = true;
        aVar2.f293183i = C0966R.color.BW_97;
        aVar2.f293181g = fVar.mo61198x();
        aVar2.f293180f = fVar.mo61199y();
        aVar2.f293185k = new AlphaAnimation(0.0f, 1.0f);
        this.f295301f = aVar2.mo139398a();
        C100075f.C100076a aVar3 = new C100075f.C100076a();
        aVar3.f293176b = true;
        aVar3.f293175a = true;
        aVar3.f293183i = C0966R.color.BW_97;
        aVar3.f293181g = 640;
        aVar3.f293180f = 480;
        aVar3.f293185k = new AlphaAnimation(0.0f, 1.0f);
        this.f295302g = aVar3.mo139398a();
        C100075f.C100076a aVar4 = new C100075f.C100076a();
        aVar4.f293176b = true;
        aVar4.f293175a = true;
        aVar4.f293183i = C0966R.color.f2947a4;
        aVar4.f293181g = 640;
        aVar4.f293180f = 480;
        aVar4.f293185k = new AlphaAnimation(0.0f, 1.0f);
        this.f295303h = aVar4.mo139398a();
        C100075f.C100076a aVar5 = new C100075f.C100076a();
        aVar5.f293176b = true;
        aVar5.f293175a = true;
        aVar5.f293181g = fVar.mo61198x();
        aVar5.f293180f = fVar.mo61199y();
        aVar5.f293185k = new AlphaAnimation(0.0f, 1.0f);
        this.f295304i = aVar5.mo139398a();
        C100075f.C100076a aVar6 = new C100075f.C100076a();
        aVar6.f293176b = true;
        aVar6.f293175a = true;
        aVar6.f293183i = C0966R.color.f2947a4;
        aVar6.f293181g = fVar.mo61198x();
        aVar6.f293180f = fVar.mo61199y();
        aVar6.f293185k = new AlphaAnimation(0.0f, 1.0f);
        this.f295305j = aVar6.mo139398a();
        C100075f.C100076a aVar7 = new C100075f.C100076a();
        aVar7.f293176b = true;
        aVar7.f293175a = true;
        aVar7.f293183i = C0966R.color.BW_97;
        C35464c<Integer> cVar = C37521f.f99498r;
        aVar7.f293181g = cVar.mo60266n().intValue();
        C35464c<Integer> cVar2 = C37521f.f99507s;
        aVar7.f293180f = cVar2.mo60266n().intValue();
        aVar7.f293185k = new AlphaAnimation(0.0f, 1.0f);
        this.f295306n = aVar7.mo139398a();
        C100075f.C100076a aVar8 = new C100075f.C100076a();
        aVar8.f293176b = true;
        aVar8.f293175a = true;
        aVar8.f293183i = C0966R.color.f2947a4;
        aVar8.f293181g = cVar.mo60266n().intValue();
        aVar8.f293180f = cVar2.mo60266n().intValue();
        aVar8.f293185k = new AlphaAnimation(0.0f, 1.0f);
        this.f295307o = aVar8.mo139398a();
        C100075f.C100076a aVar9 = new C100075f.C100076a();
        aVar9.f293176b = true;
        aVar9.f293175a = true;
        aVar9.f293183i = C0966R.color.f2947a4;
        aVar9.f293181g = fVar.mo61198x();
        aVar9.f293180f = fVar.mo61199y();
        aVar9.f293185k = new AlphaAnimation(0.0f, 1.0f);
        this.f295308p = aVar9.mo139398a();
        C100075f.C100076a aVar10 = new C100075f.C100076a();
        aVar10.f293176b = true;
        aVar10.f293175a = true;
        aVar10.f293183i = C0966R.color.BW_97;
        aVar10.f293181g = C37521f.f99525u;
        aVar10.f293180f = C37521f.f99534v;
        this.f295309q = aVar10.mo139398a();
        C100075f.C100076a aVar11 = new C100075f.C100076a();
        aVar11.f293176b = true;
        aVar11.f293175a = true;
        aVar11.f293183i = C0966R.color.BW_97;
        aVar11.f293181g = fVar.mo61185k();
        aVar11.f293180f = fVar.mo61184j();
        this.f295310r = aVar11.mo139398a();
        C100075f.C100076a aVar12 = new C100075f.C100076a();
        aVar12.f293176b = true;
        aVar12.f293175a = true;
        aVar12.f293183i = C0966R.color.BW_97;
        Resources resources = MMApplicationContext.getContext().getResources();
        C87412m.m108591d(resources);
        aVar12.f293180f = resources.getDimensionPixelSize(C0966R.dimen.f3763dc);
        Resources resources2 = MMApplicationContext.getContext().getResources();
        C87412m.m108591d(resources2);
        aVar12.f293181g = resources2.getDimensionPixelSize(C0966R.dimen.f3763dc);
        this.f295311s = aVar12.mo139398a();
        C100075f.C100076a aVar13 = new C100075f.C100076a();
        aVar13.f293176b = true;
        aVar13.f293175a = true;
        aVar13.f293183i = C0966R.color.f3579yb;
        Resources resources3 = MMApplicationContext.getContext().getResources();
        C87412m.m108591d(resources3);
        aVar13.f293180f = resources3.getDimensionPixelSize(C0966R.dimen.f3743cv);
        Resources resources4 = MMApplicationContext.getContext().getResources();
        C87412m.m108591d(resources4);
        aVar13.f293181g = resources4.getDimensionPixelSize(C0966R.dimen.f3743cv);
        this.f295312t = aVar13.mo139398a();
        Bitmap decodeResource = C88155a.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.raw.default_avatar, (BitmapFactory.Options) null);
        Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(decodeResource, false, ((float) decodeResource.getWidth()) * 0.5f);
        C100075f.C100076a aVar14 = new C100075f.C100076a();
        aVar14.f293176b = true;
        aVar14.f293175a = true;
        aVar14.f293184j = new BitmapDrawable(roundedCornerBitmap);
        aVar14.f293181g = 132;
        aVar14.f293180f = 132;
        C100075f a2 = aVar14.mo139398a();
        this.f295313u = a2;
        C100075f.C100076a aVar15 = new C100075f.C100076a();
        aVar15.f293176b = true;
        aVar15.f293175a = true;
        aVar15.f293184j = new BitmapDrawable(decodeResource);
        aVar15.f293181g = 132;
        aVar15.f293180f = 132;
        this.f295314v = aVar15.mo139398a();
        C100075f.C100076a aVar16 = new C100075f.C100076a();
        aVar16.f293176b = true;
        aVar16.f293175a = true;
        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.bfa);
        C87412m.m108593f(drawable, "getContext().getResource….drawable.default_avatar)");
        aVar16.f293184j = drawable;
        int i = C37521f.f99525u;
        aVar16.f293181g = i;
        aVar16.f293180f = i;
        C100075f a3 = aVar16.mo139398a();
        this.f295315w = a3;
        C100075f.C100076a aVar17 = new C100075f.C100076a();
        aVar17.f293176b = true;
        aVar17.f293175a = true;
        aVar17.f293183i = C0966R.color.BW_97;
        aVar17.f293181g = 132;
        aVar17.f293180f = 132;
        this.f295316x = aVar17.mo139398a();
        C100070a aVar18 = new C100070a();
        aVar18.f293145c = new C100818v();
        aVar18.f293146d = new C100816r((C62366q) null, 1, (C8480h) null);
        aVar18.f293147e = new C100632a();
        C62371w0 w0Var = C62371w0.BIG;
        aVar18.f293144b = new C100811j(w0Var);
        aVar18.f293148f = new C100813k();
        aVar18.f293143a = a;
        C100071b bVar = new C100071b(aVar18);
        C100070a aVar19 = new C100070a();
        aVar19.f293145c = new C100818v();
        aVar19.f293146d = new C100816r((C62366q) null, 1, (C8480h) null);
        aVar19.f293147e = new C100632a();
        aVar19.f293144b = new C100811j(w0Var);
        aVar19.f293148f = new C100813k();
        aVar19.f293143a = a;
        aVar19.mo139396a(new C100819w());
        new C100071b(aVar19);
        C100070a aVar20 = new C100070a();
        aVar20.f293145c = new C100818v();
        aVar20.f293146d = new C100800a0();
        aVar20.f293147e = new C100632a();
        aVar20.f293144b = new C100811j(w0Var);
        aVar20.f293148f = new C100813k();
        aVar20.f293143a = a;
        C100071b bVar2 = new C100071b(aVar20);
        C100070a aVar21 = new C100070a();
        aVar21.f293145c = new C100818v();
        aVar21.f293146d = new C100800a0();
        aVar21.f293147e = new C100632a();
        C62371w0 w0Var2 = C62371w0.SMALL;
        aVar21.f293144b = new C100811j(w0Var2);
        aVar21.f293143a = a2;
        aVar21.f293148f = new C100813k();
        C101539c cVar3 = new C101539c(true, 0.5f);
        C101536b.C101538b bVar3 = C101536b.C101538b.DECODED;
        cVar3.f297267c = bVar3;
        aVar21.mo139396a(cVar3);
        C100071b bVar4 = new C100071b(aVar21);
        C100070a aVar22 = new C100070a();
        aVar22.f293145c = new C100818v();
        aVar22.f293146d = new C100800a0();
        aVar22.f293147e = new C100632a();
        aVar22.f293144b = new C100811j(w0Var2);
        aVar22.f293143a = a3;
        C101539c cVar4 = new C101539c(true, 0.1f);
        cVar4.f297267c = bVar3;
        aVar22.mo139396a(cVar4);
        C100071b bVar5 = new C100071b(aVar22);
        C100070a aVar23 = new C100070a();
        aVar23.f293145c = new C100818v();
        aVar23.f293146d = new C100800a0();
        aVar23.f293147e = new C100632a();
        aVar23.f293144b = new C100811j(w0Var2);
        aVar23.f293143a = a2;
        aVar23.f293148f = new C100813k();
        C100071b bVar6 = new C100071b(aVar23);
        C100070a aVar24 = new C100070a();
        aVar24.f293145c = new C100818v();
        aVar24.f293146d = new C100800a0();
        aVar24.f293147e = new C100632a();
        aVar24.f293144b = new C100811j(w0Var2);
        aVar24.f293148f = new C100813k();
        aVar24.mo139397b(a);
        C100071b bVar7 = new C100071b(aVar24);
        C100070a aVar25 = new C100070a();
        aVar25.f293145c = new C100818v();
        aVar25.f293146d = new C100816r((C62366q) null, 1, (C8480h) null);
        aVar25.f293147e = new C100632a();
        aVar25.f293144b = new C100811j(w0Var);
        aVar25.f293148f = new C100813k();
        C100815m mVar = new C100815m(25.0f, Integer.valueOf(C0966R.color.UN_BW_0_Alpha_0_2));
        C101536b.C101538b bVar8 = C101536b.C101538b.DOWNLOADED;
        mVar.f297267c = bVar8;
        aVar25.mo139396a(mVar);
        aVar25.mo139397b(a);
        C100071b bVar9 = new C100071b(aVar25);
        C100070a aVar26 = new C100070a();
        aVar26.f293145c = new C100818v();
        C100071b bVar10 = bVar9;
        aVar26.f293146d = new C100816r((C62366q) null, 1, (C8480h) null);
        aVar26.f293147e = new C100632a();
        aVar26.f293144b = new C100811j(w0Var);
        aVar26.f293148f = new C100813k();
        C100815m mVar2 = new C100815m(100.0f, Integer.valueOf(C0966R.color.UN_BW_0_Alpha_0_2));
        mVar2.f297267c = bVar8;
        aVar26.mo139396a(mVar2);
        aVar26.mo139397b(a);
        C100071b bVar11 = new C100071b(aVar26);
        C100070a aVar27 = new C100070a();
        aVar27.f293145c = new C100818v();
        aVar27.f293146d = new C100816r((C62366q) null, 1, (C8480h) null);
        aVar27.f293147e = new C100632a();
        aVar27.f293144b = new C100811j(w0Var);
        aVar27.f293148f = new C100812j0();
        C100814l lVar = new C100814l(20.0f);
        lVar.f297267c = bVar3;
        aVar27.mo139396a(lVar);
        aVar27.mo139397b(a);
        C100071b bVar12 = new C100071b(aVar27);
        C100070a aVar28 = new C100070a();
        aVar28.f293145c = new C100818v();
        aVar28.f293146d = new C100816r((C62366q) null, 1, (C8480h) null);
        aVar28.f293147e = new C100632a();
        aVar28.f293144b = new C100811j(w0Var);
        aVar28.f293148f = new C62373y();
        aVar28.mo139397b(a);
        new C100071b(aVar28);
        C100070a aVar29 = new C100070a();
        aVar29.f293145c = new C100818v();
        aVar29.f293146d = new C100816r(C65460t.f188358b);
        aVar29.f293147e = new C100632a();
        aVar29.f293144b = new C100811j(w0Var);
        aVar29.f293148f = new C100813k();
        aVar29.mo139397b(a);
        C100071b bVar13 = new C100071b(aVar29);
        C100075f.C100076a aVar30 = new C100075f.C100076a();
        aVar30.f293176b = true;
        aVar30.f293175a = true;
        Drawable drawable2 = MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.bpc);
        C87412m.m108593f(drawable2, "getContext().getResource…er_live_shopping_default)");
        aVar30.f293184j = drawable2;
        C32444a aVar31 = C32444a.f86121a;
        aVar30.f293181g = aVar31.mo58622c();
        aVar30.f293180f = aVar31.mo58622c();
        this.f295317y = aVar30.mo139398a();
        C100075f.C100076a aVar32 = new C100075f.C100076a();
        aVar32.f293176b = true;
        aVar32.f293175a = true;
        Drawable drawable3 = MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.f4939ru);
        C87412m.m108593f(drawable3, "getContext().getResource…awable.empty_music_cover)");
        aVar32.f293184j = drawable3;
        aVar32.f293182h = C0966R.C0969drawable.f4939ru;
        aVar32.f293181g = fVar.mo61198x();
        aVar32.f293180f = fVar.mo61199y();
        C100075f a4 = aVar32.mo139398a();
        this.f295318z = a4;
        C100075f.C100076a aVar33 = new C100075f.C100076a();
        aVar33.f293176b = true;
        aVar33.f293175a = true;
        aVar33.f293182h = C0966R.C0969drawable.c2e;
        aVar33.f293181g = fVar.mo61198x();
        aVar33.f293180f = fVar.mo61199y();
        this.f295284A = aVar33.mo139398a();
        C100075f.C100076a aVar34 = new C100075f.C100076a();
        aVar34.f293176b = true;
        aVar34.f293175a = true;
        aVar34.f293182h = C0966R.raw.icons_outlined_star_new;
        aVar34.f293181g = fVar.mo61198x();
        aVar34.f293180f = fVar.mo61199y();
        this.f295285B = aVar34.mo139398a();
        C100070a aVar35 = new C100070a();
        aVar35.f293145c = new C100818v();
        aVar35.f293146d = new C100816r((C62366q) null, 1, (C8480h) null);
        aVar35.f293147e = new C100632a();
        aVar35.f293148f = new C100813k();
        aVar35.f293143a = a4;
        C100071b bVar14 = new C100071b(aVar35);
        C100075f.C100076a aVar36 = new C100075f.C100076a();
        aVar36.f293176b = true;
        aVar36.f293175a = true;
        aVar36.f293183i = C0966R.color.BW_BG_19;
        aVar36.f293181g = fVar.mo61198x();
        aVar36.f293180f = fVar.mo61199y();
        aVar36.f293185k = new AlphaAnimation(0.0f, 1.0f);
        this.f295286C = aVar36.mo139398a();
        C100075f.C100076a aVar37 = new C100075f.C100076a();
        aVar37.f293176b = true;
        aVar37.f293175a = true;
        aVar37.f293182h = C0966R.C0969drawable.a1i;
        aVar37.f293181g = fVar.mo61198x();
        aVar37.f293180f = fVar.mo61199y();
        this.f295287D = aVar37.mo139398a();
        int i2 = C75044y4.m89990b(MMApplicationContext.getContext()).x;
        int i3 = C75044y4.m89990b(MMApplicationContext.getContext()).y;
        C100075f.C100076a aVar38 = new C100075f.C100076a();
        aVar38.f293176b = true;
        aVar38.f293175a = true;
        aVar38.f293181g = i3;
        aVar38.f293180f = i2;
        this.f295288E = aVar38.mo139398a();
        this.f295289F = new C100805c0(bVar);
        this.f295290G = new C100805c0(bVar14);
        this.f295291H = new C100805c0(bVar2);
        this.f295292I = new C100805c0(bVar13);
        this.f295293J = new C100805c0(bVar4);
        this.f295294K = new C100805c0(bVar5);
        this.f295295L = new C100805c0(bVar6);
        this.f295296M = new C100805c0(bVar7);
        this.f295297N = new C100805c0(bVar10);
        this.f295298P = new C100805c0(bVar11);
        this.f295299Q = new C100805c0(bVar12);
    }

    /* renamed from: A2 */
    public C60979d<C100810g0> mo11861A2() {
        return this.f295292I;
    }

    /* renamed from: B1 */
    public C60979d<C100810g0> mo11862B1() {
        return this.f295296M;
    }

    /* renamed from: C */
    public C60979d<C100810g0> mo11863C() {
        return this.f295298P;
    }

    /* renamed from: C1 */
    public void mo11864C1() {
        C101060a aVar = C100802b.f295278c;
    }

    /* renamed from: K1 */
    public C60979d<C100810g0> mo11865K1() {
        return this.f295294K;
    }

    /* renamed from: N0 */
    public C60979d<C100810g0> mo11866N0() {
        return this.f295299Q;
    }

    /* renamed from: O2 */
    public C100075f mo11867O2(C11978e0.C11979a aVar) {
        C87412m.m108594g(aVar, "type");
        switch (aVar.ordinal()) {
            case 0:
                return this.f295301f;
            case 1:
                return this.f295305j;
            case 2:
                return this.f295302g;
            case 3:
                return this.f295303h;
            case 4:
                return this.f295301f;
            case 5:
                return this.f295313u;
            case 6:
                return this.f295314v;
            case 7:
                return this.f295315w;
            case 8:
                return this.f295316x;
            case 9:
                return this.f295311s;
            case 10:
                return this.f295312t;
            case 12:
                return this.f295309q;
            case 13:
                return this.f295310r;
            case 14:
                return this.f295317y;
            case 15:
                return this.f295308p;
            case 16:
                return this.f295284A;
            case 17:
                return this.f295286C;
            case 18:
                return this.f295318z;
            case 19:
                return this.f295287D;
            case 20:
                return this.f295285B;
            case 21:
                return this.f295306n;
            case 22:
                return this.f295307o;
            case 23:
                return this.f295288E;
            case 24:
                return this.f295304i;
            default:
                return this.f295300e;
        }
    }

    /* renamed from: R0 */
    public C60979d<C100810g0> mo11868R0() {
        return this.f295295L;
    }

    /* renamed from: T0 */
    public C60979d<C100810g0> mo11869T0() {
        return this.f295290G;
    }

    /* renamed from: V */
    public C60979d<C100810g0> mo11870V() {
        return this.f295291H;
    }

    /* renamed from: f2 */
    public C60979d<C100810g0> mo11871f2() {
        return this.f295289F;
    }

    /* renamed from: i2 */
    public C60979d<C100810g0> mo11872i2() {
        return this.f295293J;
    }

    /* renamed from: j2 */
    public C60979d<C100810g0> mo11873j2() {
        return this.f295297N;
    }
}
