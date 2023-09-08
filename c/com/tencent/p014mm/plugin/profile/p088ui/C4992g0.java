package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import m83.C10769b;
import m83.C10770c;
import m83.C10771d;
import qe0.C12158i;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.profile.ui.g0 */
public class C4992g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f20284d;

    /* renamed from: e */
    public final /* synthetic */ C72996z1 f20285e;

    /* renamed from: f */
    public final /* synthetic */ String f20286f;

    /* renamed from: g */
    public final /* synthetic */ ContactMoreInfoUI f20287g;

    /* renamed from: com.tencent.mm.plugin.profile.ui.g0$a */
    public class C4993a implements C47883u {
        public C4993a() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (z) {
                C10770c cVar = new C10770c(C4992g0.this.f20287g);
                cVar.f32244b = "mmdownloadapp_P1JsSxoAvEuC7tny5Q";
                ((C10771d) C86312j.m106911c(C10771d.class)).mo10782yz(cVar, (C10769b) null);
            }
        }
    }

    public C4992g0(ContactMoreInfoUI contactMoreInfoUI, String str, C72996z1 z1Var, String str2) {
        this.f20287g = contactMoreInfoUI;
        this.f20284d = str;
        this.f20285e = z1Var;
        this.f20286f = str2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!WeChatBrands.Business.Entries.ContactWeCom.checkAvailable(this.f20287g.getContext())) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!C12158i.m11772a()) {
            C77426q qVar = new C77426q(this.f20287g.getContext());
            qVar.mo107595g(this.f20287g.getString(C0966R.string.bti));
            qVar.mo107601m(C0966R.string.f7950x8);
            qVar.mo107590b(new C4993a());
            qVar.mo107603o();
        } else {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
            intent.putExtra("rawUrl", this.f20284d);
            intent.putExtra("geta8key_scene", 58);
            C88144b.m109791i(MMApplicationContext.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C115669n.INSTANCE.mo160131h(15319, this.f20285e.mo73980x2(), 6, this.f20286f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
