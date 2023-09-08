package com.tencent.p014mm.plugin.p019aa.p020ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import qo3.C77389a;
import qo3.C77398g;
import te3.C51181s;
import te3.C77903a;

/* renamed from: com.tencent.mm.plugin.aa.ui.q */
public class C68322q implements C87581a<Void, C51181s> {

    /* renamed from: a */
    public final /* synthetic */ AARemittanceUI f196347a;

    public C68322q(AARemittanceUI aARemittanceUI) {
        this.f196347a = aARemittanceUI;
    }

    public Object call(Object obj) {
        C51181s sVar = (C51181s) obj;
        AARemittanceUI aARemittanceUI = this.f196347a;
        int i = AARemittanceUI.f195955K;
        if (!aARemittanceUI.mKindaEnable) {
            aARemittanceUI.hideLoading();
        }
        if (sVar == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        C77903a aVar = sVar.f141242j;
        objArr[0] = aVar;
        objArr[1] = Integer.valueOf(aVar != null ? aVar.f226964d : 0);
        Log.m105925i("MicroMsg.AARemittanceUI", "aapay return, alertItem: %s, alertItem.flag: %s", objArr);
        C77903a aVar2 = sVar.f141242j;
        if (aVar2 == null || aVar2.f226964d != 1) {
            Log.m105919d("MicroMsg.AARemittanceUI", "aapay return, reqKey: %s", sVar.f141238f);
            AARemittanceUI.m80589J7(this.f196347a, sVar);
            return null;
        }
        String str = aVar2.f226965e;
        String str2 = aVar2.f226966f;
        String str3 = aVar2.f226967g;
        AARemittanceUI aARemittanceUI2 = this.f196347a;
        C77389a aVar3 = new C77389a();
        aVar3.f225660q = str;
        aVar3.f225663t = str3;
        aVar3.f225620C = new C68312o(this, sVar);
        aVar3.f225664u = str2;
        aVar3.f225621D = new C68317p(this);
        C77398g gVar = new C77398g(aARemittanceUI2, C0966R.style.a66);
        gVar.mo107525e(aVar3);
        gVar.show();
        this.f196347a.hideLoading();
        return null;
    }
}
