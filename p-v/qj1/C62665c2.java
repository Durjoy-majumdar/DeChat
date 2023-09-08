package qj1;

import cl1.C54963d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import qg1.C47826f;
import te3.C50415mk1;

/* renamed from: qj1.c2 */
public final class C62665c2 implements C47826f.C47827a {

    /* renamed from: a */
    public final /* synthetic */ C63068w1 f177949a;

    public C62665c2(C63068w1 w1Var) {
        this.f177949a = w1Var;
    }

    /* renamed from: a */
    public void mo9151a(int i, long j, C50415mk1 mk12) {
    }

    /* renamed from: b */
    public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
    }

    /* renamed from: c */
    public void mo9153c(int i, long j) {
        String str = this.f177949a.f178988q;
        Log.m105924i(str, "set mic setting success micSettingFlag:" + j);
        ((C54963d0) this.f177949a.mo87696x0(C54963d0.class)).f154048B.f144323d = j;
    }

    /* renamed from: d */
    public void mo9154d(int i, int i2, String str, int i3) {
        String str2 = this.f177949a.f178988q;
        Log.m105924i(str2, "set mic setting fail, errType:" + i + " errCode:" + i2);
    }
}
