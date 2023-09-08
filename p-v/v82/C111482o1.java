package v82;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.ScreenCastBigView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: v82.o1 */
public final class C111482o1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ScreenCastBigView f333774d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111482o1(ScreenCastBigView screenCastBigView) {
        super(0);
        this.f333774d = screenCastBigView;
    }

    public Object invoke() {
        View inflate = this.f333774d.getLayoutInflater().inflate(C0966R.C0971layout.bhn, this.f333774d, false);
        C87412m.m108593f(inflate, "getLayoutInflater().infl…lse\n                    )");
        if (this.f333774d.f315013i) {
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.h4o);
            if (imageView != null) {
                imageView.setBackgroundResource(C0966R.C0969drawable.ba8);
            }
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.h4p);
            if (textView != null) {
                textView.setText(C0966R.string.h0l);
            }
            inflate.setRotation(90.0f);
        }
        this.f333774d.addView(inflate, new FrameLayout.LayoutParams(this.f333774d.getResources().getDimensionPixelSize(C0966R.dimen.f3718c_), this.f333774d.getResources().getDimensionPixelSize(C0966R.dimen.f3718c_), 17));
        ScreenCastBigView screenCastBigView = this.f333774d;
        screenCastBigView.f315009e = 4;
        screenCastBigView.f315012h = inflate;
        Log.m105924i("MicroMsg.MT.ScreenCastBigView", "show ori dialog");
        C119179t tVar = C119157j.f356862d;
        C111480n1 n1Var = new C111480n1(this.f333774d, inflate);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(n1Var, 3000, false);
        return C13598b0.f38549a;
    }
}
