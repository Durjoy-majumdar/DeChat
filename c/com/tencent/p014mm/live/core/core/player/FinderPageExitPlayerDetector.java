package com.tencent.p014mm.live.core.core.player;

import android.app.Activity;
import android.view.View;
import b50.C54407c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.plugin.finder.detector.api.detect.FinderEventDetector;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import f50.C58924d;
import fs3.C59314b;
import fs3.C59316c;
import gs3.C59698c;
import gy3.C87412m;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import z40.C66733d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/live/core/core/player/FinderPageExitPlayerDetector;", "Lcom/tencent/plugin/finder/detector/api/detect/FinderEventDetector;", "Lf50/d;", "<init>", "()V", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector */
public final class FinderPageExitPlayerDetector extends FinderEventDetector<C58924d> {
    /* renamed from: f */
    public String mo76379f() {
        return "FinderPageExitPlayerDetector";
    }

    /* renamed from: g */
    public long mo76380g() {
        return 1;
    }

    /* renamed from: h */
    public Map<String, C59316c<C58924d>> mo76381h(String str) {
        boolean z;
        String str2;
        C87412m.m108594g(str, "detectorSource");
        ConcurrentHashMap<String, C59316c<T>> concurrentHashMap = this.f165800d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : concurrentHashMap.entrySet()) {
            TXCloudVideoView playerView = ((C58924d) ((C59316c) next.getValue()).f169613a).getPlayerView();
            Activity e = mo82661e(playerView);
            boolean z2 = true;
            if (e != null) {
                z = e.isDestroyed();
            } else {
                C59314b eventDetectorAdapter = ((C58924d) ((C59316c) next.getValue()).f169613a).getEventDetectorAdapter();
                if (eventDetectorAdapter == null || (str2 = eventDetectorAdapter.f169609e) == null) {
                    str2 = "";
                }
                String str3 = this.f165801e;
                StringBuilder sb = new StringBuilder();
                sb.append("checkBindActivityDestroyed activityKey: ");
                sb.append(str2);
                sb.append(" Sets: ");
                HashSet<String> hashSet = C59698c.f170542b;
                sb.append(hashSet);
                Log.m105924i(str3, sb.toString());
                z = !hashSet.contains(str2);
            }
            C59314b eventDetectorAdapter2 = ((C58924d) ((C59316c) next.getValue()).f169613a).getEventDetectorAdapter();
            Integer num = null;
            View view = eventDetectorAdapter2 != null ? eventDetectorAdapter2.f169606b : null;
            String str4 = this.f165801e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("getLeaks eventName: ");
            sb4.append(((C59316c) next.getValue()).mo84417a());
            sb4.append(" detectorSource: ");
            sb4.append(str);
            sb4.append(" playerView: ");
            sb4.append(playerView);
            sb4.append(" pageContext: ");
            sb4.append(e);
            sb4.append(" hasCode: ");
            if (e != null) {
                num = Integer.valueOf(e.hashCode());
            }
            sb4.append(num);
            sb4.append(" isActivityDestroyed: ");
            sb4.append(z);
            sb4.append(" miniWindowView: ");
            sb4.append(view);
            Log.m105924i(str4, sb4.toString());
            if (!z || mo82665p(playerView) || mo82665p(view)) {
                z2 = false;
            }
            if (z2) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    /* renamed from: i */
    public int mo76382i() {
        return 4;
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo76383j(fs3.C59316c<f50.C58924d> r6, hs3.C60149a r7) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "detectParams"
            gy3.C87412m.m108594g(r7, r0)
            T r0 = r6.f169613a
            f50.d r0 = (f50.C58924d) r0
            com.tencent.rtmp.ui.TXCloudVideoView r0 = r0.getPlayerView()
            android.app.Activity r1 = r5.mo82661e(r0)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            T r3 = r6.f169613a
            java.lang.String r4 = "player"
            r2.put(r4, r3)
            T r6 = r6.f169613a
            f50.d r6 = (f50.C58924d) r6
            boolean r6 = r6.mo84111b()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r3 = "isMute"
            r2.put(r3, r6)
            java.lang.String r6 = "null"
            if (r0 != 0) goto L_0x0038
            r0 = r6
        L_0x0038:
            java.lang.String r3 = "playerView"
            r2.put(r3, r0)
            java.lang.String r0 = r7.f171695a
            java.lang.String r3 = "detectorSource"
            r2.put(r3, r0)
            if (r1 != 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r6 = r1
        L_0x0048:
            java.lang.String r0 = "activityContext"
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.core.core.player.FinderPageExitPlayerDetector.mo76383j(fs3.c, hs3.a):java.lang.String");
    }

    /* renamed from: k */
    public void mo76384k(C59316c<C58924d> cVar) {
        C87412m.m108594g(cVar, "event");
        String str = this.f165801e;
        Log.m105924i(str, "handleRecover isPlaying: " + ((C58924d) cVar.f169613a).isPlaying());
        if (((C58924d) cVar.f169613a).isPlaying()) {
            ((C58924d) cVar.f169613a).stopPlay(true);
        }
    }

    /* renamed from: l */
    public boolean mo76385l() {
        C66733d dVar = C66733d.f191763a;
        C54407c cVar = C66733d.f191764b;
        return cVar != null && cVar.mo75204eI();
    }
}
