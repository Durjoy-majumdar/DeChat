package e73;

import com.tencent.p014mm.plugin.walletlock.model.C106559h;
import com.tencent.p014mm.plugin.walletlock.model.C106560i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import e73.C107248e;
import f40.C86709a0;
import lt3.C21460a;
import ob0.C11385n;
import ob0.C117747y;
import p602ly.C109440d;
import pv2.C77292s;
import rt3.C22252b;
import tt3.C22551c;
import tt3.C22553e;
import tt3.C64998b;
import xb3.C15635h;

/* renamed from: e73.c */
public class C107245c implements C107248e, C11385n {

    /* renamed from: d */
    public C107248e.C107249a f320887d = null;

    /* renamed from: e */
    public C107248e.C107249a f320888e = null;

    /* renamed from: f */
    public String f320889f = null;

    /* renamed from: g */
    public boolean f320890g = false;

    /* renamed from: h */
    public boolean f320891h = false;

    /* renamed from: e73.c$a */
    public class C107246a implements C64998b<C22551c> {
        public C107246a() {
        }

        /* renamed from: a */
        public void mo24821a(C22553e eVar) {
            C22551c cVar = (C22551c) eVar;
            Log.m105925i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepareAuthKey onResult errCode: %d, errMsg: %s, isCancelled: %b", Integer.valueOf(cVar.f61886a), cVar.f61887b, Boolean.valueOf(C107245c.this.f320891h));
            if (!C107245c.this.f320891h) {
                if (cVar.mo34909a()) {
                    Log.m105924i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo update wallet lock auth key success");
                    C107248e.C107249a aVar = C107245c.this.f320887d;
                    if (aVar != null) {
                        aVar.mo157720n(0, "prepare auth key ok");
                    }
                    C77292s.m93120g(0);
                    return;
                }
                Log.m105920e("MicroMsg.FingerprintLockOpenDelegate", "alvinluo error when prepare auth key");
                String str = cVar.f61887b;
                int i = cVar.f61886a;
                if (i == 1003) {
                    str = C77292s.f225403b;
                } else if (i == 1004) {
                    str = C77292s.f225404c;
                }
                C15635h.f42265a.mo14380a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "2", String.valueOf(i), str);
                C106560i.m143896b(2, cVar.f61886a, 1);
                C107248e.C107249a aVar2 = C107245c.this.f320887d;
                if (aVar2 != null) {
                    aVar2.mo157720n(2, cVar.f61887b);
                }
                if (cVar.f61886a == 1004) {
                    C22252b.m25809f(3);
                    int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SOTER_UPLOAD_AK_FAILURE_INT_SYNC, 0)).intValue() + 1;
                    C77292s.m93120g(intValue);
                    if (intValue >= 2) {
                        Log.m105928w("MicroMsg.FingerprintLockOpenDelegate", "remove ask");
                        C21460a.m24283q();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo157719a(boolean z) {
        Class cls = C109440d.class;
        Log.m105925i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo prepareAuthKey isNeedChangeAuthKey: %b", Boolean.valueOf(z));
        C22252b.m25808e(new C107246a(), z, true, 3, this.f320890g ? null : ((C109440d) C86312j.m106911c(cls)).mo160183nL(this.f320889f), ((C109440d) C86312j.m106911c(cls)).mo160185zp());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.FingerprintLockOpenDelegate", "alvinluo fingerprint wallet lock open delegate errType: %d, errCode: %d, errMsg: %s, cgi type: %d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
        if (!this.f320891h) {
            if (yVar instanceof C45551f) {
                if (i == 0 && i2 == 0) {
                    C45551f fVar = (C45551f) yVar;
                    C106559h.instance.f318381d = fVar.f123222f;
                    mo157719a(fVar.f123223g);
                    return;
                }
                C107248e.C107249a aVar = this.f320887d;
                if (aVar != null) {
                    aVar.mo157720n(7, "get challenge failed");
                }
            } else if (!(yVar instanceof C45552g)) {
            } else {
                if (i == 0 && i2 == 0) {
                    C106560i.m143895a(true);
                    C107248e.C107249a aVar2 = this.f320888e;
                    if (aVar2 != null) {
                        aVar2.mo157720n(0, "open touch lock ok");
                        return;
                    }
                    return;
                }
                C22252b.m25809f(3);
                C106560i.m143895a(false);
                C107248e.C107249a aVar3 = this.f320888e;
                if (aVar3 != null) {
                    aVar3.mo157720n(6, "open touch lock failed");
                }
            }
        }
    }
}
