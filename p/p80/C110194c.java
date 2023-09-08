package p80;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Process;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.io.Closeable;
import java.nio.Buffer;
import kj2.C117407d;
import w80.C111742d;

/* renamed from: p80.c */
public final class C110194c implements Closeable {

    /* renamed from: d */
    public volatile boolean f329651d = true;

    /* renamed from: e */
    public int f329652e = -1;

    /* renamed from: f */
    public boolean f329653f;

    /* renamed from: g */
    public long f329654g;

    /* renamed from: h */
    public final long f329655h;

    /* renamed from: i */
    public int f329656i = -1;

    /* renamed from: j */
    public int f329657j = -1;

    /* renamed from: n */
    public int f329658n = -1;

    /* renamed from: o */
    public int f329659o = NativeBitmapStruct.GLFormat.GL_RGBA;

    /* renamed from: p */
    public int f329660p;

    public C110194c(boolean z, long j) {
        this.f329654g = j;
        if (j < 0) {
            this.f329654g = 15;
        }
        Log.m105924i("MicroMsg.GLLeakIDKeyReport", "markGLTextureCreated");
        C117407d.INSTANCE.mo182089r(1184, 0, 1);
        this.f329651d = false;
        this.f329656i = Process.myTid();
        this.f329653f = z;
        if (z) {
            this.f329652e = C111742d.f334647a.mo163468n();
        } else {
            C111742d.C111743a aVar = C111742d.f334647a;
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, Task.EXTRAS_LIMIT_BYTES, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glBindTexture(36197, 0);
            aVar.mo163462e("glGenTextures");
            this.f329652e = iArr[0];
        }
        long nativeHandle = EGL14.eglGetCurrentContext().getNativeHandle();
        this.f329655h = nativeHandle;
        Log.m105924i("MicroMsg.GLTextureObject", hashCode() + " create texID:" + this.f329652e + "  sampler2D:" + z + " tid:" + this.f329656i + ", context: " + nativeHandle + ", stackTrace:\t" + Util.getStack());
    }

    /* renamed from: b */
    public static /* synthetic */ void m149779b(C110194c cVar, int i, int i2, int i3, Buffer buffer, int i4, int i5, int i6, Object obj) {
        int i7 = (i6 & 4) != 0 ? NativeBitmapStruct.GLFormat.GL_RGBA : i3;
        if ((i6 & 8) != 0) {
            buffer = null;
        }
        cVar.mo161594a(i, i2, i7, buffer, (i6 & 16) != 0 ? 9729 : i4, (i6 & 32) != 0 ? 10497 : i5);
    }

