package xc0;

import gy3.C8480h;

/* renamed from: xc0.d */
public final class C78786d {

    /* renamed from: a */
    public static final C78787a f230533a = new C78787a((C8480h) null);

    /* renamed from: b */
    public static C78788b f230534b;

    /* renamed from: xc0.d$a */
    public static final class C78787a {
        public C78787a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object m95192a(xc0.C78786d.C78787a r17, java.lang.String r18, te3.C48662a4 r19, int r20, wx3.C15601d r21) {
            /*
                r0 = r18
                r1 = r19
                r2 = r21
                r17.getClass()
                boolean r3 = r2 instanceof xc0.C78784b
                if (r3 == 0) goto L_0x001c
                r3 = r2
                xc0.b r3 = (xc0.C78784b) r3
                int r4 = r3.f230528h
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = r4 & r5
                if (r6 == 0) goto L_0x001c
                int r4 = r4 - r5
                r3.f230528h = r4
                goto L_0x0023
            L_0x001c:
                xc0.b r3 = new xc0.b
                r4 = r17
                r3.<init>(r4, r2)
            L_0x0023:
                java.lang.Object r2 = r3.f230526f
                xx3.a r12 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r3.f230528h
                r13 = 2
                r14 = 0
                r15 = 1
                if (r4 == 0) goto L_0x004a
                if (r4 == r15) goto L_0x003f
                if (r4 != r13) goto L_0x0037
                kotlin.ResultKt.throwOnFailure(r2)
                goto L_0x013a
            L_0x0037:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x003f:
                int r0 = r3.f230524d
                java.lang.Object r1 = r3.f230525e
                gi.g r1 = (p1081gi.C98124g) r1
                kotlin.ResultKt.throwOnFailure(r2)
                goto L_0x00f1
            L_0x004a:
                kotlin.ResultKt.throwOnFailure(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "startCdnTask:"
                r2.append(r4)
                java.lang.Object r4 = r19.toJSON()
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.String r4 = "MicroMsg.RemarkCdnDownloadServicePLC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                gi.g r2 = new gi.g
                r2.<init>()
                java.lang.String r5 = "task_NetSceneDownloadCardImg"
                r2.f287660d = r5
                r5 = 274(0x112, float:3.84E-43)
                r2.field_appType = r5
                r5 = 20304(0x4f50, float:2.8452E-41)
                r2.field_fileType = r5
                r5 = 3
                r2.f287663g = r5
                xc0.g r6 = xc0.C78795g.m95196e()
                java.lang.String r7 = r1.f130298d
                java.lang.String r6 = r6.mo108707d(r0, r7)
                r2.field_fullpath = r6
                xc0.g r6 = xc0.C78795g.m95196e()
                java.lang.String r7 = r1.f130298d
                java.lang.String r0 = r6.mo108707d(r0, r7)
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
                java.lang.String r6 = "getMD5String(RemarkImage…ername, cdnInfo.img_url))"
                gy3.C87412m.m108593f(r0, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "download_"
                r6.append(r7)
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                r2.field_mediaId = r0
                java.lang.String r6 = r1.f130299e
                r2.field_aesKey = r6
                java.lang.String r1 = r1.f130298d
                r2.f287672s = r1
                r2.f287657N = r5
                java.lang.Object[] r1 = new java.lang.Object[r5]
                java.lang.String r5 = r2.field_fileId
                r1[r14] = r5
                r1[r15] = r6
                r1[r13] = r0
                java.lang.String r0 = "cdn download, url:%s, askkey:%s, mediaId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r1)
                java.lang.Class<qo.i> r0 = p663qo.C77384i.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                java.lang.String r1 = "getService(ICdnFeatureService::class.java)"
                gy3.C87412m.m108593f(r0, r1)
                r4 = r0
                qo.i r4 = (p663qo.C77384i) r4
                r6 = 0
                r8 = 0
                r10 = 6
                r11 = 0
                r3.f230525e = r2
                r0 = r20
                r3.f230524d = r0
                r3.f230528h = r15
                r5 = r2
                r9 = r3
                java.lang.Object r1 = p663qo.C77384i.C77385a.m93301a(r4, r5, r6, r8, r9, r10, r11)
                if (r1 != r12) goto L_0x00ec
                goto L_0x013c
            L_0x00ec:
                r16 = r2
                r2 = r1
                r1 = r16
            L_0x00f1:
                com.tencent.mm.modelcdntran.v r2 = (com.tencent.p014mm.modelcdntran.C92798v) r2
                if (r2 == 0) goto L_0x013a
                java.lang.String r1 = r1.field_mediaId
                java.lang.String r4 = "taskInfo.field_mediaId"
                gy3.C87412m.m108593f(r1, r4)
                r1 = 0
                r3.f230525e = r1
                r3.f230528h = r13
                com.tencent.mm.modelcdntran.v$a r1 = r2.f267130a
                int r1 = r1.ordinal()
                java.lang.String r2 = "cdn download finish!! succeed:%s"
                java.lang.String r3 = "MiroMsg.ContactRemarkInfoModUI"
                if (r1 == r15) goto L_0x011e
                if (r1 == r13) goto L_0x011e
                xc0.d$b r0 = xc0.C78786d.f230534b
                if (r0 == 0) goto L_0x0135
                java.lang.Object[] r0 = new java.lang.Object[r15]
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0[r14] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
                goto L_0x0135
            L_0x011e:
                xc0.d$b r1 = xc0.C78786d.f230534b
                if (r1 == 0) goto L_0x0135
                com.tencent.mm.ui.contact.l0 r1 = (com.tencent.p014mm.p136ui.contact.C74520l0) r1
                java.lang.Object[] r4 = new java.lang.Object[r15]
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                r4[r14] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r4)
                com.tencent.mm.ui.contact.k0 r2 = new com.tencent.mm.ui.contact.k0
                r2.<init>(r1, r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            L_0x0135:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                if (r0 != r12) goto L_0x013a
                goto L_0x013c
            L_0x013a:
                rx3.b0 r12 = rx3.C13598b0.f38549a
            L_0x013c:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: xc0.C78786d.C78787a.m95192a(xc0.d$a, java.lang.String, te3.a4, int, wx3.d):java.lang.Object");
        }
    }

    /* renamed from: xc0.d$b */
    public interface C78788b {
    }
}
