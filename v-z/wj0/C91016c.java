package wj0;

import android.widget.FrameLayout;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import gy3.C87412m;
import p748xd.C78798e;
import p958eb.C86470a;
import p963fc.C86812g;

/* renamed from: wj0.c */
public final class C91016c extends C91011a {

    /* renamed from: b */
    public FrameLayout f261126b;

    /* renamed from: c */
    public final C78798e f261127c = new C78798e();

    /* renamed from: wj0.c$a */
    public static final class C91017a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91016c f261128d;

        /* renamed from: e */
        public final /* synthetic */ MagicBrushView f261129e;

        /* renamed from: f */
        public final /* synthetic */ int f261130f;

        /* renamed from: g */
        public final /* synthetic */ int f261131g;

        /* renamed from: h */
        public final /* synthetic */ int f261132h;

        /* renamed from: i */
        public final /* synthetic */ int f261133i;

        /* renamed from: j */
        public final /* synthetic */ int f261134j;

        public C91017a(C91016c cVar, MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
            this.f261128d = cVar;
            this.f261129e = magicBrushView;
            this.f261130f = i;
            this.f261131g = i2;
            this.f261132h = i3;
            this.f261133i = i4;
            this.f261134j = i5;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
            r1 = r1.getContext();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                wj0.c r0 = r7.f261128d
                android.widget.FrameLayout r1 = r0.f261126b
                r2 = 0
                if (r1 != 0) goto L_0x0066
                eb.a<?> r1 = r0.f261109a
                com.tencent.mm.plugin.appbrand.jsapi.f r1 = r1.mo124764Z()
                zb.f r1 = (p284zb.C91635f) r1
                if (r1 == 0) goto L_0x001d
                android.content.Context r1 = r1.getContext()
                if (r1 == 0) goto L_0x001d
                android.widget.FrameLayout r3 = new android.widget.FrameLayout
                r3.<init>(r1)
                goto L_0x001e
            L_0x001d:
                r3 = r2
            L_0x001e:
                r0.f261126b = r3
                wj0.c r0 = r7.f261128d
                android.widget.FrameLayout r1 = r0.f261126b
                if (r1 == 0) goto L_0x005e
                eb.a<?> r0 = r0.f261109a
                com.tencent.mm.plugin.appbrand.jsapi.f r0 = r0.mo124764Z()
                zb.f r0 = (p284zb.C91635f) r0
                if (r0 == 0) goto L_0x0039
                ub.c r0 = r0.mo114341l0()
                if (r0 == 0) goto L_0x0039
                com.tencent.mm.plugin.appbrand.page.p2 r0 = r0.f244556H
                goto L_0x003a
            L_0x0039:
                r0 = r2
            L_0x003a:
                if (r0 != 0) goto L_0x003d
                goto L_0x005e
            L_0x003d:
                wj0.c r0 = r7.f261128d
                eb.a<?> r0 = r0.f261109a
                com.tencent.mm.plugin.appbrand.jsapi.f r0 = r0.mo124764Z()
                zb.f r0 = (p284zb.C91635f) r0
                if (r0 == 0) goto L_0x0066
                ub.c r0 = r0.mo114341l0()
                if (r0 == 0) goto L_0x0066
                com.tencent.mm.plugin.appbrand.page.p2 r0 = r0.f244556H
                if (r0 == 0) goto L_0x0066
                wj0.c r1 = r7.f261128d
                android.widget.FrameLayout r1 = r1.f261126b
                gy3.C87412m.m108591d(r1)
                com.tencent.p014mm.plugin.appbrand.page.C83882p4.m103245a(r0, r1)
                goto L_0x0066
            L_0x005e:
                java.lang.String r0 = "MicroMsg.LegacyScreenCanvasViewDelegate"
                java.lang.String r1 = "hy: component or context already released!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                return
            L_0x0066:
                wj0.c r0 = r7.f261128d
                xd.e r1 = r0.f261127c
                android.widget.FrameLayout r0 = r0.f261126b
                gy3.C87412m.m108591d(r0)
                com.tencent.magicbrush.ui.MagicBrushView r3 = r7.f261129e
                int r4 = r7.f261130f
                int r0 = r1.mo108711a(r0, r3, r4)
                com.tencent.magicbrush.ui.MagicBrushView r1 = r7.f261129e
                r3 = 0
                r1.setOpaque(r3)
                int r1 = r7.f261131g
                int r4 = r7.f261132h
                wj0.c r5 = r7.f261128d
                eb.a<?> r5 = r5.f261109a
                com.tencent.mm.plugin.appbrand.jsapi.f r5 = r5.mo124764Z()
                zb.f r5 = (p284zb.C91635f) r5
                if (r5 == 0) goto L_0x00a5
                android.content.Context r5 = r5.getContext()
                if (r5 == 0) goto L_0x00a5
                android.content.res.Resources r5 = r5.getResources()
                if (r5 == 0) goto L_0x00a5
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                if (r5 == 0) goto L_0x00a5
                float r2 = r5.density
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
            L_0x00a5:
                if (r2 == 0) goto L_0x00c1
                r2.floatValue()
                r5 = 100
                if (r1 > 0) goto L_0x00b6
                float r1 = (float) r5
                float r6 = r2.floatValue()
                float r1 = r1 * r6
                int r1 = (int) r1
            L_0x00b6:
                if (r4 > 0) goto L_0x00c1
                float r4 = (float) r5
                float r2 = r2.floatValue()
                float r4 = r4 * r2
                int r2 = (int) r4
                r4 = r2
            L_0x00c1:
                android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
                r2.<init>(r1, r4)
                int r1 = r7.f261133i
                int r4 = r7.f261134j
                r2.setMargins(r1, r4, r3, r3)
                wj0.c r1 = r7.f261128d
                android.widget.FrameLayout r1 = r1.f261126b
                gy3.C87412m.m108591d(r1)
                com.tencent.magicbrush.ui.MagicBrushView r4 = r7.f261129e
                r1.addView(r4, r0, r2)
                com.tencent.magicbrush.ui.MagicBrushView r0 = r7.f261129e
                r0.setOpaque(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wj0.C91016c.C91017a.run():void");
        }
    }

