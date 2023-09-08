package p301cd;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLivePusher;
import lo0.C88603c;
import p830xc.C91165a;
import p954dd.C86224a;

/* renamed from: cd.r */
public class C80008r implements TXLivePusher.ITXSnapshotListener {

    /* renamed from: c */
    public final /* synthetic */ C91165a f234398c;

    /* renamed from: d */
    public final /* synthetic */ C80005q f234399d;

    public C80008r(C80005q qVar, C91165a aVar) {
        this.f234399d = qVar;
        this.f234398c = aVar;
    }

    public void onSnapshot(Bitmap bitmap) {
        C91165a aVar = this.f234398c;
        if (aVar == null) {
            Log.m105920e("MicroMsg.SameLayer.LivePusherPluginHandler", "operateSnapshot, invokeContext is null");
            return;
        }
        C86224a aVar2 = this.f234399d.f234330o;
        if (aVar2 != null) {
            ((C88603c) aVar2).mo123048e(aVar, bitmap);
        }
    }
}
