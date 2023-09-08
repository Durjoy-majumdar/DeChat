package kl2;

import android.view.View;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kl2.C21352g;
import vk2.C111550g;

/* renamed from: kl2.h */
public final class C21354h {

    /* renamed from: a */
    public final C21352g f60393a;

    /* renamed from: b */
    public View f60394b;

    /* renamed from: c */
    public C21349c f60395c;

    /* renamed from: d */
    public C21352g.C21353a f60396d;

    /* renamed from: e */
    public int f60397e;

    /* renamed from: f */
    public float f60398f;

    /* renamed from: g */
    public int f60399g;

    /* renamed from: h */
    public C21355a f60400h = new C21355a();

    /* renamed from: kl2.h$a */
    public static final class C21355a {

        /* renamed from: a */
        public boolean f60401a;

        /* renamed from: b */
        public float f60402b;
    }

    public C21354h(C21352g gVar) {
        C87412m.m108594g(gVar, "ocrViewModel");
        this.f60393a = gVar;
    }

    /* renamed from: a */
    public final boolean mo33422a() {
        return this.f60393a.mo33388e() || this.f60400h.f60401a;
    }

    /* renamed from: b */
    public final void mo33423b(int i) {
        Log.m105927v("MicroMsg.ImageOCRZoomHelper", "alvinluo onZoomStateChanged currentZoomState: %s, target: %s", Integer.valueOf(this.f60397e), Integer.valueOf(i));
        if (this.f60397e != i) {
            this.f60397e = i;
            C111550g a = this.f60393a.mo33384a();
            if (a != null) {
                a.mo151585a(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo33424c(float f, float f2) {
        if (this.f60396d == null) {
            this.f60396d = this.f60393a.mo33391h();
        }
        View view = this.f60394b;
        C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
        C19706a aVar = (C19706a) view;
        float scale = aVar.getScale();
        float scaleRate = aVar.getScaleRate();
        C21352g.C21353a aVar2 = this.f60396d;
        C87412m.m108591d(aVar2);
        C21352g.C21353a aVar3 = this.f60396d;
        C87412m.m108591d(aVar3);
        C21352g.C21353a aVar4 = this.f60396d;
        C87412m.m108591d(aVar4);
        Log.m105925i("MicroMsg.ImageOCRZoomHelper", "alvinluo processZoom currentScale: %s, isLongImage: %s, showDoubleScale: %s, showDefaultScale: %s, scaleRate: %s, centerX: %s, centerY: %s, zoomState: %s", Float.valueOf(scale), Boolean.valueOf(aVar2.f60390a), Float.valueOf(aVar3.f60391b), Float.valueOf(aVar4.f60392c), Float.valueOf(scaleRate), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(this.f60397e));
        C21352g.C21353a aVar5 = this.f60396d;
        C87412m.m108591d(aVar5);
        if (aVar5.f60390a) {
            int i = this.f60397e;
            if (i == 1) {
                C21355a aVar6 = this.f60400h;
                aVar6.getClass();
                C21352g.C21353a aVar7 = this.f60396d;
                C87412m.m108591d(aVar7);
                aVar6.f60402b = aVar7.f60391b;
                aVar6.f60401a = true;
                C21349c cVar = this.f60395c;
                if (cVar != null) {
                    cVar.mo33406b(2);
                }
                C21352g.C21353a aVar8 = this.f60396d;
                C87412m.m108591d(aVar8);
                aVar.mo26071i(aVar8.f60391b, f, f2);
                mo33423b(2);
            } else if (i == 2) {
                C21355a aVar9 = this.f60400h;
                aVar9.getClass();
                C21352g.C21353a aVar10 = this.f60396d;
                C87412m.m108591d(aVar10);
                aVar9.f60402b = aVar10.f60392c;
                aVar9.f60401a = true;
                C21349c cVar2 = this.f60395c;
                if (cVar2 != null) {
                    cVar2.mo33405a(2);
                }
                C21352g.C21353a aVar11 = this.f60396d;
                C87412m.m108591d(aVar11);
                aVar.mo26071i(aVar11.f60392c, f, f2);
                mo33423b(1);
            }
        } else {
            int i2 = this.f60397e;
            if (i2 == 1) {
                float n = aVar.mo26075n(f, f2);
                C21355a aVar12 = this.f60400h;
                aVar12.getClass();
                aVar12.f60402b = n;
                aVar12.f60401a = true;
                C21349c cVar3 = this.f60395c;
                if (cVar3 != null) {
                    cVar3.mo33406b(2);
                }
                mo33423b(2);
            } else if (i2 == 2) {
                C21355a aVar13 = this.f60400h;
                aVar13.getClass();
                C21352g.C21353a aVar14 = this.f60396d;
                C87412m.m108591d(aVar14);
                aVar13.f60402b = aVar14.f60392c;
                aVar13.f60401a = true;
                C21349c cVar4 = this.f60395c;
                if (cVar4 != null) {
                    cVar4.mo33405a(2);
                }
                mo33423b(1);
                C21352g.C21353a aVar15 = this.f60396d;
                C87412m.m108591d(aVar15);
                aVar.mo26071i(aVar15.f60392c, f, f2);
            }
        }
    }
}
