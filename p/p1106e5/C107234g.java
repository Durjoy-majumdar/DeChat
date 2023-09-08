package p1106e5;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p1042u.C111056e;
import p1042u.C111060j;
import p1132m5.C109530u;
import p864t5.C110908h;

/* renamed from: e5.g */
public final class C107234g implements C107230c {

    /* renamed from: e */
    public static final Handler f320852e = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final C109530u f320853a;

    /* renamed from: b */
    public final C107228a f320854b;

    /* renamed from: c */
    public final C111060j<g$$b> f320855c = new C111060j<>();

    /* renamed from: d */
    public int f320856d;

    public C107234g(C109530u uVar, C107228a aVar, C110908h hVar) {
        C87412m.m108594g(uVar, "weakMemoryCache");
        C87412m.m108594g(aVar, "bitmapPool");
        this.f320853a = uVar;
        this.f320854b = aVar;
    }

    /* renamed from: a */
    public synchronized void mo157701a(Bitmap bitmap, boolean z) {
        C87412m.m108594g(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        if (!z) {
            g$$b e = mo157708e(identityHashCode, bitmap);
            if (e == null) {
                e = new g$$b(new WeakReference(bitmap), 0, false);
                this.f320855c.mo162807g(identityHashCode, e);
            }
            e.f320861c = false;
        } else if (mo157708e(identityHashCode, bitmap) == null) {
            this.f320855c.mo162807g(identityHashCode, new g$$b(new WeakReference(bitmap), 0, true));
        }
        mo157707d();
    }

    /* renamed from: b */
    public synchronized boolean mo157702b(Bitmap bitmap) {
        Object[] objArr;
        Object obj;
        C87412m.m108594g(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        g$$b e = mo157708e(identityHashCode, bitmap);
        boolean z = false;
        if (e == null) {
            return false;
        }
        e.f320860b--;
        if (e.f320860b <= 0 && e.f320861c) {
            z = true;
        }
        if (z) {
            C111060j<g$$b> jVar = this.f320855c;
            int a = C111056e.m151429a(jVar.f332586e, jVar.f332588g, identityHashCode);
            if (a >= 0 && (objArr = jVar.f332587f)[a] != (obj = C111060j.f332584h)) {
                objArr[a] = obj;
                jVar.f332585d = true;
            }
            this.f320853a.mo160737d(bitmap);
            f320852e.post(new g$$a(this, bitmap));
        }
        mo157707d();
        return z;
    }

    /* renamed from: c */
    public synchronized void mo157703c(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        g$$b e = mo157708e(identityHashCode, bitmap);
        if (e == null) {
            e = new g$$b(new WeakReference(bitmap), 0, false);
            this.f320855c.mo162807g(identityHashCode, e);
        }
        e.f320860b++;
        mo157707d();
    }

    /* renamed from: d */
    public final void mo157707d() {
        int i = this.f320856d;
        this.f320856d = i + 1;
        if (i >= 50) {
            ArrayList arrayList = new ArrayList();
            int h = this.f320855c.mo162808h();
            int i2 = 0;
            if (h > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    if (this.f320855c.mo162809j(i3).f320859a.get() == null) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                    if (i4 >= h) {
                        break;
                    }
                    i3 = i4;
                }
            }
            C111060j<g$$b> jVar = this.f320855c;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i5 = i2 + 1;
                    int intValue = ((Number) arrayList.get(i2)).intValue();
                    Object[] objArr = jVar.f332587f;
                    Object obj = objArr[intValue];
                    Object obj2 = C111060j.f332584h;
                    if (obj != obj2) {
                        objArr[intValue] = obj2;
                        jVar.f332585d = true;
                    }
                    if (i5 <= size) {
                        i2 = i5;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final g$$b mo157708e(int i, Bitmap bitmap) {
        g$$b e = this.f320855c.mo162805e(i, null);
        if (e == null) {
            return null;
        }
        if (e.f320859a.get() == bitmap) {
            return e;
        }
        return null;
    }
}
