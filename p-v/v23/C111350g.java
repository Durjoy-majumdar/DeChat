package v23;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import sp3.C110807k;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.timelineeditor.TimelineEditorCorePlugin$updateIndexTrackDuration$2", mo125469f = "TimelineEditorCorePlugin.kt", mo125470l = {327}, mo125471m = "invokeSuspend")
/* renamed from: v23.g */
public final class C111350g extends C91594j implements C32227p<C0000n0, C15601d<? super C110807k>, Object> {

    /* renamed from: d */
    public int f333361d;

    /* renamed from: e */
    public final /* synthetic */ int f333362e;

    /* renamed from: f */
    public final /* synthetic */ C111348f f333363f;

    /* renamed from: g */
    public final /* synthetic */ long f333364g;

    /* renamed from: h */
    public final /* synthetic */ long f333365h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111350g(int i, C111348f fVar, long j, long j2, C15601d<? super C111350g> dVar) {
        super(2, dVar);
        this.f333362e = i;
        this.f333363f = fVar;
        this.f333364g = j;
        this.f333365h = j2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111350g(this.f333362e, this.f333363f, this.f333364g, this.f333365h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111350g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r1 = r1.f331511l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f333361d
            r2 = 1
            if (r1 == 0) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x005f
        L_0x000d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0015:
            kotlin.ResultKt.throwOnFailure(r14)
            int r14 = r13.f333362e
            v23.f r1 = r13.f333363f
            sp3.k r1 = r1.f333357h
            if (r1 == 0) goto L_0x0029
            java.util.ArrayList<sp3.c> r1 = r1.f331511l
            if (r1 == 0) goto L_0x0029
            int r1 = r1.size()
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r14 >= r1) goto L_0x005f
            v23.f r14 = r13.f333363f
            sp3.k r14 = r14.f333357h
            gy3.C87412m.m108591d(r14)
            java.util.ArrayList<sp3.c> r14 = r14.f331511l
            int r1 = r13.f333362e
            java.lang.Object r14 = r14.get(r1)
            sp3.c r14 = (sp3.C110801c) r14
            long r3 = r14.f331463a
            v23.f r11 = r13.f333363f
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r3)
            long r6 = r13.f333364g
            long r8 = r13.f333365h
            r13.f333361d = r2
            r11.getClass()
            a14.h0 r14 = a14.C53872d1.f151119c
            v23.h r1 = new v23.h
            r12 = 0
            r5 = r1
            r5.<init>(r6, r8, r10, r11, r12)
            java.lang.Object r14 = a14.C53895h.m60469g(r14, r1, r13)
            if (r14 != r0) goto L_0x005f
            return r0
        L_0x005f:
            v23.f r14 = r13.f333363f
            sp3.k r14 = r14.f333357h
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: v23.C111350g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
