package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o */
public class C43064o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f116563d;

    /* renamed from: e */
    public final /* synthetic */ String f116564e;

    /* renamed from: f */
    public final /* synthetic */ C95136l f116565f;

    public C43064o(C95136l lVar, C101218e0 e0Var, String str) {
        this.f116565f = lVar;
        this.f116563d = e0Var;
        this.f116564e = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$16");
        this.f116563d.mo140680z();
        HashMap hashMap = new HashMap();
        hashMap.put("ret", "0");
        hashMap.put("err_msg", "cancel");
        C95136l.m121016K(this.f116565f, this.f116564e, "cancel", hashMap);
        Log.m105924i("AdLandingNewH5Comp", "handleBindPhoneNumber, cancel");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$16");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
