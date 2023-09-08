package ve1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import jq3.C60905o;
import kg3.C76577a;

/* renamed from: ve1.f6 */
public final class C65591f6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f188741d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f188742e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f188743f;

    /* renamed from: g */
    public final /* synthetic */ TextView f188744g;

    /* renamed from: h */
    public final /* synthetic */ TextView f188745h;

    /* renamed from: i */
    public final /* synthetic */ C65597g6 f188746i;

    public C65591f6(View view, ImageView imageView, C60905o oVar, TextView textView, TextView textView2, C65597g6 g6Var) {
        this.f188741d = view;
        this.f188742e = imageView;
        this.f188743f = oVar;
        this.f188744g = textView;
        this.f188745h = textView2;
        this.f188746i = g6Var;
    }

    public final void run() {
        int width = this.f188741d.getWidth();
        if (this.f188742e.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188743f.f173499A, C0966R.dimen.f3736cp);
        }
        if (this.f188744g.getVisibility() == 0) {
            width -= C76577a.m92164o(this.f188743f.f173499A, C0966R.dimen.f3760da);
        }
        this.f188745h.setMaxWidth(width);
        String str = this.f188746i.f188759h;
        Log.m105924i(str, "maxWidth: " + width);
    }
}
