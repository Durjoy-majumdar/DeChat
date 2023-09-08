package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.pluginsdk.model.app.C44561j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$b */
public final /* synthetic */ class MsgHandler$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f22746d;

    /* renamed from: e */
    public final /* synthetic */ C44561j f22747e;

    /* renamed from: f */
    public final /* synthetic */ String f22748f;

    /* renamed from: g */
    public final /* synthetic */ String f22749g;

    /* renamed from: h */
    public final /* synthetic */ String f22750h;

    /* renamed from: i */
    public final /* synthetic */ String f22751i;

    /* renamed from: j */
    public final /* synthetic */ String f22752j;

    /* renamed from: n */
    public final /* synthetic */ String f22753n;

    /* renamed from: o */
    public final /* synthetic */ String f22754o;

    public /* synthetic */ MsgHandler$$b(MsgHandler msgHandler, C44561j jVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f22746d = msgHandler;
        this.f22747e = jVar;
        this.f22748f = str;
        this.f22749g = str2;
        this.f22750h = str3;
        this.f22751i = str4;
        this.f22752j = str5;
        this.f22753n = str6;
        this.f22754o = str7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020a A[Catch:{ Exception -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0287 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r1 = r26
            com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r2 = r1.f22746d
            com.tencent.mm.pluginsdk.model.app.j r0 = r1.f22747e
            java.lang.String r3 = r1.f22748f
            java.lang.String r5 = r1.f22749g
            java.lang.String r4 = r1.f22750h
            java.lang.String r6 = r1.f22751i
            java.lang.String r7 = r1.f22752j
            java.lang.String r8 = r1.f22753n
            java.lang.String r9 = r1.f22754o
            com.tencent.mm.plugin.webview.stub.m r10 = r2.f22717y
            java.lang.String r11 = "_DATA_CENTER_ITEM_SHOW_TYPE"
            java.lang.String r12 = "referUrl"
            java.lang.String r13 = "getA8KeyScene"
            java.lang.String r14 = "preUsername"
            java.lang.String r15 = "prePublishId"
            java.lang.String r1 = "preMsgIndex"
            r16 = r6
            java.lang.String r6 = "preChatName"
            r17 = r7
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r7 = r2.f22699f
            r18 = r9
            java.lang.String r9 = "MicroMsg.MsgHandler"
            if (r7 != 0) goto L_0x0037
            java.lang.String r0 = "doSendAppMsg: but appmsg is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
            goto L_0x02e1
        L_0x0037:
            java.lang.Class<gt.i> r7 = p158gt.C8451i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            gt.i r7 = (p158gt.C8451i) r7
            android.graphics.Bitmap r7 = r7.get(r4)
            if (r7 == 0) goto L_0x006c
            boolean r19 = r7.isRecycled()
            if (r19 != 0) goto L_0x006c
            r19 = r8
            java.lang.String r8 = "thumb image is not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream
            r8.<init>()
            r20 = r4
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
            r21 = r11
            r11 = 100
            r7.compress(r4, r11, r8)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = r2.f22699f
            byte[] r7 = r8.toByteArray()
            r4.thumbData = r7
            goto L_0x0072
        L_0x006c:
            r20 = r4
            r19 = r8
            r21 = r11
        L_0x0072:
            com.tencent.mm.autogen.events.SendAppMsgEvent r4 = new com.tencent.mm.autogen.events.SendAppMsgEvent
            r4.<init>()
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r7 = r4.f9477d
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r8 = r2.f22699f
            r7.f9478a = r8
            r7.f9479b = r3
            java.lang.String r8 = ""
            if (r0 != 0) goto L_0x0085
            r0 = r8
            goto L_0x0087
        L_0x0085:
            java.lang.String r0 = r0.field_appName
        L_0x0087:
            r7.f9480c = r0
            r7.f9481d = r5
            r11 = 2
            r7.f9482e = r11
            r7 = 0
            java.lang.String r8 = r10.getCurrentUrl()     // Catch:{ Exception -> 0x0094 }
            goto L_0x009b
        L_0x0094:
            r0 = move-exception
            r11 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r11, r8, r0)
        L_0x009b:
            com.tencent.mm.plugin.webview.modeltools.a0$b r0 = r2.mo7226s6(r8)
            if (r0 == 0) goto L_0x00ae
            java.lang.String r11 = r0.f22393a
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x00ae
            java.lang.String r11 = r0.f22393a
            java.lang.String r7 = r0.f22394b
            goto L_0x00b2
        L_0x00ae:
            r11 = r16
            r7 = r17
        L_0x00b2:
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            r17 = r3
            r3 = 0
            if (r16 == 0) goto L_0x00c0
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r7 = r4.f9477d
            r7.f9485h = r3
            goto L_0x00c6
        L_0x00c0:
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r3 = r4.f9477d
            r3.f9483f = r11
            r3.f9484g = r7
        L_0x00c6:
            android.os.Bundle r3 = r2.f22704n     // Catch:{ Exception -> 0x023f }
            java.lang.String r7 = "key_snsad_statextstr"
            java.lang.String r3 = r3.getString(r7)     // Catch:{ Exception -> 0x023f }
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r7 = r4.f9477d     // Catch:{ Exception -> 0x023f }
            r7.f9495r = r3     // Catch:{ Exception -> 0x023f }
            java.lang.String r11 = r10.mo7029Ni()     // Catch:{ Exception -> 0x023f }
            r7.f9486i = r11     // Catch:{ Exception -> 0x023f }
            r7 = 18
            r11 = 0
            android.os.Bundle r7 = r10.mo7031V5(r7, r11)     // Catch:{ Exception -> 0x023f }
            if (r7 == 0) goto L_0x0226
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r11 = r4.f9477d     // Catch:{ Exception -> 0x021e }
            r23 = r10
            java.lang.String r10 = "KPublisherId"
            java.lang.String r10 = r7.getString(r10)     // Catch:{ Exception -> 0x021a }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)     // Catch:{ Exception -> 0x021a }
            r11.f9489l = r10     // Catch:{ Exception -> 0x021a }
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r11 = r4.f9477d     // Catch:{ Exception -> 0x021a }
            r24 = r5
            java.lang.String r5 = "KPublisherReqId"
            java.lang.String r5 = r7.getString(r5)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)     // Catch:{ Exception -> 0x0216 }
            r11.f9490m = r5     // Catch:{ Exception -> 0x0216 }
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r5 = r4.f9477d     // Catch:{ Exception -> 0x0216 }
            java.lang.String r11 = "serverMsgID"
            java.lang.String r11 = r7.getString(r11)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x0216 }
            r5.f9491n = r11     // Catch:{ Exception -> 0x0216 }
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r5 = r4.f9477d     // Catch:{ Exception -> 0x0216 }
            java.lang.String r11 = "geta8key_username"
            java.lang.String r11 = r7.getString(r11)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x0216 }
            r5.f9492o = r11     // Catch:{ Exception -> 0x0216 }
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r5 = r4.f9477d     // Catch:{ Exception -> 0x0216 }
            java.lang.String r11 = "sns_local_id"
            java.lang.String r11 = r7.getString(r11)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)     // Catch:{ Exception -> 0x0216 }
            r5.f9493p = r11     // Catch:{ Exception -> 0x0216 }
            java.lang.String r5 = eb0.C86493v0.m107223a(r10)     // Catch:{ Exception -> 0x0216 }
            eb0.v0 r10 = eb0.C86493v0.m107224d()     // Catch:{ Exception -> 0x0216 }
            r11 = 1
            eb0.v0$c r10 = r10.mo120947c(r5, r11)     // Catch:{ Exception -> 0x0216 }
            java.lang.String r11 = "sendAppMsgScene"
            r25 = r9
            r22 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r22)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r11, r9)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r9 = r7.getString(r6)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r6, r9)     // Catch:{ Exception -> 0x0214 }
            int r6 = r7.getInt(r1)     // Catch:{ Exception -> 0x0214 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r1, r6)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r1 = r7.getString(r15)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r15, r1)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r1 = r7.getString(r14)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r14, r1)     // Catch:{ Exception -> 0x0214 }
            int r1 = r7.getInt(r13)     // Catch:{ Exception -> 0x0214 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r13, r1)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r1 = r7.getString(r12)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r12, r1)     // Catch:{ Exception -> 0x0214 }
            r1 = -1
            r6 = r21
            int r7 = r7.getInt(r6, r1)     // Catch:{ Exception -> 0x0214 }
            if (r0 == 0) goto L_0x018b
            int r9 = r0.f22395c     // Catch:{ Exception -> 0x0189 }
            if (r9 < 0) goto L_0x018b
            r7 = r9
            goto L_0x018b
        L_0x0189:
            r0 = move-exception
            goto L_0x01b3
        L_0x018b:
            if (r0 == 0) goto L_0x0198
            boolean r9 = r0.f22401i     // Catch:{ Exception -> 0x0189 }
            if (r9 == 0) goto L_0x0198
            java.lang.String r9 = "_DATA_CENTER_NEED_SHOW_SOURCE_INFO"
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0189 }
            r10.mo120962i(r9, r11)     // Catch:{ Exception -> 0x0189 }
        L_0x0198:
            if (r7 == r1) goto L_0x0202
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r6, r1)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r1 = "_tmpl_webview_transfer_scene"
            r6 = 11
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r1, r6)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r1 = "_DATA_CENTER_IS_PAY_SUBSCRIBE"
            if (r0 == 0) goto L_0x01b7
            int r6 = r0.f22396d     // Catch:{ Exception -> 0x0189 }
            goto L_0x01b8
        L_0x01b3:
            r6 = r20
            goto L_0x0248
        L_0x01b7:
            r6 = 0
        L_0x01b8:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r1, r6)     // Catch:{ Exception -> 0x0214 }
            r1 = 5
            if (r7 == r1) goto L_0x01c6
            r1 = 16
            if (r7 != r1) goto L_0x0202
        L_0x01c6:
            if (r0 == 0) goto L_0x0202
            java.lang.String r1 = "_DATA_CENTER_VID"
            java.lang.String r6 = r0.f22400h     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r1, r6)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r1 = "_DATA_CENTER__DULATION"
            int r6 = r0.f22399g     // Catch:{ Exception -> 0x0214 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0214 }
            r10.mo120962i(r1, r6)     // Catch:{ Exception -> 0x0214 }
            java.lang.String r1 = "_DATA_CENTER_COVER_URL"
            r6 = r20
            r10.mo120962i(r1, r6)     // Catch:{ Exception -> 0x023d }
            java.lang.String r1 = "_DATA_CENTER_VIDEO_WIDTH"
            int r7 = r0.f22397e     // Catch:{ Exception -> 0x023d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x023d }
            r10.mo120962i(r1, r7)     // Catch:{ Exception -> 0x023d }
            java.lang.String r1 = "_DATA_CENTER_VIDEO_HEIGHT"
            int r0 = r0.f22398f     // Catch:{ Exception -> 0x023d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x023d }
            r10.mo120962i(r1, r0)     // Catch:{ Exception -> 0x023d }
            java.lang.String r0 = "_DATA_SHOW_NATIVE_PAGE"
            r1 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x023d }
            r10.mo120962i(r0, r7)     // Catch:{ Exception -> 0x023d }
            goto L_0x0204
        L_0x0202:
            r6 = r20
        L_0x0204:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x023d }
            if (r0 != 0) goto L_0x020f
            java.lang.String r0 = "adExtStr"
            r10.mo120962i(r0, r3)     // Catch:{ Exception -> 0x023d }
        L_0x020f:
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r0 = r4.f9477d     // Catch:{ Exception -> 0x023d }
            r0.f9494q = r5     // Catch:{ Exception -> 0x023d }
            goto L_0x022e
        L_0x0214:
            r0 = move-exception
            goto L_0x01b3
        L_0x0216:
            r0 = move-exception
        L_0x0217:
            r25 = r9
            goto L_0x01b3
        L_0x021a:
            r0 = move-exception
            r24 = r5
            goto L_0x0217
        L_0x021e:
            r0 = move-exception
            r24 = r5
            r25 = r9
            r23 = r10
            goto L_0x01b3
        L_0x0226:
            r24 = r5
            r25 = r9
            r23 = r10
            r6 = r20
        L_0x022e:
            com.tencent.mm.autogen.events.SendAppMsgEvent$a r0 = r4.f9477d     // Catch:{ Exception -> 0x023d }
            r0.f9487j = r8     // Catch:{ Exception -> 0x023d }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c r1 = r2.f22719z     // Catch:{ Exception -> 0x023d }
            java.lang.String r1 = r1.mo7277c(r8)     // Catch:{ Exception -> 0x023d }
            r0.f9488k = r1     // Catch:{ Exception -> 0x023d }
            r1 = r25
            goto L_0x0259
        L_0x023d:
            r0 = move-exception
            goto L_0x0248
        L_0x023f:
            r0 = move-exception
            r24 = r5
            r25 = r9
            r23 = r10
            goto L_0x01b3
        L_0x0248:
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r1 = 0
            r3[r1] = r0
            java.lang.String r0 = "init bunddata failed : %s"
            r1 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r3)
        L_0x0259:
            boolean r0 = r4.publish()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r3 != 0) goto L_0x0281
            com.tencent.mm.autogen.events.SendMsgEvent r3 = new com.tencent.mm.autogen.events.SendMsgEvent
            r3.<init>()
            com.tencent.mm.autogen.events.SendMsgEvent$a r4 = r3.f9496d
            r5 = r24
            r4.f9497a = r5
            r7 = r19
            r4.f9498b = r7
            int r7 = eb0.C45628s0.m50810y(r5)
            r4.f9499c = r7
            com.tencent.mm.autogen.events.SendMsgEvent$a r4 = r3.f9496d
            r7 = 0
            r4.f9500d = r7
            r3.publish()
            goto L_0x0284
        L_0x0281:
            r5 = r24
            r7 = 0
        L_0x0284:
            r9 = 3
            if (r0 == 0) goto L_0x02bd
            if (r23 == 0) goto L_0x02bd
            r0 = 85
            r3 = r23
            r4 = 0
            android.os.Bundle r8 = r3.mo7031V5(r0, r4)     // Catch:{ RemoteException -> 0x02b0 }
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)     // Catch:{ RemoteException -> 0x02b0 }
            if (r0 == 0) goto L_0x029a
            r0 = 2
            goto L_0x029b
        L_0x029a:
            r0 = 3
        L_0x029b:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)     // Catch:{ RemoteException -> 0x02b0 }
            if (r3 == 0) goto L_0x02a3
            r10 = 2
            goto L_0x02a4
        L_0x02a3:
            r10 = 1
        L_0x02a4:
            r3 = r17
            r4 = r6
            r6 = r0
            r11 = 0
            r7 = r10
            r2.mo7173Q6(r3, r4, r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x02ae }
            goto L_0x02be
        L_0x02ae:
            r0 = move-exception
            goto L_0x02b2
        L_0x02b0:
            r0 = move-exception
            r11 = 0
        L_0x02b2:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r11] = r0
            java.lang.String r0 = "invokeAsResult : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r0, r3)
            goto L_0x02be
        L_0x02bd:
            r11 = 0
        L_0x02be:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            if (r0 != 0) goto L_0x02e1
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 10424(0x28b8, float:1.4607E-41)
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r3 = 49
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r11] = r3
            r3 = 128(0x80, float:1.794E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            r3 = 2
            r2[r3] = r18
            r0.mo160131h(r1, r2)
        L_0x02e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler$$b.run():void");
    }
}
