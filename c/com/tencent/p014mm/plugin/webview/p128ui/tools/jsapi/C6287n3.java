package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import rb0.C47964c0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.n3 */
public class C6287n3 implements C47964c0 {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23112d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f23113e;

    public C6287n3(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f23113e = msgHandler;
        this.f23112d = h1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r2 = r2.f127056b.f127083a;
     */
    /* renamed from: c7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7311c7(int r4, ob0.C117747y r5) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = "enterEnterpriseChat:fail"
            if (r4 == 0) goto L_0x000d
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r4 = r3.f23113e
            t83.h1 r5 = r3.f23112d
            r4.mo7210k5(r5, r1, r0)
            return
        L_0x000d:
            sb0.m r5 = (sb0.C13632m) r5
            ob0.c r2 = r5.f38626e
            if (r2 == 0) goto L_0x001c
            ob0.c$d r2 = r2.f127056b
            pe3.a r2 = r2.f127083a
            if (r2 == 0) goto L_0x001c
            te3.m00 r2 = (te3.C50333m00) r2
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            if (r4 >= 0) goto L_0x004a
            if (r2 == 0) goto L_0x0042
            te3.am3 r4 = r2.f137734d
            if (r4 == 0) goto L_0x0042
            java.lang.String r4 = r4.f130639e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0042
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "enterEnterpriseChat:fail_"
            r4.append(r5)
            te3.am3 r5 = r2.f137734d
            java.lang.String r5 = r5.f130639e
            r4.append(r5)
            java.lang.String r1 = r4.toString()
        L_0x0042:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r4 = r3.f23113e
            t83.h1 r5 = r3.f23112d
            r4.mo7210k5(r5, r1, r0)
            return
        L_0x004a:
            java.lang.String r4 = r2.f137735e
            java.lang.String r5 = r5.f38627f
            if (r5 != 0) goto L_0x0058
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r4 = r3.f23113e
            t83.h1 r5 = r3.f23112d
            r4.mo7210k5(r5, r1, r0)
            return
        L_0x0058:
            sb0.d r2 = rb0.C48009v0.Ax0()
            sb0.c r5 = r2.mo73039Lo(r5)
            if (r5 == 0) goto L_0x009d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r2 != 0) goto L_0x009d
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "Chat_User"
            r1.putExtra(r2, r4)
            long r4 = r5.field_bizChatLocalId
            java.lang.String r2 = "key_biz_chat_id"
            r1.putExtra(r2, r4)
            r4 = 1
            java.lang.String r5 = "finish_direct"
            r1.putExtra(r5, r4)
            r5 = 0
            java.lang.String r2 = "key_need_send_video"
            r1.putExtra(r2, r5)
            java.lang.String r5 = "key_is_biz_chat"
            r1.putExtra(r5, r4)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r4 = r3.f23113e
            android.content.Context r4 = r4.f22697d
            java.lang.String r5 = ".ui.chatting.ChattingUI"
            ke3.C88144b.m109801s(r4, r5, r1, r0)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r4 = r3.f23113e
            t83.h1 r5 = r3.f23112d
            java.lang.String r1 = "enterEnterpriseChat:ok"
            r4.mo7210k5(r5, r1, r0)
            goto L_0x00a4
        L_0x009d:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r4 = r3.f23113e
            t83.h1 r5 = r3.f23112d
            r4.mo7210k5(r5, r1, r0)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6287n3.mo7311c7(int, ob0.y):void");
    }
}
