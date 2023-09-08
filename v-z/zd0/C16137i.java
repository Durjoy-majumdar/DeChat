package zd0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import rx3.C13598b0;

/* renamed from: zd0.i */
public final class C16137i {

    /* renamed from: a */
    public static final C16138a f43326a = new C16138a((C8480h) null);

    /* renamed from: zd0.i$a */
    public static final class C16138a {

        /* renamed from: zd0.i$a$a */
        public static final class C16139a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ View f43327d;

            /* renamed from: e */
            public final /* synthetic */ Context f43328e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16139a(View view, Context context) {
                super(0);
                this.f43327d = view;
                this.f43328e = context;
            }

            public Object invoke() {
                ViewGroup.LayoutParams layoutParams = this.f43327d.getLayoutParams();
                Context context = this.f43328e;
                C87412m.m108593f(context, "context");
                int measuredWidth = this.f43327d.getMeasuredWidth();
                int b = C60641c.m70921b(context.getResources().getDisplayMetrics().density * ((float) 375));
                int max = Math.max(b, context.getResources().getDisplayMetrics().widthPixels / 2);
                if (measuredWidth < b) {
                    measuredWidth = b;
                } else if (measuredWidth > max) {
                    measuredWidth = max;
                }
                layoutParams.width = Math.min(measuredWidth, context.getResources().getDisplayMetrics().widthPixels);
                MMHandlerThread.postToMainThread(new C16141k(this.f43327d));
                return C13598b0.f38549a;
            }
        }

        public C16138a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo14714a(int i, View view) {
            C87412m.m108594g(view, "dialogRootView");
            Context context = view.getContext();
            boolean z = true;
            if (i == 1 || i == 3) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108593f(context, "context");
                layoutParams.width = C60641c.m70921b(context.getResources().getDisplayMetrics().density * ((float) 375));
                view.setLayoutParams(layoutParams);
                return;
            }
            C87412m.m108593f(context, "context");
            if ((context.getResources().getConfiguration().screenLayout & 15) < 3) {
                z = false;
            }
            if (z) {
                C16139a aVar = new C16139a(view, context);
                if (view.getViewTreeObserver().isAlive()) {
                    view.getViewTreeObserver().addOnPreDrawListener(new C16140j(view, aVar));
                    return;
                }
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.width = -1;
            view.setLayoutParams(layoutParams2);
        }
    }
}
