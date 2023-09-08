package com.tencent.liteav.videobase.p311d;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.videobase.d.j */
public class C17216j extends C17189b {

    /* renamed from: a */
    public int f46557a;

    /* renamed from: b */
    public int f46558b;

    public C17216j(String str, String str2) {
        super(str, str2);
    }

    public void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46557a = GLES20.glGetUniformLocation(getProgramId(), "width");
        this.f46558b = GLES20.glGetUniformLocation(getProgramId(), "height");
    }

    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
        runOnDraw(C17217k.m17058a(this));
    }
}
