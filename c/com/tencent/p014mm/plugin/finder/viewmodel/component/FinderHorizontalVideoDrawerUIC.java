package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import as1.C0201a;
import bl3.C39818r;
import bs1.C0375d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rs1.C13298k5;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC */
public final class FinderHorizontalVideoDrawerUIC extends UIComponent {

    /* renamed from: d */
    public C0201a f18674d;

    /* renamed from: e */
    public View f18675e;

    /* renamed from: f */
    public boolean f18676f = true;

    /* renamed from: g */
    public boolean f18677g;

    /* renamed from: h */
    public final FinderHorizontalVideoDrawerUIC$videoFinishListener$1 f18678h;

    /* renamed from: i */
    public C60905o f18679i;

    /* renamed from: j */
    public Rect f18680j;

    /* renamed from: n */
    public Rect f18681n;

    /* renamed from: o */
    public final C13601g f18682o;

    /* renamed from: p */
    public final C13601g f18683p;

    /* renamed from: q */
    public final C13601g f18684q;

    /* renamed from: r */
    public final C13601g f18685r;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$a */
    public final class C4275a extends C0375d {

        /* renamed from: b */
        public RecyclerViewDrawerSquares.C45117c f18686b;

        /* renamed from: c */
        public boolean f18687c;

        public C4275a() {
        }

        /* renamed from: b */
        public void mo412b(C0201a aVar) {
            C87412m.m108594g(aVar, "layout");
        }

        /* renamed from: c */
        public void mo413c(C0201a aVar) {
            C87412m.m108594g(aVar, "layout");
            FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = FinderHorizontalVideoDrawerUIC.this;
            finderHorizontalVideoDrawerUIC.f18676f = false;
            ((C13298k5) C39818r.f106831a.mo62444c(finderHorizontalVideoDrawerUIC.getActivity()).mo75002a(C13298k5.class)).mo12750i3().requestLayout();
            Log.m105924i("FinderHorizontalVideoDrawerUIC", "onDrawerExpand:");
        }

        /* renamed from: d */
        public void mo414d(C0201a aVar) {
            C87412m.m108594g(aVar, "layout");
        }

        /* renamed from: e */
        public void mo411e(C0201a aVar) {
            C87412m.m108594g(aVar, "layout");
            Log.m105924i("FinderHorizontalVideoDrawerUIC", "onDrawerPeek:");
            FinderHorizontalVideoDrawerUIC.this.f18676f = true;
            this.f18687c = false;
            RecyclerViewDrawerSquares.C45117c cVar = this.f18686b;
            if (cVar != null) {
                cVar.mo3766g(false, false, 0);
            }
            this.f18686b = null;
        }

