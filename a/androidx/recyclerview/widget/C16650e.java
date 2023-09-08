package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.recyclerview.widget.e */
public class C16650e {

    /* renamed from: a */
    public final C16652b f44954a;

    /* renamed from: b */
    public final C16651a f44955b = new C16651a();

    /* renamed from: c */
    public final List<View> f44956c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    public static class C16651a {

        /* renamed from: a */
        public long f44957a = 0;

        /* renamed from: b */
        public C16651a f44958b;

        /* renamed from: a */
        public void mo17500a(int i) {
            if (i >= 64) {
                C16651a aVar = this.f44958b;
                if (aVar != null) {
                    aVar.mo17500a(i - 64);
                    return;
                }
                return;
            }
            this.f44957a &= ~(1 << i);
        }

        /* renamed from: b */
        public int mo17501b(int i) {
            C16651a aVar = this.f44958b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f44957a) : Long.bitCount(this.f44957a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f44957a & ((1 << i) - 1)) : aVar.mo17501b(i - 64) + Long.bitCount(this.f44957a);
        }

        /* renamed from: c */
        public final void mo17502c() {
            if (this.f44958b == null) {
                this.f44958b = new C16651a();
            }
        }

        /* renamed from: d */
        public boolean mo17503d(int i) {
            if (i < 64) {
                return (this.f44957a & (1 << i)) != 0;
            }
            mo17502c();
            return this.f44958b.mo17503d(i - 64);
        }

