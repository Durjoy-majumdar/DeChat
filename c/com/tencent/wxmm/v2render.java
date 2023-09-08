package com.tencent.wxmm;

import j20.C117292a;
import k20.C9556a;

public class v2render {
    public final int FLAG_Angle270 = 12;
    public final int FLAG_Angle90 = 4;
    public final int FLAG_Mirror = 16;
    public final int FLAG_NV12 = 2;
    public final int FLAG_NV21 = 3;
    public final int FLAG_RGBA = 0;
    public final int FLAG_RGBAClip = 1;
    public final int FLAG_YV12 = 0;
    public final int FLAG_YV12Edge = 1;
    public final int MSG_FLUSH = 1;
    public final int MSG_RENDER = 0;
    public final int MSG_RESET = 2;
    public final int RenderLocal = 0;
    public final int RenderRemote = 1;
    private byte _hellAccFlag_;
    public float mBrightness = 1.2f;
    public float mContrast = 1.93f;
    public float mSaturation = 1.05f;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("voipGLRender");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/wxmm/v2render", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/wxmm/v2render", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static int getGLVersion() {
        return 2;
    }

    public native void Init(int i, Object obj, int i2);

    public native void Uninit(int i);

    public native void render32(int[] iArr, int i, int i2, int i3, int i4);

    public native void render8(byte[] bArr, int i, int i2, int i3, int i4);

    public native void setMode(int i, int i2, int i3, int i4);

    public native void setParam(float f, float f2, float f3, int i);
}
