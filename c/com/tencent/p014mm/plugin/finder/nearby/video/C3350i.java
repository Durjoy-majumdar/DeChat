package com.tencent.p014mm.plugin.finder.nearby.video;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C20480e0;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import os1.C62153d;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.i */
public final class C3350i extends UIComponent {

    /* renamed from: d */
    public NearbyVideoPresenter f15800d;

    /* renamed from: e */
    public C3352j f15801e;

    /* renamed from: f */
    public final C62153d f15802f;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.i$a */
    public static final class C3351a extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public static final C3351a f15803d = new C3351a();

        public C3351a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C59670o2) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3350i(MMFragmentActivity mMFragmentActivity) {
        super((AppCompatActivity) mMFragmentActivity);
        C87412m.m108594g(mMFragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…alLocationVM::class.java)");
        this.f15802f = (C62153d) a;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bki;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        NearbyVideoPresenter nearbyVideoPresenter;
        C3352j jVar;
        int i3;
        NearbyVideoFeedLoader feedLoader;
        DataBuffer dataListJustForAdapter;
        if (i != 501) {
            if (i == 510 && i2 == -1 && (jVar = this.f15801e) != null && (i3 = jVar.f15810j) != -1) {
                NearbyVideoPresenter nearbyVideoPresenter2 = this.f15800d;
                if (!(nearbyVideoPresenter2 == null || (feedLoader = nearbyVideoPresenter2.getFeedLoader()) == null || (dataListJustForAdapter = feedLoader.getDataListJustForAdapter()) == null)) {
                    C0740i2 i2Var = (C0740i2) dataListJustForAdapter.remove(i3);
                }
                RecyclerView.C16613e adapter = jVar.getRecyclerView().getAdapter();
                if (adapter != null) {
                    adapter.notifyItemRemoved(i3);
                }
            }
        } else if (i2 == -1 && intent != null && (nearbyVideoPresenter = this.f15800d) != null) {
            nearbyVideoPresenter.refreshRV(intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C3352j jVar;
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (C85875k4.m106157N() && (jVar = this.f15801e) != null && (recyclerView = jVar.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C13442s8.class;
        super.onCreate(bundle);
        Fragment fragment = getFragment();
        C49712hj1 q3 = fragment != null ? ((C13442s8) C39818r.f106831a.mo62445d(fragment).mo75002a(cls)).mo12861q3() : ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).mo12861q3();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        NearbyVideoPresenter nearbyVideoPresenter = new NearbyVideoPresenter((MMActivity) activity);
        this.f15800d = nearbyVideoPresenter;
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        Fragment fragment2 = getFragment();
        C87412m.m108592e(fragment2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
        C3352j jVar = new C3352j(q3, (MMActivity) activity2, (AbsNearByFragment) fragment2, nearbyVideoPresenter, getRootView());
        nearbyVideoPresenter.onAttach((C3343b<C0740i2>) jVar);
        this.f15801e = jVar;
    }

    public void onDestroy() {
        super.onDestroy();
        NearbyVideoPresenter nearbyVideoPresenter = this.f15800d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onDetach();
        }
        C20480e0.f57583a.mo32047v(2, (C49712hj1) null);
    }

    public void onFinished() {
        super.onFinished();
        NearbyVideoPresenter nearbyVideoPresenter = this.f15800d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onFinishing();
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("Finder.TimelineLbsUIC", "onPause");
        NearbyVideoPresenter nearbyVideoPresenter = this.f15800d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onPause();
        }
        this.f15802f.mo9103H();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        NearbyVideoPresenter nearbyVideoPresenter = this.f15800d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("Finder.TimelineLbsUIC", "onResume");
        NearbyVideoPresenter nearbyVideoPresenter = this.f15800d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onResume();
        }
    }

    public void onUserVisibleFocused() {
        Log.m105924i("Finder.TimelineLbsUIC", "onUserVisibleFocused");
        super.onUserVisibleFocused();
        ((FinderVideoRecycler) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class)).mo80066B0(C3351a.f15803d);
        NearbyVideoPresenter nearbyVideoPresenter = this.f15800d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onUserVisibleFocused();
        }
        this.f15802f.mo9105q2(false);
    }

    public void onUserVisibleUnFocused() {
        Log.m105924i("Finder.TimelineLbsUIC", "onUserVisibleUnFocused");
        super.onUserVisibleUnFocused();
        NearbyVideoPresenter nearbyVideoPresenter = this.f15800d;
        if (nearbyVideoPresenter != null) {
            nearbyVideoPresenter.onUserVisibleUnFocused();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3350i(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…alLocationVM::class.java)");
        this.f15802f = (C62153d) a;
    }
}
