package p14;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import l14.C24950a;
import n14.C25217e;
import o14.C25346c;
import o14.C25349e;
import q14.C25541i;
import q14.C25542j;
import q14.C25543k;
import q14.C25544m;
import r14.C26095a;
import r14.C26103j;
import r14.C89864m;
import sx3.C110818d0;
import sx3.C64197v;
import z04.C91602g0;

/* renamed from: p14.l0 */
public abstract class C25445l0<Tag> implements C25349e, C25346c {

    /* renamed from: a */
    public final ArrayList<Tag> f72048a = new ArrayList<>();

    /* renamed from: b */
    public boolean f72049b;

    /* renamed from: p14.l0$a */
    public static final class C25446a extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public final /* synthetic */ C25445l0 f72050d;

        /* renamed from: e */
        public final /* synthetic */ C24950a f72051e;

        /* renamed from: f */
        public final /* synthetic */ Object f72052f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25446a(C25445l0 l0Var, C24950a aVar, Object obj) {
            super(0);
            this.f72050d = l0Var;
            this.f72051e = aVar;
            this.f72052f = obj;
        }

        public final T invoke() {
            if (this.f72050d.mo52499w()) {
                C25445l0 l0Var = this.f72050d;
                C24950a aVar = this.f72051e;
                l0Var.getClass();
                C87412m.m108594g(aVar, "deserializer");
                return C26103j.m33474a((C26095a) l0Var, aVar);
            }
            this.f72050d.getClass();
            return null;
        }
    }

    /* renamed from: p14.l0$b */
    public static final class C25447b extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public final /* synthetic */ C25445l0 f72053d;

        /* renamed from: e */
        public final /* synthetic */ C24950a f72054e;

        /* renamed from: f */
        public final /* synthetic */ Object f72055f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25447b(C25445l0 l0Var, C24950a aVar, Object obj) {
            super(0);
            this.f72053d = l0Var;
            this.f72054e = aVar;
            this.f72055f = obj;
        }

        public final T invoke() {
            C25445l0 l0Var = this.f72053d;
            C24950a aVar = this.f72054e;
            l0Var.getClass();
            C87412m.m108594g(aVar, "deserializer");
            return C26103j.m33474a((C26095a) l0Var, aVar);
        }
    }

    /* renamed from: A */
    public final Tag mo52674A() {
        ArrayList<Tag> arrayList = this.f72048a;
        Tag remove = arrayList.remove(C64197v.m75536e(arrayList));
        this.f72049b = true;
        return remove;
    }

    /* renamed from: d */
    public final Void mo52491d() {
        return null;
    }

    /* renamed from: f */
    public final double mo52516f() {
        C26095a aVar = (C26095a) this;
        String str = (String) mo52674A();
        C87412m.m108594g(str, "tag");
        try {
            return Double.parseDouble(aVar.mo52951G(str).mo52780f());
        } catch (Throwable unused) {
            throw C25541i.m33035c(-1, "Failed to parse 'double'", aVar.mo52949E().toString());
        }
    }

    /* renamed from: g */
    public final <T> T mo52492g(C25217e eVar, int i, C24950a<T> aVar, T t) {
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(aVar, "deserializer");
        String C = ((C25420a0) this).mo52658C(eVar, i);
        C25446a aVar2 = new C25446a(this, aVar, t);
        this.f72048a.add(C);
        T invoke = aVar2.invoke();
        if (!this.f72049b) {
            mo52674A();
        }
        this.f72049b = false;
        return invoke;
    }

    /* renamed from: i */
    public final int mo52493i(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "descriptor");
        return mo52675y(((C25420a0) this).mo52658C(eVar, i));
    }

    /* renamed from: j */
    public final byte mo52517j() {
        C26095a aVar = (C26095a) this;
        String str = (String) mo52674A();
        C87412m.m108594g(str, "tag");
        try {
            return (byte) Integer.parseInt(aVar.mo52951G(str).mo52780f());
        } catch (Throwable unused) {
            throw C25541i.m33035c(-1, "Failed to parse 'byte'", aVar.mo52949E().toString());
        }
    }

    /* renamed from: k */
    public final long mo52518k() {
        C26095a aVar = (C26095a) this;
        String str = (String) mo52674A();
        C87412m.m108594g(str, "tag");
        try {
            return Long.parseLong(aVar.mo52951G(str).mo52780f());
        } catch (Throwable unused) {
            throw C25541i.m33035c(-1, "Failed to parse 'long'", aVar.mo52949E().toString());
        }
    }

    /* renamed from: l */
    public int mo52511l(C25217e eVar) {
        C87412m.m108594g(eVar, "descriptor");
        return -1;
    }

    /* renamed from: m */
    public boolean mo52512m() {
        return false;
    }

    /* renamed from: n */
    public final short mo52519n() {
        C26095a aVar = (C26095a) this;
        String str = (String) mo52674A();
        C87412m.m108594g(str, "tag");
        try {
            return (short) Integer.parseInt(aVar.mo52951G(str).mo52780f());
        } catch (Throwable unused) {
            throw C25541i.m33035c(-1, "Failed to parse 'short'", aVar.mo52949E().toString());
        }
    }

    /* renamed from: o */
    public final char mo52520o() {
        C26095a aVar = (C26095a) this;
        String str = (String) mo52674A();
        C87412m.m108594g(str, "tag");
        try {
            return C91602g0.m114946n0(aVar.mo52951G(str).mo52780f());
        } catch (Throwable unused) {
            throw C25541i.m33035c(-1, "Failed to parse 'char'", aVar.mo52949E().toString());
        }
    }

    /* renamed from: p */
    public final String mo52494p() {
        return mo52676z(mo52674A());
    }

    /* renamed from: q */
    public final <T> T mo52495q(C25217e eVar, int i, C24950a<T> aVar, T t) {
        C87412m.m108594g(eVar, "descriptor");
        C87412m.m108594g(aVar, "deserializer");
        String C = ((C25420a0) this).mo52658C(eVar, i);
        C25447b bVar = new C25447b(this, aVar, t);
        this.f72048a.add(C);
        T invoke = bVar.invoke();
        if (!this.f72049b) {
            mo52674A();
        }
        this.f72049b = false;
        return invoke;
    }

    /* renamed from: r */
    public final String mo52496r(C25217e eVar, int i) {
        C87412m.m108594g(eVar, "descriptor");
        return mo52676z(((C25420a0) this).mo52658C(eVar, i));
    }

    /* renamed from: s */
    public final int mo52497s() {
        return mo52675y(mo52674A());
    }

    /* renamed from: t */
    public final float mo52521t() {
        C26095a aVar = (C26095a) this;
        String str = (String) mo52674A();
        C87412m.m108594g(str, "tag");
        try {
            return Float.parseFloat(aVar.mo52951G(str).mo52780f());
        } catch (Throwable unused) {
            throw C25541i.m33035c(-1, "Failed to parse 'float'", aVar.mo52949E().toString());
        }
    }

    /* renamed from: u */
    public final boolean mo52522u() {
        C26095a aVar = (C26095a) this;
        String str = (String) mo52674A();
        C87412m.m108594g(str, "tag");
        C25544m G = aVar.mo52951G(str);
        if (aVar.f72936e.f72231a.f72939c || !((C25542j) G).f72233e) {
            return C89864m.m112380b(G.mo52780f());
        }
        throw C25541i.m33035c(-1, "Boolean literal for key '" + str + "' should be unquoted. Use 'JsonBuilder.isLenient = true' to accept non-compliant JSON", aVar.mo52949E().toString());
    }

    /* renamed from: w */
    public final boolean mo52499w() {
        String str = (String) C110818d0.m150923U(this.f72048a);
        C87412m.m108594g(str, "tag");
        return ((C26095a) this).mo52948D(str) != C25543k.f72235e;
    }

    /* renamed from: y */
    public abstract int mo52675y(Tag tag);

    /* renamed from: z */
    public abstract String mo52676z(Tag tag);
}
