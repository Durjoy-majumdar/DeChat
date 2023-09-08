package jd3;

import ob0.C89132b;
import te3.C51900wz3;

/* renamed from: jd3.a */
public final class C76403a extends C89132b<C51900wz3> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r6v14, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76403a(com.tencent.p014mm.pluginsdk.model.app.C72683d r23) {
        /*
            r22 = this;
            r1 = r23
            java.lang.String r0 = "attachInfo"
            gy3.C87412m.m108594g(r1, r0)
            r22.<init>()
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            te3.vz3 r3 = new te3.vz3
            r3.<init>()
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            long r4 = r1.field_msgInfoId
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r4 = r0.b00(r4)
            java.lang.String r0 = r4.mo108768t()
            r3.f186025d = r0
            long r5 = r1.field_msgInfoId
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r3.f186026e = r0
            r0 = 1
            r3.f186027f = r0
            java.lang.String r5 = r4.getContent()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r5)
            r6 = 0
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r5, r6)
            java.lang.String r7 = " path:"
            java.lang.String r8 = "MicroMsg.CgiSendFileUploadMsg"
            if (r5 == 0) goto L_0x029c
            java.lang.String r9 = r5.f195622s
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0099
            com.tencent.mm.modelcdntran.u r9 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            java.lang.String r10 = r1.field_fileFullPath
            java.lang.String r9 = r9.mo127020d(r10)
            r5.f195622s = r9
            java.lang.String r9 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r5, r6, r6)
            r4.mo108732L2(r9)
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            f62.k0 r9 = (f62.C75700k0) r9
            g62.l r9 = r9.mo96095LE()
            long r10 = r4.getMsgId()
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            r9.xy0(r10, r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "set filemd5! msgId:"
            r9.append(r10)
            long r10 = r4.getMsgId()
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = r1.field_fileFullPath
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)
        L_0x0099:
            te3.uz3 r9 = new te3.uz3
            r9.<init>()
            java.lang.String r10 = r5.f195570f
            r9.f185811d = r10
            java.lang.String r10 = r5.f195602n
            r9.f185812e = r10
            java.lang.String r5 = r5.f195622s
            r9.f185813f = r5
            java.lang.String r5 = r1.field_fileFullPath
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            int r5 = (int) r10
            r9.f185814g = r5
            r3.f186028g = r9
            com.tencent.mm.pluginsdk.model.file.FileSmartServerMgr r5 = com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211575a
            java.lang.Class<h81.h> r10 = h81.C32735h.class
            java.lang.String r11 = "MicroMsg.FileSmartServerMgr"
            boolean r12 = com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211576b
            r13 = 0
            if (r12 == 0) goto L_0x00c8
            java.lang.String r0 = "start no"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            goto L_0x017f
        L_0x00c8:
            com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211576b = r13
            com.tencent.p014mm.lan_cs.SmartServer.f195333a = r5
            java.lang.Object[] r5 = com.tencent.p014mm.lan_cs.SmartServer.Java2C.startSmartServer()
            if (r5 == 0) goto L_0x0161
            r12 = r5[r13]
            boolean r14 = r12 instanceof java.lang.Integer
            if (r14 == 0) goto L_0x00db
            r6 = r12
            java.lang.Integer r6 = (java.lang.Integer) r6
        L_0x00db:
            if (r6 == 0) goto L_0x00e5
            int r6 = r6.intValue()
            if (r6 <= 0) goto L_0x00e5
            r6 = 1
            goto L_0x00e6
        L_0x00e5:
            r6 = 0
        L_0x00e6:
            com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211576b = r6
            if (r6 == 0) goto L_0x010f
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0114 }
            r12 = 2131825936(0x7f111510, float:1.9284742E38)
            r14 = 2
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0114 }
            r16 = r5[r0]     // Catch:{ Exception -> 0x0114 }
            java.lang.String r16 = r16.toString()     // Catch:{ Exception -> 0x0114 }
            r15[r13] = r16     // Catch:{ Exception -> 0x0114 }
            r5 = r5[r14]     // Catch:{ Exception -> 0x0114 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0114 }
            r15[r0] = r5     // Catch:{ Exception -> 0x0114 }
            java.lang.String r0 = r6.getString(r12, r15)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r5 = "{\n                    MM…ring())\n                }"
            gy3.C87412m.m108593f(r0, r5)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0111
        L_0x010f:
            java.lang.String r0 = ""
        L_0x0111:
            com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211577c = r0     // Catch:{ Exception -> 0x0114 }
            goto L_0x013e
        L_0x0114:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "start "
            r5.append(r6)
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r5.append(r6)
            r6 = 32
            r5.append(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x013e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "start startServer:"
            r0.append(r5)
            boolean r5 = com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211576b
            r0.append(r5)
            java.lang.String r5 = " serverUrl:"
            r0.append(r5)
            java.lang.String r5 = com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211577c
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0161:
            if (r6 != 0) goto L_0x0169
            java.lang.String r0 = "start result is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
        L_0x0169:
            kj2.d r14 = kj2.C117407d.INSTANCE
            r15 = 1680(0x690, double:8.3E-321)
            boolean r0 = com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211576b
            if (r0 == 0) goto L_0x0174
            r5 = 0
            goto L_0x0176
        L_0x0174:
            r5 = 1
        L_0x0176:
            r17 = r5
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
        L_0x017f:
            com.tencent.mm.lan_cs.SmartServer$ServerFileInfo r0 = new com.tencent.mm.lan_cs.SmartServer$ServerFileInfo
            r0.<init>()
            com.tencent.mm.modelcdntran.u r5 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()
            r5.getClass()
            java.lang.String r5 = com.tencent.mars.cdn.CdnLogic.createAeskey()
            r0.cryptKey = r5
            com.tencent.mm.pluginsdk.model.file.FileSmartServerMgr r5 = com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211575a
            java.lang.String r6 = r5.mo100180d(r4)
            r0.cgi = r6
            java.lang.String r6 = r1.field_fileFullPath
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r6, r13)
            r0.filePath = r6
            long r5 = r5.mo100181e()
            int r6 = (int) r5
            r0.idleTimeoutMs = r6
            di3.d r5 = di3.C86312j.m106911c(r10)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_file_lan_send_total_send_timeout_ms
            r12 = -1
            int r5 = r5.mo58779Qe(r6, r12)
            r0.totalSendTimeoutMs = r5
            di3.d r5 = di3.C86312j.m106911c(r10)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_file_lan_send_between_request_timeout_ms
            r12 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5.mo58777He(r6, r12)
            int r6 = (int) r5
            r0.betweenRequestTimeoutMs = r6
            com.tencent.p014mm.lan_cs.SmartServer.Java2C.addFileInfo(r0)
            java.lang.String r5 = r0.cgi
            java.lang.String r6 = "serverFileInfo.cgi"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.String r6 = r0.cryptKey
            java.lang.String r10 = "serverFileInfo.cryptKey"
            gy3.C87412m.m108593f(r6, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211577c
            r10.append(r12)
            r10.append(r5)
            r5 = 59
            r10.append(r5)
            r10.append(r6)
            java.lang.String r5 = r10.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "addFileInfo msgInfo:"
            r6.append(r10)
            long r12 = r4.getMsgId()
            r6.append(r12)
            java.lang.String r4 = " filePath:"
            r6.append(r4)
            java.lang.String r4 = r1.field_fileFullPath
            r6.append(r4)
            java.lang.String r4 = " url:"
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = " aesKey:"
            r6.append(r4)
            java.lang.String r0 = r0.cryptKey
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r0)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r5 == 0) goto L_0x0231
            r3.f186031j = r5
        L_0x0231:
            te3.wz3 r0 = new te3.wz3
            r0.<init>()
            te3.ja r4 = new te3.ja
            r4.<init>()
            r0.setBaseResponse(r4)
            te3.ja r4 = r0.getBaseResponse()
            te3.rv3 r5 = new te3.rv3
            r5.<init>()
            r4.f135956e = r5
            r2.f127066a = r3
            r2.f127067b = r0
            java.lang.String r0 = "/cgi-bin/micromsg-bin/sendfileuploadmsg"
            r2.f127068c = r0
            r0 = 6691(0x1a23, float:9.376E-42)
            r2.f127069d = r0
            ob0.c r0 = r2.mo72403a()
            r2 = r22
            r2.mo123453j(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "request msgId:"
            r0.append(r4)
            long r4 = r1.field_msgInfoId
            r0.append(r4)
            java.lang.String r4 = " md5:"
            r0.append(r4)
            java.lang.String r4 = r9.f185813f
            r0.append(r4)
            java.lang.String r4 = " fileExt:"
            r0.append(r4)
            java.lang.String r4 = r9.f185812e
            r0.append(r4)
            r0.append(r7)
            java.lang.String r1 = r1.field_fileFullPath
            r0.append(r1)
            java.lang.String r1 = " lanInfo:"
            r0.append(r1)
            java.lang.String r1 = r3.f186031j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x02bc
        L_0x029c:
            r2 = r22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "appMsgContent is null!! msgId:"
            r0.append(r3)
            long r3 = r1.field_msgInfoId
            r0.append(r3)
            r0.append(r7)
            java.lang.String r1 = r1.field_fileFullPath
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jd3.C76403a.<init>(com.tencent.mm.pluginsdk.model.app.d):void");
    }
}
