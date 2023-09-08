package ai1;

import c02.C92331c;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C7335d;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import fj1.C45795b;
import gy3.C87412m;
import kr0.C34016t0;
import p444at.C92087b;

/* renamed from: ai1.a */
public final class C54033a {

    /* renamed from: a */
    public static final C54033a f151301a = new C54033a();

    /* renamed from: b */
    public static HandOff f151302b;

    /* renamed from: a */
    public final boolean mo74696a() {
        C34016t0 t0Var = (C34016t0) C86312j.m106911c(C34016t0.class);
        if (t0Var == null) {
            return false;
        }
        if (!t0Var.Ld0()) {
            Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "not wxOnline");
            return false;
        } else if (t0Var.getIconType() == 1 || t0Var.getIconType() == 2) {
            Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "online type:" + t0Var.getIconType() + " version:" + t0Var.Wu0());
            int i = t0Var.getIconType() == 1 ? 1661142272 : 318898176;
            if (BuildInfo.DEBUG) {
                return true;
            }
            if (i == 0 || t0Var.Wu0() < i) {
                return false;
            }
            Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "check pass, can show handoff");
            return true;
        } else {
            Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "not pc/mac icon type " + t0Var.getIconType());
            return false;
        }
    }

    /* renamed from: b */
    public final void mo74697b(HandOff handOff) {
        String key = handOff != null ? handOff.getKey() : null;
        HandOff handOff2 = f151302b;
        if (!C87412m.m108589b(key, handOff2 != null ? handOff2.getKey() : null)) {
            HandOff handOff3 = f151302b;
            if (handOff3 != null) {
                Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "delete previous handoff: " + handOff3);
                ((C92331c) C86312j.m106911c(C92331c.class)).mo58349Bn(handOff3.getKey());
            }
            f151302b = null;
            Log.m105924i("MicroMsg.FinderLiveHandOffUtil", "save currentHandOffKey " + null);
            MultiProcessMMKV.getDefault().remove("FinderLiveHandOffUtil_current");
        }
    }

    /* renamed from: c */
    public final HandOff mo74698c(C45795b bVar) {
        Class cls = C54991o.class;
        if (bVar == null) {
            Log.m105920e("MicroMsg.FinderLiveHandOffUtil", "liveContext is null");
            return null;
        }
        C58969q b = C58961d.f168673a.mo84155b(((C54991o) bVar.mo71262a(cls)).f154345o);
        if (b == null) {
            Log.m105920e("MicroMsg.FinderLiveHandOffUtil", "contact is null username: " + ((C54991o) bVar.mo71262a(cls)).f154345o);
            return null;
        }
        C55001u uVar = (C55001u) bVar.mo71262a(C55001u.class);
        C7335d c = C86312j.m106911c(C92087b.class);
        C87412m.m108593f(c, "getService(IHandOffFeatureService::class.java)");
        String nickname = b.getNickname();
        String avatarUrl = b.getAvatarUrl();
        String valueOf = String.valueOf(uVar.f154416j);
        String str = uVar.f154423t;
        String valueOf2 = String.valueOf(uVar.f154420q.f182392d);
        return ((C92087b) c).mo126069Kd(nickname, avatarUrl, valueOf, str, valueOf2, 1, "", "", valueOf2);
    }
}
