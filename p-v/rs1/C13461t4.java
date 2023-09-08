package rs1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;

/* renamed from: rs1.t4 */
public final class C13461t4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13392r4 f38160d;

    public C13461t4(C13392r4 r4Var) {
        this.f38160d = r4Var;
    }

    public final void run() {
        View findViewById = this.f38160d.findViewById(C0966R.C0970id.kcj);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = 0;
            findViewById.setLayoutParams(layoutParams2);
        }
    }
}
