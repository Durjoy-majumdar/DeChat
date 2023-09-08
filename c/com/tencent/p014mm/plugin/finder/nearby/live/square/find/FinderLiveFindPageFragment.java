package com.tencent.p014mm.plugin.finder.nearby.live.square.find;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import bl3.C39818r;
import c30.C104289g;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import h81.C59774i;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import l31.C61212e;
import ln1.C10585g;
import p565ir.C60606n;
import rm1.C13087a;
import rs1.C13442s8;
import te3.C49712hj1;
import wm1.C15530g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment;", "Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment */
public final class FinderLiveFindPageFragment extends NearbyLiveSquareFragment {

    /* renamed from: r */
    public long f15670r;

    /* renamed from: s */
    public boolean f15671s = true;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment$a */
    public static final class C3307a implements View.OnClickListener {

        /* renamed from: d */
        public long f15672d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveFindPageFragment f15673e;

        public C3307a(FinderLiveFindPageFragment finderLiveFindPageFragment) {
            this.f15673e = finderLiveFindPageFragment;
        }

        public void onClick(View view) {
            TabLayout.C55061f k;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            boolean z = currentTimeMillis - this.f15672d < ((long) 500);
            this.f15672d = currentTimeMillis;
            if (z) {
                Log.m105924i("NearbyLiveSquareFragment", "fast click, too fast guys.");
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            this.f15673e.mo3559d0();
            FinderLiveFindPageFragment finderLiveFindPageFragment = this.f15673e;
            if (finderLiveFindPageFragment.getActivity() != null) {
                C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62445d(finderLiveFindPageFragment).mo75002a(C13442s8.class)).mo12861q3();
                C104289g gVar = new C104289g();
                View view2 = finderLiveFindPageFragment.f165437h;
                C15530g.C15531a aVar = null;
                TabLayout tabLayout = view2 != null ? (TabLayout) view2.findViewById(C0966R.C0970id.f359340kd1) : null;
                Object obj = (tabLayout == null || (k = tabLayout.mo146907k(tabLayout != null ? tabLayout.getSelectedTabPosition() : 0)) == null) ? null : k.f154600a;
                if (obj instanceof C15530g.C15531a) {
                    aVar = (C15530g.C15531a) obj;
                }
                if (aVar != null) {
                    i = aVar.f42116c;
                }
                gVar.mo145967r("tab_id", Integer.valueOf(i));
                FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new FinderBroadcastEidClickStruct();
                finderBroadcastEidClickStruct.f9725d = Util.nowMilliSecond();
                finderBroadcastEidClickStruct.mo1017x("");
                finderBroadcastEidClickStruct.mo1012s("");
                finderBroadcastEidClickStruct.mo1011E("");
                finderBroadcastEidClickStruct.mo1008B("");
                String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                if (Wb == null) {
                    Wb = "";
                }
                finderBroadcastEidClickStruct.mo1019z(Wb);
                String str = q3.f134671e;
                if (str == null) {
                    str = "";
                }
                finderBroadcastEidClickStruct.mo1014u(str);
                finderBroadcastEidClickStruct.mo1013t("94");
                finderBroadcastEidClickStruct.mo1010D("");
                finderBroadcastEidClickStruct.mo1007A("");
                finderBroadcastEidClickStruct.mo1018y("");
                finderBroadcastEidClickStruct.mo1015v("more_page_star_live");
                finderBroadcastEidClickStruct.mo1016w(gVar.toString());
                finderBroadcastEidClickStruct.mo1009C(((C60606n) C86312j.m106911c(C60606n.class)).tx0());
                finderBroadcastEidClickStruct.mo86054n();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageFragment$b */
    public static final class C3308b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFindPageFragment f15674d;

        public C3308b(FinderLiveFindPageFragment finderLiveFindPageFragment) {
            this.f15674d = finderLiveFindPageFragment;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long currentTimeMillis = System.currentTimeMillis();
            FinderLiveFindPageFragment finderLiveFindPageFragment = this.f15674d;
            if (currentTimeMillis - finderLiveFindPageFragment.f15670r < 300) {
                finderLiveFindPageFragment.mo3558a0();
            }
            this.f15674d.f15670r = currentTimeMillis;
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/square/find/FinderLiveFindPageFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: U */
    public String mo3553U() {
        return "8001";
    }

    /* renamed from: X */
    public int mo3555X() {
        return 3;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ENTER_FINDER_LIVE_SQUARE_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Class cls = C61212e.class;
        C87412m.m108594g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getActivity() instanceof MMFinderUI) {
            FragmentActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            View findViewById = ((MMFinderUI) activity).findViewById(C0966R.C0970id.dse);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C3307a(this));
            }
            FragmentActivity activity2 = getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            TextView textView = (TextView) ((MMFinderUI) activity2).findViewById(C0966R.C0970id.hal);
            if (textView != null) {
                textView.setTextSize(1, 15.0f);
            }
            FragmentActivity activity3 = getActivity();
            C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            View findViewById2 = ((MMFinderUI) activity3).findViewById(C0966R.C0970id.e0i);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new C3308b(this));
            }
            FragmentActivity activity4 = getActivity();
            C87412m.m108592e(activity4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            View findViewById3 = ((MMFinderUI) activity4).findViewById(C0966R.C0970id.dse);
            if (findViewById3 != null) {
                ((C61212e) C86312j.m106911c(cls)).o30(findViewById3, "live_tab_page_start_live");
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(findViewById3, 40, 25388);
            }
        }
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
    }

    public void onPause() {
        super.onPause();
        if (getActivity() != null) {
            C13087a.f37254a.mo12582c(((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).mo3605d3());
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("NearbyLiveSquareFragment", "onResume() isFirstOnResume:" + this.f15671s);
        C10585g gVar = C10585g.f31933a;
        C10585g.f31936d = C31543z5.m39453c();
        if (!this.f15671s && getActivity() != null) {
            C13087a.f37254a.mo12581b(((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).mo3605d3());
        }
        this.f15671s = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        mo2202O();
    }
}
