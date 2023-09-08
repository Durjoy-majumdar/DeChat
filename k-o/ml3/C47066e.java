package ml3;

import com.tencent.p014mm.storage.C44660i2;
import eb0.C97625j3;
import eb0.z3$$g;
import ml3.C47058a;
import rb0.C48009v0;

/* renamed from: ml3.e */
public class C47066e implements z3$$g {

    /* renamed from: d */
    public final /* synthetic */ long f126486d;

    /* renamed from: e */
    public final /* synthetic */ C47058a.C47060b f126487e;

    public C47066e(C47058a.C47060b bVar, long j) {
        this.f126487e = bVar;
        this.f126486d = j;
    }

    /* renamed from: b */
    public boolean mo24603b() {
        return this.f126487e.f126476f;
    }

    /* renamed from: c */
    public void mo24604c() {
        if (this.f126487e.f126477g != null) {
            C48009v0.Ax0().mo73043jo(this.f126486d);
            C48009v0.Dx0().mo73031qq(this.f126486d);
            if (C48009v0.Dx0().mo73025bD(this.f126487e.f126479i) <= 0) {
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(this.f126487e.f126479i);
            }
            this.f126487e.f126477g.dismiss();
        }
    }
}
