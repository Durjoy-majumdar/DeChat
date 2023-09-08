package h11;

import com.tencent.p014mm.vfs.C86013q1;
import eb0.C97629n2;
import eb0.z3$$i;
import i11.C98587i;
import j11.C98894c;
import rx3.C13598b0;

/* renamed from: h11.f */
public final class C98312f implements C98894c, z3$$i {

    /* renamed from: d */
    public final C97629n2.C97630a f288163d;

    /* renamed from: e */
    public final boolean f288164e;

    /* renamed from: f */
    public final int f288165f;

    /* renamed from: g */
    public final int[] f288166g;

    /* renamed from: h */
    public volatile long f288167h;

    /* renamed from: i */
    public volatile int f288168i;

    public C98312f(int i, C97629n2.C97630a aVar, boolean z) {
        this.f288163d = aVar;
        this.f288164e = z;
        Integer[] numArr = C32648b.f86651a;
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 += numArr[i3].intValue();
        }
        this.f288165f = i * i2;
        Integer[] numArr2 = C32648b.f86651a;
        this.f288166g = new int[4];
    }

    /* renamed from: W1 */
    public void mo127430W1(int i, int i2) {
        this.f288166g[0] = i;
        mo137603b();
    }

    /* renamed from: a */
    public void mo105958a(int i, int i2) {
        this.f288166g[1] = i;
        mo137603b();
    }

    /* renamed from: b */
    public final C13598b0 mo137603b() {
        C97629n2.C97630a aVar = this.f288163d;
        if (aVar == null) {
            return null;
        }
        int[] iArr = this.f288166g;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            i2 += iArr[i] * C32648b.f86651a[i3].intValue();
            i++;
            i3++;
        }
        aVar.mo24601a(i2, this.f288165f);
        return C13598b0.f38549a;
    }

    /* renamed from: d */
    public void mo105959d(boolean z, int i) {
        this.f288168i = i;
        if (!z && this.f288164e) {
            C98587i.f289083d.mo137958a();
        }
    }

    /* renamed from: q7 */
    public void mo127431q7(boolean z, long j) {
        this.f288167h = j;
        if (!z && this.f288164e) {
            C86013q1.m106445f("wcf://image2/");
            C86013q1.m106445f("wcf://video/");
            C86013q1.m106445f("wcf://voice2/");
            C86013q1.m106445f("wcf://attachment/");
            C86013q1.m106445f("wcf://record/");
            C86013q1.m106445f("wcf://c2c/");
        }
    }
}
