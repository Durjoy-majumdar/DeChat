package ve1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import jq3.C60905o;
import kg3.C76577a;

/* renamed from: ve1.j5 */
public final class C65612j5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f188803d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f188804e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f188805f;

    /* renamed from: g */
    public final /* synthetic */ TextView f188806g;

    /* renamed from: h */
    public final /* synthetic */ TextView f188807h;

    public C65612j5(View view, ImageView imageView, C60905o oVar, TextView textView, TextView textView2) {
        this.f188803d = view;
        this.f188804e = imageView;
        this.f188805f = oVar;
        this.f188806g = textView;
        this.f188807h = textView2;
    }

    public final void run() {
        int width = this.f188803d.getWidth();
        if (this.f188804e.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188805f.f173499A, C0966R.dimen.f3736cp);
        }
        if (this.f188806g.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188805f.f173499A, C0966R.dimen.f3760da);
        }
        this.f188807h.setMaxWidth(width);
    }
}
