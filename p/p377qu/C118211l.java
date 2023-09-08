package p377qu;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.autogen.events.GpsInfoEvent;
import com.tencent.p014mm.modelstat.C114750t;
import com.tencent.p014mm.modelstat.C114754u;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.util.HashMap;
import p680ru.C101464l;

@C86522b
/* renamed from: qu.l */
public class C118211l extends C86301e implements C101464l {
    /* renamed from: S8 */
    public void mo140962S8(int i, String str) {
        C114750t.m161442g(i, str);
    }

    /* renamed from: f9 */
    public void mo140963f9(int i, float f, float f2, int i2) {
        HashMap<String, Long> hashMap = C114750t.f344056a;
        synchronized (C114750t.class) {
            if (i < 2000 || f == 0.0f || f2 == 0.0f) {
                Log.m105921e("MicroMsg.NetTypeReporter", "reportGps, invalid args, scene = %d, lon = %f, lat = %f, pre = %d", Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2));
                return;
            } else if (Util.milliSecondsToNow(C114750t.f344069n) < 60000) {
                Log.m105921e("MicroMsg.NetTypeReporter", "reportGps, hit lastReportGpsLimit, request dropped, scene = %d, lon = %f, lat = %f, pre = %d", Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2));
                return;
            } else {
                Log.m105925i("MicroMsg.NetTypeReporter", "reportGps scene:%d lon:%f lat:%f pre:%d last:%d", Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2), Long.valueOf(Util.milliSecondsToNow(C114750t.f344069n)));
                C114750t.f344069n = Util.nowMilliSecond();
                C114750t.f344068m = i;
                C114750t.f344064i = Util.nowMilliSecond();
                C114750t.f344067l = i2;
                C114750t.f344065j = f2;
                C114750t.f344066k = f;
                GpsInfoEvent gpsInfoEvent = new GpsInfoEvent();
                GpsInfoEvent.C114677a aVar = gpsInfoEvent.f343562d;
                aVar.f343563a = i;
                aVar.f343564b = Util.nowMilliSecond();
                GpsInfoEvent.C114677a aVar2 = gpsInfoEvent.f343562d;
                aVar2.f343565c = i2;
                aVar2.f343566d = f;
                aVar2.f343567e = f2;
                gpsInfoEvent.publish();
                if (MMApplicationContext.getContext().checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                    Log.m105929w("MicroMsg.NetTypeReporter", "reportGps failed, no location perms: scene=%d", Integer.valueOf(i));
                    return;
                }
                try {
                    ConnectivityCompat.Companion.startScanWiFi();
                    C86709a0.m107525e().postToWorkerDelayed(new C114754u(), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.NetTypeReporter", "reportGps :%s", Util.stackTraceToString(e));
                }
            }
        }
        return;
    }
}
