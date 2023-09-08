package kl2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kl2.C21352g;
import ll2.C21441c;
import sk2.C101644d;
import vk2.C111555k;

/* renamed from: kl2.f */
public final class C21351f implements C111555k {

    /* renamed from: d */
    public final Context f60373d;

    /* renamed from: e */
    public final C21352g f60374e;

    /* renamed from: f */
    public C101644d f60375f;

    /* renamed from: g */
    public View f60376g;

    /* renamed from: h */
    public View f60377h;

    /* renamed from: i */
    public int f60378i;

    /* renamed from: j */
    public int f60379j;

    /* renamed from: n */
    public int f60380n;

    /* renamed from: o */
    public int f60381o;

    /* renamed from: p */
    public float f60382p;

    /* renamed from: q */
    public float f60383q;

    /* renamed from: r */
    public C21352g.C21353a f60384r = new C21352g.C21353a();

    /* renamed from: s */
    public C21441c f60385s;

    /* renamed from: t */
    public int f60386t;

    /* renamed from: u */
    public C21441c.C21442a f60387u;

    /* renamed from: v */
    public boolean f60388v;

    /* renamed from: w */
    public boolean f60389w;

    public C21351f(Context context, C21352g gVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(gVar, "ocrViewModel");
        this.f60373d = context;
        this.f60374e = gVar;
        this.f60380n = C75044y4.m89994f(context);
        this.f60381o = context.getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
    }

    /* renamed from: a */
    public void mo33407a() {
        Log.m105926v("MicroMsg.ImageOcrResultDialogMoveListener", "alvinluo onTouchMoveBegin");
        mo33409c();
        this.f60388v = true;
    }

    /* renamed from: b */
    public void mo33408b() {
        Log.m105926v("MicroMsg.ImageOcrResultDialogMoveListener", "alvinluo onTouchMoveEnd");
        this.f60374e.reset();
    }

