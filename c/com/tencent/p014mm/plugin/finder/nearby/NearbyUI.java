package com.tencent.p014mm.plugin.finder.nearby;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bl3.C0324s;
import cm1.C55012e1;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import eb0.C31543z5;
import fm1.C8138e;
import fm1.C8139f;
import gm1.C8359a;
import gy3.C24560g0;
import ht1.C8809w2;
import ht1.C8815x4;
import java.util.Set;
import kotlin.Metadata;
import ln1.C10583e;
import ln1.C10585g;
import ln1.C21445b;
import ok1.C62042e;
import p182kk.C61104a;
import p50.C62193a;
import p565ir.C60606n;
import sx3.C110826x0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/nearby/NearbyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.nearby.NearbyUI */
public final class NearbyUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.nearby.NearbyUI$a */
    public static final class C3272a implements Runnable {

        /* renamed from: d */
        public static final C3272a f15524d = new C3272a();

        public final void run() {
            C55012e1.f154468d.mo76067k();
        }
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return "NearbyUI";
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 3;
    }

    public void finish() {
        C10585g.f31933a.mo10845c();
        super.finish();
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(NearbyHomeUIC.class, C8139f.class, C8138e.class, C0324s.m265a(C24560g0.m30725a(C8815x4.class)), C8359a.class, C0324s.m265a(C24560g0.m30725a(C8809w2.class)));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C21445b bVar = C21445b.f60694a;
        C21445b.f60696c = C31543z5.m39453c();
        Log.m105924i("FinderNearbyLiveLoadingReporter", "tickActivityOnCreate");
        C55012e1.f154468d.mo76066j();
    }

    public void onDestroy() {
        super.onDestroy();
        MMHandlerThread.postToMainThreadDelayed(C3272a.f15524d, 1000);
        C10583e eVar = C10583e.f31911a;
        C10583e.f31912b.clear();
        C10583e.f31913c.clear();
        C10583e.f31914d.clear();
        C10583e.f31915e.clear();
        C10583e.f31916f.clear();
        C10583e.f31917g.clear();
        C10583e.f31918h.clear();
        C10583e.f31919i.clear();
        C10583e.f31920j.clear();
        C10583e.f31921k.clear();
        if (!C61104a.m71656l((Context) null, false)) {
            C62042e.f176370a.mo87064a2(true, true);
            C62193a.f176816k1.mo87260a();
        }
        ((C60606n) C86312j.m106911c(C60606n.class)).Di0(1);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
