package p339fh;

import java.util.ArrayList;
import p335eh.C107275e;

/* renamed from: fh.i */
public class C116868i {

    /* renamed from: c */
    public static C116868i f350290c;

    /* renamed from: a */
    public ArrayList<C107275e> f350291a = new ArrayList<>();

    /* renamed from: b */
    public Object f350292b = new Object();

    /* renamed from: a */
    public static C116868i m164843a() {
        if (f350290c == null) {
            synchronized (C116868i.class) {
                if (f350290c == null) {
                    f350290c = new C116868i();
                }
            }
        }
        return f350290c;
    }

    /* renamed from: b */
    public C107275e mo180852b() {
        synchronized (this.f350292b) {
            if (this.f350291a.size() <= 0) {
                return new C107275e();
            }
            ArrayList<C107275e> arrayList = this.f350291a;
            C107275e remove = arrayList.remove(arrayList.size() - 1);
            return remove;
        }
    }
}
