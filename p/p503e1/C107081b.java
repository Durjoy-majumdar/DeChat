package p503e1;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p436a1.C103235g0;
import p436a1.C103240i;
import p436a1.C103245l;
import p436a1.C27726j0;
import p835c1.C104230e;
import p835c1.C104231f;
import p835c1.C104234h;
import rx3.C13598b0;
import sx3.C64186f0;

/* renamed from: e1.b */
public final class C107081b extends C107087g {

    /* renamed from: b */
    public float[] f320527b;

    /* renamed from: c */
    public final List<C107087g> f320528c = new ArrayList();

    /* renamed from: d */
    public List<? extends C31381e> f320529d;

    /* renamed from: e */
    public boolean f320530e;

    /* renamed from: f */
    public C27726j0 f320531f;

    /* renamed from: g */
    public C31401f f320532g;

    /* renamed from: h */
    public C32224a<C13598b0> f320533h;

    /* renamed from: i */
    public String f320534i;

    /* renamed from: j */
    public float f320535j;

    /* renamed from: k */
    public float f320536k;

    /* renamed from: l */
    public float f320537l;

    /* renamed from: m */
    public float f320538m;

    /* renamed from: n */
    public float f320539n;

    /* renamed from: o */
    public float f320540o;

    /* renamed from: p */
    public float f320541p;

    /* renamed from: q */
    public boolean f320542q;

    public C107081b() {
        int i = C107125m.f320673a;
        this.f320529d = C64186f0.f181907d;
        this.f320530e = true;
        this.f320534i = "";
        this.f320538m = 1.0f;
        this.f320539n = 1.0f;
        this.f320542q = true;
    }

    /* renamed from: a */
    public void mo157535a(C104231f fVar) {
        C104231f fVar2 = fVar;
        C87412m.m108594g(fVar2, "<this>");
        if (this.f320542q) {
            float[] fArr = this.f320527b;
            if (fArr == null) {
                fArr = C103235g0.m136668a((float[]) null, 1, (C8480h) null);
                this.f320527b = fArr;
            } else {
                C103235g0.m136671d(fArr);
            }
            C103235g0.m136672e(fArr, this.f320536k + this.f320540o, this.f320537l + this.f320541p, 0.0f, 4, (Object) null);
            double d = (((double) this.f320535j) * 3.141592653589793d) / 180.0d;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f = fArr[0];
            float f2 = fArr[4];
            float f3 = (cos * f) + (sin * f2);
            float f4 = -sin;
            float f5 = (f * f4) + (f2 * cos);
            float f6 = fArr[1];
            float f7 = fArr[5];
            float f8 = (cos * f6) + (sin * f7);
            float f9 = (f6 * f4) + (f7 * cos);
            float f15 = fArr[2];
            float f16 = fArr[6];
            float f17 = (cos * f15) + (sin * f16);
            float f18 = (f15 * f4) + (f16 * cos);
            float f19 = fArr[3];
            float f25 = fArr[7];
            float f26 = (cos * f19) + (sin * f25);
            float f27 = (f4 * f19) + (cos * f25);
            fArr[0] = f3;
            fArr[1] = f8;
            fArr[2] = f17;
            fArr[3] = f26;
            fArr[4] = f5;
            fArr[5] = f9;
            fArr[6] = f18;
            fArr[7] = f27;
            float f28 = this.f320538m;
            float f29 = this.f320539n;
            fArr[0] = f3 * f28;
            fArr[1] = f8 * f28;
            fArr[2] = f17 * f28;
            fArr[3] = f26 * f28;
            fArr[4] = f5 * f29;
            fArr[5] = f9 * f29;
            fArr[6] = f18 * f29;
            fArr[7] = f27 * f29;
            fArr[8] = fArr[8] * 1.0f;
            fArr[9] = fArr[9] * 1.0f;
            fArr[10] = fArr[10] * 1.0f;
            fArr[11] = fArr[11] * 1.0f;
            C103235g0.m136672e(fArr, -this.f320536k, -this.f320537l, 0.0f, 4, (Object) null);
            this.f320542q = false;
        }
        if (this.f320530e) {
            if (!this.f320529d.isEmpty()) {
                C31401f fVar3 = this.f320532g;
                if (fVar3 == null) {
                    fVar3 = new C31401f();
                    this.f320532g = fVar3;
                } else {
                    ((ArrayList) fVar3.f84037a).clear();
                }
                C27726j0 j0Var = this.f320531f;
                if (j0Var == null) {
                    j0Var = C103245l.m136700a();
                    this.f320531f = j0Var;
                } else {
                    ((C103240i) j0Var).reset();
                }
                List<? extends C31381e> list = this.f320529d;
                C87412m.m108594g(list, "nodes");
                ((ArrayList) fVar3.f84037a).addAll(list);
                fVar3.mo58149c(j0Var);
            }
            this.f320530e = false;
        }
        C104230e B = fVar.mo145815B();
        long e = B.mo145834e();
        B.mo145835i().mo142944c();
        C104234h j = B.mo145836j();
        float[] fArr2 = this.f320527b;
        if (fArr2 != null) {
            j.mo145843f(fArr2);
        }
        C27726j0 j0Var2 = this.f320531f;
        if ((!this.f320529d.isEmpty()) && j0Var2 != null) {
            j.mo145842e(j0Var2, 1);
        }
        ArrayList arrayList = (ArrayList) this.f320528c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C107087g) arrayList.get(i)).mo157535a(fVar2);
        }
        B.mo145835i().mo142943b();
        B.mo145837k(e);
    }

    /* renamed from: b */
    public C32224a<C13598b0> mo157536b() {
        return this.f320533h;
    }

    /* renamed from: d */
    public void mo157537d(C32224a<C13598b0> aVar) {
        this.f320533h = aVar;
        ArrayList arrayList = (ArrayList) this.f320528c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C107087g) arrayList.get(i)).mo157537d(aVar);
        }
    }

    /* renamed from: e */
    public final void mo157538e(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < ((ArrayList) this.f320528c).size()) {
                ((C107087g) ((ArrayList) this.f320528c).get(i)).mo157537d((C32224a<C13598b0>) null);
                ((ArrayList) this.f320528c).remove(i);
            }
        }
        mo157547c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.f320534i);
        ArrayList arrayList = (ArrayList) this.f320528c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append("\t");
            sb.append(((C107087g) arrayList.get(i)).toString());
            sb.append("\n");
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }
}
