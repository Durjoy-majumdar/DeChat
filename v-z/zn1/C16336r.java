package zn1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.playlist.FinderPlayListDrawer;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C7446m0;
import ds1.C7515a;
import er1.C7865r3;
import gy3.C87412m;
import ht1.C8808v4;
import jq3.C60905o;
import kf1.C10008v1;
import o40.C61926c;
import rs1.C13293k0;
import rs1.C13311l0;
import rs1.C13554z;
import rs1.C63575n3;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C50124kf1;
import te3.C51108rh0;
import up1.C37521f;

/* renamed from: zn1.r */
public final class C16336r extends UIComponent {

    /* renamed from: d */
    public FinderPlayListDrawer f43686d;

    /* renamed from: e */
    public boolean f43687e = getActivity().getIntent().getBooleanExtra("KEY_OPEN_PLAYLIST_DRAWER", false);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16336r(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo14820c3(C10008v1 v1Var, C60905o oVar, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(v1Var, "contract");
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(baseFinderFeed, "item");
        if (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e() && this.f43687e) {
            this.f43687e = false;
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C13554z zVar = (C13554z) rVar.mo62443b(context).mo75002a(C13554z.class);
            FinderHomeTabFragment finderHomeTabFragment = null;
            FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
            if (finderTimelinePresenter != null) {
                finderHomeTabFragment = finderTimelinePresenter.f13267h;
            }
            FinderPlayListDrawer finderPlayListDrawer = this.f43686d;
            zVar.getClass();
            zVar.mo12956c3(finderHomeTabFragment, baseFinderFeed, oVar, new C13293k0(finderPlayListDrawer), new C13311l0(finderPlayListDrawer));
            mo14821d3(baseFinderFeed.mo3513o(), 1, oVar.mo17363j(), (int) (((float) C7865r3.f26468a.mo8969b(oVar.f173499A)) * C7515a.f25777a.mo8637a(oVar.f173499A)));
            getActivity().getIntent().putExtra("KEY_OPEN_PLAYLIST_DRAWER", false);
            ((C63575n3) rVar.mo62444c(getActivity()).mo75002a(C63575n3.class)).mo88425i3(getActivity().getIntent().getExtras());
        }
    }

    /* renamed from: d3 */
    public final void mo14821d3(FinderItem finderItem, int i, int i2, int i3) {
        C51108rh0 rh02;
        C87412m.m108594g(finderItem, "feedObj");
        FinderPlayListDrawer finderPlayListDrawer = this.f43686d;
        if (finderPlayListDrawer != null) {
            C7446m0 m0Var = C7446m0.f25635a;
            C50124kf1 kf12 = finderItem.getFeedObject().object_extend;
            C7446m0.m7572b(m0Var, finderPlayListDrawer, "choose_collection_half_view", 0, 0, (kf12 == null || (rh02 = kf12.f136745d) == null) ? null : C90364q0.m113147f(new C13604l("collection_id", C61926c.m72691p(rh02.f140917d)), new C13604l("feed_location_id", Integer.valueOf(i2)), new C13604l("feed_id", C61926c.m72691p(finderItem.getFeedObject().f164794id))), 12, (Object) null);
        }
        FinderPlayListDrawer finderPlayListDrawer2 = this.f43686d;
        if (finderPlayListDrawer2 != null && !finderPlayListDrawer2.mo82541i()) {
            finderPlayListDrawer2.f15862z = finderItem;
            finderPlayListDrawer2.f15860B = i;
            finderPlayListDrawer2.f15861C = i2;
            if (i3 > 0) {
                int f = C75044y4.m89994f(finderPlayListDrawer2.getContext());
                int e = C75044y4.m89993e(finderPlayListDrawer2.getContext());
                C7865r3 r3Var = C7865r3.f26468a;
                int a = (r3Var.mo8968a() - f) - e;
                Context context = finderPlayListDrawer2.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                View decorView = ((Activity) context).getWindow().getDecorView();
                C87412m.m108593f(decorView, "context as Activity).window.decorView");
                finderPlayListDrawer2.setTopOffset((decorView.getSystemUiVisibility() & 1024) > 0 ? r3Var.mo8969b(finderPlayListDrawer2.getContext()) - i3 : Math.min((int) (((float) r3Var.mo8968a()) * 0.4f), (a - i3) + f));
            }
            finderPlayListDrawer2.mo82542j(true, true, 0);
        }
    }

    public boolean onBackPressed() {
        FinderPlayListDrawer finderPlayListDrawer = this.f43686d;
        if (!(finderPlayListDrawer != null && finderPlayListDrawer.mo82541i())) {
            return false;
        }
        FinderPlayListDrawer finderPlayListDrawer2 = this.f43686d;
        if (finderPlayListDrawer2 != null && finderPlayListDrawer2.mo82541i()) {
            finderPlayListDrawer2.mo82540h(true);
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FinderPlayListDrawer.f15858D;
        AppCompatActivity activity = getActivity();
        View decorView = getActivity().getWindow().getDecorView();
        C87412m.m108593f(decorView, "activity.window.decorView");
        C87412m.m108594g(activity, "context");
        Log.m105924i("Finder.FinderPlayListDrawer", "createDrawerToAttachWindow");
        FinderPlayListDrawer finderPlayListDrawer = new FinderPlayListDrawer(activity);
        C37521f.f99374d.getClass();
        if (C37521f.f99579z7.mo60266n().intValue() == 1) {
            finderPlayListDrawer.setChangeBackgroundAlpha(false);
            finderPlayListDrawer.setBackgroundColorRes(C0966R.color.ahf);
        }
        finderPlayListDrawer.setTopOffset((int) (((float) C7865r3.f26468a.mo8968a()) * (((float) 1) - C7515a.f25777a.mo8637a(activity))));
        C16322k kVar = new C16322k(new C16323l(activity));
        Context context = finderPlayListDrawer.getContext();
        C87412m.m108593f(context, "drawer.context");
        kVar.f43641s = context;
        finderPlayListDrawer.setId(C0966R.C0970id.nlm);
        kVar.f43630e = finderPlayListDrawer;
        finderPlayListDrawer.setSquaresBackgroundResource(C0966R.C0969drawable.b_3);
        finderPlayListDrawer.setEnableClickBackgroundToCloseDrawer(true);
        finderPlayListDrawer.mo82527b(kVar);
        decorView.post(new C16315d(activity, new FrameLayout.LayoutParams(-1, -1), decorView, finderPlayListDrawer, kVar));
        this.f43686d = finderPlayListDrawer;
    }

    public void onDestroy() {
        FinderPlayListDrawer finderPlayListDrawer = this.f43686d;
        if (finderPlayListDrawer != null) {
            finderPlayListDrawer.mo9498f();
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16336r(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
