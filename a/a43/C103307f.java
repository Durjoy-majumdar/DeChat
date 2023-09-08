package a43;

import ac3.C103355g1;
import android.opengl.GLES20;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.sdk.platformtools.Log;
import e43.C107224b;
import f43.C107474b;
import f43.C107479f;
import java.nio.ByteBuffer;
import p80.C110194c;
import u80.C111143e;

/* renamed from: a43.f */
public class C103307f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OpenGlRender f304594d;

    public C103307f(OpenGlRender openGlRender) {
        this.f304594d = openGlRender;
    }

    public void run() {
        int i = OpenGlRender.f318118B;
        Log.m105924i("OpenGlRender", "onSurfaceDestroyed release renderer");
        C107224b bVar = this.f304594d.f318135l;
        if (bVar != null) {
            synchronized (bVar) {
                if (bVar.f320826d) {
                    Log.m105925i("MicroMsg.FilterRenderer", "%s do destroy", Integer.valueOf(bVar.hashCode()));
                    bVar.getClass();
                    C111143e eVar = bVar.f320825c;
                    if (eVar != null) {
                        eVar.mo158471l();
                        bVar.f320825c = null;
                    }
                    C110194c[] cVarArr = {null, null, null, null, null};
                    for (int i2 = 0; i2 < 5; i2++) {
                        C110194c cVar = cVarArr[i2];
                        if (cVar != null) {
                            cVar.close();
                        }
                    }
                    GLES20.glDeleteProgram(0);
                    GLES20.glDeleteProgram(0);
                    bVar.getClass();
                    GLES20.glBindTexture(3553, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16640);
                    GLES20.glFinish();
                    ByteBuffer byteBuffer = bVar.f320823a;
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                    }
                    ByteBuffer byteBuffer2 = bVar.f320824b;
                    if (byteBuffer2 != null) {
                        byteBuffer2.clear();
                    }
                    bVar.f320823a = null;
                    bVar.f320824b = null;
                    bVar.f320826d = false;
                }
            }
        }
        C107479f fVar = this.f304594d.f318136m;
        if (fVar != null) {
            Log.m105925i("MicroMsg.VoipRenderer", "%s do destroy", Integer.valueOf(fVar.hashCode()));
            if (fVar.f321560a != null) {
                fVar.f321560a.mo157896f();
            }
            if (fVar.f321561b != null) {
                C107474b bVar2 = fVar.f321561b;
                synchronized (bVar2) {
                    Log.m105925i("MicroMsg.VoipGLHProgram", "%s do destroy", Integer.valueOf(bVar2.hashCode()));
                    GLES20.glDeleteProgram(bVar2.f321522a);
                    bVar2.f321522a = -1;
                }
            }
            fVar.f321560a = null;
            fVar.f321561b = null;
        }
        C103355g1 g1Var = this.f304594d.f318137n;
        if (g1Var != null) {
            g1Var.destroy();
            this.f304594d.f318137n = null;
        }
    }
}
