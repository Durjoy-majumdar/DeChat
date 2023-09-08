package l90;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: l90.b */
public interface C109292b {

    /* renamed from: v0 */
    public static final /* synthetic */ int f327190v0 = 0;

    /* renamed from: l90.b$a */
    public static final class C61240a {

        /* renamed from: a */
        public HashMap<Integer, C61241a> f174308a;

        /* renamed from: b */
        public HashSet<String> f174309b;

        /* renamed from: l90.b$a$a */
        public static final class C61241a {

            /* renamed from: a */
            public Integer f174310a;

            /* renamed from: b */
            public Integer f174311b;

            /* renamed from: c */
            public Integer f174312c;

            /* renamed from: d */
            public Boolean f174313d;

            public C61241a() {
                this((Integer) null, (Integer) null, (Integer) null, (Boolean) null, 15, (C8480h) null);
            }

            public C61241a(Integer num, Integer num2, Integer num3, Boolean bool, int i, C8480h hVar) {
                num = (i & 1) != 0 ? 0 : num;
                num2 = (i & 2) != 0 ? 0 : num2;
                num3 = (i & 4) != 0 ? 0 : num3;
                bool = (i & 8) != 0 ? null : bool;
                this.f174310a = num;
                this.f174311b = num2;
                this.f174312c = num3;
                this.f174313d = bool;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C61241a)) {
                    return false;
                }
                C61241a aVar = (C61241a) obj;
                return C87412m.m108589b(this.f174310a, aVar.f174310a) && C87412m.m108589b(this.f174311b, aVar.f174311b) && C87412m.m108589b(this.f174312c, aVar.f174312c) && C87412m.m108589b(this.f174313d, aVar.f174313d);
            }

            public int hashCode() {
                Integer num = this.f174310a;
                int i = 0;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f174311b;
                int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f174312c;
                int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Boolean bool = this.f174313d;
                if (bool != null) {
                    i = bool.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                return "FpsConfigItem(lowerFps=" + this.f174310a + ", upperFps=" + this.f174311b + ", curFps=" + this.f174312c + ", useFixMode=" + this.f174313d + ')';
            }
        }

        public C61240a(HashMap<Integer, Object> hashMap, HashMap<Integer, Object> hashMap2, HashMap<Integer, C61241a> hashMap3, HashMap<Integer, Object> hashMap4, HashSet<String> hashSet, int i) {
            C87412m.m108594g(hashMap, "sizeConfigStrategy");
            C87412m.m108594g(hashMap2, "focusModeStrategy");
            C87412m.m108594g(hashMap3, "fpsConfigStrategy");
            C87412m.m108594g(hashMap4, "formatConfigStrategy");
            C87412m.m108594g(hashSet, "previewConfigStrategy");
            this.f174308a = hashMap3;
            this.f174309b = hashSet;
        }
    }

    int getRecordScene();

    int getResolutionLimit();
}
