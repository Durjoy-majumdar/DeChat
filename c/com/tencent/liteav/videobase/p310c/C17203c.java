package com.tencent.liteav.videobase.p310c;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.videobase.c.c */
public class C17203c extends C17204d {

    /* renamed from: a */
    private final FloatBuffer f46514a;

    /* renamed from: b */
    private int f46515b;

    public C17203c(String str) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\nattribute vec4 inputTextureCoordinate3;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\nvarying vec2 textureCoordinate3;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n    textureCoordinate3 = inputTextureCoordinate3.xy;\n}", str);
    }

    public void afterDrawArrays() {
        super.afterDrawArrays();
        int i = this.f46515b;
        if (i != -1) {
            GLES20.glDisableVertexAttribArray(i);
        }
    }

    public void beforeDrawArrays(int i) {
        super.beforeDrawArrays(i);
        int i2 = this.f46515b;
        if (i2 != -1) {
            GLES20.glVertexAttribPointer(i2, 2, 5126, false, 0, this.f46514a);
            GLES20.glEnableVertexAttribArray(this.f46515b);
        }
    }

    public void onInit(C17223e eVar) {
        super.onInit((C17223e) null);
        this.f46515b = GLES20.glGetAttribLocation(getProgramId(), "inputTextureCoordinate3");
    }

    public void onOutputSizeChanged(int i, int i2) {
        super.onOutputSizeChanged(i, i2);
    }

    public C17203c(String str, String str2) {
        super(str, str2);
        this.f46514a = OpenGlUtils.createTextureCoordsBuffer(Rotation.NORMAL, false, false);
    }
}
