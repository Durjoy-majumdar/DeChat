package uh1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vh1.C65749a;
import wh1.C66114a;
import x50.C15625a;

/* renamed from: uh1.b */
public final class C65358b extends C65355a {

    /* renamed from: v */
    public final Activity f188132v;

    /* renamed from: w */
    public FrameLayout f188133w;

    /* renamed from: x */
    public final C13601g f188134x;

    /* renamed from: uh1.b$a */
    public static final class C65359a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ C65358b f188135d;

        public C65359a(C65358b bVar) {
            this.f188135d = bVar;
        }

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            FrameLayout frameLayout = this.f188135d.f188125s;
            if (!(frameLayout == null || (viewTreeObserver = frameLayout.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            Log.m105924i(this.f188135d.f181104e, "addCoverViewContainerToWindow onPreDraw");
            ViewGroup viewGroup = this.f188135d.f181113q;
            if (viewGroup == null) {
                return true;
            }
            viewGroup.setVisibility(4);
            return true;
        }
    }

    /* renamed from: uh1.b$b */
    public static final class C65360b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65358b f188136d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65360b(C65358b bVar) {
            super(0);
            this.f188136d = bVar;
        }

        public Object invoke() {
            ((WindowManager) ((C36570n) this.f188136d.f188134x).getValue()).removeView(this.f188136d.f188133w);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: uh1.b$c */
    public static final class C65361c extends C87413o implements C32224a<WindowManager> {

        /* renamed from: d */
        public final /* synthetic */ Context f188137d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65361c(Context context) {
            super(0);
            this.f188137d = context;
        }

        public Object invoke() {
            Object systemService = this.f188137d.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return (WindowManager) systemService;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65358b(Context context, Activity activity) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f188132v = activity;
        this.f188134x = C36568h.m40985a(new C65361c(context));
    }

    /* renamed from: A */
    public void mo89457A(float f, float f2, float f3) {
        ImageView imageView = this.f188126t;
        if (imageView == null) {
            return;
        }
        if (mo88666y()) {
            imageView.setScaleX(1.0f - (f * (1.0f - f2)));
        } else {
            imageView.setScaleY(1.0f - (f * (1.0f - f3)));
        }
    }

    /* renamed from: a */
    public void mo84316a() {
        C66114a aVar = C66114a.f190029a;
        try {
            new C65360b(this).invoke();
        } catch (Throwable th) {
            Log.m105921e("FinderLiveFluentUtil", "safeInvoke exception ", th);
        }
    }

    /* renamed from: k */
    public void mo84326k() {
        ViewTreeObserver viewTreeObserver;
        WindowManager.LayoutParams a = C66114a.f190029a.mo90150a();
        this.f188133w = new FrameLayout(this.f181103d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mo88665x(), mo88664w());
        if (!mo88666y()) {
            layoutParams.gravity = 17;
        }
        FrameLayout frameLayout = this.f188133w;
        if (frameLayout != null) {
            frameLayout.addView(this.f188125s, layoutParams);
        }
        ((WindowManager) ((C36570n) this.f188134x).getValue()).addView(this.f188133w, a);
        FrameLayout frameLayout2 = this.f188125s;
        if (frameLayout2 != null && (viewTreeObserver = frameLayout2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new C65359a(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f189142e;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect mo84328n() {
        /*
            r8 = this;
            vh1.a r0 = r8.f181114r
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.graphics.Point r0 = r0.f189142e
            if (r0 == 0) goto L_0x0010
            int r0 = r0.x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0016
            goto L_0x001c
        L_0x0016:
            int r4 = r0.intValue()
            if (r4 == 0) goto L_0x001e
        L_0x001c:
            r4 = 1
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x002a
            int r0 = r0.intValue()
            goto L_0x0035
        L_0x002a:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131166495(0x7f07051f, float:1.7947237E38)
            int r0 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r0, r4)
        L_0x0035:
            vh1.a r4 = r8.f181114r
            if (r4 == 0) goto L_0x0044
            android.graphics.Point r4 = r4.f189142e
            if (r4 == 0) goto L_0x0044
            int r4 = r4.y
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0045
        L_0x0044:
            r4 = r1
        L_0x0045:
            if (r4 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            int r5 = r4.intValue()
            if (r5 == 0) goto L_0x0050
        L_0x004e:
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            if (r5 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r4 = r1
        L_0x0055:
            if (r4 == 0) goto L_0x005c
            int r4 = r4.intValue()
            goto L_0x0067
        L_0x005c:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2131166494(0x7f07051e, float:1.7947235E38)
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r4, r5)
        L_0x0067:
            java.lang.Class<pn.e> r5 = p646pn.C110234e.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            pn.e r5 = (p646pn.C110234e) r5
            xv0.e r5 = r5.mo161399pY()
            int r6 = r8.f181105f
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r0, r4)
            android.graphics.Point r5 = r5.mo149106Y(r6, r7)
            android.app.Activity r6 = r8.f188132v
            int r6 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r6)
            int r6 = r6 / 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r6.intValue()
            boolean r7 = r8.mo88666y()
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x0095
            r1 = r6
        L_0x0095:
            if (r1 == 0) goto L_0x009b
            int r2 = r1.intValue()
        L_0x009b:
            java.lang.String r1 = r8.f181104e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "calculateTargetRect floatBallPos: "
            r3.append(r6)
            r3.append(r5)
            java.lang.String r6 = ", navigateHeight: "
            r3.append(r6)
            r3.append(r2)
            java.lang.String r6 = ", windowSize: "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = ", "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            android.graphics.Rect r1 = new android.graphics.Rect
            int r3 = r5.x
            int r5 = r5.y
            int r6 = r5 + r2
            int r0 = r0 + r3
            int r5 = r5 + r4
            int r5 = r5 + r2
            r1.<init>(r3, r6, r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uh1.C65358b.mo84328n():android.graphics.Rect");
    }

    /* renamed from: r */
    public String mo84333r() {
        return "SwitchInWindowDirector";
    }

    /* renamed from: t */
    public long mo84334t() {
        return 240;
    }

    /* renamed from: z */
    public void mo89459z() {
        TextureView videoView;
        Bitmap bitmap;
        TXCloudVideoView tXCloudVideoView = this.f188127u;
        if (tXCloudVideoView != null && (videoView = tXCloudVideoView.getVideoView()) != null && (bitmap = videoView.getBitmap()) != null) {
            ImageView v = mo88663v();
            v.setImageBitmap(bitmap);
            C65749a aVar = this.f181114r;
            if (aVar != null) {
                View view = aVar.f189141d;
                C15625a aVar2 = view instanceof C15625a ? (C15625a) view : null;
                if (aVar2 != null) {
                    View findViewWithTag = aVar2.findViewWithTag("nearby-live-fluent-preview-view-tag");
                    if (findViewWithTag != null) {
                        aVar2.removeView(findViewWithTag);
                    }
                    v.setTag("nearby-live-fluent-preview-view-tag");
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(mo88661s().width(), mo88661s().height());
                    layoutParams.addRule(13);
                    aVar2.addView(v, layoutParams);
                }
            }
        }
    }
}
