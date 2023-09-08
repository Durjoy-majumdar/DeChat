package p340fm;

import com.tencent.p014mm.autogen.events.GpsInfoEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import ih0.C117197j;
import lh0.C21436f;
import lh0.C34262g;

/* renamed from: fm.y */
public class C116888y extends IStaticListener<GpsInfoEvent> {
    public boolean callback(IEvent iEvent) {
        GpsInfoEvent gpsInfoEvent = (GpsInfoEvent) iEvent;
        C117197j wx02 = C117197j.wx0();
        wx02.getClass();
        long currentTicks = Util.currentTicks();
        if (gpsInfoEvent != null) {
            try {
                GpsInfoEvent.C114677a aVar = gpsInfoEvent.f343562d;
                if (aVar != null) {
                    AiWeixinGpsInfoStruct aiWeixinGpsInfoStruct = wx02.f351083f;
                    aiWeixinGpsInfoStruct.f343648d = (long) aVar.f343563a;
                    long j = aVar.f343564b;
                    aiWeixinGpsInfoStruct.f343649e = j;
                    aiWeixinGpsInfoStruct.mo86046c("lastGpsTimeMs", j);
                    aiWeixinGpsInfoStruct.f343650f = (long) gpsInfoEvent.f343562d.f343565c;
                    aiWeixinGpsInfoStruct.f343652h = aiWeixinGpsInfoStruct.mo86045b("latitude", gpsInfoEvent.f343562d.f343567e + "", true);
                    aiWeixinGpsInfoStruct.f343651g = aiWeixinGpsInfoStruct.mo86045b("longitude", gpsInfoEvent.f343562d.f343566d + "", true);
                    AiWeixinGpsInfoStruct aiWeixinGpsInfoStruct2 = wx02.f351083f;
                    C34262g vx02 = C34262g.vx0();
                    vx02.requireAccountInitialized();
                    C21436f fVar = vx02.f92371i;
                    String p = aiWeixinGpsInfoStruct2.mo1005p();
                    MultiProcessMMKV b = fVar.mo33601b();
                    if (b != null) {
                        b.putString("last_gps_info", p);
                    }
                }
            } catch (Exception unused) {
            }
        }
        Log.m105925i("MicroMsg.AiWeixinData", "note gps info cost [%s]", Long.valueOf(Util.ticksToNow(currentTicks)));
        return false;
    }
}
