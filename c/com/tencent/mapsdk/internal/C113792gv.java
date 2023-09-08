package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;

/* renamed from: com.tencent.mapsdk.internal.gv */
public class C113792gv extends C113793gw {
    @Json(name = "create")

    /* renamed from: a */
    public long f340426a;
    @Json(name = "destroy")

    /* renamed from: b */
    public long f340427b;
    @Json(name = "mapLoad")

    /* renamed from: c */
    private C113783gr f340428c;
    @Json(name = "oversea")

    /* renamed from: d */
    private C113790gt f340429d;
    @Json(name = "indoorLog")

    /* renamed from: e */
    private C113781gq f340430e;
    @Json(name = "darkMode")

    /* renamed from: f */
    private C113776gl f340431f;
    @Json(name = "pointEvent")

    /* renamed from: h */
    private C113791gu f340432h;
    @Json(name = "aoi")

    /* renamed from: i */
    private C113771gh f340433i;
    @Json(name = "vectorHeat")

    /* renamed from: j */
    private C113796gz f340434j;
    @Json(name = "heatMap")

    /* renamed from: k */
    private C113780gp f340435k;
    @Json(name = "arcLine")

    /* renamed from: l */
    private C113772gi f340436l;
    @Json(name = "dotScatter")

    /* renamed from: m */
    private C113777gm f340437m;
    @Json(name = "bitmapScatter")

    /* renamed from: n */
    private C113773gj f340438n;
    @Json(name = "trail")

    /* renamed from: o */
    private C113794gx f340439o;
    @Json(name = "model")

    /* renamed from: p */
    private C113778gn f340440p;
    @Json(name = "groundOverlay")

    /* renamed from: q */
    private C113779go f340441q;
    @Json(name = "offline")

    /* renamed from: r */
    private C113789gs f340442r;
    @Json(name = "customStyle")

    /* renamed from: s */
    private C113774gk f340443s;
    @Json(name = "ugc")

    /* renamed from: t */
    private C113795gy f340444t;

    public C113792gv(long j) {
        super(j);
        this.f340426a = j;
    }

    /* renamed from: s */
    private C113792gv m157027s() {
        this.f340427b = System.currentTimeMillis() - this.f340426a;
        return this;
    }

    /* renamed from: a */
    public final C113783gr mo172154a() {
        if (this.f340428c == null) {
            this.f340428c = new C113783gr(this.f340445g);
        }
        return this.f340428c;
    }

    /* renamed from: b */
    public final C113790gt mo172155b() {
        if (this.f340429d == null) {
            this.f340429d = new C113790gt(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340429d;
    }

    /* renamed from: c */
    public final C113795gy mo172156c() {
        if (this.f340444t == null) {
            this.f340444t = new C113795gy(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340444t;
    }

    /* renamed from: d */
    public final C113781gq mo172157d() {
        if (this.f340430e == null) {
            this.f340430e = new C113781gq(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340430e;
    }

    /* renamed from: e */
    public final C113776gl mo172158e() {
        if (this.f340431f == null) {
            this.f340431f = new C113776gl(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340431f;
    }

    /* renamed from: f */
    public final C113791gu mo172159f() {
        if (this.f340432h == null) {
            this.f340432h = new C113791gu(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340432h;
    }

    /* renamed from: g */
    public final C113771gh mo172160g() {
        if (this.f340433i == null) {
            this.f340433i = new C113771gh(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340433i;
    }

    /* renamed from: h */
    public final C113796gz mo172161h() {
        if (this.f340434j == null) {
            this.f340434j = new C113796gz(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340434j;
    }

    /* renamed from: i */
    public final C113780gp mo172162i() {
        if (this.f340435k == null) {
            this.f340435k = new C113780gp(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340435k;
    }

    /* renamed from: j */
    public final C113772gi mo172163j() {
        if (this.f340436l == null) {
            this.f340436l = new C113772gi(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340436l;
    }

    /* renamed from: k */
    public final C113777gm mo172164k() {
        if (this.f340437m == null) {
            this.f340437m = new C113777gm(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340437m;
    }

    /* renamed from: l */
    public final C113773gj mo172165l() {
        if (this.f340438n == null) {
            this.f340438n = new C113773gj(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340438n;
    }

    /* renamed from: m */
    public final C113794gx mo172166m() {
        if (this.f340439o == null) {
            this.f340439o = new C113794gx(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340439o;
    }

    /* renamed from: n */
    public final C113778gn mo172167n() {
        if (this.f340440p == null) {
            this.f340440p = new C113778gn(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340440p;
    }

    /* renamed from: o */
    public final C113779go mo172168o() {
        if (this.f340441q == null) {
            this.f340441q = new C113779go(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340441q;
    }

    /* renamed from: p */
    public final C113789gs mo172169p() {
        if (this.f340442r == null) {
            this.f340442r = new C113789gs(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340442r;
    }

    /* renamed from: q */
    public final C113774gk mo172170q() {
        if (this.f340443s == null) {
            this.f340443s = new C113774gk(System.currentTimeMillis() - this.f340445g);
        }
        return this.f340443s;
    }
}