        /* JADX WARNING: type inference failed for: r1v19 */
        /* JADX WARNING: type inference failed for: r1v20, types: [com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$c] */
        /* JADX WARNING: type inference failed for: r1v58, types: [android.view.ViewGroup] */
        /* JADX WARNING: type inference failed for: r9v11, types: [rs1.i5] */
        /* JADX WARNING: type inference failed for: r1v66 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo409f(as1.C0201a r29, float r30, java.lang.String r31) {
            /*
                r28 = this;
                r0 = r28
                r1 = r30
                r2 = r31
                java.lang.Class<rs1.k5> r3 = rs1.C13298k5.class
                java.lang.String r4 = "layout"
                r5 = r29
                gy3.C87412m.m108594g(r5, r4)
                java.lang.String r4 = "source"
                gy3.C87412m.m108594g(r2, r4)
                super.mo409f(r29, r30, r31)
                float r4 = r29.getBorderExpand()
                float r4 = r1 - r4
                r6 = 1065353216(0x3f800000, float:1.0)
                float r4 = r4 * r6
                float r7 = r29.getBorderClose()
                float r8 = r29.getBorderExpand()
                float r7 = r7 - r8
                float r8 = r29.getPeekHeight()
                float r7 = r7 - r8
                float r4 = r4 / r7
                r7 = 0
                java.lang.Float r8 = java.lang.Float.valueOf(r7)
                int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r9 >= 0) goto L_0x003b
                r4 = 0
            L_0x003b:
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 <= 0) goto L_0x0041
                r4 = 1065353216(0x3f800000, float:1.0)
            L_0x0041:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "onTranslationChange: source="
                r9.append(r10)
                r9.append(r2)
                java.lang.String r10 = ", translation: "
                r9.append(r10)
                r9.append(r1)
                java.lang.String r1 = ", percent: "
                r9.append(r1)
                r9.append(r4)
                java.lang.String r1 = ", borderExpand="
                r9.append(r1)
                float r1 = r29.getBorderExpand()
                r9.append(r1)
                java.lang.String r1 = ", borderClose="
                r9.append(r1)
                float r1 = r29.getBorderClose()
                r9.append(r1)
                java.lang.String r1 = ", peekHeight="
                r9.append(r1)
                float r1 = r29.getPeekHeight()
                r9.append(r1)
                java.lang.String r1 = r9.toString()
                java.lang.String r5 = "FinderHorizontalVideoDrawerUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                java.lang.String r1 = "onScroll"
                boolean r1 = gy3.C87412m.m108589b(r2, r1)
                r2 = 2
                if (r1 == 0) goto L_0x00a8
                bl3.r r1 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC r9 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.this
                androidx.appcompat.app.AppCompatActivity r9 = r9.getActivity()
                bl3.r$a r1 = r1.mo62444c(r9)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
                rs1.k5 r1 = (rs1.C13298k5) r1
                r1.f37738e = r2
            L_0x00a8:
                boolean r1 = r0.f18687c
                if (r1 != 0) goto L_0x0331
                int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r1 <= 0) goto L_0x0331
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC r11 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.this
                r11.getClass()
                bl3.r r1 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r9 = r11.getActivity()
                bl3.r$a r1 = r1.mo62444c(r9)
                androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
                rs1.k5 r1 = (rs1.C13298k5) r1
                jq3.o r10 = r1.mo12748f3()
                r1 = 0
                if (r10 != 0) goto L_0x00d7
                java.lang.String r2 = "startVideoAnim: holder is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
                r11.mo5147l3()
                goto L_0x032a
            L_0x00d7:
                r11.f18679i = r10
                r3 = 2131304482(0x7f092022, float:1.8227108E38)
                android.view.View r3 = r10.mo85812D(r3)
                r12 = r3
                com.tencent.mm.plugin.finder.view.FinderVideoBanner r12 = (com.tencent.p014mm.plugin.finder.view.FinderVideoBanner) r12
                android.view.View r3 = r12.getMediaView()
                com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r3
                gr1.o2 r3 = r3.getVideoView()
                r12.clearAnimation()
                boolean r9 = r3 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
                if (r9 == 0) goto L_0x0312
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r3
                k03.a r3 = r3.getRenderView()
                java.lang.String r9 = "null cannot be cast to non-null type android.view.View"
                gy3.C87412m.m108592e(r3, r9)
                android.view.View r3 = (android.view.View) r3
                android.graphics.Rect r9 = r11.f18681n
                r3.getGlobalVisibleRect(r9)
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                r12.getGlobalVisibleRect(r3)
                android.graphics.Rect r3 = r11.f18681n
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x012f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "startVideoAnim: is empty, sourceRect="
                r2.append(r3)
                android.graphics.Rect r3 = r11.f18681n
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
                goto L_0x032a
            L_0x012f:
                r3 = 2131305309(0x7f09235d, float:1.8228785E38)
                android.view.View r5 = r10.mo85812D(r3)
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r5 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r5
                r9 = 0
                if (r5 == 0) goto L_0x0159
                lu3.c r13 = r5.getHideSeekbarTask()
                if (r13 == 0) goto L_0x0144
                r13.cancel(r9)
            L_0x0144:
                java.lang.String r13 = "horizontalVideoAnimOpen"
                gr1.C59667n2.C8415a.m8377a(r5, r13, r9, r2, r1)
                r14 = 0
                r15 = 0
                r17 = 1
                r18 = 2
                r19 = 0
                r13 = r5
                com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout.m4087z(r13, r14, r15, r17, r18, r19)
                r5.setPlayIconState(r9)
            L_0x0159:
                r11.mo5146k3(r10)
                com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.m4456d3(r11, r10)
                r11.mo5145j3(r10)
                com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.m4455c3(r11, r10)
                android.view.View r2 = r10.mo85812D(r3)
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r2 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r2
                if (r2 == 0) goto L_0x0170
                r2.mo4297w()
            L_0x0170:
                android.view.View r2 = r10.mo85812D(r3)
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout r2 = (com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout) r2
                if (r2 == 0) goto L_0x017b
                r2.mo4295t()
            L_0x017b:
                android.widget.FrameLayout r2 = r11.mo5143g3()
                android.view.ViewParent r2 = r2.getParent()
                boolean r2 = gy3.C87412m.m108589b(r2, r12)
                if (r2 != 0) goto L_0x01a9
                android.widget.FrameLayout r2 = r11.mo5143g3()
                android.view.ViewParent r2 = r2.getParent()
                boolean r3 = r2 instanceof android.view.ViewGroup
                if (r3 == 0) goto L_0x0198
                r1 = r2
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            L_0x0198:
                if (r1 == 0) goto L_0x01a1
                android.widget.FrameLayout r2 = r11.mo5143g3()
                r1.removeView(r2)
            L_0x01a1:
                android.widget.FrameLayout r1 = r11.mo5143g3()
                r2 = -1
                r12.addView(r1, r2, r2)
            L_0x01a9:
                rx3.g r1 = r11.f18683p
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                android.view.View r1 = (android.view.View) r1
                rs1.h5 r2 = new rs1.h5
                r2.<init>(r11)
                r1.setOnClickListener(r2)
                rx3.g r1 = r11.f18682o
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                android.view.View r1 = (android.view.View) r1
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
                r2.mo10233c(r3)
                java.lang.Object[] r14 = r2.mo10232b()
                java.lang.String r15 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC"
                java.lang.String r16 = "startVideoAnim"
                java.lang.String r17 = "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r1
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r2 = r2.mo10231a(r9)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r14 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC"
                java.lang.String r15 = "startVideoAnim"
                java.lang.String r16 = "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                android.widget.FrameLayout r1 = r11.mo5143g3()
                r1.setVisibility(r9)
                android.widget.FrameLayout r1 = r11.mo5143g3()
                r1.setAlpha(r7)
                rx3.g r1 = r11.f18683p
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                android.view.View r1 = (android.view.View) r1
                k20.a r2 = new k20.a
                r2.<init>()
                r2.mo10233c(r8)
                java.lang.Object[] r14 = r2.mo10232b()
                java.lang.String r15 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC"
                java.lang.String r16 = "startVideoAnim"
                java.lang.String r17 = "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setAlpha"
                java.lang.String r20 = "(F)V"
                r13 = r1
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r2 = r2.mo10231a(r9)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r1.setAlpha(r2)
                java.lang.String r14 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC"
                java.lang.String r15 = "startVideoAnim"
                java.lang.String r16 = "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setAlpha"
                java.lang.String r19 = "(F)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                android.view.View r1 = r11.mo5142f3()
                k20.a r2 = new k20.a
                r2.<init>()
                r2.mo10233c(r8)
                java.lang.Object[] r21 = r2.mo10232b()
                java.lang.String r22 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC"
                java.lang.String r23 = "startVideoAnim"
                java.lang.String r24 = "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;"
                java.lang.String r25 = "android/view/View_EXEC_"
                java.lang.String r26 = "setAlpha"
                java.lang.String r27 = "(F)V"
                r20 = r1
                j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
                java.lang.Object r2 = r2.mo10231a(r9)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r1.setAlpha(r2)
                java.lang.String r21 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC"
                java.lang.String r22 = "startVideoAnim"
                java.lang.String r23 = "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;"
                java.lang.String r24 = "android/view/View_EXEC_"
                java.lang.String r25 = "setAlpha"
                java.lang.String r26 = "(F)V"
                j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
                rx3.g r1 = r11.f18683p
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                android.view.View r1 = (android.view.View) r1
                android.graphics.Rect r2 = r11.f18680j
                r1.getGlobalVisibleRect(r2)
                android.graphics.Rect r1 = r11.f18681n
                int r1 = r1.width()
                float r1 = (float) r1
                r2 = 1073741824(0x40000000, float:2.0)
                float r13 = r1 / r2
                android.graphics.Rect r1 = r11.f18681n
                int r1 = r1.height()
                float r1 = (float) r1
                float r14 = r1 / r2
                float r19 = r12.getTranslationX()
                float r20 = r12.getTranslationY()
                android.graphics.Rect r1 = r11.f18680j
                int r1 = r1.width()
                float r1 = (float) r1
                float r1 = r1 * r6
                android.graphics.Rect r3 = r11.f18681n
                int r3 = r3.width()
                float r3 = (float) r3
                float r15 = r1 / r3
                android.graphics.Rect r1 = r11.f18680j
                int r1 = r1.height()
                float r1 = (float) r1
                float r1 = r1 * r6
                android.graphics.Rect r3 = r11.f18681n
                int r3 = r3.height()
                float r3 = (float) r3
                float r16 = r1 / r3
                android.graphics.Rect r1 = r11.f18680j
                int r3 = r1.top
                int r5 = r1.bottom
                int r3 = r3 + r5
                float r3 = (float) r3
                float r3 = r3 / r2
                android.graphics.Rect r5 = r11.f18681n
                int r6 = r5.top
                int r5 = r5.bottom
                int r6 = r6 + r5
                float r5 = (float) r6
                float r5 = r5 / r2
                int r1 = r1.centerX()
                android.graphics.Rect r2 = r11.f18681n
                int r2 = r2.centerX()
                int r17 = r1 - r2
                float r18 = r3 - r5
                rs1.i5 r1 = new rs1.i5
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                goto L_0x032a
            L_0x0312:
                r11.mo5147l3()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = "startVideoAnim: finderPlayView="
                r2.append(r6)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            L_0x032a:
                r0.f18686b = r1
                if (r1 == 0) goto L_0x0331
                r1 = 1
                r0.f18687c = r1
            L_0x0331:
                com.tencent.mm.view.drawer.RecyclerViewDrawerSquares$c r1 = r0.f18686b
                if (r1 == 0) goto L_0x033a
                rs1.i5 r1 = (rs1.C13272i5) r1
                r1.mo9497e(r4)
            L_0x033a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.C4275a.mo409f(as1.a, float, java.lang.String):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$b */
    public static final class C4276b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f18689d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f18690e;

