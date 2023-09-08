package com.tencent.liteav.videobase.p310c;

import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.videobase.c.b */
public final class C17202b extends C17189b {

    /* renamed from: a */
    private int f46511a = -1;

    /* renamed from: b */
    private int f46512b = -1;

    /* renamed from: c */
    private int f46513c = -1;

    /* renamed from: a */
    public final void mo20139a(Buffer buffer, int i, int i2) {
        if (!(this.f46511a == i && this.f46512b == i2)) {
            this.f46511a = i;
            this.f46512b = i2;
            OpenGlUtils.deleteTexture(this.f46513c);
            this.f46513c = -1;
        }
        this.f46513c = OpenGlUtils.loadTexture(NativeBitmapStruct.GLFormat.GL_RGBA, buffer, i, i2, this.f46513c);
    }

    public final void onDraw(int i, C17222d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.onDraw(this.f46513c, dVar, floatBuffer, floatBuffer2);
    }

    public final void onUninit() {
        super.onUninit();
        OpenGlUtils.deleteTexture(this.f46513c);
        this.f46513c = -1;
    }
}
