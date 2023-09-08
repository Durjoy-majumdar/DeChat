package b24;

import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.e */
public class C113090e extends C113107m0 {

    /* renamed from: f */
    public int f338487f = 0;

    /* renamed from: g */
    public int f338488g = 0;

    /* renamed from: h */
    public int f338489h = 0;

    /* renamed from: i */
    public int f338490i = 0;

    public C113090e() {
        this.f338498e = 261;
    }

    /* renamed from: h */
    public Boolean mo165621h() {
        if (this.f338496c < 2) {
            return Boolean.FALSE;
        }
        int f = C117790util.m166184f(this.f338497d, 4);
        this.f338488g = f;
        if (this.f338496c < f + 2 + 2) {
            return Boolean.FALSE;
        }
        int f2 = C117790util.m166184f(this.f338497d, f + 6);
        this.f338487f = f2;
        int i = this.f338496c;
        int i2 = this.f338488g;
        if (i < i2 + 2 + 2 + f2) {
            return Boolean.FALSE;
        }
        this.f338490i = 6;
        this.f338489h = i2 + 2 + 2 + 4;
        return Boolean.TRUE;
    }
}
