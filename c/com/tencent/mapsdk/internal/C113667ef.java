package com.tencent.mapsdk.internal;

import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.map.tools.json.annotation.JsonType;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngDeserializer;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngListDeserializer;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ef */
public abstract class C113667ef extends JsonComposer {
    @Json(name = "info")

    /* renamed from: b */
    public C113675b f340093b;

    /* renamed from: com.tencent.mapsdk.internal.ef$a */
    public static class C113668a extends JsonComposer {
        @Json(name = "layerType")

        /* renamed from: b */
        public String f340094b;
        @Json(name = "data")

        /* renamed from: c */
        public C113669a f340095c;

        /* renamed from: com.tencent.mapsdk.internal.ef$a$a */
        public static class C113669a extends JsonComposer {
            @Json(name = "version")

            /* renamed from: a */
            public int f340096a;
            @Json(name = "default")

            /* renamed from: b */
            public List<C113670a> f340097b;

            @JsonType(deserializer = C113664ec.class)
            /* renamed from: com.tencent.mapsdk.internal.ef$a$a$a */
            public static abstract class C113670a extends JsonComposer {
                @Json(name = "type")

                /* renamed from: a */
                public String f340098a;

                /* renamed from: b */
                public String f340099b;
            }

            /* renamed from: com.tencent.mapsdk.internal.ef$a$a$b */
            public static class C113671b extends C113670a {
                @Json(deserializer = LatLngListDeserializer.class, name = "coordinates")

                /* renamed from: c */
                public List<LatLng> f340100c;
                @Json(name = "weight")

                /* renamed from: d */
                public int f340101d;
            }

            /* renamed from: com.tencent.mapsdk.internal.ef$a$a$c */
            public static class C113672c extends C113670a {
                @Json(name = "url")

                /* renamed from: c */
                public String f340102c;
                @Json(name = "astcUrl")

                /* renamed from: d */
                public String f340103d;
                @Json(name = "ktx2Url")

                /* renamed from: e */
                public String f340104e;
                @Json(name = "format")

                /* renamed from: f */
                public String f340105f;
                @Json(name = "name")

                /* renamed from: g */
                public String f340106g;
                @Json(name = "targetName")

                /* renamed from: h */
                public String f340107h;
                @Json(name = "id")

                /* renamed from: i */
                public String f340108i;
            }

            /* renamed from: com.tencent.mapsdk.internal.ef$a$a$d */
            public static class C113673d extends C113670a {
                @Json(deserializer = LatLngDeserializer.class, name = "coordinates")

                /* renamed from: c */
                public LatLng f340109c;
                @Json(name = "weight")

                /* renamed from: d */
                public int f340110d;
            }

            /* renamed from: com.tencent.mapsdk.internal.ef$a$a$e */
            public static class C113674e extends C113670a {
                @Json(deserializer = C113698ei.class, name = "coordinates")

                /* renamed from: c */
                public List<WeightedLatLng> f340111c;
            }

            /* renamed from: a */
            private boolean m156677a() {
                List<C113670a> list = this.f340097b;
                return list != null && list.size() > 0;
            }
        }

        /* renamed from: a */
        public boolean mo171989a() {
            C113669a aVar = this.f340095c;
            if (aVar != null) {
                List<C113669a.C113670a> list = aVar.f340097b;
                if (list != null && list.size() > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ef$b */
    public static class C113675b extends JsonComposer {
        @Json(name = "error")

        /* renamed from: a */
        public int f340112a;
        @Json(name = "msg")

        /* renamed from: b */
        public String f340113b;
    }

    /* renamed from: com.tencent.mapsdk.internal.ef$c */
    public static abstract class C113676c extends JsonComposer {
        @Json(name = "version")

        /* renamed from: c */
        public int f340114c;
        @Json(name = "mapping")

        /* renamed from: d */
        public C113678b f340115d;

        /* renamed from: com.tencent.mapsdk.internal.ef$c$a */
        public static abstract class C113677a extends JsonComposer {
            @Json(name = "displayLevel")

            /* renamed from: f */
            public int f340116f;
            @Json(name = "zIndex")

            /* renamed from: g */
            public int f340117g;
            @Json(name = "hidden")

            /* renamed from: h */
            public boolean f340118h;
            @Json(name = "opacity")

            /* renamed from: i */
            public double f340119i;
            @Json(name = "maxZoom")

            /* renamed from: j */
            public int f340120j;
            @Json(name = "minZoom")

            /* renamed from: k */
            public int f340121k;
            @Json(name = "themeName")

            /* renamed from: l */
            public String f340122l;

            /* renamed from: a */
            public boolean mo171991a() {
                return true;
            }
        }

        /* renamed from: com.tencent.mapsdk.internal.ef$c$b */
        public static class C113678b extends JsonComposer {
            @Json(name = "rule")

            /* renamed from: a */
            public C113679a f340123a;

            /* renamed from: com.tencent.mapsdk.internal.ef$c$b$a */
            public static class C113679a extends JsonComposer {
                @Json(name = "default")

                /* renamed from: a */
                public String f340124a;
            }
        }

        /* renamed from: com.tencent.mapsdk.internal.ef$c$c */
        public static abstract class C113680c extends JsonComposer {
        }

        /* renamed from: com.tencent.mapsdk.internal.ef$c$d */
        public static class C113681d extends JsonComposer {
            @Json(name = "duration")

            /* renamed from: c */
            public double f340125c;

            /* renamed from: a */
            private boolean m156680a() {
                return this.f340125c >= 0.0d;
            }
        }

        /* renamed from: com.tencent.mapsdk.internal.ef$c$e */
        public static class C113682e extends JsonComposer {
            @Json(name = "points")

            /* renamed from: a */
            public List<Double> f340126a;
            @Json(name = "colors")

            /* renamed from: b */
            public List<Integer> f340127b;

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
                r0 = r1.f340127b;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private boolean m156681a() {
                /*
                    r1 = this;
                    java.util.List<java.lang.Double> r0 = r1.f340126a
                    if (r0 == 0) goto L_0x0016
                    int r0 = r0.size()
                    if (r0 <= 0) goto L_0x0016
                    java.util.List<java.lang.Integer> r0 = r1.f340127b
                    if (r0 == 0) goto L_0x0016
                    int r0 = r0.size()
                    if (r0 <= 0) goto L_0x0016
                    r0 = 1
                    return r0
                L_0x0016:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113667ef.C113676c.C113682e.m156681a():boolean");
            }
        }

        /* renamed from: com.tencent.mapsdk.internal.ef$c$f */
        public static class C113683f extends JsonComposer {
            @Json(name = "type")

            /* renamed from: a */
            public int f340128a;

            /* renamed from: a */
            private static boolean m156682a() {
                return true;
            }
        }

        /* renamed from: a */
        public boolean mo171990a() {
            return true;
        }
    }

    /* renamed from: a */
    public abstract int mo171986a();

    /* renamed from: b */
    public abstract int mo171987b();

    /* renamed from: c */
    public boolean mo171988c() {
        C113675b bVar = this.f340093b;
        return bVar != null && bVar.f340112a == 0;
    }
}
