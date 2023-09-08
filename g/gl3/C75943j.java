package gl3;

import android.content.Context;
import android.widget.LinearLayout;
import gl3.C75939h;
import kg3.C76577a;

/* renamed from: gl3.j */
public class C75943j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C75939h.C75940a f222696d;

    /* renamed from: e */
    public final /* synthetic */ Context f222697e;

    public C75943j(C75945m mVar, C75939h.C75940a aVar, Context context) {
        this.f222696d = aVar;
        this.f222697e = context;
    }

    public void run() {
        int top = (this.f222696d.f222688d.getTop() - this.f222696d.f222687c.getBottom()) - C76577a.m92151b(this.f222697e, 4);
        if (top < 0) {
            top = 0;
        }
        if (this.f222696d.f222688d.getTop() - this.f222696d.f222687c.getBottom() != C76577a.m92151b(this.f222697e, 4)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f222696d.f222688d.getLayoutParams();
            layoutParams.topMargin = -top;
            this.f222696d.f222688d.setLayoutParams(layoutParams);
        }
    }
}
