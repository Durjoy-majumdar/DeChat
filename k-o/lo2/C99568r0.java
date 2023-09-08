package lo2;

import android.graphics.PointF;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import pn3.C100827a;
import rq2.C101425k;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: lo2.r0 */
public class C99568r0 {
    /* renamed from: a */
    public static boolean m129955a(SnsInfo snsInfo, List<PointF> list, ADXml.C95018g.C95019a aVar, int i) {
        boolean z;
        int i2;
        ADXml.C95018g.C95019a aVar2 = aVar;
        SnsMethodCalculate.markStartTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        boolean z2 = false;
        if (aVar2 == null || C101425k.m133097a(list)) {
            Log.m105920e("GestureHelper", "gestureInfo is null or path is empty");
            SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return false;
        }
        try {
            float f = aVar2.f275700c;
            List<PointF> d = C100827a.m132082d(list);
            String t = C102236a0.m134770t(C100827a.m132083e(d));
            List<List<PointF>> d2 = m129958d(aVar);
            if (!C101425k.m133097a(d2)) {
                boolean b = m129956b(snsInfo, aVar, d, d2, t, i);
                SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
                return b;
            }
            List<PointF> s0 = C102236a0.m134769s0(aVar2.f275702e);
            if (!C101425k.m133097a(s0)) {
                float a = (float) C100827a.m132079a(s0, d);
                String t2 = C102236a0.m134770t(s0);
                Log.m105925i("GestureHelper", "forwardSimilarity: %f, targetDistance: %f", Float.valueOf(a), Float.valueOf(f));
                if (a <= f) {
                    z = true;
                    i2 = 2;
                } else {
                    z = false;
                    i2 = 1;
                }
                try {
                    C115669n.INSTANCE.mo160131h(16552, snsInfo.getTimeLine().f283893Id, t2, t, Integer.valueOf((int) (100.0f * a)), Integer.valueOf(i2), Long.valueOf(Util.safeParseLong(snsInfo.getAid())), snsInfo.getAdInfo().uxInfo);
                    m129957c(i2, a, f, snsInfo.getAdInfo().uxInfo, snsInfo.getTimeLine().f283893Id, i);
                } catch (Exception e) {
                    e = e;
                }
                z2 = z;
            }
            SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return z2;
        } catch (Exception e2) {
            e = e2;
            z = false;
            Log.printErrStackTrace("GestureHelper", e, "recog gesture error!", new Object[0]);
            z2 = z;
            SnsMethodCalculate.markEndTimeMs("checkGestureDraw", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return z2;
        }
    }

    /* renamed from: b */
    public static boolean m129956b(SnsInfo snsInfo, ADXml.C95018g.C95019a aVar, List<PointF> list, List<List<PointF>> list2, String str, int i) {
        boolean z;
        int i2;
        SnsMethodCalculate.markStartTimeMs("checkGestureWithPointItems", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        boolean z2 = false;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            float f = aVar.f275700c;
            float f2 = Float.MAX_VALUE;
            for (List<PointF> a : list2) {
                float a2 = (float) C100827a.m132079a(a, list);
                Log.m105918d("GestureHelper", "current forwardSimilarity: " + a2);
                f2 = Math.min(a2, f2);
            }
            Log.m105924i("GestureHelper", "forwardSimilarityMin: " + f2 + ", targetDistance = " + f + ", costTime = " + (System.currentTimeMillis() - currentTimeMillis));
            if (f2 <= f) {
                z = true;
                i2 = 2;
            } else {
                z = false;
                i2 = 1;
            }
            try {
                C115669n.INSTANCE.mo160131h(16552, snsInfo.getTimeLine().f283893Id, "", str, Integer.valueOf((int) (100.0f * f2)), Integer.valueOf(i2), Long.valueOf(Util.safeParseLong(snsInfo.getAid())), snsInfo.getAdInfo().uxInfo);
                m129957c(i2, f2, f, snsInfo.getAdInfo().uxInfo, snsInfo.getTimeLine().f283893Id, i);
            } catch (Throwable th) {
                th = th;
                z2 = z;
            }
        } catch (Throwable th4) {
            th = th4;
            Log.m105920e("GestureHelper", th.toString());
            z = z2;
            SnsMethodCalculate.markEndTimeMs("checkGestureWithPointItems", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("checkGestureWithPointItems", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        return z;
    }

    /* renamed from: c */
    public static void m129957c(int i, float f, float f2, String str, String str2, int i2) {
        SnsMethodCalculate.markStartTimeMs("gestureRegCgiReport", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("result", i);
            jSONObject2.put(FirebaseAnalytics.C113379b.SCORE, (double) f);
            jSONObject2.put("targetScore", (double) f2);
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", str);
            jSONObject.put("snsId", str2);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i2);
            C102260r.m134858a(String.valueOf(16552), jSONObject.toString());
        } catch (Exception e) {
            Log.m105920e("GestureHelper", "gestureCgiReport exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("gestureRegCgiReport", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
    }

    /* renamed from: d */
    public static List<List<PointF>> m129958d(ADXml.C95018g.C95019a aVar) {
        ADXml.C95018g.C95020b bVar;
        SnsMethodCalculate.markStartTimeMs("parseEachSamplePointsList", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        if (aVar == null) {
            SnsMethodCalculate.markEndTimeMs("parseEachSamplePointsList", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return null;
        }
        List<ADXml.C95018g.C95020b> list = aVar.f275703f;
        if (C101425k.m133097a(list)) {
            SnsMethodCalculate.markEndTimeMs("parseEachSamplePointsList", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext() && (bVar = (ADXml.C95018g.C95020b) it.next()) != null && !Util.isNullOrNil(bVar.f275704a)) {
            arrayList.add(C102236a0.m134769s0(bVar.f275704a));
        }
        SnsMethodCalculate.markEndTimeMs("parseEachSamplePointsList", "com.tencent.mm.plugin.sns.ad.helper.GestureHelper");
        return arrayList;
    }
}
