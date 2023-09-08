package com.tencent.p014mm.jni.emojihelper;

import android.graphics.Bitmap;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.jni.emojihelper.WxamDecoderJni */
public class WxamDecoderJni {

    /* renamed from: a */
    public long f48956a = -1;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("emojihelper");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/jni/emojihelper/WxamDecoderJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/jni/emojihelper/WxamDecoderJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private native long nCreate(byte[] bArr, int i);

    private native long nCreateWithCache(byte[] bArr, int i, String str, boolean z);

    private native int nDecodeNextFrame(long j);

    private native int nGetFrame(long j, Bitmap bitmap);

    private native int nGetFrameContentLoop(long j);

    private native int nGetFrameCount(long j);

    private native int nGetFrameNextDuration(long j);

    private native int nGetFrameTime(long j);

    private native int nGetHeight(long j);

    private native int nGetWidth(long j);

    private native int nIsWxGf(long j);

    private native int nRelease(long j);

    private native int nRewindBuffer(long j);

    /* renamed from: a */
    public Boolean mo21770a(byte[] bArr, int i) {
        long nCreate = nCreate(bArr, i);
        this.f48956a = nCreate;
        return Boolean.valueOf(nCreate >= 0);
    }

    /* renamed from: b */
    public Boolean mo21771b(byte[] bArr, int i, String str, boolean z) {
        long nCreateWithCache = nCreateWithCache(bArr, i, str, z);
        this.f48956a = nCreateWithCache;
        return Boolean.valueOf(nCreateWithCache >= 0);
    }

    /* renamed from: c */
    public int mo21772c() {
        return nDecodeNextFrame(this.f48956a);
    }

    /* renamed from: d */
    public int mo21773d(Bitmap bitmap) {
        return nGetFrame(this.f48956a, bitmap);
    }

    /* renamed from: e */
    public int mo21774e() {
        return nGetFrameCount(this.f48956a);
    }

    /* renamed from: f */
    public int mo21775f() {
        return nGetFrameTime(this.f48956a);
    }

    /* renamed from: g */
    public int mo21776g() {
        return nGetHeight(this.f48956a);
    }

    /* renamed from: h */
    public int mo21777h() {
        return nGetWidth(this.f48956a);
    }

    /* renamed from: i */
    public int mo21778i() {
        return nRelease(this.f48956a);
    }
}
