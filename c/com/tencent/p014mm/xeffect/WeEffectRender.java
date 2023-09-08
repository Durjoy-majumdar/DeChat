package com.tencent.p014mm.xeffect;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashSet;
import qr3.C36070f;

/* renamed from: com.tencent.mm.xeffect.WeEffectRender */
public class WeEffectRender {

    /* renamed from: a */
    public static final /* synthetic */ int f319985a = 0;

    static {
        C36070f.m40901a("xlabeffect");
    }

    /* renamed from: a */
    public static void m144535a(long j, long j2, IWeEffectCallback iWeEffectCallback) {
        if (iWeEffectCallback != null) {
            WeEffectCallbackMgr.INSTANCE.setCallback(j, j2, iWeEffectCallback);
            nSetEffectCallback(j, j2, iWeEffectCallback);
            return;
        }
        WeEffectCallbackMgr.INSTANCE.setCallback(j, j2, (IWeEffectCallback) null);
        nSetEffectCallback(j, j2, (IWeEffectCallback) null);
    }

    /* renamed from: b */
    public static void m144536b(long j, IWeJsonMessageCallback iWeJsonMessageCallback) {
        WeJsonMessageCallbackMgr.INSTANCE.setCallback(j, iWeJsonMessageCallback);
        nSetJsonMessageCallback(j, iWeJsonMessageCallback);
    }

    public static native long[] nAddEffectMaterialsFolder(long j, String str);

    public static native long nAddFaceAutoSlimer(long j, String str);

    public static native long nCreateFilter(long j, String str, float f);

    public static native long nCreateFilterWithConfig(long j, String str);

    public static native long nCreateMakeUp(long j, int i, String str);

    public static native long nCreateSticker(long j, int i, String str);

    public static native void nDestroy(long j);

    public static native ArrayList<HashSet<Integer>> nExportAction(long j);

    public static native int nFaceTrack(long j, Buffer buffer, int i, int i2, long j2);

    public static native int nFaceTrackWithAngle(long j, Buffer buffer, int i, int i2, long j2, int i3);

    public static native int nGetImageLabel(long j);

    public static native int nGetSdkVersion();

    public static native int nGetSegmentTexture(long j);

    public static native long nInit(int i, String str, String str2, boolean z, boolean z2);

    public static native String nInitSettings(long j, String str, String[] strArr);

    public static native long nInitWithMap(String[] strArr, int i, String str, boolean z, boolean z2, int i2);

    public static native boolean nNeedFaceTrack(long j);

    public static native int nReceiveJsonMessage(long j, long j2, String str, int i, int i2);

    public static native void nRemoveFilter(long j, long j2);

    public static native int nRemoveResource(long j, long j2);

    public static native int nRenderToBuffer(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, boolean z);

    public static native int nRenderToTexture(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2);

    public static native int nRenderToTextureOutputRotate(long j, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2);

    public static native void nResetAnim(long j, long j2);

    public static native void nSetAnim(long j, long j2, int i);

    public static native void nSetBeautyDeFaceWrinkle(long j, float f, float f2);

    public static native int nSetBeautySharpenFilter(long j, float f);

    public static native int nSetConfigFlags(long j, String str, float f);

    public static native void nSetCustomSegmentSticker(long j, int i, int i2, int i3);

    public static native void nSetEffectCallback(long j, long j2, IWeEffectCallback iWeEffectCallback);

    public static native int nSetEffectLevel(long j, int i, float f, int i2);

    public static native void nSetFilterColorWeight(long j, long j2, float f);

    public static native void nSetFocalLength(long j, float f);

    private static native void nSetJsonMessageCallback(long j, IWeJsonMessageCallback iWeJsonMessageCallback);

    public static native void nSetMakeUpAlpha(long j, long j2, float f);

    public static native void nSetMakeupGlobalAlpha(long j, float f);

    public static native void nSetMouthMorph(long j, float f);

    public static native void nSetNativeLog(long j);

    public static native void nSetRenderTextureCropSize(long j, float f);

    public static native void nSetSegment(long j, boolean z, int i, int i2, int i3);

    public static native void nSetSegmentBgBlur(long j, boolean z, float f, int i);

    public static native int nSetSlimerRate(long j, long j2, float f);

    public static native void nSetTeethBright(long j, float f);

    public static native void nSetupReport(long j, boolean z);

    public static native void nShowDebugInfo(long j, int i, boolean z);

    public static native int nTrackImageLabel(long j, Buffer buffer, int i, int i2);

    public static native void nUpdateAnim(long j, long j2);

    public static native void nUpdateSticker(long j);
}
