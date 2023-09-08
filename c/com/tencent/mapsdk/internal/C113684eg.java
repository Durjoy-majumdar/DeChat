package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.mapsdk.internal.C113667ef;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngDeserializer;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngListDeserializer;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.eg */
public class C113684eg extends C113667ef {
    @Json(name = "detail")

    /* renamed from: a */
    public C113685a f340129a;

    /* renamed from: com.tencent.mapsdk.internal.eg$a */
    public static class C113685a extends C113667ef.C113668a {
        @Json(name = "styleTable")

        /* renamed from: a */
        public C113686a f340130a;

        /* renamed from: com.tencent.mapsdk.internal.eg$a$a */
        public static class C113686a extends C113667ef.C113676c {
            @Json(name = "theme")

            /* renamed from: a */
            public C113688b f340131a;
            @Json(name = "control")

            /* renamed from: b */
            public C113687a f340132b;

            /* renamed from: com.tencent.mapsdk.internal.eg$a$a$a */
            public static final class C113687a extends C113667ef.C113676c.C113677a {
            }

            /* renamed from: com.tencent.mapsdk.internal.eg$a$a$b */
            public static class C113688b extends JsonComposer {
                @Json(name = "standard")

                /* renamed from: a */
                public C113690b f340133a;

                /* renamed from: com.tencent.mapsdk.internal.eg$a$a$b$a */
                public static final class C113689a extends C113667ef.C113676c.C113680c {
                    @Json(deserializer = LatLngDeserializer.class, name = "position")

                    /* renamed from: a */
                    public LatLng f340134a;
                    @Json(name = "rotate")

                    /* renamed from: b */
                    public List<Double> f340135b;
                    @Json(name = "scale")

                    /* renamed from: c */
                    public double f340136c;
                    @Json(name = "autoScale")

                    /* renamed from: d */
                    public boolean f340137d;
                    @Json(name = "pixelBound")

                    /* renamed from: e */
                    public List<Integer> f340138e;
                    @Json(deserializer = LatLngListDeserializer.class, name = "pedestal")

                    /* renamed from: f */
                    public List<LatLng> f340139f;
                    @Json(name = "animation")

                    /* renamed from: g */
                    public C113667ef.C113676c.C113683f f340140g;
                    @Json(name = "exposure")

                    /* renamed from: h */
                    public double f340141h;
                }

                /* renamed from: com.tencent.mapsdk.internal.eg$a$a$b$b */
                public static class C113690b extends JsonComposer {
                    @Json(name = "defaultStyle")

                    /* renamed from: a */
                    public C113689a f340142a;
                }
            }

            /* renamed from: a */
            public final boolean mo171990a() {
                return (!super.mo171990a() || this.f340131a == null || this.f340132b == null) ? false : true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r0 = r2.f340130a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo171989a() {
            /*
                r2 = this;
                boolean r0 = super.mo171989a()
                if (r0 == 0) goto L_0x001c
                com.tencent.mapsdk.internal.dz r0 = com.tencent.mapsdk.internal.C113646dz.GLModel
                java.lang.String r1 = r2.f340094b
                boolean r0 = r0.mo171982a((java.lang.String) r1)
                if (r0 == 0) goto L_0x001c
                com.tencent.mapsdk.internal.eg$a$a r0 = r2.f340130a
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo171990a()
                if (r0 == 0) goto L_0x001c
                r0 = 1
                return r0
            L_0x001c:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113684eg.C113685a.mo171989a():boolean");
        }
    }

    /* renamed from: a */
    public final int mo171986a() {
        if (mo171988c()) {
            return this.f340129a.f340095c.f340096a;
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo171987b() {
        if (mo171988c()) {
            return this.f340129a.f340130a.f340114c;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f340129a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo171988c() {
        /*
            r1 = this;
            boolean r0 = super.mo171988c()
            if (r0 == 0) goto L_0x0012
            com.tencent.mapsdk.internal.eg$a r0 = r1.f340129a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo171989a()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113684eg.mo171988c():boolean");
    }
}
