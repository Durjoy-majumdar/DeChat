package um1;

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
import pe3.C47465a;
import pe3.C89349b;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C51942x91;

/* renamed from: um1.c */
public final class C14250c extends UIComponent {

    /* renamed from: d */
    public C51942x91 f39776d;

    /* renamed from: e */
    public C14249b f39777e;

    /* renamed from: f */
    public C14252d f39778f;

    /* renamed from: g */
    public boolean f39779g;

    /* renamed from: um1.c$a */
    public static final class C14251a extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public static final C14251a f39780d = new C14251a();

        public C14251a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C59670o2) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14250c(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bkd;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C14252d dVar = this.f39778f;
        if (dVar != null) {
            dVar.f31859w.onChanged();
        } else {
            C87412m.m108603p("liveFriendsCallback");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        C51942x91 x912;
        byte[] byteArray;
        Class cls = C13442s8.class;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = true;
        if (arguments == null || arguments.getInt("key_use_dark_style", 1) != 1) {
            z = false;
        }
        this.f39779g = z;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("key_by_pass")) == null) {
            str = "";
        }
        String str2 = str;
        Bundle arguments3 = getArguments();
        C89349b bVar = null;
        if (arguments3 == null || (byteArray = arguments3.getByteArray("nearby_live_square_tab_info_key")) == null) {
            x912 = null;
        } else {
            C47465a parseFrom = new C51942x91().parseFrom(byteArray);
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveTabInfo");
            x912 = (C51942x91) parseFrom;
        }
        this.f39776d = x912;
        Bundle arguments4 = getArguments();
        boolean z2 = arguments4 != null ? arguments4.getBoolean("nearby_live_target_auto_refresh_params_key", false) : false;
        Bundle arguments5 = getArguments();
        byte[] byteArray2 = arguments5 != null ? arguments5.getByteArray("nearby_live_target_last_buffer_params_key") : null;
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate(), tab:");
        C51942x91 x913 = this.f39776d;
        sb.append(x913 != null ? x913.f144532e : null);
        sb.append(" targetPageForceRefreshFlag:");
        sb.append(z2);
        sb.append(" targetTabPageLastBuffer:");
        sb.append(byteArray2);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        C11232a aVar = C11235c.f33110a;
        C11235c.f33110a.mo12482c("livePageOnCreate");
        Fragment fragment = getFragment();
        C49712hj1 q3 = fragment != null ? ((C13442s8) C39818r.f106831a.mo62445d(fragment).mo75002a(cls)).mo12861q3() : ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).mo12861q3();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        Fragment fragment2 = getFragment();
        C87412m.m108591d(fragment2);
        this.f39777e = new C14249b((MMActivity) activity, fragment2, q3, this.f39776d, str2);
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity2;
        Fragment fragment3 = getFragment();
        C87412m.m108592e(fragment3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment");
        AbsNearByFragment absNearByFragment = (AbsNearByFragment) fragment3;
        C14249b bVar2 = this.f39777e;
        if (bVar2 != null) {
            C14252d dVar = new C14252d(mMActivity, absNearByFragment, bVar2, getRootView(), q3, this.f39779g, this.f39776d);
            this.f39778f = dVar;
            C14249b bVar3 = this.f39777e;
            if (bVar3 != null) {
                if (byteArray2 != null) {
                    bVar = new C89349b(byteArray2, 0, byteArray2.length);
                }
                bVar3.mo3571L0(dVar, z2, bVar);
                return;
            }
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
        C87412m.m108603p("liveFriendsPresenter");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        StringBuilder sb = new StringBuilder();
        sb.append("onDestroy() tab:");
        C51942x91 x912 = this.f39776d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        C14249b bVar = this.f39777e;
        if (bVar != null) {
            bVar.mo3572M0();
            C14249b bVar2 = this.f39777e;
            if (bVar2 != null) {
                bVar2.onDetach();
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
        StringBuilder sb = new StringBuilder();
        sb.append("onPause() tab:");
        C51942x91 x912 = this.f39776d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        C14249b bVar = this.f39777e;
        if (bVar != null) {
            bVar.mo3575S0();
            C54108o oVar = (C54108o) C86312j.m106911c(cls);
            C14252d dVar = this.f39778f;
            if (dVar != null) {
                oVar.Ix0(dVar.mo10825p(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "80", C0075i.EVENT_ON_PAUSE, ((C54108o) C86312j.m106911c(cls)).f151873d, ((C54108o) C86312j.m106911c(cls)).f151873d);
            } else {
                C87412m.m108603p("liveFriendsCallback");
                throw null;
            }
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C14249b bVar = this.f39777e;
        if (bVar != null) {
            Log.m105924i("Finder.NearbyLivePresenter", "onRequestPermissionsResult requestCode:" + i + " grantResults[0]:" + iArr[0]);
            if (i != 79 && i != 153) {
                return;
            }
            if (iArr[0] == 0) {
                bVar.mo3596x();
            } else {
                Log.m105924i("Finder.NearbyLivePresenter", "onRequestPermissionsResult return for grant.");
            }
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onResume() {
        Class cls = C54108o.class;
        super.onResume();
        StringBuilder sb = new StringBuilder();
        sb.append("onResume() tab:");
        C51942x91 x912 = this.f39776d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        C14249b bVar = this.f39777e;
        if (bVar != null) {
            bVar.mo3574N0();
            C54108o oVar = (C54108o) C86312j.m106911c(cls);
            C14252d dVar = this.f39778f;
            if (dVar != null) {
                oVar.Ix0(dVar.mo10825p(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "80", C0075i.EVENT_ON_RESUME, ((C54108o) C86312j.m106911c(cls)).f151873d, ((C54108o) C86312j.m106911c(cls)).f151873d);
            } else {
                C87412m.m108603p("liveFriendsCallback");
                throw null;
            }
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        StringBuilder sb = new StringBuilder();
        sb.append("onStart() tab:");
        C51942x91 x912 = this.f39776d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
    }

    public void onStop() {
        super.onStop();
        StringBuilder sb = new StringBuilder();
        sb.append("onStop() tab:");
        C51942x91 x912 = this.f39776d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
    }

    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        StringBuilder sb = new StringBuilder();
        sb.append("onUserVisibleFocused() tab:");
        C51942x91 x912 = this.f39776d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        ((FinderVideoRecycler) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(FinderVideoRecycler.class)).mo80066B0(C14251a.f39780d);
        C14249b bVar = this.f39777e;
        if (bVar != null) {
            bVar.mo3576T0();
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        StringBuilder sb = new StringBuilder();
        sb.append("onUserVisibleUnFocused() tab:");
        C51942x91 x912 = this.f39776d;
        sb.append(x912 != null ? x912.f144532e : null);
        Log.m105924i("NearbyLiveSquareTabUIC", sb.toString());
        C14249b bVar = this.f39777e;
        if (bVar != null) {
            bVar.mo3577W0();
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }
}
