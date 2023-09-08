package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.e0 */
public class C113091e0 extends C113107m0 {

    /* renamed from: f */
    public int f338491f = 0;

    /* renamed from: g */
    public int f338492g = 0;

    /* renamed from: h */
    public int f338493h = 0;

    public C113091e0() {
        this.f338498e = 326;
    }

    /* renamed from: h */
    public Boolean mo165621h() {
        if (this.f338496c < 12) {
            return Boolean.FALSE;
        }
        int f = C117790util.m166184f(this.f338497d, 8);
        if (this.f338496c < f + 12) {
            return Boolean.FALSE;
        }
        this.f338491f = f;
        int f2 = C117790util.m166184f(this.f338497d, 10 + f);
        int i = this.f338496c;
        int i2 = this.f338491f;
        if (i < i2 + 12 + f2) {
            return Boolean.FALSE;
        }
        this.f338492g = f2;
        int f3 = C117790util.m166184f(this.f338497d, 14 + i2 + f2);
        if (this.f338496c < this.f338491f + 12 + this.f338492g + f3) {
            return Boolean.FALSE;
        }
        this.f338493h = f3;
        return Boolean.TRUE;
    }
}
