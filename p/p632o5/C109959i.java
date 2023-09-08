package p632o5;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import gy3.C87412m;
import p972h5.C108136b;

/* renamed from: o5.i */
public abstract class C109959i {

    /* renamed from: o5.i$a */
    public static final class C109960a {

        /* renamed from: a */
        public final MemoryCache$Key f329054a;

        /* renamed from: b */
        public final boolean f329055b;

        /* renamed from: c */
        public final C108136b f329056c;

        /* renamed from: d */
        public final boolean f329057d;

        public C109960a(MemoryCache$Key memoryCache$Key, boolean z, C108136b bVar, boolean z2) {
            C87412m.m108594g(bVar, "dataSource");
            this.f329054a = memoryCache$Key;
            this.f329055b = z;
            this.f329056c = bVar;
            this.f329057d = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C109960a)) {
                return false;
            }
            C109960a aVar = (C109960a) obj;
            return C87412m.m108589b(this.f329054a, aVar.f329054a) && this.f329055b == aVar.f329055b && this.f329056c == aVar.f329056c && this.f329057d == aVar.f329057d;
        }

        public int hashCode() {
            MemoryCache$Key memoryCache$Key = this.f329054a;
            int hashCode = (memoryCache$Key == null ? 0 : memoryCache$Key.hashCode()) * 31;
            boolean z = this.f329055b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f329056c.hashCode()) * 31;
            boolean z3 = this.f329057d;
            if (!z3) {
                z2 = z3;
            }
            return hashCode2 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "Metadata(memoryCacheKey=" + this.f329054a + ", isSampled=" + this.f329055b + ", dataSource=" + this.f329056c + ", isPlaceholderMemoryCacheKeyPresent=" + this.f329057d + ')';
        }
    }

    /* renamed from: a */
    public abstract Drawable mo161275a();

    /* renamed from: b */
    public abstract C109956h mo161276b();
}
