package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q */
public class C43066q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f116570d;

    /* renamed from: e */
    public final /* synthetic */ String f116571e;

    /* renamed from: f */
    public final /* synthetic */ C95136l f116572f;

    public C43066q(C95136l lVar, C101218e0 e0Var, String str) {
        this.f116572f = lVar;
        this.f116570d = e0Var;
        this.f116571e = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$18");
        this.f116570d.mo140680z();
        HashMap hashMap = new HashMap();
        hashMap.put("ret", "0");
        hashMap.put("err_msg", "fail not bind phone");
        C95136l.m121016K(this.f116572f, this.f116571e, "fail not bind phone", hashMap);
        Log.m105924i("AdLandingNewH5Comp", "handleBindPhoneNumber, not bind phone");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$18");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
