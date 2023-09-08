package cs0;

import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.sdk.platformtools.Log;
import cs0.C45168h0;
import gy3.C87412m;
import o40.C61926c;

/* renamed from: cs0.x */
public final class C45197x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45168h0 f122515d;

    /* renamed from: e */
    public final /* synthetic */ C45181m f122516e;

    public C45197x(C45168h0 h0Var, C45181m mVar) {
        this.f122515d = h0Var;
        this.f122516e = mVar;
    }

    public final void run() {
        Button button = ((C45168h0.C45170b) this.f122515d).f122475z;
        if (button != null) {
            button.setVisibility(0);
        }
        int height = this.f122516e.f122487d.getWindow().getDecorView().getHeight();
        View view = this.f122515d.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        int i = C61926c.m72689n(view)[1];
        int measuredHeight = this.f122515d.f44854d.getMeasuredHeight();
        Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "fixManageAreaAtScreenBottom, windowHeight: " + height + ", manageAreaY: " + i + ", manageAreaHeight: " + measuredHeight);
        int i2 = height - (i + measuredHeight);
        if (i2 > 0) {
            this.f122515d.f44854d.setPadding(0, i2, 0, 0);
        }
        this.f122516e.f122491h = true;
    }
}
