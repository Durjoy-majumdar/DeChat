package ak2;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import gy3.C87412m;
import nj2.C109749c;
import nj2.C61759g;
import nj2.C61767o;
import nj2.C61768p;
import p206nj.C11171e;
import p492dn.C107054l;
import p645pj.C77091b;
import pu0.C110248b;
import wj2.C66129b;
import wj2.C66131d;
import zj2.C66862f;

/* renamed from: ak2.c */
public final class C54121c extends C54119a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54121c(C61759g gVar) {
        super(gVar);
        C87412m.m108594g(gVar, "helper");
        this.f151967b = C109749c.C61756a.VOIP;
    }

    /* renamed from: b */
    public boolean mo74909b(String str, Bundle bundle) {
        String string;
        boolean z;
        boolean z2;
        boolean z3;
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(bundle, "bundle");
        int i = 0;
        switch (str.hashCode()) {
            case -346633629:
                if (!str.equals("bad_net")) {
                    return false;
                }
                int i2 = bundle.getInt("streamType");
                C110248b.C110249a aVar = C110248b.f329777h;
                if (!aVar.mo161665j() && !aVar.mo161666k() && (C87412m.m108589b(aVar.mo161656a(), "silent") || C87412m.m108589b(aVar.mo161656a(), "vibrate"))) {
                    return false;
                }
                try {
                    this.f151966a.xx0(C66131d.CLOSE_SOUND, i2, false);
                    this.f151966a.Ax0((String) null, false, 0);
                    C61759g gVar = this.f151966a;
                    boolean l = aVar.mo161667l();
                    C66862f vx02 = gVar.vx0();
                    if (vx02 != null) {
                        vx02.mo90867f(l);
                        break;
                    }
                } catch (Throwable th) {
                    Log.m105929w("MicroMsg.BaseSceneSetting", "playSound Failed Throwable t = ", th);
                    return false;
                }
                break;
            case 100571:
                if (!str.equals("end")) {
                    return false;
                }
                return mo74908a(bundle.getInt("streamType"));
            case 94756344:
                if (str.equals("close")) {
                    C66862f vx03 = this.f151966a.vx0();
                    if (vx03 != null) {
                        vx03.mo90865d(C66129b.STOP_ACTION);
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    this.f151966a.mo86667W();
                    break;
                } else {
                    return false;
                }
            case 109757538:
                if (!str.equals(IXWebBroadcastListener.STAGE_START) || (string = bundle.getString("username")) == null) {
                    return false;
                }
                int i3 = bundle.getInt("isVideoCall");
                boolean z4 = bundle.getBoolean("isOutCall");
                long j = bundle.getLong("seekStartMs");
                Class cls = C107054l.class;
                if (C11171e.m11046c(29)) {
                    z = C77091b.m93024f(C61768p.m72480h(""));
                    z2 = C77091b.m93025g(C61768p.m72480h(""));
                } else {
                    z = C77091b.m93021c();
                    z2 = C77091b.m93027i();
                }
                if (z4) {
                    z = true;
                }
                if (z || z2) {
                    if (!z) {
                        this.f151966a.zx0(string, z4);
                        break;
                    } else {
                        boolean Dx = ((C107054l) C86312j.m106911c(cls)).mo157460Dx();
                        boolean qG = ((C107054l) C86312j.m106911c(cls)).mo157474qG();
                        Log.m105919d("MicroMsg.VoIPSceneSetting", "isBluetoothOn: %b, isHeadsetPlugged: %b", Boolean.valueOf(Dx), Boolean.valueOf(qG));
                        if (z4) {
                            z3 = !qG && i3 != 1 && !Dx;
                        } else {
                            z3 = true;
                            i = 2;
                        }
                        this.f151966a.xx0(C66131d.START_SOUND, i, true);
                        this.f151966a.Ax0(string, z4, j);
                        if (C61767o.m72472h()) {
                            this.f151966a.wx0(!z4 ? 1 : 3);
                        }
                        C66862f vx04 = this.f151966a.vx0();
                        if (vx04 != null) {
                            vx04.mo90867f(z3);
                        }
                        if (z2 && !z4) {
                            this.f151966a.yx0(true);
                            break;
                        }
                    }
                } else {
                    return false;
                }
                break;
            default:
                return false;
        }
        return true;
    }
}
