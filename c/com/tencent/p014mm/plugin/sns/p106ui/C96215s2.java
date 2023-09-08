package com.tencent.p014mm.plugin.sns.p106ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rq2.C101419f;
import up2.C102064e;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.s2 */
public class C96215s2 extends AdViewComponent<SnsInfo> {

    /* renamed from: j */
    public final /* synthetic */ C96177r2 f281162j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96215s2(C96177r2 r2Var, String str, C0125s sVar, View view) {
        super(str, sVar, view);
        this.f281162j = r2Var;
    }

    /* renamed from: b */
    public void mo133412b(Object obj) {
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        if (snsInfo != null) {
            Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl." + mo133972e(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + snsInfo + "]");
            View d = C96177r2.m123264d(this.f281162j);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(d, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$3", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(d, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$3", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View e = C96177r2.m123265e(this.f281162j);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(e, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$3", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(e, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$3", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C96177r2 r2Var = this.f281162j;
            C96177r2.m123267g(r2Var, (Button) C96177r2.m123265e(r2Var).findViewById(C0966R.C0970id.f5393dy));
            if (C96177r2.m123268h(this.f281162j) != null) {
                C96177r2 r2Var2 = this.f281162j;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                C102064e eVar = r2Var2.f281003w;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                AdClickActionInfo adClickActionInfo = C96177r2.m123268h(this.f281162j).clickActionInfo;
                C96177r2 r2Var3 = this.f281162j;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                SnsInfo snsInfo2 = r2Var3.f280999s;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                eVar.mo141559h(adClickActionInfo, snsInfo2);
                System.currentTimeMillis();
                String str = snsInfo.getAdXml().adCardTitle;
                String str2 = snsInfo.getAdXml().adCardDesc;
                C96177r2 r2Var4 = this.f281162j;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                TextView textView = r2Var4.f280992i;
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                C96177r2 r2Var5 = this.f281162j;
                SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                TextView textView2 = r2Var5.f280993j;
                SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                C96177r2 r2Var6 = this.f281162j;
                SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                r2Var6.mo133804p(str, str2, textView, textView2);
                SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                C96177r2 r2Var7 = this.f281162j;
                C96177r2.m123267g(r2Var7, (Button) C96177r2.m123265e(r2Var7).findViewById(C0966R.C0970id.f5393dy));
                C96177r2.m123261a(this.f281162j, snsInfo);
                if (TextUtils.isEmpty(C96177r2.m123268h(this.f281162j).iconUrl) || C102260r.m134842K(C96177r2.m123262b(this.f281162j))) {
                    C96177r2 r2Var8 = this.f281162j;
                    SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    RoundedCornerFrameLayout roundedCornerFrameLayout = r2Var8.f280990g;
                    SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    roundedCornerFrameLayout.setVisibility(8);
                } else {
                    C96177r2 r2Var9 = this.f281162j;
                    SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    RoundedCornerFrameLayout roundedCornerFrameLayout2 = r2Var9.f280990g;
                    SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    roundedCornerFrameLayout2.setVisibility(0);
                    String str3 = C96177r2.m123268h(this.f281162j).iconUrl;
                    C96177r2 r2Var10 = this.f281162j;
                    SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    ImageView imageView = r2Var10.f280991h;
                    SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    C101419f.m133080c(str3, imageView);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
    }

    /* renamed from: f */
    public boolean mo133413f(Object obj) {
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        boolean z = C96177r2.m123268h(this.f281162j) != null;
        SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        return z;
    }

    /* renamed from: g */
    public boolean mo133414g(Object obj, Object obj2) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsInfo snsInfo2 = (SnsInfo) obj2;
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        if (snsInfo == null || snsInfo2 == null) {
            z = false;
            SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        } else {
            z = Util.equals(snsInfo.getSnsId(), snsInfo2.getSnsId());
            SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        }
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        return z;
    }

    /* renamed from: h */
    public void mo133888h(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl." + mo133972e(), "onResume called with: snsInfo = [" + snsInfo + "]");
        C96177r2 r2Var = this.f281162j;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        r2Var.mo133807u(snsInfo);
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
    }

    /* renamed from: j */
    public void mo133415j() {
        SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl." + mo133972e(), "resetComponentState() called");
        C96177r2 r2Var = this.f281162j;
        SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        RoundedCornerFrameLayout roundedCornerFrameLayout = r2Var.f280990g;
        SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        roundedCornerFrameLayout.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
    }
}
