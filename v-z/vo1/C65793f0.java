package vo1;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import bp1.C54519d;
import cl1.C54991o;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import cp1.C57952m;
import cp1.C57957o;
import vo1.C65770a0;
import wo1.C66162t;

/* renamed from: vo1.f0 */
public final class C65793f0 implements C96814a.C57541b {

    /* renamed from: d */
    public final /* synthetic */ C65770a0 f189235d;

    public C65793f0(C65770a0 a0Var) {
        this.f189235d = a0Var;
    }

    /* renamed from: F */
    public void mo22955F(String str, String str2) {
        Log.m105924i("FinderLiveReplayService", "onVideoWaitingEnd sessionId:" + str + ",mediaId:" + str2);
    }

    /* renamed from: I1 */
    public void mo22956I1(String str, String str2) {
        Log.m105924i("FinderLiveReplayService", "onVideoFirstFrameDraw sessionId:" + str + ",mediaId:" + str2);
    }

    /* renamed from: I3 */
    public void mo22957I3(String str, String str2, Boolean bool) {
        bool.booleanValue();
        Log.m105924i("FinderLiveReplayService", "onVideoWaiting sessionId:" + str + ",mediaId:" + str2);
    }

    /* renamed from: L */
    public void mo22958L(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoEnded,");
        C65770a0 a0Var = this.f189235d;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        C57952m mVar = this.f189235d.f189201o;
        if (mVar != null) {
            mVar.mo82763i();
        }
        C65770a0.m77400b(this.f189235d, 1);
    }

    /* renamed from: T */
    public void mo22960T(String str, String str2, String str3, int i, int i2) {
    }

    /* renamed from: Z */
    public void mo22962Z(String str, String str2) {
    }

    /* renamed from: a0 */
    public void mo22963a0(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoPause,");
        C65770a0 a0Var = this.f189235d;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        C57957o oVar = this.f189235d.f189191e;
        if (oVar != null) {
            oVar.mo78587j();
        }
    }

    /* renamed from: l0 */
    public void mo22964l0(String str, String str2, int i, int i2) {
        Boolean bool;
        Context uIContext;
        Resources resources;
        Configuration configuration;
        Class cls = C54991o.class;
        C54991o oVar = (C54991o) this.f189235d.mo89804e(cls);
        if (oVar != null) {
            oVar.f154335l1 = i;
        }
        C54991o oVar2 = (C54991o) this.f189235d.mo89804e(cls);
        if (oVar2 != null) {
            oVar2.f154338m1 = i2;
        }
        C54991o oVar3 = (C54991o) this.f189235d.mo89804e(cls);
        boolean z = false;
        boolean z2 = oVar3 != null && oVar3.mo75966J4();
        C54991o oVar4 = (C54991o) this.f189235d.mo89804e(cls);
        boolean z3 = oVar4 != null && oVar4.mo75992a4();
        C57957o oVar5 = this.f189235d.f189191e;
        boolean z4 = (oVar5 == null || (uIContext = oVar5.getUIContext()) == null || (resources = uIContext.getResources()) == null || (configuration = resources.getConfiguration()) == null || configuration.orientation != 2) ? false : true;
        C54519d dVar = (C54519d) this.f189235d.mo89804e(C54519d.class);
        boolean z5 = dVar != null && dVar.f152853p;
        C57952m mVar = this.f189235d.f189201o;
        Boolean bool2 = null;
        if (mVar != null) {
            bool = Boolean.valueOf(mVar.f165852a.getScaleType() == 1);
        } else {
            bool = null;
        }
        C57952m mVar2 = this.f189235d.f189201o;
        if (mVar2 != null) {
            if (mVar2.f165852a.getScaleType() == 0) {
                z = true;
            }
            bool2 = Boolean.valueOf(z);
        }
        Log.m105924i("FinderLiveReplayService", "onGetVideoSize sessionId:" + str + ",mediaId:" + str2 + ",width:" + i + "-height:" + i2 + ",supportScreenRotation:" + z2 + ",isLandscapeVideo:" + z3 + ",orientationLandscape:" + z4 + ",isScreenShareMode:" + z5 + ",isFitScaleType:" + bool + ",isFillScaleType:" + bool2 + ',' + this.f189235d.mo89808i());
        if ((!z2 || !z3) && !z4 && !z5) {
            C57952m mVar3 = this.f189235d.f189201o;
            if (mVar3 != null) {
                mVar3.mo82761g();
            }
        } else {
            C57952m mVar4 = this.f189235d.f189201o;
            if (mVar4 != null) {
                mVar4.mo82762h();
            }
        }
        C57957o oVar6 = this.f189235d.f189191e;
        if (oVar6 != null) {
            oVar6.mo78588k(i, i2);
        }
    }

    /* renamed from: m0 */
    public void mo22965m0(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoPlay,");
        C65770a0 a0Var = this.f189235d;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        sb.append(a0Var.mo89808i());
        Log.m105924i("FinderLiveReplayService", sb.toString());
        C57957o oVar = this.f189235d.f189191e;
        if (oVar != null) {
            oVar.mo78585h();
        }
        C54519d dVar = (C54519d) this.f189235d.mo89804e(C54519d.class);
        if (dVar != null) {
            dVar.mo75366L3(1);
        }
    }

    public void onSeekComplete(ITPPlayer iTPPlayer) {
        int currentPositionMs = (int) ((iTPPlayer != null ? iTPPlayer.getCurrentPositionMs() : 0) / ((long) 1000));
        C54519d dVar = (C54519d) this.f189235d.mo89804e(C54519d.class);
        int i = dVar != null ? dVar.f152854q : 0;
        int i2 = currentPositionMs > 0 ? currentPositionMs : i;
        Log.m105924i("FinderLiveReplayService", "onSeekComplete playCurPositionMs:" + currentPositionMs + ",curOffset:" + i);
        C65770a0.m77401c(this.f189235d, i2);
        for (C66162t a : this.f189235d.f189197k) {
            a.mo90212a(i2);
        }
    }
}
