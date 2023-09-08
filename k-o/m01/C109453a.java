package m01;

import android.os.BatteryManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: m01.a */
public final class C109453a {

    /* renamed from: a */
    public long f327614a = 0;

    /* renamed from: b */
    public MMHandler f327615b = new MMHandler("ScreenCast_batteryCounter");

    /* renamed from: c */
    public boolean f327616c;

    /* renamed from: d */
    public final BatteryManager f327617d;

    /* renamed from: m01.a$a */
    public static final class C109454a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109453a f327618d;

        public C109454a(C109453a aVar) {
            this.f327618d = aVar;
        }

        public final void run() {
            C109453a aVar = this.f327618d;
            long longProperty = aVar.f327617d.getLongProperty(5);
            int intProperty = aVar.f327617d.getIntProperty(1);
            int intProperty2 = aVar.f327617d.getIntProperty(2);
            int intProperty3 = aVar.f327617d.getIntProperty(3);
            int intProperty4 = aVar.f327617d.getIntProperty(4);
            Log.m105924i("MicroMsg.BatteryUtils", "mBatteryEnergyCounter=" + longProperty + " nanoWattHours ");
            Log.m105924i("MicroMsg.BatteryUtils", "mBatteryChargeCounter=" + intProperty + "  microAmpereHours");
            Log.m105924i("MicroMsg.BatteryUtils", "mBatteryCurrentNow=" + intProperty2 + "   microAmpere");
            Log.m105924i("MicroMsg.BatteryUtils", "mBatteryCurrentAverage=" + intProperty3 + "  microAmpere");
            Log.m105924i("MicroMsg.BatteryUtils", "mBatteryCapacity=" + intProperty4 + "  ");
            Log.m105924i("MicroMsg.BatteryUtils", "mBatteryEnergyCounter=" + longProperty + " nanoWattHours ");
            long j = aVar.f327614a;
            aVar.f327614a = j != 0 ? (j + ((long) intProperty3)) / ((long) 2) : (long) intProperty3;
            this.f327618d.mo160690a();
        }
    }

    public C109453a() {
        Object systemService = MMApplicationContext.getContext().getSystemService("batterymanager");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        this.f327617d = (BatteryManager) systemService;
    }

    /* renamed from: a */
    public final void mo160690a() {
        boolean z = true;
        this.f327616c = true;
        MMHandler mMHandler = this.f327615b;
        if (mMHandler == null || !mMHandler.isQuit()) {
            z = false;
        }
        if (z || !this.f327616c) {
            this.f327614a = 0;
            this.f327615b = new MMHandler("ScreenCast_batteryCounter");
            mo160690a();
            return;
        }
        MMHandler mMHandler2 = this.f327615b;
        if (mMHandler2 != null) {
            mMHandler2.postDelayed(new C109454a(this), 1000);
        }
    }
}