        /* renamed from: f */
        public final /* synthetic */ FinderHorizontalVideoDrawerUIC f18691f;

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$b$a */
        public static final class C4277a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60905o f18692d;

            /* renamed from: e */
            public final /* synthetic */ FinderHorizontalVideoDrawerUIC f18693e;

            public C4277a(C60905o oVar, FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
                this.f18692d = oVar;
                this.f18693e = finderHorizontalVideoDrawerUIC;
            }

            public final void run() {
                FinderHorizontalVideoDrawerUIC.m4455c3(this.f18693e, this.f18692d);
            }
        }

        public C4276b(View view, C60905o oVar, FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
            this.f18689d = view;
            this.f18690e = oVar;
            this.f18691f = finderHorizontalVideoDrawerUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$applyShrinkOpLayout$refreshComment$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18689d.performClick();
            this.f18689d.post(new C4277a(this.f18690e, this.f18691f));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$applyShrinkOpLayout$refreshComment$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$c */
    public static final class C4278c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f18694d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f18695e;

        /* renamed from: f */
        public final /* synthetic */ FinderHorizontalVideoDrawerUIC f18696f;

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$c$a */
        public static final class C4279a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60905o f18697d;

            /* renamed from: e */
            public final /* synthetic */ FinderHorizontalVideoDrawerUIC f18698e;

            public C4279a(C60905o oVar, FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
                this.f18697d = oVar;
                this.f18698e = finderHorizontalVideoDrawerUIC;
            }

            public final void run() {
                FinderHorizontalVideoDrawerUIC.m4456d3(this.f18698e, this.f18697d);
            }
        }

