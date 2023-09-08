package rr2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import cq3.C106952a;
import di3.C86312j;
import eq3.C107287c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import lh2.C99417a;
import me3.C109612c;
import me3.C109623f;
import p248ug.C111159e;
import p248ug.C111164r0;
import p511ew.C58849b;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zp3.C112660e0;

/* renamed from: rr2.e */
public final class C101447e extends C99417a {

    /* renamed from: f */
    public final C13601g f297105f = C36568h.m40985a(new C101449b(this));

    /* renamed from: g */
    public final C13601g f297106g = C36568h.m40985a(C101450c.f297116d);

    /* renamed from: h */
    public C109623f f297107h;

    /* renamed from: i */
    public final C13601g f297108i = C36568h.m40985a(new C101448a(this));

    /* renamed from: j */
    public int f297109j;

    /* renamed from: n */
    public int f297110n;

    /* renamed from: o */
    public int f297111o;

    /* renamed from: p */
    public C106952a f297112p;

    /* renamed from: q */
    public Bitmap f297113q;

    /* renamed from: rr2.e$a */
    public static final class C101448a extends C87413o implements C32224a<Context> {

        /* renamed from: d */
        public final /* synthetic */ C101447e f297114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101448a(C101447e eVar) {
            super(0);
            this.f297114d = eVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$context$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$context$2");
            C101447e eVar = this.f297114d;
            SnsMethodCalculate.markStartTimeMs("access$getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            FrameLayout y = eVar.mo140951y();
            SnsMethodCalculate.markEndTimeMs("access$getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            Context context = y.getContext();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$context$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$context$2");
            return context;
        }
    }

    /* renamed from: rr2.e$b */
    public static final class C101449b extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C101447e f297115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101449b(C101447e eVar) {
            super(0);
            this.f297115d = eVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$parentLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$parentLayout$2");
            C101447e eVar = this.f297115d;
            SnsMethodCalculate.markStartTimeMs("access$getView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            View w = eVar.mo138857w(C0966R.C0970id.bv6);
            SnsMethodCalculate.markEndTimeMs("access$getView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            FrameLayout frameLayout = (FrameLayout) w;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$parentLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$parentLayout$2");
            return frameLayout;
        }
    }

    /* renamed from: rr2.e$c */
    public static final class C101450c extends C87413o implements C32224a<C111164r0> {

        /* renamed from: d */
        public static final C101450c f297116d = new C101450c();

        public C101450c() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$photoEditor$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$photoEditor$2");
            C111164r0 ZD = ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$photoEditor$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$photoEditor$2");
            return ZD;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101447e(C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(eVar, "status");
    }

