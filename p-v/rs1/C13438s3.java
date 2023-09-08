package rs1;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C8777j5;

/* renamed from: rs1.s3 */
public final class C13438s3 extends UIComponent {

    /* renamed from: d */
    public final FinderFollowListContract.FollowListPresent f38053d = new FinderFollowListContract.FollowListPresent();

    /* renamed from: e */
    public boolean f38054e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13438s3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.abs;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean z = true;
        if (intent == null || !intent.getBooleanExtra("from_teen_mode_setting_page", false)) {
            z = false;
        }
        this.f38054e = z;
        Log.m105924i("Finder.FinderFollowListUIC", "initDataFromIntent, isFromTeenModeSettingPage:" + this.f38054e);
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        FinderFollowListContract.FollowListViewCallback followListViewCallback = new FinderFollowListContract.FollowListViewCallback((MMActivity) activity, getRootView(), this.f38053d, this.f38054e);
        FinderFollowListContract.FollowListPresent followListPresent = this.f38053d;
        followListPresent.getClass();
        followListPresent.f15928e = followListViewCallback;
        C86709a0.m107524d().mo123455a(713, followListPresent);
        C86709a0.m107524d().mo123455a(3867, followListPresent);
        followListViewCallback.mo3730a();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f38053d.onDetach();
    }

    public void onPause() {
        super.onPause();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "12", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
    }

    public void onResume() {
        super.onResume();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "12", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13438s3(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
