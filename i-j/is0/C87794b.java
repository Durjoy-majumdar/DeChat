package is0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeContainerWC;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.widget.C85007k;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import gy3.C87412m;
import in3.C87771d;
import j20.C117292a;
import java.util.ArrayList;
import qq0.C89795c;

/* renamed from: is0.b */
public final class C87794b extends FrameLayout {

    /* renamed from: d */
    public AppBrandRuntimeContainerWC f254165d;

    /* renamed from: e */
    public FrameLayout f254166e;

    /* renamed from: f */
    public View f254167f;

    /* renamed from: is0.b$a */
    public static final class C46284a implements View.OnClickListener {

        /* renamed from: d */
        public static final C46284a f124734d = new C46284a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/wxa_container/AppBrandActivityContainerView$setExternalHeaderContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/wxa_container/AppBrandActivityContainerView$setExternalHeaderContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87794b(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    private final AppBrandRuntimeWC getRuntime() {
        AppBrandRuntime activeRuntime = getRuntimeContainer().getActiveRuntime();
        if (activeRuntime instanceof AppBrandRuntimeWC) {
            return (AppBrandRuntimeWC) activeRuntime;
        }
        return null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f254165d != null) {
            C85004y d = C85004y.m104825d(this);
            if (d != null && d.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        AppBrandRuntimeWC runtime;
        HalfScreenManger halfScreenManger;
        if (!(view == null || (runtime = getRuntime()) == null || (halfScreenManger = runtime.f238298z1) == null)) {
            halfScreenManger.mo117786i(canvas, view, HalfScreenManger.C68697a.NORMAL);
        }
        return super.drawChild(canvas, view, j);
    }

    public final AppBrandRuntimeContainerWC getRuntimeContainer() {
        AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.f254165d;
        if (appBrandRuntimeContainerWC != null) {
            return appBrandRuntimeContainerWC;
        }
        C87412m.m108603p("runtimeContainer");
        throw null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        HalfScreenManger halfScreenManger;
        C85007k kVar;
        C87412m.m108594g(motionEvent, "ev");
        if (this.f254165d != null) {
            AppBrandRuntimeWC runtime = getRuntime();
            boolean z = false;
            if (!(runtime == null || (halfScreenManger = runtime.f238298z1) == null || (kVar = halfScreenManger.f247571d) == null || !kVar.mo117946a(motionEvent))) {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f254167f;
        if (C87412m.m108589b(view != null ? view.getParent() : null, this) && this.f254166e != null) {
            View view2 = this.f254167f;
            C87412m.m108591d(view2);
            int left = view2.getLeft();
            View view3 = this.f254167f;
            C87412m.m108591d(view3);
            int top = view3.getTop();
            View view4 = this.f254167f;
            C87412m.m108591d(view4);
            int right = view4.getRight();
            FrameLayout frameLayout = this.f254166e;
            C87412m.m108591d(frameLayout);
            FrameLayout frameLayout2 = this.f254166e;
            C87412m.m108591d(frameLayout2);
            frameLayout.layout(left, top - frameLayout2.getMeasuredHeight(), right, top);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        HalfScreenManger halfScreenManger;
        C85007k kVar;
        C87412m.m108594g(motionEvent, "event");
        if (this.f254165d != null) {
            AppBrandRuntimeWC runtime = getRuntime();
            boolean z = false;
            if (!(runtime == null || (halfScreenManger = runtime.f238298z1) == null || (kVar = halfScreenManger.f247571d) == null || !kVar.mo117947b(motionEvent))) {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setExternalHeaderAnchor(View view) {
        this.f254167f = view;
    }

    public final void setExternalHeaderContainer(FrameLayout frameLayout) {
        Activity R;
        C87412m.m108594g(frameLayout, "container");
        FrameLayout frameLayout2 = this.f254166e;
        if (frameLayout2 != null) {
            removeView(frameLayout2);
        }
        this.f254166e = frameLayout;
        frameLayout.setOnClickListener(C46284a.f124734d);
        AppBrandRuntimeWC runtime = getRuntime();
        if (!(runtime == null || (R = runtime.mo113026R()) == null || !(this.f254166e instanceof C89795c))) {
            C87771d b = C87771d.m109203b(R);
            FrameLayout frameLayout3 = this.f254166e;
            C87412m.m108592e(frameLayout3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarContainerLayout");
            b.mo122180d((C89795c) frameLayout3);
        }
        addView(this.f254166e, new ViewGroup.LayoutParams(-1, -2));
    }

    public final void setExternalHeaderVisibility(int i) {
        FrameLayout frameLayout = this.f254166e;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
    }

    public final void setRuntimeContainer(AppBrandRuntimeContainerWC appBrandRuntimeContainerWC) {
        C87412m.m108594g(appBrandRuntimeContainerWC, "<set-?>");
        this.f254165d = appBrandRuntimeContainerWC;
    }
}
