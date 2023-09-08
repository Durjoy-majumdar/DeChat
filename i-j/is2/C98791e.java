package is2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: is2.e */
public final class C98791e {

    /* renamed from: a */
    public static final C98791e f289635a = new C98791e();

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.model.withta.WithTaComposeGetPageOpImpl", mo125469f = "WithTaComposeGetPageOpImpl.kt", mo125470l = {41}, mo125471m = "getPage")
    /* renamed from: is2.e$a */
    public static final class C98792a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f289636d;

        /* renamed from: e */
        public final /* synthetic */ C98791e f289637e;

        /* renamed from: f */
        public int f289638f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98792a(C98791e eVar, C15601d<? super C98792a> dVar) {
            super(dVar);
            this.f289637e = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeGetPageOpImpl$getPage$1");
            this.f289636d = obj;
            this.f289638f |= Integer.MIN_VALUE;
            Object a = this.f289637e.mo138166a(0, 0, (String) null, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaComposeGetPageOpImpl$getPage$1");
            return a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: lh3.g$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: lh3.g$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: lh3.g$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: lh3.g$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: lh3.g$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: lh3.g$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: lh3.g$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: lh3.g$f} */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r1v26, types: [lh3.g$g] */
    /* JADX WARNING: type inference failed for: r2v18, types: [lh3.g$b] */
    /* JADX WARNING: type inference failed for: r1v39, types: [lh3.g$d] */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03c8, code lost:
        if (r1.f298427h.size() == 0) goto L_0x040f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0468 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo138166a(long r33, int r35, java.lang.String r36, wx3.C15601d<? super lh3.C61285f<lh3.C34282e<lh3.C99474g>>> r37) {
        /*
            r32 = this;
            r0 = r37
            java.lang.String r1 = "getPage"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.withta.WithTaComposeGetPageOpImpl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            boolean r3 = r0 instanceof is2.C98791e.C98792a
            if (r3 == 0) goto L_0x001e
            r3 = r0
            is2.e$a r3 = (is2.C98791e.C98792a) r3
            int r4 = r3.f289638f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001e
            int r4 = r4 - r5
            r3.f289638f = r4
            r4 = r32
            goto L_0x0025
        L_0x001e:
            is2.e$a r3 = new is2.e$a
            r4 = r32
            r3.<init>(r4, r0)
        L_0x0025:
            java.lang.Object r0 = r3.f289636d
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r3.f289638f
            r7 = 1
            if (r6 == 0) goto L_0x003f
            if (r6 != r7) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0081
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r0)
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            r6 = 6843(0x1abb, float:9.589E-42)
            r0.f127069d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/mmsnswithtapage"
            r0.f127068c = r6
            te3.i94 r6 = new te3.i94
            r6.<init>()
            r8 = r36
            r6.f135183d = r8
            r8 = r33
            r6.f135184e = r8
            r8 = r35
            r6.f135185f = r8
            r6.f135186g = r7
            r0.f127066a = r6
            te3.j94 r6 = new te3.j94
            r6.<init>()
            r0.f127067b = r6
            ob0.c r0 = r0.mo72403a()
            pb0.b$a r6 = pb0.C47446b.f127269a
            d14.f r0 = r6.mo72464a(r0)
            r3.f289638f = r7
            java.lang.Object r0 = d14.C58042h.m67202k(r0, r3)
            if (r0 != r5) goto L_0x0081
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L_0x0081:
            r3 = r0
            pb0.a r3 = (pb0.C47445a) r3
            qb0.b r3 = r3.f128348a
            qb0.b r5 = qb0.C47798b.OnEnd
            r6 = 0
            if (r3 != r5) goto L_0x008d
            r3 = 1
            goto L_0x008e
        L_0x008d:
            r3 = 0
        L_0x008e:
            if (r3 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            pb0.a r0 = (pb0.C47445a) r0
            if (r0 == 0) goto L_0x04f6
            T r0 = r0.f128353f
            r3 = r0
            te3.j94 r3 = (te3.j94) r3
            if (r3 == 0) goto L_0x04f6
            java.lang.String r8 = "toWrapperData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r2)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r3.f135951d
            if (r0 == 0) goto L_0x047e
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x00b0:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0476
            java.lang.Object r0 = r11.next()
            r12 = r0
            com.tencent.mm.protocal.protobuf.SnsObject r12 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r12
            if (r12 == 0) goto L_0x0459
            java.lang.String r13 = "toSnsInfo"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.model.withta.UtilsKt"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            com.tencent.mm.plugin.sns.storage.SnsInfo r15 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r15.<init>()
            te3.qv3 r0 = r12.ObjectDesc
            pe3.b r0 = r0.f140574f
            byte[] r0 = r0.mo123703f()
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r9 = z04.C119027c.f356488a
            r5.<init>(r0, r9)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            java.lang.String r9 = "MicroMsg.NetSceneSnsClassifyTimeLine"
            if (r0 == 0) goto L_0x00eb
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r5
            java.lang.String r6 = "snsxml up: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r9, r6, r0)
        L_0x00eb:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r36 = r8
            long r7 = r12.f283891Id
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
            r7 = 0
            r0[r7] = r6
            java.lang.String r6 = "from server %d "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r6, r0)
            boolean r0 = r15.setContent(r5)
            java.lang.String r5 = ""
            if (r0 != 0) goto L_0x010b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            r15 = 0
            goto L_0x01c6
        L_0x010b:
            java.lang.String r0 = r12.Username
            r15.field_userName = r0
            int r0 = r12.CreateTime
            r15.field_createTime = r0
            int r0 = r12.LikeFlag
            r15.field_likeFlag = r0
            long r6 = r12.f283891Id
            r15.setSnsId(r6)
            long r6 = r12.f283891Id
            r15.setStringSeq((long) r6)
            int r0 = r12.ExtFlag
            r15.ExtFlag = r0
            r6 = 256(0x100, float:3.59E-43)
            r15.addSourceFlag(r6)
            java.util.LinkedList<te3.rv3> r0 = r12.WithTaList
            java.lang.String r6 = "this.WithTaList"
            gy3.C87412m.m108593f(r0, r6)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 62
            r24 = 0
            java.lang.String r17 = ";"
            r16 = r0
            java.lang.String r0 = sx3.C110818d0.m150921S(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r15.field_withTa = r0
            byte[] r0 = r12.toByteArray()     // Catch:{ Exception -> 0x0152 }
            r15.setAttrBuf(r0)     // Catch:{ Exception -> 0x0152 }
            goto L_0x0159
        L_0x0152:
            r0 = move-exception
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r5, r7)
        L_0x0159:
            java.util.LinkedList<te3.w64> r0 = r12.NewWithTaList
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 != 0) goto L_0x0186
            vr2.b0$a r0 = vr2.C65874b0.f189421a
            java.lang.String r6 = r15.getSnsId()
            java.lang.String r7 = "snsinfo.snsId"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.String r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.Mx0()
            java.lang.String r8 = r12.Username
            boolean r7 = r7.equals(r8)
            java.util.LinkedList<te3.w64> r8 = r12.NewWithTaList
            java.lang.String r4 = "this.NewWithTaList"
            gy3.C87412m.m108593f(r8, r4)
            r4 = 0
            java.lang.CharSequence r0 = r0.mo89930i(r4, r6, r7, r8)
            r15.withTaUsername = r0
        L_0x0186:
            com.tencent.mm.protocal.protobuf.TimeLineObject r0 = r15.getTimeLine()
            java.lang.String r4 = "snsinfo.timeLine"
            gy3.C87412m.m108593f(r0, r4)
            java.lang.String r4 = r12.Username
            r0.UserName = r4
            int r4 = r0.Privated
            r15.setPravited(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "ext flag "
            r4.append(r6)
            int r6 = r12.ExtFlag
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r4)
            r15.setExtFlag()
            r15.setTimeLine(r0)
            te3.j00 r4 = r0.ContentObj
            int r4 = r4.f298424e
            r15.setTypeFlag(r4)
            te3.j00 r0 = r0.ContentObj
            int r0 = r0.f298428i
            r15.setSubTypeFlag(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
        L_0x01c6:
            if (r15 == 0) goto L_0x0454
            java.lang.String r0 = "toSnsWithTa"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r14)
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r15.getTimeLine()
            if (r4 != 0) goto L_0x01d8
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = ad0.C91999u.m115563i()
        L_0x01d8:
            java.lang.String r6 = r15.field_withTa
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x01e6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L_0x0202
        L_0x01e6:
            java.lang.String r6 = r15.field_withTa
            java.lang.String r7 = "this.field_withTa"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.String r7 = ";"
            java.lang.String[] r17 = new java.lang.String[]{r7}
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            r16 = r6
            java.util.List r6 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
        L_0x0202:
            r24 = r6
            lh3.g$a r6 = new lh3.g$a
            java.lang.String r7 = r15.getUserName()
            java.lang.String r8 = "this.userName"
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r8 = r4.ContentDesc
            if (r8 != 0) goto L_0x0217
            r18 = r5
            goto L_0x0219
        L_0x0217:
            r18 = r8
        L_0x0219:
            int r19 = r15.getCreateTime()
            java.lang.String r8 = r15.getSnsId()
            java.lang.String r9 = "this.snsId"
            gy3.C87412m.m108593f(r8, r9)
            int r9 = r15.localid
            java.lang.String r12 = r15.getStringSeq()
            java.lang.String r13 = "this.stringSeq"
            gy3.C87412m.m108593f(r12, r13)
            int r23 = r15.getTypeFlag()
            te3.kr2 r13 = r4.Location
            r28 = r1
            r29 = r2
            long r1 = r15.field_snsId
            r30 = r5
            java.lang.String r5 = "toWithTaString"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r14)
            if (r13 != 0) goto L_0x0251
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            r31 = r11
            r25 = r30
            goto L_0x0290
        L_0x0251:
            r31 = r11
            java.lang.String r11 = r13.f298650g
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0285
            r16 = 0
            int r11 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x0282
            java.lang.String r1 = r13.f298649f
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0282
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r13.f298649f
            r1.append(r2)
            r2 = 183(0xb7, float:2.56E-43)
            r1.append(r2)
            java.lang.String r2 = r13.f298650g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x0287
        L_0x0282:
            java.lang.String r1 = r13.f298650g
            goto L_0x0287
        L_0x0285:
            java.lang.String r1 = r13.f298649f
        L_0x0287:
            if (r1 != 0) goto L_0x028b
            r1 = r30
        L_0x028b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r14)
            r25 = r1
        L_0x0290:
            java.lang.CharSequence r1 = r15.withTaUsername
            java.lang.String r26 = r1.toString()
            int r1 = r15.ExtFlag
            r16 = r6
            r17 = r7
            r20 = r8
            r21 = r9
            r22 = r12
            r27 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            te3.j00 r1 = r4.ContentObj
            int r2 = r1.f298424e
            r5 = 1
            if (r2 == r5) goto L_0x0445
            r5 = 2
            if (r2 == r5) goto L_0x043e
            r7 = 3
            if (r2 == r7) goto L_0x0412
            r7 = 4
            if (r2 == r7) goto L_0x03e9
            r9 = 15
            if (r2 == r9) goto L_0x03bb
            r9 = 28
            if (r2 == r9) goto L_0x037b
            r7 = 30
            if (r2 == r7) goto L_0x03e9
            r1 = 34
            if (r2 == r1) goto L_0x031d
            r1 = 42
            if (r2 == r1) goto L_0x02cd
            goto L_0x040f
        L_0x02cd:
            lh3.g$d r1 = new lh3.g$d
            java.lang.String r2 = "getMusicMvShareMedia"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r14)
            te3.j00 r5 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r5 = r5.f298427h
            r7 = 0
            java.lang.Object r5 = r5.get(r7)
            te3.kv2 r5 = (te3.C101804kv2) r5
            te3.j00 r7 = r4.ContentObj
            te3.t23 r7 = r7.f298439w
            java.lang.String r7 = r7.f185461f
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x02ed
            r5.f298694i = r7
        L_0x02ed:
            java.lang.String r7 = "media"
            gy3.C87412m.m108593f(r5, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r14)
            te3.j00 r2 = r4.ContentObj
            if (r2 == 0) goto L_0x030a
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            if (r2 == 0) goto L_0x030a
            r7 = 0
            java.lang.Object r2 = r2.get(r7)
            te3.kv2 r2 = (te3.C101804kv2) r2
            if (r2 == 0) goto L_0x030a
            java.lang.String r2 = r2.f298697o
            goto L_0x030b
        L_0x030a:
            r2 = 0
        L_0x030b:
            te3.j00 r4 = r4.ContentObj
            if (r4 == 0) goto L_0x0316
            te3.t23 r4 = r4.f298439w
            if (r4 == 0) goto L_0x0316
            java.lang.String r4 = r4.f185463h
            goto L_0x0317
        L_0x0316:
            r4 = 0
        L_0x0317:
            r1.<init>(r6, r5, r2, r4)
        L_0x031a:
            r6 = r1
            goto L_0x040f
        L_0x031d:
            lh3.g$f r1 = new lh3.g$f
            java.lang.String r2 = "getFinderLiveMedia"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r14)
            te3.kv2 r7 = new te3.kv2
            r7.<init>()
            te3.j00 r9 = r4.ContentObj
            te3.p81 r9 = r9.f298435s
            java.lang.String r9 = r9.f184783i
            r7.f298692g = r9
            r7.f298694i = r9
            r7.f298690e = r5
            r5 = 1
            r7.f298695j = r5
            te3.mv2 r9 = new te3.mv2
            r9.<init>()
            r7.f298698p = r9
            r7.f298693h = r5
            te3.j00 r11 = r4.ContentObj
            te3.p81 r11 = r11.f298435s
            float r12 = r11.f184784j
            r9.f298875d = r12
            float r11 = r11.f184785n
            r9.f298876e = r11
            r7.f298689d = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r14)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131837139(0x7f1140d3, float:1.9307465E38)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            te3.j00 r4 = r4.ContentObj
            te3.p81 r4 = r4.f298435s
            java.lang.String r4 = r4.f184781g
            r5 = 0
            r9[r5] = r4
            java.lang.String r19 = r2.getString(r8, r9)
            r20 = 0
            r21 = 8
            r22 = 0
            r16 = r1
            r17 = r6
            r18 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r6 = r1
            r5 = 0
            goto L_0x040f
        L_0x037b:
            te3.rk1 r1 = r1.f298431o
            if (r1 == 0) goto L_0x03ad
            java.util.LinkedList<te3.pk1> r2 = r1.f185190n
            r4 = 0
            if (r2 == 0) goto L_0x038b
            java.lang.Object r2 = r2.get(r4)
            te3.pk1 r2 = (te3.C64628pk1) r2
            goto L_0x038c
        L_0x038b:
            r2 = 0
        L_0x038c:
            if (r2 != 0) goto L_0x038f
            goto L_0x03ad
        L_0x038f:
            lh3.g$b r2 = new lh3.g$b
            java.util.LinkedList<te3.pk1> r8 = r1.f185190n
            java.lang.Object r8 = r8.get(r4)
            te3.pk1 r8 = (te3.C64628pk1) r8
            java.lang.String r4 = r8.f184828f
            if (r4 != 0) goto L_0x039f
            r4 = r30
        L_0x039f:
            int r1 = r1.f185188i
            if (r1 == r7) goto L_0x03a8
            if (r1 != r5) goto L_0x03a6
            goto L_0x03a8
        L_0x03a6:
            r1 = 0
            goto L_0x03a9
        L_0x03a8:
            r1 = 1
        L_0x03a9:
            r2.<init>(r6, r4, r1)
            goto L_0x040e
        L_0x03ad:
            java.lang.String r1 = "Sns-WithTa-Utils"
            java.lang.String r2 = "finder obj is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r14)
            r4 = r6
            r5 = 0
            goto L_0x0463
        L_0x03bb:
            java.util.LinkedList<te3.kv2> r2 = r1.f298427h
            if (r2 != 0) goto L_0x03cb
            gy3.C87412m.m108591d(r1)
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            int r1 = r1.size()
            if (r1 != 0) goto L_0x03cb
            goto L_0x040f
        L_0x03cb:
            lh3.g$g r1 = new lh3.g$g
            te3.j00 r2 = r4.ContentObj
            gy3.C87412m.m108591d(r2)
            java.util.LinkedList<te3.kv2> r2 = r2.f298427h
            gy3.C87412m.m108591d(r2)
            r5 = 0
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r4 = "timeLineObj.ContentObj!!.MediaObjList!![0]"
            gy3.C87412m.m108593f(r2, r4)
            te3.kv2 r2 = (te3.C101804kv2) r2
            r1.<init>(r6, r2)
            goto L_0x031a
        L_0x03e9:
            r5 = 0
            lh3.g$f r2 = new lh3.g$f
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            if (r1 == 0) goto L_0x03f9
            java.lang.Object r1 = r1.get(r5)
            te3.kv2 r1 = (te3.C101804kv2) r1
            r18 = r1
            goto L_0x03fb
        L_0x03f9:
            r18 = 0
        L_0x03fb:
            te3.j00 r1 = r4.ContentObj
            java.lang.String r1 = r1.f298425f
            r20 = 0
            r21 = 8
            r22 = 0
            r16 = r2
            r17 = r6
            r19 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x040e:
            r6 = r2
        L_0x040f:
            r4 = r6
            r5 = 0
            goto L_0x0450
        L_0x0412:
            lh3.g$f r2 = new lh3.g$f
            java.util.LinkedList<te3.kv2> r1 = r1.f298427h
            r5 = 0
            if (r1 == 0) goto L_0x0422
            java.lang.Object r1 = r1.get(r5)
            te3.kv2 r1 = (te3.C101804kv2) r1
            r18 = r1
            goto L_0x0424
        L_0x0422:
            r18 = 0
        L_0x0424:
            te3.j00 r1 = r4.ContentObj
            if (r1 == 0) goto L_0x042d
            java.lang.String r4 = r1.f298425f
            r19 = r4
            goto L_0x042f
        L_0x042d:
            r19 = 0
        L_0x042f:
            r20 = 0
            r21 = 8
            r22 = 0
            r16 = r2
            r17 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r4 = r2
            goto L_0x0450
        L_0x043e:
            r5 = 0
            lh3.g$e r1 = new lh3.g$e
            r1.<init>(r6)
            goto L_0x044f
        L_0x0445:
            r5 = 0
            lh3.g$c r1 = new lh3.g$c
            java.util.List r2 = is2.C98790d.m128577a(r4)
            r1.<init>(r6, r2)
        L_0x044f:
            r4 = r1
        L_0x0450:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r14)
            goto L_0x0463
        L_0x0454:
            r28 = r1
            r29 = r2
            goto L_0x045f
        L_0x0459:
            r28 = r1
            r29 = r2
            r36 = r8
        L_0x045f:
            r31 = r11
            r5 = 0
            r4 = 0
        L_0x0463:
            if (r4 == 0) goto L_0x0468
            r10.add(r4)
        L_0x0468:
            r4 = r32
            r8 = r36
            r1 = r28
            r2 = r29
            r11 = r31
            r6 = 0
            r7 = 1
            goto L_0x00b0
        L_0x0476:
            r28 = r1
            r29 = r2
            r36 = r8
            r5 = 0
            goto L_0x0487
        L_0x047e:
            r28 = r1
            r29 = r2
            r36 = r8
            r5 = 0
            sx3.f0 r10 = sx3.C64186f0.f181907d
        L_0x0487:
            r12 = r10
            int r0 = r3.f135954g
            if (r0 == 0) goto L_0x048e
            r13 = 1
            goto L_0x048f
        L_0x048e:
            r13 = 0
        L_0x048f:
            long r14 = r3.f135953f
            long r0 = r3.f135952e
            lh3.e r2 = new lh3.e
            r11 = r2
            r16 = r0
            r11.<init>(r12, r13, r14, r16)
            r1 = r36
            r4 = r29
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r0 = r3.f135951d
            if (r0 == 0) goto L_0x04cd
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x04cd
            java.lang.String r0 = "insert"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.SnsObject> r1 = r3.f135951d
            java.lang.Object r3 = r1.getFirst()
            com.tencent.mm.protocal.protobuf.SnsObject r3 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r3
            long r5 = r3.f283891Id
            java.lang.String r3 = vr2.C102236a0.m134765q0(r5)
            java.lang.String r3 = vr2.C102236a0.m134705B(r3)
            java.lang.String r5 = "@__with_together"
            r6 = 256(0x100, float:3.59E-43)
            com.tencent.p014mm.plugin.sns.model.C94897n1.m120370h(r5, r6, r1, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
        L_0x04cd:
            java.util.List<T> r0 = r2.f92400a
            java.util.Iterator r0 = r0.iterator()
        L_0x04d3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04f0
            java.lang.Object r1 = r0.next()
            lh3.g r1 = (lh3.C99474g) r1
            os2.e0 r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r5 = r1.f291655d
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r3.mo139807TE(r5)
            if (r3 == 0) goto L_0x04d3
            int r3 = r3.localid
            r1.f291656e = r3
            goto L_0x04d3
        L_0x04f0:
            lh3.f$b r0 = new lh3.f$b
            r0.<init>(r2)
            goto L_0x0500
        L_0x04f6:
            r28 = r1
            r4 = r2
            lh3.f$a r0 = new lh3.f$a
            r1 = 1
            r2 = 0
            r0.<init>(r2, r1, r2)
        L_0x0500:
            r1 = r28
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: is2.C98791e.mo138166a(long, int, java.lang.String, wx3.d):java.lang.Object");
    }
}
