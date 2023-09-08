package lv2;

import com.tencent.p014mm.autogen.events.OnSoterInitializedEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import p156gj.C87203t;
import p591ky.C34120h;
import pv2.C110259i;
import pv2.C110260j;
import pv2.C35701m;
import pv2.C77292s;
import qv2.C110476d;

/* renamed from: lv2.b */
public class C34383b implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C34385c f92601d;

    /* renamed from: lv2.b$a */
    public class C34384a implements C35701m {
        public C34384a(C34383b bVar) {
        }

        /* renamed from: n */
        public void mo59577n(int i, String str) {
            Log.m105925i("MicroMsg.PluginSoter", "init finish: %s, %s", Integer.valueOf(i), str);
            OnSoterInitializedEvent onSoterInitializedEvent = new OnSoterInitializedEvent();
            OnSoterInitializedEvent.C28786a aVar = onSoterInitializedEvent.f78887d;
            aVar.f78888a = i;
            aVar.f78889b = str;
            onSoterInitializedEvent.publish();
        }
    }

    public C34383b(C34385c cVar) {
        this.f92601d = cVar;
    }

    public boolean onTimerExpired() {
        boolean z;
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105924i("MicroMsg.PluginSoter", "account not ready.");
            return false;
        }
        String str = ((C34120h) C86312j.m106911c(C34120h.class)).f92053d;
        String b = !Util.isNullOrNil(str) ? str : C75592q0.m90772b();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_LAST_USERNAME_STRING_SYNC;
        String str2 = (String) i.mo119685f(aVar, "");
        Log.m105925i("MicroMsg.PluginSoter", "username old: %s, new: %s, %s", str2, b, str);
        if (!Util.isNullOrNil(b) || this.f92601d.f92602d >= 10) {
            if (!Util.isNullOrNil(str2) && !str2.equals(b)) {
                Log.m105925i("MicroMsg.PluginSoter", "have changed username, old: %s, new: %s", str2, b);
                C77292s.f225402a = str2;
            } else if (Util.isNullOrNil(str2)) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, b);
                C77292s.f225402a = b;
            } else {
                C77292s.f225402a = b;
            }
            Log.m105925i("MicroMsg.PluginSoter", "do init soter: %s, %s, %s", Integer.valueOf(this.f92601d.f92602d), b, C77292s.f225402a);
            int i2 = this.f92601d.f92602d;
            if (i2 >= 10) {
                C115669n.INSTANCE.mo175911u(1104, 44);
            } else if (i2 > 0) {
                C115669n.INSTANCE.mo175911u(1104, 45);
            } else {
                C115669n.INSTANCE.mo175911u(1104, 47);
            }
            this.f92601d.getClass();
            C110260j a = C110259i.m149874a();
            if (!(!Util.isNullOrNil(a.f329808a) && !Util.isNullOrNil(a.f329809b))) {
                String k = C87203t.m108275k();
                if (!("NCE-AL10".equals(k) || "NCE-AL00".equals(k) || "NCE-TL10".equals(k))) {
                    z = true;
                    C110476d.m150375a(z, true, new C34384a(this));
                    return false;
                }
            }
            z = false;
            C110476d.m150375a(z, true, new C34384a(this));
            return false;
        }
        Log.m105924i("MicroMsg.PluginSoter", "username is null, delay init");
        this.f92601d.f92602d++;
        return true;
    }
}
