package rs1;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.bullet.MegaVideoBulletView;
import com.tencent.p014mm.plugin.finder.view.FinderMediaLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import wh1.C66114a;

@C113200q(initialMode = 2)
/* renamed from: rs1.z */
public final class C13554z extends UIComponent {

    /* renamed from: d */
    public int f38437d = C66114a.f190030b;

    /* renamed from: e */
    public final int f38438e = C66114a.f190031c;

    /* renamed from: f */
    public Rect f38439f = new Rect();

    /* renamed from: g */
    public Rect f38440g = new Rect();

    /* renamed from: h */
    public Rect f38441h = new Rect();

    /* renamed from: i */
    public C60905o f38442i;

    /* renamed from: j */
    public View f38443j;

    /* renamed from: n */
    public View f38444n;

    /* renamed from: o */
    public View f38445o;

    /* renamed from: p */
    public View f38446p;

    /* renamed from: q */
    public View f38447q;

    /* renamed from: r */
    public View f38448r;

    /* renamed from: s */
    public View f38449s;

    /* renamed from: t */
    public boolean f38450t;

    /* renamed from: rs1.z$a */
    public static final class C13555a {
        public C13555a(C8480h hVar) {
        }
    }

    /* renamed from: rs1.z$b */
    public static final class C13556b implements RecyclerViewDrawerSquares.C45117c {

        /* renamed from: d */
        public final /* synthetic */ C13554z f38451d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<RecyclerViewDrawerSquares.C45117c, C13598b0> f38452e;

        /* renamed from: f */
        public final /* synthetic */ FinderMediaLayout f38453f;

        /* renamed from: g */
        public final /* synthetic */ float f38454g;

        /* renamed from: h */
        public final /* synthetic */ float f38455h;

        /* renamed from: i */
        public final /* synthetic */ float f38456i;

        /* renamed from: j */
        public final /* synthetic */ float f38457j;

        /* renamed from: n */
        public final /* synthetic */ int f38458n;

        /* renamed from: o */
        public final /* synthetic */ float f38459o;

        /* renamed from: p */
        public final /* synthetic */ float f38460p;

        /* renamed from: q */
        public final /* synthetic */ float f38461q;

        public C13556b(C13554z zVar, C32226l<? super RecyclerViewDrawerSquares.C45117c, C13598b0> lVar, FinderMediaLayout finderMediaLayout, float f, float f2, float f3, float f4, int i, float f5, float f6, float f7) {
            this.f38451d = zVar;
            this.f38452e = lVar;
            this.f38453f = finderMediaLayout;
            this.f38454g = f;
            this.f38455h = f2;
            this.f38456i = f3;
            this.f38457j = f4;
            this.f38458n = i;
            this.f38459o = f5;
            this.f38460p = f6;
            this.f38461q = f7;
        }

