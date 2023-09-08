package rs1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: rs1.m6 */
public final class C13328m6 extends UIComponent {

    /* renamed from: d */
    public final FinderLivePurchaseListContract.PurchaseListPresenter f37802d = new FinderLivePurchaseListContract.PurchaseListPresenter(new FinderLivePurchaseContentListLoader(true));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13328m6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ajf;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f37802d.mo3756q(new FinderLivePurchaseListContract.PurchaseListViewCallback((MMActivity) activity, this.f37802d, getRootView()));
    }

    public void onDestroy() {
        super.onDestroy();
        this.f37802d.onDetach();
    }
}
