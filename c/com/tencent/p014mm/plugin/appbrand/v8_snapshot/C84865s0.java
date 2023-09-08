package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicInteger;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.s0 */
public final class C84865s0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AtomicInteger f247361d;

    /* renamed from: e */
    public final /* synthetic */ ICommLibReader f247362e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84865s0(AtomicInteger atomicInteger, ICommLibReader iCommLibReader) {
        super(0);
        this.f247361d = atomicInteger;
        this.f247362e = iCommLibReader;
    }

    public Object invoke() {
        int decrementAndGet = this.f247361d.decrementAndGet();
        Log.m105924i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "done#onCommLibUsingVersionUpdate, theCreatingCount: " + decrementAndGet);
        if (decrementAndGet <= 0) {
            ((C119157j) C119157j.f356862d).mo183885p(new C84863r0(this.f247362e), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
        }
        return C13598b0.f38549a;
    }
}