        /* renamed from: e */
        public void mo9497e(float f) {
            float f2 = f;
            if (Float.isNaN(f)) {
                Log.m105924i("FinderAnimateVideoviewUIC", "onDrawerTranslation isNaN percent:" + f2);
                return;
            }
            Log.m105924i("FinderAnimateVideoviewUIC", "onDrawerTranslation percent:" + f2);
            if (Float.isNaN(f) || f2 > 1.0f) {
                f2 = 1.0f;
            } else if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            C13554z zVar = this.f38451d;
            FinderMediaLayout finderMediaLayout = this.f38453f;
            C87412m.m108593f(finderMediaLayout, "mediaLayout");
            float f3 = (float) 1;
            float f4 = f3 - f2;
            float f5 = this.f38454g;
            float f6 = this.f38455h;
            float f7 = this.f38456i;
            float f8 = this.f38457j;
            float f9 = (float) this.f38458n;
            float f15 = this.f38459o;
            float f16 = this.f38460p;
            float f17 = this.f38461q;
            zVar.getClass();
            float f18 = f7 > 1.0f ? ((f7 - 1.0f) * f4) + 1.0f : f7 < 1.0f ? 1.0f - ((1.0f - f7) * f4) : 1.0f;
            float f19 = f8 > 1.0f ? ((f8 - 1.0f) * f4) + 1.0f : f8 < 1.0f ? 1.0f - ((1.0f - f8) * f4) : 1.0f;
            finderMediaLayout.setPivotX(f5);
            finderMediaLayout.setPivotY(f6);
            finderMediaLayout.setScaleX(f18);
            finderMediaLayout.setScaleY(f19);
            finderMediaLayout.setTranslationX(f16 + (f9 * f4));
            finderMediaLayout.setTranslationY(f17 + (f15 * f4));
            View view = zVar.f38443j;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(f3 - f4));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view3 = zVar.f38446p;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(f3 - f4));
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view5 = zVar.f38447q;
            if (view5 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(f3 - f4));
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view7 = zVar.f38448r;
            if (view7 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(Float.valueOf(f3 - f4));
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view7.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            View view9 = zVar.f38449s;
            if (view9 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(Float.valueOf(f3 - f4));
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view9.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAnimateVideoviewUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            float f25 = f3 - f4;
            MegaVideoBulletView megaVideoBulletView = ((C63513a1) C39818r.f106831a.mo62444c(zVar.getActivity()).mo75002a(C63513a1.class)).f180149p;
            if (megaVideoBulletView != null) {
                megaVideoBulletView.setAlpha(f25);
            }
            if (f2 == 0.0f) {
                Log.m105924i("FinderAnimateVideoviewUIC", "onDrawerTranslation end");
                return;
            }
            if (f2 == 1.0f) {
                Log.m105924i("FinderAnimateVideoviewUIC", "onDrawerTranslation start");
            }
        }

        /* renamed from: f */
        public void mo9498f() {
            Log.m105924i("FinderAnimateVideoviewUIC", "onDrawerDetach");
            this.f38452e.invoke(this);
            this.f38451d.f38450t = false;
        }

        /* renamed from: g */
        public void mo3766g(boolean z, boolean z2, int i) {
            boolean z3;
            Log.m105924i("FinderAnimateVideoviewUIC", "onDrawerOpen isOpen:" + z + " isBegin:" + z2);
            C13554z zVar = this.f38451d;
            if (z || z2) {
                z3 = true;
            } else {
                this.f38452e.invoke(this);
                z3 = false;
            }
            zVar.f38450t = z3;
        }
    }

    /* renamed from: rs1.z$c */
    public static final class C13557c implements RecyclerViewDrawerSquares.C45117c {
        /* renamed from: e */
        public void mo9497e(float f) {
            Log.m105924i("FinderAnimateVideoviewUIC", "null onDrawerTranslation percent:" + f);
        }

        /* renamed from: f */
        public void mo9498f() {
            Log.m105924i("FinderAnimateVideoviewUIC", "null onDrawerDetach");
        }

        /* renamed from: g */
        public void mo3766g(boolean z, boolean z2, int i) {
            Log.m105924i("FinderAnimateVideoviewUIC", "null onDrawerOpen isOpen:" + z + " isBegin:" + z2);
        }
    }

    /* renamed from: rs1.z$d */
    public static final class C13558d extends C87413o implements C32226l<RecyclerViewDrawerSquares.C45117c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<RecyclerViewDrawerSquares.C45117c, C13598b0> f38462d;

        /* renamed from: e */
        public final /* synthetic */ FinderMediaLayout f38463e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13558d(C32226l<? super RecyclerViewDrawerSquares.C45117c, C13598b0> lVar, FinderMediaLayout finderMediaLayout) {
            super(1);
            this.f38462d = lVar;
            this.f38463e = finderMediaLayout;
        }

        public Object invoke(Object obj) {
            RecyclerViewDrawerSquares.C45117c cVar = (RecyclerViewDrawerSquares.C45117c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            this.f38462d.invoke(cVar);
            this.f38463e.clearAnimation();
            return C13598b0.f38549a;
        }
    }

