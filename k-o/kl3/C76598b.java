package kl3;

import android.animation.Animator;
import android.util.SparseArray;

/* renamed from: kl3.b */
public class C76598b {

    /* renamed from: a */
    public final SparseArray<Animator> f224197a = new SparseArray<>();

    /* renamed from: b */
    public int f224198b = 250;

    /* renamed from: c */
    public long f224199c = -1;

    /* renamed from: d */
    public int f224200d = -1;

    /* renamed from: e */
    public int f224201e = -1;

    /* renamed from: f */
    public boolean f224202f = true;

    public C76598b(C76599c cVar) {
    }

    /* renamed from: a */
    public void mo106817a() {
        for (int i = 0; i < this.f224197a.size(); i++) {
            SparseArray<Animator> sparseArray = this.f224197a;
            sparseArray.get(sparseArray.keyAt(i)).cancel();
        }
        this.f224197a.clear();
        this.f224200d = -1;
        this.f224201e = -1;
        this.f224199c = -1;
        this.f224202f = true;
    }
}
