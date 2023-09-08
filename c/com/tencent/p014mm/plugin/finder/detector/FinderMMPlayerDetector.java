package com.tencent.p014mm.plugin.finder.detector;

import android.app.Activity;
import android.view.View;
import bf1.C54452a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.plugin.finder.detector.api.detect.FinderEventDetector;
import fs3.C59314b;
import fs3.C59316c;
import gg1.C32444a;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/detector/FinderMMPlayerDetector;", "Lcom/tencent/plugin/finder/detector/api/detect/FinderEventDetector;", "Lbf1/a;", "<init>", "()V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.detector.FinderMMPlayerDetector */
public final class FinderMMPlayerDetector extends FinderEventDetector<C54452a> {
    /* renamed from: f */
    public String mo76379f() {
        return "MMPlayerDetector";
    }

    /* renamed from: g */
    public long mo76380g() {
        return 0;
    }

    /* renamed from: h */
    public Map<String, C59316c<C54452a>> mo76381h(String str) {
        C87412m.m108594g(str, "detectorSource");
        ConcurrentHashMap<String, C59316c<T>> concurrentHashMap = this.f165800d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : concurrentHashMap.entrySet()) {
            View playerView = ((C54452a) ((C59316c) next.getValue()).f169613a).getPlayerView();
            Activity e = mo82661e(playerView);
            C59314b eventDetectorAdapter = ((C54452a) ((C59316c) next.getValue()).f169613a).getEventDetectorAdapter();
            Integer num = null;
            View view = eventDetectorAdapter != null ? eventDetectorAdapter.f169606b : null;
            boolean z = true;
            boolean isDestroyed = e != null ? e.isDestroyed() : true;
            String str2 = this.f165801e;
            StringBuilder sb = new StringBuilder();
            sb.append("getLeaks eventName: ");
            sb.append(((C59316c) next.getValue()).mo84417a());
            sb.append(" detectorSource: ");
            sb.append(str);
            sb.append(" playerView: ");
            sb.append(playerView);
            sb.append(" pageContext: ");
            sb.append(e);
            sb.append(" hasCode: ");
            if (e != null) {
                num = Integer.valueOf(e.hashCode());
            }
            sb.append(num);
            sb.append(" isActivityDestroyed: ");
            sb.append(isDestroyed);
            sb.append(" miniWindowView: ");
            sb.append(view);
            Log.m105924i(str2, sb.toString());
            if (!isDestroyed || mo82665p(playerView) || mo82665p(view)) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: i */
    public int mo76382i() {
        return 5;
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo76383j(fs3.C59316c<bf1.C54452a> r6, hs3.C60149a r7) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "detectParams"
            gy3.C87412m.m108594g(r7, r0)
            T r0 = r6.f169613a
            bf1.a r0 = (bf1.C54452a) r0
            android.view.View r0 = r0.getPlayerView()
            android.app.Activity r1 = r5.mo82661e(r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            T r3 = r6.f169613a
            java.lang.String r4 = "player"
            r2.put(r4, r3)
            T r6 = r6.f169613a
            bf1.a r6 = (bf1.C54452a) r6
            boolean r6 = r6.mo75295b()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r3 = "isMute"
            r2.put(r3, r6)
            java.lang.String r6 = "null"
            if (r0 != 0) goto L_0x0038
            r0 = r6
        L_0x0038:
            java.lang.String r3 = "playerView"
            r2.put(r3, r0)
            if (r1 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r6 = r1
        L_0x0041:
            java.lang.String r0 = "activityContext"
            r2.put(r0, r6)
            java.lang.String r6 = r7.f171695a
            java.lang.String r0 = "detectorSource"
            r2.put(r0, r6)
            if (r1 == 0) goto L_0x0054
            boolean r6 = r1.isDestroyed()
            goto L_0x0055
        L_0x0054:
            r6 = 1
        L_0x0055:
            java.lang.String r0 = "isDestroyed"
            r2.put(r0, r6)
            org.json.JSONArray r6 = r7.f171696b
            java.lang.String r7 = "traceDump"
            r2.put(r7, r6)
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = "JSONObject().apply {\n   …ump)\n        }.toString()"
            gy3.C87412m.m108593f(r6, r7)
            r7 = 0
            java.lang.String r0 = ","
            java.lang.String r1 = ";"
            java.lang.String r6 = z04.C112551y.m153814n(r6, r0, r1, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.detector.FinderMMPlayerDetector.mo76383j(fs3.c, hs3.a):java.lang.String");
    }

    /* renamed from: k */
    public void mo76384k(C59316c<C54452a> cVar) {
        C87412m.m108594g(cVar, "event");
    }

    /* renamed from: l */
    public boolean mo76385l() {
        C32444a aVar = C32444a.f86121a;
        return C32444a.f86213x.mo60266n().intValue() == 1;
    }
}
