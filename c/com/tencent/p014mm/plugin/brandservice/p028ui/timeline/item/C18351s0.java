package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C45825h;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.C22499hb0;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.s0 */
public final class C18351s0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C19623o0 f50819d;

    /* renamed from: e */
    public final /* synthetic */ C18326p0 f50820e;

    public C18351s0(C19623o0 o0Var, C18326p0 p0Var) {
        this.f50819d = o0Var;
        this.f50820e = p0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$refreshHead$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = this.f50819d.field_talker;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f50819d.field_talker);
        if (z1Var == null || z1Var.mo62927s3()) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            intent.putExtra("KOpenArticleSceneFromScene", 90);
            intent.putExtra("specific_chat_from_scene", 2);
            intent.putExtra("preChatTYPE", 11);
            C88144b.m109801s(this.f50820e.f50712e, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            C45825h.f123727a.mo71296i(3, str, "");
        } else {
            C18326p0 p0Var = this.f50820e;
            C19623o0 o0Var = this.f50819d;
            Intent intent2 = new Intent();
            intent2.putExtra("Contact_User", str);
            intent2.putExtra("Contact_Scene", WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE);
            intent2.putExtra("force_get_contact", true);
            intent2.putExtra("key_use_new_contact_profile", true);
            C88144b.m109791i(p0Var.f50712e, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
            re4 x2 = o0Var.mo25774x2();
            C18412m3 m3Var = p0Var.f50711d.f51443n;
            long j = x2.f64519h;
            C22499hb0 hb02 = x2.f64523o;
            m3Var.mo22986m(str, 0, 0, 13, 0, j, "", 0, hb02.f63909n, x2.f64522n, hb02.f63908j, 0, x2.f64521j, "");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardBizcontentUnfollow$refreshHead$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
