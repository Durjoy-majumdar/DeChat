package com.tencent.p014mm.plugin.finder.nearby.live.square.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import hn1.C8614b;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import ln1.C10584f;
import ln1.C10585g;
import o31.C11345b;
import o31.C76986a;
import p185kq.C61130g;
import q31.C118148a;
import rm1.C13087a;
import rs1.C13442s8;
import sx3.C110826x0;
import te3.C51942x91;
import um1.C14249b;
import um1.C14250c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/page/NearbyLiveSquareTabFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment */
public final class NearbyLiveSquareTabFragment extends AbsNearByFragment {

    /* renamed from: r */
    public final C51942x91 f15690r;

    /* renamed from: s */
    public C51942x91 f15691s;

    /* renamed from: t */
    public int f15692t;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment$a */
    public static final class C3314a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ NearbyLiveSquareTabFragment f15693a;

        public C3314a(NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment) {
            this.f15693a = nearbyLiveSquareTabFragment;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
            r1 = r1.getIntent();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Map<java.lang.String, java.lang.Object> mo37b(java.lang.String r5) {
            /*
                r4 = this;
                r5 = 2
                rx3.l[] r5 = new rx3.C13604l[r5]
                com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r0 = r4.f15693a
                te3.x91 r0 = r0.f15690r
                int r0 = r0.f144531d
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                rx3.l r1 = new rx3.l
                java.lang.String r2 = "live_tab_id"
                r1.<init>(r2, r0)
                r0 = 0
                r5[r0] = r1
                r0 = 1
                com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r1 = r4.f15693a
                androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
                java.lang.String r2 = "enter_from_type"
                if (r1 == 0) goto L_0x0032
                android.content.Intent r1 = r1.getIntent()
                if (r1 == 0) goto L_0x0032
                r3 = -1
                int r1 = r1.getIntExtra(r2, r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0033
            L_0x0032:
                r1 = 0
            L_0x0033:
                rx3.l r3 = new rx3.l
                r3.<init>(r2, r1)
                r5[r0] = r3
                java.util.Map r5 = sx3.C90364q0.m113147f(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment.C3314a.mo37b(java.lang.String):java.util.Map");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyLiveSquareTabFragment(C51942x91 x912, C51942x91 x913, int i, C8480h hVar) {
        super(C0966R.string.f361089h70, 1005);
        x913 = (i & 2) != 0 ? null : x913;
        C87412m.m108594g(x912, "tabInfo");
        this.f15690r = x912;
        this.f15691s = x913;
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C14250c.class);
    }

    /* renamed from: O */
    public void mo2202O() {
        super.mo2202O();
        C10585g.f31933a.mo10847e(this);
        C13087a.f37254a.mo12581b(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C10584f fVar = (C10584f) C39818r.f106831a.mo62443b(activity).mo75002a(C10584f.class);
            fVar.f31927i = "";
            fVar.f31928j = 0;
            fVar.f31929n = true;
        }
        ((C61130g) C86312j.m106911c(C61130g.class)).mo33243YN(String.valueOf(mo2203R()));
    }

    /* renamed from: P */
    public void mo3550P() {
        super.mo3550P();
        C10585g.f31933a.mo10848f(this);
        C13087a.f37254a.mo12582c(this);
    }

    /* renamed from: R */
    public int mo2203R() {
        return getActivity() != null ? ((C13442s8) mo82247K(C13442s8.class)).f38096i : this.f15692t;
    }

    /* renamed from: T */
    public String mo3552T() {
        return String.valueOf(this.f15690r.f144531d);
    }

    /* renamed from: V */
    public String mo3554V() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo2203R());
        sb.append('-');
        C51942x91 x912 = this.f15690r;
        sb.append(x912 != null ? Integer.valueOf(x912.f144531d) : "");
        return sb.toString();
    }

    /* renamed from: X */
    public int mo3555X() {
        return 3;
    }

    /* renamed from: Z */
    public void mo3557Z() {
        C14249b bVar = ((C14250c) mo82247K(C14250c.class)).f39777e;
        if (bVar != null) {
            bVar.mo3569J0(false);
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    /* renamed from: a0 */
    public void mo3558a0() {
        C14249b bVar = ((C14250c) mo82247K(C14250c.class)).f39777e;
        if (bVar != null) {
            bVar.mo3569J0(true);
        } else {
            C87412m.m108603p("liveFriendsPresenter");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(cls)).mo86163dt(this);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.NearbyLiveSquareTabFragment);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.FinderLive);
        Class<NearbyLiveSquareTabFragment> cls2 = NearbyLiveSquareTabFragment.class;
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "NearbyLiveSquareTabFragment");
        ((C61212e) C86312j.m106911c(cls)).mo86148No(this, 40, 25388);
        ((C61212e) C86312j.m106911c(cls)).E60(this, new C3314a(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String string;
        Class cls = C13442s8.class;
        C87412m.m108594g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle arguments = getArguments();
        boolean z = true;
        if (arguments != null) {
            arguments.getInt("key_use_dark_style", 1);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            int i = arguments2.getInt("key_from_comment_scene");
            if (!(i == 9500001 || i == 9500002 || i == 9500004 || i == 9500003)) {
                z = false;
            }
            if (!z) {
                i = (i * 100000) + this.f15690r.f144531d;
            }
            this.f15692t = i;
            int i2 = this.f15692t;
            ((C13442s8) mo82247K(cls)).f38096i = i2;
            C8614b bVar = C8614b.f27717a;
            int i3 = this.f15690r.f144531d;
            bVar.getClass();
            C8614b.f27722f.put(i3, Integer.valueOf(i2));
        }
        Bundle arguments3 = getArguments();
        if (!(arguments3 == null || (string = arguments3.getString("key_click_tab_context_id")) == null)) {
            ((C13442s8) mo82247K(cls)).f38100p = string;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str = arguments4.getString("key_click_tab_id")) == null) {
            str = "";
        }
        this.f15528p = str;
        return onCreateView;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((C14250c) mo82247K(C14250c.class)).onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onStop() {
        super.onStop();
        ((C13442s8) C39818r.f106831a.mo62445d(this).mo75002a(C13442s8.class)).onDestroy();
    }
}
