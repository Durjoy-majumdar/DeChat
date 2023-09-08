package com.tencent.p014mm.plugin.finder.wxmessage;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import et1.C58802a;
import et1.C7932b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import ls1.C10648k;
import ls1.C61384a;
import ls1.C61386e;
import ls1.C61387f;
import ls1.C61391g;
import os1.C11748p;
import os1.C11758v;
import rx3.C13598b0;
import ss1.C13778a;
import ss1.C64166b;
import sx3.C22415w0;
import sx3.C64197v;
import te3.C64586nn1;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC */
public final class FinderWxNotifyTabUIC extends C61387f {

    /* renamed from: u */
    public int f162681u;

    /* renamed from: v */
    public final C10648k f162682v = new C4341b();

    /* renamed from: com.tencent.mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC$b */
    public static final class C4341b extends C10648k {
        /* renamed from: a */
        public void mo3858a(Context context, C61391g gVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(gVar, "tab");
            super.mo3858a(context, gVar);
        }

        /* renamed from: b */
        public void mo3859b(Context context, C61391g gVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(gVar, "tab");
            super.mo3859b(context, gVar);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/wxmessage/FinderWxNotifyTabUIC$FinderWxMessageFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC$FinderWxMessageFragment */
    public static final class FinderWxMessageFragment extends FinderHomeTabFragment {
        /* renamed from: L */
        public Set<Class<? extends UIComponent>> mo2201L() {
            return C22415w0.m26092a(C58802a.class);
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            Log.m105924i("FinderWxMessageFragment", "index:" + this.f17334o);
            ((C58802a) C39818r.f106831a.mo62445d(this).mo75002a(C58802a.class)).f168347d = this.f17334o;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.wxmessage.FinderWxNotifyTabUIC$a */
    public final class C56756a extends C61386e {
        public C56756a(FinderWxNotifyTabUIC finderWxNotifyTabUIC) {
            FinderWxMessageFragment finderWxMessageFragment = new FinderWxMessageFragment();
            finderWxMessageFragment.f17334o = 0;
            C13598b0 b0Var = C13598b0.f38549a;
            FinderWxMessageFragment finderWxMessageFragment2 = new FinderWxMessageFragment();
            finderWxMessageFragment2.f17334o = 1;
            setFragments(C64197v.m75534c(finderWxMessageFragment, finderWxMessageFragment2));
            setTabContainer(new C64166b());
            setTabs(C64197v.m75534c(new C7932b(C0966R.string.f360726j30), new C7932b(C0966R.string.eff)));
            setTabViewAction(finderWxNotifyTabUIC.f162682v);
            this.f174594a = new C61384a(false, 0, 3, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderWxNotifyTabUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: Q3 */
    public void mo80045Q3() {
        Log.m105924i("Finder.FinderMsgNotifyUIC", "unsetRedDot");
        String[] strArr = C58802a.f168346j;
        int i = 0;
        int i2 = 0;
        while (i < 2) {
            String str = strArr[i];
            int i3 = i2 + 1;
            C61391g I3 = mo80037I3(i2);
            if (I3 instanceof C13778a) {
                ((C13778a) I3).mo9050r("", false);
            }
            i++;
            i2 = i3;
        }
    }

    /* renamed from: m3 */
    public IFinderTabProvider mo11417m3() {
        return new C56756a(this);
    }

    public void onCreate(Bundle bundle) {
        Class cls = FinderCommonFeatureService.class;
        super.onCreate(bundle);
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        C39622i0 a = C39818r.f106831a.mo62446e(cls).mo75002a(C11758v.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        int i = 1;
        this.f162681u = C11748p.m11445d3((C11748p) a, 1, (String) null, 2, (Object) null);
        C37521f.f99374d.getClass();
        if (C37521f.f99428j.mo60266n().intValue() == 1) {
            C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5(C58802a.f168346j[1]);
            if ((R5 != null ? R5.f184503e : 0) <= 0) {
                i = 0;
            }
            this.f162681u = i;
        }
        FinderTabUIC.m65393a4(this, this.f162681u, false, 2, (Object) null);
    }
}
