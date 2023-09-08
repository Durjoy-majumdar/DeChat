package ix1;

import android.widget.RelativeLayout;

/* renamed from: ix1.p */
public class C46342p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124902d;

    public C46342p(C46337n nVar) {
        this.f124902d = nVar;
    }

    public void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f124902d.f124843I.getLayoutParams();
        layoutParams.topMargin = this.f124902d.f124844J.getTop() + ((this.f124902d.f124844J.getHeight() - this.f124902d.f124843I.getHeight()) / 2);
        this.f124902d.f124843I.setLayoutParams(layoutParams);
    }
}
