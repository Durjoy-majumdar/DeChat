package vp3;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.xeffect.VLogDirector;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tavkit.ciimage.CIContext;
import com.tencent.tavkit.ciimage.TAVGLUtils;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import qr3.C110469c;
import rx3.C13598b0;
import yp3.C112478a;

/* renamed from: vp3.h */
public abstract class C111592h {

    /* renamed from: a */
    public final VLogDirector f334032a = new VLogDirector();

    /* renamed from: b */
    public EffectManager f334033b = new EffectManager();

    /* renamed from: c */
    public int f334034c;

    /* renamed from: d */
    public int f334035d;

    /* renamed from: e */
    public boolean f334036e;

    /* renamed from: f */
    public RenderContext f334037f;

    /* renamed from: g */
    public Surface f334038g;

    /* renamed from: h */
    public C111600m f334039h;

    /* renamed from: i */
    public TextureInfo f334040i;

    /* renamed from: j */
    public volatile boolean f334041j;

    /* renamed from: k */
    public volatile boolean f334042k;

    /* renamed from: l */
    public Handler f334043l;

    /* renamed from: m */
    public HandlerThread f334044m;

    /* renamed from: n */
    public final ArrayList<C32224a<C13598b0>> f334045n = new ArrayList<>();

    /* renamed from: o */
    public volatile boolean f334046o;

    /* renamed from: p */
    public C32226l<? super Bitmap, C13598b0> f334047p;

    /* renamed from: q */
    public C32226l<? super Long, C13598b0> f334048q;

    /* renamed from: r */
    public C111599l f334049r = new C111599l();

    /* renamed from: s */
    public long f334050s;

    /* renamed from: vp3.h$a */
    public static final class C111593a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111592h f334051d;

        /* renamed from: e */
        public final /* synthetic */ HandlerThread f334052e;

        public C111593a(C111592h hVar, HandlerThread handlerThread) {
            this.f334051d = hVar;
            this.f334052e = handlerThread;
        }

