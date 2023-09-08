package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import lp3.C88631d;
import p910lj.C76701a;
import qo3.C77389a;
import qo3.C77398g;
import te3.C77903a;

/* renamed from: com.tencent.mm.plugin.aa.ui.g1 */
public class C68286g1 implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ PaylistAAUI f196300a;

    /* renamed from: com.tencent.mm.plugin.aa.ui.g1$a */
    public class C68287a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77903a f196301d;

        public C68287a(C77903a aVar) {
            this.f196301d = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.Aa.PaylistAAUI", "click aaPay onInterrupt AAAlertItem");
            C75228t.m90219L(C68286g1.this.f196300a.getContext(), this.f196301d.f226968h, false);
        }
    }

    public C68286g1(PaylistAAUI paylistAAUI) {
        this.f196300a = paylistAAUI;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        Log.m105925i("MicroMsg.Aa.PaylistAAUI", "aapay failed: %s", obj);
        this.f196300a.hideLoading();
        if (obj == null) {
            PaylistAAUI paylistAAUI = this.f196300a;
            C76701a.makeText((Context) paylistAAUI, (CharSequence) paylistAAUI.getString(C0966R.string.f7307c_), 1).show();
        } else if (obj instanceof C77903a) {
            C77903a aVar = (C77903a) obj;
            String str = aVar.f226965e;
            String str2 = aVar.f226966f;
            String str3 = aVar.f226967g;
            PaylistAAUI paylistAAUI2 = this.f196300a;
            C77389a aVar2 = new C77389a();
            aVar2.f225660q = str;
            aVar2.f225663t = str3;
            aVar2.f225620C = new C68287a(aVar);
            aVar2.f225664u = str2;
            C77398g gVar = new C77398g(paylistAAUI2, C0966R.style.a66);
            gVar.mo107525e(aVar2);
            gVar.show();
        } else if ((obj instanceof String) && !obj.toString().equalsIgnoreCase("ok")) {
            C76701a.makeText((Context) this.f196300a, (CharSequence) obj.toString(), 1).show();
        }
    }
}
