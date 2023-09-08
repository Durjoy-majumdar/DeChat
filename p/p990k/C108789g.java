package p990k;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p849e3.C107168a0;
import p849e3.C107173b0;
import p849e3.C107175c0;

/* renamed from: k.g */
public class C108789g {

    /* renamed from: a */
    public final ArrayList<C107168a0> f325770a = new ArrayList<>();

    /* renamed from: b */
    public long f325771b = -1;

    /* renamed from: c */
    public Interpolator f325772c;

    /* renamed from: d */
    public C107173b0 f325773d;

    /* renamed from: e */
    public boolean f325774e;

    /* renamed from: f */
    public final C107175c0 f325775f = new C108790a();

    /* renamed from: k.g$a */
    public class C108790a extends C107175c0 {

        /* renamed from: a */
        public boolean f325776a = false;

        /* renamed from: b */
        public int f325777b = 0;

        public C108790a() {
        }

        /* renamed from: a */
        public void mo143420a(View view) {
            int i = this.f325777b + 1;
            this.f325777b = i;
            if (i == C108789g.this.f325770a.size()) {
                C107173b0 b0Var = C108789g.this.f325773d;
                if (b0Var != null) {
                    b0Var.mo143420a((View) null);
                }
                this.f325777b = 0;
                this.f325776a = false;
                C108789g.this.f325774e = false;
            }
        }

        /* renamed from: b */
        public void mo143457b(View view) {
            if (!this.f325776a) {
                this.f325776a = true;
                C107173b0 b0Var = C108789g.this.f325773d;
                if (b0Var != null) {
                    b0Var.mo143457b((View) null);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo159837a() {
        if (this.f325774e) {
            Iterator<C107168a0> it = this.f325770a.iterator();
            while (it.hasNext()) {
                it.next().mo157606b();
            }
            this.f325774e = false;
        }
    }

    /* renamed from: b */
    public C108789g mo159838b(C107168a0 a0Var) {
        if (!this.f325774e) {
            this.f325770a.add(a0Var);
        }
        return this;
    }

    /* renamed from: c */
    public C108789g mo159839c(C107168a0 a0Var, C107168a0 a0Var2) {
        this.f325770a.add(a0Var);
        View view = a0Var.f320755a.get();
        long duration = view != null ? view.animate().getDuration() : 0;
        View view2 = a0Var2.f320755a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        this.f325770a.add(a0Var2);
        return this;
    }

    /* renamed from: d */
    public void mo159840d() {
        View view;
        if (!this.f325774e) {
            Iterator<C107168a0> it = this.f325770a.iterator();
            while (it.hasNext()) {
                C107168a0 next = it.next();
                long j = this.f325771b;
                if (j >= 0) {
                    next.mo157607c(j);
                }
                Interpolator interpolator = this.f325772c;
                if (!(interpolator == null || (view = next.f320755a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f325773d != null) {
                    next.mo157608d(this.f325775f);
                }
                next.mo157610f();
            }
            this.f325774e = true;
        }
    }
}
