package qy0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import qy0.C36193e;
import ry0.C13606f;
import ry0.C36582e;
import su0.C118308d;
import su0.C36833e;
import ty0.C37305h;
import ty0.C37306j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: qy0.c */
public final class C36189c extends C86301e implements C13606f, C36582e {

    /* renamed from: d */
    public C36193e f96391d;

    /* renamed from: qy0.c$a */
    public static final class C36190a implements C118308d {

        /* renamed from: d */
        public final /* synthetic */ C36189c f96392d;

        public C36190a(C36189c cVar) {
            this.f96392d = cVar;
        }

        public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
            Log.m105924i("Byp.BypService", "[onAuthResponse] autoAuth=" + z);
            C36193e eVar = this.f96392d.f96391d;
            if (eVar != null) {
                List<Integer> list = C36187a.f96386a;
                C36193e.m40919b(eVar, C36187a.f96389d, C36193e.C36194a.AUTO_AUTH, false, 0, 12, (Object) null);
                return;
            }
            C87412m.m108603p("syncExtension");
            throw null;
        }

        public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
        }
    }

    /* renamed from: Kp */
    public void mo12999Kp() {
        List<Integer> list = C36187a.f96386a;
        ArrayList<Integer> arrayList = C36187a.f96389d;
        List<Integer> list2 = C36187a.f96386a;
        if (!arrayList.containsAll(list2)) {
            arrayList.addAll(list2);
        }
        C36193e eVar = this.f96391d;
        if (eVar != null) {
            C36193e.m40919b(eVar, list2, C36193e.C36194a.CONFIG_DELAY, false, 0, 12, (Object) null);
        } else {
            C87412m.m108603p("syncExtension");
            throw null;
        }
    }

    /* renamed from: li */
    public C36193e mo60563li() {
        C36193e eVar = this.f96391d;
        if (eVar != null) {
            return eVar;
        }
        C87412m.m108603p("syncExtension");
        throw null;
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
        synchronized (C37306j.f98678a) {
            for (C37305h hVar : C37306j.f98679b) {
                synchronized (C37306j.f98678a) {
                    C87412m.m108594g(hVar, "config");
                }
            }
        }
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        this.f96391d = new C36193e();
        if (MMApplicationContext.isMainProcess()) {
            Log.m105924i("Byp.BypService", "[configure]");
            ((C36833e) C86312j.m106911c(C36833e.class)).mo60841CI(new C36190a(this));
        }
    }

    public void wh0(int i) {
        C36193e eVar = this.f96391d;
        if (eVar != null) {
            eVar.f96397a.remove(Integer.valueOf(i));
        } else {
            C87412m.m108603p("syncExtension");
            throw null;
        }
    }
}