        /* renamed from: e */
        public void mo17504e(int i, boolean z) {
            if (i >= 64) {
                mo17502c();
                this.f44958b.mo17504e(i - 64, z);
                return;
            }
            long j = this.f44957a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f44957a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo17507h(i);
            } else {
                mo17500a(i);
            }
            if (z2 || this.f44958b != null) {
                mo17502c();
                this.f44958b.mo17504e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean mo17505f(int i) {
            if (i >= 64) {
                mo17502c();
                return this.f44958b.mo17505f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f44957a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f44957a = j3;
            long j4 = j - 1;
            this.f44957a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C16651a aVar = this.f44958b;
            if (aVar != null) {
                if (aVar.mo17503d(0)) {
                    mo17507h(63);
                }
                this.f44958b.mo17505f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void mo17506g() {
            this.f44957a = 0;
            C16651a aVar = this.f44958b;
            if (aVar != null) {
                aVar.mo17506g();
            }
        }

        /* renamed from: h */
        public void mo17507h(int i) {
            if (i >= 64) {
                mo17502c();
                this.f44958b.mo17507h(i - 64);
                return;
            }
            this.f44957a |= 1 << i;
        }

        public String toString() {
            if (this.f44958b == null) {
                return Long.toBinaryString(this.f44957a);
            }
            return this.f44958b.toString() + "xx" + Long.toBinaryString(this.f44957a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    public interface C16652b {
    }

    public C16650e(C16652b bVar) {
        this.f44954a = bVar;
    }

    /* renamed from: a */
    public void mo17486a(View view, int i, boolean z) {
        int a = i < 0 ? ((C16647a0) this.f44954a).mo17480a() : mo17491f(i);
        this.f44955b.mo17504e(a, z);
        if (z) {
            mo17494i(view);
        }
        C16647a0 a0Var = (C16647a0) this.f44954a;
        a0Var.f44952a.addView(view, a);
        RecyclerView recyclerView = a0Var.f44952a;
        recyclerView.getClass();
        RecyclerView.C16631z Q0 = RecyclerView.m15803Q0(view);
        RecyclerView.C16613e eVar = recyclerView.f44781r;
        if (!(eVar == null || Q0 == null)) {
            eVar.onViewAttachedToWindow(Q0);
        }
        List<RecyclerView.C16621m> list = recyclerView.f44727H;
        if (list != null) {
            int size = ((ArrayList) list).size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.C16621m) ((ArrayList) recyclerView.f44727H).get(size)).mo17333z2(view);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo17487b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? ((C16647a0) this.f44954a).mo17480a() : mo17491f(i);
        this.f44955b.mo17504e(a, z);
        if (z) {
            mo17494i(view);
        }
        C16647a0 a0Var = (C16647a0) this.f44954a;
        a0Var.getClass();
        RecyclerView.C16631z Q0 = RecyclerView.m15803Q0(view);
        if (Q0 != null) {
            if (Q0.mo17372s() || Q0.mo17377w()) {
                Q0.f44863p &= -257;
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + Q0 + a0Var.f44952a.mo17017B0());
            }
        }
        a0Var.f44952a.attachViewToParent(view, a, layoutParams);
    }

    /* renamed from: c */
    public void mo17488c(int i) {
        RecyclerView.C16631z Q0;
        int f = mo17491f(i);
        this.f44955b.mo17505f(f);
        C16647a0 a0Var = (C16647a0) this.f44954a;
        View childAt = a0Var.f44952a.getChildAt(f);
        if (!(childAt == null || (Q0 = RecyclerView.m15803Q0(childAt)) == null)) {
            if (!Q0.mo17372s() || Q0.mo17377w()) {
                Q0.mo17362i(256);
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + Q0 + a0Var.f44952a.mo17017B0());
            }
        }
        a0Var.f44952a.detachViewFromParent(f);
    }

    /* renamed from: d */
    public View mo17489d(int i) {
        return ((C16647a0) this.f44954a).f44952a.getChildAt(mo17491f(i));
    }

    /* renamed from: e */
    public int mo17490e() {
        return ((C16647a0) this.f44954a).mo17480a() - ((ArrayList) this.f44956c).size();
    }

    /* renamed from: f */
    public final int mo17491f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = ((C16647a0) this.f44954a).mo17480a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f44955b.mo17501b(i2));
            if (b == 0) {
                while (this.f44955b.mo17503d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: g */
    public View mo17492g(int i) {
        return ((C16647a0) this.f44954a).f44952a.getChildAt(i);
    }

    /* renamed from: h */
    public int mo17493h() {
        return ((C16647a0) this.f44954a).mo17480a();
    }

    /* renamed from: i */
    public final void mo17494i(View view) {
        ((ArrayList) this.f44956c).add(view);
        C16647a0 a0Var = (C16647a0) this.f44954a;
        a0Var.getClass();
        RecyclerView.C16631z Q0 = RecyclerView.m15803Q0(view);
        if (Q0 != null) {
            RecyclerView recyclerView = a0Var.f44952a;
            int i = Q0.f44870w;
            if (i != -1) {
                Q0.f44869v = i;
            } else {
                View view2 = Q0.f44854d;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                Q0.f44869v = C107207u.C107208b.m145175c(view2);
            }
            if (recyclerView.mo17036W0()) {
                Q0.f44870w = 4;
                ((ArrayList) recyclerView.f44775o1).add(Q0);
                return;
            }
            View view3 = Q0.f44854d;
            WeakHashMap<View, C107168a0> weakHashMap2 = C107207u.f320808a;
            C107207u.C107208b.m145191s(view3, 4);
        }
    }

    /* renamed from: j */
    public int mo17495j(View view) {
        int indexOfChild = ((C16647a0) this.f44954a).f44952a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f44955b.mo17503d(indexOfChild)) {
            return indexOfChild - this.f44955b.mo17501b(indexOfChild);
        }
        return -1;
    }

    /* renamed from: k */
    public boolean mo17496k(View view) {
        return ((ArrayList) this.f44956c).contains(view);
    }

    /* renamed from: l */
    public void mo17497l(int i) {
        int f = mo17491f(i);
        View childAt = ((C16647a0) this.f44954a).f44952a.getChildAt(f);
        if (childAt != null) {
            if (this.f44955b.mo17505f(f)) {
                mo17498m(childAt);
            }
            ((C16647a0) this.f44954a).mo17481b(f);
        }
    }

    /* renamed from: m */
    public final boolean mo17498m(View view) {
        if (!((ArrayList) this.f44956c).remove(view)) {
            return false;
        }
        C16647a0 a0Var = (C16647a0) this.f44954a;
        a0Var.getClass();
        RecyclerView.C16631z Q0 = RecyclerView.m15803Q0(view);
        if (Q0 == null) {
            return true;
        }
        RecyclerView recyclerView = a0Var.f44952a;
        int i = Q0.f44869v;
        if (recyclerView.mo17036W0()) {
            Q0.f44870w = i;
            ((ArrayList) recyclerView.f44775o1).add(Q0);
        } else {
            View view2 = Q0.f44854d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145191s(view2, i);
        }
        Q0.f44869v = 0;
        return true;
    }

    public String toString() {
        return this.f44955b.toString() + ", hidden list:" + ((ArrayList) this.f44956c).size();
    }
}
