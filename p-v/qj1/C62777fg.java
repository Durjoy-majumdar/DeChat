package qj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hi1.C59909b;
import ht1.C8777j5;
import il1.C60398g1;
import il1.C60413h1;
import il1.C60466o1;
import java.util.LinkedHashMap;
import java.util.Map;
import o40.C61926c;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13601g;
import te3.C64274c60;
import te3.C64756up2;

/* renamed from: qj1.fg */
public final class C62777fg extends C62660c implements View.OnClickListener {

    /* renamed from: A */
    public final C60413h1 f178194A;

    /* renamed from: B */
    public final C60398g1 f178195B;

    /* renamed from: C */
    public final C60466o1 f178196C;

    /* renamed from: D */
    public int f178197D;

    /* renamed from: E */
    public int f178198E;

    /* renamed from: F */
    public Map<String, String> f178199F = new LinkedHashMap();

    /* renamed from: p */
    public final C58124b f178200p;

    /* renamed from: q */
    public final C13601g f178201q;

    /* renamed from: r */
    public final View f178202r;

    /* renamed from: s */
    public final LinearLayout f178203s;

    /* renamed from: t */
    public final RelativeLayout f178204t;

    /* renamed from: u */
    public final RelativeLayout f178205u;

    /* renamed from: v */
    public final TextView f178206v;

    /* renamed from: w */
    public final WeImageView f178207w;

    /* renamed from: x */
    public final RelativeLayout f178208x;

    /* renamed from: y */
    public final RelativeLayout f178209y;

    /* renamed from: z */
    public final View f178210z;

    /* renamed from: qj1.fg$a */
    public static final class C62778a implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178211d;

