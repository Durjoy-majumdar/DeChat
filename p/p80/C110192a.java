package p80;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.Closeable;
import kj2.C117407d;
import w80.C111742d;

/* renamed from: p80.a */
public final class C110192a implements Closeable {

    /* renamed from: d */
    public volatile boolean f329643d;

    /* renamed from: e */
    public int f329644e = -1;

    /* renamed from: f */
    public long f329645f;

    /* renamed from: g */
    public int f329646g = -1;

    /* renamed from: h */
    public final long f329647h;

    public C110192a(long j) {
        this.f329645f = j;
        Log.m105924i("MicroMsg.GLLeakIDKeyReport", "markGLFBOCreated");
        C117407d.INSTANCE.mo182089r(1184, 100, 1);
        this.f329646g = Process.myTid();
        long nativeHandle = EGL14.eglGetCurrentContext().getNativeHandle();
        this.f329647h = nativeHandle;
        C111742d.C111743a aVar = C111742d.f334647a;
        int[] iArr = new int[1];
        int i = 0;
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i2 = iArr[0];
        if (i2 == 0) {
            Log.m105920e("MicroMsg.GLEnvironmentUtil", "gen frame buffer error");
        } else {
            i = i2;
        }
        this.f329644e = i;
        Log.m105924i("MicroMsg.GLFrameBufferObject", "create frameBuffer:" + this.f329644e + " tid:" + this.f329646g + ", context: " + nativeHandle + ", stackTrace: " + Util.getStack());
    }

    public void close() {
        if (this.f329643d) {
            Log.m105924i("MicroMsg.GLFrameBufferObject", hashCode() + " close already close");
            return;
        }
        int myTid = Process.myTid();
        if (this.f329646g != myTid) {
            Log.m105920e("MicroMsg.GLFrameBufferObject", hashCode() + " Leaked by different thread!!!  scene：" + this.f329645f + "  created in:" + this.f329646g + " release in:" + myTid + ", stackTrace:\t" + Util.getStack());
            Log.m105924i("MicroMsg.GLLeakIDKeyReport", "markGLFBOLeakedInErrorTid");
            C117407d.INSTANCE.mo182089r(1184, 201, 1);
            return;
        }
        this.f329643d = true;
        C111742d.C111743a aVar = C111742d.f334647a;
        int i = this.f329644e;
        aVar.getClass();
        GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext.getNativeHandle() == 0) {
            String str = "context is destroyed, framebuffer leaked! framebufferId: " + this.f329644e;
            Log.m105920e("MicroMsg.GLFrameBufferObject", str);
            if (BuildInfo.DEBUG) {
                throw new IllegalStateException(str);
            }
        }
        if (eglGetCurrentContext.getNativeHandle() != this.f329647h) {
            String str2 = "release framebuffer(" + this.f329644e + ") with current context(" + eglGetCurrentContext.getNativeHandle() + ") which NOT equals to the origin context (" + this.f329647h + "). something wrong and causes leak!";
            Log.m105920e("MicroMsg.GLFrameBufferObject", str2);
            if (BuildInfo.DEBUG) {
                throw new IllegalStateException(str2);
            }
        }
        Log.m105924i("MicroMsg.GLFrameBufferObject", hashCode() + " close framebufferId:" + this.f329644e + " context: " + eglGetCurrentContext.getNativeHandle() + ", stacks:" + Util.getStack());
    }

    public final void finalize() {
        if (!this.f329643d) {
            long j = this.f329645f;
            Log.m105924i("MicroMsg.GLLeakIDKeyReport", "markGLFBOLeakedScene key:" + j);
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo182089r(1184, j + ((long) 100), 1);
            Log.m105924i("MicroMsg.GLLeakIDKeyReport", "markGLFBOLeaked");
            dVar.mo182089r(1184, 101, 1);
            Log.m105920e("MicroMsg.GLFrameBufferObject", hashCode() + " Leaked !!!  scene：" + this.f329645f);
            return;
        }
        Log.m105924i("MicroMsg.GLFrameBufferObject", hashCode() + " release success!");
    }

    public String toString() {
        return "hashcode:" + hashCode() + " frameBufferId:" + this.f329644e + " memRelease:" + this.f329643d + " scene:" + this.f329645f + " create-tid:" + this.f329646g;
    }
}
