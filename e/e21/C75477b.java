package e21;

import android.text.InputFilter;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p019aa.p020ui.C68275c1;
import com.tencent.p014mm.plugin.p019aa.p020ui.C68280d1;
import com.tencent.p014mm.plugin.p019aa.p020ui.LaunchAAUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import e21.C75473a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import nj3.C76912y0;
import xz1.C79013a;
import xz1.C79014b;
import yf0.C79104i;

/* renamed from: e21.b */
public final class C75477b extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C75473a f221796g;

    /* renamed from: h */
    public final /* synthetic */ C79013a f221797h;

    public C75477b(C75473a aVar, C79013a aVar2) {
        this.f221796g = aVar;
        this.f221797h = aVar2;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C87412m.m108594g(view, "v");
        C75473a.C75475b bVar = this.f221796g.f221790g;
        if (bVar != null) {
            C79013a aVar = this.f221797h;
            C68275c1.C68278c cVar = (C68275c1.C68278c) bVar;
            LaunchAAUI launchAAUI = C68275c1.this.f196287d;
            Log.m105925i("MicroMsg.Aa.LaunchAAUI", "importGroupSolitatireData：%s", Integer.valueOf(launchAAUI.f196137h));
            launchAAUI.f196124X0 = 1;
            launchAAUI.f196126Y0 = aVar;
            String j = C79104i.m95665j(200, aVar.f232001H);
            int i = 100;
            if (j.length() > 100) {
                i = j.length();
            }
            launchAAUI.f196146p.setFilters(new InputFilter[]{new C68280d1(launchAAUI, i)});
            launchAAUI.f196146p.setText(j);
            launchAAUI.f196128Z0.clear();
            launchAAUI.f196129a1.clear();
            ((HashMap) launchAAUI.f196109Q).clear();
            launchAAUI.f196100G.clear();
            ((ArrayList) launchAAUI.f196130b1).clear();
            launchAAUI.f196158y0 = 2;
            launchAAUI.f196112R0 = "";
            launchAAUI.f196159z.setVisibility(8);
            launchAAUI.f196155x.setVisibility(0);
            launchAAUI.f196157y.setVisibility(0);
            if (launchAAUI.f196159z.getVisibility() == 0) {
                launchAAUI.f196154w.setClickable(false);
            } else {
                launchAAUI.f196154w.setClickable(true);
            }
            HashMap<Integer, C79014b> h = C79104i.m95663h(launchAAUI.f196126Y0);
            for (int i2 = 1; i2 <= h.size(); i2++) {
                C79014b bVar2 = h.get(Integer.valueOf(i2));
                if (bVar2 != null) {
                    launchAAUI.f196128Z0.add(bVar2.f232010a);
                    launchAAUI.f196129a1.add(bVar2.f232014e);
                }
            }
            launchAAUI.mo93813k8();
            launchAAUI.mo93806c8();
            launchAAUI.mo93805b8();
            C76912y0.m92765d(launchAAUI.getContext(), launchAAUI.getContext().getString(C0966R.string.mxi), C0966R.raw.icons_outlined_done);
            cVar.f196289a.mo5085n();
        }
    }
}
