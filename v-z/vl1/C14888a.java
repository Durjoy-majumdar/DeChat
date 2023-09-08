package vl1;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveLotteryAnchorAllHistoryLoader;
import com.tencent.p014mm.plugin.finder.lottery.history.FinderLotteryAnchorAllHistoryContract$Presenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import o40.C61926c;

/* renamed from: vl1.a */
public final class C14888a extends UIComponent {

    /* renamed from: d */
    public final String f40919d = "Finder.FinderLiveAnchorAllLotteryHistoryUIC";

    /* renamed from: e */
    public FinderLotteryAnchorAllHistoryContract$Presenter f40920e;

    /* renamed from: vl1.a$a */
    public static final class C14889a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f40921d;

        public C14889a(MMActivity mMActivity) {
            this.f40921d = mMActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f40921d.finish();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14888a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ahx;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        mMActivity.setMMTitle((int) C0966R.string.dxn);
        mMActivity.setBackBtn(new C14889a(mMActivity));
        long longExtra = getIntent().getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0);
        long longExtra2 = getIntent().getLongExtra("KEY_LOTTERY_HISTORY_LIVE_ID", 0);
        String stringExtra = getIntent().getStringExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        int intExtra = getIntent().getIntExtra("KEY_LOTTERY_HISTORY_SCENE", 1);
        int intExtra2 = getIntent().getIntExtra("KEY_SUPPORT_MULTI_TYPE", 0);
        if (intExtra == 0) {
            intExtra = 1;
        }
        long j = longExtra2;
        long j2 = longExtra2;
        FinderLiveLotteryAnchorAllHistoryLoader finderLiveLotteryAnchorAllHistoryLoader = r6;
        String str = stringExtra;
        FinderLiveLotteryAnchorAllHistoryLoader finderLiveLotteryAnchorAllHistoryLoader2 = new FinderLiveLotteryAnchorAllHistoryLoader(longExtra, j, stringExtra, intExtra, intExtra2);
        this.f40920e = new FinderLotteryAnchorAllHistoryContract$Presenter(finderLiveLotteryAnchorAllHistoryLoader, intExtra);
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity2 = (MMActivity) activity2;
        FinderLotteryAnchorAllHistoryContract$Presenter finderLotteryAnchorAllHistoryContract$Presenter = this.f40920e;
        if (finderLotteryAnchorAllHistoryContract$Presenter != null) {
            C14895d dVar = new C14895d(mMActivity2, finderLotteryAnchorAllHistoryContract$Presenter, false);
            FinderLotteryAnchorAllHistoryContract$Presenter finderLotteryAnchorAllHistoryContract$Presenter2 = this.f40920e;
            if (finderLotteryAnchorAllHistoryContract$Presenter2 != null) {
                finderLotteryAnchorAllHistoryContract$Presenter2.mo3456q(dVar);
                String str2 = this.f40919d;
                Log.m105924i(str2, "objectId：" + C61926c.m72691p(longExtra) + ", scene:" + intExtra + ", liveId:" + C61926c.m72691p(j2) + ", nonceId:" + str);
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
        FinderLotteryAnchorAllHistoryContract$Presenter finderLotteryAnchorAllHistoryContract$Presenter = this.f40920e;
        if (finderLotteryAnchorAllHistoryContract$Presenter == null) {
            return;
        }
        if (finderLotteryAnchorAllHistoryContract$Presenter != null) {
            finderLotteryAnchorAllHistoryContract$Presenter.onDetach();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
