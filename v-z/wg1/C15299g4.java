package wg1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;

/* renamed from: wg1.g4 */
public final class C15299g4 extends UIComponent {

    /* renamed from: d */
    public FinderLiveWeCoinHotConstract.Presenter f41595d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15299g4(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359769al3;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
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
        long longExtra = getActivity().getIntent().getLongExtra("KEY_LIVE_ID", 0);
        long longExtra2 = getActivity().getIntent().getLongExtra("KEY_OBJECT_ID", 0);
        String stringExtra = getActivity().getIntent().getStringExtra("KEY_OBJECT_NONCE_ID");
        String str = "";
        String str2 = stringExtra == null ? str : stringExtra;
        String stringExtra2 = getActivity().getIntent().getStringExtra("KEY_SESSION_ID");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        boolean booleanExtra = getActivity().getIntent().getBooleanExtra("KEY_IF_USE_NEW_VALUE", false);
        if (longExtra == 0 || longExtra2 == 0 || Util.isNullOrNil(str2)) {
            Log.m105920e(C54492n.TAG, "onCreate: error parameter liveId = " + longExtra + ", objectId = " + longExtra2 + ", objectNonceId = " + str2 + ", sessionId:" + str);
            getActivity().finish();
            return;
        }
        this.f41595d = new FinderLiveWeCoinHotConstract.Presenter(new FinderLiveWecoinHotLoader(longExtra, longExtra2, str2, 0, Boolean.valueOf(booleanExtra)));
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity2;
        FinderLiveWeCoinHotConstract.Presenter presenter = this.f41595d;
        if (presenter != null) {
            FinderLiveWeCoinHotConstract.ViewCallback viewCallback = new FinderLiveWeCoinHotConstract.ViewCallback(mMActivity, presenter);
            FinderLiveWeCoinHotConstract.Presenter presenter2 = this.f41595d;
            if (presenter2 != null) {
                presenter2.mo3760e(viewCallback);
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        FinderLiveWeCoinHotConstract.Presenter presenter = this.f41595d;
        if (presenter == null) {
            return;
        }
        if (presenter != null) {
            presenter.onDetach();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
