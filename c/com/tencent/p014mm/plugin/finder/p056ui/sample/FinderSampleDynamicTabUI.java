package com.tencent.p014mm.plugin.finder.p056ui.sample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.p056ui.sample.FinderSampleTabUI;
import com.tencent.p014mm.plugin.finder.view.tabcomp.FinderTabProvider;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import ls1.C10647i;
import rx3.C13598b0;
import sx3.C22415w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/sample/FinderSampleDynamicTabUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI */
public final class FinderSampleDynamicTabUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI$a */
    public static final class C56420a extends FinderTabUIC {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56420a(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            Log.m105924i("Finder.FinderTabUIC", "FinderBizTabUIC init cons");
        }

        /* renamed from: m3 */
        public IFinderTabProvider mo11417m3() {
            Log.m105924i("Finder.FinderTabUIC", "FinderBizTabUIC generateProvider");
            return new C56421b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI$b */
    public static final class C56421b extends FinderTabProvider {
        public boolean isDynamic() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI$c */
    public static final class C56422c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSampleDynamicTabUI f161283d;

        public C56422c(FinderSampleDynamicTabUI finderSampleDynamicTabUI) {
            this.f161283d = finderSampleDynamicTabUI;
        }

        public final void run() {
            Class cls = C56420a.class;
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62444c(this.f161283d).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(this).get…SampleTabUIC::class.java)");
            C10647i iVar = new C10647i((CharSequence) "A1");
            FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment = new FinderSampleTabUI.FinderSampleTabFragment();
            finderSampleTabFragment.f17332j = 201;
            C13598b0 b0Var = C13598b0.f38549a;
            FinderTabUIC.m65394e3((FinderTabUIC) a, 1, iVar, finderSampleTabFragment, false, 8, (Object) null);
            C39622i0 a2 = rVar.mo62444c(this.f161283d).mo75002a(cls);
            C87412m.m108593f(a2, "UICProvider.of(this).get…SampleTabUIC::class.java)");
            C10647i iVar2 = new C10647i((CharSequence) "A2");
            FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment2 = new FinderSampleTabUI.FinderSampleTabFragment();
            finderSampleTabFragment2.f17332j = 202;
            FinderTabUIC.m65394e3((FinderTabUIC) a2, 2, iVar2, finderSampleTabFragment2, false, 8, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI$d */
    public static final class C56423d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSampleDynamicTabUI f161284d;

        public C56423d(FinderSampleDynamicTabUI finderSampleDynamicTabUI) {
            this.f161284d = finderSampleDynamicTabUI;
        }

        public final void run() {
            Class cls = C56420a.class;
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62444c(this.f161284d).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(this).get…SampleTabUIC::class.java)");
            C10647i iVar = new C10647i((CharSequence) "B1");
            FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment = new FinderSampleTabUI.FinderSampleTabFragment();
            finderSampleTabFragment.f17332j = 301;
            C13598b0 b0Var = C13598b0.f38549a;
            FinderTabUIC.m65395f3((FinderTabUIC) a, iVar, finderSampleTabFragment, false, 4, (Object) null);
            C39622i0 a2 = rVar.mo62444c(this.f161284d).mo75002a(cls);
            C87412m.m108593f(a2, "UICProvider.of(this).get…SampleTabUIC::class.java)");
            C10647i iVar2 = new C10647i((CharSequence) "B2");
            FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment2 = new FinderSampleTabUI.FinderSampleTabFragment();
            finderSampleTabFragment2.f17332j = 302;
            FinderTabUIC.m65395f3((FinderTabUIC) a2, iVar2, finderSampleTabFragment2, false, 4, (Object) null);
            C39622i0 a3 = rVar.mo62444c(this.f161284d).mo75002a(cls);
            C87412m.m108593f(a3, "UICProvider.of(this).get…SampleTabUIC::class.java)");
            C10647i iVar3 = new C10647i((CharSequence) "B3");
            FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment3 = new FinderSampleTabUI.FinderSampleTabFragment();
            finderSampleTabFragment3.f17332j = 303;
            FinderTabUIC.m65395f3((FinderTabUIC) a3, iVar3, finderSampleTabFragment3, false, 4, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI$e */
    public static final class C56424e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSampleDynamicTabUI f161285d;

        public C56424e(FinderSampleDynamicTabUI finderSampleDynamicTabUI) {
            this.f161285d = finderSampleDynamicTabUI;
        }

        public final void run() {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f161285d).mo75002a(C56420a.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…SampleTabUIC::class.java)");
            FinderTabUIC.m65391U3((FinderTabUIC) a, 3, 0, 2, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.sample.FinderSampleDynamicTabUI$f */
    public static final class C56425f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderSampleDynamicTabUI f161286d;

        public C56425f(FinderSampleDynamicTabUI finderSampleDynamicTabUI) {
            this.f161286d = finderSampleDynamicTabUI;
        }

        public final void run() {
            Class cls = C56420a.class;
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62444c(this.f161286d).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(this).get…SampleTabUIC::class.java)");
            FinderTabUIC.m65391U3((FinderTabUIC) a, 0, 0, 2, (Object) null);
            C56420a aVar = (C56420a) rVar.mo62444c(this.f161286d).mo75002a(cls);
            FinderTabUIC.m65391U3(aVar, aVar.mo80041M3().size() - 1, 0, 2, (Object) null);
            C56420a aVar2 = (C56420a) rVar.mo62444c(this.f161286d).mo75002a(cls);
            FinderTabUIC.m65391U3(aVar2, aVar2.mo80041M3().size() - 1, 0, 2, (Object) null);
        }
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C56420a.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39622i0 a = C39818r.f106831a.mo62444c(this).mo75002a(C56420a.class);
        C87412m.m108593f(a, "UICProvider.of(this).get…SampleTabUIC::class.java)");
        FinderTabUIC.m65393a4((FinderTabUIC) a, 1, false, 2, (Object) null);
        getContentView().postDelayed(new C56422c(this), 4000);
        getContentView().postDelayed(new C56423d(this), 10000);
        getContentView().postDelayed(new C56424e(this), 15000);
        getContentView().postDelayed(new C56425f(this), 20000);
    }
}
