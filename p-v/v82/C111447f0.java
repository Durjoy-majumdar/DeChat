package v82;

import android.widget.TextView;

/* renamed from: v82.f0 */
public final class C111447f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C111437e0 f333671d;

    /* renamed from: e */
    public final /* synthetic */ String f333672e;

    public C111447f0(C111437e0 e0Var, String str) {
        this.f333671d = e0Var;
        this.f333672e = str;
    }

    public final void run() {
        C111437e0 e0Var = this.f333671d;
        String str = this.f333672e;
        if (str == null) {
            str = "";
        }
        e0Var.mo163124b(str);
        this.f333671d.mo163127e().setVisibility(8);
        TextView textView = this.f333671d.f333630b;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
