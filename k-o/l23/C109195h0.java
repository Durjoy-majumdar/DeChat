package l23;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.vlog.model.C106193d0;
import com.tencent.p014mm.plugin.vlog.model.C106204p;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import d23.C106976a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import l23.C109202j;
import n23.C109676b;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: l23.h0 */
public final class C109195h0 implements C109215k0, C109202j.C109204c {

    /* renamed from: d */
    public final C109216l0 f326932d;

    /* renamed from: e */
    public final String f326933e = "MicroMsg.MultiVideoPreview";

    /* renamed from: f */
    public final View f326934f;

    /* renamed from: g */
    public C106205q0 f326935g;

    /* renamed from: h */
    public C96552p0 f326936h;

    /* renamed from: i */
    public final RectF f326937i;

    /* renamed from: j */
    public final RectF f326938j;

    /* renamed from: n */
    public boolean f326939n;

    /* renamed from: o */
    public boolean f326940o;

    /* renamed from: p */
    public C109202j.C99301e f326941p;

    /* renamed from: q */
    public final Runnable f326942q;

    /* renamed from: r */
    public final C109196a f326943r;

    /* renamed from: s */
    public final C109200e f326944s;

    /* renamed from: l23.h0$f */
    public static final class C61203f extends C87413o implements C32226l<Matrix, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ boolean f174238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61203f(boolean z) {
            super(1);
            this.f174238d = z;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((Matrix) obj, LocaleUtil.ITALIAN);
            return Boolean.valueOf(this.f174238d);
        }
    }

    /* renamed from: l23.h0$a */
    public static final class C109196a implements CropLayout.C106805c {

        /* renamed from: a */
        public float f326945a = 1.0f;

        /* renamed from: b */
        public final /* synthetic */ C109195h0 f326946b;

        public C109196a(C109195h0 h0Var) {
            this.f326946b = h0Var;
        }

        /* renamed from: a */
        public void mo154489a() {
            String str = this.f326946b.f326933e;
            StringBuilder sb = new StringBuilder();
            sb.append("onChangeEnd: audioSeekable:");
            C109202j.C99301e eVar = this.f326946b.f326941p;
            boolean z = false;
            sb.append(eVar != null ? eVar.hashCode() : 0);
            Log.m105924i(str, sb.toString());
            this.f326946b.f326932d.mo160466d();
            C106205q0 q0Var = this.f326946b.f326935g;
            if (q0Var != null) {
                if (this.f326945a == C106193d0.m142869a(q0Var.f316498i.f316483a)) {
                    z = true;
                }
                if (!z) {
                    q0Var.f316500k.scaleCount++;
                } else {
                    q0Var.f316500k.dragCount++;
                }
            }
            C61926c.m72667L(3000, this.f326946b.f326942q);
        }

        /* renamed from: b */
        public void mo154490b() {
            C106204p pVar;
            Matrix matrix;
            String str = this.f326946b.f326933e;
            StringBuilder sb = new StringBuilder();
            sb.append("onChangeStart: audioSeekable:");
            C109202j.C99301e eVar = this.f326946b.f326941p;
            sb.append(eVar != null ? eVar.hashCode() : 0);
            Log.m105924i(str, sb.toString());
            this.f326946b.f326932d.getVideoView().pause();
            C109202j.C99301e eVar2 = this.f326946b.f326941p;
            if (eVar2 != null) {
                eVar2.pause();
            }
            C106205q0 q0Var = this.f326946b.f326935g;
            this.f326945a = (q0Var == null || (pVar = q0Var.f316498i) == null || (matrix = pVar.f316483a) == null) ? 1.0f : C106193d0.m142869a(matrix);
            C61926c.m72698w(this.f326946b.f326942q);
            this.f326946b.f326932d.mo160463a().mo151290e();
        }

        public void onChange() {
            String str = this.f326946b.f326933e;
            Log.m105924i(str, "onChange: " + this.f326946b.f326932d.mo160467e().getContentRect());
            if (!this.f326946b.f326932d.mo160467e().getContentRect().isEmpty()) {
                C109195h0 h0Var = this.f326946b;
                C106205q0 q0Var = h0Var.f326935g;
                if (q0Var != null) {
                    q0Var.f316498i.f316486d.set(h0Var.f326932d.mo160467e().getContentRect());
                    q0Var.f316501l.f331474l.set(h0Var.f326932d.mo160467e().getContentRect());
                    Rect rect = q0Var.f316498i.f316486d;
                    RectF rectF = h0Var.f326937i;
                    rect.offset(-((int) rectF.left), -((int) rectF.top));
                    Rect rect2 = q0Var.f316501l.f331474l;
                    RectF rectF2 = h0Var.f326937i;
                    rect2.offset(-((int) rectF2.left), -((int) rectF2.top));
                    C106204p pVar = q0Var.f316498i;
                    pVar.f316484b.set(pVar.f316486d);
                }
                if (!this.f326946b.f326932d.getVideoView().isPlaying()) {
                    this.f326946b.f326932d.getVideoView().mo154755e();
                }
            }
        }
    }

    /* renamed from: l23.h0$b */
    public static final class C109197b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109195h0 f326947d;

        public C109197b(C109195h0 h0Var) {
            this.f326947d = h0Var;
        }

        public final void run() {
            C109195h0 h0Var = this.f326947d;
            if (!h0Var.f326940o) {
                h0Var.f326932d.mo160463a().mo151288b();
            }
        }
    }

    /* renamed from: l23.h0$c */
    public static final class C109198c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C109195h0 f326948d;

        /* renamed from: e */
        public final /* synthetic */ C106205q0 f326949e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109198c(C109195h0 h0Var, C106205q0 q0Var) {
            super(0);
            this.f326948d = h0Var;
            this.f326949e = q0Var;
        }

        public Object invoke() {
            C109195h0 h0Var = this.f326948d;
            h0Var.f326935g = this.f326949e;
            h0Var.mo160439g();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: l23.h0$d */
    public static final class C109199d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109195h0 f326950d;

        public C109199d(C109195h0 h0Var) {
            this.f326950d = h0Var;
        }

        public final void run() {
            WxCropOperationLayout.m142543d(this.f326950d.f326932d.mo160463a(), 0, 0, 2, (Object) null);
        }
    }

    /* renamed from: l23.h0$e */
    public static final class C109200e implements WxCropOperationLayout.C105987g {

        /* renamed from: a */
        public final /* synthetic */ C109195h0 f326951a;

        public C109200e(C109195h0 h0Var) {
            this.f326951a = h0Var;
        }

        /* renamed from: a */
        public void mo151325a(boolean z) {
            C61926c.m72667L(3000, this.f326951a.f326942q);
        }

        /* renamed from: b */
        public void mo151326b(boolean z) {
            C61926c.m72698w(this.f326951a.f326942q);
            this.f326951a.f326932d.mo160463a().mo151290e();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0132, code lost:
            r1 = r1.f316498i;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo151327c(android.graphics.RectF r14) {
            /*
                r13 = this;
                java.lang.String r0 = "rectF"
                gy3.C87412m.m108594g(r14, r0)
                l23.h0 r0 = r13.f326951a
                android.graphics.RectF r0 = r0.f326938j
                r0.set(r14)
                l23.h0 r0 = r13.f326951a
                java.lang.String r0 = r0.f326933e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "operationCallback onChange:"
                r1.append(r2)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                l23.h0 r0 = r13.f326951a
                com.tencent.mm.plugin.vlog.model.p0 r1 = r0.f326936h
                r2 = 0
                if (r1 == 0) goto L_0x012c
                java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r1 = r1.f282570c
                if (r1 == 0) goto L_0x012c
                java.util.Iterator r1 = r1.iterator()
            L_0x0033:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x012c
                java.lang.Object r3 = r1.next()
                com.tencent.mm.plugin.vlog.model.q0 r3 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r3
                com.tencent.mm.plugin.vlog.model.p r4 = r3.f316498i
                android.graphics.Rect r5 = r4.f316484b
                r14.round(r5)
                android.graphics.Rect r5 = r4.f316484b
                android.graphics.RectF r6 = r0.f326937i
                float r7 = r6.left
                int r7 = (int) r7
                int r7 = -r7
                float r6 = r6.top
                int r6 = (int) r6
                int r6 = -r6
                r5.offset(r7, r6)
                com.tencent.mm.plugin.vlog.model.q0 r5 = r0.f326935g
                boolean r5 = gy3.C87412m.m108589b(r5, r3)
                if (r5 != 0) goto L_0x0033
                boolean r5 = r0.f326940o
                if (r5 == 0) goto L_0x0062
                goto L_0x0033
            L_0x0062:
                android.graphics.Rect r5 = r4.f316486d
                android.graphics.RectF r6 = r0.f326937i
                float r6 = r6.top
                int r6 = (int) r6
                r5.offset(r2, r6)
                float r5 = r14.bottom
                android.graphics.Rect r6 = r4.f316486d
                int r7 = r6.bottom
                float r7 = (float) r7
                float r5 = r5 - r7
                float r7 = r14.top
                int r6 = r6.top
                float r6 = (float) r6
                float r7 = r7 - r6
                r6 = 0
                int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r8 > 0) goto L_0x0096
                int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r8 >= 0) goto L_0x0084
                goto L_0x0096
            L_0x0084:
                com.tencent.mm.plugin.vlog.model.p r4 = r3.f316498i
                android.graphics.Rect r4 = r4.f316486d
                android.graphics.RectF r5 = r0.f326937i
                float r6 = r5.left
                int r6 = (int) r6
                int r6 = -r6
                float r5 = r5.top
                int r5 = (int) r5
                int r5 = -r5
                r4.offset(r6, r5)
                goto L_0x0106
            L_0x0096:
                android.graphics.Matrix r8 = new android.graphics.Matrix
                r8.<init>()
                android.graphics.RectF r9 = new android.graphics.RectF
                android.graphics.Rect r10 = r4.f316486d
                r9.<init>(r10)
                float r10 = r14.height()
                float r11 = r9.height()
                float r10 = r10 / r11
                r11 = 1065353216(0x3f800000, float:1.0)
                int r12 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                if (r12 >= 0) goto L_0x00b9
                int r10 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r10 >= 0) goto L_0x00b6
                r5 = r7
            L_0x00b6:
                r10 = 1065353216(0x3f800000, float:1.0)
                goto L_0x00c2
            L_0x00b9:
                float r5 = r14.centerY()
                float r7 = r9.centerY()
                float r5 = r5 - r7
            L_0x00c2:
                r8.postTranslate(r6, r5)
                float r5 = r14.centerX()
                float r6 = r14.centerY()
                r8.postScale(r10, r10, r5, r6)
                r8.mapRect(r9)
                android.graphics.Rect r5 = r4.f316486d
                r9.round(r5)
                sp3.c r5 = r3.f316501l
                android.graphics.Rect r5 = r5.f331474l
                r9.round(r5)
                com.tencent.mm.plugin.vlog.model.p r5 = r3.f316498i
                android.graphics.Rect r5 = r5.f316486d
                android.graphics.RectF r6 = r0.f326937i
                float r7 = r6.left
                int r7 = (int) r7
                int r7 = -r7
                float r6 = r6.top
                int r6 = (int) r6
                int r6 = -r6
                r5.offset(r7, r6)
                sp3.c r5 = r3.f316501l
                android.graphics.Rect r5 = r5.f331474l
                android.graphics.RectF r6 = r0.f326937i
                float r7 = r6.left
                int r7 = (int) r7
                int r7 = -r7
                float r6 = r6.top
                int r6 = (int) r6
                int r6 = -r6
                r5.offset(r7, r6)
                android.graphics.Matrix r4 = r4.f316483a
                r4.postConcat(r8)
            L_0x0106:
                java.lang.String r4 = r0.f326933e
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "operationCallback track info, id:"
                r5.append(r6)
                int r6 = r3.f316493d
                r5.append(r6)
                java.lang.String r6 = ", contentRect:"
                r5.append(r6)
                com.tencent.mm.plugin.vlog.model.p r3 = r3.f316498i
                android.graphics.Rect r3 = r3.f316486d
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                goto L_0x0033
            L_0x012c:
                l23.h0 r0 = r13.f326951a
                com.tencent.mm.plugin.vlog.model.q0 r1 = r0.f326935g
                if (r1 == 0) goto L_0x0139
                com.tencent.mm.plugin.vlog.model.p r1 = r1.f316498i
                if (r1 == 0) goto L_0x0139
                android.graphics.Rect r1 = r1.f316486d
                goto L_0x013a
            L_0x0139:
                r1 = 0
            L_0x013a:
                if (r1 == 0) goto L_0x014c
                l23.l0 r0 = r0.f326932d
                com.tencent.mm.ui.widget.cropview.CropLayout r0 = r0.mo160467e()
                android.graphics.Rect r0 = r0.getContentRect()
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0157
            L_0x014c:
                l23.h0 r0 = r13.f326951a
                l23.l0 r0 = r0.f326932d
                com.tencent.mm.ui.widget.cropview.CropLayout r0 = r0.mo160467e()
                r0.mo152391w(r14, r2)
            L_0x0157:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l23.C109195h0.C109200e.mo151327c(android.graphics.RectF):void");
        }
    }

    public C109195h0(C109216l0 l0Var) {
        C87412m.m108594g(l0Var, "provider");
        this.f326932d = l0Var;
        this.f326934f = new View(l0Var.mo160464b().getContext());
        this.f326937i = new RectF();
        this.f326938j = new RectF();
        this.f326942q = new C109197b(this);
        this.f326943r = new C109196a(this);
        this.f326944s = new C109200e(this);
    }

    /* renamed from: a */
    public void mo160435a() {
        C106976a aVar = C106976a.f320208a;
        C106205q0 q0Var = this.f326935g;
        this.f326932d.mo160465c().setText(C109676b.f328306a.mo160901b(aVar.mo157399c(q0Var != null ? q0Var.f316490a : null)));
    }

    /* renamed from: b */
    public WxCropOperationLayout.C105987g mo160436b() {
        return this.f326944s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        r11 = r11.f320221a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138712c(long r10) {
        /*
            r9 = this;
            boolean r0 = r9.f326939n
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.tencent.mm.plugin.vlog.model.p0 r0 = r9.f326936h
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0039
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r0 = r0.f282570c
            if (r0 == 0) goto L_0x0039
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0035
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.tencent.mm.plugin.vlog.model.q0 r5 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r5
            sp3.c r5 = r5.f316501l
            long r6 = r5.f331464b
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 > 0) goto L_0x0031
            long r5 = r5.f331465c
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r5 == 0) goto L_0x0014
            goto L_0x0036
        L_0x0035:
            r4 = r3
        L_0x0036:
            com.tencent.mm.plugin.vlog.model.q0 r4 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r4
            goto L_0x003a
        L_0x0039:
            r4 = r3
        L_0x003a:
            com.tencent.mm.plugin.vlog.model.q0 r10 = r9.f326935g
            boolean r10 = gy3.C87412m.m108589b(r4, r10)
            if (r10 != 0) goto L_0x007a
            d23.a r10 = d23.C106976a.f320208a
            d23.a$b r11 = d23.C106976a.f320213f
            if (r11 == 0) goto L_0x004f
            rr3.m r11 = r11.f320221a
            if (r11 == 0) goto L_0x004f
            long r5 = r11.f330967a
            goto L_0x0051
        L_0x004f:
            r5 = -1
        L_0x0051:
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            if (r1 == 0) goto L_0x0072
            if (r4 == 0) goto L_0x005f
            java.lang.String r3 = r4.f316490a
        L_0x005f:
            int r10 = r10.mo157399c(r3)
            l23.l0 r11 = r9.f326932d
            android.widget.TextView r11 = r11.mo160465c()
            n23.b r0 = n23.C109676b.f328306a
            java.lang.String r10 = r0.mo160901b(r10)
            r11.setText(r10)
        L_0x0072:
            l23.h0$c r10 = new l23.h0$c
            r10.<init>(r9, r4)
            o40.C61926c.m72668M(r10)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l23.C109195h0.mo138712c(long):void");
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
    }

    /* renamed from: e */
    public Rect mo160437e() {
        Rect rect = new Rect();
        this.f326932d.mo160467e().getVisibilityRect().round(rect);
        RectF rectF = this.f326937i;
        rect.offset(-((int) rectF.left), -((int) rectF.top));
        return rect;
    }

    /* renamed from: f */
    public void mo160438f(C96552p0 p0Var, boolean z, boolean z2, long j) {
        C87412m.m108594g(p0Var, "composition");
        String str = this.f326933e;
        Log.m105924i(str, "onUpdate: playRange:" + p0Var.mo134614k() + ", trackList.size:" + p0Var.f282570c.size() + ", playAfterUpdate:" + z);
        VideoCompositionPlayView videoView = this.f326932d.getVideoView();
        if (!C87412m.m108589b(videoView.getParent(), this.f326932d.mo160464b())) {
            ViewParent parent = videoView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(videoView);
            }
            videoView.setScaleX(1.0f);
            videoView.setScaleY(1.0f);
            videoView.setTranslationX(0.0f);
            videoView.setTranslationY(0.0f);
            String str2 = this.f326933e;
            Log.m105924i(str2, "videoView size width:" + this.f326937i.width() + " height:" + this.f326937i.height());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) this.f326937i.width(), (int) this.f326937i.height());
            layoutParams.topMargin = (int) this.f326937i.top;
            layoutParams.addRule(14);
            this.f326932d.mo160464b().addView(videoView, 0, layoutParams);
        }
        if (!this.f326940o) {
            this.f326932d.mo160467e().getVisibilityRect().set(this.f326938j);
            this.f326932d.mo160463a().getVisibilityRect().set(this.f326938j);
        }
        this.f326936h = p0Var;
        this.f326935g = (C106205q0) C110818d0.m150917O(p0Var.f282570c, 0);
        mo160439g();
        if (!z || z2 || j != -1) {
            C115669n.INSTANCE.mo175912v(1468, 10);
            this.f326932d.getVideoView().mo154765l(p0Var.mo134611h(), z, z2, j);
            WxCropOperationLayout a = this.f326932d.mo160463a();
            ValueAnimator valueAnimator = a.f315432T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            a.f315454y = 0;
            a.invalidate();
            return;
        }
        this.f326932d.getVideoView().mo79510k(p0Var.mo134611h());
        this.f326932d.mo160463a().postDelayed(new C109199d(this), 3000);
    }

    /* renamed from: g */
    public final void mo160439g() {
        C106205q0 q0Var = this.f326935g;
        if (q0Var != null) {
            int i = q0Var.f316495f;
            int i2 = q0Var.f316496g;
            C106204p pVar = q0Var.f316498i;
            this.f326932d.mo160467e().setMaxScaleValue(pVar.f316488f);
            this.f326932d.mo160467e().setMinScaleValue(pVar.f316489g);
            boolean isEmpty = this.f326932d.mo160467e().getContentRect().isEmpty();
            this.f326932d.mo160467e().getContentRect().set(pVar.f316486d);
            this.f326932d.mo160467e().getContentRect().offset(0, (int) this.f326937i.top);
            this.f326932d.mo160467e().mo154438D(this.f326934f, i, i2, pVar.f316483a, CropLayout.C97279e.CENTER_INSIDE, new C61203f(isEmpty));
            String str = this.f326933e;
            Log.m105924i(str, "updateVideoCrop, viewWidth:" + i + ", viewHeight:" + i2);
        }
    }

    public void onFinish() {
    }
}
