package lv2;

import android.content.Context;
import android.os.CancellationSignal;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.xweb.WCWebUpdater;
import f40.C86709a0;
import lt3.C21460a;
import mv2.C47106h;
import ob0.C117747y;
import p623nr.C76956i;
import pv2.C77290d;
import pv2.C77292s;
import rt3.C22252b;
import st3.C110812b;
import st3.C22395a;
import tt3.C22550a;
import tt3.C22551c;
import tt3.C22553e;
import tt3.C64998b;
import xb3.C15635h;
import xt3.C53448e;
import yt3.C112484b;

/* renamed from: lv2.e */
public class C109427e implements C76956i {

    /* renamed from: a */
    public C22395a f327555a;

    /* renamed from: b */
    public C109430c f327556b;

    /* renamed from: c */
    public C109429b f327557c;

    /* renamed from: lv2.e$a */
    public class C109428a implements C64998b<C22551c> {

        /* renamed from: a */
        public final /* synthetic */ C76956i.C76959c f327558a;

        /* renamed from: b */
        public final /* synthetic */ int f327559b;

        /* renamed from: c */
        public final /* synthetic */ C53448e f327560c;

        /* renamed from: d */
        public final /* synthetic */ boolean f327561d;

        /* renamed from: e */
        public final /* synthetic */ int f327562e;

        public C109428a(C76956i.C76959c cVar, int i, C53448e eVar, boolean z, int i2) {
            this.f327558a = cVar;
            this.f327559b = i;
            this.f327560c = eVar;
            this.f327561d = z;
            this.f327562e = i2;
        }

