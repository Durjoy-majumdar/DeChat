package hi2;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import gy3.C87412m;

/* renamed from: hi2.a */
public final class C76198a {

    /* renamed from: a */
    public static final C76198a f223232a = new C76198a();

    /* renamed from: hi2.a$a */
    public static final class C76199a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f223233d;

        public C76199a(View view) {
            this.f223233d = view;
        }

        public final void run() {
            C76198a aVar = C76198a.f223232a;
            Context context = this.f223233d.getContext();
            C87412m.m108593f(context, "context");
            Context context2 = this.f223233d.getContext();
            C87412m.m108593f(context2, "context");
            Context context3 = this.f223233d.getContext();
            C87412m.m108593f(context3, "context");
            int a = (int) aVar.mo106461a(context3, (float) this.f223233d.getPaddingTop());
            Context context4 = this.f223233d.getContext();
            C87412m.m108593f(context4, "context");
            this.f223233d.setPadding((int) aVar.mo106461a(context, (float) this.f223233d.getPaddingLeft()), a, (int) aVar.mo106461a(context2, (float) this.f223233d.getPaddingRight()), (int) aVar.mo106461a(context4, (float) this.f223233d.getPaddingBottom()));
            ViewGroup.LayoutParams layoutParams = this.f223233d.getLayoutParams();
            if (layoutParams.width > 0) {
                Context context5 = this.f223233d.getContext();
                C87412m.m108593f(context5, "context");
                layoutParams.width = (int) aVar.mo106461a(context5, (float) layoutParams.width);
            }
            if (layoutParams.height > 0) {
                Context context6 = this.f223233d.getContext();
                C87412m.m108593f(context6, "context");
                layoutParams.height = (int) aVar.mo106461a(context6, (float) layoutParams.height);
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                Context context7 = this.f223233d.getContext();
                C87412m.m108593f(context7, "context");
                layoutParams2.leftMargin = (int) aVar.mo106461a(context7, (float) layoutParams2.leftMargin);
                Context context8 = this.f223233d.getContext();
                C87412m.m108593f(context8, "context");
                layoutParams2.rightMargin = (int) aVar.mo106461a(context8, (float) layoutParams2.rightMargin);
                Context context9 = this.f223233d.getContext();
                C87412m.m108593f(context9, "context");
                layoutParams2.topMargin = (int) aVar.mo106461a(context9, (float) layoutParams2.topMargin);
                Context context10 = this.f223233d.getContext();
                C87412m.m108593f(context10, "context");
                layoutParams2.bottomMargin = (int) aVar.mo106461a(context10, (float) layoutParams2.bottomMargin);
            }
            this.f223233d.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final float mo106461a(Context context, float f) {
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return (f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    public final void mo106462b(View view) {
        C87412m.m108594g(view, "<this>");
        view.post(new C76199a(view));
    }
}
