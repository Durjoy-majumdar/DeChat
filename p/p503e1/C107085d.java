package p503e1;

import android.graphics.PathMeasure;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import p1166z0.C112539e;
import p436a1.C103240i;
import p436a1.C103243k;
import p436a1.C103244k0;
import p436a1.C103245l;
import p436a1.C103248m0;
import p436a1.C103257q;
import p436a1.C103274x;
import p436a1.C27726j0;
import p835c1.C104231f;
import p835c1.C104233g;
import p835c1.C104237k;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import sx3.C64186f0;

/* renamed from: e1.d */
public final class C107085d extends C107087g {

    /* renamed from: b */
    public C103257q f320573b;

    /* renamed from: c */
    public float f320574c = 1.0f;

    /* renamed from: d */
    public List<? extends C31381e> f320575d;

    /* renamed from: e */
    public float f320576e;

    /* renamed from: f */
    public float f320577f;

    /* renamed from: g */
    public C103257q f320578g;

    /* renamed from: h */
    public int f320579h;

    /* renamed from: i */
    public int f320580i;

    /* renamed from: j */
    public float f320581j;

    /* renamed from: k */
    public float f320582k;

    /* renamed from: l */
    public float f320583l;

    /* renamed from: m */
    public float f320584m;

    /* renamed from: n */
    public boolean f320585n;

    /* renamed from: o */
    public boolean f320586o;

    /* renamed from: p */
    public boolean f320587p;

    /* renamed from: q */
    public C104237k f320588q;

    /* renamed from: r */
    public final C27726j0 f320589r;

    /* renamed from: s */
    public final C27726j0 f320590s;

    /* renamed from: t */
    public final C13601g f320591t;

    /* renamed from: u */
    public final C31401f f320592u;

    /* renamed from: e1.d$a */
    public static final class C107086a extends C87413o implements C32224a<C103248m0> {

        /* renamed from: d */
        public static final C107086a f320593d = new C107086a();

        public C107086a() {
            super(0);
        }

        public Object invoke() {
            return new C103243k(new PathMeasure());
        }
    }

    public C107085d() {
        int i = C107125m.f320673a;
        this.f320575d = C64186f0.f181907d;
        this.f320576e = 1.0f;
        this.f320579h = 0;
        this.f320580i = 0;
        this.f320581j = 4.0f;
        this.f320583l = 1.0f;
        this.f320585n = true;
        this.f320586o = true;
        this.f320587p = true;
        this.f320589r = C103245l.m136700a();
        this.f320590s = C103245l.m136700a();
        this.f320591t = C36568h.m40986b(C13602i.NONE, C107086a.f320593d);
        this.f320592u = new C31401f();
    }

    /* renamed from: a */
    public void mo157535a(C104231f fVar) {
        C87412m.m108594g(fVar, "<this>");
        if (this.f320585n) {
            ((ArrayList) this.f320592u.f84037a).clear();
            ((C103240i) this.f320589r).reset();
            C31401f fVar2 = this.f320592u;
            List<? extends C31381e> list = this.f320575d;
            fVar2.getClass();
            C87412m.m108594g(list, "nodes");
            ((ArrayList) fVar2.f84037a).addAll(list);
            fVar2.mo58149c(this.f320589r);
            mo157545e();
        } else if (this.f320587p) {
            mo157545e();
        }
        this.f320585n = false;
        this.f320587p = false;
        C103257q qVar = this.f320573b;
        if (qVar != null) {
            C104231f.C104232a.m139085d(fVar, this.f320590s, qVar, this.f320574c, (C104233g) null, (C103274x) null, 0, 56, (Object) null);
        }
        C103257q qVar2 = this.f320578g;
        if (qVar2 != null) {
            C104237k kVar = this.f320588q;
            if (this.f320586o || kVar == null) {
                kVar = new C104237k(this.f320577f, this.f320581j, this.f320579h, this.f320580i, (C103244k0) null, 16, (C8480h) null);
                this.f320588q = kVar;
                this.f320586o = false;
            }
            C104237k kVar2 = kVar;
            C104231f.C104232a.m139085d(fVar, this.f320590s, qVar2, this.f320576e, kVar2, (C103274x) null, 0, 48, (Object) null);
        }
    }

    /* renamed from: e */
    public final void mo157545e() {
        ((C103240i) this.f320590s).reset();
        if (this.f320582k == 0.0f) {
            if (this.f320583l == 1.0f) {
                ((C103240i) this.f320590s).mo143014n(this.f320589r, C112539e.f336955b);
                return;
            }
        }
        ((C103248m0) this.f320591t.getValue()).mo143016b(this.f320589r, false);
        float length = ((C103248m0) this.f320591t.getValue()).getLength();
        float f = this.f320582k;
        float f2 = this.f320584m;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.f320583l + f2) % 1.0f) * length;
        if (f3 > f4) {
            ((C103248m0) this.f320591t.getValue()).mo143015a(f3, length, this.f320590s, true);
            ((C103248m0) this.f320591t.getValue()).mo143015a(0.0f, f4, this.f320590s, true);
            return;
        }
        ((C103248m0) this.f320591t.getValue()).mo143015a(f3, f4, this.f320590s, true);
    }

    public String toString() {
        return this.f320589r.toString();
    }
}
