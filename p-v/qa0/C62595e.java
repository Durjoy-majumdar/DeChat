package qa0;

import a14.C0000n0;
import a14.C53895h;
import com.tencent.maas.MJMaasCore;
import com.tencent.maas.model.MJTemplateMetadata;
import fy3.C32227p;
import gy3.C87412m;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qa0.e */
public final class C62595e implements MJMaasCore.TemplateServiceProvider {

    /* renamed from: d */
    public static final C62595e f177779d = new C62595e();

    @C91590f(mo125468c = "com.tencent.mm.mj_template.svr_model.TemplateInfoHolder$getTemplateServiceProvider$1$1", mo125469f = "TemplateInfoHolder.kt", mo125470l = {155}, mo125471m = "invokeSuspend")
    /* renamed from: qa0.e$a */
    public static final class C62596a extends C91594j implements C32227p<C0000n0, C15601d<? super MJTemplateMetadata>, Object> {

        /* renamed from: d */
        public Object f177780d;

        /* renamed from: e */
        public int f177781e;

        /* renamed from: f */
        public final /* synthetic */ String f177782f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62596a(String str, C15601d<? super C62596a> dVar) {
            super(2, dVar);
            this.f177782f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62596a(this.f177782f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62596a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f177781e
                r3 = 1
                if (r2 == 0) goto L_0x001d
                if (r2 != r3) goto L_0x0015
                java.lang.Object r1 = r0.f177780d
                com.tencent.maas.model.MJTemplateInfo r1 = (com.tencent.maas.model.MJTemplateInfo) r1
                kotlin.ResultKt.throwOnFailure(r20)
                r2 = r20
                goto L_0x004e
            L_0x0015:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001d:
                kotlin.ResultKt.throwOnFailure(r20)
                qa0.b r2 = qa0.C62586b.f177739a
                java.lang.String r4 = r0.f177782f
                java.lang.String r5 = "templateId"
                gy3.C87412m.m108593f(r4, r5)
                te3.pr4 r4 = r2.mo87646f(r4)
                android.util.ArrayMap<java.lang.String, com.tencent.maas.model.MJTemplateInfo> r6 = qa0.C62586b.f177748j
                java.lang.String r7 = r0.f177782f
                java.lang.Object r6 = r6.get(r7)
                com.tencent.maas.model.MJTemplateInfo r6 = (com.tencent.maas.model.MJTemplateInfo) r6
                if (r4 != 0) goto L_0x0052
                if (r6 != 0) goto L_0x0052
                java.lang.String r4 = r0.f177782f
                gy3.C87412m.m108593f(r4, r5)
                r5 = 2
                r0.f177780d = r6
                r0.f177781e = r3
                java.lang.Object r2 = r2.mo87644d(r4, r5, r0)
                if (r2 != r1) goto L_0x004d
                return r1
            L_0x004d:
                r1 = r6
            L_0x004e:
                r4 = r2
                te3.pr4 r4 = (te3.pr4) r4
                r6 = r1
            L_0x0052:
                r1 = 0
                if (r4 == 0) goto L_0x0058
                te3.vy r2 = r4.f139922g
                goto L_0x0059
            L_0x0058:
                r2 = r1
            L_0x0059:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "request template info "
                r5.append(r7)
                java.lang.String r7 = r0.f177782f
                r5.append(r7)
                java.lang.String r7 = ", "
                r5.append(r7)
                if (r2 == 0) goto L_0x0077
                int r8 = r2.f143766j
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r8)
                goto L_0x0078
            L_0x0077:
                r9 = r1
            L_0x0078:
                r5.append(r9)
                r5.append(r7)
                if (r2 == 0) goto L_0x0083
                java.lang.String r8 = r2.f143765i
                goto L_0x0084
            L_0x0083:
                r8 = r1
            L_0x0084:
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                java.lang.String r8 = "MicroMsg.Maas.CreationSameInfoHolder"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
                if (r2 == 0) goto L_0x00cc
                java.lang.String r5 = r2.f143765i
                r9 = 0
                if (r5 == 0) goto L_0x009f
                int r5 = r5.length()
                if (r5 != 0) goto L_0x009e
                goto L_0x009f
            L_0x009e:
                r3 = 0
            L_0x009f:
                if (r3 == 0) goto L_0x00a2
                goto L_0x00cc
            L_0x00a2:
                com.tencent.maas.model.MJTemplateMetadata r1 = new com.tencent.maas.model.MJTemplateMetadata
                java.lang.String r11 = r0.f177782f
                int r3 = r2.f143766j
                long r12 = (long) r3
                java.lang.String r2 = r2.f143765i
                if (r2 != 0) goto L_0x00af
                java.lang.String r2 = ""
            L_0x00af:
                r14 = r2
                if (r4 == 0) goto L_0x00b9
                te3.yq4 r2 = r4.f139929q
                if (r2 == 0) goto L_0x00b9
                int r2 = r2.f145471d
                goto L_0x00ba
            L_0x00b9:
                r2 = 0
            L_0x00ba:
                long r2 = (long) r2
                if (r4 == 0) goto L_0x00c3
                te3.yq4 r4 = r4.f139929q
                if (r4 == 0) goto L_0x00c3
                int r9 = r4.f145473f
            L_0x00c3:
                long r4 = (long) r9
                r10 = r1
                r15 = r2
                r17 = r4
                r10.<init>(r11, r12, r14, r15, r17)
                goto L_0x010b
            L_0x00cc:
                if (r6 != 0) goto L_0x00cf
                goto L_0x010b
            L_0x00cf:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "get cached "
                r1.append(r2)
                long r2 = r6.getTemplateDescVersion()
                r1.append(r2)
                r1.append(r7)
                java.lang.String r2 = r6.getTemplateDescURL()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
                com.tencent.maas.model.MJTemplateMetadata r1 = new com.tencent.maas.model.MJTemplateMetadata
                java.lang.String r10 = r6.getTemplateID()
                long r11 = r6.getTemplateDescVersion()
                java.lang.String r13 = r6.getTemplateDescURL()
                long r14 = r6.getMinimumiOSSDKVersion()
                long r16 = r6.getMinimumAndroidSDKVersion()
                r9 = r1
                r9.<init>(r10, r11, r13, r14, r16)
            L_0x010b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: qa0.C62595e.C62596a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final MJTemplateMetadata onRequestTemplateMetadata(String str) {
        C87412m.m108594g(str, "templateId");
        return (MJTemplateMetadata) C53895h.m60468f((C66212f) null, new C62596a(str, (C15601d<? super C62596a>) null), 1, (Object) null);
    }
}
