package com.tencent.p014mm.p136ui.chatting.component;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.component.FootComponent;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.component.FootComponent$$k */
public class FootComponent$$k implements TextWatcher {

    /* renamed from: d */
    public List<String> f215538d = null;

    /* renamed from: e */
    public final /* synthetic */ FootComponent f215539e;

    public FootComponent$$k(FootComponent footComponent, FootComponent.C308081 r2) {
        this.f215539e = footComponent;
    }

    /* renamed from: a */
    public final void mo102205a(List<String> list, String[] strArr) {
        for (String str : strArr) {
            if (str.length() > 0 && str.substring(str.length() - 1, str.length()).matches("[_0-9a-zA-Z]$")) {
                list.add(str);
            }
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public final boolean mo102207b(String str, int i) {
        if (str == null || i < 0 || str.length() <= i) {
            return false;
        }
        if (i == 0 || !str.substring(i - 1, i).matches("[_0-9a-zA-Z]$")) {
            return true;
        }
        if (this.f215538d == null) {
            this.f215538d = new LinkedList();
            mo102205a(this.f215538d, this.f215539e.f215752d.f193286j.getMMResources().getStringArray(C0966R.array.f2586a2));
            mo102205a(this.f215538d, this.f215539e.f215752d.f193286j.getMMResources().getStringArray(C0966R.array.f2587a3));
        }
        String substring = str.substring(0, i);
        for (String endsWith : this.f215538d) {
            if (substring.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            java.lang.Class<zj3.e> r13 = zj3.C79348e.class
            java.lang.String r0 = "MicroMsg.ChattingUI.FootComponent"
            java.lang.String r1 = "[onTextChanged]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.ui.chatting.component.FootComponent r0 = r10.f215539e
            ck3.b r0 = r0.f215752d
            java.lang.Class<zj3.w0> r1 = zj3.C79388w0.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.w0 r0 = (zj3.C79388w0) r0
            r1 = 1
            r0.mo102672a4(r1)
            com.tencent.mm.ui.chatting.component.FootComponent r0 = r10.f215539e
            ck3.b r0 = r0.f215752d
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r13)
            zj3.e r0 = (zj3.C79348e) r0
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r14 = r14 + r12
            java.lang.String r14 = r11.substring(r12, r14)
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            ck3.b r2 = r2.f215752d
            boolean r2 = r2.mo91582w()
            r3 = 2131834909(0x7f11381d, float:1.9302942E38)
            java.lang.String r4 = "@"
            if (r2 == 0) goto L_0x00f6
            boolean r2 = r4.equals(r14)
            if (r2 == 0) goto L_0x00f6
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r2.f215510e
            java.lang.String r2 = r2.getLastContent()
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x00f6
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r2.f215510e
            boolean r5 = r2.f211799Q
            if (r5 != 0) goto L_0x00f6
            r2.setLastContent(r11)
            com.tencent.mm.ui.chatting.component.FootComponent r13 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r13 = r13.f215510e
            int r2 = r12 + 1
            r13.setInsertPos(r2)
            boolean r13 = r10.mo102207b(r11, r12)
            if (r13 == 0) goto L_0x01b0
            java.lang.Class<wo.b> r13 = p740wo.C53193b.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            wo.b r13 = (p740wo.C53193b) r13
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            ck3.b r2 = r2.f215752d
            java.lang.String r2 = r2.mo91577r()
            java.util.List r8 = r13.mo73727k5(r2)
            com.tencent.mm.ui.chatting.component.FootComponent r13 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r13 = r13.f215510e
            boolean r13 = r13.mo100446q0()
            if (r13 == 0) goto L_0x00a6
            eb0.c r13 = eb0.C97625j3.m125812b()
            g62.l r13 = r13.mo105911z()
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r2.f215510e
            long r4 = r2.getLastQuoteMsgId()
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            com.tencent.mm.storage.f4 r13 = r13.b00(r4)
            java.lang.String r13 = bp3.C67301m.m79637b(r13)
            goto L_0x00a8
        L_0x00a6:
            java.lang.String r13 = ""
        L_0x00a8:
            r9 = r13
            java.lang.Class<sx.p> r13 = p240sx.C77807p.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            r4 = r13
            sx.p r4 = (p240sx.C77807p) r4
            com.tencent.mm.ui.chatting.component.FootComponent r13 = r10.f215539e
            ck3.b r13 = r13.f215752d
            android.app.Activity r5 = r13.mo91565f()
            com.tencent.mm.ui.chatting.component.FootComponent r13 = r10.f215539e
            ck3.b r13 = r13.f215752d
            android.content.res.Resources r13 = r13.mo91572m()
            java.lang.String r6 = r13.getString(r3)
            com.tencent.mm.ui.chatting.component.FootComponent r13 = r10.f215539e
            ck3.b r13 = r13.f215752d
            java.lang.String r7 = r13.mo91577r()
            android.content.Intent r13 = r4.mo107759qR(r5, r6, r7, r8, r9)
            zl3.a$a r2 = new zl3.a$a
            r2.<init>()
            com.tencent.mm.ui.chatting.component.FootComponent r3 = r10.f215539e
            ck3.b r3 = r3.f215752d
            android.app.Activity r3 = r3.mo91565f()
            zl3.a r4 = r2.f232918a
            r4.f232909a = r3
            r2.mo109373c(r13)
            java.lang.String r13 = "com.tencent.mm.ui.mvvm.MvvmSelectContactUI"
            r2.mo109371a(r13)
            r13 = 229(0xe5, float:3.21E-43)
            zl3.a r3 = r2.f232918a
            r3.f232914f = r13
            r2.mo109374d()
            goto L_0x01b0
        L_0x00f6:
            boolean r2 = r0.mo70075s4()
            if (r2 == 0) goto L_0x019b
            boolean r2 = r4.equals(r14)
            if (r2 == 0) goto L_0x019b
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r2.f215510e
            java.lang.String r2 = r2.getLastContent()
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x019b
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r2.f215510e
            boolean r4 = r2.f211799Q
            if (r4 != 0) goto L_0x019b
            r2.setLastContent(r11)
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r2.f215510e
            int r4 = r12 + 1
            r2.setInsertPos(r4)
            boolean r2 = r10.mo102207b(r11, r12)
            if (r2 == 0) goto L_0x01b0
            sb0.c r2 = r0.mo70076s5()
            java.lang.String r2 = r2.field_userList
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            com.tencent.mm.ui.chatting.component.FootComponent r5 = r10.f215539e
            ck3.b r5 = r5.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r5 = r5.f193286j
            android.app.Activity r5 = r5.getContext()
            java.lang.Class<com.tencent.mm.ui.bizchat.BizChatAtSomeoneUI> r6 = com.tencent.p014mm.p136ui.bizchat.BizChatAtSomeoneUI.class
            r4.setClass(r5, r6)
            sb0.k r5 = rb0.C48009v0.Bx0()
            com.tencent.mm.ui.chatting.component.FootComponent r6 = r10.f215539e
            ck3.b r6 = r6.f215752d
            java.lang.String r6 = r6.mo91577r()
            java.lang.String r5 = r5.mo73076Pk(r6)
            java.lang.String r6 = "Block_list"
            r4.putExtra(r6, r5)
            java.lang.String r5 = "Chatroom_member_list"
            r4.putExtra(r5, r2)
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            ck3.b r2 = r2.f215752d
            java.lang.String r2 = r2.mo91577r()
            java.lang.String r5 = "Chat_User"
            r4.putExtra(r5, r2)
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            ck3.b r2 = r2.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r2 = r2.f193286j
            java.lang.String r2 = r2.getMMString(r3)
            java.lang.String r3 = "Add_address_titile"
            r4.putExtra(r3, r2)
            com.tencent.mm.ui.chatting.component.FootComponent r2 = r10.f215539e
            ck3.b r2 = r2.f215752d
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r13 = r2.mo102812a(r13)
            zj3.e r13 = (zj3.C79348e) r13
            long r2 = r13.mo70068i4()
            java.lang.String r13 = "key_biz_chat_id"
            r4.putExtra(r13, r2)
            com.tencent.mm.ui.chatting.component.FootComponent r13 = r10.f215539e
            ck3.b r13 = r13.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r13 = r13.f193286j
            r2 = 212(0xd4, float:2.97E-43)
            r13.startActivityForResult(r4, r2)
            goto L_0x01b0
        L_0x019b:
            com.tencent.mm.ui.chatting.component.FootComponent r13 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r13 = r13.f215510e
            java.lang.String r13 = r13.getLastContent()
            boolean r13 = r11.equals(r13)
            if (r13 != 0) goto L_0x01b0
            com.tencent.mm.ui.chatting.component.FootComponent r13 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r13 = r13.f215510e
            r13.setLastContent(r11)
        L_0x01b0:
            com.tencent.mm.ui.chatting.component.FootComponent r13 = r10.f215539e
            ck3.b r13 = r13.f215752d
            java.lang.Class<zj3.v0> r2 = zj3.C79386v0.class
            com.tencent.mm.ui.chatting.manager.a r13 = r13.f193278b
            xi.d r13 = r13.mo102812a(r2)
            zj3.v0 r13 = (zj3.C79386v0) r13
            r13.mo102593o5(r11, r12, r14)
            boolean r12 = r0.mo70071q1()
            if (r12 != 0) goto L_0x0206
            com.tencent.mm.ui.chatting.component.FootComponent r12 = r10.f215539e
            ck3.b r12 = r12.f215752d
            java.lang.String r12 = r12.mo91577r()
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85812O4(r12)
            if (r12 != 0) goto L_0x0206
            com.tencent.mm.ui.chatting.component.FootComponent r12 = r10.f215539e
            ck3.b r12 = r12.f215752d
            java.lang.String r12 = r12.mo91577r()
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85846q5(r12)
            if (r12 != 0) goto L_0x0206
            com.tencent.mm.ui.chatting.component.FootComponent r12 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r12 = r12.f215510e
            boolean r12 = r12.mo100444p0()
            if (r12 != 0) goto L_0x0206
            com.tencent.mm.ui.chatting.component.FootComponent r12 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r12 = r12.f215510e
            com.tencent.mm.pluginsdk.ui.chat.l1 r13 = r12.f211772J
            if (r13 == 0) goto L_0x0206
            android.widget.Button r14 = r12.f211905n
            if (r14 == 0) goto L_0x0206
            com.tencent.mm.pluginsdk.ui.chat.y1 r13 = (com.tencent.p014mm.pluginsdk.p133ui.chat.C72843y1) r13
            r13.f212286j = r1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r12 = r12.f211826V1
            java.lang.String r12 = r12.mo100532b()
            r13.mo100682a(r11, r12)
        L_0x0206:
            com.tencent.mm.ui.chatting.component.FootComponent r12 = r10.f215539e
            ck3.b r12 = r12.f215752d
            java.lang.String r12 = r12.mo91577r()
            boolean r12 = com.tencent.p014mm.storage.C72996z1.m85820U5(r12)
            if (r12 == 0) goto L_0x022f
            com.tencent.mm.ui.chatting.component.FootComponent r12 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r12 = r12.f215510e
            boolean r12 = r12.mo100446q0()
            if (r12 != 0) goto L_0x022f
            com.tencent.mm.ui.chatting.component.FootComponent r12 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r12 = r12.f215510e
            boolean r12 = r12.mo100444p0()
            if (r12 != 0) goto L_0x022f
            com.tencent.mm.ui.chatting.component.FootComponent r12 = r10.f215539e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r12 = r12.f215510e
            r12.mo100504y(r11)
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.FootComponent$$k.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
