package ak1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveThermalStateReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C87412m;
import ok1.C62042e;

/* renamed from: ak1.b */
public final class C54062b {

    /* renamed from: a */
    public String f151394a;

    /* renamed from: b */
    public long f151395b;

    /* renamed from: c */
    public String f151396c;

    /* renamed from: d */
    public final MTimerHandler f151397d = new MTimerHandler("Finder.DeviceStatusReporter", (MTimerHandler.CallBack) new C54063a(this), true);

    /* renamed from: ak1.b$a */
    public static final class C54063a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C54062b f151398d;

        public C54063a(C54062b bVar) {
            this.f151398d = bVar;
        }

        public final boolean onTimerExpired() {
            C54062b bVar = this.f151398d;
            bVar.getClass();
            FinderLiveThermalStateReportStruct finderLiveThermalStateReportStruct = new FinderLiveThermalStateReportStruct();
            finderLiveThermalStateReportStruct.f155704d = finderLiveThermalStateReportStruct.mo86045b("LiveId", bVar.f151394a, true);
            finderLiveThermalStateReportStruct.f155705e = bVar.f151395b;
            finderLiveThermalStateReportStruct.f155706f = finderLiveThermalStateReportStruct.mo86045b("FinderNickname", bVar.f151396c, true);
            C62042e eVar = C62042e.f176370a;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            eVar.getClass();
            int i = 2;
            int[] iArr = {0, 0};
            int i2 = 0;
            try {
                Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                iArr[0] = registerReceiver != null ? registerReceiver.getIntExtra("temperature", 0) : 0;
                iArr[1] = registerReceiver != null ? registerReceiver.getIntExtra("status", 0) : 0;
            } catch (Throwable th) {
                Log.m105924i("FinderLiveUtil", "getBatteryInfo ex:" + th.getMessage());
            }
            finderLiveThermalStateReportStruct.f155709i = iArr[0] / 10;
            int i3 = iArr[1];
            if (i3 != 2) {
                i = i3 == 5 ? 3 : 1;
            }
            finderLiveThermalStateReportStruct.f155707g = i;
            Integer O = C62042e.f176370a.mo87029O();
            if (O != null) {
                i2 = O.intValue();
            }
            finderLiveThermalStateReportStruct.f155708h = i2;
            finderLiveThermalStateReportStruct.mo86054n();
            return true;
        }
    }
}