    /* renamed from: c */
    public void mo33409c() {
        C21441c cVar;
        boolean z = true;
        this.f60389w = true;
        Log.m105927v("MicroMsg.ImageOcrResultDialogMoveListener", "alvinluo onDialogDismissAnimationStart isTouchMoved: %s, isDialogAnimating: %s", Boolean.valueOf(this.f60388v), Boolean.valueOf(this.f60389w));
        if (this.f60388v) {
            this.f60388v = false;
            return;
        }
        C21441c.C21442a aVar = this.f60387u;
        if (!(aVar == null || (cVar = this.f60385s) == null)) {
            cVar.mo33608b(aVar);
        }
        mo33419m(false);
        mo33420n(false);
        if (this.f60386t != 1 || mo33418l()) {
            z = false;
        }
        if (z) {
            int i = this.f60378i;
            View view = this.f60377h;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i;
                } else {
                    layoutParams = null;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33410d(int r12, float r13, float r14) {
        /*
            r11 = this;
            float r14 = r11.f60382p
            float r14 = r14 - r13
            float r14 = java.lang.Math.abs(r14)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r14 = r14 * r0
            float r1 = r11.f60383q
            float r2 = r11.f60382p
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            float r14 = r14 / r1
            r1 = 0
            float r14 = java.lang.Math.max(r14, r1)
            float r14 = java.lang.Math.min(r14, r0)
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MicroMsg.ImageOcrResultDialogMoveListener"
            if (r12 != 0) goto L_0x00dc
            int r5 = r11.f60386t
            if (r5 != r2) goto L_0x0031
            boolean r5 = r11.mo33418l()
            if (r5 != 0) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x00b2
            int r5 = r11.f60378i
            int r6 = r11.mo33416j()
            int r7 = r6 - r5
            float r7 = (float) r7
            float r7 = r7 * r14
            int r7 = (int) r7
            int r7 = r7 + r5
            int r8 = r11.mo33417k()
            int r9 = r11.f60379j
            float r10 = (float) r9
            int r8 = r8 - r9
            float r8 = (float) r8
            float r8 = r8 * r14
            float r10 = r10 + r8
            int r8 = (int) r10
            r11.mo33415i(r8, r7)
            r8 = 9
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r1] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r8[r2] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r5 = 2
            r8[r5] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r5 = 3
            r8[r5] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r14)
            r5 = 4
            r8[r5] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r13)
            r13 = 5
            r8[r13] = r12
            java.lang.Float r12 = java.lang.Float.valueOf(r14)
            r13 = 6
            r8[r13] = r12
            android.view.View r12 = r11.f60377h
            if (r12 == 0) goto L_0x0095
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            if (r12 == 0) goto L_0x0095
            int r12 = r12.width
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0096
        L_0x0095:
            r12 = r3
        L_0x0096:
            r13 = 7
            r8[r13] = r12
            r12 = 8
            android.view.View r13 = r11.f60377h
            if (r13 == 0) goto L_0x00ab
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 == 0) goto L_0x00ab
            int r13 = r13.height
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
        L_0x00ab:
            r8[r12] = r3
            java.lang.String r12 = "alvinluo updateGalleryHeight dialogState: %s, start: %s, end: %s, targetHeight: %s, factor: %s, offsetY: %s, realFactor: %s, gallery: (%s, %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r12, r8)
        L_0x00b2:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Float r13 = java.lang.Float.valueOf(r14)
            r12[r1] = r13
            java.lang.String r13 = "alvinluo onShowDialogMove factor: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r13, r12)
            android.view.View r12 = r11.f60376g
            boolean r12 = r12 instanceof com.tencent.p014mm.p136ui.base.C19706a
            if (r12 == 0) goto L_0x0134
            ll2.c r12 = r11.f60385s
            if (r12 == 0) goto L_0x00d1
            boolean r12 = r12.mo33610e()
            if (r12 != r2) goto L_0x00d1
            r12 = 1
            goto L_0x00d2
        L_0x00d1:
            r12 = 0
        L_0x00d2:
            if (r12 == 0) goto L_0x0134
            ll2.c r12 = r11.f60385s
            if (r12 == 0) goto L_0x0134
            r12.mo33609c(r14)
            goto L_0x0134
        L_0x00dc:
            int r12 = r11.mo33417k()
            int r13 = r11.f60379j
            float r5 = (float) r13
            int r12 = r12 - r13
            float r12 = (float) r12
            float r12 = r12 * r14
            float r5 = r5 + r12
            int r12 = r11.f60386t
            if (r12 != r2) goto L_0x00f4
            boolean r12 = r11.mo33418l()
            if (r12 != 0) goto L_0x00f4
            r12 = 1
            goto L_0x00f5
        L_0x00f4:
            r12 = 0
        L_0x00f5:
            if (r12 == 0) goto L_0x0109
            int r12 = (int) r5
            android.view.View r13 = r11.f60377h
            if (r13 != 0) goto L_0x00fd
            goto L_0x0109
        L_0x00fd:
            android.view.ViewGroup$LayoutParams r5 = r13.getLayoutParams()
            if (r5 == 0) goto L_0x0106
            r5.width = r12
            r3 = r5
        L_0x0106:
            r13.setLayoutParams(r3)
        L_0x0109:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Float r13 = java.lang.Float.valueOf(r14)
            r12[r1] = r13
            java.lang.String r13 = "alvinluo onDismissDialogMove factor: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r4, r13, r12)
            android.view.View r12 = r11.f60376g
            boolean r12 = r12 instanceof com.tencent.p014mm.p136ui.base.C19706a
            if (r12 == 0) goto L_0x0134
            ll2.c r12 = r11.f60385s
            if (r12 == 0) goto L_0x0128
            boolean r12 = r12.mo33610e()
            if (r12 != r2) goto L_0x0128
            r12 = 1
            goto L_0x0129
        L_0x0128:
            r12 = 0
        L_0x0129:
            if (r12 == 0) goto L_0x0134
            ll2.c r12 = r11.f60385s
            if (r12 == 0) goto L_0x0134
            float r13 = r0 - r14
            r12.mo33607a(r13)
        L_0x0134:
            int r12 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r12 < 0) goto L_0x013e
            r11.mo33420n(r2)
            r11.f60388v = r1
            goto L_0x0141
        L_0x013e:
            r11.mo33420n(r1)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kl2.C21351f.mo33410d(int, float, float):void");
    }

    /* renamed from: e */
    public void mo33411e() {
        Log.m105926v("MicroMsg.ImageOcrResultDialogMoveListener", "alvinluo onDialogDismissAnimationEnd");
        this.f60389w = false;
        mo33419m(true);
        View view = this.f60376g;
        if (view instanceof C19706a) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((C19706a) view).mo26074m();
        }
        View view2 = this.f60376g;
        if (view2 instanceof WxImageView) {
            C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((WxImageView) view2).setAllowInterceptTouchEvent(true);
        }
        View view3 = this.f60376g;
        if (view3 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ocr/ImageOCRResultDialogMoveListener", "onDialogDismissAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/ocr/ImageOCRResultDialogMoveListener", "onDialogDismissAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (this.f60386t == 1 && mo33418l() && (this.f60376g instanceof C19706a)) {
            mo33415i(this.f60378i, this.f60379j);
            View view5 = this.f60376g;
            C87412m.m108592e(view5, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((C19706a) view5).mo26059d();
        }
    }

    /* renamed from: f */
    public void mo33412f(int i, float f, float f2) {
        this.f60389w = true;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Float.valueOf(f);
        objArr[2] = Float.valueOf(f2);
        objArr[3] = Integer.valueOf(this.f60380n);
        C101644d dVar = this.f60375f;
        objArr[4] = dVar != null ? Boolean.valueOf(dVar.f297530a) : null;
        Log.m105925i("MicroMsg.ImageOcrResultDialogMoveListener", "alvinluo onDialogShowAnimationStart dialogHeight: %s, startTransY: %s, endTransY: %s, statusBarHeight: %s, enableFullScreen: %s", objArr);
        this.f60382p = f;
        this.f60383q = f2;
        mo33419m(false);
        C21441c.C21442a aVar = new C21441c.C21442a();
        aVar.f60680a = this.f60376g;
        aVar.f60682c.set((float) this.f60379j, (float) this.f60378i);
        aVar.f60683d.set((float) mo33417k(), (float) mo33416j());
        this.f60387u = aVar;
        C21441c cVar = this.f60385s;
        if (cVar != null) {
            cVar.mo33606d(aVar);
        }
        C21352g.C21353a aVar2 = this.f60384r;
        C21441c.C21442a aVar3 = this.f60387u;
        C87412m.m108591d(aVar3);
        aVar2.f60390a = aVar3.f60681b;
        C21441c.C21442a aVar4 = this.f60387u;
        C87412m.m108591d(aVar4);
        aVar2.f60392c = aVar4.f60685f.f60686a.x;
        C21441c.C21442a aVar5 = this.f60387u;
        C87412m.m108591d(aVar5);
        if (aVar5.f60681b && (this.f60376g instanceof C19706a)) {
            View view = this.f60376g;
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            aVar2.f60391b = (((float) mo33417k()) * 1.0f) / ((float) ((C19706a) view).getImageWidth());
        }
        Log.m105925i("MicroMsg.ImageOcrResultDialogMoveListener", "alvinluo onDialogShowAnimationStart isLongImage: %s, showDefaultScale: %s, showDoubleScale: %s", Boolean.valueOf(this.f60384r.f60390a), Float.valueOf(this.f60384r.f60392c), Float.valueOf(this.f60384r.f60391b));
        mo33421o();
        mo33414h();
        View view2 = this.f60376g;
        if (view2 instanceof WxImageView) {
            C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((WxImageView) view2).setAllowInterceptTouchEvent(false);
        }
    }

    /* renamed from: g */
    public void mo33413g() {
        this.f60389w = false;
        if (this.f60386t == 1 && mo33418l()) {
            mo33420n(true);
        }
    }

    /* renamed from: h */
    public final void mo33414h() {
        View view = this.f60376g;
        if (view instanceof WxImageView) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            if (((WxImageView) view).getMinScale() > this.f60384r.f60392c) {
                View view2 = this.f60376g;
                C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
                ((WxImageView) view2).setMinScale(this.f60384r.f60392c);
            }
        }
    }

    /* renamed from: i */
    public final void mo33415i(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f60377h;
        if (view != null) {
            if (view == null || (layoutParams = view.getLayoutParams()) == null) {
                layoutParams = null;
            } else {
                layoutParams.width = i;
                layoutParams.height = i2;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: j */
    public final int mo33416j() {
        C101644d dVar = this.f60375f;
        return (int) (dVar != null ? dVar.f297530a : true ? this.f60383q + ((float) this.f60380n) : this.f60383q);
    }

    /* renamed from: k */
    public final int mo33417k() {
        return this.f60379j - (this.f60381o * 2);
    }

    /* renamed from: l */
    public final boolean mo33418l() {
        return this.f60373d.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: m */
    public final void mo33419m(boolean z) {
        Log.m105925i("MicroMsg.ImageOcrResultDialogMoveListener", "alvinluo setCanRefresh %b, view: %s", Boolean.valueOf(z), this.f60376g);
        View view = this.f60376g;
        if (view instanceof C19706a) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((C19706a) view).setCanRefresh(z);
        }
    }

    /* renamed from: n */
    public final void mo33420n(boolean z) {
        this.f60374e.mo33389f(z);
    }

    /* renamed from: o */
    public final void mo33421o() {
        View view = this.f60376g;
        if ((view instanceof C19706a) && this.f60386t == 1) {
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((C19706a) view).setCustomScaleRate(Float.valueOf(this.f60384r.f60392c));
        }
    }
}
