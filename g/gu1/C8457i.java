package gu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: gu1.i */
public final class C8457i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f27466d;

    /* renamed from: e */
    public final /* synthetic */ C15601d<C13598b0> f27467e;

    public C8457i(long j, C15601d<? super C13598b0> dVar) {
        this.f27466d = j;
        this.f27467e = dVar;
    }

    public final void run() {
        long ticksToNow = Util.ticksToNow(this.f27466d);
        Log.m105924i("MicroMsg.CachedFlutterEngines", "init FlutterLoader cost:" + ticksToNow + " ms");
        C15601d<C13598b0> dVar = this.f27467e;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
    }
}
