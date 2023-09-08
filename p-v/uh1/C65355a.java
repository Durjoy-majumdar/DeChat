package uh1;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import gy3.C87412m;
import lt1.C61401a;
import ph1.C62294j;
import qh1.C62621b;
import sh1.C63892b;
import vh1.C65749a;
import wh1.C66114a;

/* renamed from: uh1.a */
public class C65355a extends C63892b {

    /* renamed from: s */
    public FrameLayout f188125s;

    /* renamed from: t */
    public ImageView f188126t;

    /* renamed from: u */
    public TXCloudVideoView f188127u;

    /* renamed from: uh1.a$a */
    public static final class C65356a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C65355a f188128d;

        public C65356a(C65355a aVar) {
            this.f188128d = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FrameLayout frameLayout = this.f188128d.f188125s;
            if (frameLayout != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                frameLayout.setBackgroundColor(((Integer) animatedValue).intValue());
            }
        }
    }

    /* renamed from: uh1.a$b */
    public static final class C65357b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C65355a f188129d;

        /* renamed from: e */
        public final /* synthetic */ float f188130e;

        /* renamed from: f */
        public final /* synthetic */ float f188131f;

        public C65357b(C65355a aVar, float f, float f2) {
            this.f188129d = aVar;
            this.f188130e = f;
            this.f188131f = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            this.f188129d.mo89457A(((Float) animatedValue).floatValue(), this.f188130e, this.f188131f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65355a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: A */
    public void mo89457A(float f, float f2, float f3) {
        ImageView imageView = this.f188126t;
        if (imageView != null) {
            imageView.setScaleX(1.0f - (f * (1.0f - f2)));
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Activity mo89458B(android.view.View r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0027
            android.content.Context r1 = r3.getContext()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0017
            android.content.Context r3 = r3.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r3, r0)
            android.app.Activity r3 = (android.app.Activity) r3
            return r3
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0022
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0022:
            android.app.Activity r3 = r2.mo89458B(r0)
            return r3
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uh1.C65355a.mo89458B(android.view.View):android.app.Activity");
    }

    /* renamed from: b */
    public void mo84317b(C65749a aVar) {
        C87412m.m108594g(aVar, "params");
        this.f188127u = aVar.f189140c;
        super.mo84317b(aVar);
    }

    /* renamed from: j */
    public void mo84325j(C62621b bVar) {
        C87412m.m108594g(bVar, "builder");
        super.mo84325j(bVar);
        int color = this.f181103d.getResources().getColor(C0966R.color.f3131gg);
        int color2 = this.f181103d.getResources().getColor(C0966R.color.ahe);
        C62294j jVar = this.f181112p;
        C87412m.m108591d(jVar);
        float height = (jVar.f177094f * ((float) mo88661s().height())) / ((float) mo88661s().width());
        C62294j jVar2 = this.f181112p;
        C87412m.m108591d(jVar2);
        float width = (((float) mo88661s().width()) / jVar2.f177094f) / ((float) mo88661s().height());
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color), Integer.valueOf(color2)});
        ofObject.addUpdateListener(new C65356a(this));
        bVar.mo87661a(ofObject);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C65357b(this, height, width));
        bVar.mo87661a(ofFloat);
    }

    /* renamed from: k */
    public void mo84326k() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mo88665x(), mo88664w());
        if (!mo88666y()) {
            layoutParams.gravity = 17;
        }
        ViewGroup viewGroup = this.f181113q;
        ViewGroup viewGroup2 = null;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        }
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f188125s, layoutParams);
        }
        ViewGroup viewGroup3 = this.f181113q;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(8);
        }
    }

    /* renamed from: m */
    public Rect mo84327m() {
        C66114a aVar = C66114a.f190029a;
        C62294j jVar = this.f181112p;
        C87412m.m108591d(jVar);
        return C66114a.m77925b(aVar, jVar, (Point) null, 2, (Object) null);
    }

    /* renamed from: n */
    public Rect mo84328n() {
        C62294j jVar = this.f181112p;
        if ((jVar != null ? jVar.f177089a : null) != C61401a.FINDER) {
            C87412m.m108591d(jVar);
            return jVar.f177096h;
        } else if (!mo88666y()) {
            return mo84327m();
        } else {
            C62294j jVar2 = this.f181112p;
            if (jVar2 == null) {
                return mo84327m();
            }
            int i = C66114a.f190030b;
            int i2 = C66114a.f190031c;
            int i3 = (int) (((float) i) / jVar2.f177094f);
            Context B = mo89458B(this.f188127u);
            if (B == null) {
                B = this.f181103d;
            }
            int c = ((i2 - i3) - C75044y4.m89991c(B)) / 2;
            return new Rect(0, c, i + 0, i3 + c);
        }
    }

    /* renamed from: o */
    public View mo84329o() {
        TextureView videoView;
        this.f188125s = new FrameLayout(this.f181103d);
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(this.f181103d);
        C62294j jVar = this.f181112p;
        Bitmap bitmap = null;
        if ((jVar != null ? jVar.f177089a : null) != C61401a.FINDER) {
            roundedCornerFrameLayout.setRadius(this.f181103d.getResources().getDimension(C0966R.dimen.f3766df));
        }
        ImageView v = mo88663v();
        this.f188126t = v;
        TXCloudVideoView tXCloudVideoView = this.f188127u;
        if (!(tXCloudVideoView == null || (videoView = tXCloudVideoView.getVideoView()) == null)) {
            bitmap = videoView.getBitmap();
        }
        v.setImageBitmap(bitmap);
        int i = -1;
        int width = mo88666y() ? mo88660q().width() : -1;
        if (mo88666y()) {
            i = mo88660q().height();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, i);
        if (mo88666y()) {
            layoutParams.topMargin = mo88660q().top;
            layoutParams.leftMargin = mo88660q().left;
        }
        roundedCornerFrameLayout.addView(this.f188126t, new FrameLayout.LayoutParams(width, i));
        FrameLayout frameLayout = this.f188125s;
        if (frameLayout != null) {
            frameLayout.addView(roundedCornerFrameLayout, layoutParams);
        }
        return roundedCornerFrameLayout;
    }

    /* renamed from: p */
    public void mo84332p() {
        mo89459z();
    }

    /* renamed from: r */
    public String mo84333r() {
        return "SwitchInLiveDirector";
    }

    /* renamed from: t */
    public long mo84334t() {
        C62294j jVar = this.f181112p;
        return ((jVar != null ? jVar.f177089a : null) != C61401a.FINDER || mo88666y()) ? 240 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo89459z() {
        /*
            r6 = this;
            com.tencent.rtmp.ui.TXCloudVideoView r0 = r6.f188127u
            r1 = 0
            if (r0 == 0) goto L_0x000a
            android.view.TextureView r0 = r0.getVideoView()
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            r2 = 0
            if (r0 != 0) goto L_0x000f
            goto L_0x0019
        L_0x000f:
            ph1.l$a r3 = new ph1.l$a
            java.lang.String r4 = "SwitchInLiveDirector"
            r3.<init>(r4, r2)
            r0.setSurfaceTextureListener(r3)
        L_0x0019:
            com.tencent.rtmp.ui.TXCloudVideoView r0 = r6.f188127u
            if (r0 == 0) goto L_0x0094
            android.view.TextureView r0 = r0.getVideoView()
            if (r0 == 0) goto L_0x0094
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 == 0) goto L_0x0094
            android.widget.ImageView r3 = r6.mo88663v()
            boolean r4 = r6.mo88666y()
            if (r4 != 0) goto L_0x004e
            android.widget.ImageView r4 = r6.f188126t
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L_0x003e
            float r4 = r4.getScaleX()
            goto L_0x0040
        L_0x003e:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0040:
            r3.setScaleX(r4)
            android.widget.ImageView r4 = r6.f188126t
            if (r4 == 0) goto L_0x004b
            float r5 = r4.getScaleY()
        L_0x004b:
            r3.setScaleY(r5)
        L_0x004e:
            r3.setImageBitmap(r0)
            ph1.j r0 = r6.f181112p
            boolean r4 = r0 instanceof ph1.C62292g
            if (r4 == 0) goto L_0x005a
            ph1.g r0 = (ph1.C62292g) r0
            goto L_0x005b
        L_0x005a:
            r0 = r1
        L_0x005b:
            if (r0 == 0) goto L_0x0094
            android.view.View r0 = r0.f177080m
            boolean r4 = r0 instanceof android.widget.FrameLayout
            if (r4 == 0) goto L_0x0066
            r1 = r0
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L_0x0066:
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = "nearby-live-fluent-preview-view-tag"
            android.view.View r4 = r1.findViewWithTag(r0)
            if (r4 == 0) goto L_0x0073
            r1.removeView(r4)
        L_0x0073:
            r3.setTag(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            android.graphics.Rect r4 = r6.mo88661s()
            int r4 = r4.width()
            android.graphics.Rect r5 = r6.mo88661s()
            int r5 = r5.height()
            r0.<init>(r4, r5)
            r4 = 17
            r0.gravity = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r1.addView(r3, r2, r0)
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uh1.C65355a.mo89459z():void");
    }
}
