package j72;

import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j72.C108600b;
import j72.C108604d;

/* renamed from: j72.c */
public class C108603c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108604d.C108605a f325159d;

    /* renamed from: e */
    public final /* synthetic */ C108604d f325160e;

    public C108603c(C108604d dVar, C108604d.C108605a aVar) {
        this.f325160e = dVar;
        this.f325159d = aVar;
    }

    public void run() {
        C108604d dVar = this.f325160e;
        Log.m105925i("MicroMsg.FrameBufProcessor", "process srcWidth %d srcHeight %d targetWidth %d targetHeight %d bufIndex: %d", Integer.valueOf(dVar.f325165e), Integer.valueOf(dVar.f325166f), Integer.valueOf(dVar.f325167g), Integer.valueOf(dVar.f325168h), Integer.valueOf(dVar.f325163c));
        int i = dVar.f325169i;
        if (i == 21 || i == 2130706688) {
            SightVideoJNI.NV21ToYUV420XXAndScaleRotate(dVar.f325161a, dVar.f325162b, dVar.f325165e, dVar.f325166f, dVar.f325167g, dVar.f325168h, 1, dVar.f325173m, dVar.f325170j, dVar.f325172l, dVar.f325171k);
        } else if (i == 19) {
            SightVideoJNI.NV21ToYUV420XXAndScaleRotate(dVar.f325161a, dVar.f325162b, dVar.f325165e, dVar.f325166f, dVar.f325167g, dVar.f325168h, 2, dVar.f325173m, dVar.f325170j, dVar.f325172l, dVar.f325171k);
        }
        Log.m105927v("MicroMsg.FrameBufProcessor", "process used %sms %d %d bufIndex %d", Long.valueOf(Util.ticksToNow(dVar.f325164d)), Integer.valueOf(dVar.f325161a.length), Integer.valueOf(dVar.f325162b.length), Integer.valueOf(dVar.f325163c));
        C108604d.C108605a aVar = this.f325159d;
        C108600b.C108601a aVar2 = (C108600b.C108601a) aVar;
        C108600b.this.f325154e.post(new C108599a(aVar2, this.f325160e));
        C98921l.f289964d.mo138260o(this.f325160e.f325161a);
    }
}
