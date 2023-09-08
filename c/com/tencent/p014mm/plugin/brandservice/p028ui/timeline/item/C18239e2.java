package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.e2 */
public class C18239e2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f50434d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f50435e;

    /* renamed from: f */
    public final /* synthetic */ C18286h2 f50436f;

    public C18239e2(C18286h2 h2Var, String str, C19623o0 o0Var) {
        this.f50436f = h2Var;
        this.f50434d = str;
        this.f50435e = o0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C18286h2 h2Var = this.f50436f;
        String str = this.f50434d;
        C19623o0 o0Var = this.f50435e;
        h2Var.getClass();
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
            C88144b.m109791i(h2Var.f50824c, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            C115669n.INSTANCE.idkeyStat(1149, 3, 1, false);
            h2Var.f50825d.f51443n.mo22985l(str, 0, 0, 13, 0, x2.f64519h, true, 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
