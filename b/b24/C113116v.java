package b24;

import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82088k;
import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.v */
public class C113116v extends C113107m0 {

    /* renamed from: f */
    public int f338502f = 0;

    /* renamed from: g */
    public int f338503g = 0;

    public C113116v() {
        this.f338498e = C82088k.CTRL_INDEX;
    }

    /* renamed from: h */
    public Boolean mo165621h() {
        if (this.f338496c < 2) {
            return Boolean.FALSE;
        }
        int f = C117790util.m166184f(this.f338497d, 4);
        this.f338502f = f;
        if (this.f338496c < f + 2 + 2) {
            return Boolean.FALSE;
        }
        this.f338503g = C117790util.m166184f(this.f338497d, 6 + f);
        return Boolean.TRUE;
    }
}
