package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.g0 */
public class C16653g0 {

    /* renamed from: a */
    public final C16655b f44959a;

    /* renamed from: b */
    public C16654a f44960b = new C16654a();

    /* renamed from: androidx.recyclerview.widget.g0$a */
    public static class C16654a {

        /* renamed from: a */
        public int f44961a = 0;

        /* renamed from: b */
        public int f44962b;

        /* renamed from: c */
        public int f44963c;

        /* renamed from: d */
        public int f44964d;

        /* renamed from: e */
        public int f44965e;

        /* renamed from: a */
        public boolean mo17511a() {
            int i = this.f44961a;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.f44964d;
                int i4 = this.f44962b;
                if ((((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) << 0) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.f44964d;
                int i6 = this.f44963c;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.f44965e;
                int i8 = this.f44962b;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.f44965e;
                int i15 = this.f44963c;
                if (i9 > i15) {
                    i2 = 1;
                } else if (i9 != i15) {
                    i2 = 4;
                }
                if ((i & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g0$b */
    public interface C16655b {
        /* renamed from: a */
        int mo17274a();

        /* renamed from: b */
        int mo17275b(View view);

        /* renamed from: c */
        int mo17276c();

        /* renamed from: d */
        int mo17277d(View view);

        View getChildAt(int i);
    }

    public C16653g0(C16655b bVar) {
        this.f44959a = bVar;
    }

    /* renamed from: a */
    public View mo17509a(int i, int i2, int i3, int i4) {
        int c = this.f44959a.mo17276c();
        int a = this.f44959a.mo17274a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = this.f44959a.getChildAt(i);
            int b = this.f44959a.mo17275b(childAt);
            int d = this.f44959a.mo17277d(childAt);
            C16654a aVar = this.f44960b;
            aVar.f44962b = c;
            aVar.f44963c = a;
            aVar.f44964d = b;
            aVar.f44965e = d;
            if (i3 != 0) {
                aVar.f44961a = i3 | 0;
                if (aVar.mo17511a()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                C16654a aVar2 = this.f44960b;
                aVar2.f44961a = i4 | 0;
                if (aVar2.mo17511a()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: b */
    public boolean mo17510b(View view, int i) {
        C16654a aVar = this.f44960b;
        int c = this.f44959a.mo17276c();
        int a = this.f44959a.mo17274a();
        int b = this.f44959a.mo17275b(view);
        int d = this.f44959a.mo17277d(view);
        aVar.f44962b = c;
        aVar.f44963c = a;
        aVar.f44964d = b;
        aVar.f44965e = d;
        if (i == 0) {
            return false;
        }
        C16654a aVar2 = this.f44960b;
        aVar2.f44961a = 0 | i;
        return aVar2.mo17511a();
    }
}
