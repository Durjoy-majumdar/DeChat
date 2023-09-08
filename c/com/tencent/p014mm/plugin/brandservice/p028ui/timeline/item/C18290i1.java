package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.oe4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.i1 */
public final class C18290i1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C18253h1 f50570d;

    /* renamed from: e */
    public final /* synthetic */ oe4 f50571e;

    public C18290i1(C18253h1 h1Var, oe4 oe4) {
        this.f50570d = h1Var;
        this.f50571e = oe4;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$fillingHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C18253h1 h1Var = this.f50570d;
        oe4 oe4 = this.f50571e;
        C87412m.m108593f(oe4, "bizInfo");
        h1Var.getClass();
        Intent intent = new Intent();
        intent.putExtra("Contact_User", oe4.f64334d);
        intent.putExtra("Contact_Scene", WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("KOpenArticleSceneFromScene", 90);
        if (!Util.isNullOrNil(oe4.f64334d)) {
            ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69778p0(oe4.f64334d);
        }
        C88144b.m109791i(h1Var.mo22861k(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardMissedSubscription$fillingHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
