package yw2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72979k3;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72996z1;
import dg0.C75398e;
import di3.C86312j;
import eb0.C97625j3;
import fd0.C75743h;
import hg0.C76166a;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;

/* renamed from: yw2.a */
public class C79153a implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public Context f232424d;

    /* renamed from: e */
    public C79154b f232425e;

    /* renamed from: f */
    public boolean f232426f;

    public C79153a(Context context, C79154b bVar, boolean z) {
        this.f232424d = context;
        this.f232425e = bVar;
        this.f232426f = z;
    }

    /* renamed from: a */
    public static void m95830a(Context context, C72979k3 k3Var, String str, boolean z) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.FConversationOnItemClickListener", "dealOnClick fail, talker is null");
            return;
        }
        Log.m105918d("MicroMsg.FConversationOnItemClickListener", "dealOnClick, talker = " + str);
        C75743h.vx0().mo101168TE(str);
        C72985m3 Ow = C75743h.wx0().mo101187Ow(str);
        boolean z2 = false;
        if (Ow != null && Ow.field_isSend == 1 && Ow.field_type == 1) {
            z2 = true;
        } else {
            Ow = C75743h.wx0().mo101190bD(str);
        }
        if (Ow == null) {
            Log.m105920e("MicroMsg.FConversationOnItemClickListener", "onItemClick, lastRecvFmsg is null, talker = " + str);
            return;
        }
        Log.m105924i("MicroMsg.FConversationOnItemClickListener", "isforceHideReply = " + z2);
        if (Ow.field_type == 0) {
            Class cls = C11502f.class;
            C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(Ow.field_msgContent);
            if (Rv0.f212675a.length() > 0) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("Contact_ShowFMessageList", true);
                bundle.putInt("Contact_Source_FMessage", Rv0.f212681g);
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(Rv0.f212675a);
                if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                    ((C11502f) C86312j.m106911c(cls)).mo11461Sr().yu0(context, z1Var, Rv0, true, true, bundle, "");
                } else if (Rv0.f212684j > 0) {
                    if (Util.isNullOrNil(Rv0.f212686l) && Util.isNullOrNil(Rv0.f212685k) && !Util.isNullOrNil(Rv0.f212676b)) {
                        bundle.putString("Contact_QQNick", Rv0.f212676b);
                    }
                    ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93141J8(context, Rv0, true, true, bundle);
                } else if (!Util.isNullOrNil(Rv0.f212682h) || !Util.isNullOrNil(Rv0.f212683i)) {
                    C76166a b = C75398e.vx0().mo106402b(Rv0.f212682h);
                    if ((b == null || b.mo106385e() == null || b.mo106385e().length() <= 0) && ((b = C75398e.vx0().mo106402b(Rv0.f212683i)) == null || b.mo106385e() == null || b.mo106385e().length() <= 0)) {
                        if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                            ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93141J8(context, Rv0, true, true, bundle);
                        } else {
                            ((C11502f) C86312j.m106911c(cls)).mo11461Sr().yu0(context, z1Var, Rv0, true, true, bundle, "");
                        }
                        Log.m105920e("MicroMsg.FConversationOnItemClickListener", "error : this is not the mobile contact, MD5 = " + Rv0.f212682h + " fullMD5:" + Rv0.f212683i);
                        return;
                    }
                    if (b.mo106389i() == null || b.mo106389i().length() <= 0) {
                        b.f223120h = Rv0.f212675a;
                        b.f223112O = 128;
                        if (C75398e.vx0().mo106403d(b.mo106385e(), b) == -1) {
                            Log.m105920e("MicroMsg.FConversationOnItemClickListener", "update mobile contact username failed");
                            return;
                        }
                    }
                    ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93141J8(context, Rv0, true, true, bundle);
                } else {
                    ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93141J8(context, Rv0, true, true, bundle);
                }
            }
        } else {
            m95831b(context, k3Var, Ow, z, z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03bc  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m95831b(android.content.Context r18, com.tencent.p014mm.storage.C72979k3 r19, com.tencent.p014mm.storage.C72985m3 r20, boolean r21, boolean r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.Class<lc3.b> r3 = lc3.C10485b.class
            java.lang.String r4 = r2.field_msgContent
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "dealClickVerifyMsgEvent : "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.FConversationOnItemClickListener"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r5)
            if (r4 == 0) goto L_0x03ca
            int r5 = r4.length()
            if (r5 > 0) goto L_0x002a
            goto L_0x03ca
        L_0x002a:
            eb0.c r5 = eb0.C97625j3.m125812b()
            g62.l r5 = r5.mo105911z()
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            com.tencent.mm.storage.f4$h r4 = r5.ly0(r4)
            java.lang.String r5 = r4.mo101039f()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x03ca
            java.lang.String r5 = r4.mo101039f()
            int r5 = r5.length()
            r7 = 0
            r8 = 1
            if (r5 <= 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            junit.framework.Assert.assertTrue(r5)
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r5 = r5.mo105907v()
            java.lang.String r9 = r4.mo101039f()
            com.tencent.mm.storage.z1 r5 = r5.get(r9)
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            r10 = r21
            if (r10 != r8) goto L_0x0072
            java.lang.String r10 = "Accept_NewFriend_FromOutside"
            r9.putExtra(r10, r8)
        L_0x0072:
            java.lang.String r10 = "Contact_ShowUserName"
            r9.putExtra(r10, r7)
            java.lang.String r10 = "Contact_ShowFMessageList"
            r9.putExtra(r10, r8)
            int r10 = r4.mo101049p()
            java.lang.String r11 = "Contact_Scene"
            r9.putExtra(r11, r10)
            java.lang.String r10 = r4.mo101054u()
            java.lang.String r12 = "Verify_ticket"
            r9.putExtra(r12, r10)
            int r10 = r4.mo101049p()
            java.lang.String r12 = "Contact_Source_FMessage"
            r9.putExtra(r12, r10)
            int r10 = r2.field_isSend
            java.lang.String r12 = "Contact_Conversation_IsSelfSendAdd"
            r13 = 2
            if (r10 != r8) goto L_0x00a2
            int r10 = r2.field_type
            if (r10 == r8) goto L_0x00b5
        L_0x00a2:
            boolean r10 = r20.mo101179l2()
            r14 = 3
            if (r10 == 0) goto L_0x00ad
            int r10 = r2.field_type
            if (r10 == r14) goto L_0x00b5
        L_0x00ad:
            int r10 = r2.field_isSend
            if (r10 != r8) goto L_0x00b9
            int r15 = r2.field_type
            if (r15 != r13) goto L_0x00b9
        L_0x00b5:
            r9.putExtra(r12, r8)
            goto L_0x00d6
        L_0x00b9:
            if (r10 != r8) goto L_0x00bf
            int r10 = r2.field_type
            if (r10 == r14) goto L_0x00d3
        L_0x00bf:
            boolean r10 = r20.mo101179l2()
            if (r10 == 0) goto L_0x00c9
            int r10 = r2.field_type
            if (r10 == r8) goto L_0x00d3
        L_0x00c9:
            boolean r10 = r20.mo101179l2()
            if (r10 == 0) goto L_0x00d6
            int r10 = r2.field_type
            if (r10 != r13) goto L_0x00d6
        L_0x00d3:
            r9.putExtra(r12, r7)
        L_0x00d6:
            r14 = 1000(0x3e8, double:4.94E-321)
            r10 = 259200(0x3f480, float:3.63217E-40)
            java.lang.String r12 = "VerifyUserTicketTimeExceed"
            java.lang.String r7 = "dealVerifyMsg is openim need hide reply."
            if (r1 == 0) goto L_0x0140
            boolean r16 = r5.mo62927s3()
            if (r16 != 0) goto L_0x0140
            k40.a r16 = f40.C86709a0.m107533q(r3)
            lc3.b r16 = (lc3.C10485b) r16
            pj.f r8 = r16.vh0()
            int r8 = r8.mo107404b(r12, r10)
            r21 = r11
            long r10 = (long) r8
            long r10 = r10 * r14
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r14 = "expired time , defaultExpireTime = "
            r8.append(r14)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            int r8 = r1.field_state
            if (r8 == 0) goto L_0x0119
            if (r8 != r13) goto L_0x0115
            goto L_0x0119
        L_0x0115:
            r8 = r3
            r17 = r4
            goto L_0x0129
        L_0x0119:
            long r14 = eb0.C31543z5.m39454d()
            r8 = r3
            r17 = r4
            long r3 = r1.field_lastModifiedTime
            long r14 = r14 - r3
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x0129
            r3 = 1
            goto L_0x012a
        L_0x0129:
            r3 = 0
        L_0x012a:
            java.lang.String r4 = r5.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
            if (r4 == 0) goto L_0x0145
            if (r3 == 0) goto L_0x0145
            java.lang.String r3 = "Contact_Conversation_IsExpireTimeAndOpenIm"
            r4 = 1
            r9.putExtra(r3, r4)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            goto L_0x0145
        L_0x0140:
            r8 = r3
            r17 = r4
            r21 = r11
        L_0x0145:
            java.lang.String r3 = r5.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            if (r3 == 0) goto L_0x0154
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            r3 = 1
            goto L_0x0156
        L_0x0154:
            r3 = r22
        L_0x0156:
            java.lang.String r4 = "Contact_Conversation_IsFromNewFriendToProfile"
            r7 = 1
            r9.putExtra(r4, r7)
            java.lang.String r4 = "Contact_Conversation_IsForceHideReplyBtn"
            r9.putExtra(r4, r3)
            int r3 = r5.mo62907i3()
            java.lang.String r4 = "Contact_KSnsBgUrl"
            java.lang.String r7 = "Contact_Mobile_MD5"
            java.lang.String r10 = "Contact_User"
            java.lang.String r11 = "Contact_Conversation_IsContact"
            if (r3 <= 0) goto L_0x0196
            boolean r3 = r5.mo62927s3()
            if (r3 == 0) goto L_0x0196
            java.lang.String r2 = r5.getUsername()
            r9.putExtra(r10, r2)
            java.lang.Class<om.f> r2 = p214om.C11502f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            om.f r2 = (p214om.C11502f) r2
            wc3.y r2 = r2.mo11461Sr()
            java.lang.String r3 = r5.getUsername()
            r2.Wa0(r9, r3)
            r3 = 1
            r9.putExtra(r11, r3)
            r14 = 0
            goto L_0x0229
        L_0x0196:
            r3 = 1
            int r14 = r2.field_type
            java.lang.String r15 = "User_Verify"
            if (r14 != r13) goto L_0x01a8
            boolean r14 = r20.mo101179l2()
            if (r14 == 0) goto L_0x01a8
            r9.putExtra(r15, r3)
            r14 = 1
            goto L_0x01a9
        L_0x01a8:
            r14 = 0
        L_0x01a9:
            int r13 = r2.field_type
            if (r13 != r3) goto L_0x01b9
            boolean r2 = r20.mo101179l2()
            if (r2 == 0) goto L_0x01b9
            r9.putExtra(r15, r3)
            r2 = 0
            r14 = 1
            goto L_0x01ba
        L_0x01b9:
            r2 = 0
        L_0x01ba:
            r9.putExtra(r11, r2)
            java.lang.String r2 = r17.mo101039f()
            r9.putExtra(r10, r2)
            java.lang.String r2 = r17.mo101034a()
            java.lang.String r3 = "Contact_Alias"
            r9.putExtra(r3, r2)
            java.lang.String r2 = r17.mo101042i()
            java.lang.String r3 = "Contact_Nick"
            r9.putExtra(r3, r2)
            java.lang.String r2 = r17.mo101048o()
            java.lang.String r3 = "Contact_QuanPin"
            r9.putExtra(r3, r2)
            java.lang.String r2 = r17.mo101045l()
            java.lang.String r3 = "Contact_PyInitial"
            r9.putExtra(r3, r2)
            int r2 = r17.mo101050q()
            java.lang.String r3 = "Contact_Sex"
            r9.putExtra(r3, r2)
            java.lang.String r2 = r17.mo101051r()
            java.lang.String r3 = "Contact_Signature"
            r9.putExtra(r3, r2)
            java.lang.String r2 = "Contact_FMessageCard"
            r3 = 1
            r9.putExtra(r2, r3)
            java.lang.String r2 = r17.mo101036c()
            java.lang.String r3 = "Contact_City"
            r9.putExtra(r3, r2)
            java.lang.String r2 = r17.mo101044k()
            java.lang.String r3 = "Contact_Province"
            r9.putExtra(r3, r2)
            java.lang.String r2 = r17.mo101043j()
            r9.putExtra(r7, r2)
            java.lang.String r2 = r17.mo101040g()
            java.lang.String r3 = "Contact_full_Mobile_MD5"
            r9.putExtra(r3, r2)
            java.lang.String r2 = r17.mo101052s()
            r9.putExtra(r4, r2)
        L_0x0229:
            java.lang.String r2 = r17.mo101037d()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            int r3 = r3.length()
            if (r3 > 0) goto L_0x0251
            int r2 = r17.mo101049p()
            r3 = 18
            if (r2 == r3) goto L_0x024a
            switch(r2) {
                case 22: goto L_0x024a;
                case 23: goto L_0x024a;
                case 24: goto L_0x024a;
                case 25: goto L_0x024a;
                case 26: goto L_0x024a;
                case 27: goto L_0x024a;
                case 28: goto L_0x024a;
                case 29: goto L_0x024a;
                default: goto L_0x0242;
            }
        L_0x0242:
            r2 = 2131823471(0x7f110b6f, float:1.9279743E38)
            java.lang.String r2 = r0.getString(r2)
            goto L_0x0251
        L_0x024a:
            r2 = 2131823475(0x7f110b73, float:1.927975E38)
            java.lang.String r2 = r0.getString(r2)
        L_0x0251:
            java.lang.String r3 = "Contact_Content"
            r9.putExtra(r3, r2)
            r2 = r17
            int r3 = r2.f212732C
            r10 = 1
            if (r3 != r10) goto L_0x026c
            java.lang.String r3 = r2.f212734E
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x026c
            java.lang.String r3 = r2.f212734E
            java.lang.String r10 = "Safety_Warning_Detail"
            r9.putExtra(r10, r3)
        L_0x026c:
            int r3 = r2.mo101049p()
            java.lang.String r10 = "Contact_verify_Scene"
            r9.putExtra(r10, r3)
            int r3 = r2.mo101049p()
            r10 = 14
            if (r3 == r10) goto L_0x0285
            int r3 = r2.mo101049p()
            r10 = 8
            if (r3 != r10) goto L_0x02b0
        L_0x0285:
            java.lang.String r3 = r2.mo101035b()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x02b0
            eb0.c r3 = eb0.C97625j3.m125812b()
            eb0.m2 r3 = r3.mo105902q()
            java.lang.String r10 = r2.mo101035b()
            com.tencent.mm.storage.n1 r3 = (com.tencent.p014mm.storage.C44662n1) r3
            com.tencent.mm.storage.m1 r3 = r3.mo69799Lo(r10)
            if (r3 == 0) goto L_0x02b0
            java.lang.String r10 = r2.mo101039f()
            java.lang.String r3 = r3.mo69789q2(r10)
            java.lang.String r10 = "Contact_RoomNickname"
            r9.putExtra(r10, r3)
        L_0x02b0:
            long r10 = r2.mo101047n()
            java.lang.String r3 = "Contact_Uin"
            r9.putExtra(r3, r10)
            java.lang.String r3 = r2.mo101046m()
            java.lang.String r10 = "Contact_QQNick"
            r9.putExtra(r10, r3)
            java.lang.String r3 = r2.mo101043j()
            r9.putExtra(r7, r3)
            java.lang.String r3 = "User_From_Fmessage"
            r7 = 1
            r9.putExtra(r3, r7)
            r3 = 37
            java.lang.String r7 = "Contact_from_msgType"
            r9.putExtra(r7, r3)
            boolean r3 = r5.mo62927s3()
            if (r3 != 0) goto L_0x02e2
            java.lang.String r3 = "Contact_KSnsIFlag"
            r7 = 0
            r9.putExtra(r3, r7)
        L_0x02e2:
            java.lang.String r3 = r2.mo101052s()
            r9.putExtra(r4, r3)
            java.lang.String r3 = r2.mo101041h()
            java.lang.String r4 = "verify_gmail"
            r9.putExtra(r4, r3)
            java.lang.String r3 = r2.f212730A
            java.lang.String r4 = "source_from_user_name"
            r9.putExtra(r4, r3)
            java.lang.String r3 = r2.f212731B
            java.lang.String r4 = "source_from_nick_name"
            r9.putExtra(r4, r3)
            java.lang.String r3 = r2.f212735F
            java.lang.String r4 = "share_card_username"
            r9.putExtra(r4, r3)
            java.lang.String r3 = r2.f212736G
            java.lang.String r4 = "share_card_nickname"
            r9.putExtra(r4, r3)
            java.lang.String r2 = r2.mo101035b()
            java.lang.String r3 = "room_name"
            r9.putExtra(r3, r2)
            if (r1 == 0) goto L_0x0332
            long r2 = eb0.C31543z5.m39454d()
            long r10 = r1.field_lastModifiedTime
            long r2 = r2 - r10
            r10 = 259200000(0xf731400, double:1.280618154E-315)
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x032c
            r2 = 1
            goto L_0x032d
        L_0x032c:
            r2 = 0
        L_0x032d:
            java.lang.String r3 = "isVerifyExpired"
            r9.putExtra(r3, r2)
        L_0x0332:
            r2 = 7
            java.lang.String r3 = "CONTACT_INFO_UI_SOURCE"
            r9.putExtra(r3, r2)
            java.lang.String r2 = "Contact_ToProfilePageFromSource"
            r3 = 1
            r9.putExtra(r2, r3)
            java.lang.String r2 = r5.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 != 0) goto L_0x0352
            java.lang.String r2 = r5.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85844o5(r2)
            if (r2 == 0) goto L_0x035b
        L_0x0352:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContactNewFriendWeWeCom
            boolean r2 = r2.checkAvailable(r0)
            if (r2 != 0) goto L_0x035b
            return
        L_0x035b:
            k40.a r2 = f40.C86709a0.m107533q(r8)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            r3 = 259200(0x3f480, float:3.63217E-40)
            int r2 = r2.mo107404b(r12, r3)
            long r2 = (long) r2
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "expired time, defaultExpireTime = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            if (r1 == 0) goto L_0x039f
            long r4 = eb0.C31543z5.m39454d()
            long r6 = r1.field_lastModifiedTime
            long r4 = r4 - r6
            java.lang.String r6 = "Contact_Conversation_Isexpired"
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0399
            r4 = 1
            r9.putExtra(r6, r4)
            goto L_0x03a0
        L_0x0399:
            r4 = 1
            r5 = 0
            r9.putExtra(r6, r5)
            goto L_0x03a1
        L_0x039f:
            r4 = 1
        L_0x03a0:
            r5 = 0
        L_0x03a1:
            if (r1 == 0) goto L_0x03c3
            if (r14 == 0) goto L_0x03c3
            int r6 = r1.field_state
            if (r6 == 0) goto L_0x03ac
            r7 = 2
            if (r6 != r7) goto L_0x03b9
        L_0x03ac:
            long r6 = eb0.C31543z5.m39454d()
            long r10 = r1.field_lastModifiedTime
            long r6 = r6 - r10
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x03b9
            r7 = 1
            goto L_0x03ba
        L_0x03b9:
            r7 = 0
        L_0x03ba:
            if (r7 == 0) goto L_0x03c3
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r21
            r9.putExtra(r2, r1)
        L_0x03c3:
            java.lang.String r1 = "profile"
            java.lang.String r2 = ".ui.ContactInfoUI"
            ke3.C88144b.m109790h(r0, r1, r2, r9)
        L_0x03ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C79153a.m95831b(android.content.Context, com.tencent.mm.storage.k3, com.tencent.mm.storage.m3, boolean, boolean):void");
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/friend/FConversationOnItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        if (this.f232426f) {
            i -= 2;
        }
        C72979k3 k3Var = (C72979k3) this.f232425e.getItem(i);
        if (k3Var == null) {
            Log.m105920e("MicroMsg.FConversationOnItemClickListener", "onItemClick, item is null, pos = " + i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FConversationOnItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        m95830a(this.f232424d, k3Var, k3Var.field_talker, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/friend/FConversationOnItemClickListener", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
