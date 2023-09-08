package iq1;

import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: iq1.e */
public final class C60595e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60593d f172703d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60595e(C60593d dVar) {
        super(0);
        this.f172703d = dVar;
    }

    public Object invoke() {
        C60593d dVar = this.f172703d;
        if (Math.max(dVar.f172695h - dVar.f172697j, 0) > 0) {
            C60593d dVar2 = this.f172703d;
            dVar2.f172696i = false;
            TextView textView = dVar2.f172694g;
            if (textView != null) {
                Resources resources = dVar2.getResources();
                C60593d dVar3 = this.f172703d;
                textView.setText(resources.getString(C0966R.string.czx, new Object[]{String.valueOf(Math.max(dVar3.f172695h - dVar3.f172697j, 0))}));
            }
        } else {
            C60593d dVar4 = this.f172703d;
            dVar4.f172696i = true;
            TextView textView2 = dVar4.f172694g;
            if (textView2 != null) {
                textView2.setText(dVar4.getResources().getString(C0966R.string.czy));
            }
        }
        return C13598b0.f38549a;
    }
}
