package mn0;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: mn0.c */
public final class C21519c {

    /* renamed from: a */
    public final int f60931a;

    /* renamed from: b */
    public final ArrayList<C21521b> f60932b = new ArrayList<>();

    /* renamed from: c */
    public final C21521b[] f60933c = new C21521b[5];

    /* renamed from: d */
    public int f60934d = -1;

    /* renamed from: e */
    public int f60935e;

    /* renamed from: f */
    public int f60936f;

    /* renamed from: g */
    public int f60937g;

    /* renamed from: mn0.c$a */
    public static final class C21520a<T> implements Comparator {

        /* renamed from: d */
        public static final C21520a<T> f60938d = new C21520a<>();

        public int compare(Object obj, Object obj2) {
            return ((C21521b) obj).f60939a - ((C21521b) obj2).f60939a;
        }
    }

    /* renamed from: mn0.c$b */
    public static final class C21521b {

        /* renamed from: a */
        public int f60939a;

        /* renamed from: b */
        public int f60940b;

        /* renamed from: c */
        public float f60941c;
    }

    public C21519c(int i) {
        this.f60931a = i;
    }

    /* renamed from: a */
    public final void mo33731a(int i, float f) {
        C21521b bVar;
        if (this.f60934d != 1) {
            Collections.sort(this.f60932b, C21520a.f60938d);
            this.f60934d = 1;
        }
        int i2 = this.f60937g;
        if (i2 > 0) {
            C21521b[] bVarArr = this.f60933c;
            int i3 = i2 - 1;
            this.f60937g = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new C21521b();
        }
        C87412m.m108591d(bVar);
        int i4 = this.f60935e;
        this.f60935e = i4 + 1;
        bVar.f60939a = i4;
        bVar.f60940b = i;
        bVar.f60941c = f;
        this.f60932b.add(bVar);
        this.f60936f += i;
        while (true) {
            int i5 = this.f60936f;
            int i6 = this.f60931a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C21521b bVar2 = this.f60932b.get(0);
                C87412m.m108593f(bVar2, "this.samples[0]");
                C21521b bVar3 = bVar2;
                int i8 = bVar3.f60940b;
                if (i8 <= i7) {
                    this.f60936f -= i8;
                    this.f60932b.remove(0);
                    int i9 = this.f60937g;
                    if (i9 < 5) {
                        C21521b[] bVarArr2 = this.f60933c;
                        this.f60937g = i9 + 1;
                        bVarArr2[i9] = bVar3;
                    }
                } else {
                    bVar3.f60940b = i8 - i7;
                    this.f60936f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final float mo33732b() {
        int size = this.f60932b.size();
        boolean z = false;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f += (((float) this.f60932b.get(i).f60940b) / ((float) this.f60936f)) * this.f60932b.get(i).f60941c;
        }
        if (f == 0.0f) {
            z = true;
        }
        if (!z) {
            return f;
        }
        if (this.f60932b.isEmpty()) {
            return -1.0f;
        }
        ArrayList<C21521b> arrayList = this.f60932b;
        return arrayList.get(arrayList.size() - 1).f60941c;
    }
}
