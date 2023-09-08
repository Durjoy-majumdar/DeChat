package fm1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39630m0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.NearbyHomeUIC;
import com.tencent.p014mm.plugin.finder.nearby.NearbyUI;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI;
import com.tencent.p014mm.plugin.finder.nearby.live.square.more.NearbyLiveMoreUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import hn1.C8614b;
import ht1.C60184m;
import j20.C117292a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import jh3.C60869d;
import jn1.C9479b;
import jq3.C9493c;
import k20.C9556a;
import ln1.C10583e;
import ln1.C10585g;
import ln1.C21445b;
import ln1.C21448d;
import mm1.C10934a;
import mm1.C10935b;
import nn1.C11235c;
import ns3.C11266d;
import ns3.C11267f;
import ns3.C11268g;
import ns3.C61893e;
import p147ea.C7606d;
import p204mr.C11078h;
import pm1.C62381d;
import rs1.C13442s8;
import te3.C51942x91;
import vc1.C37715b;

@C86522b
/* renamed from: fm1.c */
public final class C8137c extends C60869d implements C11266d {

    /* renamed from: g */
    public final C39630m0 f26997g = new C39630m0();

    /* renamed from: h */
    public final Set<MMActivity> f26998h = Collections.synchronizedSet(new HashSet());

    /* renamed from: i */
    public final Set<MMActivity> f26999i = Collections.synchronizedSet(new HashSet());

    public C8137c() {
        super("PluginFinderNearby");
    }

    public boolean Bo0(Fragment fragment) {
        return fragment instanceof AbsNearByFragment;
    }

    public boolean D00(int i, View view, float f) {
        C87412m.m108594g(view, "view");
        return C10934a.f32583a.mo11134c(i, view, f);
    }

    public void F70(long j, long j2, int i) {
        long j3 = j;
        C21448d.m24264c(C21448d.f60723a, (String) null, (String) null, (String) null, (String) null, 0, j3, 0, 0, 0, 0, j2 + 1, (long) i, 0, 5087, (Object) null);
    }

    /* renamed from: HZ */
    public boolean mo9180HZ(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "finder");
        int i = ((C13442s8) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C13442s8.class)).f38096i;
        Pattern pattern = C60184m.f171716a;
        if ((i == 76 || i == 77 || i == 80) || mMActivity.containUIC(NearbyHomeUIC.class)) {
            if (!this.f26999i.contains(mMActivity)) {
                this.f26999i.add(mMActivity);
            }
            return true;
        } else if (!((C7606d) C86312j.m106911c(C7606d.class)).mo8737Dd(i) && !(mMActivity instanceof FinderLiveFindPageUI)) {
            return false;
        } else {
            if (!this.f26998h.contains(mMActivity)) {
                this.f26998h.add(mMActivity);
            }
            return true;
        }
    }

    public String J00(Fragment fragment) {
        return fragment instanceof AbsNearByFragment ? ((AbsNearByFragment) fragment).mo3553U() : "";
    }

    /* renamed from: LB */
    public int mo9182LB(Fragment fragment) {
        if (fragment instanceof AbsNearByFragment) {
            return ((AbsNearByFragment) fragment).mo3555X();
        }
        return 0;
    }

    public int Nm0(Fragment fragment) {
        if (fragment instanceof AbsNearByFragment) {
            return ((AbsNearByFragment) fragment).mo2203R();
        }
        return 0;
    }

    /* renamed from: Nw */
    public void mo9184Nw(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, NearbyLiveMoreUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterNearbyLiveMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterNearbyLiveMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Ob0(long j) {
        C21448d.f60723a.mo33624b(j);
    }

    public int Pa0(int i, int i2) {
        return i2 + 1005000 + i;
    }

    /* renamed from: Uy */
    public C11268g mo9187Uy() {
        return C10585g.f31933a;
    }

    /* renamed from: YS */
    public C11267f mo9188YS() {
        return C10583e.f31911a;
    }

    public int Yg0(Fragment fragment) {
        if (fragment instanceof AbsNearByFragment) {
            return ((AbsNearByFragment) fragment).f15527o;
        }
        return 0;
    }

    public int Zb0(int i) {
        return C8164o.f27042a.mo9219c(i);
    }

    /* renamed from: bV */
    public void mo9191bV(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C11235c.f33110a.mo12481a("clickEnter");
        if (intent == null) {
            intent = new Intent();
        }
        C8614b bVar = C8614b.f27717a;
        bVar.mo9486k(intent);
        C21445b bVar2 = C21445b.f60694a;
        C37715b bVar3 = C37715b.f99914a;
        bVar2.mo33620i(true, bVar3.mo61298a());
        if (bVar3.mo61298a()) {
            bVar.mo9487l(intent, 88889, 0, "同城直播");
        } else if (!bVar2.mo33612a()) {
            bVar.mo9487l(intent, 88890, 0, "推荐");
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, NearbyUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLbsLiveFriendsUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLbsLiveFriendsUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: fp */
    public void mo9192fp(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "finder");
        this.f26999i.remove(mMActivity);
        this.f26998h.remove(mMActivity);
    }

    /* renamed from: ft */
    public C11078h mo9193ft(Context context, RecyclerView recyclerView, List<? extends C9493c> list, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        Context context2 = context;
        C87412m.m108594g(context, "context");
        RecyclerView recyclerView2 = recyclerView;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(list, "feedList");
        C87412m.m108594g(wxRecyclerAdapter, "adapter");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
        if (staggeredGridLayoutManager != null && staggeredGridLayoutManager.f44890d == 2) {
            return new C62381d(context, recyclerView, list, false, 0, false, false, false, wxRecyclerAdapter, 240, (C8480h) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("createLiveCardAutoPlayMgr: wrong layout manager, ");
        sb.append(staggeredGridLayoutManager);
        sb.append(", spanCount=");
        sb.append(staggeredGridLayoutManager != null ? staggeredGridLayoutManager.f44890d : -1);
        Log.m105928w("FinderNearbyFeatureService", sb.toString());
        return null;
    }

    public C39630m0 getViewModelStore() {
        return this.f26997g;
    }

    /* renamed from: go */
    public boolean mo9194go() {
        return this.f26998h.size() > 0;
    }

    /* renamed from: hT */
    public C61893e mo9195hT() {
        return C10935b.f32585a;
    }

    public boolean jk0(MMActivity mMActivity) {
        C87412m.m108594g(mMActivity, "finder");
        int i = ((C13442s8) C39818r.f106831a.mo62444c(mMActivity).mo75002a(C13442s8.class)).f38096i;
        Pattern pattern = C60184m.f171716a;
        return (i == 76 || i == 77 || i == 80) || mMActivity.containUIC(NearbyHomeUIC.class) || ((C7606d) C86312j.m106911c(C7606d.class)).mo8737Dd(i) || (mMActivity instanceof FinderLiveFindPageUI);
    }

    /* renamed from: kQ */
    public boolean mo9197kQ() {
        return this.f26999i.size() > 0;
    }

    public int l00() {
        return C8164o.f27042a.mo9217a();
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
    }

    /* renamed from: sc */
    public void mo9200sc(int i) {
        C51942x91 x912 = new C51942x91();
        x912.f144531d = i;
        C9479b c = C8614b.f27717a.mo9478c(x912);
        if (c != null) {
            c.mo10168i();
        }
    }
}