    static {
        new C13555a((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13554z(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C66114a aVar = C66114a.f190029a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a7  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares.C45117c mo12956c3(androidx.fragment.app.Fragment r23, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r24, jq3.C60905o r25, fy3.C32226l<? super com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares.C45117c, rx3.C13598b0> r26, fy3.C32226l<? super com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares.C45117c, rx3.C13598b0> r27) {
        /*
            r22 = this;
            r12 = r22
            r0 = r23
            r1 = r25
            java.lang.Class<rs1.o> r2 = rs1.C63586o.class
            java.lang.Class<rs1.v3> r3 = rs1.C13484v3.class
            rs1.z$c r4 = new rs1.z$c
            r4.<init>()
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99579z7
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r8 = 1
            if (r6 != r8) goto L_0x0025
            r6 = 1
            goto L_0x0026
        L_0x0025:
            r6 = 0
        L_0x0026:
            java.lang.String r13 = "FinderAnimateVideoviewUIC"
            if (r6 != 0) goto L_0x0031
            java.lang.String r0 = "startAnimateToTopAreaWithView return for isEnableVideoviewAnimate"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r4
        L_0x0031:
            bl3.r r6 = bl3.C39818r.f106831a
            android.content.Context r9 = r1.f173499A
            java.lang.String r10 = "holder.context"
            gy3.C87412m.m108593f(r9, r10)
            bl3.r$a r9 = r6.mo62443b(r9)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC> r10 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class
            bl3.t r9 = r9.mo62449e(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC r9 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) r9
            if (r9 == 0) goto L_0x004f
            boolean r9 = r9.f18676f
            r9 = r9 ^ r8
            if (r9 != r8) goto L_0x004f
            r9 = 1
            goto L_0x0050
        L_0x004f:
            r9 = 0
        L_0x0050:
            if (r9 == 0) goto L_0x0059
            java.lang.String r0 = "startAnimateToTopAreaWithView return for has anim by horizontal video drawer"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            return r4
        L_0x0059:
            if (r24 == 0) goto L_0x0060
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r24.mo3513o()
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r0 == 0) goto L_0x0083
            bl3.r$a r11 = r6.mo62445d(r0)
            androidx.lifecycle.i0 r11 = r11.mo75002a(r3)
            rs1.v3 r11 = (rs1.C13484v3) r11
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r11.f38212j
            if (r11 == 0) goto L_0x0079
            int r11 = r11.mo3480N()
            if (r11 != r8) goto L_0x0079
            r11 = 1
            goto L_0x007a
        L_0x0079:
            r11 = 0
        L_0x007a:
            if (r11 == 0) goto L_0x0083
            java.lang.String r0 = "startAnimateToTopAreaWithView fragment return for isShowGuideTips"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r4
        L_0x0083:
            android.app.Activity r11 = r22.getContext()
            bl3.r$a r11 = r6.mo62443b(r11)
            androidx.lifecycle.i0 r3 = r11.mo75002a(r3)
            rs1.v3 r3 = (rs1.C13484v3) r3
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r3.f38212j
            if (r3 == 0) goto L_0x009d
            int r3 = r3.mo3480N()
            if (r3 != r8) goto L_0x009d
            r3 = 1
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            if (r3 == 0) goto L_0x00a7
            java.lang.String r0 = "startAnimateToTopAreaWithView activity return for isShowGuideTips"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r4
        L_0x00a7:
            r12.f38442i = r1
            r3 = 2131304485(0x7f092025, float:1.8227114E38)
            android.view.View r3 = r1.mo85812D(r3)
            r14 = r3
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r14 = (com.tencent.p014mm.plugin.finder.view.FinderMediaLayout) r14
            if (r14 != 0) goto L_0x00bc
            java.lang.String r0 = "startAnimateToTopAreaWithView return for banner"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r4
        L_0x00bc:
            com.tencent.mm.plugin.finder.view.u7 r3 = r14.getMediaType()
            com.tencent.mm.plugin.finder.view.u7 r11 = com.tencent.p014mm.plugin.finder.view.C4189u7.IMAGE
            if (r3 != r11) goto L_0x00c6
            r3 = 0
            goto L_0x00d4
        L_0x00c6:
            com.tencent.mm.plugin.finder.view.FinderVideoBanner r3 = r14.getVideoBanner()
            android.view.View r3 = r3.getMediaView()
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r3
            gr1.o2 r3 = r3.getVideoView()
        L_0x00d4:
            r14.clearAnimation()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r12.f38441h = r11
            boolean r15 = r3 instanceof gr1.C8405j2
            r16 = 1065353216(0x3f800000, float:1.0)
            r9 = 2
            if (r15 == 0) goto L_0x015a
            if (r10 == 0) goto L_0x00f3
            te3.c21 r11 = r10.getLiveInfo()
            if (r11 == 0) goto L_0x00f3
            int r11 = r11.f182394f
            if (r11 != r8) goto L_0x00f3
            r11 = 1
            goto L_0x00f4
        L_0x00f3:
            r11 = 0
        L_0x00f4:
            gr1.j2 r3 = (gr1.C8405j2) r3
            boolean r15 = r3.isPlaying()
            if (r15 == 0) goto L_0x0153
            float r3 = r3.getVideoRatio()
            int[] r15 = new int[r9]
            wh1.a r7 = wh1.C66114a.f190029a
            r7.mo90152d(r14, r15)
            int r7 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r7 < 0) goto L_0x0127
            int r7 = r12.f38437d
            float r7 = (float) r7
            float r7 = r7 * r16
            float r7 = r7 / r3
            int r7 = (int) r7
            int r8 = r12.f38438e
            int r8 = r8 - r7
            int r8 = r8 / r9
            r19 = 1
            r15 = r15[r19]
            int r8 = r8 + r15
            android.graphics.Rect r15 = new android.graphics.Rect
            int r9 = r12.f38437d
            int r7 = r7 + r8
            r20 = r5
            r5 = 0
            r15.<init>(r5, r8, r9, r7)
            goto L_0x0133
        L_0x0127:
            r20 = r5
            r5 = 0
            android.graphics.Rect r15 = new android.graphics.Rect
            int r7 = r12.f38437d
            int r8 = r12.f38438e
            r15.<init>(r5, r5, r7, r8)
        L_0x0133:
            r12.f38441h = r15
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "startAnimateToTopAreaWithView liveStatusOpen "
            r5.append(r7)
            r5.append(r11)
            java.lang.String r7 = " ratio:"
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            goto L_0x0186
        L_0x0153:
            java.lang.String r0 = "startAnimateToTopAreaWithView return for liveStatusOpen"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r4
        L_0x015a:
            r20 = r5
            boolean r5 = r3 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r5 == 0) goto L_0x0183
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r3
            k03.a r3 = r3.getRenderView()
            java.lang.String r5 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r3, r5)
            android.view.View r3 = (android.view.View) r3
            android.graphics.Rect r5 = r12.f38441h
            r3.getGlobalVisibleRect(r5)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r14.getGlobalVisibleRect(r3)
            int r3 = r3.top
            android.graphics.Rect r5 = r12.f38441h
            int r5 = r5.top
            int r3 = r3 - r5
            r5 = r3
            goto L_0x0187
        L_0x0183:
            r14.getGlobalVisibleRect(r11)
        L_0x0186:
            r5 = 0
        L_0x0187:
            android.graphics.Rect r3 = r12.f38441h
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startAnimateToTopAreaWithView return for visibleRect isEmpty :"
            r0.append(r1)
            android.graphics.Rect r1 = r12.f38441h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r4
        L_0x01a7:
            r3 = 2131302894(0x7f0919ee, float:1.8223887E38)
            android.view.View r3 = r1.mo85812D(r3)
            r12.f38443j = r3
            androidx.appcompat.app.AppCompatActivity r3 = r22.getActivity()
            bl3.r$a r3 = r6.mo62444c(r3)
            java.lang.Class<rs1.r4> r7 = rs1.C13392r4.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r7)
            rs1.r4 r3 = (rs1.C13392r4) r3
            android.view.View r3 = r3.f37938e
            if (r3 == 0) goto L_0x01c5
            goto L_0x01c6
        L_0x01c5:
            r3 = 0
        L_0x01c6:
            if (r3 == 0) goto L_0x01c9
            goto L_0x01d4
        L_0x01c9:
            androidx.appcompat.app.AppCompatActivity r3 = r22.getActivity()
            r7 = 2131305281(0x7f092341, float:1.8228728E38)
            android.view.View r3 = r3.findViewById(r7)
        L_0x01d4:
            r12.f38446p = r3
            r3 = 2131306197(0x7f0926d5, float:1.8230586E38)
            android.view.View r3 = r1.mo85812D(r3)
            r12.f38447q = r3
            if (r0 == 0) goto L_0x01f6
            bl3.r$a r3 = r6.mo62445d(r0)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r2)
            rs1.o r3 = (rs1.C63586o) r3
            rx3.g r3 = r3.f180305e
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x01f7
        L_0x01f6:
            r3 = 0
        L_0x01f7:
            r12.f38448r = r3
            if (r0 == 0) goto L_0x0210
            bl3.r$a r0 = r6.mo62445d(r0)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            rs1.o r0 = (rs1.C63586o) r0
            rx3.g r0 = r0.f180306f
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0211
        L_0x0210:
            r0 = 0
        L_0x0211:
            r12.f38449s = r0
            r0 = 2131305309(0x7f09235d, float:1.8228785E38)
            android.view.View r2 = r1.mo85812D(r0)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r2 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r2
            if (r2 == 0) goto L_0x0221
            r2.mo4297w()
        L_0x0221:
            android.view.View r0 = r1.mo85812D(r0)
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r0 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r0
            if (r0 == 0) goto L_0x022c
            r0.mo4295t()
        L_0x022c:
            if (r10 == 0) goto L_0x0247
            java.util.LinkedList r0 = r10.getMediaList()
            if (r0 == 0) goto L_0x0247
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x0247
            te3.vf1 r0 = r0.f185276p0
            if (r0 == 0) goto L_0x0247
            boolean r0 = r0.f185883f
            r1 = 1
            if (r0 != r1) goto L_0x0247
            r15 = 1
            goto L_0x0248
        L_0x0247:
            r15 = 0
        L_0x0248:
            r20.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99145C7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x025c
            r0 = 1
            goto L_0x025d
        L_0x025c:
            r0 = 0
        L_0x025d:
            if (r0 == 0) goto L_0x0377
            if (r15 != 0) goto L_0x0377
            if (r10 == 0) goto L_0x0274
            java.util.LinkedList r0 = r10.getMediaList()
            if (r0 == 0) goto L_0x0274
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            if (r0 == 0) goto L_0x0274
            te3.vf1 r0 = r0.f185276p0
            goto L_0x0275
        L_0x0274:
            r0 = 0
        L_0x0275:
            android.graphics.Rect r1 = r12.f38441h
            java.lang.String r2 = "visibleRect"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "fixVisibleRect return visibleRect:"
            if (r0 != 0) goto L_0x029a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = " for null"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            goto L_0x0379
        L_0x029a:
            boolean r3 = r0.f185882e
            if (r3 != 0) goto L_0x02bc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = " for is_split_screen:"
            r3.append(r2)
            boolean r0 = r0.f185882e
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            goto L_0x0379
        L_0x02bc:
            float r3 = r0.f185884g
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 < 0) goto L_0x035a
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x02c9
            goto L_0x035a
        L_0x02c9:
            float r3 = r0.f185885h
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x033d
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d4
            goto L_0x033d
        L_0x02d4:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r1)
            int r3 = r1.top
            float r3 = (float) r3
            int r6 = r1.height()
            float r6 = (float) r6
            float r7 = r0.f185884g
            float r6 = r6 * r7
            float r3 = r3 + r6
            int r3 = iy3.C60641c.m70921b(r3)
            r2.top = r3
            int r3 = r1.top
            float r3 = (float) r3
            int r6 = r1.height()
            float r6 = (float) r6
            float r0 = r0.f185885h
            float r6 = r6 * r0
            float r3 = r3 + r6
            int r0 = iy3.C60641c.m70921b(r3)
            r2.bottom = r0
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x031f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "fixVisibleRect return targetRect:"
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = " for isEmpty"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            goto L_0x0379
        L_0x031f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "fixVisibleRect success from visibleRect:"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = " to targetRect:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            r1 = r2
            goto L_0x0379
        L_0x033d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = " for invalid down_percent_position:"
            r3.append(r2)
            float r0 = r0.f185885h
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            goto L_0x0379
        L_0x035a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = " for invalid up_percent_position:"
            r3.append(r2)
            float r0 = r0.f185884g
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            goto L_0x0379
        L_0x0377:
            android.graphics.Rect r1 = r12.f38441h
        L_0x0379:
            r12.f38439f = r1
            int r0 = r1.width()
            float r0 = (float) r0
            float r0 = r0 * r16
            android.graphics.Rect r1 = r12.f38439f
            int r1 = r1.height()
            float r1 = (float) r1
            float r11 = r0 / r1
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x03be
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99127A7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x03a0
            r0 = 1
            goto L_0x03a1
        L_0x03a0:
            r0 = 0
        L_0x03a1:
            if (r0 != 0) goto L_0x03be
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startAnimateToTopAreaWithView return for videoRatio:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " isEnablePortraitVideoAnimate"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            return r4
        L_0x03be:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r15 == 0) goto L_0x0444
            android.graphics.Rect r1 = r12.f38439f
            ds1.a r2 = ds1.C7515a.f25777a
            android.app.Activity r3 = r22.getContext()
            float r2 = r2.mo8637a(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "createFitCenterTargetRect halfScreenRatio:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            er1.r3 r4 = er1.C7865r3.f26468a
            android.app.Activity r5 = r22.getContext()
            int r5 = r4.mo8969b(r5)
            float r5 = (float) r5
            r6 = 1
            float r7 = (float) r6
            float r7 = r7 - r2
            float r5 = r5 * r7
            int r2 = r1.width()
            float r6 = (float) r2
            float r7 = r6 * r16
            float r7 = r7 / r5
            int r8 = r1.width()
            float r8 = (float) r8
            float r8 = r8 * r16
            int r1 = r1.height()
            float r1 = (float) r1
            float r8 = r8 / r1
            int r1 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0431
            float r8 = r8 * r5
            r1 = 0
            r3.top = r1
            int r1 = r4.mo8970c()
            float r1 = (float) r1
            float r1 = r1 - r8
            float r1 = r1 * r16
            r2 = 2
            float r2 = (float) r2
            float r1 = r1 / r2
            int r1 = (int) r1
            r3.left = r1
            float r1 = (float) r1
            float r1 = r1 + r8
            int r1 = (int) r1
            r3.right = r1
            int r1 = r3.top
            float r1 = (float) r1
            float r1 = r1 + r5
            int r1 = (int) r1
            r3.bottom = r1
            goto L_0x0573
        L_0x0431:
            float r6 = r6 / r8
            float r5 = r5 - r6
            float r5 = r5 / r0
            int r1 = (int) r5
            r3.top = r1
            r4 = 0
            r3.left = r4
            int r2 = r2 + r4
            r3.right = r2
            float r1 = (float) r1
            float r1 = r1 + r6
            int r1 = (int) r1
            r3.bottom = r1
            goto L_0x0573
        L_0x0444:
            java.lang.String r1 = " videoRatio:"
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x04f3
            android.graphics.Rect r2 = r12.f38439f
            ds1.a r3 = ds1.C7515a.f25777a
            android.app.Activity r4 = r22.getContext()
            float r3 = r3.mo8637a(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            er1.r3 r6 = er1.C7865r3.f26468a
            android.app.Activity r7 = r22.getContext()
            int r7 = r6.mo8969b(r7)
            float r7 = (float) r7
            r8 = 1
            float r9 = (float) r8
            float r9 = r9 - r3
            float r7 = r7 * r9
            int r8 = r2.width()
            float r8 = (float) r8
            float r8 = r8 * r16
            int r9 = r2.height()
            float r9 = (float) r9
            float r8 = r8 / r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "createLandscapeTargetRect centerYOffset:"
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = " halfScreenRatio:"
            r9.append(r10)
            r9.append(r3)
            r9.append(r1)
            r9.append(r8)
            java.lang.String r1 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            r1 = 1071877689(0x3fe38e39, float:1.7777778)
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x04d8
            float r8 = r8 * r7
            float r1 = r8 * r16
            int r2 = r2.width()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r5
            float r1 = r1 - r16
            float r2 = r2 * r1
            int r1 = (int) r2
            r4.top = r1
            int r1 = r6.mo8970c()
            float r1 = (float) r1
            float r1 = r1 - r8
            float r1 = r1 * r16
            r2 = 2
            float r2 = (float) r2
            float r1 = r1 / r2
            int r1 = iy3.C60641c.m70921b(r1)
            r4.left = r1
            float r1 = (float) r1
            float r1 = r1 + r8
            int r1 = iy3.C60641c.m70921b(r1)
            r4.right = r1
            int r1 = r4.top
            float r1 = (float) r1
            float r1 = r1 + r7
            int r1 = iy3.C60641c.m70921b(r1)
            r4.bottom = r1
            goto L_0x0572
        L_0x04d8:
            int r1 = r2.height()
            float r1 = (float) r1
            float r7 = r7 - r1
            float r7 = r7 / r0
            int r1 = (int) r7
            r4.top = r1
            int r3 = r2.left
            r4.left = r3
            int r3 = r2.right
            r4.right = r3
            int r2 = r2.height()
            int r1 = r1 + r2
            r4.bottom = r1
            goto L_0x0572
        L_0x04f3:
            android.graphics.Rect r2 = r12.f38439f
            ds1.a r3 = ds1.C7515a.f25777a
            android.app.Activity r4 = r22.getContext()
            float r3 = r3.mo8637a(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            er1.r3 r5 = er1.C7865r3.f26468a
            android.app.Activity r6 = r22.getContext()
            int r6 = r5.mo8969b(r6)
            float r6 = (float) r6
            r7 = 1
            float r8 = (float) r7
            float r8 = r8 - r3
            float r6 = r6 * r8
            int r7 = r2.width()
            float r7 = (float) r7
            float r7 = r7 * r16
            int r2 = r2.height()
            float r2 = (float) r2
            float r7 = r7 / r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "createPortraitTargetRect halfScreenRatio:"
            r2.append(r8)
            r2.append(r3)
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            r1 = 1061158912(0x3f400000, float:0.75)
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x0576
            float r1 = r1 * r6
            float r2 = r1 / r7
            float r6 = r6 - r2
            float r6 = r6 * r16
            r3 = 2
            float r3 = (float) r3
            float r6 = r6 / r3
            int r6 = iy3.C60641c.m70921b(r6)
            r4.top = r6
            int r5 = r5.mo8970c()
            float r5 = (float) r5
            float r5 = r5 - r1
            float r5 = r5 * r16
            float r5 = r5 / r3
            int r3 = iy3.C60641c.m70921b(r5)
            r4.left = r3
            float r3 = (float) r3
            float r3 = r3 + r1
            int r1 = iy3.C60641c.m70921b(r3)
            r4.right = r1
            int r1 = r4.top
            float r1 = (float) r1
            float r1 = r1 + r2
            int r1 = iy3.C60641c.m70921b(r1)
            r4.bottom = r1
        L_0x0572:
            r3 = r4
        L_0x0573:
            r4 = r3
            r1 = 0
            goto L_0x059e
        L_0x0576:
            float r7 = r7 * r6
            r1 = 0
            r4.top = r1
            int r2 = r5.mo8970c()
            float r2 = (float) r2
            float r2 = r2 - r7
            float r2 = r2 * r16
            r3 = 2
            float r3 = (float) r3
            float r2 = r2 / r3
            int r2 = iy3.C60641c.m70921b(r2)
            r4.left = r2
            float r2 = (float) r2
            float r2 = r2 + r7
            int r2 = iy3.C60641c.m70921b(r2)
            r4.right = r2
            int r2 = r4.top
            float r2 = (float) r2
            float r2 = r2 + r6
            int r2 = iy3.C60641c.m70921b(r2)
            r4.bottom = r2
        L_0x059e:
            r12.f38440g = r4
            android.graphics.Rect r2 = r12.f38441h
            int r2 = r2.width()
            float r2 = (float) r2
            float r10 = r2 / r0
            android.graphics.Rect r2 = r12.f38441h
            int r2 = r2.height()
            float r2 = (float) r2
            float r9 = r2 / r0
            float r18 = r14.getTranslationX()
            float r20 = r14.getTranslationY()
            android.graphics.Rect r2 = r12.f38440g
            int r2 = r2.width()
            float r2 = (float) r2
            float r2 = r2 * r16
            android.graphics.Rect r3 = r12.f38439f
            int r3 = r3.width()
            float r3 = (float) r3
            float r6 = r2 / r3
            android.graphics.Rect r2 = r12.f38440g
            int r2 = r2.height()
            float r2 = (float) r2
            float r2 = r2 * r16
            android.graphics.Rect r3 = r12.f38439f
            int r3 = r3.height()
            float r3 = (float) r3
            float r7 = r2 / r3
            android.graphics.Rect r2 = r12.f38440g
            int r3 = r2.top
            int r4 = r2.bottom
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r0
            android.graphics.Rect r4 = r12.f38441h
            int r5 = r4.top
            int r4 = r4.bottom
            int r5 = r5 + r4
            float r4 = (float) r5
            float r4 = r4 / r0
            android.graphics.Rect r5 = r12.f38439f
            int r8 = r5.top
            int r5 = r5.bottom
            int r8 = r8 + r5
            float r5 = (float) r8
            float r5 = r5 / r0
            int r0 = r2.centerX()
            android.graphics.Rect r2 = r12.f38441h
            int r2 = r2.centerX()
            int r8 = r0 - r2
            float r3 = r3 - r4
            float r5 = r5 - r4
            float r5 = r5 * r7
            float r16 = r3 - r5
            rs1.z$d r2 = new rs1.z$d
            r0 = r27
            r2.<init>(r0, r14)
            r14.clearAnimation()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99154D7
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3 = 1
            if (r0 != r3) goto L_0x0625
            r1 = 1
        L_0x0625:
            if (r1 == 0) goto L_0x06aa
            android.graphics.Rect r0 = r12.f38439f
            jq3.o r1 = r12.f38442i
            if (r1 == 0) goto L_0x0635
            r3 = 2131309065(0x7f093209, float:1.8236403E38)
            android.view.View r1 = r1.mo85812D(r3)
            goto L_0x0636
        L_0x0635:
            r1 = 0
        L_0x0636:
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x063d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x063e
        L_0x063d:
            r1 = 0
        L_0x063e:
            if (r1 != 0) goto L_0x0646
            java.lang.String r0 = "addMaskInHolder return for null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            goto L_0x06aa
        L_0x0646:
            android.view.View r3 = new android.view.View
            androidx.appcompat.app.AppCompatActivity r4 = r22.getActivity()
            r3.<init>(r4)
            r12.f38444n = r3
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r5 = 1
            r3.<init>(r4, r5)
            int r5 = r0.top
            r3.topMargin = r5
            android.view.View r5 = r12.f38444n
            r4 = 2131101358(0x7f0606ae, float:1.7815123E38)
            r24 = r11
            if (r5 != 0) goto L_0x0666
            goto L_0x0671
        L_0x0666:
            android.app.Activity r11 = r22.getContext()
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r4)
            r5.setBackground(r11)
        L_0x0671:
            android.view.View r5 = new android.view.View
            androidx.appcompat.app.AppCompatActivity r11 = r22.getActivity()
            r5.<init>(r11)
            r12.f38445o = r5
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r4 = 1
            r11 = -1
            r5.<init>(r11, r4)
            int r0 = r0.bottom
            r5.topMargin = r0
            android.view.View r0 = r12.f38445o
            if (r0 != 0) goto L_0x068c
            goto L_0x069a
        L_0x068c:
            android.app.Activity r4 = r22.getContext()
            r11 = 2131101358(0x7f0606ae, float:1.7815123E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r11)
            r0.setBackground(r4)
        L_0x069a:
            android.view.View r0 = r12.f38444n
            r1.addView(r0, r3)
            android.view.View r0 = r12.f38445o
            r1.addView(r0, r5)
            java.lang.String r0 = "addMaskInHolder maskView:null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            goto L_0x06ac
        L_0x06aa:
            r24 = r11
        L_0x06ac:
            rs1.z$b r11 = new rs1.z$b
            r0 = r11
            r1 = r22
            r3 = r14
            r4 = r10
            r5 = r9
            r17 = r13
            r13 = r9
            r9 = r16
            r12 = r10
            r10 = r18
            r21 = r24
            r16 = r13
            r13 = r11
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r26
            r0.invoke(r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "startAnimateToTopAreaWithView is_disable_follow:"
            r0.append(r1)
            r0.append(r15)
            java.lang.String r1 = " bannerPivot["
            r0.append(r1)
            float r1 = r14.getPivotX()
            r0.append(r1)
            java.lang.String r1 = " x "
            r0.append(r1)
            float r2 = r14.getPivotY()
            r0.append(r2)
            java.lang.String r2 = "] pivot["
            r0.append(r2)
            r0.append(r12)
            r0.append(r1)
            r2 = r16
            r0.append(r2)
            java.lang.String r1 = "] videoRatio:"
            r0.append(r1)
            r1 = r21
            r0.append(r1)
            java.lang.String r1 = " sourceRect:"
            r0.append(r1)
            r1 = r22
            android.graphics.Rect r2 = r1.f38439f
            r0.append(r2)
            java.lang.String r2 = " targetRect:"
            r0.append(r2)
            android.graphics.Rect r2 = r1.f38440g
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13554z.mo12956c3(androidx.fragment.app.Fragment, com.tencent.mm.plugin.finder.model.BaseFinderFeed, jq3.o, fy3.l, fy3.l):com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$c");
    }
}
