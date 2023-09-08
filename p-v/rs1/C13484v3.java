package rs1;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58784w3;
import f40.C86709a0;
import gy3.C87412m;
import os1.C11737e;

/* renamed from: rs1.v3 */
public final class C13484v3 extends UIComponent {

    /* renamed from: d */
    public RecyclerView f38206d;

    /* renamed from: e */
    public View f38207e;

    /* renamed from: f */
    public final Runnable f38208f = new C13485a(this);

    /* renamed from: g */
    public boolean f38209g;

    /* renamed from: h */
    public boolean f38210h = true;

    /* renamed from: i */
    public boolean f38211i;

    /* renamed from: j */
    public BaseFinderFeed f38212j;

    /* renamed from: n */
    public final MMHandler f38213n = new MMHandler(Looper.getMainLooper());

    /* renamed from: rs1.v3$a */
    public static final class C13485a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C13484v3 f38214d;

        public C13485a(C13484v3 v3Var) {
            this.f38214d = v3Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r0 = r0.getAdapter();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r8 = this;
                rs1.v3 r0 = r8.f38214d
                androidx.recyclerview.widget.RecyclerView r0 = r0.f38206d
                r1 = 0
                if (r0 == 0) goto L_0x0012
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                if (r0 == 0) goto L_0x0012
                int r0 = r0.getItemCount()
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "[videoComplete] count="
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "Finder.FullFeedGuideUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                r2 = 1
                if (r0 < r2) goto L_0x0091
                rs1.v3 r0 = r8.f38214d
                androidx.recyclerview.widget.RecyclerView r3 = r0.f38206d
                if (r3 == 0) goto L_0x0091
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r3.getLayoutManager()
                boolean r5 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
                r6 = 0
                if (r5 == 0) goto L_0x003e
                androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
                goto L_0x003f
            L_0x003e:
                r4 = r6
            L_0x003f:
                if (r4 == 0) goto L_0x0091
                int r4 = r4.mo17004z()
                androidx.recyclerview.widget.RecyclerView$e r5 = r3.getAdapter()
                if (r4 < 0) goto L_0x0091
                boolean r7 = r5 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
                if (r7 == 0) goto L_0x0091
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r0.f38212j
                if (r7 == 0) goto L_0x0091
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r5 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r5
                java.util.List r5 = r5.getData()
                int r4 = r4 + r2
                java.lang.Object r2 = sx3.C110818d0.m150917O(r5, r4)
                jq3.c r2 = (jq3.C9493c) r2
                if (r2 == 0) goto L_0x006b
                long r4 = r2.getItemId()
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                goto L_0x006c
            L_0x006b:
                r2 = r6
            L_0x006c:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r0.f38212j
                if (r0 == 0) goto L_0x0078
                long r4 = r0.getItemId()
                java.lang.Long r6 = java.lang.Long.valueOf(r4)
            L_0x0078:
                boolean r0 = gy3.C87412m.m108589b(r2, r6)
                if (r0 == 0) goto L_0x0091
                android.content.Context r0 = r3.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r2 = 2131165296(0x7f070070, float:1.7944805E38)
                float r0 = r0.getDimension(r2)
                int r0 = (int) r0
                r3.smoothScrollBy(r1, r0)
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13484v3.C13485a.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13484v3(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public final void mo12892c3(boolean z) {
        BaseFinderFeed baseFinderFeed;
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN;
        boolean z2 = false;
        boolean z3 = !i.mo119686g(aVar, false);
        RecyclerView recyclerView = this.f38206d;
        boolean m1 = recyclerView != null ? C58784w3.f168295a.mo83949m1(recyclerView) : false;
        C39818r rVar = C39818r.f106831a;
        boolean z4 = ((C11737e) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11737e.class)).mo11599c3(((C13442s8) rVar.mo62443b(getContext()).mo75002a(C13442s8.class)).mo12861q3()).f34350a != 0;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT, 0);
        if (!this.f38209g) {
            this.f38209g = z;
        }
        if (this.f38209g && (baseFinderFeed = this.f38212j) != null) {
            baseFinderFeed.mo3506k0(-1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[onCheckShowGuide] isUseNewGuide=");
        sb.append(z4);
        sb.append(" isShowGuideTips:");
        BaseFinderFeed baseFinderFeed2 = this.f38212j;
        sb.append(baseFinderFeed2 != null ? Integer.valueOf(baseFinderFeed2.mo3480N()) : null);
        sb.append(" isFirst=");
        sb.append(z3);
        sb.append(", liveListIsVisible:");
        sb.append(m1);
        sb.append(",recyclerView is null:");
        if (this.f38206d == null) {
            z2 = true;
        }
        sb.append(z2);
        Log.m105924i("Finder.FullFeedGuideUIC", sb.toString());
        if (z3 && !m1 && !z4 && !this.f38209g && this.f38210h) {
            this.f38213n.postUIDelayed(this.f38208f, 2000);
            if (j >= 3) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            }
        }
    }

    /* renamed from: d3 */
    public final void mo12893d3(C0740i2 i2Var) {
        C39818r rVar = C39818r.f106831a;
        if (((C11737e) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11737e.class)).mo11599c3(((C13442s8) rVar.mo62443b(getContext()).mo75002a(C13442s8.class)).mo12861q3()).f34350a != 0) {
            Log.m105928w("Finder.FullFeedGuideUIC", "isUseNewGuide");
        } else if (this.f38209g) {
            Log.m105928w("Finder.FullFeedGuideUIC", "first video media type placeholder no show guide");
        } else if (!this.f38210h) {
            Log.m105928w("Finder.FullFeedGuideUIC", "no show guide by share tips");
        } else {
            boolean z = !C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, false);
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT;
            int j = i.mo119689j(aVar, 0);
            RecyclerView recyclerView = this.f38206d;
            boolean m1 = recyclerView != null ? C58784w3.f168295a.mo83949m1(recyclerView) : false;
            Log.m105924i("Finder.FullFeedGuideUIC", "setShowGuideFeed isFirst:" + z + ",liveListIsVisible:" + m1);
            if (z && !m1 && (i2Var instanceof BaseFinderFeed) && j < 3) {
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
                baseFinderFeed.mo3506k0(1);
                this.f38212j = baseFinderFeed;
                ((FinderLikeGuideUIC) rVar.mo62444c(getActivity()).mo75002a(FinderLikeGuideUIC.class)).f18759e = false;
                RecyclerView recyclerView2 = this.f38206d;
                WxRecyclerAdapter wxRecyclerAdapter = null;
                RecyclerView.C16613e adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
                if (adapter instanceof WxRecyclerAdapter) {
                    wxRecyclerAdapter = (WxRecyclerAdapter) adapter;
                }
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.mo85798e6(baseFinderFeed.getItemId());
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(j + 1));
            }
        }
    }

    public boolean onBackPressed() {
        RecyclerView recyclerView;
        if (this.f38212j != null) {
            View view = this.f38207e;
            if ((view != null && view.getVisibility() == 0) && (recyclerView = this.f38206d) != null) {
                recyclerView.scrollBy(0, -((int) recyclerView.getContext().getResources().getDimension(C0966R.dimen.f3715c8)));
            }
        }
        return super.onBackPressed();
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        this.f38210h = !((C13490v9) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C13490v9.class)).mo12899d3();
    }

    public void onDestroy() {
        super.onDestroy();
        BaseFinderFeed baseFinderFeed = this.f38212j;
        if (baseFinderFeed != null) {
            baseFinderFeed.mo3506k0(-1);
        }
        this.f38213n.removeCallbacksAndMessages((Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13484v3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
