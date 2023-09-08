package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import lp3.C88631d;
import qo3.C77389a;
import qo3.C77398g;
import te3.C77903a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.aa.ui.n */
public class C68304n implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ AARemittanceUI f196326a;

    /* renamed from: com.tencent.mm.plugin.aa.ui.n$a */
    public class C68305a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77903a f196327d;

        public C68305a(C77903a aVar) {
            this.f196327d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75228t.m90219L(C68304n.this.f196326a.getContext(), this.f196327d.f226968h, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.n$b */
    public class C68306b implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.aa.ui.n$b$a */
        public class C68307a implements Runnable {
            public C68307a() {
            }

            public void run() {
                C68304n.this.f196326a.showNormalStWcKb();
            }
        }

        public C68306b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C119179t tVar = C119157j.f356862d;
            C68307a aVar = new C68307a();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 300, false);
        }
    }

    public C68304n(AARemittanceUI aARemittanceUI) {
        this.f196326a = aARemittanceUI;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Log.m105925i("MicroMsg.AARemittanceUI", "aapay failed: %s", obj);
        this.f196326a.hideLoading();
        if (obj == null) {
            AARemittanceUI aARemittanceUI = this.f196326a;
            AARemittanceUI.m80590K7(aARemittanceUI, aARemittanceUI.getString(C0966R.string.f7307c_));
        } else if (obj instanceof C77903a) {
            C77903a aVar = (C77903a) obj;
            String str = aVar.f226965e;
            String str2 = aVar.f226966f;
            String str3 = aVar.f226967g;
            AARemittanceUI aARemittanceUI2 = this.f196326a;
            C77389a aVar2 = new C77389a();
            aVar2.f225660q = str;
            aVar2.f225663t = str3;
            aVar2.f225620C = new C68305a(aVar);
            aVar2.f225664u = str2;
            aVar2.f225621D = new C68306b();
            C77398g gVar = new C77398g(aARemittanceUI2, C0966R.style.a66);
            gVar.mo107525e(aVar2);
            gVar.show();
        } else if ((obj instanceof String) && !obj.toString().equalsIgnoreCase("ok")) {
            AARemittanceUI.m80590K7(this.f196326a, obj.toString());
        }
    }
}
