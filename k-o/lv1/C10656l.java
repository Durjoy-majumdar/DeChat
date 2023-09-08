package lv1;

import java.util.ArrayList;
import java.util.List;

/* renamed from: lv1.l */
public class C10656l {

    /* renamed from: a */
    public C76728k f32072a;

    /* renamed from: b */
    public C99664b f32073b;

    /* renamed from: c */
    public int f32074c;

    /* renamed from: d */
    public C99672i f32075d;

    /* renamed from: e */
    public List<C99681n> f32076e = new ArrayList();

    public C10656l(C76728k kVar) {
        this.f32072a = kVar;
    }

    public String toString() {
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = Integer.valueOf(this.f32074c);
        List<C99681n> list = this.f32076e;
        if (list != null) {
            i = list.size();
        }
        objArr[1] = Integer.valueOf(i);
        return String.format("{resultCode: %d, resultSize: %d}", objArr);
    }
}
