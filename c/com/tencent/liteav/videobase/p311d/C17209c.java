package com.tencent.liteav.videobase.p311d;

import com.tencent.liteav.videobase.p309a.C17189b;

/* renamed from: com.tencent.liteav.videobase.d.c */
public final class C17209c extends C17215i {
    public C17209c() {
        super(C17189b.NO_FILTER_VERTEX_SHADER, "varying highp vec2 textureCoordinate;\n\nuniform sampler2D yTexture;\nuniform sampler2D uvTexture;\nmediump mat3 colorConversionMatrix = mat3(       1.164,  1.164, 1.164,\n       1.596, -0.813,   0.0,\n         0.0, -0.392, 2.017\n);\nvoid main()\n{\n    mediump vec3 yuv;\n    lowp vec3 rgb;\n\n    yuv.x = texture2D(yTexture, textureCoordinate).r - (16.0/255.0);\n    yuv.y = texture2D(uvTexture, textureCoordinate).a - 0.5;\n    yuv.z = texture2D(uvTexture, textureCoordinate).r - 0.5;\n    rgb = colorConversionMatrix * yuv;\n\n    gl_FragColor = vec4(rgb, 1.0);\n}");
    }

    /* renamed from: a */
    public final int mo20147a() {
        return 6410;
    }
}
