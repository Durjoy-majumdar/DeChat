package com.tencent.p014mm.plugin.api.recordView;

import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.FloatBuffer;

/* renamed from: com.tencent.mm.plugin.api.recordView.d */
public class C104726d {

    /* renamed from: h */
    public static float[] f310991h = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: i */
    public static final float[] f310992i = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: j */
    public static final Object f310993j = new Object();

    /* renamed from: a */
    public int f310994a = 0;

    /* renamed from: b */
    public int f310995b = 0;

    /* renamed from: c */
    public int f310996c = -1;

    /* renamed from: d */
    public int f310997d = -1;

    /* renamed from: e */
    public int f310998e = -1;

    /* renamed from: f */
    public FloatBuffer f310999f;

    /* renamed from: g */
    public FloatBuffer f311000g;

    /* renamed from: a */
    public void mo148393a(int i, int i2) {
        Log.m105925i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged, surfaceWidth: %s, height: %s this %s", Integer.valueOf(i), Integer.valueOf(i2), this);
        if (i != this.f310994a || i2 != this.f310995b) {
            Log.m105924i("MicroMsg.MMSightRecordTextureViewRenderer", "onSurfaceChanged change viewpoint");
            GLES20.glViewport(0, 0, i, i2);
            this.f310994a = i;
            this.f310995b = i2;
        }
    }
}
