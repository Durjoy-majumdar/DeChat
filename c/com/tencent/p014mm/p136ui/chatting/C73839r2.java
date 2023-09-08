package com.tencent.p014mm.p136ui.chatting;

import ck3.C67391b;

/* renamed from: com.tencent.mm.ui.chatting.r2 */
public class C73839r2 extends C73684f2 {
    public C73839r2(C67391b bVar) {
        super(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x01a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo57756a(android.view.View r32, ck3.C67391b r33, com.tencent.p014mm.storage.C72963f4 r34) {
        /*
            r31 = this;
            r1 = r33
            r2 = r34
            java.lang.String r3 = "Report 16243 exp %s"
            java.lang.Class<ex0.d> r0 = ex0.C45696d.class
            java.lang.Object r4 = r32.getTag()
            com.tencent.mm.ui.chatting.viewitems.t8 r4 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r4
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r7 = r5 / r7
            int r8 = (int) r7
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r15 = 0
            r9[r15] = r10
            java.lang.String r14 = "MicroMsg.WebViewClickListener"
            java.lang.String r10 = "WebViewClickListener onClick = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r10, r9)
            java.lang.String r9 = r4.f217992z
            android.app.Activity r10 = r33.mo91565f()
            java.lang.String r11 = r33.mo91577r()
            r13 = 0
            boolean r9 = com.tencent.p014mm.p136ui.chatting.C73750m0.m87347a(r9, r10, r13, r11)
            if (r9 == 0) goto L_0x003a
            return
        L_0x003a:
            java.lang.String r9 = r4.f217968b
            java.lang.String r12 = r4.f217974h
            if (r9 == 0) goto L_0x03a6
            java.lang.String r10 = ""
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x004a
            goto L_0x03a6
        L_0x004a:
            android.app.Activity r10 = r33.mo91565f()
            android.content.Intent r10 = r10.getIntent()
            java.lang.String r11 = "uinserve_search_click_id"
            java.lang.String r16 = r10.getStringExtra(r11)
            r10 = 0
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r11 = r1.f193286j
            java.lang.String r7 = "KOpenArticleSceneFromScene"
            r15 = 10000(0x2710, float:1.4013E-41)
            int r11 = r11.getIntExtra(r7, r15)
            r18 = 0
            r19 = -1
            r20 = r12
            r12 = r8
            r13 = r18
            r21 = r14
            r14 = r16
            r16 = r8
            r8 = 0
            r15 = r19
            java.lang.String r9 = com.tencent.p014mm.message.C92721n.m116875c(r9, r10, r11, r12, r13, r14, r15)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            java.lang.String r11 = "rawUrl"
            r10.putExtra(r11, r9)
            java.lang.String r12 = "shortUrl"
            r10.putExtra(r12, r9)
            java.lang.String r12 = "webpageTitle"
            r13 = r20
            r10.putExtra(r12, r13)
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r17 = 4
            if (r2 == 0) goto L_0x01a8
            boolean r19 = r34.mo100992d4()
            if (r19 == 0) goto L_0x00f4
            java.lang.String r15 = r34.getContent()
            java.lang.String r8 = "msg"
            r14 = 0
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r15, r8, r14)
            if (r8 == 0) goto L_0x00f4
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$r r8 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.C73908r.m87630a(r8)
            java.lang.String r15 = r8.f216932c
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x00f4
            java.lang.String r15 = r8.f216932c
            java.lang.String r14 = "KTemplateId"
            r10.putExtra(r14, r15)
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]
            java.lang.String r14 = r8.f216932c
            r20 = 0
            r15[r20] = r14
            java.lang.String r14 = r4.f217972f
            r22 = 1
            r15[r22] = r14
            java.lang.String r14 = "report template msg click action, templateId(%s). srcUsername(%s)"
            r30 = r3
            r3 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r14, r15)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r21 = r11
            r15 = 3
            java.lang.Object[] r11 = new java.lang.Object[r15]
            java.lang.String r8 = r8.f216932c
            r11[r20] = r8
            java.lang.String r8 = r4.f217972f
            r11[r22] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r20)
            r15 = 2
            r11[r15] = r8
            r8 = 11608(0x2d58, float:1.6266E-41)
            r14.mo160131h(r8, r11)
            goto L_0x00fa
        L_0x00f4:
            r30 = r3
            r3 = r21
            r21 = r11
        L_0x00fa:
            eb0.c r8 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r8 = r8.mo105907v()
            java.lang.String r11 = r34.mo108768t()
            com.tencent.mm.storage.z1 r8 = r8.get(r11)
            if (r8 == 0) goto L_0x0129
            boolean r11 = r8.mo62916m3()
            if (r11 == 0) goto L_0x0129
            r11 = 1
            java.lang.Object[] r14 = new java.lang.Object[r11]
            java.lang.String r8 = r8.getUsername()
            r11 = 0
            r14[r11] = r8
            java.lang.String r8 = "hakon click biz msg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r8, r14)
            java.lang.String r8 = "geta8key_scene"
            r11 = 7
            r10.putExtra(r8, r11)
            r8 = 4
            goto L_0x012a
        L_0x0129:
            r8 = 0
        L_0x012a:
            long r14 = r34.getMsgId()
            java.lang.String r11 = "msg_id"
            r10.putExtra(r11, r14)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "msg_"
            r11.append(r14)
            long r22 = r34.mo108774y2()
            java.lang.String r15 = java.lang.Long.toString(r22)
            r11.append(r15)
            java.lang.String r11 = r11.toString()
            java.lang.String r15 = "KPublisherId"
            r10.putExtra(r15, r11)
            java.lang.String r11 = r34.mo108768t()
            java.lang.String r15 = "pre_username"
            r10.putExtra(r15, r11)
            java.lang.Class<zj3.e> r11 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r15 = r1.f193278b
            xi.d r11 = r15.mo102812a(r11)
            zj3.e r11 = (zj3.C79348e) r11
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r14)
            long r22 = r34.mo108774y2()
            java.lang.String r14 = java.lang.Long.toString(r22)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            java.lang.String r15 = "prePublishId"
            r10.putExtra(r15, r14)
            boolean r14 = r4.f217969c
            boolean r11 = r11.mo70071q1()
            java.lang.String r11 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87890t(r2, r14, r11)
            java.lang.String r14 = "preUsername"
            r10.putExtra(r14, r11)
            java.lang.String r11 = r33.mo91577r()
            java.lang.String r14 = "preChatName"
            r10.putExtra(r14, r11)
            int r11 = r4.f217950B
            java.lang.String r14 = "preMsgIndex"
            r10.putExtra(r14, r11)
            android.os.Bundle r11 = r4.f217953E
            if (r11 == 0) goto L_0x01a6
            r10.putExtras(r11)
        L_0x01a6:
            r15 = r8
            goto L_0x01af
        L_0x01a8:
            r30 = r3
            r3 = r21
            r21 = r11
            r15 = 0
        L_0x01af:
            java.lang.String r8 = "snsWebSource"
            r13.putInt(r8, r15)
            java.lang.String r8 = "jsapiargs"
            r10.putExtra(r8, r13)
            java.lang.String r8 = r33.mo91577r()
            java.lang.String r11 = "notifymessage"
            boolean r8 = r11.equals(r8)
            java.lang.String r11 = "geta8key_username"
            if (r8 == 0) goto L_0x01d5
            java.lang.String r8 = r4.f217972f
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x01d5
            java.lang.String r8 = r4.f217972f
            r10.putExtra(r11, r8)
            goto L_0x01dc
        L_0x01d5:
            java.lang.String r8 = r33.mo91577r()
            r10.putExtra(r11, r8)
        L_0x01dc:
            java.lang.String r8 = r4.f217972f
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x01fb
            java.lang.String r8 = r4.f217972f
            java.lang.String r11 = "srcUsername"
            r10.putExtra(r11, r8)
            java.lang.String r8 = r4.f217973g
            java.lang.String r11 = "srcDisplayname"
            r10.putExtra(r11, r8)
            java.lang.String r8 = "mode"
            r11 = 1
            r10.putExtra(r8, r11)
            goto L_0x01fc
        L_0x01fb:
            r11 = 1
        L_0x01fc:
            long r13 = r4.f217949A
            java.lang.String r8 = "message_id"
            r10.putExtra(r8, r13)
            int r8 = r4.f217950B
            java.lang.String r13 = "message_index"
            r10.putExtra(r13, r8)
            java.lang.String r8 = "from_scence"
            r10.putExtra(r8, r11)
            java.lang.String r8 = "start_activity_time"
            r10.putExtra(r8, r5)
            java.lang.String r5 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122318j
            int r6 = r4.f217955G
            r10.putExtra(r5, r6)
            java.lang.String r5 = r4.f217956H
            r10.putExtra(r12, r5)
            java.lang.String r5 = r4.f217957I
            java.lang.String r6 = "thumbUrl"
            r10.putExtra(r6, r5)
            java.lang.String r5 = "key_enable_teen_mode_check"
            r6 = 1
            r10.putExtra(r5, r6)
            java.lang.String r5 = r33.mo91577r()
            com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87881c(r10, r5)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r10.addFlags(r5)
            r27 = 0
            android.app.Activity r5 = r33.mo91565f()
            android.content.Intent r5 = r5.getIntent()
            r6 = 10000(0x2710, float:1.4013E-41)
            int r28 = r5.getIntExtra(r7, r6)
            k40.a r5 = f40.C86709a0.m107533q(r0)
            ex0.d r5 = (ex0.C45696d) r5
            r6 = 2
            boolean r5 = r5.mo70957E5(r6)
            if (r5 == 0) goto L_0x027a
            k40.a r0 = f40.C86709a0.m107533q(r0)
            r22 = r0
            ex0.d r22 = (ex0.C45696d) r22
            android.app.Activity r23 = r33.mo91565f()
            int r0 = r4.f217955G
            r26 = 0
            r24 = r9
            r25 = r0
            r29 = r10
            boolean r0 = r22.Ms0(r23, r24, r25, r26, r27, r28, r29)
            if (r0 == 0) goto L_0x027a
            java.lang.String r0 = "jump to TmplWebview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x028c
        L_0x027a:
            r0 = r21
            r10.putExtra(r0, r9)
            android.app.Activity r0 = r33.mo91565f()
            java.lang.String r5 = "webview"
            java.lang.String r6 = ".ui.tools.WebViewUI"
            r7 = 0
            ke3.C88144b.m109791i(r0, r5, r6, r10, r7)
        L_0x028c:
            java.lang.String r0 = r33.mo91577r()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02d4
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            java.lang.String r5 = r33.mo91577r()
            com.tencent.mm.storage.z1 r0 = r0.get(r5)
            int r0 = r0.f149511R0
            r5 = 1
            if (r0 != r5) goto L_0x02d4
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            java.lang.String r5 = r33.mo91577r()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r0.getClass()
            if (r5 == 0) goto L_0x02cd
            int r6 = r5.length()
            if (r6 > 0) goto L_0x02c5
            goto L_0x02cd
        L_0x02c5:
            com.tencent.mm.storage.h2 r5 = r0.mo69771j(r5)
            r0.mo69764f0(r5)
            goto L_0x02d4
        L_0x02cd:
            java.lang.String r0 = "MicroMsg.ConversationStorage"
            java.lang.String r5 = "setMoveUp conversation failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
        L_0x02d4:
            if (r2 == 0) goto L_0x03a6
            boolean r0 = r34.mo100967F3()
            if (r0 == 0) goto L_0x03a6
            java.lang.Class<gw0.b> r0 = gw0.C76073b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            gw0.b r0 = (gw0.C76073b) r0
            long r5 = r34.getMsgId()
            java.lang.String r7 = r34.getContent()
            s90.f r0 = r0.mo94597JZ(r5, r7)
            if (r0 == 0) goto L_0x03a6
            java.util.LinkedList<s90.j> r5 = r0.f226295i
            if (r5 == 0) goto L_0x03a6
            int r5 = r5.size()
            int r4 = r4.f217950B
            if (r5 > r4) goto L_0x0300
            goto L_0x03a6
        L_0x0300:
            java.util.LinkedList<s90.j> r0 = r0.f226295i
            java.lang.Object r0 = r0.get(r4)
            s90.j r0 = (s90.C77630j) r0
            java.lang.String r4 = r0.f226326e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r5 = 0
            if (r4 != 0) goto L_0x0351
            java.lang.String r0 = r0.f226326e     // Catch:{ UnsupportedOperationException -> 0x0340, Exception -> 0x032f }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ UnsupportedOperationException -> 0x0340, Exception -> 0x032f }
            java.lang.String r4 = "mid"
            java.lang.String r4 = r0.getQueryParameter(r4)     // Catch:{ UnsupportedOperationException -> 0x0340, Exception -> 0x032f }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r5)     // Catch:{ UnsupportedOperationException -> 0x0340, Exception -> 0x032f }
            java.lang.String r4 = "idx"
            java.lang.String r0 = r0.getQueryParameter(r4)     // Catch:{ UnsupportedOperationException -> 0x0340, Exception -> 0x032f }
            r4 = 0
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)     // Catch:{ UnsupportedOperationException -> 0x0340, Exception -> 0x032f }
            r8 = 0
            goto L_0x0353
        L_0x032f:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r8 = 0
            r7[r8] = r0
            r9 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r9, r7)
            goto L_0x0352
        L_0x0340:
            r0 = move-exception
            r9 = r30
            r4 = 1
            r8 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r7[r8] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r9, r7)
            goto L_0x0352
        L_0x0351:
            r8 = 0
        L_0x0352:
            r15 = 0
        L_0x0353:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r1.f193286j
            java.lang.String r3 = "specific_chat_from_scene"
            int r0 = r0.getIntExtra(r3, r8)
            int r3 = com.tencent.p014mm.storage.C19636w0.f55626c
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 16243(0x3f73, float:2.2761E-41)
            r9 = 8
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = r34.mo108768t()
            r9[r8] = r10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 1
            r9[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r6 = 2
            r9[r6] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 3
            r9[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r9[r17] = r0
            r0 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r9[r0] = r3
            r0 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r9[r0] = r3
            int r0 = com.tencent.p014mm.message.C92721n.m116880h()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 7
            r9[r3] = r0
            r4.mo160131h(r7, r9)
            com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87882c0(r33, r34)
        L_0x03a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73839r2.mo57756a(android.view.View, ck3.b, com.tencent.mm.storage.f4):void");
    }
}
