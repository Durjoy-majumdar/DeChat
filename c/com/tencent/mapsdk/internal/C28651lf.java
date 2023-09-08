package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.lf */
public enum C28651lf {
    NONE(-1),
    SATELLITE(0),
    DEM(1),
    MAP(2),
    STREET_VIEW_ROAD(3),
    TRAFFIC_NETWORK(4),
    INDOOR_BUILDINGS(5),
    LANDMARK(6),
    TILE_OVERLAY(7),
    INDOOR_CONFIG(8),
    NUM(9);
    

    /* renamed from: l */
    private final int f78618l;

    private C28651lf(int i) {
        this.f78618l = i;
    }

    /* renamed from: a */
    private static C28651lf m38320a(int i) {
        for (C28651lf lfVar : values()) {
            if (lfVar.f78618l == i) {
                return lfVar;
            }
        }
        return NONE;
    }

    /* renamed from: a */
    private int m38319a() {
        return this.f78618l;
    }
}
