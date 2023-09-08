package vp3;

import android.opengl.GLES20;
import com.tencent.tav.decoder.Program;
import com.tencent.tav.decoder.RenderContext;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: vp3.m */
public final class C111600m {

    /* renamed from: a */
    public final FloatBuffer f334072a;

    /* renamed from: b */
    public final FloatBuffer f334073b;

    /* renamed from: c */
    public int f334074c;

    /* renamed from: d */
    public int f334075d;

    /* renamed from: e */
    public int f334076e;

    /* renamed from: f */
    public int f334077f;

    public C111600m() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f334072a = asFloatBuffer;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.f334073b = asFloatBuffer2;
        int createProgram = Program.createProgram("\n            attribute vec4 aPosition;\n            attribute vec2 aTextureCoord;\n            varying vec2 vTextureCoord;\n            void main() {\n              gl_Position = aPosition;\n              vTextureCoord = aTextureCoord;\n            }\n        ", "\n            precision mediump float;\n            varying vec2 vTextureCoord;\n            uniform sampler2D sTexture;\n            void main() {\n              gl_FragColor = texture2D(sTexture, vTextureCoord);\n            }\n        ");
        this.f334074c = createProgram;
        if (createProgram == 0) {
            new RuntimeException("failed creating program");
        } else {
            this.f334075d = GLES20.glGetAttribLocation(createProgram, "aPosition");
            RenderContext.checkEglError("glGetAttribLocation aPosition");
            if (this.f334075d == -1) {
                new RuntimeException("Could not get attribute location for aPosition");
            } else {
                this.f334076e = GLES20.glGetAttribLocation(this.f334074c, "aTextureCoord");
                RenderContext.checkEglError("glGetAttribLocation aTextureCoord");
                if (this.f334076e == -1) {
                    new RuntimeException("Could not get attribute location for aTextureCoord");
                } else {
                    this.f334077f = GLES20.glGetUniformLocation(this.f334074c, "sTexture");
                    RenderContext.checkEglError("glGetUniformLocation sTexture");
                    if (this.f334077f == -1) {
                        new RuntimeException("Could not get uniform location for sTexture");
                    }
                }
            }
        }
        GLES20.glDisable(3042);
    }
}
