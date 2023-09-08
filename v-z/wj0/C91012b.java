package wj0;

import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p1044ub.C90630c;
import p284zb.C91635f;
import p958eb.C86470a;
import p963fc.C86812g;

/* renamed from: wj0.b */
public final class C91012b extends C91011a {

    /* renamed from: wj0.b$a */
    public static final class C91013a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MagicBrushView f261110d;

        /* renamed from: e */
        public final /* synthetic */ int f261111e;

        /* renamed from: f */
        public final /* synthetic */ int f261112f;

        /* renamed from: g */
        public final /* synthetic */ C91012b f261113g;

        /* renamed from: h */
        public final /* synthetic */ int f261114h;

        /* renamed from: i */
        public final /* synthetic */ int f261115i;

        /* renamed from: j */
        public final /* synthetic */ int f261116j;

        public C91013a(MagicBrushView magicBrushView, int i, int i2, C91012b bVar, int i3, int i4, int i5) {
            this.f261110d = magicBrushView;
            this.f261111e = i;
            this.f261112f = i2;
            this.f261113g = bVar;
            this.f261114h = i3;
            this.f261115i = i4;
            this.f261116j = i5;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
            r3 = (r3 = (r3 = r3.getContext()).getResources()).getDisplayMetrics();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                com.tencent.magicbrush.ui.MagicBrushView r0 = r11.f261110d
                r1 = 0
                r0.setOpaque(r1)
                int r0 = r11.f261111e
                float r0 = (float) r0
                int r2 = r11.f261112f
                float r2 = (float) r2
                wj0.b r3 = r11.f261113g
                eb.a<?> r3 = r3.f261109a
                com.tencent.mm.plugin.appbrand.jsapi.f r3 = r3.mo124764Z()
                zb.f r3 = (p284zb.C91635f) r3
                if (r3 == 0) goto L_0x0031
                android.content.Context r3 = r3.getContext()
                if (r3 == 0) goto L_0x0031
                android.content.res.Resources r3 = r3.getResources()
                if (r3 == 0) goto L_0x0031
                android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
                if (r3 == 0) goto L_0x0031
                float r3 = r3.density
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                goto L_0x0032
            L_0x0031:
                r3 = 0
            L_0x0032:
                if (r3 == 0) goto L_0x0050
                r3.floatValue()
                r4 = 100
                r5 = 0
                int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r6 > 0) goto L_0x0045
                float r0 = (float) r4
                float r6 = r3.floatValue()
                float r0 = r0 * r6
            L_0x0045:
                int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r5 > 0) goto L_0x0050
                float r2 = (float) r4
                float r3 = r3.floatValue()
                float r2 = r2 * r3
            L_0x0050:
                r3 = 5
                float[] r8 = new float[r3]
                int r3 = r11.f261114h
                float r3 = (float) r3
                r8[r1] = r3
                r1 = 1
                int r3 = r11.f261115i
                float r3 = (float) r3
                r8[r1] = r3
                r1 = 2
                r8[r1] = r0
                r0 = 3
                r8[r0] = r2
                r0 = 4
                int r1 = r11.f261116j
                float r1 = (float) r1
                r8[r0] = r1
                wj0.b r0 = r11.f261113g
                eb.a<?> r0 = r0.f261109a
                com.tencent.mm.plugin.appbrand.jsapi.f r0 = r0.mo124764Z()
                zb.f r0 = (p284zb.C91635f) r0
                if (r0 == 0) goto L_0x008c
                ub.c r0 = r0.mo114341l0()
                if (r0 == 0) goto L_0x008c
                com.tencent.mm.plugin.appbrand.page.p2 r4 = r0.f244556H
                if (r4 == 0) goto L_0x008c
                com.tencent.magicbrush.ui.MagicBrushView r5 = r11.f261110d
                int r6 = r5.getVirtualElementId()
                r7 = 0
                r9 = 0
                r10 = 0
                r4.mo116410e(r5, r6, r7, r8, r9, r10)
            L_0x008c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wj0.C91012b.C91013a.run():void");
        }
    }

    /* renamed from: wj0.b$b */
    public static final class C91014b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91012b f261117d;

        /* renamed from: e */
        public final /* synthetic */ MagicBrushView f261118e;

        public C91014b(C91012b bVar, MagicBrushView magicBrushView) {
            this.f261117d = bVar;
            this.f261118e = magicBrushView;
        }

        public final void run() {
            C90630c F0;
            C83873p2 p2Var;
            C91635f fVar = (C91635f) this.f261117d.f261109a.mo124764Z();
            if (fVar != null && (F0 = fVar.mo114341l0()) != null && (p2Var = F0.f244556H) != null) {
                p2Var.mo116441s(this.f261118e.getVirtualElementId());
            }
        }
    }

    /* renamed from: wj0.b$c */
    public static final class C91015c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f261119d;

        /* renamed from: e */
        public final /* synthetic */ int f261120e;

        /* renamed from: f */
        public final /* synthetic */ int f261121f;

        /* renamed from: g */
        public final /* synthetic */ int f261122g;

        /* renamed from: h */
        public final /* synthetic */ int f261123h;

        /* renamed from: i */
        public final /* synthetic */ C91012b f261124i;

        /* renamed from: j */
        public final /* synthetic */ MagicBrushView f261125j;

        public C91015c(int i, int i2, int i3, int i4, int i5, C91012b bVar, MagicBrushView magicBrushView) {
            this.f261119d = i;
            this.f261120e = i2;
            this.f261121f = i3;
            this.f261122g = i4;
            this.f261123h = i5;
            this.f261124i = bVar;
            this.f261125j = magicBrushView;
        }

        public final void run() {
            C90630c F0;
            C83873p2 p2Var;
            float[] fArr = {(float) this.f261119d, (float) this.f261120e, (float) this.f261121f, (float) this.f261122g, (float) this.f261123h};
            C91635f fVar = (C91635f) this.f261124i.f261109a.mo124764Z();
            if (fVar != null && (F0 = fVar.mo114341l0()) != null && (p2Var = F0.f244556H) != null) {
                int virtualElementId = this.f261125j.getVirtualElementId();
                Boolean bool = Boolean.FALSE;
                p2Var.mo116446x(virtualElementId, fArr, 0, bool, bool);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91012b(C86470a<?> aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "logicImpl");
    }

    /* renamed from: P */
    public void mo111585P(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
        MagicBrushView magicBrushView2 = magicBrushView;
        C87412m.m108594g(magicBrushView, "view");
        Log.m105924i("MicroMsg.GlobalParentScreenCanvasViewDelegate", "hy: inserting magicbrush view in global parent screen canvas view delegate " + magicBrushView.getVirtualElementId());
        C86812g j0 = this.f261109a.mo125523j0();
        if (j0 != null) {
            j0.mo113024P0(new C91013a(magicBrushView, i3, i4, this, i, i2, i5));
        }
    }

    /* renamed from: W */
    public void mo111586W(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
        MagicBrushView magicBrushView2 = magicBrushView;
        C87412m.m108594g(magicBrushView, "view");
        C86812g j0 = this.f261109a.mo125523j0();
        if (j0 != null) {
            j0.mo113024P0(new C91015c(i, i2, i3, i4, i5, this, magicBrushView));
        }
    }

    /* renamed from: c0 */
    public void mo111587c0(MagicBrushView magicBrushView) {
        C87412m.m108594g(magicBrushView, "view");
        Log.m105924i("MicroMsg.GlobalParentScreenCanvasViewDelegate", "hy: removing magicbrush view in global parent screen canvas view delegate " + magicBrushView.getVirtualElementId());
        C86812g j0 = this.f261109a.mo125523j0();
        if (j0 != null) {
            j0.mo113024P0(new C91014b(this, magicBrushView));
        }
    }
}
