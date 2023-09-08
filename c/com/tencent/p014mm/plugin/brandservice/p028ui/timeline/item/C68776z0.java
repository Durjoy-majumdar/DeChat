package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.z0 */
public final class C68776z0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTLRecCardItem f197579d;

    /* renamed from: e */
    public final /* synthetic */ String f197580e;

    /* renamed from: f */
    public final /* synthetic */ C19623o0 f197581f;

    public C68776z0(BizTLRecCardItem bizTLRecCardItem, String str, C19623o0 o0Var) {
        this.f197579d = bizTLRecCardItem;
        this.f197580e = str;
        this.f197581f = o0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem$refreshHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BizTLRecCardItem bizTLRecCardItem = this.f197579d;
        String str = this.f197580e;
        C87412m.m108593f(str, "username");
        C19623o0 o0Var = this.f197581f;
        bizTLRecCardItem.getClass();
        re4 x2 = o0Var.mo25774x2();
        if (x2 == null) {
            Log.m105928w("MicroMsg.BizTimeLineItem", "viewContactProfile wrapper is null");
        } else {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("Contact_Scene", 160);
            intent.putExtra("KBizRecCardId", x2.f64519h);
            intent.putExtra("force_get_contact", true);
            intent.putExtra("key_use_new_contact_profile", true);
            C88144b.m109791i(bizTLRecCardItem.f50309d, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            C115669n.INSTANCE.idkeyStat(1149, 3, 1, false);
            bizTLRecCardItem.f50310e.f51443n.mo22985l(str, 0, 0, 13, 0, x2.f64519h, true, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardItem$refreshHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
