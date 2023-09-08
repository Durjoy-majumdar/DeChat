package kj1;

import ak1.C54067f0;
import ak1.C54108o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8777j5;
import o40.C61926c;
import qg1.C47826f;
import te3.C50415mk1;

/* renamed from: kj1.b */
public final class C10101b implements C47826f.C47827a {

    /* renamed from: a */
    public final /* synthetic */ C10125e1 f30904a;

    /* renamed from: b */
    public final /* synthetic */ SafeResume<Boolean> f30905b;

    public C10101b(C10125e1 e1Var, SafeResume<Boolean> safeResume) {
        this.f30904a = e1Var;
        this.f30905b = safeResume;
    }

    /* renamed from: a */
    public void mo9151a(int i, long j, C50415mk1 mk12) {
    }

    /* renamed from: b */
    public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
    }

    /* renamed from: c */
    public void mo9153c(int i, long j) {
        String str;
        C54067f0.C0062l lVar = C54067f0.C0062l.LIVING;
        Class cls = C54108o.class;
        String str2 = this.f30904a.f30980a;
        Log.m105924i(str2, "switchVisitorAnonymous-callBack-onSuccess anchorStatus" + i);
        if (C61926c.m72696u(i, 8192)) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.HIDE_AUDIENCE_NICKNAME, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar), (String) null, 4, (Object) null);
            str = this.f30904a.f30985d.getResources().getString(C0966R.string.dwy);
        } else {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c2, C54067f0.C0064m.SHOW_AUDIENCE_NICKNAME, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar), (String) null, 4, (Object) null);
            str = this.f30904a.f30985d.getResources().getString(C0966R.string.dwq);
        }
        C87412m.m108593f(str, "if (enable) {\n          …s_done)\n                }");
        this.f30905b.resume(Boolean.TRUE);
    }

    /* renamed from: d */
    public void mo9154d(int i, int i2, String str, int i3) {
        String str2 = this.f30904a.f30980a;
        Log.m105924i(str2, "switchVisitorAnonymous-callBack-onFail anchorStatus" + i3 + ", errType=" + i + " errCode=" + i2 + " errMsg=" + str);
        this.f30905b.resume(Boolean.FALSE);
    }
}
