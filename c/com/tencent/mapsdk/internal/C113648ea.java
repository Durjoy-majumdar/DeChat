package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.mapsdk.internal.C113667ef;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ea */
public final class C113648ea extends C113667ef {
    @Json(name = "detail")

    /* renamed from: a */
    public C113649a f340048a;

    /* renamed from: com.tencent.mapsdk.internal.ea$a */
    public static class C113649a extends C113667ef.C113668a {
        @Json(name = "styleTable")

        /* renamed from: a */
        public C113650a f340049a;

        /* renamed from: com.tencent.mapsdk.internal.ea$a$a */
        public static class C113650a extends C113667ef.C113676c {
            @Json(name = "theme")

            /* renamed from: a */
            public C113652b f340050a;
            @Json(name = "control")

            /* renamed from: b */
            public C113651a f340051b;

            /* renamed from: com.tencent.mapsdk.internal.ea$a$a$a */
            public static final class C113651a extends C113667ef.C113676c.C113677a {
                @Json(name = "maxIntensity")

                /* renamed from: a */
                public double f340052a;
                @Json(name = "minIntensity")

                /* renamed from: b */
                public double f340053b;
                @Json(name = "enable3D")

                /* renamed from: c */
                public boolean f340054c;
                @Json(name = "heightRange")

                /* renamed from: d */
                public List<Double> f340055d;
                @Json(name = "animated")

                /* renamed from: e */
                public boolean f340056e;

                /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
                    r0 = r1.f340055d;
                 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final boolean mo171991a() {
                    /*
                        r1 = this;
                        boolean r0 = super.mo171991a()
                        if (r0 == 0) goto L_0x0012
                        java.util.List<java.lang.Double> r0 = r1.f340055d
                        if (r0 == 0) goto L_0x0012
                        int r0 = r0.size()
                        if (r0 <= 0) goto L_0x0012
                        r0 = 1
                        return r0
                    L_0x0012:
                        r0 = 0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113648ea.C113649a.C113650a.C113651a.mo171991a():boolean");
                }
            }

            /* renamed from: com.tencent.mapsdk.internal.ea$a$a$b */
            public static class C113652b extends JsonComposer {
                @Json(name = "standard")

                /* renamed from: a */
                public C113654b f340057a;

                /* renamed from: com.tencent.mapsdk.internal.ea$a$a$b$a */
                public static final class C113653a extends C113667ef.C113676c.C113680c {
                    @Json(name = "gap")

                    /* renamed from: a */
                    public int f340058a;
                    @Json(name = "radius")

                    /* renamed from: b */
                    public int f340059b;
                    @Json(name = "shapeType")

                    /* renamed from: c */
                    public String f340060c;
                    @Json(name = "gradient")

                    /* renamed from: d */
                    public C113667ef.C113676c.C113682e f340061d;
                    @Json(name = "animation")

                    /* renamed from: e */
                    public C113667ef.C113676c.C113681d f340062e;
                }

                /* renamed from: com.tencent.mapsdk.internal.ea$a$a$b$b */
                public static class C113654b extends JsonComposer {
                    @Json(name = "defaultStyle")

                    /* renamed from: a */
                    public C113653a f340063a;
                }
            }

            /* renamed from: a */
            public final boolean mo171990a() {
                return (!super.mo171990a() || this.f340050a == null || this.f340051b == null) ? false : true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r0 = r2.f340049a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo171989a() {
            /*
                r2 = this;
                boolean r0 = super.mo171989a()
                if (r0 == 0) goto L_0x001c
                com.tencent.mapsdk.internal.dz r0 = com.tencent.mapsdk.internal.C113646dz.Aggregation
                java.lang.String r1 = r2.f340094b
                boolean r0 = r0.mo171982a((java.lang.String) r1)
                if (r0 == 0) goto L_0x001c
                com.tencent.mapsdk.internal.ea$a$a r0 = r2.f340049a
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo171990a()
                if (r0 == 0) goto L_0x001c
                r0 = 1
                return r0
            L_0x001c:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113648ea.C113649a.mo171989a():boolean");
        }
    }

    /* renamed from: a */
    public final int mo171986a() {
        if (mo171988c()) {
            return this.f340048a.f340095c.f340096a;
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo171987b() {
        if (mo171988c()) {
            return this.f340048a.f340049a.f340114c;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f340048a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo171988c() {
        /*
            r1 = this;
            boolean r0 = super.mo171988c()
            if (r0 == 0) goto L_0x0012
            com.tencent.mapsdk.internal.ea$a r0 = r1.f340048a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo171989a()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113648ea.mo171988c():boolean");
    }
}
