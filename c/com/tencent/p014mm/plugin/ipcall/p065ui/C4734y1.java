package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import ke3.C88144b;
import p011cm.C39989b;
import s12.C13612c;
import wd3.C78543a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.y1 */
public class C4734y1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ IPCallUserProfileUI f19748d;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.y1$a */
    public class C4735a implements C39989b.C0705b {
        public C4735a() {
        }

        /* renamed from: a */
        public void mo677a(boolean z, boolean z2, String str, String str2) {
            Log.m105919d("MicroMsg.IPCallUserProfileUI", "canAddContact, ok: %b, hasSentVerify: %b, respUsername: %s, itemID: %s", Boolean.valueOf(z), Boolean.valueOf(z2), str, str2);
            if (z) {
                C4734y1.this.f19748d.f19627q.setVisibility(8);
                C4734y1.this.f19748d.f19626p.setVisibility(8);
                IPCallUserProfileUI iPCallUserProfileUI = C4734y1.this.f19748d;
                if (!Util.isNullOrNil(iPCallUserProfileUI.f19630t) && !Util.isNullOrNil(str) && !str.endsWith("@stranger")) {
                    C13612c qq = C105385g.vx0().mo13010qq(iPCallUserProfileUI.f19630t);
                    if (qq.systemRowid > 0) {
                        qq.field_wechatUsername = str;
                        C105385g.vx0().update(qq.systemRowid, qq);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.y1$b */
    public class C4736b implements C39989b.C0706c {
        public C4736b() {
        }

        /* renamed from: a */
        public boolean mo678a(String str, String str2, String str3, int i, String str4) {
            Class cls = C32735h.class;
            Intent intent = new Intent();
            intent.putExtra("Contact_User", C4734y1.this.f19748d.f19629s);
            intent.putExtra("Contact_Scene", 13);
            intent.putExtra("AntispamTicket", str3);
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 2);
            C88144b.m109791i(C4734y1.this.f19748d, Scopes.PROFILE, (C72996z1.m85843n5(C4734y1.this.f19748d.f19629s) || Qe != 1) ? (C72996z1.m85843n5(C4734y1.this.f19748d.f19629s) || Qe != 2 || C45628s0.m50780j() < ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2", intent, (Bundle) null);
            return true;
        }
    }

    public C4734y1(IPCallUserProfileUI iPCallUserProfileUI) {
        this.f19748d = iPCallUserProfileUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C115669n.INSTANCE.mo160131h(12766, 3);
        C78543a aVar = new C78543a(this.f19748d, new C4735a());
        LinkedList linkedList = new LinkedList();
        linkedList.add(86);
        aVar.f230036e = new C4736b();
        aVar.mo108501b(this.f19748d.f19629s, linkedList, true, "");
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallUserProfileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
