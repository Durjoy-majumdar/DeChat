package wc1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gy3.C87412m;

/* renamed from: wc1.a */
public final class C15063a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f41197d;

    /* renamed from: e */
    public final /* synthetic */ boolean f41198e;

    public C15063a(View view, boolean z) {
        this.f41197d = view;
        this.f41198e = z;
    }

    public final void run() {
        C15064b bVar = C15064b.f41199a;
        Context context = this.f41197d.getContext();
        C87412m.m108593f(context, "context");
        Context context2 = this.f41197d.getContext();
        C87412m.m108593f(context2, "context");
        Context context3 = this.f41197d.getContext();
        C87412m.m108593f(context3, "context");
        int c = (int) bVar.mo14078c(context3, (float) this.f41197d.getPaddingTop());
        Context context4 = this.f41197d.getContext();
        C87412m.m108593f(context4, "context");
        this.f41197d.setPadding((int) bVar.mo14078c(context, (float) this.f41197d.getPaddingLeft()), c, (int) bVar.mo14078c(context2, (float) this.f41197d.getPaddingRight()), (int) bVar.mo14078c(context4, (float) this.f41197d.getPaddingBottom()));
        ViewGroup.LayoutParams layoutParams = this.f41197d.getLayoutParams();
        if (this.f41198e) {
            if (layoutParams.width > 0) {
                Context context5 = this.f41197d.getContext();
                C87412m.m108593f(context5, "context");
                layoutParams.width = (int) bVar.mo14078c(context5, (float) layoutParams.width);
            }
            if (layoutParams.height > 0) {
                Context context6 = this.f41197d.getContext();
                C87412m.m108593f(context6, "context");
                layoutParams.height = (int) bVar.mo14078c(context6, (float) layoutParams.height);
            }
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context7 = this.f41197d.getContext();
            C87412m.m108593f(context7, "context");
            marginLayoutParams.leftMargin = (int) bVar.mo14078c(context7, (float) marginLayoutParams.leftMargin);
            Context context8 = this.f41197d.getContext();
            C87412m.m108593f(context8, "context");
            marginLayoutParams.rightMargin = (int) bVar.mo14078c(context8, (float) marginLayoutParams.rightMargin);
            Context context9 = this.f41197d.getContext();
            C87412m.m108593f(context9, "context");
            marginLayoutParams.topMargin = (int) bVar.mo14078c(context9, (float) marginLayoutParams.topMargin);
            Context context10 = this.f41197d.getContext();
            C87412m.m108593f(context10, "context");
            marginLayoutParams.bottomMargin = (int) bVar.mo14078c(context10, (float) marginLayoutParams.bottomMargin);
            Context context11 = this.f41197d.getContext();
            C87412m.m108593f(context11, "context");
            marginLayoutParams.setMarginStart((int) bVar.mo14078c(context11, (float) marginLayoutParams.getMarginStart()));
            Context context12 = this.f41197d.getContext();
            C87412m.m108593f(context12, "context");
            marginLayoutParams.setMarginEnd((int) bVar.mo14078c(context12, (float) marginLayoutParams.getMarginEnd()));
        }
        this.f41197d.setLayoutParams(layoutParams);
    }
}
