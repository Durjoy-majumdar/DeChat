package h43;

import b43.C104031a;
import com.tencent.p014mm.plugin.voip.model.C106350h0;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import d43.C106987a;
import l33.C109247e;
import sx3.C110823p;
import t33.C110901b;
import u33.C111130b;
import v33.C111384c;
import w33.C111717b;
import w33.C111721d;
import w33.C111724e;
import w33.C111725u;
import w33.C111728x;
import x33.C112039b;
import zt3.C119157j;

/* renamed from: h43.h0 */
public final class C108088h0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C108077f0 f323681d;

    public C108088h0(C108077f0 f0Var) {
        this.f323681d = f0Var;
    }

    public final boolean onTimerExpired() {
        C111725u uVar;
        C111725u uVar2;
        C108117v vVar;
        C110901b bVar;
        String str;
        boolean z;
        C104031a aVar;
        C108126x0 x0Var;
        C108115u uVar3;
        if (C109247e.xx0().f317333b == null) {
            Log.m105920e("MicroMsg.VoIPRenderMgr", "current voip is uninit and current still run timer");
            this.f323681d.mo158495j();
            return true;
        }
        C108077f0 f0Var = this.f323681d;
        f0Var.getClass();
        boolean z2 = C109247e.vx0().f333452l;
        if (!C109247e.vx0().mo163049c()) {
            if (f0Var.f323642b != null && z2) {
                long j = f0Var.f323639J;
                if (j == 0 || Util.milliSecondsToNow(j) <= f0Var.f323636G) {
                    z = false;
                } else {
                    Log.m105924i("MicroMsg.VoIPRenderMgr", "current camera is open but has no video ");
                    z = true;
                }
                if (!(!z || (aVar = f0Var.f323642b) == null || (x0Var = f0Var.f323646f) == null || (uVar3 = x0Var.f323774a) == null)) {
                    f0Var.mo158489d(uVar3, ((C106987a) aVar).f320236a);
                }
            }
            long j2 = C109247e.vx0().f333458r;
            if (j2 == 0 || f0Var.f323639J != 0 || Util.milliSecondsToNow(j2) < f0Var.f323664x || f0Var.f323633D) {
                long j3 = f0Var.f323639J;
                if (j3 != 0 && Util.milliSecondsToNow(j3) >= f0Var.f323664x / ((long) 2) && !f0Var.f323633D) {
                    f0Var.f323633D = true;
                    C111130b a = C109247e.vx0().mo163047a(0);
                    if (a != null && a.mo162867a()) {
                        Log.m105920e("MicroMsg.VoIPRenderMgr", "camera source render error,can not post runnable");
                    } else {
                        Log.m105920e("MicroMsg.VoIPRenderMgr", "camera source render error,can other");
                    }
                    f0Var.f323639J = Util.nowMilliSecond();
                    C111725u uVar4 = C111384c.f333465d;
                    if (uVar4 != null) {
                        uVar4.mo163433o(true);
                    }
                }
            } else {
                f0Var.f323633D = true;
                f0Var.f323639J = Util.nowMilliSecond();
                C111130b a2 = C109247e.vx0().mo163047a(0);
                if (a2 != null && a2.mo162867a()) {
                    Log.m105920e("MicroMsg.VoIPRenderMgr", "camera source render error,can not post runnable");
                } else {
                    Log.m105920e("MicroMsg.VoIPRenderMgr", "camera source render error,can other");
                }
                C111725u uVar5 = C111384c.f333465d;
                if (uVar5 != null) {
                    uVar5.mo163433o(true);
                }
            }
        } else {
            f0Var.f323639J = Util.nowMilliSecond();
        }
        C108126x0 x0Var2 = this.f323681d.f323646f;
        if (!(x0Var2 == null || (vVar = x0Var2.f323776c) == null || (bVar = vVar.f323759t) == null)) {
            long j4 = C109247e.vx0().f333459s;
            if (j4 != 0) {
                String str2 = "decode source render pause cause remote capt pause";
                if (bVar.f331707a != 0 || Util.milliSecondsToNow(j4) < bVar.f331709c || bVar.f331708b) {
                    str = str2;
                } else {
                    bVar.f331708b = true;
                    bVar.f331707a = Util.nowMilliSecond();
                    if (bVar.f331710d) {
                        C111130b a3 = C109247e.vx0().mo163047a(3);
                        if (a3 != null && a3.mo162867a()) {
                            Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source independence render error,can not post runnable");
                            C111725u uVar6 = C111384c.f333465d;
                            if (uVar6 != null) {
                                uVar6.mo163433o(false);
                            }
                        } else if (C109247e.xx0().mo152622u()) {
                            Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source independence  render pause cause remote capt pause");
                        } else {
                            Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source independence  render error,cause other");
                            C111725u uVar7 = C111384c.f333465d;
                            if (uVar7 != null) {
                                uVar7.mo163433o(false);
                            }
                        }
                    } else {
                        C111130b a4 = C109247e.vx0().mo163047a(1);
                        if (a4 != null && a4.mo162867a()) {
                            Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source render error,can not post runnable");
                            C111725u uVar8 = C111384c.f333465d;
                            if (uVar8 != null) {
                                uVar8.mo163433o(false);
                            }
                        } else if (C109247e.xx0().mo152622u()) {
                            Log.m105920e("MircoMsg.VoipDecoderDataSource", str2);
                        } else {
                            Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source render error,cause other");
                            C111725u uVar9 = C111384c.f333465d;
                            if (uVar9 != null) {
                                uVar9.mo163433o(false);
                            }
                        }
                    }
                }
            } else {
                str = "decode source render pause cause remote capt pause";
            }
            long j5 = bVar.f331707a;
            if (j5 != 0 && Util.milliSecondsToNow(j5) >= bVar.f331709c && !bVar.f331708b) {
                bVar.f331707a = Util.nowMilliSecond();
                bVar.f331708b = true;
                if (bVar.f331710d) {
                    C111130b a5 = C109247e.vx0().mo163047a(3);
                    if (a5 != null && a5.mo162867a()) {
                        Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source independence render error,can not post runnable");
                        C111725u uVar10 = C111384c.f333465d;
                        if (uVar10 != null) {
                            uVar10.mo163433o(false);
                        }
                    } else if (C109247e.xx0().mo152622u()) {
                        Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source independence render pause cause remote capt pause");
                    } else {
                        Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source independence  render error,cause other");
                        C111725u uVar11 = C111384c.f333465d;
                        if (uVar11 != null) {
                            uVar11.mo163433o(false);
                        }
                    }
                } else {
                    C111130b a6 = C109247e.vx0().mo163047a(1);
                    if (a6 != null && a6.mo162867a()) {
                        Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source render error,can not post runnable");
                        C111725u uVar12 = C111384c.f333465d;
                        if (uVar12 != null) {
                            uVar12.mo163433o(false);
                        }
                    } else if (C109247e.xx0().mo152622u()) {
                        Log.m105920e("MircoMsg.VoipDecoderDataSource", str);
                    } else {
                        Log.m105920e("MircoMsg.VoipDecoderDataSource", "decode source render error,cause other");
                        C111725u uVar13 = C111384c.f333465d;
                        if (uVar13 != null) {
                            uVar13.mo163433o(false);
                        }
                    }
                }
            }
        }
        C111728x xVar = this.f323681d.f323658r;
        C111721d dVar = C111384c.f333467f;
        if (dVar != null) {
            dVar.mo163415n(xVar.f334537l, true);
        }
        C111721d dVar2 = C111384c.f333467f;
        if (dVar2 != null) {
            dVar2.mo163415n(xVar.f334538m, false);
        }
        C111721d dVar3 = C111384c.f333467f;
        if (dVar3 != null) {
            int i = xVar.f334539n;
            int A = C110823p.m150975A(dVar3.f334453a);
            if (i < A || A == 0) {
                dVar3.f334453a[0] = i;
            }
            if (i > C110823p.m150988N(dVar3.f334453a)) {
                dVar3.f334453a[1] = i;
            }
            int i2 = dVar3.f334454b + i;
            dVar3.f334454b = i2;
            dVar3.f334454b = i2 / 2;
            if (dVar3.f334455c - i > 5) {
                long j6 = C109247e.vx0().f333458r;
                if (j6 != 0) {
                    C112039b.C112040a aVar2 = dVar3.f334456d.get("EncoderLackFrame");
                    if (aVar2 == null) {
                        aVar2 = new C112039b.C112040a();
                    }
                    aVar2.f335401a = "EncoderLackFrame";
                    aVar2.mo163760d(Util.milliSecondsToNow(j6));
                    aVar2.mo163758b();
                    dVar3.f334456d.put("EncoderLackFrame", aVar2);
                    Log.m105924i("MicroMsg.VoIPProfileReport", "encode frame lack");
                }
            }
            dVar3.f334455c = i;
        } else {
            xVar.getClass();
        }
        if (C109247e.xx0().mo152622u() && (uVar2 = C111384c.f333465d) != null) {
            uVar2.f334514t = 0;
        }
        if (C109247e.vx0().mo163049c() && (uVar = C111384c.f333465d) != null) {
            uVar.f334482A = 0;
        }
        C111721d dVar4 = C111384c.f333467f;
        if (dVar4 != null) {
            ((C119157j) C119157j.f356862d).mo183876g(new C111724e(dVar4), "getGpuInfo");
        }
        xVar.f334537l = 0;
        xVar.f334538m = 0;
        xVar.f334539n = 0;
        long j7 = C109247e.vx0().f333458r;
        long j8 = C109247e.vx0().f333459s;
        if (xVar.f334531f != 0 || Util.milliSecondsToNow(j7) < ((long) xVar.f334540o) || xVar.f334532g) {
            long j9 = xVar.f334531f;
            if (j9 != 0 && Util.milliSecondsToNow(j9) >= ((long) xVar.f334540o) && !xVar.f334532g) {
                xVar.f334533h = Util.nowMilliSecond();
                xVar.f334532g = true;
                C111130b a7 = C109247e.vx0().mo163047a(0);
                if (a7 != null && a7.mo162867a()) {
                    Log.m105920e("MircoMsg.VoIPReporterController", "camera on screen render error,can not post runnable");
                    C111725u uVar14 = C111384c.f333465d;
                    if (uVar14 != null) {
                        uVar14.mo163435q(true);
                    }
                } else if (C109247e.vx0().mo163049c()) {
                    Log.m105920e("MircoMsg.VoIPReporterController", "camera on screen render pause,cause user lock screen or other op");
                } else {
                    Log.m105920e("MircoMsg.VoIPReporterController", "camera on screen render error,cause other");
                    C111725u uVar15 = C111384c.f333465d;
                    if (uVar15 != null) {
                        uVar15.mo163435q(true);
                    }
                }
            }
        } else {
            xVar.f334532g = true;
            xVar.f334531f = Util.nowMilliSecond();
            C111130b a8 = C109247e.vx0().mo163047a(0);
            if (a8 != null && a8.mo162867a()) {
                Log.m105920e("MircoMsg.VoIPReporterController", "camera on screen render error,can not post runnable");
                C111725u uVar16 = C111384c.f333465d;
                if (uVar16 != null) {
                    uVar16.mo163435q(true);
                }
            } else if (C109247e.vx0().mo163049c()) {
                Log.m105920e("MircoMsg.VoIPReporterController", "camera on screen render pause,cause user lock screen or other op");
            } else {
                Log.m105920e("MircoMsg.VoIPReporterController", "camera on screen render error,cause other");
                C111725u uVar17 = C111384c.f333465d;
                if (uVar17 != null) {
                    uVar17.mo163435q(true);
                }
            }
        }
        if (xVar.f334533h != 0 || j8 == 0 || Util.milliSecondsToNow(j8) < ((long) xVar.f334540o) || xVar.f334534i) {
            long j15 = xVar.f334533h;
            if (j15 != 0 && Util.milliSecondsToNow(j15) >= ((long) xVar.f334540o) && !xVar.f334534i) {
                xVar.f334533h = Util.nowMilliSecond();
                xVar.f334534i = true;
                C111130b a9 = C109247e.vx0().mo163047a(1);
                if (a9 != null && a9.mo162867a()) {
                    Log.m105920e("MircoMsg.VoIPReporterController", "decode on screen render error,can not post runnable");
                    C111725u uVar18 = C111384c.f333465d;
                    if (uVar18 != null) {
                        uVar18.mo163435q(false);
                    }
                } else if (!C109247e.xx0().mo152622u() || C109247e.vx0().f333459s != 0) {
                    Log.m105920e("MircoMsg.VoIPReporterController", "decode on screen render error,cause other");
                    C111725u uVar19 = C111384c.f333465d;
                    if (uVar19 != null) {
                        uVar19.mo163435q(false);
                    }
                } else {
                    Log.m105920e("MircoMsg.VoIPReporterController", "decode on screen render pause,cause  remote lock camera");
                }
            }
        } else {
            xVar.f334533h = Util.nowMilliSecond();
            xVar.f334534i = true;
            C111130b a15 = C109247e.vx0().mo163047a(1);
            if (a15 != null && a15.mo162867a()) {
                Log.m105920e("MircoMsg.VoIPReporterController", "decode on screen render error,can not post runnable");
                C111725u uVar20 = C111384c.f333465d;
                if (uVar20 != null) {
                    uVar20.mo163435q(false);
                }
            } else if (!C109247e.xx0().mo152622u() || C109247e.vx0().f333459s != 0) {
                Log.m105920e("MircoMsg.VoIPReporterController", "decode on screen render error,cause other");
                C111725u uVar21 = C111384c.f333465d;
                if (uVar21 != null) {
                    uVar21.mo163435q(false);
                }
            } else {
                Log.m105920e("MircoMsg.VoIPReporterController", "decode on screen render pause,cause  remote lock camera");
            }
        }
        if (xVar.f334535j != 0 || j8 == 0 || Util.milliSecondsToNow(j8) < ((long) xVar.f334540o) || xVar.f334536k) {
            long j16 = xVar.f334535j;
            if (j16 != 0 && Util.milliSecondsToNow(j16) >= ((long) xVar.f334540o) && !xVar.f334536k) {
                xVar.f334536k = true;
                xVar.f334535j = Util.nowMilliSecond();
                if (C109247e.vx0().mo163049c()) {
                    Log.m105920e("MircoMsg.VoIPReporterController", "camera encode render pause,cause user lock screen or other op");
                } else {
                    C111717b bVar2 = C111384c.f333466e;
                    if (bVar2 != null) {
                        bVar2.mo163393a();
                    }
                }
            }
        } else {
            xVar.f334536k = true;
            xVar.f334535j = Util.nowMilliSecond();
            if (C109247e.vx0().mo163049c()) {
                Log.m105920e("MircoMsg.VoIPReporterController", "camera encode render pause,cause user lock screen or other op");
            } else {
                C111717b bVar3 = C111384c.f333466e;
                if (bVar3 != null) {
                    bVar3.mo163393a();
                }
            }
        }
        C108077f0 f0Var2 = this.f323681d;
        f0Var2.getClass();
        C106350h0 xx02 = C109247e.xx0();
        int i3 = f0Var2.f323637H;
        v2protocal v2protocal = xx02.f317332a.f317396a.f317450A.f317711d.f317500x;
        v2protocal.f317631e1 = i3;
        v2protocal.f317634f1 = 0;
        f0Var2.f323637H = 0;
        return true;
    }
}
