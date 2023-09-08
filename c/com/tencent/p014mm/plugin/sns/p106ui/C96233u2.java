package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.u2 */
public class C96233u2 extends AdViewComponent<SnsInfo> {

    /* renamed from: j */
    public final /* synthetic */ C96177r2 f281204j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96233u2(C96177r2 r2Var, String str, C0125s sVar, View view) {
        super(str, sVar, view);
        this.f281204j = r2Var;
    }

    /* renamed from: b */
    public void mo133412b(Object obj) {
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl." + mo133972e(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + snsInfo + "]");
        if (snsInfo != null) {
            C96177r2 r2Var = this.f281204j;
            SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            r2Var.mo133804p(snsInfo.getAdXml().adCardTitle, snsInfo.getAdXml().adCardDesc, (TextView) C96177r2.m123264d(this.f281204j).findViewById(C0966R.C0970id.f5436f3), (TextView) C96177r2.m123264d(this.f281204j).findViewById(C0966R.C0970id.f5404e8));
            SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            View d = C96177r2.m123264d(this.f281204j);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(d, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View e = C96177r2.m123265e(this.f281204j);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(e, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(e, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C96177r2 r2Var2 = this.f281204j;
            C96177r2.m123267g(r2Var2, (Button) C96177r2.m123264d(r2Var2).findViewById(C0966R.C0970id.f5393dy));
            C96177r2.m123261a(this.f281204j, snsInfo);
        }
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
    }

    /* renamed from: f */
    public boolean mo133413f(Object obj) {
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        boolean z = false;
        if (snsInfo == null || snsInfo.getAdXml().adCardActionBtnInfo == null) {
            SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        } else {
            if (snsInfo.getAdXml().adCardActionBtnInfo.singleLineBtn == 1 && !C96177r2.m123271s(snsInfo, C96177r2.m123262b(this.f281204j))) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        }
        SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        return z;
    }

    /* renamed from: g */
    public boolean mo133414g(Object obj, Object obj2) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsInfo snsInfo2 = (SnsInfo) obj2;
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        if (snsInfo == null || snsInfo2 == null) {
            z = false;
            SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        } else {
            z = Util.equals(snsInfo.getSnsId(), snsInfo2.getSnsId());
            SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        }
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        return z;
    }

    /* renamed from: j */
    public void mo133415j() {
        SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl." + mo133972e(), "resetComponentState() called");
        C96177r2 r2Var = this.f281204j;
        C96177r2.m123267g(r2Var, (Button) C96177r2.m123265e(r2Var).findViewById(C0966R.C0970id.f5393dy));
        View d = C96177r2.m123264d(this.f281204j);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(d, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View e = C96177r2.m123265e(this.f281204j);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(e, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(e, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
    }
}
