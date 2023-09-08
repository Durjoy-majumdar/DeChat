package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import android.content.Intent;
import ck3.C67391b;
import com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI;
import com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI2;
import com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI3;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.WXWebReporter;
import de3.C45335p;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import ie3.C87716k;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import wd3.C53155r0;
import wd3.C78553c1;

/* renamed from: com.tencent.mm.ui.chatting.y3 */
public class C74349y3 implements C45335p {

    /* renamed from: a */
    public C67391b f218399a;

    public C74349y3(C67391b bVar) {
        this.f218399a = bVar;
    }

    /* renamed from: a */
    public Object mo22792a(C53155r0 r0Var) {
        C87716k.f253994a = 6;
        int i = r0Var.f148313d;
        if (i == 1) {
            return this.f218399a.mo91577r();
        }
        if (i != 2) {
            if (i == 4) {
                LinkedList linkedList = new LinkedList();
                if (C72996z1.m85820U5(this.f218399a.mo91577r())) {
                    int lastIndexOf = r0Var.f148312c.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        linkedList.add(r0Var.f148312c.substring(lastIndexOf + 1));
                    }
                } else {
                    linkedList.add(this.f218399a.mo91577r());
                }
                LinkedList linkedList2 = new LinkedList();
                for (int i2 = 0; i2 < linkedList.size(); i2++) {
                    linkedList2.add(6);
                }
                if (this.f218399a.mo91574o() == null || !C72996z1.m85843n5(this.f218399a.mo91574o().getUsername())) {
                    Log.m105925i("MicroMsg.MMChattingSpanClickCallback", "doSend, hrefInfo.getURL() = %s.", r0Var.f148312c);
                    if (!C72996z1.m85820U5(this.f218399a.mo91574o().getUsername())) {
                        mo103306c(this.f218399a.mo91565f(), this.f218399a.mo91574o(), 6, r0Var, -1);
                    } else if (linkedList.size() <= 0 || Util.isNullOrNil((String) linkedList.getFirst())) {
                        Log.m105924i("MicroMsg.MMChattingSpanClickCallback", "doSend, error.");
                    } else {
                        C86709a0.m107528h();
                        mo103306c(this.f218399a.mo91565f(), ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get((String) linkedList.getFirst()), 6, r0Var, -1);
                    }
                } else {
                    new C78553c1(this.f218399a.mo91565f(), new C74342x3(this)).mo108532h(linkedList, linkedList2, (LinkedList<String>) null);
                }
            } else if (i != 9) {
                if (!(i == 25 || i == 33)) {
                    if (!(i == 6 || i == 7)) {
                        if (!(i == 30 || i == 31)) {
                            switch (i) {
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                    break;
                                default:
                                    switch (i) {
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                            break;
                                    }
                            }
                        }
                    }
                }
                return this.f218399a.mo91577r();
            }
            return null;
        }
        this.f218399a.mo91563d();
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo22793b(wd3.C53155r0 r15) {
        /*
            r14 = this;
            java.lang.Class<rn.v> r0 = p227rn.C48053v.class
            java.lang.String r1 = ""
            int r2 = r15.f148313d
            r3 = 45
            r4 = 0
            if (r2 == r3) goto L_0x000d
            goto L_0x011f
        L_0x000d:
            boolean r2 = eb0.C97625j3.m125811a()
            if (r2 == 0) goto L_0x0046
            di3.d r2 = di3.C86312j.m106911c(r0)
            rn.v r2 = (p227rn.C48053v) r2
            ck3.b r3 = r14.f218399a
            java.lang.String r3 = r3.mo91577r()
            boolean r2 = r2.mo72614OE(r3)
            if (r2 == 0) goto L_0x0026
            return r4
        L_0x0026:
            di3.d r0 = di3.C86312j.m106911c(r0)
            rn.v r0 = (p227rn.C48053v) r0
            ck3.b r2 = r14.f218399a
            java.lang.String r2 = r2.mo91577r()
            boolean r0 = r0.mo72617gl(r2)
            if (r0 == 0) goto L_0x0039
            return r4
        L_0x0039:
            ck3.b r0 = r14.f218399a
            java.lang.String r0 = r0.mo91577r()
            boolean r0 = rb0.C47984k.m53335i(r0)
            if (r0 == 0) goto L_0x0046
            return r4
        L_0x0046:
            java.lang.String r8 = new java.lang.String
            java.lang.String r0 = r15.f148312c
            r2 = 0
            byte[] r0 = android.util.Base64.decode(r0, r2)
            r8.<init>(r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r15 = r15.mo73845a(r0)
            java.lang.String r15 = (java.lang.String) r15
            c30.g r0 = new c30.g     // Catch:{ f -> 0x0085 }
            r0.<init>((java.lang.String) r15)     // Catch:{ f -> 0x0085 }
            java.lang.String r15 = "fullText"
            java.lang.String r15 = r0.optString(r15)     // Catch:{ f -> 0x0085 }
            java.lang.String r3 = "linkText"
            java.lang.String r3 = r0.optString(r3)     // Catch:{ f -> 0x0082 }
            java.lang.String r5 = new java.lang.String     // Catch:{ f -> 0x0080 }
            java.lang.String r6 = "path"
            java.lang.String r0 = r0.optString(r6)     // Catch:{ f -> 0x0080 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ f -> 0x0080 }
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ f -> 0x0080 }
            r5.<init>(r0)     // Catch:{ f -> 0x0080 }
            r11 = r5
            goto L_0x0089
        L_0x0080:
            goto L_0x0088
        L_0x0082:
            r3 = r1
            goto L_0x0088
        L_0x0085:
            r15 = r1
            r3 = r15
        L_0x0088:
            r11 = r1
        L_0x0089:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r8
            r5 = 1
            r0[r5] = r11
            java.lang.String r6 = "MicroMsg.MMChattingSpanClickCallback"
            java.lang.String r7 = "appId:%s,path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r0)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r12 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r12.<init>()
            ck3.b r0 = r14.f218399a
            java.lang.String r0 = r0.mo91577r()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85846q5(r0)
            if (r0 == 0) goto L_0x00b7
            r15 = 1207(0x4b7, float:1.691E-42)
            r12.f245533f = r15
            ck3.b r15 = r14.f218399a
            java.lang.String r15 = r15.mo91577r()
            r12.f245534g = r15
        L_0x00b5:
            r13 = r1
            goto L_0x010a
        L_0x00b7:
            r0 = 1082(0x43a, float:1.516E-42)
            r12.f245533f = r0
            ck3.b r0 = r14.f218399a
            java.lang.Class<zj3.e> r7 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r7)
            zj3.e r0 = (zj3.C79348e) r0
            if (r0 == 0) goto L_0x00d6
            ug.c r7 = r0.getBizInfo()
            if (r7 == 0) goto L_0x00d6
            ug.c r0 = r0.getBizInfo()
            java.lang.String r0 = r0.field_appId
            r1 = r0
        L_0x00d6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ck3.b r7 = r14.f218399a
            java.lang.String r7 = r7.mo91577r()
            r0.append(r7)
            java.lang.String r7 = ":1:"
            r0.append(r7)
            r0.append(r15)
            java.lang.String r15 = ":"
            r0.append(r15)
            r0.append(r3)
            r0.append(r15)
            r0.append(r11)
            java.lang.String r15 = r0.toString()
            r12.f245534g = r15
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r2] = r15
            java.lang.String r15 = "sceneNote = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r15, r0)
            goto L_0x00b5
        L_0x010a:
            java.lang.Class<kr0.x0> r15 = kr0.C76630x0.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            r5 = r15
            kr0.x0 r5 = (kr0.C76630x0) r5
            ck3.b r15 = r14.f218399a
            android.app.Activity r6 = r15.mo91565f()
            r7 = 0
            r9 = 0
            r10 = 0
            r5.Rg0(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x011f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C74349y3.mo22793b(wd3.r0):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo103306c(Activity activity, C72996z1 z1Var, int i, C53155r0 r0Var, int i2) {
        Class cls = C32735h.class;
        C72963f4 f4Var = r0Var.f148324o;
        long msgId = f4Var != null ? f4Var.getMsgId() : 0;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 2);
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold, 5000);
        Class cls2 = SayHiWithSnsPermissionUI.class;
        if (!C72996z1.m85843n5(z1Var.getUsername()) && Qe == 1) {
            cls2 = SayHiWithSnsPermissionUI2.class;
        } else if (!C72996z1.m85843n5(z1Var.getUsername()) && Qe == 2 && C45628s0.m50780j() >= Qe2) {
            cls2 = SayHiWithSnsPermissionUI3.class;
        }
        Intent intent = new Intent(activity, cls2);
        intent.putExtra("Contact_User", z1Var.getUsername());
        intent.putExtra("Contact_Nick", z1Var.getNickname());
        intent.putExtra("Contact_RemarkName", z1Var.mo73969n2());
        intent.putExtra("Contact_IsForceVerifyFriend", true);
        intent.putExtra("Contact_Scene", i);
        intent.putExtra("Contact_Source_Add", WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED);
        intent.putExtra("key_force_use_contact_label", true);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", false);
        intent.putExtra("AntispamTicket", "");
        intent.putExtra("sayhi_verify_add_errcode", i2);
        intent.putExtra("key_msg_id", msgId);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/MMChattingSpanClickCallback", "gotoSayHiPage", "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;ILcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/ui/chatting/MMChattingSpanClickCallback", "gotoSayHiPage", "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;ILcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
