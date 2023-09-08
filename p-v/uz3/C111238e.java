package uz3;

import gy3.C87412m;
import java.util.Arrays;
import sz3.C110828a;

/* renamed from: uz3.e */
public final class C111238e extends C110828a {

    /* renamed from: g */
    public static final C111238e f333108g = new C111238e(1, 7, 1);

    /* renamed from: f */
    public final boolean f333109f;

    static {
        new C111238e(new int[0]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111238e(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        C87412m.m108594g(iArr, "versionArray");
        this.f333109f = z;
    }

    /* renamed from: c */
    public boolean mo162990c() {
        boolean z;
        int i = this.f331565b;
        if (i == 1 && this.f331566c == 0) {
            return false;
        }
        if (this.f333109f) {
            z = mo162404b(f333108g);
        } else {
            C111238e eVar = f333108g;
            z = i == eVar.f331565b && this.f331566c <= eVar.f331566c + 1;
        }
        return z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C111238e(int... iArr) {
        this(iArr, false);
        C87412m.m108594g(iArr, "numbers");
    }
}