        public C4278c(View view, C60905o oVar, FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
            this.f18694d = view;
            this.f18695e = oVar;
            this.f18696f = finderHorizontalVideoDrawerUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$applyShrinkOpLayout$refreshShare$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18694d.performClick();
            this.f18694d.post(new C4279a(this.f18695e, this.f18696f));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$applyShrinkOpLayout$refreshShare$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$d */
    public static final class C4280d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f18699d;

        public C4280d(View view) {
            this.f18699d = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$refreshLike$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18699d.performClick();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$refreshLike$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$e */
    public static final class C4281e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f18700d;

        public C4281e(View view) {
            this.f18700d = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$refreshStar$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18700d.performClick();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC$refreshStar$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$f */
    public static final class C4282f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderHorizontalVideoDrawerUIC f18701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4282f(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
            super(0);
            this.f18701d = finderHorizontalVideoDrawerUIC;
        }

        public Object invoke() {
            return this.f18701d.getContext().findViewById(C0966R.C0970id.o3l);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$g */
    public static final class C4283g extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderHorizontalVideoDrawerUIC f18702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4283g(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
            super(0);
            this.f18702d = finderHorizontalVideoDrawerUIC;
        }

        public Object invoke() {
            return this.f18702d.getContext().findViewById(C0966R.C0970id.o3m);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$h */
    public static final class C4284h extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ FinderHorizontalVideoDrawerUIC f18703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4284h(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
            super(0);
            this.f18703d = finderHorizontalVideoDrawerUIC;
        }

        public Object invoke() {
            return this.f18703d.getContext().findViewById(C0966R.C0970id.o3n);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$i */
    public static final class C4285i extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderHorizontalVideoDrawerUIC f18704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4285i(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
            super(0);
            this.f18704d = finderHorizontalVideoDrawerUIC;
        }

        public Object invoke() {
            FrameLayout frameLayout = new FrameLayout(this.f18704d.getContext());
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
            return frameLayout;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHorizontalVideoDrawerUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f18678h = new FinderHorizontalVideoDrawerUIC$videoFinishListener$1(appCompatActivity, this);
        this.f18680j = new Rect();
        this.f18681n = new Rect();
        this.f18682o = C36568h.m40985a(new C4282f(this));
        this.f18683p = C36568h.m40985a(new C4284h(this));
        this.f18684q = C36568h.m40985a(new C4285i(this));
        this.f18685r = C36568h.m40985a(new C4283g(this));
    }

    /* renamed from: c3 */
    public static final void m4455c3(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC, C60905o oVar) {
        View D = oVar.mo85812D(C0966R.C0970id.bjq);
        if (D != null) {
            View findViewById = finderHorizontalVideoDrawerUIC.mo5142f3().findViewById(C0966R.C0970id.bjq);
            int visibility = D.getVisibility();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(visibility));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshComment", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshComment", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(D.isEnabled());
            findViewById.setOnClickListener(new C4276b(D, oVar, finderHorizontalVideoDrawerUIC));
        }
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.f1t);
        if (weImageView != null) {
            WeImageView weImageView2 = (WeImageView) finderHorizontalVideoDrawerUIC.mo5142f3().findViewById(C0966R.C0970id.f1t);
            weImageView2.setIconColor(weImageView.getIconColor());
            weImageView2.setAlpha(weImageView.getAlpha());
            weImageView2.setImageDrawable(weImageView.getDrawable());
            weImageView2.setVisibility(weImageView.getVisibility());
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.bje);
        if (textView != null) {
            TextView textView2 = (TextView) finderHorizontalVideoDrawerUIC.mo5142f3().findViewById(C0966R.C0970id.bje);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    /* renamed from: d3 */
    public static final void m4456d3(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC, C60905o oVar) {
        View D = oVar.mo85812D(C0966R.C0970id.ji4);
        if (D != null) {
            View findViewById = finderHorizontalVideoDrawerUIC.mo5142f3().findViewById(C0966R.C0970id.ji4);
            int visibility = D.getVisibility();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(visibility));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshShare", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshShare", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(D.isEnabled());
            findViewById.setOnClickListener(new C4278c(D, oVar, finderHorizontalVideoDrawerUIC));
        }
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.f358430f22);
        if (weImageView != null) {
            WeImageView weImageView2 = (WeImageView) finderHorizontalVideoDrawerUIC.mo5142f3().findViewById(C0966R.C0970id.f358430f22);
            weImageView2.setIconColor(weImageView.getIconColor());
            weImageView2.setAlpha(weImageView.getAlpha());
            weImageView2.setImageDrawable(weImageView.getDrawable());
            weImageView2.setVisibility(weImageView.getVisibility());
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.jhv);
        if (textView != null) {
            TextView textView2 = (TextView) finderHorizontalVideoDrawerUIC.mo5142f3().findViewById(C0966R.C0970id.jhv);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    /* renamed from: e3 */
    public final C0201a mo5141e3() {
        C0201a aVar = this.f18674d;
        if (aVar != null) {
            return aVar;
        }
        C87412m.m108603p("recommendDrawer");
        throw null;
    }

    /* renamed from: f3 */
    public final View mo5142f3() {
        return (View) ((C36570n) this.f18685r).getValue();
    }

    /* renamed from: g3 */
    public final FrameLayout mo5143g3() {
        return (FrameLayout) ((C36570n) this.f18684q).getValue();
    }

    /* renamed from: i3 */
    public final boolean mo5144i3(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C87412m.m108594g(motionEvent, "e1");
        C87412m.m108594g(motionEvent2, "e2");
        boolean z = true;
        boolean z2 = this.f18676f && mo5141e3().onScroll(motionEvent, motionEvent2, f, f2);
        if (!this.f18677g && !z2) {
            z = false;
        }
        this.f18677g = z;
        return z2;
    }

    /* renamed from: j3 */
    public final void mo5145j3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.a2s);
        if (D != null) {
            View findViewById = mo5142f3().findViewById(C0966R.C0970id.a2s);
            int visibility = D.getVisibility();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(visibility));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(D.isEnabled());
            findViewById.setOnClickListener(new C4280d(D));
        }
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.f1x);
        if (weImageView != null) {
            WeImageView weImageView2 = (WeImageView) mo5142f3().findViewById(C0966R.C0970id.f1x);
            weImageView2.setAlpha(weImageView.getAlpha());
            weImageView2.setImageDrawable(weImageView.getDrawable());
            weImageView2.setIconColor(weImageView.getIconColor());
            weImageView2.setVisibility(weImageView.getVisibility());
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.fnp);
        if (textView != null) {
            TextView textView2 = (TextView) mo5142f3().findViewById(C0966R.C0970id.fnp);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    /* renamed from: k3 */
    public final void mo5146k3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.k07);
        if (D != null) {
            View findViewById = mo5142f3().findViewById(C0966R.C0970id.k07);
            int visibility = D.getVisibility();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(visibility));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(D.isEnabled());
            findViewById.setOnClickListener(new C4281e(D));
        }
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.f26);
        if (weImageView != null) {
            WeImageView weImageView2 = (WeImageView) mo5142f3().findViewById(C0966R.C0970id.f26);
            weImageView2.setAlpha(weImageView.getAlpha());
            weImageView2.setImageDrawable(weImageView.getDrawable());
            weImageView2.setIconColor(weImageView.getIconColor());
            weImageView2.setVisibility(weImageView.getVisibility());
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f359286k04);
        if (textView != null) {
            TextView textView2 = (TextView) mo5142f3().findViewById(C0966R.C0970id.f359286k04);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    /* renamed from: l3 */
    public final void mo5147l3() {
        View view = (View) ((C36570n) this.f18682o).getValue();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "resetAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "resetAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo5143g3().setVisibility(8);
        this.f18679i = null;
    }
}
