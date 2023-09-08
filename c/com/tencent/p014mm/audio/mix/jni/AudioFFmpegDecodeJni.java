package com.tencent.p014mm.audio.mix.jni;

import com.tencent.p014mm.audio.mix.decode.IDecodeCallback;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.audio.mix.jni.AudioFFmpegDecodeJni */
public class AudioFFmpegDecodeJni {
    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("xffmpeg");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/audio/mix/jni/AudioFFmpegDecodeJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static native int decode(int i, int i2, int i3, String str, IDecodeCallback iDecodeCallback);

    public native int clearResample(String str, Object obj);

    public native int initResample(String str, int i, int i2, int i3, int i4, Object obj);

    public native int resamplePcm(String str, int i, int i2, byte[] bArr, int i3, byte[] bArr2, int i4, Object obj);
}
