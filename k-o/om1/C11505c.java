package om1;

import ak1.C0075i;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import nn1.C11232a;
import nn1.C11235c;
import pe3.C89349b;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C51942x91;

/* renamed from: om1.c */
public final class C11505c extends UIComponent {

    /* renamed from: d */
    public C51942x91 f33802d;

    /* renamed from: e */
    public C11503a f33803e;

    /* renamed from: f */
    public C11504b f33804f;

    /* renamed from: om1.c$a */
    public static final class C11506a extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public static final C11506a f33805d = new C11506a();

        public C11506a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C59670o2) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11505c(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bkd;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C11504b bVar = this.f33804f;
        if (bVar != null) {
            bVar.f31859w.onChanged();
        } else {
            C87412m.m108603p("liveFriendsCallback");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C13442s8.class;
        super.onCreate(bundle);
        C51942x91 x912 = new C51942x91();
        this.f33802d = x912;
        x912.f144532e = "同城直播";
        x912.f144531d = 88889;
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate(), tab:");
        C51942x91 x913 = this.f33802d;
        sb.append(x913 != null ? x913.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        C11232a aVar = C11235c.f33110a;
        C11235c.f33110a.mo12482c("livePageOnCreate");
        Fragment fragment = getFragment();
        C49712hj1 q3 = fragment != null ? ((C13442s8) C39818r.f106831a.mo62445d(fragment).mo75002a(cls)).mo12861q3() : ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).mo12861q3();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        Fragment fragment2 = getFragment();
        C87412m.m108591d(fragment2);
        this.f33803e = new C11503a((MMActivity) activity, fragment2, q3, this.f33802d);
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity2;
        Fragment fragment3 = getFragment();
        C87412m.m108592e(fragment3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
        AbsNearByFragment absNearByFragment = (AbsNearByFragment) fragment3;
        C11503a aVar2 = this.f33803e;
        if (aVar2 != null) {
            C11504b bVar = new C11504b(mMActivity, absNearByFragment, aVar2, getRootView(), q3, false, this.f33802d);
            this.f33804f = bVar;
            C11503a aVar3 = this.f33803e;
            if (aVar3 != null) {
                aVar3.mo3571L0(bVar, false, (C89349b) null);
            } else {
                C87412m.m108603p("liveFriendsPresenter");
                throw null;
            }
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        StringBuilder sb = new StringBuilder();
        sb.append("onDestroy() tab:");
        C51942x91 x912 = this.f33802d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        C11503a aVar = this.f33803e;
        if (aVar != null) {
            aVar.mo3572M0();
            C11503a aVar2 = this.f33803e;
            if (aVar2 != null) {
                aVar2.onDetach();
            } else {
                C87412m.m108603p("liveFriendsPresenter");
                throw null;
            }
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onPause() {
        Class cls = C54108o.class;
        super.onPause();
        C11503a aVar = this.f33803e;
        if (aVar != null) {
            aVar.mo3575S0();
            C54108o oVar = (C54108o) C86312j.m106911c(cls);
            C11504b bVar = this.f33804f;
            if (bVar != null) {
                oVar.Ix0(bVar.mo10825p(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "80", C0075i.EVENT_ON_PAUSE, ((C54108o) C86312j.m106911c(cls)).f151873d, ((C54108o) C86312j.m106911c(cls)).f151873d);
            } else {
                C87412m.m108603p("liveFriendsCallback");
                throw null;
            }
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onResume() {
        Class cls = C54108o.class;
        super.onResume();
        C54108o oVar = (C54108o) C86312j.m106911c(cls);
        C11504b bVar = this.f33804f;
        if (bVar != null) {
            oVar.Ix0(bVar.mo10825p(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "80", C0075i.EVENT_ON_RESUME, ((C54108o) C86312j.m106911c(cls)).f151873d, ((C54108o) C86312j.m106911c(cls)).f151873d);
        } else {
            C87412m.m108603p("liveFriendsCallback");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        StringBuilder sb = new StringBuilder();
        sb.append("onStart() tab:");
        C51942x91 x912 = this.f33802d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        C11503a aVar = this.f33803e;
        if (aVar != null) {
            aVar.mo3574N0();
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onStop() {
        super.onStop();
        StringBuilder sb = new StringBuilder();
        sb.append("onStop() tab:");
        C51942x91 x912 = this.f33802d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        StringBuilder sb = new StringBuilder();
        sb.append("onUserVisibleFocused() tab:");
        C51942x91 x912 = this.f33802d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        ((FinderVideoRecycler) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class)).mo80066B0(C11506a.f33805d);
        C11503a aVar = this.f33803e;
        if (aVar != null) {
            aVar.mo3576T0();
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        StringBuilder sb = new StringBuilder();
        sb.append("onUserVisibleUnFocused() tab:");
        C51942x91 x912 = this.f33802d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        C11503a aVar = this.f33803e;
        if (aVar != null) {
            aVar.mo3577W0();
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }
}
