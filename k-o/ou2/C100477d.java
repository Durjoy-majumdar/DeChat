package ou2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import up2.C102064e;

/* renamed from: ou2.d */
public final class C100477d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100464b f294372d;

    /* renamed from: e */
    public final /* synthetic */ AdClickActionInfo f294373e;

    /* renamed from: f */
    public final /* synthetic */ SnsInfo f294374f;

    public C100477d(C100464b bVar, AdClickActionInfo adClickActionInfo, SnsInfo snsInfo) {
        this.f294372d = bVar;
        this.f294373e = adClickActionInfo;
        this.f294374f = snsInfo;
    }

    public final void onClick(View view) {
        C102064e eVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$2");
        Log.m105924i("BreakFrameCardAdController", "click area");
        C100464b bVar = this.f294372d;
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        C32224a<? extends C102064e> aVar = bVar.f294317g;
        SnsMethodCalculate.markEndTimeMs("getAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        if (aVar == null || (eVar = (C102064e) aVar.invoke()) == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        AdClickActionInfo adClickActionInfo = this.f294373e;
        if (adClickActionInfo != null) {
            adClickActionInfo.f273639a = 9;
        }
        eVar.mo141559h(adClickActionInfo, this.f294374f);
        eVar.mo141556e(view);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$setClickArea$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/BaseBreakFrameCardAdController$setClickArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
