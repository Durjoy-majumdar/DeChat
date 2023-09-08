package com.tencent.p014mm.plugin.finder.nearby.live.square.operation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import ln1.C10585g;
import rm1.C13087a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment;", "Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment */
public final class FinderLiveOperationFragment extends NearbyLiveSquareFragment {

    /* renamed from: r */
    public int f15684r = 9500001;

    /* renamed from: s */
    public String f15685s = "9001";

    /* renamed from: t */
    public long f15686t;

    /* renamed from: u */
    public boolean f15687u = true;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment$a */
    public static final class C3312a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveOperationFragment f15688d;

        public C3312a(FinderLiveOperationFragment finderLiveOperationFragment) {
            this.f15688d = finderLiveOperationFragment;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f15688d.mo3559d0();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment$onCreateView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.operation.FinderLiveOperationFragment$b */
    public static final class C3313b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveOperationFragment f15689d;

        public C3313b(FinderLiveOperationFragment finderLiveOperationFragment) {
            this.f15689d = finderLiveOperationFragment;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long currentTimeMillis = System.currentTimeMillis();
            FinderLiveOperationFragment finderLiveOperationFragment = this.f15689d;
            if (currentTimeMillis - finderLiveOperationFragment.f15686t < 300) {
                finderLiveOperationFragment.mo3558a0();
            }
            this.f15689d.f15686t = currentTimeMillis;
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment$onCreateView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: R */
    public int mo2203R() {
        return this.f15684r;
    }

    /* renamed from: U */
    public String mo3553U() {
        return this.f15685s;
    }

    /* renamed from: X */
    public int mo3555X() {
        return 3;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f15684r = arguments != null ? arguments.getInt("key_from_comment_scene", this.f15684r) : this.f15684r;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("key_click_tab_id") : null;
        if (string == null) {
            string = this.f15685s;
        }
        this.f15685s = string;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ENTER_FINDER_LIVE_SQUARE_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getActivity() instanceof MMFinderUI) {
            FragmentActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            View findViewById = ((MMFinderUI) activity).findViewById(C0966R.C0970id.dse);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C3312a(this));
            }
            FragmentActivity activity2 = getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            TextView textView = (TextView) ((MMFinderUI) activity2).findViewById(C0966R.C0970id.hal);
            if (textView != null) {
                textView.setTextSize(1, 15.0f);
            }
            FragmentActivity activity3 = getActivity();
            C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            TextView textView2 = (TextView) ((MMFinderUI) activity3).findViewById(C0966R.C0970id.e0i);
            if (textView2 != null) {
                textView2.setOnClickListener(new C3313b(this));
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
        Log.m105924i("NearbyLiveSquareFragment", "onResume() isFirstOnResume:" + this.f15687u);
        C10585g gVar = C10585g.f31933a;
        C10585g.f31936d = C31543z5.m39453c();
        if (!this.f15687u && getActivity() != null) {
            C13087a.f37254a.mo12581b(((NearbyLiveSquareUIC) mo82247K(NearbyLiveSquareUIC.class)).mo3605d3());
        }
        this.f15687u = false;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        mo2202O();
    }
}
