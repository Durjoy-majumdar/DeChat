package xc0;

import a14.C0000n0;
import a14.C53934p0;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C51712vn;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: xc0.e */
public final class C78789e {

    /* renamed from: a */
    public static final C78790a f230535a = new C78790a((C8480h) null);

    /* renamed from: b */
    public static C78793b f230536b;

    /* renamed from: c */
    public static LinkedList<C51712vn> f230537c = new LinkedList<>();

    /* renamed from: d */
    public static int f230538d;

    /* renamed from: xc0.e$a */
    public static final class C78790a {

        /* renamed from: xc0.e$a$a */
        public /* synthetic */ class C78791a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f230539a;

            static {
                int[] iArr = new int[C92798v.C92799a.values().length];
                iArr[5] = 1;
                f230539a = iArr;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.modelremark.RemarkCdnUploadServicePLC$Companion$startUpload$1", mo125469f = "RemarkCdnUploadServicePLC.kt", mo125470l = {34}, mo125471m = "invokeSuspend")
        /* renamed from: xc0.e$a$b */
        public static final class C78792b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f230540d;

            /* renamed from: e */
            public Object f230541e;

            /* renamed from: f */
            public int f230542f;

            /* renamed from: g */
            public final /* synthetic */ ArrayList<String> f230543g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C78792b(ArrayList<String> arrayList, C15601d<? super C78792b> dVar) {
                super(2, dVar);
                this.f230543g = arrayList;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C78792b(this.f230543g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C78792b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                Iterator<T> it;
                int i;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i2 = this.f230542f;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    i = 0;
                    it = this.f230543g.iterator();
                } else if (i2 == 1) {
                    i = this.f230540d;
                    it = (Iterator) this.f230541e;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                while (it.hasNext()) {
                    T next = it.next();
                    int i3 = i + 1;
                    if (i >= 0) {
                        C78790a aVar2 = C78789e.f230535a;
                        this.f230541e = it;
                        this.f230540d = i3;
                        this.f230542f = 1;
                        if (C78790a.m95193a(aVar2, (String) next, i, this) == aVar) {
                            return aVar;
                        }
                        i = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C78790a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object m95193a(xc0.C78789e.C78790a r11, java.lang.String r12, int r13, wx3.C15601d r14) {
            /*
                r11.getClass()
                boolean r13 = r14 instanceof xc0.C78794f
                if (r13 == 0) goto L_0x0016
                r13 = r14
                xc0.f r13 = (xc0.C78794f) r13
                int r0 = r13.f230546f
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L_0x0016
                int r0 = r0 - r1
                r13.f230546f = r0
                goto L_0x001b
            L_0x0016:
                xc0.f r13 = new xc0.f
                r13.<init>(r11, r14)
            L_0x001b:
                java.lang.Object r11 = r13.f230544d
                xx3.a r14 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r13.f230546f
                r8 = 3
                r9 = 2
                r10 = 1
                if (r0 == 0) goto L_0x003b
                if (r0 == r10) goto L_0x0037
                if (r0 != r9) goto L_0x002f
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0111
            L_0x002f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0037:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0095
            L_0x003b:
                kotlin.ResultKt.throwOnFailure(r11)
                gi.g r1 = new gi.g
                r1.<init>()
                java.lang.String r11 = "task_NetSceneUploadCardImg"
                r1.f287660d = r11
                r11 = 274(0x112, float:3.84E-43)
                r1.field_appType = r11
                r11 = 20304(0x4f50, float:2.8452E-41)
                r1.field_fileType = r11
                r1.f287663g = r8
                r1.field_fullpath = r12
                java.lang.String r11 = com.tencent.mars.cdn.CdnLogic.createAeskey()
                r1.field_aesKey = r11
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r12)
                java.lang.String r12 = "getMD5String(remarkImgPath)"
                gy3.C87412m.m108593f(r11, r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "upload_"
                r12.append(r0)
                r12.append(r11)
                java.lang.String r11 = r12.toString()
                r1.field_mediaId = r11
                java.lang.Class<qo.i> r11 = p663qo.C77384i.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                java.lang.String r12 = "getService(ICdnFeatureService::class.java)"
                gy3.C87412m.m108593f(r11, r12)
                r0 = r11
                qo.i r0 = (p663qo.C77384i) r0
                r2 = 0
                r4 = 0
                r6 = 6
                r7 = 0
                r13.f230546f = r10
                r5 = r13
                java.lang.Object r11 = p663qo.C77384i.C77385a.m93302b(r0, r1, r2, r4, r5, r6, r7)
                if (r11 != r14) goto L_0x0095
                goto L_0x0113
            L_0x0095:
                com.tencent.mm.modelcdntran.v r11 = (com.tencent.p014mm.modelcdntran.C92798v) r11
                if (r11 == 0) goto L_0x0111
                xc0.e$a r12 = xc0.C78789e.f230535a
                r13.f230546f = r9
                com.tencent.mm.modelcdntran.v$a r12 = r11.f267130a
                int[] r13 = xc0.C78789e.C78790a.C78791a.f230539a
                int r12 = r12.ordinal()
                r12 = r13[r12]
                if (r12 != r10) goto L_0x010c
                te3.vn r12 = new te3.vn
                r12.<init>()
                gi.d r13 = r11.f267135f
                gy3.C87412m.m108591d(r13)
                java.lang.String r13 = r13.field_aesKey
                r12.f143571e = r13
                gi.d r11 = r11.f267135f
                gy3.C87412m.m108591d(r11)
                java.lang.String r11 = r11.field_fileUrl
                r12.f143570d = r11
                java.util.LinkedList<te3.vn> r11 = xc0.C78789e.f230537c
                r11.add(r12)
                java.lang.Object[] r11 = new java.lang.Object[r8]
                java.lang.String r13 = r12.f143571e
                r0 = 0
                r11[r0] = r13
                java.lang.String r12 = r12.f143570d
                r11[r10] = r12
                java.util.LinkedList<te3.vn> r12 = xc0.C78789e.f230537c
                int r12 = r12.size()
                java.lang.Integer r13 = new java.lang.Integer
                r13.<init>(r12)
                r11[r9] = r13
                java.lang.String r12 = "MicroMsg.RemarkCdnUploadServicePLC"
                java.lang.String r13 = "onUploadRemarkImgSuccess cdnAesKey:%s cdnUrl:%s, cardImgInfoListSize:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r11)
                java.util.LinkedList<te3.vn> r11 = xc0.C78789e.f230537c
                int r11 = r11.size()
                int r13 = xc0.C78789e.f230538d
                if (r11 != r13) goto L_0x010c
                java.lang.Object[] r11 = new java.lang.Object[r10]
                java.util.LinkedList<te3.vn> r13 = xc0.C78789e.f230537c
                int r13 = r13.size()
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r13)
                r11[r0] = r1
                java.lang.String r13 = "uplaod finish size:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r11)
                xc0.e$b r11 = xc0.C78789e.f230536b
                if (r11 == 0) goto L_0x010c
                java.util.LinkedList<te3.vn> r12 = xc0.C78789e.f230537c
                r11.mo103578a(r10, r12)
            L_0x010c:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                if (r11 != r14) goto L_0x0111
                goto L_0x0113
            L_0x0111:
                rx3.b0 r14 = rx3.C13598b0.f38549a
            L_0x0113:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: xc0.C78789e.C78790a.m95193a(xc0.e$a, java.lang.String, int, wx3.d):java.lang.Object");
        }

        /* renamed from: b */
        public final void mo108703b(ArrayList<String> arrayList, LifecycleScope lifecycleScope, C78793b bVar) {
            C87412m.m108594g(arrayList, "imgPathList");
            C87412m.m108594g(lifecycleScope, "scope");
            C87412m.m108594g(bVar, "uploadCallback");
            C78789e.f230537c.clear();
            C78789e.f230538d = arrayList.size();
            C78789e.f230536b = bVar;
            LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C78792b(arrayList, (C15601d<? super C78792b>) null), 1, (Object) null);
        }
    }

    /* renamed from: xc0.e$b */
    public interface C78793b {
        /* renamed from: a */
        void mo103578a(boolean z, LinkedList<C51712vn> linkedList);
    }
}
