package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import p609mp.C76802a;
import p609mp.C76803c;

/* renamed from: com.tencent.mm.plugin.profile.ui.d1 */
public class C4983d1 implements ContactListExpandPreference.C72740a {

    /* renamed from: a */
    public final /* synthetic */ C4986e1 f20267a;

    public C4983d1(C4986e1 e1Var) {
        this.f20267a = e1Var;
    }

    /* renamed from: a */
    public void mo5953a(ViewGroup viewGroup, View view, int i) {
    }

    /* renamed from: b */
    public void mo5954b(ViewGroup viewGroup, View view, int i) {
    }

    /* renamed from: c */
    public void mo5955c(ViewGroup viewGroup, View view, int i) {
    }

    /* renamed from: d */
    public void mo5956d(ViewGroup viewGroup, View view, int i) {
    }

    /* renamed from: e */
    public void mo5957e(ViewGroup viewGroup, View view, int i) {
        C76803c cVar = this.f20267a.f20279p.f211662K;
        if (cVar != null ? ((C72741a) cVar).f211670g.mo108546d(i) : false) {
            String c = C76802a.m92581c(this.f20267a.f20279p, i);
            if (!Util.isNullOrNil(c)) {
                Intent intent = new Intent();
                intent.setClass(this.f20267a.f20270d, ContactInfoUI.class);
                intent.putExtra("Contact_User", c);
                intent.putExtra("Contact_RoomNickname", this.f20267a.f20278o.mo69789q2(c));
                Context context = this.f20267a.f20270d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard$1", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard$1", "onItemNormalClick", "(Landroid/view/ViewGroup;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
