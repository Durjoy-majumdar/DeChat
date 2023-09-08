package com.tencent.liteav.beauty.p305b;

import android.content.Context;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.beauty.p304a.C17127a;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p309a.C17189b;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.beauty.b.h */
public final class C17152h extends C17189b {

    /* renamed from: a */
    public GLConstants.GLScaleType f46274a;

    /* renamed from: b */
    public boolean f46275b;

    /* renamed from: c */
    private final Context f46276c;

    /* renamed from: d */
    private final PixelFrame f46277d = new PixelFrame();

    /* renamed from: e */
    private C17234j f46278e;

    /* renamed from: f */
    private C17144d f46279f;

    /* renamed from: g */
    private boolean f46280g = false;

    /* renamed from: h */
    private C17127a f46281h;

    /* renamed from: i */
    private C17154a f46282i = null;

    /* renamed from: j */
    private C17127a.C17128a f46283j = new C17127a.C17128a() {
    };

    /* renamed from: com.tencent.liteav.beauty.b.h$a */
    public interface C17154a {
    }

    public C17152h(Context context) {
        this.f46276c = context;
    }

    public final void onDraw(int i, C17222d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int i2;
        if (isInitialized()) {
            runPendingOnDrawTasks();
            if (this.f46277d.getTextureId() == -1) {
                super.onDraw(i, dVar, floatBuffer, floatBuffer2);
                return;
            }
            C17223e eVar = this.mTexturePool;
            C104507p pVar = this.mOutputSize;
            C17222d a = eVar.mo20199a(pVar.f309736a, pVar.f309737b);
            if (this.f46278e == null) {
                C104507p pVar2 = this.mOutputSize;
                this.f46278e = new C17234j(pVar2.f309736a, pVar2.f309737b);
            }
            if (!this.f46277d.hasTransformParams() && this.f46277d.getPixelBufferType() == GLConstants.PixelBufferType.TEXTURE_2D && this.f46277d.getPixelFormatType() == GLConstants.PixelFormatType.RGBA) {
                i2 = this.f46277d.getTextureId();
            } else {
                this.f46278e.mo20210a(this.f46277d, this.f46274a, a);
                i2 = a.mo20195a();
            }
            C17144d dVar2 = this.f46279f;
            dVar2.setFloatOnDraw(dVar2.f46249a, this.f46275b ? 1.0f : 0.0f);
            this.f46279f.mo20134a("inputImageTexture2", i);
            this.f46279f.mo20134a("inputImageTexture3", i2);
            this.f46279f.onDraw(i, dVar, floatBuffer, floatBuffer2);
            a.release();
        }
    }

    public final void onInit(C17223e eVar) {
        super.onInit(eVar);
        C17144d dVar = new C17144d();
        this.f46279f = dVar;
        dVar.initialize(eVar);
    }

    public final void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        this.f46279f.onOutputSizeChanged(i, i2);
        C17234j jVar = this.f46278e;
        if (jVar != null) {
            jVar.mo20209a();
            this.f46278e = null;
        }
    }

    public final void onUninit() {
        C17127a aVar = this.f46281h;
        if (aVar != null) {
            aVar.f46186c = null;
            aVar.f46185b = true;
            Thread thread = aVar.f46184a;
            if (thread != null) {
                thread.interrupt();
                aVar.f46184a = null;
            }
            this.f46281h = null;
        }
        C17144d dVar = this.f46279f;
        if (dVar != null) {
            dVar.uninitialize();
            this.f46279f = null;
        }
        C17234j jVar = this.f46278e;
        if (jVar != null) {
            jVar.mo20209a();
            this.f46278e = null;
        }
        super.onUninit();
    }
}
