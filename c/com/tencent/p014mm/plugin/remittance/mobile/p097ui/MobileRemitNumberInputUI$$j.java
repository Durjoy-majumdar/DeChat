package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import xi2.C78842a;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$j */
public class MobileRemitNumberInputUI$$j extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ MobileRemitNumberInputUI f203904g;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI$$j$a */
    public class C70534a extends C78842a {
        public C70534a() {
        }

        /* renamed from: c */
        public void mo6028c(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "notice click jumpItem.action:exit");
            MobileRemitNumberInputUI$$j.this.f203904g.mo97196H7();
        }

        /* renamed from: f */
        public void mo97200f(Object obj) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "notice click jumpItem.action:continue");
        }
    }

    public MobileRemitNumberInputUI$$j(MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f203904g = mobileRemitNumberInputUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitNumberInputUI", "notice click!");
        C75129p.m90108c(this.f203904g.getContext(), this.f203904g.f203891r.f136827j, null, new C70534a());
    }
}
