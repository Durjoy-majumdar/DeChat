package q52;

import android.animation.ValueAnimator;
import android.view.View;
import android.webkit.WebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import zp3.C23564m;

/* renamed from: q52.l */
public final /* synthetic */ class C89474l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C89468h f257536d;

    public C89474l(C89468h hVar) {
        this.f257536d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/magicbrush/util/MBInspectorImpl$setupButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "p0");
        C89468h hVar = this.f257536d;
        hVar.f257526l = !hVar.f257526l;
        Log.m105924i("MBInspectorImpl", "onClick: isShow?" + hVar.f257526l);
        WebView webView = hVar.f257520f;
        C87412m.m108591d(webView);
        if (hVar.f257526l) {
            if (!hVar.f257525k) {
                hVar.f257525k = true;
                C23564m.m28136f(new C89471i(hVar));
            }
            webView.setVisibility(0);
            webView.setTranslationY(hVar.mo123776h());
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.addUpdateListener(new C89472j(webView, hVar));
            ofFloat.start();
        } else {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.addUpdateListener(new C89473k(webView, hVar));
            ofFloat2.start();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/magicbrush/util/MBInspectorImpl$setupButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
