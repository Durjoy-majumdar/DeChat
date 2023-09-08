package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8808v4;
import java.util.Set;
import kf1.C9732g;
import kf1.C9753h;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lkf1/h;", "V", "Lkf1/g;", "P", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment */
public abstract class FinderBaseGridFeedFragment<V extends C9753h, P extends C9732g> extends FinderHomeTabFragment {

    /* renamed from: q */
    public final C13601g f17307q = C36568h.m40985a(new C3806a(this));

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment$a */
    public static final class C3806a extends C87413o implements C32224a<MMActivity> {

        /* renamed from: d */
        public final /* synthetic */ FinderBaseGridFeedFragment<V, P> f17308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3806a(FinderBaseGridFeedFragment<V, P> finderBaseGridFeedFragment) {
            super(0);
            this.f17308d = finderBaseGridFeedFragment;
        }

        public Object invoke() {
            FragmentActivity activity = this.f17308d.getActivity();
            C87412m.m108591d(activity);
            return (MMActivity) activity;
        }
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return null;
    }

    /* renamed from: V */
    public final MMActivity mo4171V() {
        return (MMActivity) ((C36570n) this.f17307q).getValue();
    }

    /* renamed from: X */
    public abstract P mo4172X();

    /* renamed from: Y */
    public abstract V mo4173Y();

    /* renamed from: Z */
    public abstract void mo4174Z(View view);

    /* renamed from: a0 */
    public void mo4175a0(int i) {
        if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
            mo4171V().setMMSubTitle(mo4171V().getResources().getString(C0966R.string.erl));
        }
    }

    public boolean onBackPressed() {
        mo4172X().getClass();
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
        mo4172X().onDetach();
    }

    public void onPause() {
        super.onPause();
        mo4172X().mo2526x();
    }

    public void onResume() {
        super.onResume();
        mo4172X().mo2514G();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        mo4174Z(view);
        mo4172X().mo2525t(mo4173Y());
    }
}
