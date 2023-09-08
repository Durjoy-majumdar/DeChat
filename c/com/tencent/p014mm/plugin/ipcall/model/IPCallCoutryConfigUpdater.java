package com.tencent.p014mm.plugin.ipcall.model;

import a70.C112760b;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117747y;
import p216op.C47389f;
import uc0.C52521t;
import uc0.C52522u;
import uc0.C52523w;
import uc0.C52524x;

/* renamed from: com.tencent.mm.plugin.ipcall.model.IPCallCoutryConfigUpdater */
public class IPCallCoutryConfigUpdater implements C11385n {

    /* renamed from: g */
    public static IPCallCoutryConfigUpdater f114945g;

    /* renamed from: d */
    public int f114946d = 0;

    /* renamed from: e */
    public boolean f114947e = false;

    /* renamed from: f */
    public IListener f114948f = new IListener<DynamicConfigUpdatedEvent>(C40008f.f107254d) {
        {
            this.__eventId = -443124368;
        }

        public boolean callback(IEvent iEvent) {
            if (((DynamicConfigUpdatedEvent) iEvent) instanceof DynamicConfigUpdatedEvent) {
                Log.m105918d("MicroMsg.IPCallCoutryConfigUpdater", "detect DynamicConfigUpdatedEvent");
                C85801v1 u = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_IPCALL_COUNTRY_CODE_RESTRCTION_INT;
                int intValue = ((Integer) u.mo119685f(aVar, 0)).intValue();
                int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WeChatOutCountryCodeRestrictionPackageID", 0);
                Log.m105919d("MicroMsg.IPCallCoutryConfigUpdater", "oldConfig: %d, newConfig: %d", Integer.valueOf(intValue), Integer.valueOf(b));
                if (intValue != b) {
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, Integer.valueOf(b));
                    ((C52524x) ((C47389f) C86312j.m106911c(C47389f.class)).mo72331SU()).mo73460Lo(26);
                    C42464d a = C42464d.m46136a();
                    a.getClass();
                    String str = C112760b.m154225d() + "ipcallCountryCodeConfig.cfg";
                    Log.m105919d("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, path: %s", str);
                    try {
                        C86009m1 m1Var = new C86009m1(str);
                        if (m1Var.mo119967g()) {
                            m1Var.mo119966f();
                        }
                        a.f114953c = false;
                        a.f114952b.clear();
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, error: %s", e.getMessage());
                    }
                    IPCallCoutryConfigUpdater.this.mo66545d(true);
                }
            }
            return false;
        }
    };

    /* renamed from: a */
    public static IPCallCoutryConfigUpdater m46132a() {
        if (f114945g == null) {
            f114945g = new IPCallCoutryConfigUpdater();
        }
        return f114945g;
    }

    /* renamed from: b */
    public final void mo66543b() {
        this.f114947e = false;
        this.f114946d = 0;
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_IPCALL_COUNTRY_CODE_LASTUPDATE_TIME_LONG, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: c */
    public final void mo66544c() {
        C52523w[] bD = ((C52524x) ((C47389f) C86312j.m106911c(C47389f.class)).mo72331SU()).mo73465bD(26);
        C97625j3.m125815e().mo123460f(new C52522u(26, bD != null && bD.length > 0));
    }

    /* renamed from: d */
    public void mo66545d(boolean z) {
        if (!C97625j3.m125811a()) {
            Log.m105924i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, acc not ready");
        } else if (this.f114947e) {
            Log.m105924i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate updating");
        } else {
            Log.m105919d("MicroMsg.IPCallCoutryConfigUpdater", "tryupdate, isForce: %b", Boolean.valueOf(z));
            if (!z) {
                long longValue = ((Long) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_IPCALL_COUNTRY_CODE_LASTUPDATE_TIME_LONG, 0L)).longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (longValue != 0 && Math.abs(currentTimeMillis - longValue) < 86400000) {
                    Log.m105924i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, not reach the update time limit");
                    return;
                }
            }
            Log.m105924i("MicroMsg.IPCallCoutryConfigUpdater", "try update now");
            this.f114947e = true;
            C97625j3.m125815e().mo123455a(159, this);
            C97625j3.m125815e().mo123455a(160, this);
            mo66544c();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105919d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, errType: %d, errCode: %d, isUpdating: %b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.f114947e));
        if (this.f114947e) {
            boolean z = i == 0 || i2 == 0;
            Log.m105919d("MicroMsg.IPCallCoutryConfigUpdater", "onSceneEnd, isSuccess: %b", Boolean.valueOf(z));
            if (yVar.getType() == 159) {
                if (z) {
                    Log.m105918d("MicroMsg.IPCallCoutryConfigUpdater", "get package list success, start download");
                    C52523w[] bD = ((C52524x) ((C47389f) C86312j.m106911c(C47389f.class)).mo72331SU()).mo73465bD(26);
                    if (bD == null || bD.length == 0) {
                        Log.m105918d("MicroMsg.IPCallCoutryConfigUpdater", "do not exist package info");
                        mo66543b();
                        return;
                    }
                    Log.m105919d("MicroMsg.IPCallCoutryConfigUpdater", "infos.length: %d", Integer.valueOf(bD.length));
                    C52523w wVar = bD[0];
                    Object[] objArr = new Object[5];
                    objArr[0] = Integer.valueOf(wVar.f146702g);
                    objArr[1] = Integer.valueOf(wVar.f146696a);
                    objArr[2] = Integer.valueOf(wVar.f146697b);
                    objArr[3] = Integer.valueOf(wVar.f146701f);
                    String str2 = wVar.f146700e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    objArr[4] = str2;
                    Log.m105919d("MicroMsg.IPCallCoutryConfigUpdater", "stored info type: %d, id: %d, version: %d, status: %d, name: %s", objArr);
                    int i3 = wVar.f146701f;
                    if (i3 == 3) {
                        Log.m105918d("MicroMsg.IPCallCoutryConfigUpdater", "downloading this package, ignore");
                    } else if (i3 != 5) {
                        Log.m105918d("MicroMsg.IPCallCoutryConfigUpdater", "already download this package");
                        C42464d.m46136a().mo66546b(true);
                        mo66543b();
                    } else {
                        C97625j3.m125815e().mo123460f(new C52521t(wVar.f146696a, 26));
                    }
                } else {
                    int i4 = this.f114946d;
                    if (i4 < 3) {
                        this.f114946d = i4 + 1;
                        mo66544c();
                        Log.m105919d("MicroMsg.IPCallCoutryConfigUpdater", "retry get package list, retryCount: %d", Integer.valueOf(this.f114946d));
                        return;
                    }
                    Log.m105920e("MicroMsg.IPCallCoutryConfigUpdater", "reach retry limit");
                }
            } else if (yVar.getType() == 160 && z) {
                Log.m105918d("MicroMsg.IPCallCoutryConfigUpdater", "download package success");
                C42464d.m46136a().mo66546b(true);
                mo66543b();
            }
        }
    }
}
