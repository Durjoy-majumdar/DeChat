package v82;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105882d;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.ScreenCastBigView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;
import o40.C61926c;

/* renamed from: v82.t0 */
public final class C111489t0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C111456j0 f333784d;

    public C111489t0(C111456j0 j0Var) {
        this.f333784d = j0Var;
    }

    public void onChanged(Object obj) {
        Object obj2;
        List list = (List) obj;
        C87412m.m108593f(list, LocaleUtil.ITALIAN);
        C111456j0 j0Var = this.f333784d;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C87412m.m108589b(((C105882d) obj2).f314927b, j0Var.mo163158i().getCurrentUsername())) {
                break;
            }
        }
        C105882d dVar = (C105882d) obj2;
        if (dVar != null) {
            C111456j0 j0Var2 = this.f333784d;
            int i = dVar.f314933h;
            if (i == 102) {
                j0Var2.mo163158i().mo150945e(true);
            } else if (i == 104 || i == 100) {
                ScreenCastBigView i2 = j0Var2.mo163158i();
                i2.getClass();
                Log.m105924i("MicroMsg.MT.ScreenCastBigView", "showStop");
                View view = i2.f315012h;
                if (view != null) {
                    i2.removeView(view);
                    i2.f315012h = null;
                }
                TextView textView = new TextView(i2.getContext());
                textView.setTextColor(textView.getResources().getColor(C0966R.color.f2975b6));
                textView.setText(C0966R.string.h0m);
                textView.setTextSize(0, (float) C76577a.m92151b(textView.getContext(), 17));
                C61926c.m72668M(new C111484p1(i2, textView));
            } else {
                ScreenCastBigView i3 = j0Var2.mo163158i();
                int i4 = i3.f315009e;
                if (i4 == 2 || i4 == 3) {
                    Log.m105924i("MicroMsg.MT.ScreenCastBigView", "dismissPauseOrStop");
                    i3.mo150944d();
                }
            }
        }
    }
}
