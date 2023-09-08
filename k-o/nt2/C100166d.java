package nt2;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import j20.C117292a;
import java.util.List;
import jp2.C98963o;
import k20.C60958c;
import k20.C9556a;
import up2.C102064e;

/* renamed from: nt2.d */
public class C100166d extends AdViewComponent<SnsInfo> {

    /* renamed from: j */
    public final /* synthetic */ C100167e f293419j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100166d(C100167e eVar, String str, C0125s sVar, View view) {
        super(str, sVar, view);
        this.f293419j = eVar;
    }

    /* renamed from: a */
    public void mo133411a(Object obj) {
        SnsMethodCalculate.markStartTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        TextView textView = this.f293419j.f293446p;
        if (textView == null) {
            SnsMethodCalculate.markEndTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.f293419j.f293447q;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            View view = this.f293419j.f293421B;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$1", "bindComponentDataOnEveryFillItem", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$1", "bindComponentDataOnEveryFillItem", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C100167e eVar = this.f293419j;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            C96177r2 r2Var = eVar.f293425F;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            if (r2Var == null) {
                C100167e eVar2 = this.f293419j;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                Context context = eVar2.f293445o;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                C100167e eVar3 = this.f293419j;
                View view2 = eVar3.f293413f;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                C98963o oVar = eVar3.f293423D;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                C100167e eVar4 = this.f293419j;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                C102064e.C102069c cVar = eVar4.f293443Y;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                C96177r2 r2Var2 = new C96177r2(context, view2, 1, oVar, cVar);
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                eVar2.f293425F = r2Var2;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            }
            C100167e eVar5 = this.f293419j;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            C96177r2 r2Var3 = eVar5.f293425F;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            r2Var3.mo133797i(snsInfo);
            C100167e eVar6 = this.f293419j;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            C96177r2 r2Var4 = eVar6.f293425F;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            r2Var4.getClass();
            SnsMethodCalculate.markStartTimeMs("getComponentList", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            List<AdViewComponent<SnsInfo>> list = r2Var4.f281005y;
            SnsMethodCalculate.markEndTimeMs("getComponentList", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            mo133974k(list);
            mo133970c(snsInfo);
            SnsMethodCalculate.markEndTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        }
        SnsMethodCalculate.markEndTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
    }

    /* renamed from: b */
    public void mo133412b(Object obj) {
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
    }

    /* renamed from: f */
    public boolean mo133413f(Object obj) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        if (snsInfo == null) {
            z = false;
            SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        } else {
            z = snsInfo.getAdXml().hasActionBtn();
            SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        }
        SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        return z;
    }

    /* renamed from: g */
    public boolean mo133414g(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsInfo snsInfo2 = (SnsInfo) obj2;
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        return false;
    }

    /* renamed from: j */
    public void mo133415j() {
        SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
        View view = this.f293419j.f293421B;
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
            return;
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$1", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$1", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$1");
    }
}
