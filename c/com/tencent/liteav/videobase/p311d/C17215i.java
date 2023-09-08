package com.tencent.liteav.videobase.p311d;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17222d;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* renamed from: com.tencent.liteav.videobase.d.i */
public abstract class C17215i extends C17189b {

    /* renamed from: a */
    private int f46553a;

    /* renamed from: b */
    private final int[] f46554b;

    /* renamed from: c */
    private int f46555c = 0;

    /* renamed from: d */
    private int f46556d = 0;

    public C17215i(String str, String str2) {
        super(str, str2);
        int[] iArr = new int[2];
        this.f46554b = iArr;
        Arrays.fill(iArr, -1);
    }

    /* renamed from: b */
    private void m17055b() {
        int i = 0;
        while (true) {
            int[] iArr = this.f46554b;
            if (i < iArr.length) {
                OpenGlUtils.deleteTexture(iArr[i]);
                this.f46554b[i] = -1;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public abstract int mo20147a();

    /* renamed from: a */
    public final void mo20149a(ByteBuffer byteBuffer, int i, int i2) {
        if (!(this.f46555c == i && this.f46556d == i2)) {
            m17055b();
            this.f46555c = i;
            this.f46556d = i2;
        }
        OpenGlUtils.loadYuv420DataToTextures(byteBuffer, mo20147a(), i, i2, this.f46554b);
    }

    public void beforeDrawArrays(int i) {
        super.beforeDrawArrays(i);
        GLES20.glActiveTexture(33985);
        OpenGlUtils.bindTexture(getTarget(), this.f46554b[1]);
        GLES20.glUniform1i(this.f46553a, 1);
    }

    public void onDraw(int i, C17222d dVar, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.onDraw(this.f46554b[0], dVar, floatBuffer, floatBuffer2);
    }

    public void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46553a = GLES20.glGetUniformLocation(getProgramId(), "uvTexture");
    }

    public void onUninit() {
        m17055b();
        super.onUninit();
    }
}
