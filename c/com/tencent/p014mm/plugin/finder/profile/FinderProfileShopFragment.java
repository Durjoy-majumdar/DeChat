package com.tencent.p014mm.plugin.finder.profile;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import bl3.C39818r;
import c30.C104289g;
import cm1.C0728e2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import dp1.C7435f2;
import gy3.C87412m;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import mo1.C61532u1;
import o40.C61926c;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C22415w0;
import te3.C49712hj1;
import ye1.C15984y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileShopFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC$a;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileShopFragment */
public final class FinderProfileShopFragment extends FinderHomeTabFragment implements FinderProfileTabUIC.C56223a {

    /* renamed from: q */
    public List<C0728e2> f160600q;

    /* renamed from: r */
    public C89349b f160601r;

    public FinderProfileShopFragment() {
        super(110);
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C22415w0.m26092a(C61532u1.class);
    }

    /* renamed from: O */
    public void mo2202O() {
        super.mo2202O();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            long longExtra = activity.getIntent().getLongExtra("finder_from_feed_id", 0);
            C13442s8 f = C13442s8.f38060Q0.mo12873f(activity);
            long valueOf = f != null ? Integer.valueOf(f.f38095h) : 0L;
            C7435f2 f2Var = C7435f2.f25626a;
            C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62443b(activity).mo75002a(C13442s8.class)).mo12861q3();
            C104289g gVar = new C104289g();
            gVar.put("finderusername", activity.getIntent().getStringExtra("finder_username"));
            gVar.put("from_commentscene", valueOf);
            gVar.put("from_feedid", C61926c.m72691p(longExtra));
            C13598b0 b0Var = C13598b0.f38549a;
            f2Var.mo8580d(q3, "prodtab", true, gVar);
        }
    }

    /* renamed from: e */
    public void mo3765e(boolean z) {
        C61532u1 u1Var = (C61532u1) C39818r.f106831a.mo62445d(this).mo62449e(C61532u1.class);
        if (u1Var == null) {
            return;
        }
        if (z) {
            ((C15984y) ((C36570n) u1Var.f174908r).getValue()).f43020a.setBackgroundResource(C0966R.color.ahf);
        } else {
            ((C15984y) ((C36570n) u1Var.f174908r).getValue()).f43020a.setBackgroundResource(C0966R.color.f2932f);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        List<C0728e2> list = this.f160600q;
        C89349b bVar = this.f160601r;
        if (list != null && bVar != null) {
            C61532u1 u1Var = (C61532u1) C39818r.f106831a.mo62445d(this).mo75002a(C61532u1.class);
            u1Var.getClass();
            u1Var.mo86481c3().f158736i = list;
            u1Var.mo86481c3().f158737j = bVar;
            BaseFeedLoader.requestInit$default(u1Var.mo86481c3(), false, 1, (Object) null);
        }
    }
}
