package p647po;

import a14.C53860b3;
import a14.C53934p0;
import com.tencent.p014mm.modelcdntran.C55382f;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.modelcdntran.C68104e;
import com.tencent.p014mm.modelcdntran.C92738a;
import com.tencent.p014mm.modelcdntran.C92750b0;
import com.tencent.p014mm.modelcdntran.C92769g;
import com.tencent.p014mm.modelcdntran.C92774h;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58097y0;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import p1081gi.C98124g;
import p663qo.C77384i;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C86522b
/* renamed from: po.c */
public final class C100829c extends C86301e implements C77384i {

    @C91590f(mo125468c = "com.tencent.mm.feature.cdn.CdnFeatureService", mo125469f = "CdnFeatureService.kt", mo125470l = {85}, mo125471m = "isTaskDownloading")
    /* renamed from: po.c$a */
    public static final class C100830a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f295338d;

        /* renamed from: e */
        public final /* synthetic */ C100829c f295339e;

        /* renamed from: f */
        public int f295340f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100830a(C100829c cVar, C15601d<? super C100830a> dVar) {
            super(dVar);
            this.f295339e = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f295338d = obj;
            this.f295340f |= Integer.MIN_VALUE;
            return this.f295339e.mo107506oY((String) null, this);
        }
    }

    public Object L70(C98124g gVar, long j, WeakReference<C92750b0> weakReference, C15601d<? super C92798v> dVar) {
        C68104e.f195751a.getClass();
        return C53860b3.m60375c(j, new C92774h(gVar, weakReference, (C15601d<? super C92774h>) null), dVar);
    }

    public C58097y0<C92798v> Mi0(C98124g gVar) {
        C87412m.m108594g(gVar, "task");
        C92738a Ax0 = C92779i0.Ax0();
        if (Ax0 != null) {
            return Ax0.mo126977o3(gVar);
        }
        return null;
    }

    public String Rl0(String str, WeakReference<C55384i> weakReference) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(weakReference, "listenerRef");
        return C68104e.f195751a.mo93612a(str, weakReference);
    }

    /* renamed from: VO */
    public Object mo107503VO(C98124g gVar, long j, WeakReference<C92750b0> weakReference, C15601d<? super C92798v> dVar) {
        C68104e.f195751a.getClass();
        return C53860b3.m60375c(j, new C92769g(gVar, weakReference, (C15601d<? super C92769g>) null), dVar);
    }

    /* renamed from: hs */
    public C98124g mo107504hs(C98124g gVar, WeakReference<C55384i> weakReference) {
        C87412m.m108594g(gVar, "taskInfo");
        C87412m.m108594g(weakReference, "listenerRef");
        return C68104e.f195751a.mo93613b(gVar, weakReference);
    }

    /* renamed from: nD */
    public C58097y0<C92798v> mo107505nD(String str) {
        C87412m.m108594g(str, "mediaId");
        C92738a Ax0 = C92779i0.Ax0();
        if (Ax0 != null) {
            return Ax0.mo126971i3(str);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: oY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo107506oY(java.lang.String r5, wx3.C15601d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p647po.C100829c.C100830a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            po.c$a r0 = (p647po.C100829c.C100830a) r0
            int r1 = r0.f295340f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f295340f = r1
            goto L_0x0018
        L_0x0013:
            po.c$a r0 = new po.c$a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f295338d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f295340f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r6)
            com.tencent.mm.modelcdntran.a r6 = com.tencent.p014mm.modelcdntran.C92779i0.Ax0()
            if (r6 == 0) goto L_0x0048
            r0.f295340f = r3
            java.lang.Object r6 = r6.mo126975m3(r5, r0)
            if (r6 != r1) goto L_0x0041
            return r1
        L_0x0041:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p647po.C100829c.mo107506oY(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: vL */
    public C98124g mo107507vL(C98124g gVar, WeakReference<C55384i> weakReference) {
        C87412m.m108594g(gVar, "taskInfo");
        C87412m.m108594g(weakReference, "listenerRef");
        C68104e.f195751a.getClass();
        Log.m105924i("MicroMsg.Cdn.CdnFSCJavaHelper", "startCdnUpload taskInfo field_mediaId:" + gVar.field_mediaId);
        C92738a Ax0 = C92779i0.Ax0();
        C58097y0<C92798v> o3 = Ax0 != null ? Ax0.mo126977o3(gVar) : null;
        if (o3 == null) {
            return null;
        }
        LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
        if (lifecycleScope == null) {
            return gVar;
        }
        LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C55382f(o3, weakReference, (C15601d<? super C55382f>) null), 1, (Object) null);
        return gVar;
    }

    /* renamed from: xZ */
    public C58097y0<C92798v> mo107508xZ(C98124g gVar) {
        C87412m.m108594g(gVar, "task");
        C92738a Ax0 = C92779i0.Ax0();
        if (Ax0 != null) {
            return Ax0.mo126976n3(gVar);
        }
        return null;
    }
}
