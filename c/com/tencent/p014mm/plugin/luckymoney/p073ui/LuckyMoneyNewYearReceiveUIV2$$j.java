package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.HBReportNewStruct;
import com.tencent.p014mm.plugin.luckymoney.model.C69209e1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p773yy.C66708h;
import qy2.C77459z;
import uz2.C52718u;
import uz2.C65488a0;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2$$j */
public class LuckyMoneyNewYearReceiveUIV2$$j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f200189d;

    /* renamed from: e */
    public final /* synthetic */ LuckyMoneyNewYearReceiveUIV2 f200190e;

    public LuckyMoneyNewYearReceiveUIV2$$j(LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2, String str) {
        this.f200190e = luckyMoneyNewYearReceiveUIV2;
        this.f200189d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUIV2", "click StatusLayout");
        LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2 = this.f200190e;
        int i = LuckyMoneyNewYearReceiveUIV2.f200103p1;
        luckyMoneyNewYearReceiveUIV2.mo95630R7(11);
        HBReportNewStruct hBReportNewStruct = new HBReportNewStruct();
        hBReportNewStruct.f194229d = 15;
        hBReportNewStruct.mo86054n();
        LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV22 = this.f200190e;
        C69209e1 e1Var = luckyMoneyNewYearReceiveUIV22.f200127U;
        String str = e1Var.f199140h;
        String str2 = e1Var.f199141i;
        if (luckyMoneyNewYearReceiveUIV22.f200122R0) {
            str = e1Var.f199146q;
            str2 = e1Var.f199147r;
        }
        C77459z.C63350a aVar = new C77459z.C63350a();
        ArrayList arrayList2 = new ArrayList();
        C65488a0 a0Var = new C65488a0();
        a0Var.f188439d = "3";
        a0Var.f188441f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        arrayList2.add(a0Var);
        aVar.mo88254a(this.f200189d);
        aVar.mo88258e("red_packet_2022@inner");
        C52718u uVar = aVar.f179715a.f229399d;
        uVar.f147239h = str;
        uVar.f147241j = str2;
        C69209e1 e1Var2 = this.f200190e.f200127U;
        uVar.f147250v = e1Var2.f199142j;
        uVar.f147251w = e1Var2.f199143n;
        aVar.mo88260g(e1Var2.f199144o);
        aVar.mo88259f(this.f200190e.f200127U.f199138f);
        aVar.f179715a.f229399d.f147237f = 2;
        aVar.mo88255b(arrayList2);
        ((C66708h) C86312j.m106911c(C66708h.class)).L20(this.f200190e.getContext(), aVar.f179715a);
        this.f200190e.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUIV2$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
