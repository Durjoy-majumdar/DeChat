package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import p224ra.C12964b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.p4 */
public interface C84574p4 extends C12964b {

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.p4$a */
    public static final class C84575a {

        /* renamed from: a */
        public final int f246777a;

        /* renamed from: b */
        public final int f246778b;

        /* renamed from: c */
        public final int f246779c;

        /* renamed from: d */
        public final int f246780d;

        public C84575a(int i, int i2, int i3, int i4) {
            this.f246777a = i;
            this.f246778b = i2;
            this.f246779c = i3;
            this.f246780d = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C84575a)) {
                return false;
            }
            C84575a aVar = (C84575a) obj;
            return this.f246777a == aVar.f246777a && this.f246778b == aVar.f246778b && this.f246779c == aVar.f246779c && this.f246780d == aVar.f246780d;
        }

        public int hashCode() {
            return (((((this.f246777a * 31) + this.f246778b) * 31) + this.f246779c) * 31) + this.f246780d;
        }

        public String toString() {
            return "Padding(left=" + this.f246777a + ", top=" + this.f246778b + ", right=" + this.f246779c + ", bottom=" + this.f246780d + ')';
        }
    }

    /* renamed from: ha */
    int mo117256ha(C81925i2 i2Var);

    C84575a q80();
}
