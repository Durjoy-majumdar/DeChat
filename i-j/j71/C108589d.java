package j71;

import ac3.C103355g1;
import android.opengl.GLES20;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p80.C110194c;
import rx3.C13598b0;

/* renamed from: j71.d */
public final class C108589d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108587c f325066d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108589d(C108587c cVar) {
        super(0);
        this.f325066d = cVar;
    }

    public Object invoke() {
        C108591i iVar = this.f325066d.f325060i;
        if (iVar != null) {
            Log.m105924i("MicroMsg.EmojiCaptureMixRenderer", "release: ");
            C110194c cVar = iVar.f325085f;
            if (cVar != null) {
                cVar.close();
            }
            C110194c cVar2 = iVar.f325087h;
            if (cVar2 != null) {
                cVar2.close();
            }
            C110194c cVar3 = iVar.f325071B;
            if (cVar3 != null) {
                cVar3.close();
            }
            C110194c cVar4 = iVar.f325072C;
            if (cVar4 != null) {
                cVar4.close();
            }
            GLES20.glDeleteProgram(iVar.f325089j);
            GLES20.glDeleteProgram(iVar.f325101v);
            GLES20.glDeleteFramebuffers(1, new int[]{iVar.f325070A}, 0);
            try {
                C103355g1 g1Var = iVar.f325105z;
                if (g1Var != null) {
                    g1Var.destroy();
                }
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkSegmentDestroyFailed");
                C115669n.INSTANCE.mo175912v(1012, 47);
            }
            C108587c cVar5 = this.f325066d;
            EGL10 egl10 = cVar5.f325054c;
            EGLDisplay eGLDisplay = cVar5.f325055d;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            C108587c cVar6 = this.f325066d;
            cVar6.f325054c.eglDestroyContext(cVar6.f325055d, cVar6.f325056e);
            C108587c cVar7 = this.f325066d;
            cVar7.f325054c.eglDestroySurface(cVar7.f325055d, cVar7.f325057f);
            C108587c cVar8 = this.f325066d;
            cVar8.f325054c.eglTerminate(cVar8.f325055d);
            C108587c cVar9 = this.f325066d;
            cVar9.f325056e = EGL10.EGL_NO_CONTEXT;
            cVar9.f325057f = EGL10.EGL_NO_SURFACE;
            cVar9.f325063l.quit();
            return C13598b0.f38549a;
        }
        C87412m.m108603p("renderer");
        throw null;
    }
}
