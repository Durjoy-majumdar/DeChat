package l53;

import b63.C67199q0;
import b63.C67205s0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82385f3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import vt1.C78473a;
import y43.C79029b0;

/* renamed from: l53.a */
public class C76670a {
    /* renamed from: a */
    public static boolean m92323a() {
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        if (aVar == null) {
            Log.m105928w("MicroMsg.WalletUtil", "no finger mgr!");
            return false;
        }
        C67205s0 wx02 = C79029b0.vx0().wx0();
        C67199q0 p = wx02.mo91334p();
        C115669n.INSTANCE.mo175911u(C82385f3.CTRL_INDEX, 0);
        Log.m105925i("MicroMsg.WalletUtil", "support faceid: %s, %s, %s", Boolean.valueOf(aVar.Fk0()), Boolean.valueOf(p.mo91308h()), Boolean.valueOf(wx02.mo91341w()));
        return aVar.Fk0() && p.mo91308h() && wx02.mo91341w();
    }

    /* renamed from: b */
    public static boolean m92324b() {
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        StringBuilder sb = new StringBuilder();
        sb.append("mgr==null?");
        sb.append(aVar == null);
        Log.m105924i("MicroMsg.WalletUtil", sb.toString());
        if (aVar != null) {
            Log.m105924i("MicroMsg.WalletUtil", " mgr.isSupportAndLoadSuccess()=" + aVar.mo107921ys());
        }
        C67205s0 wx02 = C79029b0.vx0().wx0();
        C67199q0 p = wx02.mo91334p();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("config==null?");
        sb4.append(p == null);
        Log.m105924i("MicroMsg.WalletUtil", sb4.toString());
        if (p != null) {
            Log.m105924i("MicroMsg.WalletUtil", "config.isSupportTouchPay()=" + p.mo91308h());
        }
        Log.m105924i("MicroMsg.WalletUtil", "userInfoManger.isReg()=" + wx02.mo91341w());
        return aVar != null && aVar.mo107921ys() && p != null && p.mo91308h() && wx02.mo91341w();
    }
}
