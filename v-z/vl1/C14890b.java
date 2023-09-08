package vl1;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader;
import com.tencent.p014mm.plugin.finder.lottery.history.FinderLotteryHistoryContract$Presenter;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: vl1.b */
public final class C14890b extends UIComponent {

    /* renamed from: d */
    public FinderLotteryHistoryContract$Presenter f40922d;

    /* renamed from: vl1.b$a */
    public static final class C14891a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14890b f40923d;

        public C14891a(C14890b bVar) {
            this.f40923d = bVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f40923d.getActivity().finish();
            return true;
        }
    }

    /* renamed from: vl1.b$b */
    public static final class C14892b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14890b f40924d;

        public C14892b(C14890b bVar) {
            this.f40924d = bVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f40924d.getActivity().finish();
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14890b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ahx;
    }

    public void onCreate(Bundle bundle) {
        FinderLotteryHistoryContract$Presenter finderLotteryHistoryContract$Presenter;
        boolean z;
        super.onCreate(bundle);
        int intExtra = getActivity().getIntent().getIntExtra("KEY_LOTTERY_HISTORY_SCENE", 0);
        long longExtra = getActivity().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_LIVE_ID", 0);
        long longExtra2 = getActivity().getIntent().getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0);
        String stringExtra = getActivity().getIntent().getStringExtra("KEY_LOTTERY_HISTORY_OBJECT_NONCE_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getActivity().getIntent().getStringExtra("KEY_LIVE_ANCHOR_USERNAME");
        String str = stringExtra2 == null ? "" : stringExtra2;
        int intExtra2 = getActivity().getIntent().getIntExtra("KEY_SUPPORT_MULTI_TYPE", 1);
        byte[] byteArrayExtra = getActivity().getIntent().getByteArrayExtra("KEY_LIVE_COOKIES");
        int intExtra3 = getActivity().getIntent().getIntExtra("KEY_LOTTERY_HISTORY_SOURCE", 0);
        if (intExtra == 0 || longExtra == 0 || longExtra2 == 0 || (Util.isNullOrNil(str) && intExtra == 2)) {
            getActivity().finish();
            return;
        }
        int i = intExtra;
        long j = longExtra;
        long j2 = longExtra2;
        String str2 = stringExtra;
        new FinderLotteryHistoryContract$Presenter(i, j, j2, str2, str, byteArrayExtra, intExtra3, new FinderLiveLotteryHistoryLoader(i, j, j2, str2, intExtra2));
        this.f40922d = finderLotteryHistoryContract$Presenter;
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        FinderLotteryHistoryContract$Presenter finderLotteryHistoryContract$Presenter2 = this.f40922d;
        if (finderLotteryHistoryContract$Presenter2 != null) {
            C14896e eVar = new C14896e(mMActivity, finderLotteryHistoryContract$Presenter2, true);
            FinderLotteryHistoryContract$Presenter finderLotteryHistoryContract$Presenter3 = this.f40922d;
            if (finderLotteryHistoryContract$Presenter3 != null) {
                finderLotteryHistoryContract$Presenter3.mo3456q(eVar);
                if (intExtra == 1) {
                    boolean booleanExtra = getIntent().getBooleanExtra("KEY_SHOW_SETTING_TITLE", false);
                    z = !booleanExtra;
                    AppCompatActivity activity2 = getActivity();
                    C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((MMActivity) activity2).setMMTitle(booleanExtra ? C0966R.string.dxn : C0966R.string.dxm);
                } else {
                    AppCompatActivity activity3 = getActivity();
                    C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((MMActivity) activity3).setMMTitle((int) C0966R.string.dy6);
                    z = true;
                }
                if (z) {
                    AppCompatActivity activity4 = getActivity();
                    C87412m.m108592e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((MMActivity) activity4).setBackBtn(new C14891a(this), C0966R.raw.icons_filled_close);
                    return;
                }
                AppCompatActivity activity5 = getActivity();
                C87412m.m108592e(activity5, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) activity5).setBackBtn(new C14892b(this));
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
        FinderLotteryHistoryContract$Presenter finderLotteryHistoryContract$Presenter = this.f40922d;
        if (finderLotteryHistoryContract$Presenter == null) {
            return;
        }
        if (finderLotteryHistoryContract$Presenter != null) {
            finderLotteryHistoryContract$Presenter.onDetach();
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