    /* renamed from: wj0.c$b */
    public static final class C91018b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91016c f261135d;

        /* renamed from: e */
        public final /* synthetic */ MagicBrushView f261136e;

        public C91018b(C91016c cVar, MagicBrushView magicBrushView) {
            this.f261135d = cVar;
            this.f261136e = magicBrushView;
        }

        public final void run() {
            C78798e eVar = this.f261135d.f261127c;
            MagicBrushView magicBrushView = this.f261136e;
            eVar.getClass();
            C87412m.m108594g(magicBrushView, "view");
            eVar.f230555a.remove(magicBrushView);
            FrameLayout frameLayout = this.f261135d.f261126b;
            C87412m.m108591d(frameLayout);
            frameLayout.removeView(this.f261136e);
        }
    }

    /* renamed from: wj0.c$c */
    public static final class C91019c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f261137d;

        /* renamed from: e */
        public final /* synthetic */ int f261138e;

        /* renamed from: f */
        public final /* synthetic */ int f261139f;

        /* renamed from: g */
        public final /* synthetic */ int f261140g;

        /* renamed from: h */
        public final /* synthetic */ C91016c f261141h;

        /* renamed from: i */
        public final /* synthetic */ MagicBrushView f261142i;

        /* renamed from: j */
        public final /* synthetic */ int f261143j;

        public C91019c(int i, int i2, int i3, int i4, C91016c cVar, MagicBrushView magicBrushView, int i5) {
            this.f261137d = i;
            this.f261138e = i2;
            this.f261139f = i3;
            this.f261140g = i4;
            this.f261141h = cVar;
            this.f261142i = magicBrushView;
            this.f261143j = i5;
        }

        public final void run() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f261137d, this.f261138e);
            layoutParams.setMargins(this.f261139f, this.f261140g, 0, 0);
            C91016c cVar = this.f261141h;
            C78798e eVar = cVar.f261127c;
            FrameLayout frameLayout = cVar.f261126b;
            C87412m.m108591d(frameLayout);
            int a = eVar.mo108711a(frameLayout, this.f261142i, this.f261143j);
            if (a == -2) {
                this.f261142i.setLayoutParams(layoutParams);
                this.f261142i.requestLayout();
            } else {
                FrameLayout frameLayout2 = this.f261141h.f261126b;
                C87412m.m108591d(frameLayout2);
                frameLayout2.removeView(this.f261142i);
                FrameLayout frameLayout3 = this.f261141h.f261126b;
                C87412m.m108591d(frameLayout3);
                frameLayout3.addView(this.f261142i, a, layoutParams);
            }
            this.f261142i.setOpaque(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91016c(C86470a<?> aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "logicImpl");
    }

    /* renamed from: P */
    public void mo111585P(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
        MagicBrushView magicBrushView2 = magicBrushView;
        C87412m.m108594g(magicBrushView, "view");
        C86812g j0 = this.f261109a.mo125523j0();
        if (j0 != null) {
            j0.mo113024P0(new C91017a(this, magicBrushView, i5, i3, i4, i, i2));
        }
    }

    /* renamed from: W */
    public void mo111586W(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
        MagicBrushView magicBrushView2 = magicBrushView;
        C87412m.m108594g(magicBrushView, "view");
        C86812g j0 = this.f261109a.mo125523j0();
        if (j0 != null) {
            j0.mo113024P0(new C91019c(i3, i4, i, i2, this, magicBrushView, i5));
        }
    }

    /* renamed from: c0 */
    public void mo111587c0(MagicBrushView magicBrushView) {
        C87412m.m108594g(magicBrushView, "view");
        C86812g j0 = this.f261109a.mo125523j0();
        if (j0 != null) {
            j0.mo113024P0(new C91018b(this, magicBrushView));
        }
    }
}
