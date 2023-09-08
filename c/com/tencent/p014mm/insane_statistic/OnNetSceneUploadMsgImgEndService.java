package com.tencent.p014mm.insane_statistic;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import ob0.C47350c;
import p1081gi.C98121d;
import p158gt.C98207s;
import p782zu.C39454b;
import te3.C51163rv3;
import te3.on4;
import z72.C102978c;

@C86522b
/* renamed from: com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService */
public class OnNetSceneUploadMsgImgEndService extends C86301e implements C98207s {

    /* renamed from: com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd */
    public static class ProcessOnNetSceneUploadMsgImgEnd {

        /* renamed from: a */
        public long f266748a;

        /* renamed from: b */
        public C72963f4 f266749b = null;

        /* renamed from: c */
        public final C47350c f266750c;

        /* renamed from: d */
        public int f266751d;

        /* renamed from: e */
        public C92836k f266752e;

        /* renamed from: f */
        public String f266753f;

        /* renamed from: g */
        public boolean f266754g = false;

        /* renamed from: h */
        public String f266755h;

        /* renamed from: i */
        public int f266756i = 0;

        /* renamed from: j */
        public C98121d f266757j;

        /* renamed from: k */
        public boolean f266758k = false;

        /* renamed from: l */
        public String f266759l;

        /* renamed from: m */
        public IListener f266760m;

        /* renamed from: n */
        public IListener f266761n;

