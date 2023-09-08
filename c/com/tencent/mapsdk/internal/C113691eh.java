package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.mapsdk.internal.C113667ef;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.eh */
public final class C113691eh extends C113667ef {
    @Json(name = "detail")

    /* renamed from: a */
    public C113692a f340143a;

    /* renamed from: com.tencent.mapsdk.internal.eh$a */
    public static class C113692a extends C113667ef.C113668a {
        @Json(name = "styleTable")

        /* renamed from: a */
        public C113693a f340144a;

        /* renamed from: com.tencent.mapsdk.internal.eh$a$a */
        public static class C113693a extends C113667ef.C113676c {
            @Json(name = "theme")

            /* renamed from: a */
            public C113695b f340145a;
            @Json(name = "control")

            /* renamed from: b */
            public C113694a f340146b;

            /* renamed from: com.tencent.mapsdk.internal.eh$a$a$a */
            public static final class C113694a extends C113667ef.C113676c.C113677a {
                @Json(name = "maxIntensity")

                /* renamed from: a */
                public double f340147a;
                @Json(name = "minIntensity")

                /* renamed from: b */
                public double f340148b;
                @Json(name = "enable3D")

                /* renamed from: c */
                public boolean f340149c;
                @Json(name = "heightRange")

                /* renamed from: d */
                public List<Double> f340150d;
                @Json(name = "animated")

                /* renamed from: e */
                public boolean f340151e;

