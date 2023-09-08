package y43;

import android.content.Context;
import android.net.Uri;
import b63.C67205s0;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import di3.C86301e;
import di3.C86312j;
import e63.C75556b;
import ei3.C86522b;
import f40.C86709a0;
import i53.C76286a;
import p281yz.C79173v;
import t53.C77866b;
import yq3.C79143a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: y43.b0 */
public class C79029b0 extends C86301e {

    /* renamed from: d */
    public int f232043d = 0;

    /* renamed from: e */
    public int f232044e = 0;

    static {
        C79143a.m95769h("ForgotPwdProcess", C76286a.class);
        C79143a.m95769h("BindCardProcess", C77866b.class);
    }

    public C79029b0() {
        boolean z = false;
        Uri n = C116299g2.m163858n(C75556b.f221973a);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(l.mo177810a() ? l.f348991a.mo119948x(l.f348992b) : z)) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
    }

    public static C79029b0 vx0() {
        return (C79029b0) C86312j.m106911c(C79029b0.class);
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C86709a0.m107528h();
        this.f232043d = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(339975, 0)).intValue();
        C86709a0.m107528h();
        this.f232044e = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC, Boolean.FALSE);
    }

    public C67205s0 wx0() {
        return ((C79173v) C86312j.m106911c(C79173v.class)).Ex0();
    }
}
