package ve1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import jq3.C60905o;
import kg3.C76577a;

/* renamed from: ve1.v5 */
public final class C65675v5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f188967d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f188968e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f188969f;

    /* renamed from: g */
    public final /* synthetic */ TextView f188970g;

    /* renamed from: h */
    public final /* synthetic */ TextView f188971h;

    public C65675v5(View view, ImageView imageView, C60905o oVar, TextView textView, TextView textView2) {
        this.f188967d = view;
        this.f188968e = imageView;
        this.f188969f = oVar;
        this.f188970g = textView;
        this.f188971h = textView2;
    }

    public final void run() {
        int width = this.f188967d.getWidth();
        if (this.f188968e.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188969f.f173499A, C0966R.dimen.f3736cp);
        }
        if (this.f188970g.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188969f.f173499A, C0966R.dimen.f3760da);
        }
        this.f188971h.setMaxWidth(width);
    }
}
