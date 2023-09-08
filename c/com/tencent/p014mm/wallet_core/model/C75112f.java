package com.tencent.p014mm.wallet_core.model;

import android.os.CountDownTimer;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.offline.p085ui.C69999e;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.model.C75115g;

/* renamed from: com.tencent.mm.wallet_core.model.f */
public class C75112f extends CountDownTimer {

    /* renamed from: a */
    public final /* synthetic */ C75115g f221032a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75112f(C75115g gVar, long j, long j2) {
        super(j, j2);
        this.f221032a = gVar;
    }

    public void onFinish() {
        C75115g.C75116a aVar = this.f221032a.f221046c;
        if (aVar != null) {
            C69999e eVar = (C69999e) aVar;
            eVar.f202013a.setText(C0966R.string.f8028zq);
            eVar.f202013a.setEnabled(true);
            eVar.f202014b.f201802i = null;
        }
    }

    public void onTick(long j) {
        C75115g.C75116a aVar = this.f221032a.f221046c;
        if (aVar != null) {
            C69999e eVar = (C69999e) aVar;
            eVar.getClass();
            int round = (int) Math.round(((double) j) / 1000.0d);
            if (round == 0) {
                eVar.f202013a.setText(C0966R.string.f8028zq);
                return;
            }
            eVar.f202013a.setText(String.format("%s(%ss)", new Object[]{MMApplicationContext.getContext().getString(C0966R.string.f8028zq), Integer.valueOf(round)}));
        }
    }
}
