package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import qo3.C77389a;
import qo3.C77398g;
import te3.C51181s;
import te3.C77903a;

/* renamed from: com.tencent.mm.plugin.aa.ui.i1 */
public class C68291i1 implements C87581a<Void, C51181s> {

    /* renamed from: a */
    public final /* synthetic */ PaylistAAUI f196310a;

    public C68291i1(PaylistAAUI paylistAAUI) {
        this.f196310a = paylistAAUI;
    }

    public Object call(Object obj) {
        C51181s sVar = (C51181s) obj;
        PaylistAAUI paylistAAUI = this.f196310a;
        int i = PaylistAAUI.f196231R;
        if (!paylistAAUI.mKindaEnable) {
            paylistAAUI.hideLoading();
        }
        if (sVar == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        C77903a aVar = sVar.f141242j;
        objArr[0] = aVar;
        objArr[1] = Integer.valueOf(aVar != null ? aVar.f226964d : 0);
        Log.m105925i("MicroMsg.Aa.PaylistAAUI", "aapay return, alertItem: %s, alertItem.flag: %s", objArr);
        C77903a aVar2 = sVar.f141242j;
        if (aVar2 == null || aVar2.f226964d != 1) {
            Log.m105919d("MicroMsg.Aa.PaylistAAUI", "aapay return, reqKey: %s", sVar.f141238f);
            PaylistAAUI.m80674J7(this.f196310a, sVar);
            return null;
        }
        String str = aVar2.f226965e;
        String str2 = aVar2.f226966f;
        String str3 = aVar2.f226967g;
        PaylistAAUI paylistAAUI2 = this.f196310a;
        C77389a aVar3 = new C77389a();
        aVar3.f225660q = str;
        aVar3.f225663t = str3;
        aVar3.f225620C = new C68289h1(this, sVar);
        aVar3.f225664u = str2;
        C77398g gVar = new C77398g(paylistAAUI2, C0966R.style.a66);
        gVar.mo107525e(aVar3);
        gVar.show();
        this.f196310a.hideLoading();
        return null;
    }
}
