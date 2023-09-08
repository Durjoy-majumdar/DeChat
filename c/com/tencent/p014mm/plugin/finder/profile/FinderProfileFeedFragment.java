package com.tencent.p014mm.plugin.finder.profile;

import android.os.Bundle;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileFeedUIC;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import rs1.C13317l7;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C22415w0;
import vn3.C111562e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileTabUIC$a;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileFeedFragment */
public final class FinderProfileFeedFragment extends FinderHomeTabFragment implements FinderProfileTabUIC.C56223a {

    /* renamed from: q */
    public final C13601g f16108q = C36568h.m40985a(new C3421a(this));

    /* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileFeedFragment$a */
    public static final class C3421a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileFeedFragment f16109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3421a(FinderProfileFeedFragment finderProfileFeedFragment) {
            super(0);
            this.f16109d = finderProfileFeedFragment;
        }

        public Object invoke() {
            return Boolean.valueOf(C111562e.m152091a(this.f16109d.getActivity()));
        }
    }

    public FinderProfileFeedFragment() {
        this.f17334o = 104;
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C22415w0.m26092a(FinderProfileFeedUIC.class);
    }

    /* renamed from: Q */
    public void mo2207Q(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.mo2207Q(hashSet);
        if (((Boolean) ((C36570n) this.f16108q).getValue()).booleanValue()) {
            hashSet.remove(C13317l7.class);
        }
    }

    /* renamed from: e */
    public void mo3765e(boolean z) {
        Class cls = FinderProfileFeedUIC.class;
        if (z) {
            FinderProfileFeedUIC finderProfileFeedUIC = (FinderProfileFeedUIC) C39818r.f106831a.mo62445d(this).mo62449e(cls);
            if (finderProfileFeedUIC != null) {
                finderProfileFeedUIC.setCoveredStyle();
                return;
            }
            return;
        }
        FinderProfileFeedUIC finderProfileFeedUIC2 = (FinderProfileFeedUIC) C39818r.f106831a.mo62445d(this).mo62449e(cls);
        if (finderProfileFeedUIC2 != null) {
            finderProfileFeedUIC2.setNormalStyle();
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, C11345b.FinderProfileUI);
        ((C61212e) C86312j.m106911c(cls)).mo86179qs(this, C76986a.Finder);
        Class<FinderProfileFeedFragment> cls2 = FinderProfileFeedFragment.class;
        ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderProfileFeedFragment");
    }
}
