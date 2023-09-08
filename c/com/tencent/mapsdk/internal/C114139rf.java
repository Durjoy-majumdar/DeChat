package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Basic;
import com.tencent.mapsdk.core.components.protocol.jce.trafficevent.Detail;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mapsdk.internal.rf */
public final class C114139rf {

    /* renamed from: a */
    public Map<String, C114140a> f341657a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C113554bj f341658b;

    /* renamed from: com.tencent.mapsdk.internal.rf$a */
    public static class C114140a {

        /* renamed from: a */
        public final C113995no f341659a;

        /* renamed from: b */
        public final Detail f341660b;

        public C114140a(C113995no noVar, Detail detail) {
            this.f341659a = noVar;
            this.f341660b = detail;
        }
    }

    public C114139rf(C113554bj bjVar) {
        this.f341658b = bjVar;
    }

    /* renamed from: c */
    private Map<String, C114140a> m159290c() {
        return this.f341657a;
    }

    /* renamed from: a */
    public final void mo172770a(List<Detail> list) {
        int i;
        if (this.f341658b != null && !list.isEmpty()) {
            for (Detail next : list) {
                String str = next.basic.icon_normal;
                int lastIndexOf = str.lastIndexOf("/");
                if (lastIndexOf != -1 && (i = lastIndexOf + 1) <= str.length()) {
                    String substring = str.substring(i);
                    C113889km.m157538a(C0949kl.f2243m, "type:" + next.basic.type + ", coord:" + next.basic.coord_lat + ", " + next.basic.coord_lon + ", minScale:" + next.basic.min_scale + ", maxScale:" + next.basic.max_scale);
                    C114140a aVar = this.f341657a.get(next.basic.eventid);
                    if (aVar == null) {
                        Basic basic = next.basic;
                        C113997nq nqVar = new C113997nq((double) basic.coord_lat, (double) basic.coord_lon, substring);
                        Basic basic2 = next.basic;
                        nqVar.anchor(basic2.anchor_x, basic2.anchor_y);
                        nqVar.minScaleLevel(next.basic.min_scale);
                        nqVar.maxScaleLevel(next.basic.max_scale);
                        nqVar.avoidAnnotation(true);
                        nqVar.avoidOtherMarker(true);
                        this.f341657a.put(next.basic.eventid, new C114140a((C113995no) this.f341658b.mo171680a(nqVar), next));
                    } else {
                        C113997nq nqVar2 = (C113997nq) aVar.f341659a.f340956d;
                        Basic basic3 = next.basic;
                        nqVar2.position((double) basic3.coord_lat, (double) basic3.coord_lon);
                        nqVar2.iconName(substring);
                        Basic basic4 = next.basic;
                        nqVar2.anchor(basic4.anchor_x, basic4.anchor_y);
                        nqVar2.minScaleLevel(next.basic.min_scale);
                        nqVar2.maxScaleLevel(next.basic.max_scale);
                        aVar.f341659a.mo172478a(nqVar2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo172772b(List<Detail> list) {
        if (!list.isEmpty()) {
            for (Detail next : list) {
                C114140a aVar = this.f341657a.get(next.basic.eventid);
                if (aVar != null) {
                    aVar.f341659a.remove();
                    this.f341657a.remove(next.basic.eventid);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo172771b() {
        mo172769a();
        this.f341657a = null;
    }

    /* renamed from: a */
    public final void mo172769a() {
        Map<String, C114140a> map = this.f341657a;
        if (map != null) {
            for (String str : map.keySet()) {
                C114140a aVar = this.f341657a.get(str);
                if (aVar != null) {
                    aVar.f341659a.remove();
                }
            }
            this.f341657a.clear();
        }
    }
}
