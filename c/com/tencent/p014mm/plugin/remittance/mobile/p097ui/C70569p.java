package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import g63.C45890a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.p */
public class C70569p extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ MobileRemittanceUI f204031g;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.p$a */
    public class C70570a implements C76879j.C47267l {
        public C70570a() {
        }

        public boolean onFinish(CharSequence charSequence) {
            if (!Util.isNullOrNil(charSequence.toString())) {
                C70569p.this.f204031g.f203956Q = charSequence.toString();
                MobileRemittanceUI.m83079I7(C70569p.this.f204031g);
                return true;
            }
            MobileRemittanceUI mobileRemittanceUI = C70569p.this.f204031g;
            mobileRemittanceUI.f203956Q = null;
            MobileRemittanceUI.m83079I7(mobileRemittanceUI);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.p$b */
    public class C70571b implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.p$b$a */
        public class C70572a implements Runnable {
            public C70572a() {
            }

            public void run() {
                C70569p.this.f204031g.hideVKB();
            }
        }

        public C70571b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MMHandlerThread.postToMainThreadDelayed(new C70572a(), 500);
        }
    }

    public C70569p(MobileRemittanceUI mobileRemittanceUI) {
        this.f204031g = mobileRemittanceUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        this.f204031g.showCircleStWcKb();
        String string = this.f204031g.getString(C0966R.string.hzl);
        String string2 = this.f204031g.getString(C0966R.string.hzs);
        MobileRemittanceUI mobileRemittanceUI = this.f204031g;
        C45890a.m51175a(mobileRemittanceUI, string, mobileRemittanceUI.f203956Q, string2, true, 20, new C70570a(), new C70571b());
        this.f204031g.mo97216J7(6);
    }
}
