package com.tencent.p014mm.plugin.appbrand.jsruntime;

import com.tencent.p014mm.appbrand.p942v8.C80658e;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80691q;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import java.nio.ByteBuffer;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.c */
public class C83146c extends C83139a {
    public C83146c() {
        super((IJSRuntime.Config) null);
    }

    public void releaseDirectByteBuffer(ByteBuffer byteBuffer) {
    }

    /* renamed from: v1 */
    public IJSRuntime mo73002v1(IJSRuntime.Config config) {
        boolean z = C80658e.f236022a;
        return new C80691q(config);
    }

    /* renamed from: w1 */
    public C80669j mo115382w1(IJSRuntime iJSRuntime, int i) {
        return iJSRuntime.mo112432C(i);
    }

    public C83146c(String str, byte[] bArr) {
        super(new IJSRuntime.Config(str, bArr));
    }

    public C83146c(IJSRuntime.Config config) {
        super(config);
    }
}
