package qj1;

import cl1.C54963d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import qg1.C47826f;
import te3.C50415mk1;

/* renamed from: qj1.a2 */
public final class C62626a2 implements C47826f.C47827a {

    /* renamed from: a */
    public final /* synthetic */ C63068w1 f177837a;

    /* renamed from: b */
    public final /* synthetic */ String f177838b;

    public C62626a2(C63068w1 w1Var, String str) {
        this.f177837a = w1Var;
        this.f177838b = str;
    }

    /* renamed from: a */
    public void mo9151a(int i, long j, C50415mk1 mk12) {
    }

    /* renamed from: b */
    public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
    }

    /* renamed from: c */
    public void mo9153c(int i, long j) {
        Class cls = C54963d0.class;
        ((C54963d0) this.f177837a.mo87696x0(cls)).f154048B.f144323d = j;
        ((C54963d0) this.f177837a.mo87696x0(cls)).f154048B.f144325f = this.f177838b;
    }

    /* renamed from: d */
    public void mo9154d(int i, int i2, String str, int i3) {
        String str2 = this.f177837a.f178988q;
        Log.m105924i(str2, "set mic setting fail, errType:" + i + " errCode:" + i2);
    }
}
