package p1086ro;

import a14.C0000n0;
import a14.C53934p0;
import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelcdntran.C92750b0;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import i40.C76285g;
import i40.C98597b;
import i40.C98598e;
import java.lang.ref.WeakReference;
import p1081gi.C98124g;
import p434ig.C98672d;
import p663qo.C63287k;
import ph0.C100792a;
import rx3.C13598b0;
import th0.C101888l;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ro.b */
public final class C101415b extends C98597b {

    @C91590f(mo125468c = "com.tencent.mm.feature.cdn.downloader.AlbumVideoDownloadFSC$checkOriginImgOrVideoItemAlbumDownload$1", mo125469f = "AlbumVideoDownloadFSC.kt", mo125470l = {155}, mo125471m = "invokeSuspend")
    /* renamed from: ro.b$a */
    public static final class C101416a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f297051d;

        /* renamed from: e */
        public Object f297052e;

        /* renamed from: f */
        public int f297053f;

        /* renamed from: g */
        public /* synthetic */ Object f297054g;

        /* renamed from: h */
        public final /* synthetic */ C98672d f297055h;

        /* renamed from: i */
        public final /* synthetic */ C72963f4 f297056i;

        /* renamed from: j */
        public final /* synthetic */ WeakReference<C92750b0> f297057j;

