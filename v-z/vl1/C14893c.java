package vl1;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveLotteryListLoader;
import com.tencent.p014mm.plugin.finder.lottery.history.FinderLotteryListContract$Presenter;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: vl1.c */
public final class C14893c extends UIComponent {

    /* renamed from: d */
    public FinderLotteryListContract$Presenter f40925d;

    /* renamed from: vl1.c$a */
    public static final class C14894a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14893c f40926d;

        public C14894a(C14893c cVar) {
            this.f40926d = cVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f40926d.getActivity().finish();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14893c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ahx;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getActivity().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_LIVE_ID", 0);
        long longExtra2 = getActivity().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0);
        String stringExtra = getActivity().getIntent().getStringExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID");
        String str = stringExtra == null ? "" : stringExtra;
        int intExtra = getActivity().getIntent().getIntExtra("KEY_SCENE", 0);
        String stringExtra2 = getActivity().getIntent().getStringExtra("KEY_LOTTERY_ID");
        String str2 = stringExtra2 == null ? "" : stringExtra2;
        if (longExtra == 0 || longExtra2 == 0 || Util.isNullOrNil(str2)) {
            getActivity().finish();
            return;
        }
        this.f40925d = new FinderLotteryListContract$Presenter(new FinderLiveLotteryListLoader(str2, longExtra, longExtra2, str, intExtra));
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        FinderLotteryListContract$Presenter finderLotteryListContract$Presenter = this.f40925d;
        if (finderLotteryListContract$Presenter != null) {
            C14899h hVar = new C14899h(mMActivity, finderLotteryListContract$Presenter, true);
            FinderLotteryListContract$Presenter finderLotteryListContract$Presenter2 = this.f40925d;
            if (finderLotteryListContract$Presenter2 != null) {
                finderLotteryListContract$Presenter2.mo3456q(hVar);
                boolean booleanExtra = getIntent().getBooleanExtra("KEY_SHOW_SETTING_TITLE", false);
                AppCompatActivity activity2 = getActivity();
                C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) activity2).setMMTitle(booleanExtra ? C0966R.string.dxo : C0966R.string.dxl);
                AppCompatActivity activity3 = getActivity();
                C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) activity3).setBackBtn(new C14894a(this));
                getActivity().findViewById(C0966R.C0970id.br4).setBackgroundColor(getActivity().getResources().getColor(C0966R.color.al6));
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        FinderLotteryListContract$Presenter finderLotteryListContract$Presenter = this.f40925d;
        if (finderLotteryListContract$Presenter == null) {
            return;
        }
        if (finderLotteryListContract$Presenter != null) {
            finderLotteryListContract$Presenter.onDetach();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
