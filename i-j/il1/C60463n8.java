package il1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import gy3.C87412m;
import ok1.C62042e;

/* renamed from: il1.n8 */
public final class C60463n8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60424h8 f172374d;

    /* renamed from: e */
    public final /* synthetic */ long f172375e;

    public C60463n8(C60424h8 h8Var, long j) {
        this.f172374d = h8Var;
        this.f172375e = j;
    }

    public final void run() {
        C62042e eVar = C62042e.f176370a;
        if (eVar.mo87027N0() || !this.f172374d.f172278C || this.f172375e != 0) {
            Context context = this.f172374d.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            this.f172374d.f172292w.setTextSize(1, (12.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
            this.f172374d.f172292w.setText(eVar.mo87005G(this.f172375e));
        }
    }
}
