package ix1;

import android.widget.RelativeLayout;

/* renamed from: ix1.e0 */
public class C46317e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C46337n f124789d;

    public C46317e0(C46337n nVar) {
        this.f124789d = nVar;
    }

    public void run() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f124789d.f124843I.getLayoutParams();
        layoutParams.topMargin = this.f124789d.f124844J.getTop() + ((this.f124789d.f124844J.getHeight() - this.f124789d.f124843I.getHeight()) / 2);
        this.f124789d.f124843I.setLayoutParams(layoutParams);
    }
}
