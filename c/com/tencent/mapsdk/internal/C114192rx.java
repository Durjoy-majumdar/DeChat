package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.rx */
public final class C114192rx extends JsonComposer {

    /* renamed from: a */
    public static final int f341886a = 1;

    /* renamed from: b */
    public static final int f341887b = 2;

    /* renamed from: c */
    public static final int f341888c = 3;
    @Json(name = "scenetype")

    /* renamed from: d */
    public int f341889d;
    @Json(name = "tilesrc")

    /* renamed from: e */
    public C114199sd f341890e;

    /* renamed from: a */
    private int m159572a() {
        return this.f341889d;
    }

    /* renamed from: b */
    private C114199sd m159574b() {
        return this.f341890e;
    }

    /* renamed from: c */
    private void m159575c() {
        this.f341889d = 1;
    }

    /* renamed from: a */
    private void m159573a(C114199sd sdVar) {
        this.f341890e = sdVar;
    }
}
