package fl1;

import al1.C54130j;
import c50.C54655b;
import cl1.C54963d0;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import o40.C61926c;
import org.json.JSONObject;
import qj1.C62799h2;
import qj1.C62815i3;
import qj1.C62876m2;
import qj1.C62877m3;
import rx3.C13604l;
import te3.C49765hx0;
import vk1.C65760a;

/* renamed from: fl1.c2 */
public final class C59156c2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C59161f f169181d;

    public C59156c2(C59161f fVar) {
        this.f169181d = fVar;
    }

    public final void run() {
        C54655b bVar;
        C59161f fVar = this.f169181d;
        Class cls = C54963d0.class;
        String str = fVar.f169228i;
        Log.m105924i(str, "restoreLinkMicUI curLinkMicUser:" + ((C54963d0) fVar.mo83051g(cls)).f154073p + " curLinkState:" + ((C54963d0) fVar.mo83051g(cls)).f154078u + " liveData.business(LiveCommonSlice::class.java).audienceLinkMicUserList:" + ((C54963d0) fVar.mo83051g(cls)).f154074q);
        JSONObject jSONObject = null;
        if (!((C54963d0) fVar.mo83051g(cls)).mo75913U3()) {
            C54130j jVar = ((C54963d0) fVar.mo83051g(cls)).f154073p;
            if (jVar != null && jVar.f152004h) {
                C54655b bVar2 = fVar.f166839h;
                if (bVar2 != null) {
                    C54130j jVar2 = ((C54963d0) fVar.mo83051g(cls)).f154073p;
                    bVar2.mo85706z0(jVar2 != null ? jVar2.f151997a : null);
                }
                if (((C54963d0) fVar.mo83051g(cls)).f154053G) {
                    C65760a aVar = fVar.f166837f;
                    if (aVar != null) {
                        C54655b bVar3 = fVar.f166839h;
                        C56032b.notifySEIMicUserChange$default(aVar, bVar3 != null ? bVar3.mo85677T() : null, false, (C13604l) null, 6, (Object) null);
                    }
                } else {
                    C65760a aVar2 = fVar.f166837f;
                    if (aVar2 != null) {
                        C56032b.notifyPKMicUserChange$default(aVar2, false, 1, (Object) null);
                    }
                }
            }
            List<C54130j> list = ((C54963d0) fVar.mo83051g(cls)).f154074q;
            C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
            if (!list.isEmpty()) {
                List<C54130j> list2 = ((C54963d0) fVar.mo83051g(cls)).f154074q;
                C87412m.m108593f(list2, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
                for (C54130j jVar3 : list2) {
                    C62815i3 i3Var = fVar.f169230n;
                    if (i3Var != null) {
                        C61926c.m72668M(new C62877m3(i3Var, jVar3.f151997a, 0));
                    }
                    if (jVar3.f152001e == 2 && (bVar = fVar.f166839h) != null) {
                        bVar.mo85706z0(jVar3.f151997a);
                    }
                }
                if (((C54963d0) fVar.mo83051g(cls)).f154053G) {
                    C65760a aVar3 = fVar.f166837f;
                    if (aVar3 != null) {
                        C54655b bVar4 = fVar.f166839h;
                        if (bVar4 != null) {
                            jSONObject = bVar4.mo85677T();
                        }
                        C56032b.notifySEIMicUserChange$default(aVar3, jSONObject, false, (C13604l) null, 6, (Object) null);
                        return;
                    }
                    return;
                }
                C65760a aVar4 = fVar.f166837f;
                if (aVar4 != null) {
                    C56032b.notifyAudienceMicUserChange$default(aVar4, false, 1, (Object) null);
                }
            }
        } else if (((C54963d0) fVar.mo83051g(cls)).f154078u == 5) {
            FinderLiveRandomMatchLinkMicStatePlugin finderLiveRandomMatchLinkMicStatePlugin = fVar.f169200P;
            if (finderLiveRandomMatchLinkMicStatePlugin != null) {
                float f = FinderLiveRandomMatchLinkMicStatePlugin.f15139G;
                finderLiveRandomMatchLinkMicStatePlugin.mo3221b1((List<? extends C49765hx0>) null);
            }
        } else {
            C62799h2 h2Var = fVar.f169199N;
            if (h2Var != null) {
                C61926c.m72668M(new C62876m2(h2Var));
            }
        }
    }
}
