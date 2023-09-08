package rp3;

import android.opengl.GLES20;

/* renamed from: rp3.f */
public class C110607f extends C110609h {

    /* renamed from: t */
    public int f330900t;

    public C110607f() {
        super("varying mediump vec2 textureCoordinate;\nvarying mediump vec2 textureCoordinate2;\nvarying mediump vec2 textureCoordinate3;\n \nuniform sampler2D inputImageTexture;\nuniform sampler2D inputImageTexture2;\nuniform sampler2D inputImageTexture3;\nuniform mediump int srfControl;\nuniform mediump int srfSwitch;\nvoid main()\n{\nmediump vec4 motionMask = texture2D(inputImageTexture3, textureCoordinate3);\nmediump vec4 curFrame = texture2D(inputImageTexture, textureCoordinate);\nmediump vec4 preFrame = texture2D(inputImageTexture2,textureCoordinate2);\nmediump vec4 smoothFrame;\nif(srfSwitch == 1){\ngl_FragColor = curFrame;\n} else {\nsmoothFrame = preFrame * (1.0 - motionMask.r) + curFrame * motionMask.r;\ngl_FragColor = smoothFrame;\n}\n}\n");
    }

    /* renamed from: g */
    public void mo162166g() {
        super.mo162166g();
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f330877d, "srfSwitch");
        this.f330900t = glGetUniformLocation;
        mo162168i(new C110602a(this, glGetUniformLocation, 1));
    }
}
