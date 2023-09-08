package v70;

import a14.C0000n0;
import android.graphics.SurfaceTexture;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p80.C110193b;
import p80.C110194c;
import rx3.C13598b0;
import v70.C111389d;
import wx3.C15601d;
import y70.C38971a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.GLEnvBuilder$getGLInputTexture$2", mo125469f = "GLEnvBuilder.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: v70.i */
public final class C111399i extends C91594j implements C32227p<C0000n0, C15601d<? super SurfaceTexture>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C111389d f333514d;

    /* renamed from: e */
    public final /* synthetic */ boolean f333515e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111399i(C111389d dVar, boolean z, C15601d<? super C111399i> dVar2) {
        super(2, dVar2);
        this.f333514d = dVar;
        this.f333515e = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111399i(this.f333514d, this.f333515e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111399i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C111389d dVar;
        SurfaceTexture surfaceTexture;
        C111389d dVar2;
        SurfaceTexture surfaceTexture2;
        ResultKt.throwOnFailure(obj);
        C111389d dVar3 = this.f333514d;
        if (dVar3.f333480h == null) {
            dVar3.f333479g = C110193b.m149776b(false, 21);
            C111389d dVar4 = this.f333514d;
            C110194c cVar = dVar4.f333479g;
            if (cVar != null) {
                int i = dVar4.f333482j.f320923b.f320920a;
                int i2 = this.f333514d.f333482j.f320923b.f320921b;
                cVar.f329657j = i;
                cVar.f329658n = i2;
            }
            C111389d dVar5 = this.f333514d;
            C110194c cVar2 = this.f333514d.f333479g;
            C87412m.m108591d(cVar2);
            dVar5.f333480h = new SurfaceTexture(cVar2.f329652e);
            if (!(C38971a.f104993a.mo61854b() == 1 || (surfaceTexture2 = dVar2.f333480h) == null)) {
                surfaceTexture2.setDefaultBufferSize((dVar2 = this.f333514d).f333482j.f320923b.f320920a, this.f333514d.f333482j.f320923b.f320921b);
            }
            if (this.f333515e && (surfaceTexture = dVar.f333480h) != null) {
                surfaceTexture.setOnFrameAvailableListener(new C111389d.C111393d((dVar = this.f333514d).f333492w));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getGLInputTexture [");
            SurfaceTexture surfaceTexture3 = this.f333514d.f333480h;
            sb.append(surfaceTexture3 != null ? new Integer(surfaceTexture3.hashCode()) : null);
            sb.append("] thread-id:[");
            sb.append(Process.myTid());
            sb.append("] name:");
            sb.append(Thread.currentThread().getName());
            sb.append(" texturePreview:");
            sb.append(this.f333515e);
            Log.m105924i("MicroMsg.Camera.GLEnvBuilder", sb.toString());
        }
        SurfaceTexture surfaceTexture4 = this.f333514d.f333480h;
        C87412m.m108591d(surfaceTexture4);
        return surfaceTexture4;
    }
}
