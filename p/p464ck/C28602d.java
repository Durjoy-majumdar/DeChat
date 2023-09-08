package p464ck;

import android.util.SparseArray;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import p464ck.C54869f;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: ck.d */
public final class C28602d {

    /* renamed from: a */
    public static final C28602d f78490a = new C28602d();

    /* renamed from: b */
    public static final C13601g f78491b = C36568h.m40986b(C13602i.SYNCHRONIZED, C28603a.f78492d);

    /* renamed from: ck.d$a */
    public static final class C28603a extends C87413o implements C32224a<SparseArray<ArrayList<C54869f.C54870a>>> {

        /* renamed from: d */
        public static final C28603a f78492d = new C28603a();

        public C28603a() {
            super(0);
        }

        public Object invoke() {
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(0, new ArrayList());
            return sparseArray;
        }
    }

    /* renamed from: a */
    public final SparseArray<ArrayList<C54869f.C54870a>> mo56079a() {
        return (SparseArray) f78491b.getValue();
    }
}
