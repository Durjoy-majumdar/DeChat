package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.s */
public final class C42765s implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42734m f115787d;

    /* renamed from: e */
    public final /* synthetic */ String f115788e;

    /* renamed from: f */
    public final /* synthetic */ String f115789f;

    public C42765s(C42734m mVar, String str, String str2) {
        this.f115787d = mVar;
        this.f115788e = str;
        this.f115789f = str2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFinderTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42716h0 h0Var = this.f115787d.f115728c;
        String str = this.f115788e;
        C87412m.m108593f(str, "finderUserName");
        String str2 = this.f115789f;
        C87412m.m108593f(str2, "finderNickName");
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = ContactWidgetTabBizHeaderController.this;
        contactWidgetTabBizHeaderController.getClass();
        C115669n.INSTANCE.mo160131h(22118, Long.valueOf(contactWidgetTabBizHeaderController.f115541D), contactWidgetTabBizHeaderController.f115559j.getUsername(), 2, str, str2);
        Intent intent = new Intent();
        intent.putExtra("key_enter_profile_type", 12);
        intent.putExtra("finder_username", str);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(contactWidgetTabBizHeaderController.f115556g, intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFinderTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
