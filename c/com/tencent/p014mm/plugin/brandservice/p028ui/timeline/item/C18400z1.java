package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import di3.C86312j;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.C22521pi1;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.z1 */
public final class C18400z1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22521pi1 f51012d;

    /* renamed from: e */
    public final /* synthetic */ C18386y1 f51013e;

    /* renamed from: f */
    public final /* synthetic */ C19623o0 f51014f;

    public C18400z1(C22521pi1 pi12, C18386y1 y1Var, C19623o0 o0Var) {
        this.f51012d = pi12;
        this.f51013e = y1Var;
        this.f51014f = o0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$bindHeaderClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f51012d.f64411F == 1) {
            Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "jumpToFinder");
            C18412m3 m3Var = this.f51013e.f50954d.f51443n;
            String str = this.f51012d.f64426f;
            C19623o0 o0Var = this.f51014f;
            String str2 = o0Var.mo25774x2().f64526r;
            C22521pi1 pi12 = this.f51012d;
            m3Var.mo22987n(str, 27, (int) o0Var.field_msgId, str2, pi12.f64435r, pi12.f64431n, "", pi12.f64419N);
            C18386y1 y1Var = this.f51013e;
            C22521pi1 pi13 = this.f51012d;
            y1Var.getClass();
            Class cls = C60200t1.class;
            Intent intent = new Intent();
            intent.putExtra("finder_username", pi13.f64432o);
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(26, 2, 32, intent);
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(y1Var.f50955e, intent);
        } else {
            Log.m105924i("MicroMsg.BizTLRecCardNativeFinder", "jumpToBiz");
            C18412m3 m3Var2 = this.f51013e.f50954d.f51443n;
            String str3 = this.f51012d.f64426f;
            C19623o0 o0Var2 = this.f51014f;
            String str4 = o0Var2.mo25774x2().f64526r;
            C22521pi1 pi14 = this.f51012d;
            m3Var2.mo22987n(str3, 1, (int) o0Var2.field_msgId, str4, pi14.f64435r, pi14.f64431n, "", pi14.f64419N);
            C18386y1 y1Var2 = this.f51013e;
            C22521pi1 pi15 = this.f51012d;
            y1Var2.getClass();
            Intent intent2 = new Intent();
            intent2.putExtra("Contact_User", pi15.f64426f);
            intent2.putExtra("Contact_Nick", pi15.f64425e);
            intent2.putExtra("biz_profile_enter_from_finder", true);
            intent2.putExtra("Contact_Scene", 236);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            intent2.putExtra("biz_profile_tab_type", 1);
            intent2.putExtra("KOpenArticleSceneFromScene", 90);
            C88144b.m109791i(y1Var2.f50955e, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardNativeFinder$bindHeaderClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
