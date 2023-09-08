package f43;

import a43.C103318l;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105175u;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.FloatBuffer;
import p80.C110193b;
import p80.C110194c;

/* renamed from: f43.b */
public class C107474b {

    /* renamed from: f */
    public static final float[] f321520f = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: g */
    public static float[] f321521g = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: a */
    public int f321522a;

    /* renamed from: b */
    public FloatBuffer f321523b;

    /* renamed from: c */
    public FloatBuffer f321524c;

    /* renamed from: d */
    public C110194c f321525d;

    /* renamed from: e */
    public SurfaceTexture f321526e;

    public C107474b() {
        this.f321522a = 0;
        this.f321522a = C107478e.m145592a("attribute vec4 vPosition;attribute vec2 vTexCoord;varying vec2 tc;void main() {  gl_Position = vPosition;  tc = vTexCoord;}", "#extension GL_OES_EGL_image_external : require\nprecision highp float;varying vec2 tc;uniform samplerExternalOES sTexture;void main() {   gl_FragColor = texture2D(sTexture, tc);}");
    }

    /* renamed from: a */
    public void mo157888a() {
        Log.m105924i("MicroMsg.VoipGLHProgram", "attachGLContext");
        long currentTicks = Util.currentTicks();
        C107476d b = C107476d.m145590b();
        synchronized (b) {
            Log.m105925i("MicroMsg.VoipHardDecodeUtil", "attachGLContext ,isContextAttached %s", b.f321553a);
            if (b.f321554b == null) {
                C110194c b2 = C110193b.m149776b(false, 14);
                b.f321554b = b2;
                v2protocal.f317546g2 = b2;
                Log.m105925i("MicroMsg.VoipHardDecodeUtil", "attachGLContext, texture:%s", b2);
            }
            if (b.f321553a.compareAndSet(true, false)) {
                Log.m105924i("MicroMsg.VoipHardDecodeUtil", "current has attach and it need to attach ");
            } else {
                if (b.f321553a.compareAndSet(false, true)) {
                    b.f321555c.attachToGLContext(b.f321554b.f329652e);
                    ((C105175u.C105176a) b.f321556d).mo149495a();
                }
                b.f321553a.get();
            }
        }
        Log.m105925i("MicroMsg.VoipGLHProgram", "attachGLContext done, used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: b */
    public void mo157889b() {
        C103318l lVar;
        Log.m105924i("MicroMsg.VoipGLHProgram", "detachGLContext");
        long currentTicks = Util.currentTicks();
        C107476d b = C107476d.m145590b();
        synchronized (b) {
            Log.printInfoStack("MicroMsg.VoipHardDecodeUtil", "detachGLContext, isContextAttached %s", b.f321553a);
            if (b.f321553a.compareAndSet(false, false)) {
                Log.m105924i("MicroMsg.VoipHardDecodeUtil", "current has attach and it need to detach ");
            }
            if (b.f321553a.compareAndSet(true, false) && (lVar = b.f321555c) != null) {
                lVar.detachFromGLContext();
                C110194c cVar = b.f321554b;
                if (cVar != null) {
                    cVar.close();
                    b.f321554b = null;
                }
            }
        }
        Log.m105925i("MicroMsg.VoipGLHProgram", "detachGLContext done, used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: c */
    public void mo157890c() {
        SurfaceTexture surfaceTexture = this.f321526e;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (Exception e) {
                try {
                    Log.printErrStackTrace("MicroMsg.VoipGLHProgram", e, "updateTexImage error", new Object[0]);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.VoipGLHProgram", e2, "renderThis error", new Object[0]);
                    return;
                }
            }
            GLES20.glUseProgram(this.f321522a);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f321522a, "vPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f321522a, "vTexCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.f321522a, "sTexture");
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 8, this.f321523b);
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 8, this.f321524c);
            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.f321525d.f329652e);
            GLES20.glUniform1i(glGetUniformLocation, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glFinish();
            GLES20.glDisableVertexAttribArray(glGetAttribLocation);
            GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
            GLES20.glBindTexture(36197, 0);
        }
    }
}
