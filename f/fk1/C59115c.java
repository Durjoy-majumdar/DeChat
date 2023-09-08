package fk1;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gk1.C59522a;
import gy3.C87412m;
import kg3.C76577a;
import ph1.C62294j;
import qh1.C62621b;
import sh1.C63892b;
import tf0.C13887q1;
import vh1.C65749a;
import w50.C65928b;
import wh1.C66114a;

/* renamed from: fk1.c */
public final class C59115c extends C63892b {

    /* renamed from: s */
    public final Activity f169078s;

    /* renamed from: t */
    public final C59522a f169079t;

    /* renamed from: u */
    public TXCloudVideoView f169080u;

    /* renamed from: fk1.c$a */
    public static final class C59116a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C59115c f169081d;

        /* renamed from: e */
        public final /* synthetic */ float f169082e;

        /* renamed from: f */
        public final /* synthetic */ float f169083f;

        /* renamed from: g */
        public final /* synthetic */ float f169084g;

        /* renamed from: h */
        public final /* synthetic */ float f169085h;

        /* renamed from: i */
        public final /* synthetic */ int f169086i;

        /* renamed from: j */
        public final /* synthetic */ int f169087j;

        /* renamed from: n */
        public final /* synthetic */ int f169088n;

        /* renamed from: o */
        public final /* synthetic */ int f169089o;

        /* renamed from: p */
        public final /* synthetic */ int f169090p;

