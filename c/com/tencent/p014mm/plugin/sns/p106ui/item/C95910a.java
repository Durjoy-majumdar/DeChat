package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.List;
import jp2.C98963o;
import k20.C60958c;
import k20.C9556a;
import up2.C102064e;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.a */
public class C95910a extends AdViewComponent<SnsInfo> {

    /* renamed from: j */
    public final /* synthetic */ C95911b f280019j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95910a(C95911b bVar, String str, C0125s sVar, View view) {
        super(str, sVar, view);
        this.f280019j = bVar;
    }

    /* renamed from: a */
    public void mo133411a(Object obj) {
        SnsMethodCalculate.markStartTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        if (C95911b.m122813C(this.f280019j) == null) {
            SnsMethodCalculate.markEndTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        } else {
            if (C95911b.m122813C(this.f280019j).f280050V0 != null) {
                C95911b.m122813C(this.f280019j).f280050V0.setVisibility(8);
            }
            if (C95911b.m122813C(this.f280019j).f280049U0 != null) {
                C95911b.m122813C(this.f280019j).f280049U0.setVisibility(8);
            }
            View view = C95911b.m122813C(this.f280019j).f280051W0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$1", "bindComponentDataOnEveryFillItem", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$1", "bindComponentDataOnEveryFillItem", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C95911b bVar = this.f280019j;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            C96177r2 r2Var = bVar.f280022r;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            if (r2Var == null) {
                C95911b bVar2 = this.f280019j;
                Activity activity = bVar2.f279904e;
                ViewGroup viewGroup = C95911b.m122813C(bVar2).f280034F0;
                C95911b bVar3 = this.f280019j;
                C98963o oVar = bVar3.f279906g.f278568b.f276699f;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                C102064e.C102069c cVar = bVar3.f280020A;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                C96177r2 r2Var2 = new C96177r2(activity, viewGroup, 0, oVar, cVar);
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                bVar2.f280022r = r2Var2;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            }
            C95911b bVar4 = this.f280019j;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            C96177r2 r2Var3 = bVar4.f280022r;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            r2Var3.mo133797i(snsInfo);
            C95911b bVar5 = this.f280019j;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            C96177r2 r2Var4 = bVar5.f280022r;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            r2Var4.getClass();
            SnsMethodCalculate.markStartTimeMs("getComponentList", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            List<AdViewComponent<SnsInfo>> list = r2Var4.f281005y;
            SnsMethodCalculate.markEndTimeMs("getComponentList", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            mo133974k(list);
            mo133970c(snsInfo);
            SnsMethodCalculate.markEndTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        }
        SnsMethodCalculate.markEndTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
    }

    /* renamed from: b */
    public void mo133412b(Object obj) {
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
    }

    /* renamed from: f */
    public boolean mo133413f(Object obj) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        if (snsInfo == null) {
            z = false;
            SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        } else {
            z = snsInfo.getAdXml().hasActionBtn();
            SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        }
        SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        return z;
    }

    /* renamed from: g */
    public boolean mo133414g(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsInfo snsInfo2 = (SnsInfo) obj2;
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        String str = "null";
        String snsId = snsInfo != null ? snsInfo.getSnsId() : str;
        if (snsInfo2 != null) {
            str = snsInfo2.getSnsId();
        }
        Log.m105918d("MiroMsg.CardAdTimeLineItem", "isContentSame() called with: d1 = [" + snsId + "], d2 = [" + str + "]");
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        return false;
    }

    /* renamed from: j */
    public void mo133415j() {
        SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
        if (C95911b.m122813C(this.f280019j) == null) {
            SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
            return;
        }
        View view = C95911b.m122813C(this.f280019j).f280051W0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$1", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$1", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$1");
    }
}