        /* renamed from: n */
        public final /* synthetic */ C92795s f297058n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101416a(C98672d dVar, C72963f4 f4Var, WeakReference<C92750b0> weakReference, C92795s sVar, C15601d<? super C101416a> dVar2) {
            super(2, dVar2);
            this.f297055h = dVar;
            this.f297056i = f4Var;
            this.f297057j = weakReference;
            this.f297058n = sVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C101416a aVar = new C101416a(this.f297055h, this.f297056i, this.f297057j, this.f297058n, dVar);
            aVar.f297054g = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C101416a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x023f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r8 = r19
                xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r8.f297053f
                r10 = 0
                java.lang.String r11 = ", mediaId: "
                java.lang.String r12 = ", dataId: "
                java.lang.String r13 = "MicroMsg.AlbumVideoDownloadPLC"
                r14 = 1
                r15 = 2
                if (r0 == 0) goto L_0x0030
                if (r0 != r14) goto L_0x0028
                java.lang.Object r0 = r8.f297052e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r1 = r8.f297051d
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r2 = r8.f297054g
                a14.n0 r2 = (a14.C0000n0) r2
                kotlin.ResultKt.throwOnFailure(r20)
                r2 = r1
                r1 = r0
                r0 = r20
                goto L_0x00f0
            L_0x0028:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0030:
                kotlin.ResultKt.throwOnFailure(r20)
                java.lang.Object r0 = r8.f297054g
                a14.n0 r0 = (a14.C0000n0) r0
                ph0.a r1 = ph0.C100792a.f295260a
                ig.d r2 = r8.f297055h
                java.lang.String r2 = r2.mo55264K()
                com.tencent.mm.storage.f4 r3 = r8.f297056i
                java.lang.String r7 = r1.mo140243o(r2, r3, r14)
                ig.d r2 = r8.f297055h
                com.tencent.mm.storage.f4 r3 = r8.f297056i
                java.lang.String r6 = r1.mo140238j(r2, r3)
                java.lang.String r1 = r1.mo140237i(r7)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "do download OriginImgOrVideo, dataType: "
                r2.append(r3)
                ig.d r3 = r8.f297055h
                int r3 = r3.mo55274P()
                r2.append(r3)
                r2.append(r12)
                ig.d r3 = r8.f297055h
                java.lang.String r3 = r3.mo55264K()
                r2.append(r3)
                r2.append(r11)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
                gi.g r2 = new gi.g
                r2.<init>()
                r2.field_mediaId = r7
                java.lang.String r3 = "task_RecordMsgCDNService"
                r2.f287660d = r3
                r2.f287661e = r10
                r2.field_priority = r15
                r2.field_needStorage = r10
                ig.d r3 = r8.f297055h
                long r3 = r3.mo55268M()
                int r4 = (int) r3
                r2.field_totalLen = r4
                ig.d r3 = r8.f297055h
                java.lang.String r3 = r3.mo55248C()
                r2.field_aesKey = r3
                ig.d r3 = r8.f297055h
                java.lang.String r3 = r3.mo55250D()
                r2.field_fileId = r3
                r2.field_fullpath = r1
                ig.d r1 = r8.f297055h
                int r1 = r1.mo55282T()
                r2.field_fileType = r1
                ig.d r1 = r8.f297055h
                java.lang.String r1 = r1.mo55286V()
                r2.field_filemd5 = r1
                java.lang.Class<qo.i> r1 = p663qo.C77384i.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r3 = "getService(ICdnFeatureService::class.java)"
                gy3.C87412m.m108593f(r1, r3)
                qo.i r1 = (p663qo.C77384i) r1
                r3 = 0
                java.lang.ref.WeakReference<com.tencent.mm.modelcdntran.b0> r5 = r8.f297057j
                r16 = 2
                r17 = 0
                r8.f297054g = r0
                r8.f297051d = r7
                r8.f297052e = r6
                r8.f297053f = r14
                r0 = r1
                r1 = r2
                r2 = r3
                r4 = r5
                r5 = r19
                r18 = r6
                r6 = r16
                r16 = r7
                r7 = r17
                java.lang.Object r0 = p663qo.C77384i.C77385a.m93301a(r0, r1, r2, r4, r5, r6, r7)
                if (r0 != r9) goto L_0x00ec
                return r9
            L_0x00ec:
                r2 = r16
                r1 = r18
            L_0x00f0:
                com.tencent.mm.modelcdntran.v r0 = (com.tencent.p014mm.modelcdntran.C92798v) r0
                if (r0 == 0) goto L_0x0242
                com.tencent.mm.storage.f4 r3 = r8.f297056i
                ig.d r4 = r8.f297055h
                com.tencent.mm.modelcdntran.s r5 = r8.f297058n
                com.tencent.mm.modelcdntran.v$a r6 = r0.f267130a
                int r6 = r6.ordinal()
                java.lang.String r7 = ", dataType: "
                java.lang.String r9 = ", msgID:"
                if (r6 == 0) goto L_0x012c
                r10 = 3
                if (r6 == r14) goto L_0x0133
                if (r6 == r15) goto L_0x0133
                if (r6 == r10) goto L_0x012f
                r1 = 7
                if (r6 == r1) goto L_0x012c
                switch(r6) {
                    case 9: goto L_0x012c;
                    case 10: goto L_0x012f;
                    case 11: goto L_0x012c;
                    case 12: goto L_0x012c;
                    default: goto L_0x0113;
                }
            L_0x0113:
                if (r5 == 0) goto L_0x0129
                com.tencent.mm.modelcdntran.t r0 = new com.tencent.mm.modelcdntran.t
                r0.<init>()
                java.lang.String r1 = r4.mo55264K()
                r0.f157721c = r1
                rx3.b0 r1 = rx3.C13598b0.f38549a
                r5.mo76200o2(r15, r0)
                rx3.b0 r10 = rx3.C13598b0.f38549a
                goto L_0x023c
            L_0x0129:
                r10 = 0
                goto L_0x023c
            L_0x012c:
                r6 = 0
                goto L_0x01ec
            L_0x012f:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                goto L_0x023c
            L_0x0133:
                gi.g r6 = r0.f267133d
                if (r6 == 0) goto L_0x013a
                java.lang.String r6 = r6.field_fullpath
                goto L_0x013b
            L_0x013a:
                r6 = 0
            L_0x013b:
                boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106463x(r6, r1)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r14 = "checkOriginImgOrVideo success: "
                r10.append(r14)
                com.tencent.mm.modelcdntran.v$a r0 = r0.f267130a
                r10.append(r0)
                r10.append(r9)
                long r8 = r3.getMsgId()
                r10.append(r8)
                r10.append(r7)
                int r0 = r4.mo55274P()
                r10.append(r0)
                r10.append(r12)
                java.lang.String r0 = r4.mo55264K()
                r10.append(r0)
                r10.append(r11)
                r10.append(r2)
                java.lang.String r0 = ", moveFile result: "
                r10.append(r0)
                r10.append(r6)
                java.lang.String r0 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                if (r6 != 0) goto L_0x0191
                if (r5 == 0) goto L_0x0129
                com.tencent.mm.modelcdntran.t r0 = new com.tencent.mm.modelcdntran.t
                r0.<init>()
                r5.mo76200o2(r15, r0)
                rx3.b0 r10 = rx3.C13598b0.f38549a
                goto L_0x023c
            L_0x0191:
                if (r5 == 0) goto L_0x01a6
                com.tencent.mm.modelcdntran.t r0 = new com.tencent.mm.modelcdntran.t
                r0.<init>()
                r0.f157726h = r1
                java.lang.String r2 = r4.mo55264K()
                r0.f157721c = r2
                rx3.b0 r2 = rx3.C13598b0.f38549a
                r2 = 1
                r5.mo76200o2(r2, r0)
            L_0x01a6:
                java.lang.Class<xp.b> r0 = p753xp.C102704b.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                xp.b r0 = (p753xp.C102704b) r0
                r2 = 9999(0x270f, float:1.4012E-41)
                r6 = 0
                wp.b r0 = r0.mo138751as(r1, r2, r6, r6)
                r2 = 6
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r1
                int r1 = r0.f301760a
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r1)
                r1 = 1
                r2[r1] = r3
                boolean r1 = r0.f301761b
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2[r15] = r1
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r3 = 3
                r2[r3] = r1
                r1 = 4
                boolean r3 = r0.f301762c
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r2[r1] = r3
                r1 = 5
                long r3 = r0.f301763d
                java.lang.Long r0 = new java.lang.Long
                r0.<init>(r3)
                r2[r1] = r0
                java.lang.String r0 = "AlbumCheckDup :%s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r2)
                goto L_0x012f
            L_0x01ec:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "checkOriginImgOrVideo error: "
                r1.append(r8)
                com.tencent.mm.modelcdntran.v$a r0 = r0.f267130a
                r1.append(r0)
                r1.append(r9)
                long r8 = r3.getMsgId()
                r1.append(r8)
                r1.append(r7)
                int r0 = r4.mo55274P()
                r1.append(r0)
                r1.append(r12)
                java.lang.String r0 = r4.mo55264K()
                r1.append(r0)
                r1.append(r11)
                r1.append(r2)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
                if (r5 == 0) goto L_0x023b
                com.tencent.mm.modelcdntran.t r0 = new com.tencent.mm.modelcdntran.t
                r0.<init>()
                java.lang.String r1 = r4.mo55264K()
                r0.f157721c = r1
                rx3.b0 r1 = rx3.C13598b0.f38549a
                r5.mo76200o2(r15, r0)
                rx3.b0 r10 = rx3.C13598b0.f38549a
                goto L_0x023c
            L_0x023b:
                r10 = r6
            L_0x023c:
                if (r10 != 0) goto L_0x023f
                goto L_0x0242
            L_0x023f:
                r0 = r19
                goto L_0x025a
            L_0x0242:
                r0 = r19
                com.tencent.mm.modelcdntran.s r1 = r0.f297058n
                ig.d r2 = r0.f297055h
                if (r1 == 0) goto L_0x025a
                com.tencent.mm.modelcdntran.t r3 = new com.tencent.mm.modelcdntran.t
                r3.<init>()
                java.lang.String r2 = r2.mo55264K()
                r3.f157721c = r2
                rx3.b0 r2 = rx3.C13598b0.f38549a
                r1.mo76200o2(r15, r3)
            L_0x025a:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p1086ro.C101415b.C101416a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101415b(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "plugin");
    }

    /* renamed from: g3 */
    public final boolean mo140924g3(C72963f4 f4Var, C98672d dVar, C92795s sVar, WeakReference<C92750b0> weakReference) {
        C87412m.m108594g(f4Var, "msgInfo");
        C87412m.m108594g(dVar, "dataItem");
        C101888l lVar = C101888l.f300029a;
        if (!lVar.mo141362l(dVar, f4Var) && !lVar.mo141358h(dVar, f4Var)) {
            C98598e eVar = this.f289092d;
            eVar.requireAccountInitialized();
            C76285g gVar = eVar.f289095f;
            LifecycleScope lifecycleScope = gVar != null ? gVar.f223480f : null;
            if (lifecycleScope != null) {
                LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C101416a(dVar, f4Var, weakReference, sVar, (C15601d<? super C101416a>) null), 1, (Object) null);
            }
            return true;
        } else if (sVar == null) {
            return false;
        } else {
            C55385t tVar = new C55385t();
            tVar.f157721c = dVar.mo55264K();
            C13598b0 b0Var = C13598b0.f38549a;
            sVar.mo76200o2(1, tVar);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x004c A[SYNTHETIC] */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo140925i3(p434ig.C98674g r9, com.tencent.p014mm.storage.C72963f4 r10) {
        /*
            r8 = this;
            java.lang.String r0 = r10.getContent()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.List r0 = r9.mo55348A()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r0.next()
            r5 = r3
            ig.d r5 = (p434ig.C98672d) r5
            th0.l r6 = th0.C101888l.f300029a
            boolean r7 = r6.mo141361k(r5, r10)
            if (r7 != 0) goto L_0x0039
            boolean r7 = r6.mo141358h(r5, r10)
            if (r7 != 0) goto L_0x0039
            boolean r5 = r6.mo141357g(r5, r10)
            if (r5 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            if (r4 != 0) goto L_0x0015
            r2.add(r3)
            goto L_0x0015
        L_0x003f:
            java.util.List r9 = r9.mo55348A()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x004c:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x0089
            java.lang.Object r3 = r9.next()
            r5 = r3
            ig.d r5 = (p434ig.C98672d) r5
            java.lang.String r6 = "albumDataItem"
            gy3.C87412m.m108594g(r5, r6)
            java.lang.String r6 = r5.mo55256G()
            if (r6 == 0) goto L_0x0071
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x006c
            r6 = 1
            goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            if (r6 != r4) goto L_0x0071
            r6 = 1
            goto L_0x0072
        L_0x0071:
            r6 = 0
        L_0x0072:
            if (r6 == 0) goto L_0x0082
            ph0.a r6 = ph0.C100792a.f295260a
            java.lang.String r5 = r6.mo140250v(r5, r10)
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r5 == 0) goto L_0x0082
            r5 = 1
            goto L_0x0083
        L_0x0082:
            r5 = 0
        L_0x0083:
            if (r5 != 0) goto L_0x004c
            r0.add(r3)
            goto L_0x004c
        L_0x0089:
            boolean r9 = r2.isEmpty()
            r9 = r9 ^ r4
            if (r9 != 0) goto L_0x0097
            boolean r9 = r0.isEmpty()
            r9 = r9 ^ r4
            if (r9 == 0) goto L_0x0098
        L_0x0097:
            r1 = 1
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1086ro.C101415b.mo140925i3(ig.g, com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: j3 */
    public final C98124g mo140926j3(C72963f4 f4Var, C98672d dVar, String str, boolean z) {
        C87412m.m108594g(dVar, "dataItem");
        C87412m.m108594g(str, "downloadPath");
        C55385t tVar = new C55385t();
        long j = 0;
        if (z || Util.isNullOrNil(dVar.mo55302d0())) {
            String n = C100792a.f295260a.mo140242n(dVar.mo55264K(), f4Var != null ? f4Var.getMsgId() : 0, true);
            tVar.f157719a = dVar.mo55248C();
            tVar.f157720b = dVar.mo55250D();
            tVar.f157721c = dVar.mo55264K();
            tVar.f157722d = n;
            tVar.f157724f = dVar.mo55268M();
            tVar.f157725g = n.hashCode();
            tVar.f157726h = str;
            tVar.f157727i = dVar.mo55282T();
            tVar.f157728j = false;
            tVar.f157732n = dVar.mo55286V();
            if (f4Var != null) {
                j = f4Var.getMsgId();
            }
            tVar.f157733o = j;
        } else {
            C100792a aVar = C100792a.f295260a;
            String o = aVar.mo140243o(aVar.mo140244p(dVar.mo55264K()), f4Var, true);
            tVar.f157719a = dVar.mo55296a0();
            tVar.f157720b = dVar.mo55302d0();
            tVar.f157721c = dVar.mo55264K();
            tVar.f157722d = o;
            tVar.f157724f = dVar.mo55300c0();
            tVar.f157725g = o.hashCode();
            tVar.f157726h = str;
            tVar.f157727i = dVar.mo55306f0();
            tVar.f157732n = dVar.mo55298b0();
            if (f4Var != null) {
                j = f4Var.getMsgId();
            }
            tVar.f157733o = j;
        }
        return ((C63287k) C86312j.m106911c(C63287k.class)).mo88184wS(tVar);
    }
}
