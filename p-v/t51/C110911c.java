package t51;

import android.animation.Animator;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import p51.C110184g;
import p821rk.C48041n;

/* renamed from: t51.c */
public final class C110911c implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331722d;

    /* renamed from: e */
    public final /* synthetic */ long f331723e;

    public C110911c(SpringLuckyEggActivity springLuckyEggActivity, long j) {
        this.f331722d = springLuckyEggActivity;
        this.f331723e = j;
    }

    public void onAnimationCancel(Animator animator) {
        Log.m105918d("MicroMsg.SpringLuckyEggActivity", "onAnimationCancel");
        C110928q qVar = this.f331722d.f312423f;
        if (qVar != null) {
            qVar.f331746b.setVisibility(8);
            C110928q qVar2 = this.f331722d.f312423f;
            if (qVar2 != null) {
                qVar2.f331746b.mo129237x();
                C110928q qVar3 = this.f331722d.f312423f;
                if (qVar3 != null) {
                    qVar3.f331746b.setVisibility(8);
                } else {
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewBinding");
                throw null;
            }
        } else {
            C87412m.m108603p("viewBinding");
            throw null;
        }
    }

    public void onAnimationEnd(Animator animator) {
        String str;
        Log.m105918d("MicroMsg.SpringLuckyEggActivity", "onAnimationEnd");
        C110928q qVar = this.f331722d.f312423f;
        if (qVar != null) {
            qVar.f331746b.setVisibility(8);
            C110928q qVar2 = this.f331722d.f312423f;
            if (qVar2 != null) {
                qVar2.f331746b.mo129237x();
                C110928q qVar3 = this.f331722d.f312423f;
                if (qVar3 != null) {
                    qVar3.f331746b.setVisibility(8);
                    C48041n value = this.f331722d.mo149514M7().f331793q.getValue();
                    if (!(value == null || (str = value.f128870o) == null)) {
                        SpringLuckyEggActivity springLuckyEggActivity = this.f331722d;
                        if (str.length() > 0) {
                            C110928q qVar4 = springLuckyEggActivity.f312423f;
                            if (qVar4 != null) {
                                qVar4.f331748d.setText(str);
                            } else {
                                C87412m.m108603p("viewBinding");
                                throw null;
                            }
                        }
                    }
                    if (this.f331722d.mo149514M7().f331791o.getValue() != null) {
                        C110928q qVar5 = this.f331722d.f312423f;
                        if (qVar5 != null) {
                            qVar5.f331747c.setVisibility(0);
                        } else {
                            C87412m.m108603p("viewBinding");
                            throw null;
                        }
                    } else {
                        C110928q qVar6 = this.f331722d.f312423f;
                        if (qVar6 != null) {
                            qVar6.f331747c.setVisibility(4);
                        } else {
                            C87412m.m108603p("viewBinding");
                            throw null;
                        }
                    }
                    C48041n value2 = this.f331722d.mo149514M7().f331793q.getValue();
                    C115669n.INSTANCE.mo160131h(18916, C110184g.f329622e, "", 15, Long.valueOf(Util.milliSecondsToNow(this.f331723e)), "", "", "", "", C110184g.f329624g, Long.valueOf(value2 != null ? value2.f128876u : 0));
                    return;
                }
                C87412m.m108603p("viewBinding");
                throw null;
            }
            C87412m.m108603p("viewBinding");
            throw null;
        }
        C87412m.m108603p("viewBinding");
        throw null;
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        Log.m105918d("MicroMsg.SpringLuckyEggActivity", "onAnimationStart");
        C110928q qVar = this.f331722d.f312423f;
        if (qVar != null) {
            qVar.f331756l.setVisibility(0);
        } else {
            C87412m.m108603p("viewBinding");
            throw null;
        }
    }
}