                /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
                    r0 = r1.f340150d;
                 */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final boolean mo171991a() {
                    /*
                        r1 = this;
                        boolean r0 = super.mo171991a()
                        if (r0 == 0) goto L_0x0012
                        java.util.List<java.lang.Double> r0 = r1.f340150d
                        if (r0 == 0) goto L_0x0012
                        int r0 = r0.size()
                        if (r0 <= 0) goto L_0x0012
                        r0 = 1
                        return r0
                    L_0x0012:
                        r0 = 0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113691eh.C113692a.C113693a.C113694a.mo171991a():boolean");
                }
            }

            /* renamed from: com.tencent.mapsdk.internal.eh$a$a$b */
            public static class C113695b extends JsonComposer {
                @Json(name = "standard")

                /* renamed from: a */
                public C113697b f340152a;

                /* renamed from: com.tencent.mapsdk.internal.eh$a$a$b$a */
                public static final class C113696a extends C113667ef.C113676c.C113680c {
                    @Json(name = "radius")

                    /* renamed from: a */
                    public int f340153a;
                    @Json(name = "gradient")

                    /* renamed from: b */
                    public C113667ef.C113676c.C113682e f340154b;
                    @Json(name = "animation")

                    /* renamed from: c */
                    public C113667ef.C113676c.C113681d f340155c;

                    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
                        r0 = r0.f340127b;
                     */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    private boolean m156695a() {
                        /*
                            r8 = this;
                            int r0 = r8.f340153a
                            r1 = 0
                            if (r0 <= 0) goto L_0x0035
                            com.tencent.mapsdk.internal.ef$c$e r0 = r8.f340154b
                            if (r0 == 0) goto L_0x0035
                            java.util.List<java.lang.Double> r2 = r0.f340126a
                            r3 = 1
                            if (r2 == 0) goto L_0x0020
                            int r2 = r2.size()
                            if (r2 <= 0) goto L_0x0020
                            java.util.List<java.lang.Integer> r0 = r0.f340127b
                            if (r0 == 0) goto L_0x0020
                            int r0 = r0.size()
                            if (r0 <= 0) goto L_0x0020
                            r0 = 1
                            goto L_0x0021
                        L_0x0020:
                            r0 = 0
                        L_0x0021:
                            if (r0 == 0) goto L_0x0035
                            com.tencent.mapsdk.internal.ef$c$d r0 = r8.f340155c
                            if (r0 == 0) goto L_0x0035
                            double r4 = r0.f340125c
                            r6 = 0
                            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                            if (r0 < 0) goto L_0x0031
                            r0 = 1
                            goto L_0x0032
                        L_0x0031:
                            r0 = 0
                        L_0x0032:
                            if (r0 == 0) goto L_0x0035
                            return r3
                        L_0x0035:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113691eh.C113692a.C113693a.C113695b.C113696a.m156695a():boolean");
                    }
                }

                /* renamed from: com.tencent.mapsdk.internal.eh$a$a$b$b */
                public static class C113697b extends JsonComposer {
                    @Json(name = "defaultStyle")

                    /* renamed from: a */
                    public C113696a f340156a;

                    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
                        r2 = r2.f340127b;
                     */
                    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[RETURN] */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    private boolean m156696a() {
                        /*
                            r8 = this;
                            com.tencent.mapsdk.internal.eh$a$a$b$a r0 = r8.f340156a
                            r1 = 0
                            if (r0 == 0) goto L_0x003e
                            int r2 = r0.f340153a
                            r3 = 1
                            if (r2 <= 0) goto L_0x003a
                            com.tencent.mapsdk.internal.ef$c$e r2 = r0.f340154b
                            if (r2 == 0) goto L_0x003a
                            java.util.List<java.lang.Double> r4 = r2.f340126a
                            if (r4 == 0) goto L_0x0024
                            int r4 = r4.size()
                            if (r4 <= 0) goto L_0x0024
                            java.util.List<java.lang.Integer> r2 = r2.f340127b
                            if (r2 == 0) goto L_0x0024
                            int r2 = r2.size()
                            if (r2 <= 0) goto L_0x0024
                            r2 = 1
                            goto L_0x0025
                        L_0x0024:
                            r2 = 0
                        L_0x0025:
                            if (r2 == 0) goto L_0x003a
                            com.tencent.mapsdk.internal.ef$c$d r0 = r0.f340155c
                            if (r0 == 0) goto L_0x003a
                            double r4 = r0.f340125c
                            r6 = 0
                            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                            if (r0 < 0) goto L_0x0035
                            r0 = 1
                            goto L_0x0036
                        L_0x0035:
                            r0 = 0
                        L_0x0036:
                            if (r0 == 0) goto L_0x003a
                            r0 = 1
                            goto L_0x003b
                        L_0x003a:
                            r0 = 0
                        L_0x003b:
                            if (r0 == 0) goto L_0x003e
                            return r3
                        L_0x003e:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113691eh.C113692a.C113693a.C113695b.C113697b.m156696a():boolean");
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
                    r3 = r3.f340127b;
                 */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x0041  */
                /* JADX WARNING: Removed duplicated region for block: B:32:0x0046 A[RETURN] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private boolean m156694a() {
                    /*
                        r7 = this;
                        com.tencent.mapsdk.internal.eh$a$a$b$b r0 = r7.f340152a
                        r1 = 0
                        if (r0 == 0) goto L_0x0047
                        com.tencent.mapsdk.internal.eh$a$a$b$a r0 = r0.f340156a
                        r2 = 1
                        if (r0 == 0) goto L_0x0043
                        int r3 = r0.f340153a
                        if (r3 <= 0) goto L_0x003e
                        com.tencent.mapsdk.internal.ef$c$e r3 = r0.f340154b
                        if (r3 == 0) goto L_0x003e
                        java.util.List<java.lang.Double> r4 = r3.f340126a
                        if (r4 == 0) goto L_0x0028
                        int r4 = r4.size()
                        if (r4 <= 0) goto L_0x0028
                        java.util.List<java.lang.Integer> r3 = r3.f340127b
                        if (r3 == 0) goto L_0x0028
                        int r3 = r3.size()
                        if (r3 <= 0) goto L_0x0028
                        r3 = 1
                        goto L_0x0029
                    L_0x0028:
                        r3 = 0
                    L_0x0029:
                        if (r3 == 0) goto L_0x003e
                        com.tencent.mapsdk.internal.ef$c$d r0 = r0.f340155c
                        if (r0 == 0) goto L_0x003e
                        double r3 = r0.f340125c
                        r5 = 0
                        int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                        if (r0 < 0) goto L_0x0039
                        r0 = 1
                        goto L_0x003a
                    L_0x0039:
                        r0 = 0
                    L_0x003a:
                        if (r0 == 0) goto L_0x003e
                        r0 = 1
                        goto L_0x003f
                    L_0x003e:
                        r0 = 0
                    L_0x003f:
                        if (r0 == 0) goto L_0x0043
                        r0 = 1
                        goto L_0x0044
                    L_0x0043:
                        r0 = 0
                    L_0x0044:
                        if (r0 == 0) goto L_0x0047
                        return r2
                    L_0x0047:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113691eh.C113692a.C113693a.C113695b.m156694a():boolean");
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
                r3 = r3.f340127b;
             */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x004b  */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x0050  */
            /* JADX WARNING: Removed duplicated region for block: B:43:0x005f A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0060 A[RETURN] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean mo171990a() {
                /*
                    r7 = this;
                    boolean r0 = super.mo171990a()
                    r1 = 0
                    if (r0 == 0) goto L_0x0060
                    com.tencent.mapsdk.internal.eh$a$a$b r0 = r7.f340145a
                    if (r0 == 0) goto L_0x0060
                    com.tencent.mapsdk.internal.eh$a$a$b$b r0 = r0.f340152a
                    r2 = 1
                    if (r0 == 0) goto L_0x0052
                    com.tencent.mapsdk.internal.eh$a$a$b$a r0 = r0.f340156a
                    if (r0 == 0) goto L_0x004d
                    int r3 = r0.f340153a
                    if (r3 <= 0) goto L_0x0048
                    com.tencent.mapsdk.internal.ef$c$e r3 = r0.f340154b
                    if (r3 == 0) goto L_0x0048
                    java.util.List<java.lang.Double> r4 = r3.f340126a
                    if (r4 == 0) goto L_0x0032
                    int r4 = r4.size()
                    if (r4 <= 0) goto L_0x0032
                    java.util.List<java.lang.Integer> r3 = r3.f340127b
                    if (r3 == 0) goto L_0x0032
                    int r3 = r3.size()
                    if (r3 <= 0) goto L_0x0032
                    r3 = 1
                    goto L_0x0033
                L_0x0032:
                    r3 = 0
                L_0x0033:
                    if (r3 == 0) goto L_0x0048
                    com.tencent.mapsdk.internal.ef$c$d r0 = r0.f340155c
                    if (r0 == 0) goto L_0x0048
                    double r3 = r0.f340125c
                    r5 = 0
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 < 0) goto L_0x0043
                    r0 = 1
                    goto L_0x0044
                L_0x0043:
                    r0 = 0
                L_0x0044:
                    if (r0 == 0) goto L_0x0048
                    r0 = 1
                    goto L_0x0049
                L_0x0048:
                    r0 = 0
                L_0x0049:
                    if (r0 == 0) goto L_0x004d
                    r0 = 1
                    goto L_0x004e
                L_0x004d:
                    r0 = 0
                L_0x004e:
                    if (r0 == 0) goto L_0x0052
                    r0 = 1
                    goto L_0x0053
                L_0x0052:
                    r0 = 0
                L_0x0053:
                    if (r0 == 0) goto L_0x0060
                    com.tencent.mapsdk.internal.eh$a$a$a r0 = r7.f340146b
                    if (r0 == 0) goto L_0x0060
                    boolean r0 = r0.mo171991a()
                    if (r0 == 0) goto L_0x0060
                    return r2
                L_0x0060:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113691eh.C113692a.C113693a.mo171990a():boolean");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r0 = r2.f340144a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo171989a() {
            /*
                r2 = this;
                boolean r0 = super.mo171989a()
                if (r0 == 0) goto L_0x001c
                com.tencent.mapsdk.internal.dz r0 = com.tencent.mapsdk.internal.C113646dz.Gradient
                java.lang.String r1 = r2.f340094b
                boolean r0 = r0.mo171982a((java.lang.String) r1)
                if (r0 == 0) goto L_0x001c
                com.tencent.mapsdk.internal.eh$a$a r0 = r2.f340144a
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.mo171990a()
                if (r0 == 0) goto L_0x001c
                r0 = 1
                return r0
            L_0x001c:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113691eh.C113692a.mo171989a():boolean");
        }
    }

    /* renamed from: a */
    public final int mo171986a() {
        if (mo171988c()) {
            return this.f340143a.f340095c.f340096a;
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo171987b() {
        if (mo171988c()) {
            return this.f340143a.f340144a.f340114c;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f340143a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo171988c() {
        /*
            r1 = this;
            boolean r0 = super.mo171988c()
            if (r0 == 0) goto L_0x0012
            com.tencent.mapsdk.internal.eh$a r0 = r1.f340143a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo171989a()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113691eh.mo171988c():boolean");
    }
}
