package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import bl3.C0324s;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentFragment;
import dp1.C58391n;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8807v3;
import j20.C117292a;
import java.util.HashSet;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment */
public abstract class MMFinderFragment extends UIComponentFragment {

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment$a */
    public static final class C56388a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMFinderFragment f161217d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56388a(MMFinderFragment mMFinderFragment) {
            super(0);
            this.f161217d = mMFinderFragment;
        }

        public Object invoke() {
            View view = this.f161217d.getView();
            FragmentActivity activity = this.f161217d.getActivity();
            if (!(view == null || activity == null)) {
                C58391n.f167292a.mo83231g(view, activity);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: O */
    public void mo2202O() {
        C117292a.m165355a("com/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.mo2202O();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    /* renamed from: P */
    public void mo3550P() {
        C117292a.m165355a("com/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.mo3550P();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/fragment/MMFinderFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    /* renamed from: Q */
    public void mo2207Q(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.mo2207Q(hashSet);
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8807v3.class)));
    }

    /* renamed from: R */
    public int mo2203R() {
        return 0;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f165437h = onCreateView;
        return onCreateView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        C61926c.m72666K(0, new C56388a(this));
    }
}
