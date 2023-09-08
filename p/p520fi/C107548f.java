package p520fi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C36907w;
import z10.C112558a;
import z20.C112575d;

/* renamed from: fi.f */
public final class C107548f implements C107549g<C112575d> {

    /* renamed from: d */
    public int f321776d;

    /* renamed from: e */
    public float f321777e;

    /* renamed from: f */
    public final List<C112575d> f321778f;

    /* renamed from: g */
    public Bitmap f321779g;

    public C107548f() {
        C112558a aVar = C112558a.f336997a;
        List<C112558a.C112559a> list = C112558a.f336998b;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C112558a.C112559a aVar2 : list) {
            arrayList.add(new C112575d(aVar2.f337001a));
        }
        this.f321778f = arrayList;
    }

    /* renamed from: D1 */
    public int mo157975D1(boolean z) {
        return 0;
    }

    /* renamed from: F1 */
    public void mo157976F1(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        Bitmap bitmap = this.f321779g;
        if (bitmap != null) {
            ((C112575d) ((ArrayList) this.f321778f).get(this.f321776d)).mo164320a(canvas, bitmap, this.f321777e);
        }
    }

    /* renamed from: Z */
    public void mo157977Z(boolean z) {
        this.f321776d = 0;
        this.f321777e = 0.0f;
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        C112575d dVar = (C112575d) obj;
    }

    public void clear() {
    }

    public Object clone() {
        return new Object();
    }

    /* renamed from: i */
    public void mo157980i(Canvas canvas, boolean z) {
        C87412m.m108594g(canvas, "canvas");
        Bitmap bitmap = this.f321779g;
        if (bitmap != null) {
            ((C112575d) ((ArrayList) this.f321778f).get(this.f321776d)).mo164320a(canvas, bitmap, this.f321777e);
        }
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public Object pop() {
        return new C112575d(1);
    }

    /* renamed from: z0 */
    public void mo157984z0() {
    }

    /* renamed from: z1 */
    public void mo157985z1(boolean z) {
    }
}
