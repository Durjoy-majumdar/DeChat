package qj1;

import android.view.ViewGroup;
import gy3.C87412m;
import o40.C61926c;

/* renamed from: qj1.tf */
public final class C12676tf implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C62979sf f36308d;

    /* renamed from: e */
    public final /* synthetic */ C62712dd f36309e;

    public C12676tf(C62979sf sfVar, C62712dd ddVar) {
        this.f36308d = sfVar;
        this.f36309e = ddVar;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams = this.f36308d.f166287d.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.f36309e.mo14483f0() == 0) {
            int i = C61926c.m72690o(this.f36309e.f166287d)[1];
            int height = C61926c.m72690o(this.f36308d.f166287d)[1] + this.f36308d.f166287d.getHeight();
            if (height > i) {
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, height - i);
            }
        } else {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, 0);
        }
        this.f36308d.f166287d.setLayoutParams(marginLayoutParams);
    }
}
