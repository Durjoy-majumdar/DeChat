package l12;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import com.tencent.p014mm.sdk.platformtools.ShakeManager;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: l12.g */
public class C109129g implements SensorController.SensorEventCallBack {

    /* renamed from: d */
    public SensorController f326773d = new SensorController(MMApplicationContext.getContext());

    /* renamed from: e */
    public ShakeManager f326774e = new ShakeManager(MMApplicationContext.getContext());

    /* renamed from: f */
    public long f326775f = -1;

    /* renamed from: g */
    public boolean f326776g = false;

    /* renamed from: h */
    public C109131b f326777h = null;

    /* renamed from: l12.g$a */
    public class C109130a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ boolean f326778d;

        public C109130a(boolean z) {
            this.f326778d = z;
        }

        public boolean onTimerExpired() {
            if (!this.f326778d) {
                Log.m105924i("MicroMsg.IPCallSensorManager", "off screen");
                C109131b bVar = C109129g.this.f326777h;
                if (bVar != null) {
                    ((C109123c) bVar).mo160363a(true);
                }
            } else {
                Log.m105924i("MicroMsg.IPCallSensorManager", "light screen");
                C109131b bVar2 = C109129g.this.f326777h;
                if (bVar2 != null) {
                    ((C109123c) bVar2).mo160363a(false);
                }
            }
            return false;
        }
    }

    /* renamed from: l12.g$b */
    public interface C109131b {
    }

    public void onSensorEvent(boolean z) {
        Log.m105924i("MicroMsg.IPCallSensorManager", "onSensorEvent, isON:" + z + "  hasSkip:" + this.f326776g + " tick:" + Util.ticksToNow(this.f326775f) + "  lt:" + this.f326775f);
        if (this.f326776g) {
            this.f326776g = !z;
            return;
        }
        if (!z) {
            long j = this.f326775f;
            if (j != -1 && Util.ticksToNow(j) > 400) {
                this.f326776g = true;
                return;
            }
        }
        this.f326776g = false;
        Log.m105925i("MicroMsg.IPCallSensorManager", "onSensorEvent, isNeedOffScreen: %b", Boolean.valueOf(z));
        new MTimerHandler(new C109130a(z), false).startTimer(50);
    }
}
