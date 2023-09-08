package p1086ro;

import a14.C0000n0;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.storage.C72963f4;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.List;
import p434ig.C98672d;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.feature.cdn.downloader.AlbumVideoDownloadFSC$checkAlbumIfDownload$1", mo125469f = "AlbumVideoDownloadFSC.kt", mo125470l = {259, 277}, mo125471m = "invokeSuspend")
/* renamed from: ro.a */
public final class C101414a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f297036d;

    /* renamed from: e */
    public Object f297037e;

    /* renamed from: f */
    public Object f297038f;

    /* renamed from: g */
    public Object f297039g;

    /* renamed from: h */
    public Object f297040h;

    /* renamed from: i */
    public Object f297041i;

    /* renamed from: j */
    public Object f297042j;

    /* renamed from: n */
    public int f297043n;

    /* renamed from: o */
    public int f297044o;

    /* renamed from: p */
    public int f297045p;

    /* renamed from: q */
    public int f297046q;

    /* renamed from: r */
    public final /* synthetic */ C72963f4 f297047r;

    /* renamed from: s */
    public final /* synthetic */ ArrayList<C98672d> f297048s;

    /* renamed from: t */
    public final /* synthetic */ C92795s f297049t;

    /* renamed from: u */
    public final /* synthetic */ List<C98672d> f297050u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101414a(C72963f4 f4Var, ArrayList<C98672d> arrayList, C92795s sVar, List<? extends C98672d> list, C15601d<? super C101414a> dVar) {
        super(2, dVar);
        this.f297047r = f4Var;
        this.f297048s = arrayList;
        this.f297049t = sVar;
        this.f297050u = list;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C101414a(this.f297047r, this.f297048s, this.f297049t, this.f297050u, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C101414a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x02f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            r33 = this;
            r0 = r33
            java.lang.Class<qo.i> r1 = p663qo.C77384i.class
            java.lang.Class<mh0.e0> r2 = mh0.C99865e0.class
            java.lang.Class<mh0.d> r3 = mh0.C99864d.class
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r0.f297046q
            java.lang.String r8 = "getService(\n            …atureService::class.java)"
            r10 = 2
            r12 = 1
            if (r5 == 0) goto L_0x0081
            if (r5 == r12) goto L_0x004f
            if (r5 != r10) goto L_0x0047
            int r5 = r0.f297045p
            int r13 = r0.f297044o
            int r14 = r0.f297043n
            java.lang.Object r15 = r0.f297042j
            gy3.f0 r15 = (gy3.C8479f0) r15
            java.lang.Object r6 = r0.f297041i
            ig.d r6 = (p434ig.C98672d) r6
            java.lang.Object r9 = r0.f297040h
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.f297039g
            com.tencent.mm.storage.f4 r10 = (com.tencent.p014mm.storage.C72963f4) r10
            java.lang.Object r12 = r0.f297038f
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r11 = r0.f297037e
            gy3.a0 r11 = (gy3.C8477a0) r11
            java.lang.Object r7 = r0.f297036d
            mh0.a r7 = (mh0.C99862a) r7
            kotlin.ResultKt.throwOnFailure(r34)
            r24 = r2
            r26 = r3
            r2 = r7
            r25 = r8
            r7 = r0
            r0 = r34
            goto L_0x0254
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004f:
            int r5 = r0.f297045p
            int r6 = r0.f297044o
            int r7 = r0.f297043n
            java.lang.Object r9 = r0.f297042j
            gy3.f0 r9 = (gy3.C8479f0) r9
            java.lang.Object r10 = r0.f297041i
            ig.d r10 = (p434ig.C98672d) r10
            java.lang.Object r11 = r0.f297040h
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r0.f297039g
            com.tencent.mm.storage.f4 r12 = (com.tencent.p014mm.storage.C72963f4) r12
            java.lang.Object r13 = r0.f297038f
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r0.f297037e
            gy3.a0 r14 = (gy3.C8477a0) r14
            java.lang.Object r15 = r0.f297036d
            mh0.a r15 = (mh0.C99862a) r15
            kotlin.ResultKt.throwOnFailure(r34)
            r24 = r2
            r26 = r3
            r25 = r8
            r2 = r14
            r14 = r7
            r7 = r0
            r0 = r34
            goto L_0x01b3
        L_0x0081:
            kotlin.ResultKt.throwOnFailure(r34)
            i40.b$a r5 = i40.C98597b.f289091e
            di3.d r6 = di3.C86312j.m106911c(r3)
            gy3.C87412m.m108593f(r6, r8)
            i40.e r6 = (i40.C98598e) r6
            i40.b r6 = r5.mo85231a(r6, r2)
            mh0.e0 r6 = (mh0.C99865e0) r6
            com.tencent.mm.storage.f4 r7 = r0.f297047r
            long r9 = r7.getMsgId()
            mh0.a r6 = r6.mo139217g3(r9)
            r7 = 3
            r6.f292636h = r7
            r7 = 0
            r6.f292639k = r7
            di3.d r7 = di3.C86312j.m106911c(r3)
            gy3.C87412m.m108593f(r7, r8)
            i40.e r7 = (i40.C98598e) r7
            i40.b r5 = r5.mo85231a(r7, r2)
            r16 = r5
            mh0.e0 r16 = (mh0.C99865e0) r16
            com.tencent.mm.storage.f4 r5 = r0.f297047r
            java.lang.String r18 = r5.mo108768t()
            com.tencent.mm.storage.f4 r5 = r0.f297047r
            long r19 = r5.getMsgId()
            com.tencent.mm.storage.f4 r5 = r0.f297047r
            long r21 = r5.mo108774y2()
            r23 = 0
            r24 = 16
            r25 = 0
            r17 = r6
            mh0.C99865e0.m130419i3(r16, r17, r18, r19, r21, r23, r24, r25)
            gy3.a0 r5 = new gy3.a0
            r5.<init>()
            r7 = 1
            r5.f27482d = r7
            java.util.ArrayList<ig.d> r7 = r0.f297048s
            int r7 = r7.size()
            java.util.ArrayList<ig.d> r9 = r0.f297048s
            java.util.List<ig.d> r10 = r0.f297050u
            com.tencent.mm.storage.f4 r11 = r0.f297047r
            java.util.Iterator r9 = r9.iterator()
            r14 = r7
            r12 = r10
            r10 = r11
            r7 = r0
            r11 = r5
            r5 = 0
        L_0x00f1:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x03ec
            java.lang.Object r13 = r9.next()
            int r15 = r5 + 1
            if (r5 < 0) goto L_0x03e7
            ig.d r13 = (p434ig.C98672d) r13
            gi.g r0 = new gi.g
            r0.<init>()
            r24 = r2
            gy3.f0 r2 = new gy3.f0
            r2.<init>()
            r25 = r8
            java.lang.String r8 = ""
            r2.f27484d = r8
            boolean r8 = r12.contains(r13)
            r26 = r3
            java.lang.String r3 = "getService(ICdnFeatureService::class.java)"
            r34 = r4
            java.lang.String r4 = "task_RecordMsgCDNService"
            if (r8 == 0) goto L_0x01c5
            ph0.a r8 = ph0.C100792a.f295260a
            r27 = r5
            java.lang.String r5 = r13.mo55264K()
            r28 = r15
            r15 = 1
            java.lang.String r5 = r8.mo140243o(r5, r10, r15)
            java.lang.String r15 = r8.mo140238j(r13, r10)
            r2.f27484d = r15
            java.lang.String r8 = r8.mo140237i(r5)
            r0.field_mediaId = r5
            r0.f287660d = r4
            r4 = 0
            r0.f287661e = r4
            r5 = 2
            r0.field_priority = r5
            r0.field_needStorage = r4
            long r4 = r13.mo55268M()
            int r5 = (int) r4
            r0.field_totalLen = r5
            java.lang.String r4 = r13.mo55248C()
            r0.field_aesKey = r4
            java.lang.String r4 = r13.mo55250D()
            r0.field_fileId = r4
            r0.field_fullpath = r8
            int r4 = r13.mo55282T()
            r0.field_fileType = r4
            java.lang.String r4 = r13.mo55286V()
            r0.field_filemd5 = r4
            di3.d r4 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r4, r3)
            r16 = r4
            qo.i r16 = (p663qo.C77384i) r16
            r18 = 0
            r20 = 0
            r22 = 6
            r23 = 0
            r7.f297036d = r6
            r7.f297037e = r11
            r7.f297038f = r12
            r7.f297039g = r10
            r7.f297040h = r9
            r7.f297041i = r13
            r7.f297042j = r2
            r7.f297043n = r14
            r5 = r28
            r7.f297044o = r5
            r8 = r27
            r7.f297045p = r8
            r3 = 1
            r7.f297046q = r3
            r17 = r0
            r21 = r7
            java.lang.Object r0 = p663qo.C77384i.C77385a.m93301a(r16, r17, r18, r20, r21, r22, r23)
            r15 = r34
            if (r0 != r15) goto L_0x01a3
            return r15
        L_0x01a3:
            r4 = r15
            r15 = r6
            r6 = r5
            r5 = r8
            r31 = r9
            r9 = r2
            r2 = r11
            r11 = r31
            r32 = r12
            r12 = r10
            r10 = r13
            r13 = r32
        L_0x01b3:
            com.tencent.mm.modelcdntran.v r0 = (com.tencent.p014mm.modelcdntran.C92798v) r0
            r16 = r7
            r17 = r11
            r18 = r12
            r19 = r13
            r13 = r14
            r3 = r15
            r14 = r2
            r2 = r5
            r5 = r6
            r15 = r9
            goto L_0x0264
        L_0x01c5:
            r8 = r5
            r5 = r15
            ph0.a r15 = ph0.C100792a.f295260a
            r27 = r8
            java.lang.String r8 = r13.mo55264K()
            java.lang.String r8 = r15.mo140249u(r8)
            r28 = r5
            r5 = 1
            java.lang.String r8 = r15.mo140243o(r8, r10, r5)
            java.lang.String r5 = r15.mo140250v(r13, r10)
            r2.f27484d = r5
            java.lang.String r5 = r15.mo140237i(r8)
            r0.field_mediaId = r8
            r0.f287660d = r4
            r4 = 0
            r0.f287661e = r4
            r8 = 2
            r0.field_priority = r8
            r0.field_needStorage = r4
            r4 = r14
            long r14 = r13.mo55344y0()
            int r8 = (int) r14
            r0.field_totalLen = r8
            java.lang.String r8 = r13.mo55254F()
            r0.field_aesKey = r8
            java.lang.String r8 = r13.mo55256G()
            r0.field_fileId = r8
            r0.field_fullpath = r5
            int r5 = r13.mo55336u0()
            r0.field_fileType = r5
            java.lang.String r5 = r13.mo55338v0()
            r0.field_filemd5 = r5
            di3.d r5 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r5, r3)
            r16 = r5
            qo.i r16 = (p663qo.C77384i) r16
            r18 = 0
            r20 = 0
            r22 = 6
            r23 = 0
            r7.f297036d = r6
            r7.f297037e = r11
            r7.f297038f = r12
            r7.f297039g = r10
            r7.f297040h = r9
            r7.f297041i = r13
            r7.f297042j = r2
            r7.f297043n = r4
            r5 = r28
            r7.f297044o = r5
            r3 = r27
            r7.f297045p = r3
            r8 = 2
            r7.f297046q = r8
            r17 = r0
            r21 = r7
            java.lang.Object r0 = p663qo.C77384i.C77385a.m93301a(r16, r17, r18, r20, r21, r22, r23)
            r8 = r34
            if (r0 != r8) goto L_0x024d
            return r8
        L_0x024d:
            r15 = r2
            r14 = r4
            r2 = r6
            r4 = r8
            r6 = r13
            r13 = r5
            r5 = r3
        L_0x0254:
            com.tencent.mm.modelcdntran.v r0 = (com.tencent.p014mm.modelcdntran.C92798v) r0
            r3 = r2
            r2 = r5
            r16 = r7
            r17 = r9
            r18 = r10
            r19 = r12
            r5 = r13
            r13 = r14
            r10 = r6
            r14 = r11
        L_0x0264:
            if (r0 == 0) goto L_0x03c7
            com.tencent.mm.modelcdntran.v$a r6 = r0.f267130a
            int r6 = r6.ordinal()
            java.lang.String r7 = ", dataId: "
            java.lang.String r8 = ", dataType: "
            java.lang.String r9 = ", msgID:"
            java.lang.String r11 = "MicroMsg.AlbumVideoDownloadPLC"
            if (r6 == 0) goto L_0x028a
            r12 = 1
            if (r6 == r12) goto L_0x0296
            r12 = 2
            if (r6 == r12) goto L_0x0296
            r12 = 3
            if (r6 == r12) goto L_0x03c7
            r2 = 7
            if (r6 == r2) goto L_0x028a
            switch(r6) {
                case 9: goto L_0x028a;
                case 10: goto L_0x03c7;
                case 11: goto L_0x028a;
                case 12: goto L_0x028a;
                default: goto L_0x0285;
            }
        L_0x0285:
            r2 = 0
            r14.f27482d = r2
            goto L_0x03c7
        L_0x028a:
            r20 = r1
            r6 = r11
            r1 = r13
            r12 = r14
            r29 = r24
            r2 = r25
            r11 = 3
            goto L_0x038f
        L_0x0296:
            gi.g r6 = r0.f267133d
            if (r6 == 0) goto L_0x029d
            java.lang.String r6 = r6.field_fullpath
            goto L_0x029e
        L_0x029d:
            r6 = 0
        L_0x029e:
            T r12 = r15.f27484d
            java.lang.String r12 = (java.lang.String) r12
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106463x(r6, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r20 = r1
            java.lang.String r1 = "checkAlbumIfDownload thumb success: "
            r12.append(r1)
            com.tencent.mm.modelcdntran.v$a r0 = r0.f267130a
            r12.append(r0)
            r12.append(r9)
            long r0 = r18.getMsgId()
            r12.append(r0)
            r12.append(r8)
            int r0 = r10.mo55274P()
            r12.append(r0)
            r12.append(r7)
            java.lang.String r0 = r10.mo55264K()
            r12.append(r0)
            java.lang.String r0 = ", moveFile result: "
            r12.append(r0)
            r12.append(r6)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r6 != 0) goto L_0x02f4
            r0 = 0
            r14.f27482d = r0
            r30 = r11
            r1 = r13
            r34 = r14
            r0 = r15
            r29 = r24
            r2 = r25
            goto L_0x033e
        L_0x02f4:
            r0 = 1
            int r2 = r2 + r0
            float r0 = (float) r2
            float r1 = (float) r13
            float r0 = r0 / r1
            r1 = 100
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.mo55369H(r0)
            i40.b$a r0 = i40.C98597b.f289091e
            di3.d r1 = di3.C86312j.m106911c(r26)
            r2 = r25
            gy3.C87412m.m108593f(r1, r2)
            i40.e r1 = (i40.C98598e) r1
            r12 = r24
            i40.b r0 = r0.mo85231a(r1, r12)
            r6 = r0
            mh0.e0 r6 = (mh0.C99865e0) r6
            java.lang.String r8 = r18.mo108768t()
            long r9 = r18.getMsgId()
            long r0 = r18.mo108774y2()
            r21 = 0
            r22 = 16
            r23 = 0
            r7 = r3
            r30 = r11
            r29 = r12
            r11 = r0
            r1 = r13
            r13 = r21
            r0 = r14
            r14 = r22
            r34 = r0
            r0 = r15
            r15 = r23
            mh0.C99865e0.m130419i3(r6, r7, r8, r9, r11, r13, r14, r15)
        L_0x033e:
            java.lang.Class<xp.b> r6 = p753xp.C102704b.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            xp.b r6 = (p753xp.C102704b) r6
            T r7 = r0.f27484d
            java.lang.String r7 = (java.lang.String) r7
            r8 = 9999(0x270f, float:1.4012E-41)
            r9 = 0
            wp.b r6 = r6.mo138751as(r7, r8, r9, r9)
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            T r0 = r0.f27484d
            r8 = 0
            r7[r8] = r0
            int r0 = r6.f301760a
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r0)
            r0 = 1
            r7[r0] = r8
            boolean r0 = r6.f301761b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8 = 2
            r7[r8] = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11 = 3
            r7[r11] = r0
            boolean r0 = r6.f301762c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8 = 4
            r7[r8] = r0
            r0 = 5
            long r8 = r6.f301763d
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r8)
            r7[r0] = r6
            java.lang.String r0 = "AlbumCheckDup :%s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s"
            r6 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r7)
            r12 = r34
            r0 = 0
            goto L_0x03d1
        L_0x038f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "checkAlbumIfDownload thumb error: "
            r13.append(r14)
            com.tencent.mm.modelcdntran.v$a r0 = r0.f267130a
            r13.append(r0)
            r13.append(r9)
            long r14 = r18.getMsgId()
            r13.append(r14)
            r13.append(r8)
            int r0 = r10.mo55274P()
            r13.append(r0)
            r13.append(r7)
            java.lang.String r0 = r10.mo55264K()
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = 0
            r12.f27482d = r0
            goto L_0x03d1
        L_0x03c7:
            r20 = r1
            r1 = r13
            r12 = r14
            r29 = r24
            r2 = r25
            r0 = 0
            r11 = 3
        L_0x03d1:
            r0 = r33
            r14 = r1
            r8 = r2
            r6 = r3
            r11 = r12
            r7 = r16
            r9 = r17
            r10 = r18
            r12 = r19
            r1 = r20
            r3 = r26
            r2 = r29
            goto L_0x00f1
        L_0x03e7:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x03ec:
            r29 = r2
            r26 = r3
            boolean r0 = r11.f27482d
            if (r0 == 0) goto L_0x0400
            com.tencent.mm.modelcdntran.s r0 = r7.f297049t
            com.tencent.mm.modelcdntran.t r1 = new com.tencent.mm.modelcdntran.t
            r1.<init>()
            r2 = 1
            r0.mo76200o2(r2, r1)
            goto L_0x040b
        L_0x0400:
            com.tencent.mm.modelcdntran.s r0 = r7.f297049t
            com.tencent.mm.modelcdntran.t r1 = new com.tencent.mm.modelcdntran.t
            r1.<init>()
            r2 = 2
            r0.mo76200o2(r2, r1)
        L_0x040b:
            r0 = 4
            r6.mo55373L(r0)
            i40.b$a r0 = i40.C98597b.f289091e
            di3.d r1 = di3.C86312j.m106911c(r26)
            java.lang.String r2 = "getService(AlbumFeatureService::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            i40.e r1 = (i40.C98598e) r1
            r2 = r29
            i40.b r0 = r0.mo85231a(r1, r2)
            r16 = r0
            mh0.e0 r16 = (mh0.C99865e0) r16
            com.tencent.mm.storage.f4 r0 = r7.f297047r
            java.lang.String r18 = r0.mo108768t()
            com.tencent.mm.storage.f4 r0 = r7.f297047r
            long r19 = r0.getMsgId()
            com.tencent.mm.storage.f4 r0 = r7.f297047r
            long r21 = r0.mo108774y2()
            r23 = 0
            r24 = 16
            r25 = 0
            r17 = r6
            mh0.C99865e0.m130419i3(r16, r17, r18, r19, r21, r23, r24, r25)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1086ro.C101414a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
