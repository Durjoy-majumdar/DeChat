package com.tencent.liteav.videobase.p310c;

import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.videobase.c.a */
public final class C17201a extends C17189b {
    public C17201a() {
        super(C17189b.NO_FILTER_VERTEX_SHADER, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    public final int getTarget() {
        return 36197;
    }
}
