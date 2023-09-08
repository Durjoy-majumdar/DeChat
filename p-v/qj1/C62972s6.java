package qj1;

import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gj1.C59466b;
import gy3.C87412m;
import te3.C49712hj1;
import te3.C51463ty0;

/* renamed from: qj1.s6 */
public final class C62972s6 extends C62660c {

    /* renamed from: p */
    public final ViewGroup f178678p;

    /* renamed from: q */
    public final C58124b f178679q;

    /* renamed from: r */
    public final String f178680r = "MicroMsg.FinderLiveGameDynamicFramePlugin";

    /* renamed from: s */
    public C59466b f178681s;

    /* renamed from: t */
    public boolean f178682t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62972s6(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "entranceRoot");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178678p = viewGroup;
        this.f178679q = bVar;
    }

    /* renamed from: Z0 */
    public void mo87904Z0() {
        C51463ty0 ty02 = ((C54991o) mo87696x0(C54991o.class)).f154179A1;
        if (ty02 == null) {
            mo10792g(8);
            Log.m105920e(this.f178680r, "liveGameData is null");
        } else if (!this.f178682t && ty02.f142472g) {
            String str = null;
            boolean z = true;
            if (ty02.f142471f == 0) {
                String str2 = this.f178680r;
                Object[] objArr = new Object[1];
                C59466b bVar = this.f178681s;
                if (bVar != null) {
                    str = bVar.f169911a;
                }
                objArr[0] = str;
                Log.m105921e(str2, "game_frameset_visibility is 0, id:%s", objArr);
                mo10792g(8);
                return;
            }
            C59466b bVar2 = this.f178681s;
            if (bVar2 != null) {
                Integer valueOf = bVar2 != null ? Integer.valueOf(bVar2.f169916f) : null;
                C87412m.m108592e(valueOf, "null cannot be cast to non-null type kotlin.Int");
                int intValue = valueOf.intValue();
                if ((ty02.f142471f & intValue) == 0) {
                    String str3 = this.f178680r;
                    Object[] objArr2 = new Object[3];
                    C59466b bVar3 = this.f178681s;
                    if (bVar3 != null) {
                        str = bVar3.f169911a;
                    }
                    objArr2[0] = str;
                    objArr2[1] = Integer.valueOf(intValue);
                    objArr2[2] = Integer.valueOf(ty02.f142471f);
                    Log.m105925i(str3, "frameSet id:%s is invisible, bit:%d, game_frameset_visibility:%d", objArr2);
                    mo10792g(8);
                    return;
                }
                if (mo82893g0()) {
                    C59466b bVar4 = this.f178681s;
                    if (bVar4 != null && !bVar4.f169914d) {
                        Log.m105924i(this.f178680r, "not support show in landscape");
                        mo10792g(8);
                        return;
                    }
                }
                if (!mo82893g0()) {
                    C59466b bVar5 = this.f178681s;
                    if (bVar5 == null || bVar5.f169913c) {
                        z = false;
                    }
                    if (z) {
                        Log.m105924i(this.f178680r, "not support show in portrait");
                        mo10792g(8);
                        return;
                    }
                }
                mo10792g(0);
                C63046v6 v6Var = (C63046v6) mo87687E0(C63046v6.class);
                if (v6Var != null) {
                    v6Var.mo87931c1(ty02);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo3200b() {
        C59466b bVar = this.f178681s;
        if (bVar != null) {
            return bVar != null && bVar.f169915e;
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: r0 */
    public void mo8358r0() {
        this.f178682t = true;
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        this.f178682t = false;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (bVar.ordinal() == 118) {
            mo87904Z0();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
    }
}
