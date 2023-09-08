package ut3;

import android.content.SharedPreferences;
import android.util.SparseArray;

/* renamed from: ut3.b */
public class C22662b {

    /* renamed from: e */
    public static volatile C22662b f65187e;

    /* renamed from: a */
    public boolean f65188a = false;

    /* renamed from: b */
    public boolean f65189b = false;

    /* renamed from: c */
    public SparseArray<String> f65190c = new SparseArray<>(10);

    /* renamed from: d */
    public SharedPreferences f65191d = null;

    /* renamed from: b */
    public static C22662b m26538b() {
        C22662b bVar;
        if (f65187e != null) {
            return f65187e;
        }
        synchronized (C22662b.class) {
            if (f65187e == null) {
                f65187e = new C22662b();
            }
            bVar = f65187e;
        }
        return bVar;
    }

    /* renamed from: a */
    public SparseArray<String> mo35774a() {
        SparseArray<String> sparseArray;
        synchronized (C22662b.class) {
            sparseArray = this.f65190c;
        }
        return sparseArray;
    }

    /* renamed from: c */
    public SharedPreferences mo35775c() {
        SharedPreferences sharedPreferences;
        synchronized (C22662b.class) {
            sharedPreferences = this.f65191d;
        }
        return sharedPreferences;
    }

    /* renamed from: d */
    public boolean mo35776d() {
        boolean z;
        synchronized (C22662b.class) {
            z = this.f65188a;
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo35777e() {
        boolean z;
        synchronized (C22662b.class) {
            z = this.f65189b;
        }
        return z;
    }

    /* renamed from: f */
    public void mo35778f(boolean z) {
        synchronized (C22662b.class) {
            this.f65189b = z;
        }
    }
}
