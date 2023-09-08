package fl1;

import cl1.C54963d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import qg1.C47826f;
import te3.C50415mk1;

/* renamed from: fl1.x2 */
public final class C59241x2 implements C47826f.C47827a {

    /* renamed from: a */
    public final /* synthetic */ C59161f f169394a;

    /* renamed from: b */
    public final /* synthetic */ String f169395b;

    public C59241x2(C59161f fVar, String str) {
        this.f169394a = fVar;
        this.f169395b = str;
    }

    /* renamed from: a */
    public void mo9151a(int i, long j, C50415mk1 mk12) {
    }

    /* renamed from: b */
    public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
    }

    /* renamed from: c */
    public void mo9153c(int i, long j) {
        String str = this.f169394a.f169228i;
        Log.m105924i(str, "setFocusMicSetting set mic setting success focusUserId:" + this.f169395b);
        ((C54963d0) this.f169394a.mo83051g(C54963d0.class)).f154048B.f144325f = this.f169395b;
    }

    /* renamed from: d */
    public void mo9154d(int i, int i2, String str, int i3) {
        String str2 = this.f169394a.f169228i;
        Log.m105924i(str2, "setFocusMicSetting set mic setting fail, errType:" + i + " errCode:" + i2);
    }
}
