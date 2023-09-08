package g73;

import java.lang.reflect.Array;

/* renamed from: g73.h */
public class C75893h {

    /* renamed from: c */
    public static C75893h[][] f222568c = ((C75893h[][]) Array.newInstance(C75893h.class, new int[]{3, 3}));

    /* renamed from: a */
    public int f222569a;

    /* renamed from: b */
    public int f222570b;

    static {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                f222568c[i][i2] = new C75893h(i, i2);
            }
        }
    }

    public C75893h(int i, int i2) {
        this.f222569a = i;
        this.f222570b = i2;
    }

    /* renamed from: a */
    public static synchronized C75893h m91153a(int i, int i2) {
        C75893h hVar;
        synchronized (C75893h.class) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("row id should be in range [0..2]");
            } else if (i2 < 0 || i2 > 2) {
                throw new IllegalArgumentException("col id should be in range [0..2]");
            } else {
                hVar = f222568c[i][i2];
            }
        }
        return hVar;
    }

    public String toString() {
        return String.format("{row: %d, col: %d}", new Object[]{Integer.valueOf(this.f222569a), Integer.valueOf(this.f222570b)});
    }
}