        public ProcessOnNetSceneUploadMsgImgEnd(long j, C72963f4 f4Var, C47350c cVar, boolean z, int i, String str) {
            C40008f fVar = C40008f.f107254d;
            this.f266760m = new IListener<RecogQBarOfImageFileResultEvent>(fVar) {
                {
                    this.__eventId = 812146647;
                }

                /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public boolean callback(com.tencent.p014mm.sdk.event.IEvent r13) {
                    /*
                        r12 = this;
                        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent r13 = (com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent) r13
                        java.lang.String r0 = "MicroMsg.OnNetSceneUploadMsgImgEnd"
                        java.lang.String r1 = ""
                        r2 = 2
                        java.lang.String[] r3 = new java.lang.String[r2]
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r4 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        java.lang.String r4 = r4.f266755h
                        r5 = 0
                        r3[r5] = r4
                        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r4 = r13.f265015d
                        java.lang.String r4 = r4.f265016a
                        r6 = 1
                        r3[r6] = r4
                        boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r3)
                        if (r3 != 0) goto L_0x01eb
                        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r3 = r13.f265015d
                        java.lang.String r3 = r3.f265016a
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r4 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        java.lang.String r4 = r4.f266755h
                        boolean r3 = r3.equals(r4)
                        if (r3 != 0) goto L_0x002d
                        goto L_0x01eb
                    L_0x002d:
                        com.tencent.mm.pluginsdk.ui.tools.n1 r3 = com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1.f283849a     // Catch:{ Exception -> 0x0042 }
                        java.lang.String r4 = r3.mo135195d(r13)     // Catch:{ Exception -> 0x0042 }
                        int r3 = r3.mo135193b(r13)     // Catch:{ Exception -> 0x0040 }
                        java.lang.String r7 = "UTF-8"
                        java.lang.String r7 = java.net.URLEncoder.encode(r4, r7)     // Catch:{ Exception -> 0x003e }
                        goto L_0x004c
                    L_0x003e:
                        r7 = move-exception
                        goto L_0x0046
                    L_0x0040:
                        r3 = move-exception
                        goto L_0x0044
                    L_0x0042:
                        r3 = move-exception
                        r4 = r1
                    L_0x0044:
                        r7 = r3
                        r3 = 0
                    L_0x0046:
                        java.lang.Object[] r8 = new java.lang.Object[r5]
                        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r1, r8)
                        r7 = r1
                    L_0x004c:
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r8 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        boolean r8 = r8.f266758k
                        if (r8 == 0) goto L_0x0093
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        r8.<init>()
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r9 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        java.lang.String r9 = r9.f266753f
                        r8.append(r9)
                        r8.append(r7)
                        java.lang.String r8 = r8.toString()
                        r9 = 4
                        java.lang.Object[] r9 = new java.lang.Object[r9]
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r10 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        long r10 = r10.f266748a
                        java.lang.Long r10 = java.lang.Long.valueOf(r10)
                        r9[r5] = r10
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r10 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        int r10 = r10.hashCode()
                        java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                        r9[r6] = r10
                        r9[r2] = r8
                        r2 = 3
                        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent$a r13 = r13.f265015d
                        java.lang.String r13 = r13.f265016a
                        r9[r2] = r13
                        java.lang.String r13 = "androidSystemShareFixed(13717) , imgLocalId:%d, scene.hash:%d, %s, filePath:%s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r13, r9)
                        com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                        r2 = 13717(0x3595, float:1.9222E-41)
                        r13.kvStat(r2, r8)
                    L_0x0093:
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r13 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        int r13 = r13.f266756i
                        if (r13 != r6) goto L_0x01da
                        ad0.t r13 = new ad0.t
                        r13.<init>()
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r2 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        ob0.c r2 = r2.f266750c
                        ob0.c$c r2 = r2.f127055a
                        pe3.a r2 = r2.f127080a
                        te3.on4 r2 = (te3.on4) r2
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        te3.rv3 r8 = r2.f299057f
                        java.lang.String r8 = r8.f141175d
                        r6.append(r8)
                        java.lang.String r8 = ","
                        r6.append(r8)
                        java.lang.String r6 = r6.toString()
                        java.lang.String r9 = "20toUser"
                        r13.mo32a(r9, r6)
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r9 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        int r9 = r9.f266751d
                        r6.append(r9)
                        r6.append(r8)
                        java.lang.String r6 = r6.toString()
                        java.lang.String r9 = "21source"
                        r13.mo32a(r9, r6)
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r7)
                        r6.append(r8)
                        java.lang.String r6 = r6.toString()
                        java.lang.String r7 = "22qrUrl"
                        r13.mo32a(r7, r6)
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r7 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        gi.d r7 = r7.f266757j
                        if (r7 != 0) goto L_0x00fb
                        r7 = r1
                        goto L_0x00fd
                    L_0x00fb:
                        java.lang.String r7 = r7.field_filemd5
                    L_0x00fd:
                        r6.append(r7)
                        r6.append(r8)
                        java.lang.String r6 = r6.toString()
                        java.lang.String r7 = "23md5"
                        r13.mo32a(r7, r6)
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r7 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        gi.d r7 = r7.f266757j
                        if (r7 != 0) goto L_0x0119
                        r7 = r1
                        goto L_0x011b
                    L_0x0119:
                        java.lang.String r7 = r7.field_fileId
                    L_0x011b:
                        r6.append(r7)
                        r6.append(r8)
                        java.lang.String r6 = r6.toString()
                        java.lang.String r7 = "24cdnFileId"
                        r13.mo32a(r7, r6)
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r7 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        gi.d r7 = r7.f266757j
                        if (r7 != 0) goto L_0x0137
                        r7 = r1
                        goto L_0x0139
                    L_0x0137:
                        java.lang.String r7 = r7.field_aesKey
                    L_0x0139:
                        r6.append(r7)
                        r6.append(r8)
                        java.lang.String r6 = r6.toString()
                        java.lang.String r7 = "25cdnAesKey"
                        r13.mo32a(r7, r6)
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r6 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        com.tencent.mm.storage.f4 r6 = r6.f266749b
                        boolean r6 = r6.mo101020w3()
                        if (r6 == 0) goto L_0x0163
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r6 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        com.tencent.mm.storage.f4 r6 = r6.f266749b
                        java.lang.String r6 = r6.getContent()
                        r7 = 0
                        com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r7)
                        if (r6 == 0) goto L_0x0163
                        java.lang.String r1 = r6.f195562d
                    L_0x0163:
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        r6.append(r1)
                        r6.append(r8)
                        java.lang.String r1 = r6.toString()
                        java.lang.String r6 = "26appip"
                        r13.mo32a(r6, r1)
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        te3.rv3 r2 = r2.f299057f
                        java.lang.String r2 = r2.f141175d
                        int r2 = eb0.C45612m0.m50697n(r2)
                        r1.append(r2)
                        r1.append(r8)
                        java.lang.String r1 = r1.toString()
                        java.lang.String r2 = "27toUsersCount"
                        r13.mo32a(r2, r1)
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        r1.append(r3)
                        r1.append(r8)
                        java.lang.String r1 = r1.toString()
                        java.lang.String r2 = "28codeType"
                        r13.mo32a(r2, r1)
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r1 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        com.tencent.mm.storage.f4 r1 = r1.f266749b
                        long r1 = r1.mo108774y2()
                        java.lang.Long r1 = java.lang.Long.valueOf(r1)
                        java.lang.String r2 = "29msgid"
                        r13.mo32a(r2, r1)
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "report qrCodeImgChatting(13628): "
                        r1.append(r2)
                        java.lang.String r2 = r13.mo34c()
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                        r0 = 13628(0x353c, float:1.9097E-41)
                        java.lang.String r13 = r13.toString()
                        com.tencent.p014mm.modelstat.C114750t.m161442g(r0, r13)
                    L_0x01da:
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r13 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        com.tencent.mm.sdk.event.IListener r0 = r13.f266760m
                        r0.dead()
                        com.tencent.mm.sdk.event.IListener r13 = r13.f266761n
                        r13.dead()
                        com.tencent.mm.insane_statistic.OnNetSceneUploadMsgImgEndService$ProcessOnNetSceneUploadMsgImgEnd r13 = com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.this
                        com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.m116755a(r13, r4)
                    L_0x01eb:
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.insane_statistic.OnNetSceneUploadMsgImgEndService.ProcessOnNetSceneUploadMsgImgEnd.C926891.callback(com.tencent.mm.sdk.event.IEvent):boolean");
                }
            };
            this.f266761n = new IListener<RecogQBarOfImageFileFailedEvent>(fVar) {
                {
                    this.__eventId = 1700407223;
                }

                public boolean callback(IEvent iEvent) {
                    RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = (RecogQBarOfImageFileFailedEvent) iEvent;
                    if (!Util.isNullOrNil(ProcessOnNetSceneUploadMsgImgEnd.this.f266755h, recogQBarOfImageFileFailedEvent.f107738d.f107739a) && recogQBarOfImageFileFailedEvent.f107738d.f107739a.equals(ProcessOnNetSceneUploadMsgImgEnd.this.f266755h)) {
                        ProcessOnNetSceneUploadMsgImgEnd processOnNetSceneUploadMsgImgEnd = ProcessOnNetSceneUploadMsgImgEnd.this;
                        if (processOnNetSceneUploadMsgImgEnd.f266758k) {
                            Log.m105925i("MicroMsg.OnNetSceneUploadMsgImgEnd", "androidSystemShareFixed(13717), imgLocalId:%d, scene.hash:%d, %s", Long.valueOf(processOnNetSceneUploadMsgImgEnd.f266748a), Integer.valueOf(ProcessOnNetSceneUploadMsgImgEnd.this.hashCode()), ProcessOnNetSceneUploadMsgImgEnd.this.f266753f);
                            C115669n.INSTANCE.kvStat(13717, ProcessOnNetSceneUploadMsgImgEnd.this.f266753f);
                        }
                        ProcessOnNetSceneUploadMsgImgEnd processOnNetSceneUploadMsgImgEnd2 = ProcessOnNetSceneUploadMsgImgEnd.this;
                        processOnNetSceneUploadMsgImgEnd2.f266760m.dead();
                        processOnNetSceneUploadMsgImgEnd2.f266761n.dead();
                        ProcessOnNetSceneUploadMsgImgEnd.m116755a(ProcessOnNetSceneUploadMsgImgEnd.this, (String) null);
                    }
                    return false;
                }
            };
            this.f266748a = j;
            this.f266749b = f4Var;
            this.f266750c = cVar;
            this.f266751d = i;
            this.f266758k = z;
            this.f266759l = str;
        }

        /* renamed from: a */
        public static void m116755a(ProcessOnNetSceneUploadMsgImgEnd processOnNetSceneUploadMsgImgEnd, String str) {
            processOnNetSceneUploadMsgImgEnd.getClass();
            C102978c cVar = new C102978c();
            cVar.f303882d = processOnNetSceneUploadMsgImgEnd.f266749b.mo108774y2();
            cVar.f303883e = 1;
            int i = processOnNetSceneUploadMsgImgEnd.f266751d;
            if (i == 1 || i == 2) {
                cVar.f303884f = 3;
            } else if (i != 4) {
                cVar.f303884f = 2;
            } else {
                cVar.f303884f = 1;
            }
            cVar.f303886h = processOnNetSceneUploadMsgImgEnd.f266749b.mo108768t();
            C98121d dVar = processOnNetSceneUploadMsgImgEnd.f266757j;
            String str2 = "";
            cVar.f303888j = dVar == null ? str2 : dVar.field_fileId;
            cVar.f303889n = dVar == null ? str2 : dVar.field_aesKey;
            if (dVar != null) {
                str2 = dVar.field_filemd5;
            }
            cVar.f303890o = str2;
            cVar.f303891p = processOnNetSceneUploadMsgImgEnd.f266749b.getCreateTime();
            cVar.f303892q = 0;
            cVar.f303893r = 0;
            cVar.f303900y = str;
            cVar.f303879A = processOnNetSceneUploadMsgImgEnd.f266759l;
            ((C39454b) C86312j.m106911c(C39454b.class)).mo61972Vk(cVar, C72996z1.m85820U5(processOnNetSceneUploadMsgImgEnd.f266749b.mo108768t()) ? 2 : 1, processOnNetSceneUploadMsgImgEnd.f266749b.getCreateTime(), processOnNetSceneUploadMsgImgEnd.f266755h);
        }
    }

    /* renamed from: Wp */
    public void mo126781Wp(long j, C72963f4 f4Var, C47350c cVar, int i, boolean z, C98121d dVar, String str) {
        ProcessOnNetSceneUploadMsgImgEnd processOnNetSceneUploadMsgImgEnd = new ProcessOnNetSceneUploadMsgImgEnd(j, f4Var, cVar, z, i, str);
        processOnNetSceneUploadMsgImgEnd.f266756i = 1;
        if (!processOnNetSceneUploadMsgImgEnd.f266754g) {
            processOnNetSceneUploadMsgImgEnd.f266757j = dVar;
            processOnNetSceneUploadMsgImgEnd.f266754g = true;
            C51163rv3 rv32 = ((on4) processOnNetSceneUploadMsgImgEnd.f266750c.f127055a.f127080a).f299057f;
            String str2 = rv32 != null ? rv32.f141175d : "";
            boolean z2 = !Util.isNullOrNil(str2) && C72996z1.m85820U5(str2);
            StringBuilder sb = new StringBuilder();
            sb.append("2,");
            sb.append(z2 ? 2 : 1);
            sb.append(",,");
            processOnNetSceneUploadMsgImgEnd.f266753f = sb.toString();
            if (processOnNetSceneUploadMsgImgEnd.f266752e == null) {
                processOnNetSceneUploadMsgImgEnd.f266752e = C92837k0.Bx0().mo127194nP(Long.valueOf(processOnNetSceneUploadMsgImgEnd.f266748a));
            }
            C92836k kVar = processOnNetSceneUploadMsgImgEnd.f266752e;
            if (kVar != null) {
                RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                processOnNetSceneUploadMsgImgEnd.f266760m.alive();
                processOnNetSceneUploadMsgImgEnd.f266761n.alive();
                processOnNetSceneUploadMsgImgEnd.f266755h = C92837k0.Bx0().mo127174TY(kVar.f267378e, "", "", true);
                recogQBarOfImageFileEvent.f107731d.f107732a = System.nanoTime();
                recogQBarOfImageFileEvent.f107731d.f107733b = processOnNetSceneUploadMsgImgEnd.f266755h;
                recogQBarOfImageFileEvent.publish();
            }
        }
    }
}
