package ly1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.webview.luggage.C85514l0;
import java.util.HashMap;

/* renamed from: ly1.z */
public class C88668z extends C85514l0 {

    /* renamed from: u */
    public C88669a f255986u;

    /* renamed from: ly1.z$a */
    public interface C88669a {
    }

    public C88668z(Context context) {
        super(context);
    }

    /* renamed from: b */
    public void mo118896b() {
        super.mo118896b();
        C88669a aVar = this.f255986u;
        if (aVar != null) {
            C88665d0 d0Var = (C88665d0) aVar;
            if (d0Var.f255983a.f292297n != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                C99730g0 g0Var = d0Var.f255983a;
                g0Var.f292297n = 0;
                HashMap hashMap = new HashMap();
                hashMap.put("loading_time", Long.valueOf(currentTimeMillis - g0Var.f292297n));
                d0Var.f255983a.mo139083b(501, 41, hashMap);
                d0Var.f255983a.f292295i.mo119904f();
            }
        }
    }

    /* renamed from: d */
    public void mo118898d(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f249185d.getLayoutParams();
        layoutParams.topMargin = i - this.f249185d.getHeight();
        this.f249185d.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    public void mo118899e() {
        C88669a aVar = this.f255986u;
        if (aVar != null) {
            C88665d0 d0Var = (C88665d0) aVar;
            d0Var.f255983a.f292297n = System.currentTimeMillis();
            d0Var.f255983a.f292295i.mo119903e();
            d0Var.f255983a.postDelayed(new C88664c0(d0Var), 400);
        }
    }

    /* renamed from: f */
    public void mo118900f(View view, View view2) {
        super.mo118900f(view, view2);
        setPullDownBackgroundColor(-1);
    }

    public void setOnPullDownListener(C88669a aVar) {
        this.f255986u = aVar;
    }
}
