package rs1;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ls1.C61387f;
import ls1.C61391g;
import os1.C11748p;
import ss1.C13778a;
import ss1.C64167c;

/* renamed from: rs1.s6 */
public final class C63637s6 extends C61387f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63637s6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: Q3 */
    public void mo80045Q3() {
        Log.m105924i("Finder.FinderMsgNotifyUIC", "unsetRedDot");
        String[] strArr = C63659v6.f180474i;
        int i = 0;
        int i2 = 0;
        while (i < 3) {
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
        return new C64167c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11748p.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        FinderTabUIC.m65393a4(this, C11748p.m11445d3((C11748p) a, 1, (String) null, 2, (Object) null), false, 2, (Object) null);
    }
}
