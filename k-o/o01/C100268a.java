package o01;

import a14.C0000n0;
import a14.C53934p0;
import com.tencent.p014mm.modelcdntran.C92738a;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.ProcessorPipelineComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58097y0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13600d;
import wb0.C102382b;
import wb0.C102383c;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: o01.a */
public final class C100268a extends ProcessorPipelineComponent<C102382b, C102383c> {

    @C91590f(mo125468c = "com.tencent.mm.plugin.cdn.imageloader.ppc.CdnCommonLoadDataFromRemotePPC$onCancel$1", mo125469f = "CdnCommonLoadDataFromRemotePPC.kt", mo125470l = {33}, mo125471m = "invokeSuspend")
    /* renamed from: o01.a$a */
    public static final class C100269a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f293754d;

        /* renamed from: e */
        public final /* synthetic */ C58097y0<C92798v> f293755e;

        /* renamed from: o01.a$a$a */
        public static final class C100270a<T> implements C45253g {

            /* renamed from: d */
            public static final C100270a<T> f293756d = new C100270a<>();

            public Object emit(Object obj, C15601d dVar) {
                C92798v vVar = (C92798v) obj;
                Log.m105924i("MicroMsg.CdnCommonLoadDataFromRemotePPC", "onCancel " + vVar.f267131b + ' ' + vVar.f267130a + ' ' + vVar.f267132c);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100269a(C58097y0<C92798v> y0Var, C15601d<? super C100269a> dVar) {
            super(2, dVar);
            this.f293755e = y0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C100269a(this.f293755e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C100269a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f293754d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58097y0<C92798v> y0Var = this.f293755e;
                if (y0Var == null) {
                    return C13598b0.f38549a;
                }
                C100270a<T> aVar2 = C100270a.f293756d;
                this.f293754d = 1;
                if (y0Var.mo31880a(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            throw new C13600d();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cdn.imageloader.ppc.CdnCommonLoadDataFromRemotePPC", mo125469f = "CdnCommonLoadDataFromRemotePPC.kt", mo125470l = {66}, mo125471m = "processAction")
    /* renamed from: o01.a$b */
    public static final class C100271b extends C66704d {

        /* renamed from: d */
        public Object f293757d;

        /* renamed from: e */
        public Object f293758e;

        /* renamed from: f */
        public Object f293759f;

        /* renamed from: g */
        public Object f293760g;

        /* renamed from: h */
        public /* synthetic */ Object f293761h;

        /* renamed from: i */
        public final /* synthetic */ C100268a f293762i;

        /* renamed from: j */
        public int f293763j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100271b(C100268a aVar, C15601d<? super C100271b> dVar) {
            super(dVar);
            this.f293762i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f293761h = obj;
            this.f293763j |= Integer.MIN_VALUE;
            return this.f293762i.processAction((PipelineState) null, (C102382b) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100268a(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        if ((r0 != null ? r0.f267130a : null) == com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadCallbackFindLocal) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object processAction(com.tencent.p014mm.sdk.pipeline.PipelineState r10, wb0.C102382b r11, wx3.C15601d<? super wb0.C102383c> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof o01.C100268a.C100271b
            if (r0 == 0) goto L_0x0013
            r0 = r12
            o01.a$b r0 = (o01.C100268a.C100271b) r0
            int r1 = r0.f293763j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f293763j = r1
            goto L_0x0018
        L_0x0013:
            o01.a$b r0 = new o01.a$b
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f293761h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f293763j
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r10 = r0.f293760g
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r0.f293759f
            wb0.a r11 = (wb0.C65945a) r11
            java.lang.Object r0 = r0.f293758e
            wb0.b r0 = (wb0.C102382b) r0
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r12
            r12 = r11
            r11 = r0
            r0 = r8
            goto L_0x00ce
        L_0x0039:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.String r12 = "KeyCdnParams"
            java.lang.Object r10 = r10.get(r12)
            wb0.a r10 = (wb0.C65945a) r10
            if (r10 == 0) goto L_0x015c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = r11.f301541b
            r12.append(r2)
            java.lang.String r2 = "_temp"
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            java.lang.String r2 = r11.f301540a
            java.lang.String r5 = "key"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.String r5 = "fullPath"
            gy3.C87412m.m108594g(r12, r5)
            gi.g r5 = new gi.g
            r5.<init>()
            java.lang.String r6 = "task_Cdn_Image_Loader"
            r5.f287660d = r6
            r5.field_mediaId = r2
            r5.field_fullpath = r12
            int r2 = r10.f189600d
            r5.field_fileType = r2
            long r6 = r10.f189603g
            int r7 = (int) r6
            r5.field_totalLen = r7
            java.lang.String r6 = r10.f189602f
            r5.field_filemd5 = r6
            r6 = 3
            r5.field_priority = r6
            r6 = 19
            if (r2 == r6) goto L_0x0099
            java.lang.String r2 = r10.f189599c
            r5.field_aesKey = r2
            java.lang.String r2 = r10.f189598b
            r5.field_fileId = r2
            goto L_0x00a5
        L_0x0099:
            java.lang.String r2 = r10.f189605i
            r5.field_authKey = r2
            java.lang.String r2 = r10.f189598b
            r5.f287672s = r2
            java.lang.String r2 = r10.f189599c
            r5.field_aesKey = r2
        L_0x00a5:
            java.lang.String r2 = r10.f189604h
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            r5.field_chattype = r2
            com.tencent.mm.modelcdntran.e$a r2 = com.tencent.p014mm.modelcdntran.C68104e.f195751a
            r0.f293757d = r9
            r0.f293758e = r11
            r0.f293759f = r10
            r0.f293760g = r12
            r0.f293763j = r3
            r6 = 60000(0xea60, double:2.9644E-319)
            r2.getClass()
            com.tencent.mm.modelcdntran.g r2 = new com.tencent.mm.modelcdntran.g
            r2.<init>(r5, r4, r4)
            java.lang.Object r0 = a14.C53860b3.m60375c(r6, r2, r0)
            if (r0 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            r8 = r12
            r12 = r10
            r10 = r8
        L_0x00ce:
            com.tencent.mm.modelcdntran.v r0 = (com.tencent.p014mm.modelcdntran.C92798v) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getBitmapFromFile "
            r1.append(r2)
            if (r0 == 0) goto L_0x00df
            java.lang.String r2 = r0.f267131b
            goto L_0x00e0
        L_0x00df:
            r2 = r4
        L_0x00e0:
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            if (r0 == 0) goto L_0x00ed
            com.tencent.mm.modelcdntran.v$a r5 = r0.f267130a
            goto L_0x00ee
        L_0x00ed:
            r5 = r4
        L_0x00ee:
            r1.append(r5)
            r1.append(r2)
            if (r0 == 0) goto L_0x00fe
            int r2 = r0.f267132c
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r2)
            goto L_0x00ff
        L_0x00fe:
            r5 = r4
        L_0x00ff:
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.CdnCommonLoadDataFromRemotePPC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r0 == 0) goto L_0x0110
            com.tencent.mm.modelcdntran.v$a r1 = r0.f267130a
            goto L_0x0111
        L_0x0110:
            r1 = r4
        L_0x0111:
            com.tencent.mm.modelcdntran.v$a r5 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadCallbackSuccess
            if (r1 == r5) goto L_0x011f
            if (r0 == 0) goto L_0x011a
            com.tencent.mm.modelcdntran.v$a r0 = r0.f267130a
            goto L_0x011b
        L_0x011a:
            r0 = r4
        L_0x011b:
            com.tencent.mm.modelcdntran.v$a r1 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadCallbackFindLocal
            if (r0 != r1) goto L_0x0152
        L_0x011f:
            java.lang.String r0 = r11.f301541b
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106463x(r10, r0)
            java.lang.String r0 = r11.f301541b
            java.lang.String r12 = r12.f189601e
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r12, r3)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r3 = "loadFromRemote moveResult:"
            r12.append(r3)
            r12.append(r10)
            java.lang.String r10 = " copyLength:"
            r12.append(r10)
            r12.append(r0)
            java.lang.String r10 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            java.lang.String r10 = r11.f301541b
            r12 = 0
            r0 = -1
            byte[] r4 = com.tencent.p014mm.vfs.C86013q1.m106433O(r10, r12, r0)
        L_0x0152:
            wb0.c r10 = new wb0.c
            java.lang.String r12 = r11.f301540a
            java.lang.String r11 = r11.f301541b
            r10.<init>(r12, r11, r4)
            goto L_0x0165
        L_0x015c:
            wb0.c r10 = new wb0.c
            java.lang.String r12 = r11.f301540a
            java.lang.String r11 = r11.f301541b
            r10.<init>(r12, r11, r4)
        L_0x0165:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o01.C100268a.processAction(com.tencent.mm.sdk.pipeline.PipelineState, wb0.b, wx3.d):java.lang.Object");
    }

    public void onCancel() {
        String string = state().getString("Common_ImageKey", "");
        if (!C112551y.m153811k(string)) {
            C92738a Ax0 = C92779i0.Ax0();
            LifecycleScope.launchDefault$default(getScope(), (C53934p0) null, new C100269a(Ax0 != null ? Ax0.mo126971i3(string) : null, (C15601d<? super C100269a>) null), 1, (Object) null);
        }
    }
}
