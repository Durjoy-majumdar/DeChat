package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.mapsdk.internal.C113667ef;

/* renamed from: com.tencent.mapsdk.internal.eb */
public final class C113655eb extends C113667ef {
    @Json(name = "detail")

    /* renamed from: a */
    public C113656a f340064a;

    /* renamed from: com.tencent.mapsdk.internal.eb$a */
    public static class C113656a extends C113667ef.C113668a {
        @Json(name = "styleTable")

        /* renamed from: a */
        public C113657a f340065a;

        /* renamed from: com.tencent.mapsdk.internal.eb$a$a */
        public static class C113657a extends C113667ef.C113676c {
            @Json(name = "theme")

            /* renamed from: a */
            public C113660b f340066a;
            @Json(name = "control")

            /* renamed from: b */
            public C113658a f340067b;

            /* renamed from: com.tencent.mapsdk.internal.eb$a$a$a */
            public static final class C113658a extends C113667ef.C113676c.C113677a {
                @Json(name = "enable3D")

                /* renamed from: a */
                public boolean f340068a;
                @Json(name = "animated")

                /* renamed from: b */
                public boolean f340069b;
                @Json(name = "animation")

                /* renamed from: c */
                public C113659a f340070c;

                /* renamed from: com.tencent.mapsdk.internal.eb$a$a$a$a */
                public static class C113659a extends JsonComposer {
                    @Json(name = "highlightDuration")

                    /* renamed from: a */
                    public double f340071a;
                    @Json(name = "highlightColor")

                    /* renamed from: b */
                    public int f340072b;
                    @Json(name = "duration")

                    /* renamed from: c */
                    public double f340073c;
                }
            }

            /* renamed from: com.tencent.mapsdk.internal.eb$a$a$b */
            public static class C113660b extends JsonComposer {
                @Json(name = "standard")

                /* renamed from: a */
                public C113663b f340074a;

                /* renamed from: com.tencent.mapsdk.internal.eb$a$a$b$a */
                public static final class C113661a extends C113667ef.C113676c.C113680c {
                    @Json(name = "width")

                    /* renamed from: a */
                    public int f340075a;
                    @Json(name = "radian")

                    /* renamed from: b */
                    public double f340076b;
                    @Json(name = "gradient")

                    /* renamed from: c */
                    public C113667ef.C113676c.C113682e f340077c;
                    @Json(name = "animation")

                    /* renamed from: d */
                    public C113662a f340078d;

                    /* renamed from: com.tencent.mapsdk.internal.eb$a$a$b$a$a */
                    public static final class C113662a extends C113667ef.C113676c.C113681d {
                        @Json(name = "highlightDuration")

                        /* renamed from: a */
                        public double f340079a;
                        @Json(name = "highlightColor")

                        /* renamed from: b */
                        public int f340080b;
                    }
                }

                /* renamed from: com.tencent.mapsdk.internal.eb$a$a$b$b */
                public static class C113663b extends JsonComposer {
                    @Json(name = "defaultStyle")

                    /* renamed from: a */
                    public C113661a f340081a;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r0 = r2.f340065a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo171989a() {
            /*
                r2 = this;
                boolean r0 = super.mo171989a()
                if (r0 == 0) goto L_0x001c
                com.tencent.mapsdk.internal.dz r0 = com.tencent.mapsdk.internal.C113646dz.ArcLine
                java.lang.String r1 = r2.f340094b
                boolean r0 = r0.mo171982a((java.lang.String) r1)
                if (r0 == 0) goto L_0x001c
                com.tencent.mapsdk.internal.eb$a$a r0 = r2.f340065a
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo171990a()
                if (r0 == 0) goto L_0x001c
                r0 = 1
                return r0
            L_0x001c:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113655eb.C113656a.mo171989a():boolean");
        }
    }

    /* renamed from: a */
    public final int mo171986a() {
        if (mo171988c()) {
            return this.f340064a.f340095c.f340096a;
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo171987b() {
        if (mo171988c()) {
            return this.f340064a.f340065a.f340114c;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f340064a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo171988c() {
        /*
            r1 = this;
            boolean r0 = super.mo171988c()
            if (r0 == 0) goto L_0x0012
            com.tencent.mapsdk.internal.eb$a r0 = r1.f340064a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo171989a()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113655eb.mo171988c():boolean");
    }
}
