package com.tencent.p014mm.plugin.finder.p056ui.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabProvider;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Set;
import kotlin.Metadata;
import p192l4.C10462b;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C22415w0;
import ye1.C66627h0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/sample/FinderSampleTabUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "FinderSampleTabFragment", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI */
public final class FinderSampleTabUI extends MMFinderUI {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/sample/FinderSampleTabUI$FinderSampleTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI$FinderSampleTabFragment */
    public static final class FinderSampleTabFragment extends FinderHomeTabFragment {
        /* renamed from: L */
        public Set<Class<? extends UIComponent>> mo2201L() {
            return C22415w0.m26092a(C56426a.class);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI$b */
    public static final class C56428b extends FinderTabUIC {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56428b(MMActivity mMActivity) {
            super((AppCompatActivity) mMActivity);
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            Log.m105924i("Finder.FinderTabUIC", "FinderBizTabUIC init cons");
        }

        /* renamed from: m3 */
        public IFinderTabProvider mo11417m3() {
            Log.m105924i("Finder.FinderTabUIC", "FinderBizTabUIC generateProvider");
            return new FinderTabProvider();
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            ActionBar supportActionBar = getActivity().getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo91104o();
            }
        }
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C56428b.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39622i0 a = C39818r.f106831a.mo62444c(this).mo75002a(C56428b.class);
        C87412m.m108593f(a, "UICProvider.of(this).get…SampleTabUIC::class.java)");
        FinderTabUIC.m65393a4((FinderTabUIC) a, 1, false, 2, (Object) null);
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI$a */
    public static final class C56426a extends UIComponent {

        /* renamed from: d */
        public final C13601g f161287d = C36568h.m40985a(new C56427a(this));

        /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleTabUI$a$a */
        public static final class C56427a extends C87413o implements C32224a<C66627h0> {

            /* renamed from: d */
            public final /* synthetic */ C56426a f161288d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56427a(C56426a aVar) {
                super(0);
                this.f161288d = aVar;
            }

            public Object invoke() {
                View findViewById = this.f161288d.findViewById(C0966R.C0970id.md7);
                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.e6r);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                    return new C66627h0(relativeLayout, textView, relativeLayout);
                }
                throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(C0966R.C0970id.e6r)));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56426a(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public int getLayoutId() {
            return C0966R.C0971layout.aq4;
        }

        public void onCreateAfter(Bundle bundle) {
            super.onCreateAfter(bundle);
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateAfter ");
            Fragment fragment = getFragment();
            C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            sb.append(((FinderHomeTabFragment) fragment).f17332j);
            sb.append("  tabType:");
            Fragment fragment2 = getFragment();
            C87412m.m108592e(fragment2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            sb.append(((FinderHomeTabFragment) fragment2).f17334o);
            Log.m105924i(C54492n.TAG, sb.toString());
            TextView textView = ((C66627h0) this.f161287d.getValue()).f191588a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("titleId is :");
            Fragment fragment3 = getFragment();
            C87412m.m108592e(fragment3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            sb4.append(((FinderHomeTabFragment) fragment3).f17332j);
            textView.setText(sb4.toString());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56426a(Fragment fragment) {
            super(fragment);
            C87412m.m108594g(fragment, "fragment");
        }
    }
}
