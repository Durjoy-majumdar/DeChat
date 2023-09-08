package ve1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import jq3.C60905o;
import kg3.C76577a;

/* renamed from: ve1.e5 */
public final class C65589e5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f188732d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f188733e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f188734f;

    /* renamed from: g */
    public final /* synthetic */ TextView f188735g;

    /* renamed from: h */
    public final /* synthetic */ TextView f188736h;

    /* renamed from: i */
    public final /* synthetic */ TextView f188737i;

    /* renamed from: j */
    public final /* synthetic */ C65590f5 f188738j;

    public C65589e5(View view, ImageView imageView, C60905o oVar, TextView textView, TextView textView2, TextView textView3, C65590f5 f5Var) {
        this.f188732d = view;
        this.f188733e = imageView;
        this.f188734f = oVar;
        this.f188735g = textView;
        this.f188736h = textView2;
        this.f188737i = textView3;
        this.f188738j = f5Var;
    }

    public final void run() {
        int width = this.f188732d.getWidth();
        if (this.f188733e.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188734f.f173499A, C0966R.dimen.f3736cp);
        }
        if (this.f188735g.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188734f.f173499A, C0966R.dimen.f3753d4);
        }
        if (this.f188736h.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188734f.f173499A, C0966R.dimen.f3760da);
        }
        this.f188737i.setMaxWidth(width);
        String str = this.f188738j.f188740h;
        Log.m105924i(str, "maxWidth: " + width);
    }
}
