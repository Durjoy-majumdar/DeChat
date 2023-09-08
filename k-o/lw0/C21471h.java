package lw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.UUID;

/* renamed from: lw0.h */
public class C21471h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ UUID f60800d;

    /* renamed from: e */
    public final /* synthetic */ C21462f f60801e;

    public C21471h(C21462f fVar, UUID uuid) {
        this.f60801e = fVar;
        this.f60800d = uuid;
    }

    public void run() {
        boolean z;
        C21462f fVar = this.f60801e;
        UUID uuid = this.f60800d;
        fVar.getClass();
        Log.m105924i("MicroMsg.exdevice.IBeaconServer", "stopRanging");
        if (uuid == null) {
            Log.m105920e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
            z = false;
        } else {
            fVar.f60775f.remove(uuid);
            fVar.mo33638d();
            z = true;
        }
        if (!z) {
            Log.m105920e("MicroMsg.exdevice.IBeaconServer", "stopRanging failed!!!");
        }
    }
}
