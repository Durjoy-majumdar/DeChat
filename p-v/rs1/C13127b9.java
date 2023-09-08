package rs1;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C64586nn1;
import zc1.C66785b;
import zp3.C23564m;

/* renamed from: rs1.b9 */
public final class C13127b9<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f37360d;

    public C13127b9(C13146c9 c9Var) {
        this.f37360d = c9Var;
    }

    public void onChanged(Object obj) {
        String str;
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        boolean z = true;
        if (aVar != null && aVar.f12908a) {
            String O5 = C66785b.f191882e.mo90662O5();
            if (!(O5 == null || O5.length() == 0)) {
                z = false;
            }
            if (z) {
                View findViewById = this.f37360d.findViewById(C0966R.C0970id.f359046ij3);
                C87412m.m108593f(findViewById, "findViewById<View>(com.t…r.base.api.R.id.red_pack)");
                C23564m.m28138h(findViewById, new C13571z8(this.f37360d));
                View findViewById2 = this.f37360d.findViewById(C0966R.C0970id.f359046ij3);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = findViewById2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = (TextView) this.f37360d.findViewById(C0966R.C0970id.ij4);
                C64586nn1 nn12 = aVar.f12909b;
                if (nn12 == null || (str = nn12.f184504f) == null) {
                    str = "";
                }
                textView.setText(str);
                this.f37360d.findViewById(C0966R.C0970id.f359046ij3).setOnClickListener(new C13115a9(aVar, this.f37360d));
                return;
            }
        }
        View findViewById3 = this.f37360d.findViewById(C0966R.C0970id.f359046ij3);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view2 = findViewById3;
        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$canPostButNoAccountUi$4", "onChanged", "(Lcom/tencent/mm/plugin/finder/extension/reddot/FinderRedDotNotifier$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