        public C62778a(ViewGroup viewGroup) {
            this.f178211d = viewGroup;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
            r0 = (r0 = (r0 = r0.f331275E).f331216b).f331212e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onLongClick(android.view.View r9) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin$1"
                java.lang.String r2 = "android/view/View$OnLongClickListener"
                java.lang.String r3 = "onLongClick"
                java.lang.String r4 = "(Landroid/view/View;)Z"
                r5 = r8
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                c50.b r0 = r9.mo77626b()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0041
                s50.k r0 = r0.f173031q
                s50.u r0 = r0.f331238j
                if (r0 == 0) goto L_0x003c
                s50.c0 r0 = r0.f331275E
                if (r0 == 0) goto L_0x003c
                s50.c r0 = r0.f331216b
                if (r0 == 0) goto L_0x003c
                q00.g r0 = r0.f331212e
                if (r0 == 0) goto L_0x003c
                boolean r0 = r0.mo143254u()
                goto L_0x003d
            L_0x003c:
                r0 = 0
            L_0x003d:
                if (r0 != r1) goto L_0x0041
                r0 = 1
                goto L_0x0042
            L_0x0041:
                r0 = 0
            L_0x0042:
                if (r0 == 0) goto L_0x005b
                c50.b r9 = r9.mo77626b()
                if (r9 != 0) goto L_0x004b
                goto L_0x004e
            L_0x004b:
                r9.mo75573F0(r2)
            L_0x004e:
                android.view.ViewGroup r9 = r8.f178211d
                android.content.Context r9 = r9.getContext()
                java.lang.String r0 = "已停用遮挡"
                nj3.C76912y0.m92773l(r9, r0)
                goto L_0x0071
            L_0x005b:
                c50.b r9 = r9.mo77626b()
                if (r9 != 0) goto L_0x0062
                goto L_0x0065
            L_0x0062:
                r9.mo75573F0(r1)
            L_0x0065:
                android.view.ViewGroup r9 = r8.f178211d
                android.content.Context r9 = r9.getContext()
                java.lang.String r0 = "已启用遮挡"
                nj3.C76912y0.m92773l(r9, r0)
            L_0x0071:
                r2 = 1
                java.lang.String r4 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin$1"
                java.lang.String r5 = "android/view/View$OnLongClickListener"
                java.lang.String r6 = "onLongClick"
                java.lang.String r7 = "(Landroid/view/View;)Z"
                r3 = r8
                j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62777fg.C62778a.onLongClick(android.view.View):boolean");
        }
    }

    /* renamed from: qj1.fg$b */
    public static final class C62779b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62777fg f178212d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62779b(C62777fg fgVar) {
            super(0);
            this.f178212d = fgVar;
        }

        public Object invoke() {
            this.f178212d.mo87779b1(true);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.FILTER, "", (String) null, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.fg$c */
    public static final class C62780c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62777fg f178213d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62780c(C62777fg fgVar) {
            super(0);
            this.f178213d = fgVar;
        }

        public Object invoke() {
            this.f178213d.mo87779b1(true);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.BEAUTY, "", (String) null, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.fg$d */
    public static final class C62781d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62777fg f178214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62781d(C62777fg fgVar) {
            super(0);
            this.f178214d = fgVar;
        }

        public Object invoke() {
            this.f178214d.mo87779b1(true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.fg$e */
    public static final class C62782e extends C87413o implements C32224a<C59909b> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178215d;

        /* renamed from: e */
        public final /* synthetic */ C62777fg f178216e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62782e(ViewGroup viewGroup, C62777fg fgVar) {
            super(0);
            this.f178215d = viewGroup;
            this.f178216e = fgVar;
        }

        public Object invoke() {
            return new C59909b(this.f178215d, this.f178216e);
        }
    }

    /* renamed from: qj1.fg$f */
    public static final class C62783f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62777fg f178217d;

        /* renamed from: e */
        public final /* synthetic */ boolean f178218e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62783f(C62777fg fgVar, boolean z) {
            super(0);
            this.f178217d = fgVar;
            this.f178218e = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0184  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0186  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01f7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r25 = this;
                r0 = r25
                ak1.g0 r2 = ak1.C0073g0.MAKEUP
                java.lang.Class<ak1.o> r1 = ak1.C54108o.class
                qj1.fg r3 = r0.f178217d
                int r3 = r3.f178198E
                r7 = 0
                r8 = 1
                r9 = 0
                r4 = 2
                java.lang.String r5 = "getService(HellLiveReport::class.java)"
                if (r3 == r4) goto L_0x0069
                r4 = 4
                if (r3 == r4) goto L_0x0017
                goto L_0x00ba
            L_0x0017:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r3.getClass()
                j50.a r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r3 == 0) goto L_0x0023
                b50.b r3 = r3.f173032r
                goto L_0x0024
            L_0x0023:
                r3 = r7
            L_0x0024:
                if (r3 == 0) goto L_0x0036
                b50.f r3 = (b50.C54412f) r3
                d50.i r3 = r3.getLiveStatus()
                if (r3 == 0) goto L_0x0036
                boolean r3 = r3.mo82885g()
                if (r3 != r8) goto L_0x0036
                r3 = 1
                goto L_0x0037
            L_0x0036:
                r3 = 0
            L_0x0037:
                if (r3 == 0) goto L_0x004f
                di3.d r1 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r1, r5)
                ht1.j5 r1 = (ht1.C8777j5) r1
                cj1.g6$a r3 = cj1.C54763g6.C54764a.f153488a
                java.lang.String r3 = r3.mo75669a(r8)
                r4 = 0
                r5 = 4
                r6 = 0
                ht1.C8777j5.C8778a.m8605f(r1, r2, r3, r4, r5, r6)
                goto L_0x00ba
            L_0x004f:
                di3.d r1 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r1, r5)
                r10 = r1
                ht1.j5 r10 = (ht1.C8777j5) r10
                r11 = 28
                cj1.g6$a r1 = cj1.C54763g6.C54764a.f153488a
                java.lang.String r13 = r1.mo75669a(r8)
                r14 = 0
                r15 = 4
                r16 = 0
                ht1.C8777j5.C8778a.m8600a(r10, r11, r13, r14, r15, r16)
                goto L_0x00ba
            L_0x0069:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r3.getClass()
                j50.a r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r3 == 0) goto L_0x0075
                b50.b r3 = r3.f173032r
                goto L_0x0076
            L_0x0075:
                r3 = r7
            L_0x0076:
                if (r3 == 0) goto L_0x0088
                b50.f r3 = (b50.C54412f) r3
                d50.i r3 = r3.getLiveStatus()
                if (r3 == 0) goto L_0x0088
                boolean r3 = r3.mo82885g()
                if (r3 != r8) goto L_0x0088
                r3 = 1
                goto L_0x0089
            L_0x0088:
                r3 = 0
            L_0x0089:
                if (r3 == 0) goto L_0x00a1
                di3.d r1 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r1, r5)
                ht1.j5 r1 = (ht1.C8777j5) r1
                cj1.g6$a r3 = cj1.C54763g6.C54764a.f153488a
                java.lang.String r3 = r3.mo75669a(r4)
                r4 = 0
                r5 = 4
                r6 = 0
                ht1.C8777j5.C8778a.m8605f(r1, r2, r3, r4, r5, r6)
                goto L_0x00ba
            L_0x00a1:
                di3.d r1 = di3.C86312j.m106911c(r1)
                gy3.C87412m.m108593f(r1, r5)
                r10 = r1
                ht1.j5 r10 = (ht1.C8777j5) r10
                r11 = 28
                cj1.g6$a r1 = cj1.C54763g6.C54764a.f153488a
                java.lang.String r13 = r1.mo75669a(r4)
                r14 = 0
                r15 = 4
                r16 = 0
                ht1.C8777j5.C8778a.m8600a(r10, r11, r13, r14, r15, r16)
            L_0x00ba:
                qj1.fg r1 = r0.f178217d
                r1.f178198E = r9
                boolean r2 = r0.f178218e
                if (r2 != 0) goto L_0x01fe
                rx3.g r1 = r1.f178201q
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                hi1.b r1 = (hi1.C59909b) r1
                java.lang.Class<qj1.sh> r2 = qj1.C62983sh.class
                android.view.View r3 = r1.f170999c
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                r5 = 8
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r4.mo10233c(r6)
                java.lang.Object[] r11 = r4.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager"
                java.lang.String r13 = "hideCameraPreviewView"
                java.lang.String r14 = "()V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r3
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r4 = r4.mo10231a(r9)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r11 = "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager"
                java.lang.String r12 = "hideCameraPreviewView"
                java.lang.String r13 = "()V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
                android.view.View r3 = r1.f171000d
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4.mo10233c(r5)
                java.lang.Object[] r18 = r4.mo10232b()
                java.lang.String r19 = "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager"
                java.lang.String r20 = "hideCameraPreviewView"
                java.lang.String r21 = "()V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                r17 = r3
                j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.Object r4 = r4.mo10231a(r9)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r18 = "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager"
                java.lang.String r19 = "hideCameraPreviewView"
                java.lang.String r20 = "()V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
                qj1.c r3 = r1.f170997a
                qj1.c r3 = r3.mo87687E0(r2)
                qj1.sh r3 = (qj1.C62983sh) r3
                if (r3 == 0) goto L_0x01fa
                p50.e r4 = r3.mo87920a1()
                if (r4 == 0) goto L_0x0174
                y80.g r4 = r4.f173034t
                if (r4 == 0) goto L_0x016f
                boolean r4 = r4.mo164109B()
                if (r4 != r8) goto L_0x016f
                r4 = 1
                goto L_0x0170
            L_0x016f:
                r4 = 0
            L_0x0170:
                if (r4 != r8) goto L_0x0174
                r4 = 1
                goto L_0x0175
            L_0x0174:
                r4 = 0
            L_0x0175:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r5.getClass()
                j50.a r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r5 == 0) goto L_0x0186
                boolean r5 = r5.mo85682Z()
                if (r5 != r8) goto L_0x0186
                r5 = 1
                goto L_0x0187
            L_0x0186:
                r5 = 0
            L_0x0187:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r10 = "hideCameraPreviewView isCameraPreviewing: "
                r6.append(r10)
                r6.append(r4)
                java.lang.String r10 = " isInLinkMic: "
                r6.append(r10)
                r6.append(r5)
                java.lang.String r6 = r6.toString()
                java.lang.String r10 = "FinderLiveMicCameraPreviewManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
                qj1.c r6 = r1.f170997a
                qj1.c r2 = r6.mo87687E0(r2)
                qj1.sh r2 = (qj1.C62983sh) r2
                if (r2 == 0) goto L_0x01b6
                com.tencent.mm.live.core.view.LivePreviewView r2 = r2.f178711r
                if (r2 == 0) goto L_0x01b6
                r2.setCameraOptionPreviewView(r7)
            L_0x01b6:
                if (r4 == 0) goto L_0x01f1
                if (r5 == 0) goto L_0x01f1
                com.tencent.mm.live.core.view.LivePreviewView r2 = r3.f178711r
                android.view.TextureView r2 = r2.getCameraView()
                if (r2 == 0) goto L_0x01fa
                android.view.ViewGroup r3 = r1.f171001e
                android.view.TextureView r4 = r1.f170998b
                r3.removeView(r4)
                android.view.ViewGroup r3 = r1.f171001e
                android.view.TextureView r4 = r1.f170998b
                r3.addView(r4)
                android.graphics.SurfaceTexture r3 = r1.f171003g
                if (r3 == 0) goto L_0x01eb
                r2.setSurfaceTexture(r3)
                android.view.ViewParent r3 = r2.getParent()
                boolean r4 = r3 instanceof android.view.ViewGroup
                if (r4 == 0) goto L_0x01e2
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                goto L_0x01e3
            L_0x01e2:
                r3 = r7
            L_0x01e3:
                if (r3 == 0) goto L_0x01eb
                r3.removeView(r2)
                r3.addView(r2)
            L_0x01eb:
                android.view.TextureView$SurfaceTextureListener r3 = r1.f171002f
                r2.setSurfaceTextureListener(r3)
                goto L_0x01fa
            L_0x01f1:
                p50.e r2 = r3.mo87920a1()
                if (r2 == 0) goto L_0x01fa
                r2.mo85702u0()
            L_0x01fa:
                r1.f171003g = r7
                r1.f171002f = r7
            L_0x01fe:
                qj1.lg r1 = new qj1.lg
                qj1.fg r2 = r0.f178217d
                boolean r3 = r0.f178218e
                r1.<init>(r2, r3)
                qj1.fg r2 = r0.f178217d
                android.widget.LinearLayout r2 = r2.f178203s
                float r2 = r2.getTranslationY()
                r3 = 0
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L_0x0215
                goto L_0x0216
            L_0x0215:
                r8 = 0
            L_0x0216:
                if (r8 == 0) goto L_0x0246
                qj1.fg r2 = r0.f178217d
                android.widget.LinearLayout r2 = r2.f178203s
                android.view.ViewPropertyAnimator r2 = r2.animate()
                qj1.fg r3 = r0.f178217d
                android.view.ViewGroup r3 = r3.f166287d
                android.content.Context r3 = r3.getContext()
                android.graphics.Point r3 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r3)
                int r3 = r3.y
                float r3 = (float) r3
                android.view.ViewPropertyAnimator r2 = r2.translationY(r3)
                r3 = 200(0xc8, double:9.9E-322)
                android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
                qj1.kg r3 = new qj1.kg
                r3.<init>(r1)
                android.view.ViewPropertyAnimator r1 = r2.setListener(r3)
                r1.start()
                goto L_0x0249
            L_0x0246:
                r1.invoke()
            L_0x0249:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62777fg.C62783f.invoke():java.lang.Object");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62777fg(android.view.ViewGroup r19, d60.C58124b r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "root"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "statusMonitor"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.f178200p = r2
            qj1.fg$e r2 = new qj1.fg$e
            r2.<init>(r1, r0)
            rx3.g r2 = rx3.C36568h.m40985a(r2)
            r0.f178201q = r2
            r2 = 2131297744(0x7f0905d0, float:1.8213442E38)
            android.view.View r2 = r1.findViewById(r2)
            r0.f178202r = r2
            r3 = 2131303311(0x7f091b8f, float:1.8224733E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0.f178203s = r3
            r4 = 2131303331(0x7f091ba3, float:1.8224773E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r0.f178204t = r4
            r5 = 2131303328(0x7f091ba0, float:1.8224767E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r0.f178205u = r5
            r6 = 2131303330(0x7f091ba2, float:1.8224771E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0.f178206v = r6
            r6 = 2131303329(0x7f091ba1, float:1.822477E38)
            android.view.View r6 = r1.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r6
            r0.f178207w = r6
            r6 = 2131303319(0x7f091b97, float:1.822475E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r0.f178208x = r6
            r7 = 2131303313(0x7f091b91, float:1.8224737E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r0.f178209y = r7
            r8 = 2131303325(0x7f091b9d, float:1.8224761E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r9 = 2131303337(0x7f091ba9, float:1.8224786E38)
            android.view.View r9 = r1.findViewById(r9)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r10 = 2131303302(0x7f091b86, float:1.8224715E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r11 = 2131303275(0x7f091b6b, float:1.822466E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            r12 = 2131303310(0x7f091b8e, float:1.822473E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.RelativeLayout r12 = (android.widget.RelativeLayout) r12
            r13 = 2131303256(0x7f091b58, float:1.8224621E38)
            android.view.View r13 = r1.findViewById(r13)
            r0.f178210z = r13
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            r0.f178199F = r14
            boolean r14 = r18.mo82893g0()
            if (r14 != 0) goto L_0x0123
            android.content.Context r14 = r19.getContext()
            int r14 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r14)
            r0.f178197D = r14
            int r14 = r3.getPaddingLeft()
            int r15 = r3.getPaddingTop()
            r20 = r2
            int r2 = r3.getPaddingRight()
            int r16 = r3.getPaddingBottom()
            r17 = r13
            int r13 = r0.f178197D
            int r13 = r16 + r13
            r3.setPadding(r14, r15, r2, r13)
            int r2 = r10.getPaddingLeft()
            int r13 = r10.getPaddingTop()
            int r14 = r10.getPaddingRight()
            int r15 = r10.getPaddingBottom()
            int r1 = r0.f178197D
            int r15 = r15 + r1
            r10.setPadding(r2, r13, r14, r15)
            int r1 = r11.getPaddingLeft()
            int r2 = r11.getPaddingTop()
            int r13 = r11.getPaddingRight()
            int r14 = r11.getPaddingBottom()
            int r15 = r0.f178197D
            int r14 = r14 + r15
            r11.setPadding(r1, r2, r13, r14)
            int r1 = r12.getPaddingLeft()
            int r2 = r12.getPaddingTop()
            int r13 = r12.getPaddingRight()
            int r14 = r12.getPaddingBottom()
            int r15 = r0.f178197D
            int r14 = r14 + r15
            r12.setPadding(r1, r2, r13, r14)
            goto L_0x0127
        L_0x0123:
            r20 = r2
            r17 = r13
        L_0x0127:
            android.content.Context r1 = r19.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            float r1 = (float) r1
            r3.setTranslationY(r1)
            il1.h1 r1 = new il1.h1
            java.lang.String r2 = "filterPanel"
            gy3.C87412m.m108593f(r10, r2)
            r1.<init>(r10)
            r0.f178194A = r1
            il1.g1 r2 = new il1.g1
            java.lang.String r3 = "beautyPowerfulPanel"
            gy3.C87412m.m108593f(r11, r3)
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            androidx.lifecycle.i0 r3 = r0.mo87696x0(r3)
            cl1.o r3 = (cl1.C54991o) r3
            fe1.q r3 = r3.f154259T2
            r10 = 1
            if (r3 == 0) goto L_0x015c
            int r3 = r3.getSex()
            if (r3 != r10) goto L_0x015c
            goto L_0x015d
        L_0x015c:
            r10 = 0
        L_0x015d:
            r2.<init>(r11, r10)
            r0.f178195B = r2
            il1.o1 r3 = new il1.o1
            java.lang.String r10 = "makeupPanel"
            gy3.C87412m.m108593f(r12, r10)
            r3.<init>(r12)
            r0.f178196C = r3
            r4.setOnClickListener(r0)
            r5.setOnClickListener(r0)
            r6.setOnClickListener(r0)
            r7.setOnClickListener(r0)
            boolean r4 = cj1.C54763g6.f153486b
            if (r4 == 0) goto L_0x0182
            r8.setOnClickListener(r0)
            goto L_0x0185
        L_0x0182:
            r9.removeView(r8)
        L_0x0185:
            r4 = r19
            r4.setOnClickListener(r0)
            r5 = r17
            r5.setOnClickListener(r0)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r5 != 0) goto L_0x019b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r5 != 0) goto L_0x019b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r5 == 0) goto L_0x01a3
        L_0x019b:
            qj1.fg$a r5 = new qj1.fg$a
            r5.<init>(r4)
            r8.setOnLongClickListener(r5)
        L_0x01a3:
            qj1.fg$b r4 = new qj1.fg$b
            r4.<init>(r0)
            r1.f172256n = r4
            qj1.fg$c r1 = new qj1.fg$c
            r1.<init>(r0)
            r2.f172219e = r1
            qj1.fg$d r1 = new qj1.fg$d
            r1.<init>(r0)
            r3.f172382d = r1
            r1 = r20
            r1.setOnClickListener(r0)
            r1 = 8
            r0.mo10792g(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62777fg.<init>(android.view.ViewGroup, d60.b):void");
    }

    /* renamed from: Z0 */
    public static final void m73849Z0(C62777fg fgVar, View view, C54067f0.C0066n nVar) {
        fgVar.getClass();
        if (view.getVisibility() == 0) {
            ((C54108o) C86312j.m106911c(C54108o.class)).mo9602Jz(nVar, fgVar.f178199F);
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m73850a1(qj1.C62777fg r3, boolean r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x000c
            d60.b r3 = r3.f178200p
            d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_RESTORE_POST_UI
            r1 = 2
            d60.C58124b.C7172a.m7372a(r3, r4, r0, r1, r0)
            goto L_0x0048
        L_0x000c:
            android.view.ViewGroup r3 = r3.f166287d
            android.content.Context r3 = r3.getContext()
            boolean r4 = r3 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r4 == 0) goto L_0x0019
            r0 = r3
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
        L_0x0019:
            if (r0 == 0) goto L_0x0048
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62444c(r0)
            java.lang.Class<xk1.d2> r1 = xk1.C66297d2.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r1)
            xk1.d2 r4 = (xk1.C66297d2) r4
            bl3.r$a r1 = r3.mo62444c(r0)
            java.lang.Class<xk1.d2> r2 = xk1.C66297d2.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            xk1.d2 r1 = (xk1.C66297d2) r1
            int r1 = r1.f190848d
            r4.f190867z = r1
            bl3.r$a r3 = r3.mo62444c(r0)
            java.lang.Class<xk1.d2> r4 = xk1.C66297d2.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            xk1.d2 r3 = (xk1.C66297d2) r3
            r3.mo90415e3()
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62777fg.m73850a1(qj1.fg, boolean):void");
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo87779b1(boolean z) {
        C61926c.m72668M(new C62783f(this, z));
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        this.f178194A.mo85382f();
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel;
        String str;
        String str2;
        int i3;
        if (i == 20010 && intent != null && (captureVideoNormalModel = (CaptureDataManager.CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO")) != null) {
            Boolean bool = captureVideoNormalModel.f272897h;
            C87412m.m108593f(bool, "model.photo");
            if (bool.booleanValue()) {
                str = captureVideoNormalModel.f272895f;
                C87412m.m108593f(str, "model.thumbPath");
                str2 = "";
            } else {
                String str3 = captureVideoNormalModel.f272894e;
                C87412m.m108593f(str3, "model.videoPath");
                String str4 = captureVideoNormalModel.f272895f;
                C87412m.m108593f(str4, "model.thumbPath");
                str2 = str3;
                str = str4;
            }
            C64756up2 up22 = new C64756up2();
            Boolean bool2 = captureVideoNormalModel.f272897h;
            C87412m.m108593f(bool2, "model.photo");
            if (bool2.booleanValue()) {
                up22.f185782d = str;
                i3 = 0;
            } else {
                up22.f185782d = null;
                C64274c60 c602 = new C64274c60();
                c602.f182415d = str2;
                c602.f182416e = str;
                C13598b0 b0Var = C13598b0.f38549a;
                up22.f185783e = c602;
                i3 = 1;
            }
            up22.f185784f = i3;
            C62042e eVar = C62042e.f176370a;
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            eVar.mo87060Z1(context, mo87684A0(), up22);
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        int i = this.f178198E;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            mo87779b1(false);
        } else if (i == 2) {
            mo87779b1(true);
        } else if (i == 3) {
            mo87779b1(true);
        } else if (i != 4) {
            return false;
        } else {
            mo87779b1(true);
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* JADX WARNING: type inference failed for: r0v58, types: [b50.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r21) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            java.lang.Class<cl1.o> r8 = cl1.C54991o.class
            java.lang.Class<cl1.u> r9 = cl1.C55001u.class
            java.lang.Class<ak1.o> r10 = ak1.C54108o.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r20
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            r0 = 0
            if (r7 == 0) goto L_0x0032
            int r1 = r21.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0033
        L_0x0032:
            r1 = r0
        L_0x0033:
            r2 = 2131297744(0x7f0905d0, float:1.8213442E38)
            r3 = 0
            if (r1 != 0) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            int r4 = r1.intValue()
            if (r4 != r2) goto L_0x0045
            r6.mo87779b1(r3)
            goto L_0x042f
        L_0x0045:
            r2 = 2131303331(0x7f091ba3, float:1.8224773E38)
            r4 = 2
            java.lang.String r5 = "getService(HellLiveReport::class.java)"
            r7 = 1
            if (r1 != 0) goto L_0x0050
            goto L_0x0146
        L_0x0050:
            int r11 = r1.intValue()
            if (r11 != r2) goto L_0x0146
            di3.d r1 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r1, r5)
            r11 = r1
            ht1.j5 r11 = (ht1.C8777j5) r11
            ak1.f0$m r12 = ak1.C54067f0.C0064m.FLIP
            java.util.Map<java.lang.String, java.lang.String> r13 = r6.f178199F
            r14 = 0
            r15 = 4
            r16 = 0
            ht1.C8777j5.C8778a.m8606g(r11, r12, r13, r14, r15, r16)
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r9)
            cl1.u r1 = (cl1.C55001u) r1
            d50.h r1 = r1.f154421r
            if (r1 == 0) goto L_0x0077
            d50.f r0 = r1.f166253d
        L_0x0077:
            if (r0 != 0) goto L_0x007a
            goto L_0x008f
        L_0x007a:
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r9)
            cl1.u r1 = (cl1.C55001u) r1
            d50.h r1 = r1.f154421r
            if (r1 == 0) goto L_0x008b
            d50.f r1 = r1.f166253d
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.f166227b
            goto L_0x008c
        L_0x008b:
            r1 = 1
        L_0x008c:
            r1 = r1 ^ r7
            r0.f166227b = r1
        L_0x008f:
            d60.b r0 = r6.f178200p
            d60.b$b r1 = d60.C58124b.C58125b.SWITCH_CAMERA
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r0.statusChange(r1, r2)
            androidx.lifecycle.i0 r0 = r6.mo87696x0(r9)
            cl1.u r0 = (cl1.C55001u) r0
            d50.h r0 = r0.f154421r
            if (r0 == 0) goto L_0x00ae
            d50.f r0 = r0.f166253d
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r0.f166227b
            if (r0 != r7) goto L_0x00ae
            r3 = 1
        L_0x00ae:
            if (r3 == 0) goto L_0x00dd
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r6.f178207w
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r1 = r1.getColor(r2)
            r0.setIconColor(r1)
            android.widget.TextView r0 = r6.f178206v
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x0106
        L_0x00dd:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r6.f178207w
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r1 = r1.getColor(r2)
            r0.setIconColor(r1)
            android.widget.TextView r0 = r6.f178206v
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x0106:
            d60.b r0 = r6.f178200p
            int r0 = r0.getLiveRole()
            if (r0 != r7) goto L_0x042f
            di3.d r0 = di3.C86312j.m106911c(r10)
            ak1.o r0 = (ak1.C54108o) r0
            r0.getClass()
            ak1.f0 r0 = ak1.C54108o.f151869h
            ak1.m0 r0 = r0.f151443Y
            long r1 = r0.f151838o
            r8 = 1
            long r1 = r1 + r8
            r0.f151838o = r1
            k50.a r0 = k50.C60971a.C60973b.f173670a
            m50.b r0 = r0.mo85945b()
            int r0 = r0.f174704a
            if (r0 != 0) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r4 = 1
        L_0x012e:
            di3.d r0 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r0, r5)
            r7 = r0
            ht1.j5 r7 = (ht1.C8777j5) r7
            ak1.g0 r8 = ak1.C0073g0.LIVE_ANCHOR_ACTION_EXCHANGE_CAMERA
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r10 = 0
            r11 = 4
            r12 = 0
            ht1.C8777j5.C8778a.m8605f(r7, r8, r9, r10, r11, r12)
            goto L_0x042f
        L_0x0146:
            r2 = 2131303328(0x7f091ba0, float:1.8224767E38)
            if (r1 != 0) goto L_0x014d
            goto L_0x0235
        L_0x014d:
            int r11 = r1.intValue()
            if (r11 != r2) goto L_0x0235
            di3.d r1 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r1, r5)
            r11 = r1
            ht1.j5 r11 = (ht1.C8777j5) r11
            ak1.f0$m r12 = ak1.C54067f0.C0064m.IMAGE
            java.util.Map<java.lang.String, java.lang.String> r13 = r6.f178199F
            r14 = 0
            r15 = 4
            r16 = 0
            ht1.C8777j5.C8778a.m8606g(r11, r12, r13, r14, r15, r16)
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r9)
            cl1.u r1 = (cl1.C55001u) r1
            d50.h r1 = r1.f154421r
            if (r1 == 0) goto L_0x017c
            d50.f r1 = r1.f166253d
            if (r1 == 0) goto L_0x017c
            boolean r1 = r1.f166227b
            if (r1 != r7) goto L_0x017c
            r1 = 1
            goto L_0x017d
        L_0x017c:
            r1 = 0
        L_0x017d:
            if (r1 == 0) goto L_0x020e
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r9)
            cl1.u r1 = (cl1.C55001u) r1
            d50.h r1 = r1.f154421r
            if (r1 == 0) goto L_0x0192
            d50.f r1 = r1.f166253d
            if (r1 == 0) goto L_0x0192
            boolean r1 = r1.f166230e
            if (r1 != r7) goto L_0x0192
            r3 = 1
        L_0x0192:
            r1 = 200(0xc8, double:9.9E-322)
            if (r3 == 0) goto L_0x01aa
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r6.f178207w
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 1127481344(0x43340000, float:180.0)
            android.view.ViewPropertyAnimator r3 = r3.rotationY(r4)
            android.view.ViewPropertyAnimator r1 = r3.setDuration(r1)
            r1.start()
            goto L_0x01bc
        L_0x01aa:
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r6.f178207w
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 0
            android.view.ViewPropertyAnimator r3 = r3.rotationY(r4)
            android.view.ViewPropertyAnimator r1 = r3.setDuration(r1)
            r1.start()
        L_0x01bc:
            androidx.lifecycle.i0 r1 = r6.mo87696x0(r9)
            cl1.u r1 = (cl1.C55001u) r1
            d50.h r1 = r1.f154421r
            if (r1 == 0) goto L_0x01c9
            d50.f r1 = r1.f166253d
            goto L_0x01ca
        L_0x01c9:
            r1 = r0
        L_0x01ca:
            if (r1 != 0) goto L_0x01cd
            goto L_0x01e2
        L_0x01cd:
            androidx.lifecycle.i0 r2 = r6.mo87696x0(r9)
            cl1.u r2 = (cl1.C55001u) r2
            d50.h r2 = r2.f154421r
            if (r2 == 0) goto L_0x01de
            d50.f r2 = r2.f166253d
            if (r2 == 0) goto L_0x01de
            boolean r2 = r2.f166230e
            goto L_0x01df
        L_0x01de:
            r2 = 1
        L_0x01df:
            r2 = r2 ^ r7
            r1.f166230e = r2
        L_0x01e2:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            j50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r2 == 0) goto L_0x01ed
            b50.b r0 = r2.f173032r
        L_0x01ed:
            if (r0 == 0) goto L_0x01f8
            boolean r1 = r1.mo77650x()
            b50.f r0 = (b50.C54412f) r0
            r0.mo75189c(r1)
        L_0x01f8:
            di3.d r0 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r0, r5)
            r7 = r0
            ht1.j5 r7 = (ht1.C8777j5) r7
            ak1.g0 r8 = ak1.C0073g0.CLICK_MIRROR
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r9 = ""
            ht1.C8777j5.C8778a.m8605f(r7, r8, r9, r10, r11, r12)
            goto L_0x042f
        L_0x020e:
            java.lang.String r0 = "Finder.FinderLiveAnchorCameraOptPanelPlugin"
            java.lang.String r1 = "clickMirror while using front camera, skip!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.view.ViewGroup r0 = r6.f166287d
            android.content.Context r0 = r0.getContext()
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131828078(0x7f111d6e, float:1.9289087E38)
            java.lang.String r1 = r1.getString(r2)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
            goto L_0x042f
        L_0x0235:
            r2 = 2131303319(0x7f091b97, float:1.822475E38)
            r9 = 2131828924(0x7f1120bc, float:1.9290803E38)
            r11 = 100
            if (r1 != 0) goto L_0x0240
            goto L_0x02ab
        L_0x0240:
            int r13 = r1.intValue()
            if (r13 != r2) goto L_0x02ab
            androidx.lifecycle.i0 r0 = r6.mo87696x0(r8)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154313f2
            if (r0 != 0) goto L_0x0269
            android.view.ViewGroup r0 = r6.f166287d
            android.content.Context r0 = r0.getContext()
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = r1.getString(r9)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
            goto L_0x042f
        L_0x0269:
            di3.d r0 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r0, r5)
            r13 = r0
            ht1.j5 r13 = (ht1.C8777j5) r13
            ak1.f0$m r14 = ak1.C54067f0.C0064m.FILTER
            java.util.Map<java.lang.String, java.lang.String> r15 = r6.f178199F
            r16 = 0
            r17 = 4
            r18 = 0
            ht1.C8777j5.C8778a.m8606g(r13, r14, r15, r16, r17, r18)
            r6.f178198E = r4
            android.widget.LinearLayout r0 = r6.f178203s
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r11)
            qj1.hg r1 = new qj1.hg
            r1.<init>(r6)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r0.start()
            goto L_0x042f
        L_0x02ab:
            r2 = 2131303313(0x7f091b91, float:1.8224737E38)
            r13 = 3
            if (r1 != 0) goto L_0x02b2
            goto L_0x031f
        L_0x02b2:
            int r14 = r1.intValue()
            if (r14 != r2) goto L_0x031f
            androidx.lifecycle.i0 r0 = r6.mo87696x0(r8)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154308e2
            if (r0 != 0) goto L_0x02db
            android.view.ViewGroup r0 = r6.f166287d
            android.content.Context r0 = r0.getContext()
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            java.lang.String r1 = r1.getString(r9)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
            goto L_0x042f
        L_0x02db:
            di3.d r0 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r0, r5)
            r14 = r0
            ht1.j5 r14 = (ht1.C8777j5) r14
            ak1.f0$m r15 = ak1.C54067f0.C0064m.BEAUTY
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f178199F
            r17 = 0
            r18 = 4
            r19 = 0
            r16 = r0
            ht1.C8777j5.C8778a.m8606g(r14, r15, r16, r17, r18, r19)
            r6.f178198E = r13
            android.widget.LinearLayout r0 = r6.f178203s
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r11)
            qj1.gg r1 = new qj1.gg
            r1.<init>(r6)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r0.start()
            goto L_0x042f
        L_0x031f:
            r2 = 2131303325(0x7f091b9d, float:1.8224761E38)
            r8 = 4
            if (r1 != 0) goto L_0x0326
            goto L_0x0382
        L_0x0326:
            int r9 = r1.intValue()
            if (r9 != r2) goto L_0x0382
            boolean r1 = w50.C65933h.f189549f
            if (r1 != 0) goto L_0x0340
            r1 = 0
            r2 = 0
            qj1.ig r3 = new qj1.ig
            r3.<init>(r6, r0)
            r4 = 3
            r5 = 0
            r0 = r20
            nk1.C11207i.m11067c(r0, r1, r2, r3, r4, r5)
            goto L_0x042f
        L_0x0340:
            di3.d r0 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r0, r5)
            r13 = r0
            ht1.j5 r13 = (ht1.C8777j5) r13
            ak1.f0$m r14 = ak1.C54067f0.C0064m.MAKEUP
            java.util.Map<java.lang.String, java.lang.String> r15 = r6.f178199F
            r16 = 0
            r17 = 4
            r18 = 0
            ht1.C8777j5.C8778a.m8606g(r13, r14, r15, r16, r17, r18)
            r6.f178198E = r8
            android.widget.LinearLayout r0 = r6.f178203s
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r11)
            qj1.jg r1 = new qj1.jg
            r1.<init>(r6)
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r0.start()
            goto L_0x042f
        L_0x0382:
            r0 = 2131303332(0x7f091ba4, float:1.8224775E38)
            if (r1 != 0) goto L_0x0388
            goto L_0x03bc
        L_0x0388:
            int r2 = r1.intValue()
            if (r2 != r0) goto L_0x03bc
            r6.mo87779b1(r3)
            f40.o r0 = f40.C86709a0.m107535s()
            boolean r0 = r0.mo121147n()
            if (r0 != 0) goto L_0x03a6
            android.view.ViewGroup r0 = r6.f166287d
            android.content.Context r0 = r0.getContext()
            nj3.C76912y0.m92772k(r0)
            goto L_0x042f
        L_0x03a6:
            ok1.e r0 = ok1.C62042e.f176370a
            android.view.ViewGroup r1 = r6.f166287d
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            r2 = 20010(0x4e2a, float:2.804E-41)
            r0.mo87006G0(r1, r2)
            goto L_0x042f
        L_0x03bc:
            r0 = 2131303336(0x7f091ba8, float:1.8224783E38)
            if (r1 != 0) goto L_0x03c2
            goto L_0x0420
        L_0x03c2:
            int r2 = r1.intValue()
            if (r2 != r0) goto L_0x0420
            int r0 = r6.f178198E
            if (r0 != r13) goto L_0x03ee
            di3.d r0 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r0, r5)
            r8 = r0
            ht1.j5 r8 = (ht1.C8777j5) r8
            ak1.g0 r9 = ak1.C0073g0.BEAUTY
            r11 = 0
            r12 = 4
            r13 = 0
            java.lang.String r10 = ""
            ht1.C8777j5.C8778a.m8605f(r8, r9, r10, r11, r12, r13)
            il1.g1 r0 = r6.f178195B
            com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulSuitViewV2 r0 = r0.f172217c
            boolean r0 = r0.getSuitMode()
            if (r0 == 0) goto L_0x042f
            r6.mo87779b1(r7)
            goto L_0x042f
        L_0x03ee:
            if (r0 != r4) goto L_0x0405
            di3.d r0 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r0, r5)
            r7 = r0
            ht1.j5 r7 = (ht1.C8777j5) r7
            ak1.g0 r8 = ak1.C0073g0.FILTER
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r9 = ""
            ht1.C8777j5.C8778a.m8605f(r7, r8, r9, r10, r11, r12)
            goto L_0x042f
        L_0x0405:
            if (r0 != r8) goto L_0x041c
            di3.d r0 = di3.C86312j.m106911c(r10)
            gy3.C87412m.m108593f(r0, r5)
            r7 = r0
            ht1.j5 r7 = (ht1.C8777j5) r7
            ak1.g0 r8 = ak1.C0073g0.MAKEUP
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r9 = ""
            ht1.C8777j5.C8778a.m8605f(r7, r8, r9, r10, r11, r12)
            goto L_0x042f
        L_0x041c:
            r6.mo87779b1(r3)
            goto L_0x042f
        L_0x0420:
            r0 = 2131303256(0x7f091b58, float:1.8224621E38)
            if (r1 != 0) goto L_0x0426
            goto L_0x042f
        L_0x0426:
            int r1 = r1.intValue()
            if (r1 != r0) goto L_0x042f
            r6.mo87779b1(r3)
        L_0x042f:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorCameraOptPanelPlugin"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62777fg.onClick(android.view.View):void");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 130) {
            C61926c.m72668M(new C62896ng(this));
        } else if (ordinal == 131) {
            mo87779b1(false);
        }
    }
}
