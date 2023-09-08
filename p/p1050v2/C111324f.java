package p1050v2;

import java.util.List;

/* renamed from: v2.f */
public final class C111324f {

    /* renamed from: a */
    public final int[] f333299a;

    /* renamed from: b */
    public final float[] f333300b;

    public C111324f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f333299a = new int[size];
        this.f333300b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f333299a[i] = list.get(i).intValue();
            this.f333300b[i] = list2.get(i).floatValue();
        }
    }

    public C111324f(int i, int i2) {
        this.f333299a = new int[]{i, i2};
        this.f333300b = new float[]{0.0f, 1.0f};
    }

    public C111324f(int i, int i2, int i3) {
        this.f333299a = new int[]{i, i2, i3};
        this.f333300b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
