package com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher;

import gy3.C87412m;
import p301cd.C92416i;

/* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c */
public final class C17652c implements C92416i {

    /* renamed from: a */
    public final float f48026a;

    /* renamed from: b */
    public final C17653a f48027b;

    /* renamed from: c */
    public final C17654b f48028c;

    /* renamed from: d */
    public final int f48029d;

    /* renamed from: e */
    public final C17655c f48030e;

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$a */
    public static final class C17653a {

        /* renamed from: a */
        public final int f48031a;

        /* renamed from: b */
        public final int f48032b;

        /* renamed from: c */
        public final int f48033c;

        public C17653a(int i, int i2, int i3) {
            this.f48031a = i;
            this.f48032b = i2;
            this.f48033c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17653a)) {
                return false;
            }
            C17653a aVar = (C17653a) obj;
            return this.f48031a == aVar.f48031a && this.f48032b == aVar.f48032b && this.f48033c == aVar.f48033c;
        }

        public int hashCode() {
            return (((this.f48031a * 31) + this.f48032b) * 31) + this.f48033c;
        }

        public String toString() {
            return "Color(colorR=" + this.f48031a + ", colorG=" + this.f48032b + ", colorB=" + this.f48033c + ')';
        }
    }

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$b */
    public enum C17654b {
        ;
        

        /* renamed from: d */
        public final int f48035d;

        /* access modifiers changed from: public */
        C17654b(int i) {
            this.f48035d = i;
        }
    }

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$c */
    public enum C17655c {
        STANDARD(0);
        

        /* renamed from: d */
        public final int f48038d;

        /* access modifiers changed from: public */
        C17655c(int i) {
            this.f48038d = i;
        }
    }

    public C17652c(float f, C17653a aVar, C17654b bVar, int i, C17655c cVar) {
        C87412m.m108594g(aVar, "color");
        C87412m.m108594g(bVar, "type");
        C87412m.m108594g(cVar, "mouthShape");
        this.f48026a = f;
        this.f48027b = aVar;
        this.f48028c = bVar;
        this.f48029d = i;
        this.f48030e = cVar;
    }

    /* renamed from: a */
    public String mo21064a() {
        return "LipStickInfoV2()";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17652c)) {
            return false;
        }
        C17652c cVar = (C17652c) obj;
        return C87412m.m108589b(Float.valueOf(this.f48026a), Float.valueOf(cVar.f48026a)) && C87412m.m108589b(this.f48027b, cVar.f48027b) && this.f48028c == cVar.f48028c && this.f48029d == cVar.f48029d && this.f48030e == cVar.f48030e;
    }

    public int hashCode() {
        return (((((((Float.floatToIntBits(this.f48026a) * 31) + this.f48027b.hashCode()) * 31) + this.f48028c.hashCode()) * 31) + this.f48029d) * 31) + this.f48030e.hashCode();
    }

    public String toString() {
        return "LipStickInfoV2(alpha=" + this.f48026a + ", color=" + this.f48027b + ", type=" + this.f48028c + ", faceModel=" + this.f48029d + ", mouthShape=" + this.f48030e + ')';
    }
}