    /* renamed from: c */
    public static void m149780c(C110194c cVar, Bitmap bitmap, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 9729;
        }
        if ((i3 & 4) != 0) {
            i2 = 10497;
        }
        cVar.getClass();
        C87412m.m108594g(bitmap, "bitmap");
        if (!(cVar.f329657j == bitmap.getWidth() && cVar.f329658n == bitmap.getHeight())) {
            Log.m105924i("MicroMsg.GLTextureObject", cVar.hashCode() + " allocTexMemFromBitmap, width:" + bitmap.getWidth() + ", height:" + bitmap.getHeight() + ", internalFormat:" + cVar.f329659o + ", memorySize:" + cVar.mo161599g());
        }
        GLES20.glBindTexture(3553, cVar.f329652e);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        float f = (float) i;
        GLES20.glTexParameterf(3553, 10241, f);
        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, f);
        float f2 = (float) i2;
        GLES20.glTexParameterf(3553, 10242, f2);
        GLES20.glTexParameterf(3553, 10243, f2);
        cVar.f329657j = bitmap.getWidth();
        cVar.f329658n = bitmap.getHeight();
        cVar.f329659o = GLUtils.getInternalFormat(bitmap);
    }

    /* renamed from: a */
    public final void mo161594a(int i, int i2, int i3, Buffer buffer, int i4, int i5) {
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        if (i6 != this.f329657j || i7 != this.f329658n || i8 != this.f329659o || buffer != null) {
            int i9 = this.f329660p;
            this.f329660p = i9 + 1;
            if (i9 % 50 == 0) {
                Log.m105924i("MicroMsg.GLTextureObject", hashCode() + " allocTexMem, width:" + i + ", height:" + i7 + ", internalFormat:" + i8 + ", memorySize:" + mo161599g());
            }
            GLES20.glBindTexture(3553, this.f329652e);
            GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i3, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, buffer);
            float f = (float) i4;
            GLES20.glTexParameterf(3553, 10241, f);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, f);
            float f2 = (float) i5;
            GLES20.glTexParameterf(3553, 10242, f2);
            GLES20.glTexParameterf(3553, 10243, f2);
            this.f329657j = i6;
            this.f329658n = i7;
            this.f329659o = i8;
        }
    }

    public void close() {
        if (this.f329651d) {
            Log.m105924i("MicroMsg.GLTextureObject", hashCode() + " tex already close");
            return;
        }
        int myTid = Process.myTid();
        if (this.f329656i != myTid) {
            Log.m105920e("MicroMsg.GLTextureObject", hashCode() + " Leaked by different thread!!!  scene：" + this.f329654g + "  created in:" + this.f329656i + " release in:" + myTid + ", stackTrace:\t" + Util.getStack());
            Log.m105924i("MicroMsg.GLLeakIDKeyReport", "markGLTextureLeakedInErrorTid");
            C117407d.INSTANCE.mo182089r(1184, 200, 1);
            this.f329651d = false;
            return;
        }
        this.f329651d = true;
        C111742d.C111743a aVar = C111742d.f334647a;
        int i = this.f329652e;
        aVar.getClass();
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (eglGetCurrentContext.getNativeHandle() == 0) {
            String str = "context is destroyed, texture leaked! texID: " + this.f329652e;
            Log.m105920e("MicroMsg.GLTextureObject", str);
            if (BuildInfo.DEBUG) {
                throw new IllegalStateException(str);
            }
        }
        if (eglGetCurrentContext.getNativeHandle() != this.f329655h) {
            String str2 = "release texID(" + this.f329652e + ") with current context(" + eglGetCurrentContext.getNativeHandle() + ") which NOT equals to the origin context (" + this.f329655h + "). something wrong and causes leak!";
            Log.m105920e("MicroMsg.GLTextureObject", str2);
            if (BuildInfo.DEBUG) {
                throw new IllegalStateException(str2);
            }
        }
        Log.m105924i("MicroMsg.GLTextureObject", hashCode() + " close texID:" + this.f329652e + "  sampler2D:" + this.f329653f + ", context: " + eglGetCurrentContext.getNativeHandle() + ", stacks:" + Util.getStack());
    }

    /* renamed from: d */
    public final void mo161596d() {
        GLES20.glBindTexture(3553, this.f329652e);
    }

    /* renamed from: e */
    public final void mo161597e(C110192a aVar, int i, int i2) {
        String str;
        if (aVar != null) {
            C111742d.f334647a.mo163459b(aVar, this, i, i2);
        }
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            switch (glCheckFramebufferStatus) {
                case 36054:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT";
                    break;
                case 36055:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT";
                    break;
                case 36057:
                    str = "GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS";
                    break;
                case 36061:
                    str = "GL_FRAMEBUFFER_UNSUPPORTED";
                    break;
                default:
                    str = "unknown error";
                    break;
            }
            Log.m105920e("MicroMsg.GLTextureObject", "bind framebuffer status not complete, status:" + glCheckFramebufferStatus + " error:" + str);
        }
    }

    public final void finalize() {
        if (!this.f329651d) {
            Log.m105924i("MicroMsg.GLLeakIDKeyReport", "markGLTextureLeaked");
            C117407d dVar = C117407d.INSTANCE;
            dVar.mo182089r(1184, 1, 1);
            long j = this.f329654g;
            Log.m105924i("MicroMsg.GLLeakIDKeyReport", "markGLTextureLeakedScene key:" + j);
            dVar.mo182089r(1184, j, 1);
            Log.m105920e("MicroMsg.GLTextureObject", hashCode() + " Leaked !!!  scene：" + this.f329654g);
            return;
        }
        Log.m105924i("MicroMsg.GLTextureObject", hashCode() + " release success!");
    }

    /* renamed from: g */
    public final int mo161599g() {
        if (!this.f329653f) {
            return ((this.f329657j * this.f329658n) * 3) / 2;
        }
        int i = this.f329657j * this.f329658n;
        int i2 = 24;
        switch (this.f329659o) {
            case NativeBitmapStruct.GLFormat.GL_RGBA:
            case 6409:
            case 6410:
                i2 = 32;
                break;
        }
        return i * i2;
    }

    public String toString() {
        return "hashcode:" + hashCode() + " texID:" + this.f329652e + " sampler2D:" + this.f329653f + " memRelease:" + this.f329651d + " scene:" + this.f329654g + " create-tid:" + this.f329656i + " width:" + this.f329657j + " height:" + this.f329658n;
    }
}
