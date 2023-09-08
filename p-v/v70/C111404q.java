package v70;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$updateInputSize$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.q */
public final class C111404q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C111389d f333523d;

    /* renamed from: e */
    public final /* synthetic */ int f333524e;

    /* renamed from: f */
    public final /* synthetic */ int f333525f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111404q(C111389d dVar, int i, int i2, C15601d<? super C111404q> dVar2) {
        super(2, dVar2);
        this.f333523d = dVar;
        this.f333524e = i;
        this.f333525f = i2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111404q(this.f333523d, this.f333524e, this.f333525f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111404q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0068, code lost:
        r4 = r3.f333523d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.ResultKt.throwOnFailure(r4)
            h80.a r4 = h80.C108171a.f323903a
            v70.d r0 = r3.f333523d
            int r0 = r0.f333476d
            int r1 = r3.f333524e
            int r2 = r3.f333525f
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r4 = r4.mo158577a(r0)
            if (r4 == 0) goto L_0x0017
            r4.f310091j = r1
            r4.f310092k = r2
        L_0x0017:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "setCameraSize:["
            r4.append(r0)
            int r0 = r3.f333524e
            r4.append(r0)
            r0 = 32
            r4.append(r0)
            int r0 = r3.f333525f
            r4.append(r0)
            r0 = 93
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "MicroMsg.Camera.GLEnvBuilder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            v70.d r4 = r3.f333523d
            e80.j r4 = r4.f333482j
            int r0 = r3.f333524e
            int r1 = r3.f333525f
            e80.i r2 = r4.f320923b
            r2.f320920a = r0
            e80.i r0 = r4.f320923b
            r0.f320921b = r1
            r4.mo157743a()
            v70.d r4 = r3.f333523d
            p80.c r4 = r4.f333479g
            if (r4 == 0) goto L_0x005f
            int r0 = r3.f333524e
            int r1 = r3.f333525f
            r4.f329657j = r0
            r4.f329658n = r1
        L_0x005f:
            y70.a r4 = y70.C38971a.f104993a
            int r4 = r4.mo61854b()
            r0 = 1
            if (r4 == r0) goto L_0x007f
            v70.d r4 = r3.f333523d
            android.graphics.SurfaceTexture r0 = r4.f333480h
            if (r0 == 0) goto L_0x007f
            e80.j r4 = r4.f333482j
            e80.i r4 = r4.f320923b
            int r4 = r4.f320920a
            v70.d r1 = r3.f333523d
            e80.j r1 = r1.f333482j
            e80.i r1 = r1.f320923b
            int r1 = r1.f320921b
            r0.setDefaultBufferSize(r4, r1)
        L_0x007f:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v70.C111404q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
