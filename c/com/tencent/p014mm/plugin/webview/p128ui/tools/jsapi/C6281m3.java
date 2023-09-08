package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import rb0.C47964c0;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.m3 */
public class C6281m3 implements C47964c0 {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f23095d;

    /* renamed from: e */
    public final /* synthetic */ String f23096e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f23097f;

    public C6281m3(MsgHandler msgHandler, C13851h1 h1Var, String str) {
        this.f23097f = msgHandler;
        this.f23095d = h1Var;
        this.f23096e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r7 = r7.f127056b.f127083a;
     */
    /* renamed from: c7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7311c7(int r7, ob0.C117747y r8) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = "openEnterpriseChat:fail"
            if (r7 == 0) goto L_0x000d
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r7 = r6.f23097f
            t83.h1 r8 = r6.f23095d
            r7.mo7210k5(r8, r1, r0)
            return
        L_0x000d:
            sb0.t r8 = (sb0.C13633t) r8
            ob0.c r7 = r8.f38630e
            if (r7 == 0) goto L_0x001c
            ob0.c$d r7 = r7.f127056b
            pe3.a r7 = r7.f127083a
            if (r7 == 0) goto L_0x001c
            te3.fi2 r7 = (te3.C49427fi2) r7
            goto L_0x001d
        L_0x001c:
            r7 = r0
        L_0x001d:
            if (r7 == 0) goto L_0x00e5
            te3.am3 r2 = r7.f133516d
            if (r2 == 0) goto L_0x00e5
            int r2 = r2.f130638d
            if (r2 == 0) goto L_0x0029
            goto L_0x00e5
        L_0x0029:
            java.lang.String r2 = r7.f133517e
            java.lang.String r8 = r8.f38631f
            if (r8 != 0) goto L_0x0037
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r7 = r6.f23097f
            t83.h1 r8 = r6.f23095d
            r7.mo7210k5(r8, r1, r0)
            return
        L_0x0037:
            sb0.d r3 = rb0.C48009v0.Ax0()
            sb0.c r8 = r3.mo73039Lo(r8)
            if (r8 == 0) goto L_0x00dd
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x00dd
            java.lang.String r1 = r6.f23096e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            r3 = 1
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = r6.f23096e
            java.lang.String r4 = "long"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0086
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            r1.addFlags(r4)
            java.lang.String r4 = "biz_chat_need_to_jump_to_chatting_ui"
            r1.putExtra(r4, r3)
            java.lang.String r3 = "Main_User"
            r1.putExtra(r3, r2)
            long r2 = r8.field_bizChatLocalId
            java.lang.String r8 = "biz_chat_chat_id"
            r1.putExtra(r8, r2)
            r8 = 8
            java.lang.String r2 = "biz_chat_from_scene"
            r1.putExtra(r2, r8)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r8 = r6.f23097f
            android.content.Context r8 = r8.f22697d
            java.lang.String r2 = ".ui.LauncherUI"
            ke3.C88144b.m109801s(r8, r2, r1, r0)
            goto L_0x00b0
        L_0x0086:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r4 = "Chat_User"
            r1.putExtra(r4, r2)
            long r4 = r8.field_bizChatLocalId
            java.lang.String r8 = "key_biz_chat_id"
            r1.putExtra(r8, r4)
            java.lang.String r8 = "finish_direct"
            r1.putExtra(r8, r3)
            r8 = 0
            java.lang.String r2 = "key_need_send_video"
            r1.putExtra(r2, r8)
            java.lang.String r8 = "key_is_biz_chat"
            r1.putExtra(r8, r3)
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r8 = r6.f23097f
            android.content.Context r8 = r8.f22697d
            java.lang.String r2 = ".ui.chatting.ChattingUI"
            ke3.C88144b.m109801s(r8, r2, r1, r0)
        L_0x00b0:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r0 = r7.f133521i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = r7.f133522j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = r7.f133521i
            java.lang.String r1 = "chat_type"
            r8.put(r1, r0)
            java.lang.String r7 = r7.f133522j
            java.lang.String r0 = "chat_id"
            r8.put(r0, r7)
        L_0x00d3:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r7 = r6.f23097f
            t83.h1 r0 = r6.f23095d
            java.lang.String r1 = "openEnterpriseChat:ok"
            r7.mo7210k5(r0, r1, r8)
            goto L_0x00e4
        L_0x00dd:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r7 = r6.f23097f
            t83.h1 r8 = r6.f23095d
            r7.mo7210k5(r8, r1, r0)
        L_0x00e4:
            return
        L_0x00e5:
            if (r7 == 0) goto L_0x010c
            te3.am3 r8 = r7.f133516d
            if (r8 == 0) goto L_0x010c
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            te3.am3 r0 = r7.f133516d
            int r0 = r0.f130638d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "err_code"
            r8.put(r2, r0)
            te3.am3 r7 = r7.f133516d
            java.lang.String r7 = r7.f130639e
            if (r7 == 0) goto L_0x0104
            r1 = r7
        L_0x0104:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r7 = r6.f23097f
            t83.h1 r0 = r6.f23095d
            r7.mo7210k5(r0, r1, r8)
            goto L_0x0113
        L_0x010c:
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r7 = r6.f23097f
            t83.h1 r8 = r6.f23095d
            r7.mo7210k5(r8, r1, r0)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6281m3.mo7311c7(int, ob0.y):void");
    }
}
