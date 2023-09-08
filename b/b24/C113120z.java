package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.z */
public class C113120z extends C113107m0 {

    /* renamed from: f */
    public int f338506f = 0;

    public C113120z() {
        this.f338498e = 312;
    }

    /* renamed from: h */
    public Boolean mo165621h() {
        if (this.f338496c < 4) {
            return Boolean.FALSE;
        }
        int g = C117790util.m166185g(this.f338497d, 4);
        this.f338506f = g;
        return this.f338496c < (g * 10) + 4 ? Boolean.FALSE : Boolean.TRUE;
    }

    /* renamed from: i */
    public int mo165636i() {
        for (int i = 0; i < this.f338506f; i++) {
            int i2 = 8 + (i * 10);
            if (C117790util.m166184f(this.f338497d, i2) == 266) {
                return C117790util.m166185g(this.f338497d, i2 + 2);
            }
        }
        return 0;
    }
}
