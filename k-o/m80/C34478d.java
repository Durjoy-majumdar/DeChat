package m80;

import java.util.List;

/* renamed from: m80.d */
public final class C34478d {

    /* renamed from: a */
    public static final C34478d f92802a = new C34478d();

    /* renamed from: a */
    public final double mo59604a(int i, int i2, List<Long> list) {
        return (double) (((long) 2) * (list.get(i).longValue() - list.get(i2).longValue()));
    }

    /* renamed from: b */
    public final double mo59605b(int i, int i2, List<Long> list, List<Long> list2) {
        return (double) ((list.get(i).longValue() + (list2.get(i).longValue() * list2.get(i).longValue())) - (list.get(i2).longValue() + (list2.get(i2).longValue() * list2.get(i2).longValue())));
    }
}