        public C59116a(C59115c cVar, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, int i5) {
            this.f169081d = cVar;
            this.f169082e = f;
            this.f169083f = f2;
            this.f169084g = f3;
            this.f169085h = f4;
            this.f169086i = i;
            this.f169087j = i2;
            this.f169088n = i3;
            this.f169089o = i4;
            this.f169090p = i5;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int i = this.f169081d.mo88660q().top - ((int) (((float) (this.f169081d.mo88660q().top - this.f169081d.mo88661s().top)) * floatValue));
            int i2 = this.f169081d.mo88660q().left - ((int) (((float) (this.f169081d.mo88660q().left - this.f169081d.mo88661s().left)) * floatValue));
            int width = this.f169081d.mo88660q().width() - ((int) (((float) (this.f169081d.mo88660q().width() - this.f169081d.mo88661s().width())) * floatValue));
            int height = this.f169081d.mo88660q().height() - ((int) (((float) (this.f169081d.mo88660q().height() - this.f169081d.mo88661s().height())) * floatValue));
            float f = 1.0f - ((float) ((int) ((1.0f - this.f169083f) * floatValue)));
            String str = this.f169081d.f181104e;
            Log.m105924i(str, "top = " + i + " left = " + i2 + " width = " + width + " height = " + height + " scaleX: " + (1.0f - ((float) ((int) ((1.0f - this.f169082e) * floatValue)))) + " scaleY: " + f + " tranX: " + (this.f169084g * floatValue) + " tranY: " + (this.f169085h * floatValue));
            ViewGroup.LayoutParams layoutParams = this.f169081d.f169079t.f170137w.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.width = width;
            marginLayoutParams.height = height;
            ViewGroup.LayoutParams layoutParams2 = this.f169081d.f169079t.f170124g.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            C59115c cVar = this.f169081d;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = cVar.mo88660q().top - ((int) (((float) (cVar.mo88660q().top - this.f169087j)) * floatValue));
            ViewGroup.LayoutParams layoutParams3 = this.f169081d.f169079t.f170127j.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            int i3 = this.f169088n;
            C59115c cVar2 = this.f169081d;
            int i4 = this.f169089o;
            int i5 = this.f169090p;
            marginLayoutParams2.topMargin = i3 - ((int) (((float) (i3 - cVar2.mo88661s().top)) * floatValue));
            marginLayoutParams2.leftMargin = i2;
            marginLayoutParams2.width = i4 - ((int) (((float) (i4 - cVar2.mo88661s().width())) * floatValue));
            marginLayoutParams2.height = i5 - ((int) (((float) (i5 - cVar2.mo88661s().height())) * floatValue));
            ((C13887q1) C86312j.m106911c(C13887q1.class)).ho0(new Point(width, height));
            this.f169081d.f169079t.f170127j.setRadius(((float) this.f169086i) * floatValue);
            this.f169081d.f169079t.f170137w.setRadius(floatValue * ((float) this.f169086i));
            this.f169081d.f169079t.f170137w.requestLayout();
            this.f169081d.f169079t.f170127j.requestLayout();
            this.f169081d.f169079t.f170122e.requestLayout();
        }
    }

    /* renamed from: fk1.c$b */
    public static final class C59117b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f169091d;

        /* renamed from: e */
        public final /* synthetic */ C59115c f169092e;

        public C59117b(ViewGroup viewGroup, C59115c cVar) {
            this.f169091d = viewGroup;
            this.f169092e = cVar;
        }

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            ViewGroup viewGroup = this.f169091d;
            if (!(viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            Log.m105924i(this.f169092e.f181104e, "addCoverViewContainerToWindow onPreDraw");
            ViewGroup viewGroup2 = this.f169092e.f181113q;
            if (viewGroup2 == null) {
                return true;
            }
            viewGroup2.setVisibility(4);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59115c(Context context, Activity activity, C59522a aVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(aVar, "panelWidget");
        this.f169078s = activity;
        this.f169079t = aVar;
    }

    /* renamed from: b */
    public void mo84317b(C65749a aVar) {
        C87412m.m108594g(aVar, "params");
        this.f169080u = aVar.f189140c;
        super.mo84317b(aVar);
    }

    /* renamed from: j */
    public void mo84325j(C62621b bVar) {
        C87412m.m108594g(bVar, "builder");
        ViewGroup.LayoutParams layoutParams = this.f169079t.f170127j.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int c = mo88661s().top - C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3736cp);
        float width = (((float) mo88661s().width()) * 1.0f) / ((float) mo88660q().width());
        float height = (((float) mo88661s().height()) * 1.0f) / ((float) mo88660q().height());
        float centerX = (float) (mo88661s().centerX() - mo88660q().centerX());
        float centerY = (float) (mo88661s().centerY() - mo88660q().centerY());
        TXCloudVideoView tXCloudVideoView = this.f169080u;
        int width2 = tXCloudVideoView != null ? tXCloudVideoView.getWidth() : 0;
        TXCloudVideoView tXCloudVideoView2 = this.f169080u;
        int height2 = tXCloudVideoView2 != null ? tXCloudVideoView2.getHeight() : 0;
        int b = C76577a.m92151b(this.f181103d, 8);
        String str = this.f181104e;
        Log.m105924i(str, "setTransitionAnimator sourceRect: " + mo88660q() + "  targetRect: " + mo88661s() + " scaleRatioX: " + width + "  scaleRatioY: " + height + "  translationX: " + centerX + "  translationY: " + centerY + "  videoViewWidth: " + width2 + "  videoViewheight: " + height2 + ' ');
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C59116a(this, width, height, centerX, centerY, b, c, i, width2, height2));
        bVar.mo87661a(ofFloat);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo84326k() {
        /*
            r12 = this;
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            int r1 = r12.mo88665x()
            int r2 = r12.mo88664w()
            r0.<init>(r1, r2)
            boolean r1 = r12.mo88666y()
            r2 = 17
            if (r1 != 0) goto L_0x0017
            r0.gravity = r2
        L_0x0017:
            wh1.a r0 = wh1.C66114a.f190029a
            ph1.j r1 = r12.f181112p
            gy3.C87412m.m108591d(r1)
            r3 = 2
            r4 = 0
            android.graphics.Rect r1 = wh1.C66114a.m77925b(r0, r1, r4, r3, r4)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            int r6 = r1.width()
            int r1 = r1.height()
            r5.<init>(r6, r1)
            int[] r1 = new int[r3]
            com.tencent.rtmp.ui.TXCloudVideoView r6 = r12.f169080u
            if (r6 == 0) goto L_0x003a
            r6.getLocationOnScreen(r1)
        L_0x003a:
            boolean r6 = r12.mo88666y()
            if (r6 != 0) goto L_0x0042
            r5.gravity = r2
        L_0x0042:
            r2 = 1
            r6 = r1[r2]
            r5.topMargin = r6
            r6 = 0
            r1 = r1[r6]
            r5.leftMargin = r1
            android.view.ViewGroup r1 = r12.f181113q
            if (r1 == 0) goto L_0x006a
            android.widget.ImageView r7 = r12.mo88663v()
            com.tencent.rtmp.ui.TXCloudVideoView r8 = r12.f169080u
            if (r8 == 0) goto L_0x0067
            android.view.TextureView r8 = r8.getVideoView()
            if (r8 == 0) goto L_0x0067
            android.graphics.Bitmap r8 = r8.getBitmap()
            if (r8 == 0) goto L_0x0067
            r7.setImageBitmap(r8)
        L_0x0067:
            r1.addView(r7, r5)
        L_0x006a:
            com.tencent.rtmp.ui.TXCloudVideoView r1 = r12.f169080u
            if (r1 == 0) goto L_0x013f
            gk1.a r5 = r12.f169079t
            android.graphics.Rect r7 = r12.mo88660q()
            int r7 = r7.top
            boolean r8 = r12.mo88666y()
            ph1.j r9 = r12.f181112p
            if (r9 == 0) goto L_0x0089
            f50.d r9 = r9.f177095g
            if (r9 == 0) goto L_0x0089
            boolean r9 = r9.isPlaying()
            if (r9 != r2) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            ph1.j r9 = r12.f181112p
            if (r9 == 0) goto L_0x0091
            int r10 = r9.f177092d
            goto L_0x0092
        L_0x0091:
            r10 = 0
        L_0x0092:
            if (r9 == 0) goto L_0x0097
            int r9 = r9.f177093e
            goto L_0x0098
        L_0x0097:
            r9 = 0
        L_0x0098:
            int r0 = r0.mo90151c(r10, r9)
            r5.getClass()
            com.tencent.mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout r9 = r5.f170124g
            r9.setTouchEnable(r6)
            int[] r3 = new int[r3]
            r1.getLocationInWindow(r3)
            com.tencent.mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout r9 = r5.f170124g
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r10 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x00b6
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            goto L_0x00b7
        L_0x00b6:
            r9 = r4
        L_0x00b7:
            if (r9 == 0) goto L_0x00bb
            r9.topMargin = r7
        L_0x00bb:
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r9 = r5.f170137w
            android.graphics.drawable.Drawable r10 = r5.f170140z
            r9.setBackgroundDrawable(r10)
            com.tencent.mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout r9 = r5.f170124g
            android.graphics.drawable.Drawable r10 = r5.f170117A
            r9.setBackgroundDrawable(r10)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r9 = r5.f170137w
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r10 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x00d6
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            goto L_0x00d7
        L_0x00d6:
            r9 = r4
        L_0x00d7:
            r10 = -1
            if (r9 == 0) goto L_0x00e2
            r9.topMargin = r7
            r9.leftMargin = r6
            r9.width = r10
            r9.height = r10
        L_0x00e2:
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r9 = r5.f170127j
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r11 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r11 == 0) goto L_0x00ef
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            goto L_0x00f0
        L_0x00ef:
            r9 = r4
        L_0x00f0:
            if (r9 == 0) goto L_0x0109
            r3 = r3[r6]
            r9.leftMargin = r3
            if (r8 == 0) goto L_0x00f9
            goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            int r7 = r7 + r0
            r9.topMargin = r7
            int r0 = r1.getWidth()
            r9.width = r0
            int r0 = r1.getHeight()
            r9.height = r0
        L_0x0109:
            android.view.ViewParent r0 = r1.getParent()
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0114
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x0115
        L_0x0114:
            r0 = r4
        L_0x0115:
            if (r0 == 0) goto L_0x011a
            r0.removeView(r1)
        L_0x011a:
            android.widget.FrameLayout r0 = r5.f170125h
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r5.f170125h
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r10, r10)
            r0.addView(r1, r3)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r0 = r5.f170137w
            r0.setVisibility(r6)
            r5.mo84595c()
            if (r2 == 0) goto L_0x0137
            r5.mo84596d()
            goto L_0x013a
        L_0x0137:
            r5.mo84597e()
        L_0x013a:
            int r0 = r5.f170118B
            r5.mo84599g(r0)
        L_0x013f:
            vh1.a r0 = r12.f181114r
            if (r0 == 0) goto L_0x0146
            android.view.View r0 = r0.f189141d
            goto L_0x0147
        L_0x0146:
            r0 = r4
        L_0x0147:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x014e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x014f
        L_0x014e:
            r0 = r4
        L_0x014f:
            if (r0 == 0) goto L_0x0194
            gk1.a r1 = r12.f169079t
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r3 = r12.f181105f
            int r5 = r12.f181106g
            r2.<init>(r3, r5)
            r1.getClass()
            android.view.View r3 = r1.f170122e
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x016c
            r4 = r3
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L_0x016c:
            if (r4 == 0) goto L_0x0173
            android.view.View r3 = r1.f170122e
            r4.removeView(r3)
        L_0x0173:
            r3 = 2131307698(0x7f092cb2, float:1.823363E38)
            android.view.View r3 = r0.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L_0x0181
            r0.removeView(r3)
        L_0x0181:
            android.view.View r1 = r1.f170122e
            r0.addView(r1, r2)
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x0194
            fk1.c$b r2 = new fk1.c$b
            r2.<init>(r0, r12)
            r1.addOnPreDrawListener(r2)
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fk1.C59115c.mo84326k():void");
    }

    /* renamed from: m */
    public Rect mo84327m() {
        int i;
        int[] iArr = new int[2];
        TXCloudVideoView tXCloudVideoView = this.f169080u;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.getLocationOnScreen(iArr);
        }
        if (mo88666y()) {
            int i2 = iArr[1];
            C66114a aVar = C66114a.f190029a;
            C62294j jVar = this.f181112p;
            i = i2 - aVar.mo90151c(jVar != null ? jVar.f177092d : 0, jVar != null ? jVar.f177093e : 0);
        } else {
            i = iArr[1];
        }
        int i3 = iArr[0];
        return new Rect(i3, i, this.f181105f + i3, this.f181106g + i);
    }

    /* renamed from: n */
    public Rect mo84328n() {
        int c = C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3736cp);
        int c2 = ((C75044y4.m89990b(MMApplicationContext.getContext()).y - (mo88666y() ? C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.a8t) : C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3721of))) + C74942w4.m89786c(MMApplicationContext.getContext(), C0966R.dimen.f3736cp)) - (C75044y4.m89991c(this.f169078s) / 2);
        C65928b bVar = C65928b.f189533a;
        C62294j jVar = this.f181112p;
        int i = 0;
        int i2 = bVar.mo89964b(jVar != null ? jVar.f177092d : 0, jVar != null ? jVar.f177093e : 0).x;
        C62294j jVar2 = this.f181112p;
        int i3 = jVar2 != null ? jVar2.f177092d : 0;
        if (jVar2 != null) {
            i = jVar2.f177093e;
        }
        int i4 = bVar.mo89964b(i3, i).y;
        String str = this.f181104e;
        Log.m105924i(str, "calculateTargetRect top: " + c2 + " viewWidth: " + i2 + " viewHeight: " + i4);
        return new Rect(c, c2, i2 + c, i4 + c2);
    }

    /* renamed from: o */
    public View mo84329o() {
        ViewGroup.LayoutParams layoutParams = this.f169079t.f170138x.getLayoutParams();
        if (layoutParams != null) {
            C65928b bVar = C65928b.f189533a;
            C62294j jVar = this.f181112p;
            int i = 0;
            layoutParams.width = bVar.mo89964b(jVar != null ? jVar.f177092d : 0, jVar != null ? jVar.f177093e : 0).x;
            C62294j jVar2 = this.f181112p;
            int i2 = jVar2 != null ? jVar2.f177092d : 0;
            if (jVar2 != null) {
                i = jVar2.f177093e;
            }
            layoutParams.height = bVar.mo89964b(i2, i).y;
        }
        return this.f169079t.f170122e;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
    }

    public void onAnimationStart(Animator animator) {
        C59522a aVar = this.f169079t;
        int i = C59522a.f170111E;
        aVar.f170120D = C59522a.f170115I;
    }

    /* renamed from: p */
    public void mo84332p() {
        this.f169079t.f170124g.setTouchEnable(true);
    }

    /* renamed from: r */
    public String mo84333r() {
        return "SwitchInSquarePanelDirector";
    }

    /* renamed from: t */
    public long mo84334t() {
        return 240;
    }
}