    /* renamed from: x */
    public static final /* synthetic */ C106952a m133156x(C101447e eVar) {
        SnsMethodCalculate.markStartTimeMs("access$getBoardView$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        C106952a aVar = eVar.f297112p;
        SnsMethodCalculate.markEndTimeMs("access$getBoardView$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return aVar;
    }

    public void release() {
        SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        C109623f fVar = this.f297107h;
        if (fVar != null) {
            ((C109612c) fVar).mo160828l();
        }
        SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0048, code lost:
        if (r7.getHeight() > r5) goto L_0x004a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78575v(com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r13) {
        /*
            r12 = this;
            java.lang.String r0 = "initLogic"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "configProvider"
            gy3.C87412m.m108594g(r13, r2)
            com.tencent.mm.modelcontrol.VideoTransPara r2 = r13.f272926n
            int r3 = r2.f267166d
            r12.f297109j = r3
            int r2 = r2.f267167e
            r12.f297110n = r2
            java.lang.String r13 = r13.f272903D
            java.lang.String r2 = "loadImageBitmap"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.String r3 = "decodeSourceImg"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            int r4 = r12.f297109j
            int r5 = r12.f297110n
            r6 = 1
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r13, r4, r5, r6)
            r12.f297113q = r4
            if (r4 == 0) goto L_0x0067
            int r5 = com.tencent.p014mm.sdk.platformtools.ForceGpuUtil.getMaxTextureSize()
            android.graphics.Bitmap r7 = r12.f297113q
            gy3.C87412m.m108591d(r7)
            int r7 = r7.getWidth()
            if (r7 > r5) goto L_0x004a
            android.graphics.Bitmap r7 = r12.f297113q
            gy3.C87412m.m108591d(r7)
            int r7 = r7.getHeight()
            if (r7 <= r5) goto L_0x0067
        L_0x004a:
            android.graphics.Bitmap r4 = r12.f297113q
            gy3.C87412m.m108591d(r4)
            int r7 = r4.getWidth()
            if (r5 <= r7) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r7 = r5
        L_0x0057:
            android.graphics.Bitmap r8 = r12.f297113q
            gy3.C87412m.m108591d(r8)
            int r8 = r8.getHeight()
            if (r5 <= r8) goto L_0x0063
            r5 = r8
        L_0x0063:
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(r4, r7, r5, r6)
        L_0x0067:
            int r13 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r13)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "getExifOrientation degree:"
            r5.append(r7)
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "MicroMsg.SnsCoverEffectImagePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r13 != 0) goto L_0x0086
            goto L_0x008b
        L_0x0086:
            float r13 = (float) r13
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(r4, r13, r5, r5)
        L_0x008b:
            r12.f297113q = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            if (r4 == 0) goto L_0x0154
            int r13 = r4.getHeight()
            float r13 = (float) r13
            float r13 = r13 * r5
            int r3 = r4.getWidth()
            float r3 = (float) r3
            float r13 = r13 / r3
            r3 = 1071877689(0x3fe38e39, float:1.7777778)
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0147
            int r13 = r4.getWidth()
            int r7 = r4.getHeight()
            java.lang.String r8 = "calculateTargetSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r1)
            float r9 = (float) r13
            float r10 = r9 * r5
            float r11 = (float) r7
            float r10 = r10 / r11
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d3
            int r5 = r12.f297109j
            if (r7 >= r5) goto L_0x00c7
            r12.f297109j = r7
            float r5 = r11 * r3
            int r5 = (int) r5
            r12.f297110n = r5
        L_0x00c7:
            float r11 = r11 * r3
            int r3 = (int) r11
            gj.f0 r5 = new gj.f0
            r5.<init>(r13, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r1)
            goto L_0x00f4
        L_0x00d3:
            float r11 = r11 * r5
            float r11 = r11 / r9
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ec
            int r5 = r12.f297109j
            if (r13 >= r5) goto L_0x00e0
            r12.f297109j = r13
        L_0x00e0:
            gj.f0 r5 = new gj.f0
            float r9 = r9 * r3
            int r3 = (int) r9
            r5.<init>(r13, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r1)
            goto L_0x00f4
        L_0x00ec:
            gj.f0 r5 = new gj.f0
            r5.<init>(r13, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r1)
        L_0x00f4:
            android.graphics.Rect r13 = new android.graphics.Rect
            r3 = 0
            int r7 = r5.f27284b
            int r8 = r4.getHeight()
            int r7 = r7 - r8
            int r7 = r7 / 2
            int r8 = r5.f27283a
            int r9 = r5.f27284b
            int r10 = r4.getHeight()
            int r10 = r9 - r10
            int r10 = r10 / 2
            int r9 = r9 - r10
            r13.<init>(r3, r7, r8, r9)
            int r3 = r5.f27284b
            int r7 = r4.getHeight()
            int r3 = r3 - r7
            r12.f297111o = r3
            int r3 = r5.f27283a
            int r5 = r5.f27284b
            java.lang.String r7 = "blurBitmap"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r1)
            vp3.b r8 = new vp3.b
            r8.<init>()
            vp3.c r9 = r8.f189366e
            vp3.l r9 = r9.f334049r
            r9.f334062b = r6
            r8.mo89891b(r4)
            r8.f189363b = r3
            r8.f189364c = r5
            vp3.c r3 = r8.f189366e
            com.tencent.mm.xeffect.effect.EffectManager r3 = r3.f334033b
            r3.mo154924d()
            rr2.d r3 = new rr2.d
            r3.<init>(r12, r13)
            r8.mo89890a(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r1)
            goto L_0x0154
        L_0x0147:
            java.lang.String r13 = "setup$default"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r1)
            r3 = 0
            r12.mo140952z(r4, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r1)
        L_0x0154:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rr2.C101447e.mo78575v(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    /* renamed from: y */
    public final FrameLayout mo140951y() {
        SnsMethodCalculate.markStartTimeMs("getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        FrameLayout frameLayout = (FrameLayout) ((C36570n) this.f297105f).getValue();
        SnsMethodCalculate.markEndTimeMs("getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return frameLayout;
    }

    /* renamed from: z */
    public final void mo140952z(Bitmap bitmap, Rect rect) {
        SnsMethodCalculate.markStartTimeMs("setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        if (bitmap == null) {
            SnsMethodCalculate.markEndTimeMs("setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        SnsMethodCalculate.markEndTimeMs("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        C111164r0.C111165a aVar = new C111164r0.C111165a();
        aVar.f332925b = false;
        aVar.f332926c = false;
        aVar.f332928e = new Rect(mo140951y().getLeft(), mo140951y().getTop(), mo140951y().getRight(), mo140951y().getBottom());
        aVar.f332924a = C111164r0.C111166b.PHOTO;
        aVar.f332929f = false;
        aVar.f332932i = bitmap;
        ((C111164r0) ((C36570n) this.f297106g).getValue()).mo162895d(aVar);
        SnsMethodCalculate.markStartTimeMs("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        SnsMethodCalculate.markEndTimeMs("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        C111159e c = ((C111164r0) ((C36570n) this.f297106g).getValue()).mo162894c((Context) ((C36570n) this.f297108i).getValue());
        C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
        C112660e0 e0Var = (C112660e0) c;
        C106952a baseBoardView = e0Var.getBaseBoardView();
        this.f297112p = baseBoardView;
        baseBoardView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        baseBoardView.setValidImageRect(rect);
        C107287c cVar = (C107287c) e0Var.getBaseFooterView();
        if (cVar != null) {
            cVar.setHideFooter(true);
        }
        this.f297107h = e0Var.getPresenter();
        mo140951y().addView(e0Var, new FrameLayout.LayoutParams(-1, -1));
        SnsMethodCalculate.markEndTimeMs("setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }
}
