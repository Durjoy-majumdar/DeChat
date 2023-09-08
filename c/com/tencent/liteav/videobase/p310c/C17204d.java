package com.tencent.liteav.videobase.p310c;

import android.opengl.GLES20;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.p309a.C17197j;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.liteav.videobase.utils.Rotation;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.liteav.videobase.c.d */
public class C17204d extends C17197j {

    /* renamed from: a */
    private final FloatBuffer f46516a;

    /* renamed from: b */
    private int f46517b;

    public C17204d(String str) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nattribute vec4 inputTextureCoordinate2;\n \nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate2;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n    textureCoordinate2 = inputTextureCoordinate2.xy;\n}", str);
    }

    public void afterDrawArrays() {
        super.afterDrawArrays();
        int i = this.f46517b;
        if (i != -1) {
            GLES20.glDisableVertexAttribArray(i);
        }
    }

    public void beforeDrawArrays(int i) {
        super.beforeDrawArrays(i);
        int i2 = this.f46517b;
        if (i2 != -1) {
            GLES20.glVertexAttribPointer(i2, 2, 5126, false, 0, this.f46516a);
            GLES20.glEnableVertexAttribArray(this.f46517b);
        }
    }

    public void onInit(C17223e eVar) {
        super.onInit(eVar);
        this.f46517b = GLES20.glGetAttribLocation(getProgramId(), "inputTextureCoordinate2");
    }

    public C17204d(String str, String str2) {
        super(str, str2);
        this.f46517b = -1;
        this.f46516a = OpenGlUtils.createTextureCoordsBuffer(Rotation.NORMAL, false, false);
    }
}
