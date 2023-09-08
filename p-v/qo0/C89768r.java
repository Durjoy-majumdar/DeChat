package qo0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hj0.C87531a;
import hj0.C87535e;
import java.math.BigDecimal;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import po0.C89392a;
import po0.C89402b;
import qo0.C89750q;
import sx3.C90364q0;

/* renamed from: qo0.r */
public final class C89768r extends C89750q.C89752b {

    /* renamed from: a */
    public final /* synthetic */ C89750q f258126a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89768r(C89750q qVar) {
        super(qVar);
        this.f258126a = qVar;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("get position  fail");
        sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : "");
        Log.m105920e("MicroMsg.VideoCast.VideoCastController", sb.toString());
        C89750q.C89751a aVar = new C89750q.C89751a(C89724a.ACTION_ERROR);
        this.f258126a.f258103n.stopTimer();
        C89750q.m112209a(this.f258126a, aVar);
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        C87535e eVar2 = eVar;
        C87412m.m108594g(eVar2, "response");
        Map map = eVar2.f253594b;
        if (map != null && !map.isEmpty() && map.containsKey("RelTime") && map.containsKey("TrackDuration")) {
            String str = ((C87531a) C90364q0.m113145d(map, "RelTime")).f253586a;
            String str2 = ((C87531a) C90364q0.m113145d(map, "TrackDuration")).f253586a;
            Log.m105924i("MicroMsg.VideoCast.VideoCastController", "getProgressTimeMs: relTime = " + str + ", duration =  " + str2);
            C89402b.C62411c cVar = C89402b.f257404m;
            int b = (int) cVar.mo87463b(str);
            int b2 = (int) cVar.mo87463b(str2);
            C89750q qVar = this.f258126a;
            qVar.f258098i = b;
            C89392a aVar = (C89392a) qVar.f258091b;
            aVar.getClass();
            Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onVideoTimeUpdate: currentPosition = " + b + " duration = " + b2);
            try {
                if (Math.abs(b - aVar.f257401a) >= 250) {
                    aVar.f257401a = b;
                    double d = (double) 1000;
                    double doubleValue = new BigDecimal((((double) b) * 1.0d) / d).setScale(3, 4).doubleValue();
                    JSONObject b3 = aVar.mo123728b();
                    b3.put("type", "DLNA");
                    b3.put("position", doubleValue);
                    b3.put("duration", (((double) b2) * 1.0d) / d);
                    aVar.mo123727a(new C89392a.C89399g(), b3);
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoTimeUpdate fail", e);
            }
            int i = (int) ((((double) b) / ((double) b2)) * ((double) 100));
            C89392a aVar2 = (C89392a) this.f258126a.f258091b;
            aVar2.getClass();
            Log.m105924i("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "onVideoProgress: " + i);
            try {
                JSONObject b4 = aVar2.mo123728b();
                b4.put("buffered", i);
                b4.put("type", "DLNA");
                aVar2.mo123727a(new C89392a.C89398f(), b4);
            } catch (JSONException e2) {
                Log.m105921e("MicroMsg.SameLayer.AppBrandVideoCastEventHandler", "OnXWebVideoProgress fail", e2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("get position success, relTime: ");
            C89402b.C62411c cVar2 = C89402b.f257404m;
            sb.append((int) cVar2.mo87463b(str));
            sb.append(" duration: ");
            sb.append((int) cVar2.mo87463b(str2));
            Log.m105924i("MicroMsg.VideoCast.VideoCastController", sb.toString());
        }
    }
}