        public final void run() {
            C32226l<? super C111599l, C13598b0> lVar;
            this.f334051d.f334032a.mo154914b();
            TextureInfo textureInfo = this.f334051d.f334040i;
            if (textureInfo != null) {
                textureInfo.release();
            }
            C111600m mVar = this.f334051d.f334039h;
            if (mVar != null) {
                GLES20.glDeleteProgram(mVar.f334074c);
            }
            Surface surface = this.f334051d.f334038g;
            if (surface != null) {
                surface.release();
            }
            RenderContext renderContext = this.f334051d.f334037f;
            if (renderContext != null) {
                renderContext.release();
            }
            C111599l lVar2 = this.f334051d.f334049r;
            if (lVar2.f334063c && (lVar = C111599l.f334060l) != null) {
                C13598b0 invoke = lVar.invoke(lVar2);
            }
            HandlerThread handlerThread = this.f334052e;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            C112478a.m153625c(this.f334051d.mo163260c(), "destroyEGL finished", new Object[0]);
        }
    }

    /* renamed from: vp3.h$b */
    public static final class C111594b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111592h f334053d;

        public C111594b(C111592h hVar) {
            this.f334053d = hVar;
        }

        public final void run() {
            C111592h hVar = this.f334053d;
            String c = hVar.mo163260c();
            StringBuilder sb = new StringBuilder();
            sb.append("createEGLEnvironment, size:[");
            sb.append(hVar.f334034c);
            sb.append(", ");
            sb.append(hVar.f334035d);
            sb.append("], surface:");
            Surface surface = hVar.f334038g;
            sb.append(surface != null ? surface.hashCode() : 0);
            C112478a.m153625c(c, sb.toString(), new Object[0]);
            Surface surface2 = hVar.f334038g;
            if (surface2 != null) {
                hVar.f334037f = new RenderContext(hVar.f334034c, hVar.f334035d, surface2);
            } else {
                hVar.f334037f = new RenderContext(hVar.f334034c, hVar.f334035d, (Surface) null);
            }
            C111592h hVar2 = this.f334053d;
            hVar2.f334032a.mo154915c();
            hVar2.f334032a.mo154917e(hVar2.f334033b);
            this.f334053d.f334039h = new C111600m();
            this.f334053d.f334041j = true;
            C111599l lVar = this.f334053d.f334049r;
            lVar.getClass();
            lVar.f334065e = System.currentTimeMillis() - lVar.f334064d;
            synchronized (this.f334053d.f334045n) {
                for (C32224a invoke : this.f334053d.f334045n) {
                    invoke.invoke();
                }
                this.f334053d.f334045n.clear();
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C112478a.m153625c(this.f334053d.mo163260c(), "initEGL finished", new Object[0]);
        }
    }

    /* renamed from: vp3.h$c */
    public static final class C111595c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111592h f334054d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111595c(C111592h hVar) {
            super(0);
            this.f334054d = hVar;
        }

        public Object invoke() {
            C111592h hVar = this.f334054d;
            hVar.mo163262g(hVar.f334050s);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public abstract List<C110469c> mo163258a(long j);

    /* renamed from: b */
    public void mo163259b() {
        C112478a.m153627e(mo163260c(), "destroyEGL", new Object[0]);
        this.f334042k = true;
        synchronized (this.f334045n) {
            this.f334045n.clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
        this.f334041j = false;
        Handler handler = this.f334043l;
        HandlerThread handlerThread = this.f334044m;
        this.f334044m = null;
        this.f334043l = null;
        if (handler != null) {
            handler.post(new C111593a(this, handlerThread));
        }
    }

    /* renamed from: c */
    public abstract String mo163260c();

    /* renamed from: d */
    public void mo163261d() {
        C112478a.m153625c(mo163260c(), "initEGL", new Object[0]);
        this.f334042k = false;
        C111599l lVar = this.f334049r;
        lVar.getClass();
        lVar.f334064d = System.currentTimeMillis();
        HandlerThread handlerThread = new HandlerThread("EffectRenderView_EGLRenderThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f334043l = handler;
        this.f334044m = handlerThread;
        handler.post(new C111594b(this));
    }

    /* renamed from: e */
    public final void mo163269e(C32224a<C13598b0> aVar) {
        HandlerThread handlerThread;
        C87412m.m108595h(aVar, "callback");
        if (this.f334043l == null || (handlerThread = this.f334044m) == null || !handlerThread.isAlive() || this.f334042k || !this.f334041j) {
            synchronized (this.f334045n) {
                this.f334045n.add(aVar);
            }
            return;
        }
        Handler handler = this.f334043l;
        if (handler != null) {
            handler.post(new C111597j(aVar));
        }
    }

    /* renamed from: f */
    public final void mo163270f() {
        C112478a.m153625c(mo163260c(), "release", new Object[0]);
        this.f334033b.mo154931k();
        this.f334033b = new EffectManager();
    }

    /* renamed from: g */
    public void mo163262g(long j) {
        int i;
        TextureInfo textureInfo;
        long j2 = j;
        C111599l lVar = this.f334049r;
        lVar.getClass();
        lVar.f334066f = System.currentTimeMillis();
        int i2 = this.f334034c;
        if (i2 <= 0 || (i = this.f334035d) <= 0) {
            C112478a.m153628f(mo163260c(), "render with size error " + this.f334034c + ", " + this.f334035d, new Object[0]);
            this.f334049r.f334069i = true;
            return;
        }
        GLES20.glViewport(0, 0, i2, i);
        this.f334032a.mo154919g(0, 0, this.f334034c, this.f334035d);
        VLogDirector vLogDirector = this.f334032a;
        int i3 = this.f334034c;
        int i4 = this.f334035d;
        vLogDirector.f319982c = i3;
        vLogDirector.f319983d = i4;
        vLogDirector.mo154919g(0, 0, i3, i4);
        if (this.f334036e || this.f334040i == null) {
            TextureInfo textureInfo2 = this.f334040i;
            if (textureInfo2 != null) {
                textureInfo2.release();
            }
            TextureInfo newTextureInfo = CIContext.newTextureInfo(this.f334034c, this.f334035d);
            this.f334040i = newTextureInfo;
            if (newTextureInfo != null) {
                GLES20.glBindTexture(3553, newTextureInfo.textureID);
                GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, newTextureInfo.width, newTextureInfo.height, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                GLES20.glBindTexture(3553, 0);
            }
            this.f334036e = false;
        }
        TextureInfo textureInfo3 = this.f334040i;
        int i5 = textureInfo3 != null ? textureInfo3.textureID : 0;
        if (i5 <= 0) {
            this.f334049r.f334071k = true;
            return;
        }
        List<C110469c> a = mo163258a(j);
        if (a.isEmpty()) {
            this.f334049r.f334070j = true;
            return;
        }
        this.f334032a.mo154916d(a, i5, j2);
        if (this.f334046o) {
            try {
                Bitmap saveBitmap = TAVGLUtils.saveBitmap(this.f334040i);
                C32226l<? super Bitmap, C13598b0> lVar2 = this.f334047p;
                if (lVar2 != null) {
                    C13598b0 invoke = lVar2.invoke(saveBitmap);
                }
            } catch (OutOfMemoryError e) {
                C112478a.m153624b(mo163260c(), "saveBitmap error: " + e, new Object[0]);
                C32226l<? super Bitmap, C13598b0> lVar3 = this.f334047p;
                if (lVar3 != null) {
                    C13598b0 invoke2 = lVar3.invoke(null);
                }
            }
            this.f334046o = false;
            this.f334047p = null;
        } else {
            C111600m mVar = this.f334039h;
            if (!(mVar == null || (textureInfo = this.f334040i) == null || textureInfo.textureID <= 0)) {
                GLES20.glUseProgram(mVar.f334074c);
                RenderContext.checkEglError("glUseProgram");
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(textureInfo.textureType, textureInfo.textureID);
                GLES20.glUniform1i(mVar.f334077f, 0);
                mVar.f334073b.position(0);
                GLES20.glVertexAttribPointer(mVar.f334075d, 2, 5126, false, 0, mVar.f334073b);
                GLES20.glEnableVertexAttribArray(mVar.f334075d);
                mVar.f334072a.position(0);
                GLES20.glVertexAttribPointer(mVar.f334076e, 2, 5126, false, 0, mVar.f334072a);
                GLES20.glEnableVertexAttribArray(mVar.f334076e);
                GLES20.glDrawArrays(5, 0, 4);
                GLES20.glBindTexture(textureInfo.textureType, 0);
                GLES20.glDisableVertexAttribArray(mVar.f334075d);
                GLES20.glDisableVertexAttribArray(mVar.f334076e);
            }
            RenderContext renderContext = this.f334037f;
            if (renderContext != null) {
                renderContext.swapBuffers();
            }
        }
        C32226l<? super Long, C13598b0> lVar4 = this.f334048q;
        if (lVar4 != null) {
            C13598b0 invoke3 = lVar4.invoke(Long.valueOf(j));
        }
        this.f334050s = j2;
        C111599l lVar5 = this.f334049r;
        lVar5.f334068h++;
        lVar5.f334067g += System.currentTimeMillis() - lVar5.f334066f;
    }

    /* renamed from: h */
    public final void mo163271h(C32226l<? super Bitmap, C13598b0> lVar) {
        C87412m.m108595h(lVar, "callback");
        this.f334046o = true;
        this.f334047p = lVar;
        mo163269e(new C111595c(this));
    }

    /* renamed from: i */
    public final void mo163272i(int i, int i2) {
        if (!(i == this.f334034c && i2 == this.f334035d)) {
            this.f334036e = true;
        }
        this.f334034c = i;
        this.f334035d = i2;
    }
}
