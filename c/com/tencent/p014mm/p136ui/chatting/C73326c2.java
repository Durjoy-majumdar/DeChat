package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;

/* renamed from: com.tencent.mm.ui.chatting.c2 */
public class C73326c2 implements View.OnClickListener {

    /* renamed from: d */
    public C67391b f215443d;

    public C73326c2(C67391b bVar) {
        this.f215443d = bVar;
    }

    /* renamed from: a */
    public void mo102139a(Intent intent, C74243t8 t8Var) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r25) {
        /*
            r24 = this;
            r6 = r24
            java.lang.Class<ht1.v1> r7 = ht1.C60208v1.class
            java.lang.Class<ht1.e4> r8 = ht1.C60165e4.class
            java.lang.Class<ht1.k4> r9 = ht1.C60179k4.class
            java.lang.Class<ht1.h5> r10 = ht1.C76246h5.class
            java.lang.Class<zj3.j> r11 = zj3.C79365j.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12 = r25
            r0.add(r12)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarClickListener"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r24
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = r25.getTag()
            com.tencent.mm.ui.chatting.viewitems.t8 r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r0
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarClickListener"
            if (r0 != 0) goto L_0x003e
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x003e:
            java.lang.String r5 = r0.f217968b
            if (r5 == 0) goto L_0x039f
            java.lang.String r12 = ""
            boolean r13 = r5.equals(r12)
            if (r13 == 0) goto L_0x004c
            goto L_0x039f
        L_0x004c:
            ck3.b r13 = r6.f215443d
            java.lang.Class<zj3.e0> r14 = zj3.C79349e0.class
            com.tencent.mm.ui.chatting.manager.a r13 = r13.f193278b
            xi.d r13 = r13.mo102812a(r14)
            zj3.e0 r13 = (zj3.C79349e0) r13
            boolean r13 = r13.mo102241i1()
            java.lang.String r14 = ".ui.ContactInfoUI"
            java.lang.String r15 = "profile"
            r25 = r12
            java.lang.String r12 = "Contact_IsLBSFriend"
            r16 = r0
            java.lang.String r0 = "Contact_User"
            r17 = r10
            r10 = 1
            if (r13 == 0) goto L_0x0090
            ck3.b r7 = r6.f215443d
            android.app.Activity r7 = r7.mo91565f()
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            r8.putExtra(r0, r5)
            java.lang.String r0 = "Contact_Encryptusername"
            r8.putExtra(r0, r10)
            r8.putExtra(r12, r10)
            java.lang.String r0 = "Contact_IsLbsChattingProfile"
            r8.putExtra(r0, r10)
            r0 = 0
            ke3.C88144b.m109791i(r7, r15, r14, r8, r0)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x0090:
            ck3.b r13 = r6.f215443d
            com.tencent.mm.ui.chatting.manager.a r13 = r13.f193278b
            xi.d r13 = r13.mo102812a(r11)
            zj3.j r13 = (zj3.C79365j) r13
            boolean r13 = r13.mo70105e4()
            if (r13 == 0) goto L_0x01e3
            ck3.b r13 = r6.f215443d
            com.tencent.mm.ui.chatting.manager.a r13 = r13.f193278b
            xi.d r13 = r13.mo102812a(r11)
            zj3.j r13 = (zj3.C79365j) r13
            boolean r13 = r13.mo70106j0(r5)
            if (r13 == 0) goto L_0x00b1
            goto L_0x00c8
        L_0x00b1:
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85825X4(r5)
            if (r13 == 0) goto L_0x00c2
            di3.d r13 = di3.C86312j.m106911c(r9)
            ht1.k4 r13 = (ht1.C60179k4) r13
            java.lang.String r13 = r13.mo78770n(r5)
            goto L_0x00cc
        L_0x00c2:
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85821V4(r5)
            if (r13 == 0) goto L_0x00ca
        L_0x00c8:
            r13 = r5
            goto L_0x00cc
        L_0x00ca:
            r13 = r25
        L_0x00cc:
            di3.d r21 = di3.C86312j.m106911c(r8)
            ht1.e4 r21 = (ht1.C60165e4) r21
            r21.mo85141Bd()
            ck3.b r10 = r6.f215443d
            com.tencent.mm.ui.chatting.manager.a r10 = r10.f193278b
            xi.d r10 = r10.mo102812a(r11)
            zj3.j r10 = (zj3.C79365j) r10
            boolean r10 = r10.mo70106j0(r13)
            if (r10 == 0) goto L_0x0141
            java.lang.String r0 = eb0.C75592q0.m90778h()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00f0
            r13 = r5
        L_0x00f0:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r7 = "finder_username"
            r0.putExtra(r7, r13)
            r7 = 10
            java.lang.String r9 = "key_enter_profile_type"
            r0.putExtra(r9, r7)
            di3.d r7 = di3.C86312j.m106911c(r8)
            r14 = r7
            ht1.e4 r14 = (ht1.C60165e4) r14
            ck3.b r7 = r6.f215443d
            android.app.Activity r15 = r7.mo91565f()
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 10
            r22 = 0
            r23 = -1
            r16 = r0
            r14.mo85158TJ(r15, r16, r17, r19, r20, r21, r22, r23)
            java.lang.String r7 = eb0.C75592q0.m90778h()
            boolean r5 = r5.equals(r7)
            java.lang.String r7 = "KEY_FINDER_SELF_FLAG"
            r0.putExtra(r7, r5)
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.t1 r5 = (ht1.C60200t1) r5
            ck3.b r7 = r6.f215443d
            android.app.Activity r7 = r7.mo91565f()
            r5.mo76819V1(r7, r0)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x0141:
            ck3.b r8 = r6.f215443d
            com.tencent.mm.ui.chatting.manager.a r8 = r8.f193278b
            xi.d r8 = r8.mo102812a(r11)
            zj3.j r8 = (zj3.C79365j) r8
            boolean r8 = r8.mo70101X(r13)
            java.lang.String r10 = "SessionId"
            java.lang.String r11 = "Action"
            r21 = r14
            java.lang.String r14 = "IsPoster"
            if (r8 == 0) goto L_0x019b
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            di3.d r5 = di3.C86312j.m106911c(r7)
            ht1.v1 r5 = (ht1.C60208v1) r5
            ht1.m5 r5 = r5.mo78709aq(r13)
            di3.d r7 = di3.C86312j.m106911c(r17)
            ht1.h5 r7 = (ht1.C76246h5) r7
            r7.mo80016hk(r5, r0)
            di3.d r5 = di3.C86312j.m106911c(r9)
            ht1.k4 r5 = (ht1.C60179k4) r5
            r8 = 3
            java.lang.String r5 = r5.ds0(r13, r8)
            r7 = 1
            r0.putExtra(r14, r7)
            r0.putExtra(r11, r7)
            r0.putExtra(r10, r5)
            di3.d r5 = di3.C86312j.m106911c(r17)
            ht1.h5 r5 = (ht1.C76246h5) r5
            ck3.b r7 = r6.f215443d
            android.app.Activity r7 = r7.mo91565f()
            r8 = 0
            r9 = 2
            r5.mo80017zR(r7, r0, r9, r8)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x019b:
            r8 = 3
            boolean r20 = com.tencent.p014mm.storage.C72996z1.m85821V4(r5)
            if (r20 == 0) goto L_0x01e6
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            di3.d r5 = di3.C86312j.m106911c(r7)
            ht1.v1 r5 = (ht1.C60208v1) r5
            ht1.m5 r5 = r5.mo78716qg(r13)
            di3.d r7 = di3.C86312j.m106911c(r17)
            ht1.h5 r7 = (ht1.C76246h5) r7
            r7.mo80016hk(r5, r0)
            di3.d r5 = di3.C86312j.m106911c(r9)
            ht1.k4 r5 = (ht1.C60179k4) r5
            r7 = 2
            java.lang.String r5 = r5.ds0(r13, r7)
            r8 = 1
            r0.putExtra(r14, r8)
            r0.putExtra(r11, r8)
            r0.putExtra(r10, r5)
            di3.d r5 = di3.C86312j.m106911c(r17)
            ht1.h5 r5 = (ht1.C76246h5) r5
            ck3.b r8 = r6.f215443d
            android.app.Activity r8 = r8.mo91565f()
            r9 = 0
            r5.mo80017zR(r8, r0, r7, r9)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x01e3:
            r21 = r14
            r8 = 3
        L_0x01e6:
            ck3.b r7 = r6.f215443d
            java.lang.Class<zj3.q> r9 = zj3.C79377q.class
            com.tencent.mm.ui.chatting.manager.a r7 = r7.f193278b
            xi.d r7 = r7.mo102812a(r9)
            zj3.q r7 = (zj3.C79377q) r7
            boolean r7 = r7.mo70131k2()
            if (r7 == 0) goto L_0x020d
            java.lang.Class<qy2.u> r0 = qy2.C47902u.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qy2.u r0 = (qy2.C47902u) r0
            ck3.b r7 = r6.f215443d
            android.app.Activity r7 = r7.mo91565f()
            r0.mo72657is(r7, r5)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x020d:
            ck3.b r7 = r6.f215443d
            java.lang.Class<zj3.k> r9 = zj3.C79366k.class
            com.tencent.mm.ui.chatting.manager.a r7 = r7.f193278b
            xi.d r7 = r7.mo102812a(r9)
            zj3.k r7 = (zj3.C79366k) r7
            boolean r7 = r7.mo70129g1()
            if (r7 == 0) goto L_0x0235
            java.lang.Class<wy1.c> r0 = wy1.C53221c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wy1.c r0 = (wy1.C53221c) r0
            ck3.b r7 = r6.f215443d
            android.app.Activity r7 = r7.mo91565f()
            r9 = 2
            r0.mo73894KV(r7, r5, r9)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x0235:
            r9 = 2
            ck3.b r7 = r6.f215443d
            java.lang.Class<zj3.e> r10 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r7 = r7.f193278b
            xi.d r7 = r7.mo102812a(r10)
            zj3.e r7 = (zj3.C79348e) r7
            boolean r10 = r7.mo70071q1()
            r11 = 0
            if (r10 == 0) goto L_0x02ae
            sb0.c r0 = r7.mo70076s5()
            sb0.j r0 = r0.mo73034m2(r5)
            if (r0 == 0) goto L_0x02aa
            java.lang.String r5 = r0.field_profileUrl
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x026f
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)
            r0[r11] = r5
            java.lang.String r5 = "MicroMsg.ChattingListAvatarListener"
            java.lang.String r7 = "onClick userInfo == null:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r7, r0)
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x026f:
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r5 = r0.field_profileUrl
            r7[r11] = r5
            java.lang.String r5 = "MicroMsg.ChattingListAvatarListener"
            java.lang.String r8 = "onClick Url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r7)
            sb0.h r5 = rb0.C48009v0.yx0()
            java.lang.String r7 = r0.field_userId
            java.lang.String r8 = r0.field_brandUserName
            r5.mo73064j(r7, r8)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r0 = r0.field_profileUrl
            java.lang.String r7 = "rawUrl"
            r5.putExtra(r7, r0)
            java.lang.String r0 = "useJs"
            r7 = 1
            r5.putExtra(r0, r7)
            ck3.b r0 = r6.f215443d
            android.app.Activity r0 = r0.mo91565f()
            java.lang.String r7 = "webview"
            java.lang.String r8 = ".ui.tools.WebViewUI"
            r9 = 0
            ke3.C88144b.m109791i(r0, r7, r8, r5, r9)
        L_0x02aa:
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x02ae:
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            r10.putExtra(r0, r5)
            r0 = r16
            r6.mo102139a(r10, r0)
            eb0.c r13 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r13 = r13.mo105907v()
            com.tencent.mm.storage.z1 r13 = r13.get(r5)
            if (r13 == 0) goto L_0x02d7
            long r8 = r13.f108320R1
            int r9 = (int) r8
            if (r9 <= 0) goto L_0x02d7
            boolean r8 = r13.mo62927s3()
            if (r8 == 0) goto L_0x02d7
            com.tencent.p014mm.p136ui.contact.C74584x.m89302e(r10, r5)
        L_0x02d7:
            ck3.b r8 = r6.f215443d
            java.lang.String r8 = r8.mo91577r()
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r8)
            if (r8 == 0) goto L_0x032f
            eb0.c r8 = eb0.C97625j3.m125812b()
            eb0.m2 r8 = r8.mo105902q()
            ck3.b r9 = r6.f215443d
            java.lang.String r9 = r9.mo91577r()
            com.tencent.mm.storage.n1 r8 = (com.tencent.p014mm.storage.C44662n1) r8
            com.tencent.mm.storage.m1 r8 = r8.mo69801SE(r9)
            java.lang.String r9 = r8.mo69789q2(r5)
            java.lang.String r13 = "Contact_RoomNickname"
            r10.putExtra(r13, r9)
            r9 = 14
            java.lang.String r13 = "Contact_Scene"
            r10.putExtra(r13, r9)
            ck3.b r9 = r6.f215443d
            java.lang.String r9 = r9.mo91577r()
            java.lang.String r13 = "Contact_ChatRoomId"
            r10.putExtra(r13, r9)
            ck3.b r9 = r6.f215443d
            java.lang.String r9 = r9.mo91577r()
            java.lang.String r13 = "room_name"
            r10.putExtra(r13, r9)
            java.lang.String r8 = r8.field_roomowner
            if (r8 != 0) goto L_0x0322
            goto L_0x032a
        L_0x0322:
            java.lang.String r9 = eb0.C75592q0.m90789s()
            boolean r11 = r8.equals(r9)
        L_0x032a:
            java.lang.String r8 = "Is_RoomOwner"
            r10.putExtra(r8, r11)
        L_0x032f:
            com.tencent.mm.storage.f4 r8 = r0.f212238a
            if (r8 == 0) goto L_0x034b
            int r8 = r8.getType()
            r9 = 55
            if (r8 == r9) goto L_0x0340
            r9 = 57
            if (r8 == r9) goto L_0x0340
            goto L_0x034b
        L_0x0340:
            r8 = 34
            java.lang.String r9 = "Contact_Scene"
            r10.putExtra(r9, r8)
            r8 = 1
            r10.putExtra(r12, r8)
        L_0x034b:
            ck3.b r8 = r6.f215443d
            boolean r0 = r7.mo70072r1(r8, r0)
            if (r0 == 0) goto L_0x0357
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x0357:
            ck3.b r0 = r6.f215443d
            boolean r0 = r0.mo91583x()
            if (r0 == 0) goto L_0x0361
            r0 = 3
            goto L_0x0362
        L_0x0361:
            r0 = 2
        L_0x0362:
            java.lang.String r7 = "CONTACT_INFO_UI_SOURCE"
            r10.putExtra(r7, r0)
            ck3.b r0 = r6.f215443d
            android.app.Activity r0 = r0.mo91565f()
            r7 = 213(0xd5, float:2.98E-43)
            r8 = r21
            ke3.C88144b.m109795m(r0, r15, r8, r10, r7)
            ck3.b r0 = r6.f215443d
            boolean r0 = r0.mo91583x()
            if (r0 == 0) goto L_0x039b
            ck3.b r0 = r6.f215443d
            java.lang.Class<zj3.g> r7 = zj3.C79357g.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r7)
            zj3.g r0 = (zj3.C79357g) r0
            boolean r0 = r0.mo102161o4()
            if (r0 == 0) goto L_0x039b
            java.lang.Class<yy.k> r0 = p773yy.C79168k.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            yy.k r0 = (p773yy.C79168k) r0
            r7 = 5
            r0.mo74109HD(r5, r7)
        L_0x039b:
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        L_0x039f:
            j20.C117292a.m165361g(r6, r4, r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73326c2.onClick(android.view.View):void");
    }
}
