package mv1;

import java.util.List;

/* renamed from: mv1.a */
public class C100004a {

    /* renamed from: a */
    public int f292996a;

    /* renamed from: b */
    public int f292997b;

    /* renamed from: c */
    public C100004a f292998c;

    /* renamed from: d */
    public List<C100004a> f292999d;

    /* renamed from: e */
    public boolean f293000e;

    public C100004a(int i, int i2, C100004a aVar) {
        this.f292996a = i;
        this.f292997b = i2;
        this.f292998c = aVar;
    }

    public String toString() {
        C100004a aVar = this.f292998c;
        if (aVar == null) {
            return String.format("[%d,%d]", new Object[]{Integer.valueOf(this.f292996a), Integer.valueOf(this.f292997b)});
        }
        return String.format("%s [%d,%d]", new Object[]{aVar, Integer.valueOf(this.f292996a), Integer.valueOf(this.f292997b)});
    }
}
