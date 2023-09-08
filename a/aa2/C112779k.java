package aa2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.p079ui.panel.MultiTaskCoordinatorLayout;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import gy3.C87412m;
import zt3.C119157j;

/* renamed from: aa2.k */
public final class C112779k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ C112765c f337694d;

    /* renamed from: aa2.k$a */
    public static final class C112780a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112765c f337695d;

        public C112780a(C112765c cVar) {
            this.f337695d = cVar;
        }

        public final void run() {
            View findViewById = this.f337695d.getRootView().findViewById(C0966R.C0970id.h3c);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = MultiTaskUIC.f346674L;
            marginLayoutParams.topMargin = 0;
            int i = MultiTaskUIC.f346680R;
            marginLayoutParams.width = i;
            marginLayoutParams.height = (int) (((float) i) * MultiTaskUIC.f346683S0);
            findViewById.setLayoutParams(marginLayoutParams);
        }
    }

    public C112779k(C112765c cVar) {
        this.f337694d = cVar;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        MultiTaskCoordinatorLayout multiTaskCoordinatorLayout = this.f337694d.f337660n;
        if (!(multiTaskCoordinatorLayout == null || (viewTreeObserver = multiTaskCoordinatorLayout.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C112780a(this.f337694d));
    }
}
