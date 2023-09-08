package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.model.C69248m2;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69558a3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f32.C75675d;
import qe3.C77329i;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.c3 */
public class C69577c3 extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ C69248m2 f200885g;

    /* renamed from: h */
    public final /* synthetic */ Context f200886h;

    /* renamed from: i */
    public final /* synthetic */ C69558a3.C69562d f200887i;

    public C69577c3(C69558a3.C69562d dVar, C69248m2 m2Var, Context context) {
        this.f200887i = dVar;
        this.f200885g = m2Var;
        this.f200886h = context;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(11701, 14, 0, 0, 0, 2, Integer.valueOf(this.f200885g.f199274h));
        C69558a3.C69561c cVar = this.f200887i.f200858a;
        if (cVar != null) {
            C77329i.m93195a(cVar.f200855d, 1);
        }
        C69558a3.C69561c cVar2 = this.f200887i.f200858a;
        String str = "";
        if (cVar2 != null && cVar2.f200854c) {
            C69248m2 m2Var = this.f200885g;
            nVar.mo160131h(13051, Integer.valueOf(cVar2.f200855d), 2, str, str, str, m2Var.f199273g, m2Var.f199272f, str, str, Integer.valueOf(this.f200887i.f200858a.f200856e));
        }
        if (this.f200885g.f199272f.equals("Native")) {
            Log.m105924i("MicroMsg.LuckyMoneyOperationViewMgr", "go native:" + this.f200885g.f199273g);
            if ("weixin://festival/gotoshake".equalsIgnoreCase(this.f200885g.f199273g)) {
                Log.m105924i("MicroMsg.LuckyMoneyOperationViewMgr", " go new year shake");
            }
        } else {
            C75228t.m90219L(this.f200886h, this.f200885g.f199273g, true);
        }
        Object[] objArr = new Object[6];
        objArr[0] = 2;
        objArr[1] = this.f200885g.f199273g;
        C77994sf2 sf22 = this.f200887i.f200858a.f200857f;
        if (sf22 != null) {
            str = sf22.f228200d;
        }
        objArr[2] = str;
        objArr[3] = C75675d.f222277c;
        objArr[4] = 0;
        objArr[5] = C75675d.f222275a;
        nVar.mo160131h(16589, objArr);
    }
}
