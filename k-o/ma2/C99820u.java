package ma2;

import ca2.C92388b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import ma2.C99815p;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import rc0.C63389c;

@C86522b(dependencies = {C92388b.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: ma2.u */
public final class C99820u extends C86301e implements C63389c {
    /* renamed from: H4 */
    public void mo88293H4(boolean z) {
        C99808k.m130280c(z);
    }

    /* renamed from: IM */
    public void mo88294IM(C101106m mVar, C62602o oVar) {
        C99808k.m130282f(mVar, oVar);
    }

    /* renamed from: UZ */
    public void mo88295UZ(String str, String str2) {
        if (!C87412m.m108589b(str, C99808k.f292493c)) {
            Log.m105929w("MicroMsg.GlobalMusicFloatBallManager", "alvinluo notifyMusicCoverChanged musicId not the same and ignore musicId: %s, current: %s", str, C99808k.f292493c);
            return;
        }
        C99815p.C99817b bVar = C99815p.C99817b.f292513a;
        C99815p.C99817b.f292514b.mo139173K0(str2, true);
    }

    /* renamed from: eY */
    public boolean mo88296eY() {
        C99815p.C99817b.f292513a.getClass();
        return C99815p.C99817b.f292514b.mo90541w();
    }

    /* renamed from: ll */
    public C62602o mo88297ll() {
        return C99808k.f292494d;
    }

    /* renamed from: vr */
    public void mo88298vr() {
        C101106m b = C101093a.m132480b();
        boolean z = false;
        Log.m105925i("MicroMsg.MusicFloatBallService", "alvinluo resumeMusicFloatBall %s", b);
        if (b != null && !b.f295953N) {
            z = true;
        }
        if (z) {
            b.f295953N = true;
            C101093a.m132491m(b);
        }
        C99808k.m130281e(b);
    }
}
