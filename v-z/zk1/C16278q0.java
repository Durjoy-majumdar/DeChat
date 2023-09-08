package zk1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import gy3.C87412m;

/* renamed from: zk1.q0 */
public abstract class C16278q0 extends UIComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16278q0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public final void mo14775c3() {
        if (getActivity() instanceof MMActivity) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).setSelfNavigationBarVisible(8);
        }
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
    }
}