        /* renamed from: a */
        public void mo24821a(C22553e eVar) {
            C22551c cVar = (C22551c) eVar;
            String str = cVar.f61887b;
            int i = cVar.f61886a;
            if (i == 1003) {
                str = C77292s.f225403b;
            } else if (i == 1004) {
                str = C77292s.f225404c;
            }
            Log.m105925i("MicroMsg.SoterManager", "prepare callback result: %s, %s", Integer.valueOf(i), cVar.f61887b);
            if (cVar.mo34909a()) {
                C77292s.m93120g(0);
                C76956i.C76959c cVar2 = this.f327558a;
                if (cVar2 != null) {
                    cVar2.mo107285c(cVar);
                }
            } else {
                int i2 = this.f327559b;
                if (i2 >= 2) {
                    C76956i.C76959c cVar3 = this.f327558a;
                    if (cVar3 != null) {
                        cVar3.mo107284b(cVar);
                    }
                    C15635h.f42265a.mo14380a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "2", String.valueOf(cVar.f61886a), str);
                } else {
                    if (i2 == 1) {
                        Log.m105928w("MicroMsg.SoterManager", "need remove ask");
                        C21460a.m24283q();
                    }
                    C76956i.C76959c cVar4 = this.f327558a;
                    if (cVar4 != null) {
                        cVar4.mo107283a(this.f327559b);
                    }
                    Log.m105925i("MicroMsg.SoterManager", "do prepare authkey retry: %s", Integer.valueOf(this.f327559b));
                    C53448e eVar2 = this.f327560c;
                    if (eVar2 instanceof C117747y) {
                        ((C117747y) eVar2).reset();
                    }
                    C109427e.this.mo160616d(this.f327558a, this.f327561d, this.f327562e, this.f327560c, this.f327559b + 1);
                }
                C77290d.m93105c(2, cVar.f61886a, 1);
            }
            int i3 = cVar.f61886a;
            int i4 = this.f327559b;
            C115669n.INSTANCE.mo160131h(17806, Integer.valueOf(i3), str, Integer.valueOf(i4));
        }
    }

    /* renamed from: lv2.e$b */
    public static class C109429b implements C110812b {

        /* renamed from: a */
        public C76956i.C76958b f327564a;

        /* renamed from: b */
        public int f327565b;

        public C109429b(C76956i.C76958b bVar, int i) {
            this.f327564a = bVar;
            this.f327565b = i;
        }
    }

    /* renamed from: lv2.e$c */
    public static class C109430c implements C64998b<C22550a> {

        /* renamed from: a */
        public C76956i.C76958b f327566a;

        /* renamed from: b */
        public int f327567b;

        public C109430c(C76956i.C76958b bVar, int i) {
            this.f327566a = bVar;
            this.f327567b = i;
        }

        /* renamed from: a */
        public void mo24821a(C22553e eVar) {
            C22550a aVar = (C22550a) eVar;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_SOTER_AUTHORIZE_FAILURE_INT_SYNC;
            int intValue = ((Integer) i.mo119685f(aVar2, 0)).intValue();
            Log.m105925i("MicroMsg.SoterManager", "request authorize result: %s, %s, %s", Integer.valueOf(aVar.f61886a), aVar.f61887b, Integer.valueOf(intValue));
            if (aVar.mo34909a()) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0);
                C76956i.C76958b bVar = this.f327566a;
                if (bVar != null) {
                    bVar.mo107280a(aVar);
                }
            } else {
                C15635h.f42265a.mo14380a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "3", String.valueOf(aVar.f61886a), aVar.f61887b);
                int i2 = aVar.f61886a;
                if (i2 == 1007 || i2 == 1027 || i2 == 1018) {
                    C22252b.m25809f(this.f327567b);
                    int i3 = intValue + 1;
                    if (i3 >= 2) {
                        Log.m105928w("MicroMsg.SoterManager", "authorize need remove ask");
                        C21460a.m24283q();
                    }
                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(i3));
                }
                C76956i.C76958b bVar2 = this.f327566a;
                if (bVar2 != null) {
                    bVar2.mo107282c(0, aVar);
                }
            }
            int i4 = aVar.f61886a;
            String str = aVar.f61887b;
            C115669n.INSTANCE.mo160131h(17805, Integer.valueOf(i4), str);
        }
    }

    /* renamed from: a */
    public void mo107276a(C76956i.C76958b bVar, Context context, int i, int i2, String str) {
        mo107278c(bVar, context, i, i2, str, (C76956i.C76957a) null);
    }

    /* renamed from: b */
    public void mo107277b(C76956i.C76959c cVar, boolean z, int i, C53448e eVar) {
        mo160616d(cVar, z, i, eVar, 0);
    }

    /* renamed from: c */
    public void mo107278c(C76956i.C76958b bVar, Context context, int i, int i2, String str, C76956i.C76957a aVar) {
        Log.m105925i("MicroMsg.SoterManager", "request authorize and sign: %s, %s, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (this.f327555a == null) {
            this.f327555a = new C22395a();
        }
        C22395a aVar2 = this.f327555a;
        aVar2.getClass();
        aVar2.f63495a = new CancellationSignal();
        C112484b bVar2 = new C112484b((C112484b.C112485a) null);
        bVar2.f336852d = i2;
        bVar2.f336849a = i;
        bVar2.f336851c = context;
        bVar2.f336860l = this.f327555a;
        bVar2.f336850b = str;
        if (aVar != null) {
            bVar2.f336857i = true;
            bVar2.f336853e = aVar.f224885a;
            bVar2.f336854f = aVar.f224886b;
            bVar2.f336855g = null;
            bVar2.f336856h = aVar.f224887c;
        }
        C109429b bVar3 = this.f327557c;
        if (bVar3 != null) {
            bVar3.f327564a = null;
        }
        C109429b bVar4 = new C109429b(bVar, i2);
        this.f327557c = bVar4;
        bVar2.f336861m = bVar4;
        C109430c cVar = this.f327556b;
        if (cVar != null) {
            cVar.f327566a = null;
        }
        C109430c cVar2 = new C109430c(bVar, i);
        this.f327556b = cVar2;
        C22252b.m25810g(cVar2, bVar2);
    }

    public void cancel() {
        Log.m105924i("MicroMsg.SoterManager", "cancel");
        C22395a aVar = this.f327555a;
        if (aVar != null) {
            aVar.mo35544a(true);
        }
        C109430c cVar = this.f327556b;
        if (cVar != null) {
            cVar.f327566a = null;
        }
        C109429b bVar = this.f327557c;
        if (bVar != null) {
            bVar.f327564a = null;
        }
    }

    /* renamed from: d */
    public final void mo160616d(C76956i.C76959c cVar, boolean z, int i, C53448e eVar, int i2) {
        Log.m105925i("MicroMsg.SoterManager", "prepare auth key internal: %s, %s, %s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
        C53448e eVar2 = eVar;
        C22252b.m25808e(new C109428a(cVar, i2, eVar2, z, i), z, true, i, eVar2, new C47106h());
    }
}
