package p004b0;

import gy3.C87412m;
import java.util.List;
import java.util.Map;
import p631o1.C109899z;
import p631o1.C61911a;
import p759y.C112218f0;

/* renamed from: b0.a0 */
public final class C103929a0 implements C54390x, C109899z {

    /* renamed from: a */
    public final C103963o0 f307308a;

    /* renamed from: b */
    public final int f307309b;

    /* renamed from: c */
    public final boolean f307310c;

    /* renamed from: d */
    public final float f307311d;

    /* renamed from: e */
    public final List<C54380k> f307312e;

    /* renamed from: f */
    public final int f307313f;

    /* renamed from: g */
    public final int f307314g;

    /* renamed from: h */
    public final int f307315h;

    /* renamed from: i */
    public final /* synthetic */ C109899z f307316i;

    public C103929a0(C103963o0 o0Var, int i, boolean z, float f, C109899z zVar, List<? extends C54380k> list, int i2, int i3, int i4, boolean z2, C112218f0 f0Var, int i5) {
        C87412m.m108594g(zVar, "measureResult");
        C87412m.m108594g(list, "visibleItemsInfo");
        C87412m.m108594g(f0Var, "orientation");
        this.f307308a = o0Var;
        this.f307309b = i;
        this.f307310c = z;
        this.f307311d = f;
        this.f307312e = list;
        this.f307313f = i2;
        this.f307314g = i3;
        this.f307315h = i4;
        this.f307316i = zVar;
    }

    /* renamed from: a */
    public int mo55832a() {
        return this.f307313f;
    }

    /* renamed from: b */
    public void mo145549b() {
        this.f307316i.mo145549b();
    }

    /* renamed from: c */
    public int mo55833c() {
        return this.f307314g;
    }

    /* renamed from: d */
    public Map<C61911a, Integer> mo145550d() {
        return this.f307316i.mo145550d();
    }

    /* renamed from: e */
    public int mo55834e() {
        return this.f307315h;
    }

    /* renamed from: f */
    public List<C54380k> mo55835f() {
        return this.f307312e;
    }

    public int getHeight() {
        return this.f307316i.getHeight();
    }

    public int getWidth() {
        return this.f307316i.getWidth();
    }
}
