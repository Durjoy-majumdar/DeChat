package f62;

import android.util.SparseArray;
import nr3.C35015b;
import p261wl.C38166b;
import pe3.C47465a;

/* renamed from: f62.k1 */
public class C75701k1 {

    /* renamed from: a */
    public static final SparseArray<k1$$c> f222303a = new SparseArray<>();

    /* renamed from: b */
    public static C35015b<C75699i1> f222304b;

    /* renamed from: a */
    public static <T extends C47465a> void m90961a(int i, C75697g1<T> g1Var) {
        k1$$c k1__c;
        SparseArray<k1$$c> sparseArray = f222303a;
        synchronized (sparseArray) {
            k1__c = sparseArray.get(i);
            if (k1__c == null) {
                k1__c = new k1$$c();
                sparseArray.put(i, k1__c);
            }
        }
        k1__c.add(g1Var);
    }

    /* renamed from: b */
    public static <T extends C47465a> void m90962b(int i, T t) {
        k1$$c k1__c;
        SparseArray<k1$$c> sparseArray = f222303a;
        synchronized (sparseArray) {
            k1__c = sparseArray.get(i);
        }
        if (k1__c != null) {
            k1__c.mo71277y1(t);
        }
        C38166b.m41756c(C75693d1.class, Integer.valueOf(i), new k1$$b(t));
    }
}
