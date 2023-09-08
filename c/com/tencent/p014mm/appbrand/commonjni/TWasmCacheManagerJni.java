package com.tencent.p014mm.appbrand.commonjni;

import gy3.C8480h;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import p762yg.C39011b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016JS\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH J\u0011\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0002H J\u0011\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H ¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/appbrand/commonjni/TWasmCacheManagerJni;", "", "", "isolatePtr", "contextPtr", "", "appId", "packageMD5", "Ljava/nio/ByteBuffer;", "wasmBuffer", "wasmPath", "wasmCachePath", "", "threadNum", "funcListBuffer", "createTask", "task", "Lrx3/b0;", "destroyTask", "start", "stop", "<init>", "()V", "Companion", "a", "lib-wxa-common-binding_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.appbrand.commonjni.TWasmCacheManagerJni */
public final class TWasmCacheManagerJni {
    public static final C80647a Companion = new C80647a((C8480h) null);
    public static final String TAG = "TWasmCacheManagerJni";

    /* renamed from: com.tencent.mm.appbrand.commonjni.TWasmCacheManagerJni$a */
    public static final class C80647a {
        public C80647a(C8480h hVar) {
        }
    }

    static {
        C39011b.f105067a.loadLibrary("wxa-runtime-binding");
    }

    public final native long createTask(long j, long j2, String str, String str2, ByteBuffer byteBuffer, String str3, String str4, int i, ByteBuffer byteBuffer2);

    public final native void destroyTask(long j);

    public final native String start(long j);

    public final native void stop(long j);
}
