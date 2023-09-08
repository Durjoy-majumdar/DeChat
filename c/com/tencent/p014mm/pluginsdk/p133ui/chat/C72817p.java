package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.p */
public class C72817p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212212d;

    public C72817p(ChatFooter chatFooter) {
        this.f212212d = chatFooter;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.Class<zj3.f1> r0 = zj3.C79353f1.class
            monitor-enter(r9)
            java.lang.String r1 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$17"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x01e8 }
            r5.<init>()     // Catch:{ all -> 0x01e8 }
            r5.add(r10)     // Catch:{ all -> 0x01e8 }
            java.lang.Object[] r6 = r5.toArray()     // Catch:{ all -> 0x01e8 }
            r5.clear()     // Catch:{ all -> 0x01e8 }
            r5 = r9
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.widget.cedit.api.a r10 = r10.f211888j     // Catch:{ all -> 0x01e8 }
            android.text.Editable r10 = r10.getText()     // Catch:{ all -> 0x01e8 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x01e8 }
            int r1 = com.tencent.p014mm.p136ui.widget.cedit.api.MMFlexEditText.f220522p     // Catch:{ all -> 0x01e8 }
            r1 = 8203(0x200b, float:1.1495E-41)
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x01e8 }
            java.lang.String r2 = ""
            java.lang.String r10 = r10.replaceAll(r1, r2)     // Catch:{ all -> 0x01e8 }
            java.lang.String r1 = "MicroMsg.ChatFooter"
            java.lang.String r2 = "send msg onClick"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x01e8 }
            java.lang.String r1 = r10.trim()     // Catch:{ all -> 0x01e8 }
            int r1 = r1.length()     // Catch:{ all -> 0x01e8 }
            r2 = 1
            if (r1 != 0) goto L_0x0078
            int r1 = r10.length()     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x0078
            java.lang.String r1 = "MicroMsg.ChatFooter"
            java.lang.String r3 = "empty message cant be sent"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r3)     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            qo3.g r1 = r1.f211968z     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x0064
            boolean r1 = r1.isShowing()     // Catch:{ all -> 0x01e8 }
            if (r1 != 0) goto L_0x0179
        L_0x0064:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            android.content.Context r3 = r1.getContext()     // Catch:{ all -> 0x01e8 }
            r4 = 2131823450(0x7f110b5a, float:1.92797E38)
            r5 = 2131821704(0x7f110488, float:1.9276159E38)
            qo3.g r3 = nj3.C76879j.m92738i(r3, r4, r5)     // Catch:{ all -> 0x01e8 }
            r1.f211968z = r3     // Catch:{ all -> 0x01e8 }
            goto L_0x0179
        L_0x0078:
            com.tencent.p014mm.pluginsdk.p133ui.tools.C72922q.m85518a()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            r3 = 0
            r1.f211809S = r3     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.widget.cedit.api.a r1 = r1.f211888j     // Catch:{ all -> 0x01e8 }
            android.text.Editable r1 = r1.getText()     // Catch:{ all -> 0x01e8 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.widget.cedit.api.a r4 = r4.f211888j     // Catch:{ all -> 0x01e8 }
            java.lang.CharSequence r4 = r4.getPasterContent()     // Catch:{ all -> 0x01e8 }
            boolean r1 = android.text.TextUtils.equals(r1, r4)     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x00a4
            java.lang.String r1 = "MicroMsg.ChatFooter"
            java.lang.String r4 = "paste clip board to send"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            r1.f211809S = r2     // Catch:{ all -> 0x01e8 }
        L_0x00a4:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.widget.cedit.api.a r4 = r1.f211888j     // Catch:{ all -> 0x01e8 }
            boolean r4 = r4.getSimilarPasteChange()     // Catch:{ all -> 0x01e8 }
            r1.f211814T = r4     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.widget.cedit.api.a r4 = r1.f211888j     // Catch:{ all -> 0x01e8 }
            java.lang.String r4 = r4.getSimilarPasteSeqStr()     // Catch:{ all -> 0x01e8 }
            r1.f211824V = r4     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.widget.cedit.api.a r4 = r1.f211888j     // Catch:{ all -> 0x01e8 }
            android.text.Editable r4 = r4.getText()     // Catch:{ all -> 0x01e8 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.ClipboardHelper.isCopyFromWX(r4)     // Catch:{ all -> 0x01e8 }
            r1.f211819U = r4     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.widget.cedit.api.a r1 = r1.f211888j     // Catch:{ all -> 0x01e8 }
            r1.mo104453p()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            yz1.x r1 = r1.f211776K     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x00e1
            nj3.s0 r1 = r1.f232520e     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x00dc
            boolean r1 = r1.isShowing()     // Catch:{ all -> 0x01e8 }
            goto L_0x00dd
        L_0x00dc:
            r1 = 0
        L_0x00dd:
            if (r1 == 0) goto L_0x00e1
            r1 = 1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            int r4 = r10.length()     // Catch:{ all -> 0x01e8 }
            if (r4 <= 0) goto L_0x0123
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.s0 r5 = r4.f211780L     // Catch:{ all -> 0x01e8 }
            if (r5 == 0) goto L_0x0123
            r4.setDelaySendAnim(r2)     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.widget.cedit.api.a r4 = r4.f211888j     // Catch:{ all -> 0x01e8 }
            cj3.b r4 = r4.getSizeAnimController()     // Catch:{ all -> 0x01e8 }
            r4.pause()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r4 = r4.f211826V1     // Catch:{ all -> 0x01e8 }
            if (r4 == 0) goto L_0x011e
            ck3.b r4 = r4.mo100531a()     // Catch:{ all -> 0x01e8 }
            if (r4 == 0) goto L_0x011e
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r4 = r4.f211826V1     // Catch:{ all -> 0x01e8 }
            ck3.b r4 = r4.mo100531a()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.chatting.manager.a r4 = r4.f193278b     // Catch:{ all -> 0x01e8 }
            xi.d r4 = r4.mo102812a(r0)     // Catch:{ all -> 0x01e8 }
            zj3.f1 r4 = (zj3.C79353f1) r4     // Catch:{ all -> 0x01e8 }
            cj3.c r4 = r4.getSizeAnimController()     // Catch:{ all -> 0x01e8 }
            r4.f193265d = r2     // Catch:{ all -> 0x01e8 }
        L_0x011e:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            r4.mo100506z()     // Catch:{ all -> 0x01e8 }
        L_0x0123:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            int r5 = r10.length()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.autogen.mmdata.rpt.AndroidChatInputStruct r6 = r4.f211785M1     // Catch:{ all -> 0x01e8 }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x01e8 }
            r6.f194124f = r7     // Catch:{ all -> 0x01e8 }
            long r7 = (long) r5     // Catch:{ all -> 0x01e8 }
            r6.f194126h = r7     // Catch:{ all -> 0x01e8 }
            r6.mo86054n()     // Catch:{ all -> 0x01e8 }
            r4.mo100346D0()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            boolean r4 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85251e(r4, r10)     // Catch:{ all -> 0x01e8 }
            if (r4 == 0) goto L_0x014b
            java.lang.String r1 = "MicroMsg.ChatFooter"
            java.lang.String r3 = "this is a quote msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x01e8 }
            goto L_0x0179
        L_0x014b:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            boolean r1 = com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85252f(r4, r10, r1)     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x015c
            java.lang.String r1 = "MicroMsg.ChatFooter"
            java.lang.String r3 = "this is a group solitatire msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x01e8 }
            goto L_0x0179
        L_0x015c:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.s0 r1 = r1.f211780L     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x0179
            boolean r1 = r1.mo100658t(r10)     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x0179
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            r1.mo100369P0(r3, r2)     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.widget.cedit.api.a r1 = r1.f211888j     // Catch:{ all -> 0x01e8 }
            r1.clearComposingText()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter.m85253g(r1, r10)     // Catch:{ all -> 0x01e8 }
        L_0x0179:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            r1.mo100400g0()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r3 = r1.f211826V1     // Catch:{ all -> 0x01e8 }
            if (r3 == 0) goto L_0x019d
            ck3.b r3 = r3.mo100531a()     // Catch:{ all -> 0x01e8 }
            if (r3 == 0) goto L_0x019d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r1.f211826V1     // Catch:{ all -> 0x01e8 }
            ck3.b r1 = r1.mo100531a()     // Catch:{ all -> 0x01e8 }
            java.lang.Class<zj3.o0> r3 = zj3.C79374o0.class
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b     // Catch:{ all -> 0x01e8 }
            xi.d r1 = r1.mo102812a(r3)     // Catch:{ all -> 0x01e8 }
            zj3.o0 r1 = (zj3.C79374o0) r1     // Catch:{ all -> 0x01e8 }
            r1.mo102667f()     // Catch:{ all -> 0x01e8 }
        L_0x019d:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r1.f211826V1     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x01db
            ck3.b r1 = r1.mo100531a()     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x01db
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r1.f211826V1     // Catch:{ all -> 0x01e8 }
            ck3.b r1 = r1.mo100531a()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b     // Catch:{ all -> 0x01e8 }
            xi.d r1 = r1.mo102812a(r0)     // Catch:{ all -> 0x01e8 }
            zj3.f1 r1 = (zj3.C79353f1) r1     // Catch:{ all -> 0x01e8 }
            r1.mo102524b5(r10)     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r10 = r9.f212212d     // Catch:{ all -> 0x01e8 }
            boolean r1 = r10.f211851b2     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x01c3
            goto L_0x01db
        L_0x01c3:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$i1 r1 = r10.f211826V1     // Catch:{ all -> 0x01e8 }
            ck3.b r1 = r1.mo100531a()     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b     // Catch:{ all -> 0x01e8 }
            xi.d r0 = r1.mo102812a(r0)     // Catch:{ all -> 0x01e8 }
            zj3.f1 r0 = (zj3.C79353f1) r0     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.pluginsdk.ui.chat.s r1 = new com.tencent.mm.pluginsdk.ui.chat.s     // Catch:{ all -> 0x01e8 }
            r1.<init>(r10)     // Catch:{ all -> 0x01e8 }
            r0.mo102516C2(r1)     // Catch:{ all -> 0x01e8 }
            r10.f211851b2 = r2     // Catch:{ all -> 0x01e8 }
        L_0x01db:
            java.lang.String r10 = "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$17"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r9, r10, r0, r1, r2)     // Catch:{ all -> 0x01e8 }
            monitor-exit(r9)
            return
        L_0x01e8:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.C72817p.onClick(android.view.View):void");
    }
}
