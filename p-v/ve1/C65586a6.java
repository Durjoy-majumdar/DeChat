package ve1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import jq3.C60905o;
import kg3.C76577a;

/* renamed from: ve1.a6 */
public final class C65586a6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f188720d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f188721e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f188722f;

    /* renamed from: g */
    public final /* synthetic */ TextView f188723g;

    /* renamed from: h */
    public final /* synthetic */ TextView f188724h;

    public C65586a6(View view, ImageView imageView, C60905o oVar, TextView textView, TextView textView2) {
        this.f188720d = view;
        this.f188721e = imageView;
        this.f188722f = oVar;
        this.f188723g = textView;
        this.f188724h = textView2;
    }

    public final void run() {
        int width = this.f188720d.getWidth();
        if (this.f188721e.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188722f.f173499A, C0966R.dimen.f3736cp);
        }
        if (this.f188723g.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188722f.f173499A, C0966R.dimen.f3760da);
        }
        this.f188724h.setMaxWidth(width);
    }
}
