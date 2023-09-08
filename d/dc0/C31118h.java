package dc0;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import di3.C86312j;
import eb0.C75565a2;
import eb0.C75597w2;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import p214om.C35190g;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: dc0.h */
public class C31118h extends C86301e implements C35190g {

    /* renamed from: d */
    public C31112c f83445d;

    /* renamed from: e */
    public volatile C75565a2 f83446e;

    public static C31112c vx0() {
        Class cls = C31118h.class;
        C86709a0.m107523b().mo121108c();
        if (((C31118h) C86312j.m106911c(cls)).f83445d == null) {
            ((C31118h) C86312j.m106911c(cls)).f83445d = new C31112c(C97625j3.m125812b().mo105909x());
        }
        return ((C31118h) C86312j.m106911c(cls)).f83445d;
    }

    public C75597w2 n00() {
        if (this.f83446e == null) {
            synchronized (this) {
                if (this.f83446e == null) {
                    this.f83446e = new C75565a2(new C31113d());
                }
            }
        }
        return this.f83446e;
    }
}
