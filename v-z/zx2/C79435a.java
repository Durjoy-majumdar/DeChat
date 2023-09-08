package zx2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: zx2.a */
public class C79435a implements C79436b {

    /* renamed from: a */
    public List<Double> f232965a = new ArrayList(100);

    /* renamed from: b */
    public double f232966b = 0.0d;

    /* renamed from: c */
    public double f232967c = Double.MAX_VALUE;

    /* renamed from: d */
    public double f232968d = Double.MIN_VALUE;

    /* renamed from: a */
    public void mo109413a() {
        double d = C79437c.INSTANCE.f232974g;
        if (d > 60.0d) {
            d = 60.0d;
        }
        if (d < 0.0d) {
            d = 0.0d;
        }
        ((ArrayList) this.f232965a).add(Double.valueOf(d));
    }

    /* renamed from: b */
    public void mo109414b() {
        List<Double> list = this.f232965a;
        if (list != null && ((ArrayList) list).size() <= 10000 && ((ArrayList) this.f232965a).size() != 0) {
            double d = 0.0d;
            Iterator it = ((ArrayList) this.f232965a).iterator();
            while (it.hasNext()) {
                double doubleValue = ((Double) it.next()).doubleValue();
                d += doubleValue;
                this.f232967c = Math.min(this.f232967c, doubleValue);
                this.f232968d = Math.max(this.f232968d, doubleValue);
            }
            this.f232966b = d / ((double) ((ArrayList) this.f232965a).size());
        }
    }
}
