package sm2;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: sm2.e */
public class C101655e<K, V> {

    /* renamed from: a */
    public final LinkedHashMap<K, V> f297566a;

    /* renamed from: b */
    public int f297567b;

    /* renamed from: c */
    public int f297568c;

    /* renamed from: d */
    public int f297569d;

    /* renamed from: e */
    public int f297570e;

    public C101655e(int i) {
        if (i > 0) {
            this.f297568c = i;
            this.f297566a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f297569d;
        i2 = this.f297570e + i;
        return String.format(Locale.getDefault(), "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f297568c), Integer.valueOf(this.f297569d), Integer.valueOf(this.f297570e), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }
}
