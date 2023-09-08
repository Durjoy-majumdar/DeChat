package c71;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: c71.d */
public final class C92364d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C92362c f264305d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f264306e;

    /* renamed from: f */
    public final /* synthetic */ long f264307f;

    public C92364d(C92362c cVar, byte[] bArr, long j) {
        this.f264305d = cVar;
        this.f264306e = bArr;
        this.f264307f = j;
    }

    public final void run() {
        long currentTicks = Util.currentTicks();
        boolean a = this.f264305d.f264301c.mo140810a(this.f264306e, this.f264307f);
        String str = this.f264305d.f264299a;
        Log.m105924i(str, "encodeRgbaFrame used " + Util.ticksToNow(currentTicks) + ", ret:" + a);
    }
}
