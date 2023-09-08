package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3605p1;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87413o;
import nj3.C76879j;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.w1 */
public final class C3886w1 extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderModifyNameUI f17453d;

    /* renamed from: e */
    public final /* synthetic */ String f17454e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3886w1(FinderModifyNameUI finderModifyNameUI, String str) {
        super(2);
        this.f17453d = finderModifyNameUI;
        this.f17454e = str;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            if (booleanValue2) {
                FinderModifyNameUI finderModifyNameUI = this.f17453d;
                String str = FinderModifyNameUI.f16952J;
                C89779i0 Q = C76879j.m92723Q(finderModifyNameUI, "", finderModifyNameUI.getString(C0966R.string.a3v), true, false, (DialogInterface.OnCancelListener) null);
                finderModifyNameUI.f16957D = Q;
                if (Q != null) {
                    Q.show();
                }
            }
            FinderModifyNameUI finderModifyNameUI2 = this.f17453d;
            String str2 = this.f17454e;
            String str3 = FinderModifyNameUI.f16952J;
            finderModifyNameUI2.getClass();
            ((C3605p1) C86312j.m106911c(C3605p1.class)).w80(str2, finderModifyNameUI2);
        } else if (!booleanValue2) {
            FinderModifyNameUI finderModifyNameUI3 = this.f17453d;
            ProgressDialog progressDialog = finderModifyNameUI3.f16957D;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            finderModifyNameUI3.f16957D = null;
        }
        return C13598b0.f38549a;
    }
}
