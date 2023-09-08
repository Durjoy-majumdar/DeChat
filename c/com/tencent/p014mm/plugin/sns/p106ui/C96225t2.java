package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import os2.C62171i;
import rq2.C101419f;

/* renamed from: com.tencent.mm.plugin.sns.ui.t2 */
public class C96225t2 extends AdViewComponent<SnsInfo> {

    /* renamed from: j */
    public final /* synthetic */ C96177r2 f281183j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96225t2(C96177r2 r2Var, String str, C0125s sVar, View view) {
        super(str, sVar, view);
        this.f281183j = r2Var;
    }

    /* renamed from: b */
    public void mo133412b(Object obj) {
        String str = "bindComponentModel";
        String str2 = "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4";
        SnsMethodCalculate.markStartTimeMs(str, str2);
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsMethodCalculate.markStartTimeMs(str, str2);
        Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl." + mo133972e(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + snsInfo + "]");
        if (snsInfo != null) {
            C96177r2 r2Var = this.f281183j;
            SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            r2Var.getClass();
            SnsMethodCalculate.markStartTimeMs("bindSellingPointData", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            C62171i iVar = snsInfo.getAdXml().adSellingPointInfo;
            View view = r2Var.f280996p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            String str3 = str;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = view;
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = r2Var.f280997q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = r2Var.f280997q;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(Float.valueOf(0.0f));
            View view6 = view5;
            String str4 = str2;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) r2Var.f280997q.findViewById(C0966R.C0970id.f5411ee);
            roundedCornerFrameLayout.setRadius((float) C76577a.m92151b(r2Var.f280988e, 4));
            ImageView imageView = (ImageView) r2Var.f280997q.findViewById(C0966R.C0970id.f5410ed);
            TextView textView = (TextView) r2Var.f280997q.findViewById(C0966R.C0970id.f5436f3);
            TextView textView2 = (TextView) r2Var.f280997q.findViewById(C0966R.C0970id.f5404e8);
            Button button = (Button) r2Var.f280997q.findViewById(C0966R.C0970id.f5393dy);
            button.setVisibility(4);
            button.setEnabled(false);
            Button button2 = r2Var.f280994n;
            if (!(button2 == null || button2.getText() == null)) {
                button.setText(r2Var.f280994n.getText());
            }
            r2Var.mo133804p(iVar.f176767a, iVar.f176768b, textView, textView2);
            if (!TextUtils.isEmpty(iVar.f176769c)) {
                roundedCornerFrameLayout.setVisibility(0);
                C101419f.m133080c(iVar.f176769c, imageView);
            } else {
                roundedCornerFrameLayout.setVisibility(8);
            }
            WeakReference weakReference = new WeakReference(r2Var);
            String snsId = snsInfo.getSnsId();
            if (r2Var.f281004x == null) {
                r2Var.f281004x = new C96177r2.C96187h(weakReference, snsId);
                Log.m105918d("MicroMsg.SnsAdCardActionBtnCtrl", "anim started");
                C96177r2.C96187h hVar = r2Var.f281004x;
                SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                AnimatorSet animatorSet = hVar.f281021a;
                SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                animatorSet.start();
            } else {
                r2Var.f281004x = new C96177r2.C96187h(weakReference, snsId);
                Log.m105918d("MicroMsg.SnsAdCardActionBtnCtrl", "anim restarted");
                C96177r2.C96187h hVar2 = r2Var.f281004x;
                SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                AnimatorSet animatorSet2 = hVar2.f281021a;
                SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                animatorSet2.start();
            }
            SnsMethodCalculate.markEndTimeMs("bindSellingPointData", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            str2 = str4;
            str = str3;
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: f */
    public boolean mo133413f(Object obj) {
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        boolean s = C96177r2.m123271s((SnsInfo) obj, C96177r2.m123262b(this.f281183j));
        SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        return s;
    }

    /* renamed from: g */
    public boolean mo133414g(Object obj, Object obj2) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        SnsInfo snsInfo = (SnsInfo) obj;
        SnsInfo snsInfo2 = (SnsInfo) obj2;
        SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        if (snsInfo == null || snsInfo2 == null) {
            z = false;
            SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        } else {
            z = Util.equals(snsInfo.getSnsId(), snsInfo2.getSnsId());
            SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        }
        SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        return z;
    }

    /* renamed from: j */
    public void mo133415j() {
        SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl." + mo133972e(), "resetComponentState() called");
        C96177r2 r2Var = this.f281183j;
        SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        r2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("resetSellingPointView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        C96177r2.C96187h hVar = r2Var.f281004x;
        if (hVar != null) {
            SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
            AnimatorSet animatorSet = hVar.f281021a;
            SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
            animatorSet.cancel();
            r2Var.f281004x = null;
        }
        SnsMethodCalculate.markStartTimeMs("resetChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        r2Var.f281006z = 0;
        SnsInfo snsInfo = r2Var.f280999s;
        long j = snsInfo != null ? snsInfo.field_snsId : 0;
        SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        int i = r2Var.f280987d == 0 ? 1 : 2;
        SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        C96177r2.C57420i.m66160b(i, j, r2Var.f281006z);
        SnsMethodCalculate.markEndTimeMs("resetChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        r2Var.mo133801n(1.0f);
        r2Var.mo133802o(0.0f);
        View view = r2Var.f280997q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "resetSellingPointView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "resetSellingPointView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("resetSellingPointView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
    }
}
