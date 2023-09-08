package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.p */
public class C43065p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f116566d;

    /* renamed from: e */
    public final /* synthetic */ String f116567e;

    /* renamed from: f */
    public final /* synthetic */ String f116568f;

    /* renamed from: g */
    public final /* synthetic */ C95136l f116569g;

    public C43065p(C95136l lVar, C101218e0 e0Var, String str, String str2) {
        this.f116569g = lVar;
        this.f116566d = e0Var;
        this.f116567e = str;
        this.f116568f = str2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$17");
        this.f116566d.mo140680z();
        HashMap hashMap = new HashMap();
        hashMap.put("ret", "0");
        hashMap.put("err_msg", "ok");
        hashMap.put("phoneNumber", this.f116567e);
        C95136l.m121016K(this.f116569g, this.f116568f, "ok", hashMap);
        Log.m105924i("AdLandingNewH5Comp", "handleBindPhoneNumber, ok");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$17");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
