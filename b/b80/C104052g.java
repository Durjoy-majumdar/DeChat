package b80;

import a14.C0000n0;
import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p156gj.C107848z;
import rx3.C13598b0;
import v70.C111389d;
import v70.C111396f;
import v70.C111406s;
import w70.C111737a;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: b80.g */
public final class C104052g implements Camera.PreviewCallback {

    /* renamed from: d */
    public final /* synthetic */ C104043f f307747d;

    /* renamed from: e */
    public final /* synthetic */ C107848z f307748e;

    @C91590f(mo125468c = "com.tencent.mm.media.camera.instance.camera1.Camera1Impl$setPreviewCallbackBuffer$1$1", mo125469f = "Camera1Impl.kt", mo125470l = {313}, mo125471m = "invokeSuspend")
    /* renamed from: b80.g$a */
    public static final class C104053a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f307749d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f307750e;

        /* renamed from: f */
        public final /* synthetic */ C104043f f307751f;

        /* renamed from: g */
        public final /* synthetic */ C107848z f307752g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104053a(byte[] bArr, C104043f fVar, C107848z zVar, C15601d<? super C104053a> dVar) {
            super(2, dVar);
            this.f307750e = bArr;
            this.f307751f = fVar;
            this.f307752g = zVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C104053a(this.f307750e, this.f307751f, this.f307752g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C104053a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f307749d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                byte[] bArr = this.f307750e;
                if (bArr != null) {
                    C87412m.m108593f(bArr, "data");
                    if (!(bArr.length == 0)) {
                        C111389d dVar = this.f307751f.f304629h;
                        if (dVar != null) {
                            byte[] bArr2 = this.f307750e;
                            C87412m.m108593f(bArr2, "data");
                            this.f307749d = 1;
                            C66218h hVar = new C66218h(C66447b.m78392b(this));
                            Log.m105926v("MicroMsg.Camera.GLEnvBuilder", "availableListener");
                            C111737a.f334621a.mo163453b();
                            dVar.mo163057o(new C111396f(dVar, bArr2, hVar, (C15601d<? super C111396f>) null));
                            Object b = hVar.mo90314b();
                            if (b != aVar) {
                                b = C13598b0.f38549a;
                            }
                            if (b == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
                Log.m105920e("MicroMsg.Camera.Camera1Impl", "onPreviewFrame, frame data is null!!");
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f307752g.mo158257a(this.f307750e);
            return C13598b0.f38549a;
        }
    }

    public C104052g(C104043f fVar, C107848z zVar) {
        this.f307747d = fVar;
        this.f307748e = zVar;
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        C104043f fVar = this.f307747d;
        C111406s sVar = fVar.f304628g;
        if (sVar != null) {
            sVar.mo163061C("bufferUpdateFrame", new C104053a(bArr, fVar, this.f307748e, (C15601d<? super C104053a>) null));
        }
    }
}
