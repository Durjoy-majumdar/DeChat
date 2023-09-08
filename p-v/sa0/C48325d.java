package sa0;

import a14.C0000n0;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.qf4;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MusicVideoResManager$getResourceList$2", mo125469f = "MusicVideoResManager.kt", mo125470l = {32, 38}, mo125471m = "invokeSuspend")
/* renamed from: sa0.d */
public final class C48325d extends C91594j implements C32227p<C0000n0, C15601d<? super LinkedList<qf4>>, Object> {

    /* renamed from: d */
    public Object f129391d;

    /* renamed from: e */
    public int f129392e;

    /* renamed from: f */
    public /* synthetic */ Object f129393f;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MusicVideoResManager$getResourceList$2$1$1", mo125469f = "MusicVideoResManager.kt", mo125470l = {35}, mo125471m = "invokeSuspend")
    /* renamed from: sa0.d$a */
    public static final class C48326a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f129394d;

        /* renamed from: e */
        public int f129395e;

        /* renamed from: f */
        public final /* synthetic */ qf4 f129396f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48326a(qf4 qf4, C15601d<? super C48326a> dVar) {
            super(2, dVar);
            this.f129396f = qf4;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C48326a(this.f129396f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C48326a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            qf4 qf4;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f129395e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                qf4 qf42 = this.f129396f;
                C87412m.m108593f(qf42, LocaleUtil.ITALIAN);
                this.f129394d = qf42;
                this.f129395e = 1;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                String d = VFSStrategy.m163776d("maas_music_demo_resource");
                C86013q1.m106461v(d);
                String i2 = C86013q1.m106448i(d + XVFSFile.SEPARATOR_CHAR + qf42.f140287f, true);
                if (i2 == null) {
                    hVar.resumeWith(Result.m168114constructorimpl((Object) null));
                    Log.m105920e("MicroMsg.Maas.MusicVideoResManager", "get path error");
                } else {
                    C86009m1 m1Var = new C86009m1(i2);
                    if (!m1Var.mo119967g() || m1Var.mo119980r() <= 0) {
                        CdnLogic.startSNSDownload(CdnLogic.createSNSDownload(qf42.f140287f, qf42.f140286e, 251, qf42.f140285d == 1 ? 20304 : CdnLogic.kMediaTypeAppVideo, i2), (CdnLogic.VideoStreamingCallback) null, new C48324c(qf42, i2, m1Var, hVar), 0);
                    } else {
                        Log.m105924i("MicroMsg.Maas.MusicVideoResManager", qf42.f140287f + ' ' + qf42.f140285d + " already cached at " + i2 + ", fileSize: " + m1Var.mo119980r() + ", url: " + qf42.f140286e);
                        hVar.resumeWith(Result.m168114constructorimpl(i2));
                    }
                }
                Object b = hVar.mo90314b();
                if (b == aVar) {
                    return aVar;
                }
                qf4 = qf42;
                obj = b;
            } else if (i == 1) {
                qf4 = (qf4) this.f129394d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qf4.f140286e = (String) obj;
            return C13598b0.f38549a;
        }
    }

    public C48325d(C15601d<? super C48325d> dVar) {
        super(2, dVar);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C48325d dVar2 = new C48325d(dVar);
        dVar2.f129393f = obj;
        return dVar2;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C48325d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: a14.n0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f129392e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            java.lang.Object r1 = r13.f129391d
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r13.f129393f
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x007a
        L_0x0018:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0020:
            java.lang.Object r1 = r13.f129393f
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x003d
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f129393f
            r1 = r14
            a14.n0 r1 = (a14.C0000n0) r1
            qa0.a r14 = qa0.C47792a.f128329a
            r13.f129393f = r1
            r13.f129392e = r3
            java.lang.Object r14 = r14.mo72570c(r13)
            if (r14 != r0) goto L_0x003d
            return r0
        L_0x003d:
            te3.w92 r14 = (te3.C51804w92) r14
            r10 = 0
            if (r14 == 0) goto L_0x0045
            java.util.LinkedList<te3.qf4> r14 = r14.f143935d
            goto L_0x0046
        L_0x0045:
            r14 = r10
        L_0x0046:
            if (r14 == 0) goto L_0x0095
            java.util.ArrayList r11 = new java.util.ArrayList
            r4 = 10
            int r4 = sx3.C36907w.m41090l(r14, r4)
            r11.<init>(r4)
            java.util.Iterator r12 = r14.iterator()
        L_0x0057:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0075
            java.lang.Object r4 = r12.next()
            te3.qf4 r4 = (te3.qf4) r4
            r5 = 0
            r6 = 0
            sa0.d$a r7 = new sa0.d$a
            r7.<init>(r4, r10)
            r8 = 3
            r9 = 0
            r4 = r1
            a14.u0 r4 = a14.C53895h.m60464b(r4, r5, r6, r7, r8, r9)
            r11.add(r4)
            goto L_0x0057
        L_0x0075:
            java.util.Iterator r1 = r11.iterator()
            r4 = r14
        L_0x007a:
            r14 = r13
        L_0x007b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0094
            java.lang.Object r5 = r1.next()
            a14.u0 r5 = (a14.C53953u0) r5
            r14.f129393f = r4
            r14.f129391d = r1
            r14.f129392e = r2
            java.lang.Object r5 = r5.mo74634A(r14)
            if (r5 != r0) goto L_0x007b
            return r0
        L_0x0094:
            r14 = r4
        L_0x0095:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            if (r14 == 0) goto L_0x00ca
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x00a5:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r14.next()
            r4 = r2
            te3.qf4 r4 = (te3.qf4) r4
            java.lang.String r4 = r4.f140286e
            if (r4 == 0) goto L_0x00bf
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r4 = 0
            goto L_0x00c0
        L_0x00bf:
            r4 = 1
        L_0x00c0:
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x00a5
            r1.add(r2)
            goto L_0x00a5
        L_0x00c7:
            r0.addAll(r1)
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sa0.C48325d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
