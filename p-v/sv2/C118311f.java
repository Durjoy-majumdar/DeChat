package sv2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.sport.model.C115758a;
import com.tencent.p014mm.plugin.sport.model.C115762b;
import com.tencent.p014mm.plugin.sport.model.C115769k;
import com.tencent.p014mm.plugin.sport.model.C115775n;
import com.tencent.p014mm.plugin.sport.model.C115778q;
import com.tencent.p014mm.plugin.sport.model.C85480l;
import com.tencent.p014mm.plugin.sport.model.PushSportStepDetector;
import com.tencent.p014mm.plugin.sport.model.SportForegroundService;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.ConfigFileStorageProxyMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import kj2.C117407d;
import tv2.C37281a;
import zt3.C119157j;

@C86522b(dependencies = {C85597u.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_PUSH})
/* renamed from: sv2.f */
public class C118311f extends C86301e implements C36848d {

    /* renamed from: d */
    public final C115758a[] f353587d = {null};

    /* renamed from: e */
    public final C115762b[] f353588e = {null};

    /* renamed from: f */
    public C115769k.C115773c f353589f = new C118312a();

    /* renamed from: g */
    public PushSportStepDetector f353590g;

    /* renamed from: h */
    public BroadcastReceiver f353591h = new C118313b();

    /* renamed from: sv2.f$a */
    public class C118312a implements C115769k.C115773c {
        public C118312a() {
        }
    }

    /* renamed from: sv2.f$b */
    public class C118313b extends BroadcastReceiver {

        /* renamed from: sv2.f$b$a */
        public class C118314a implements Runnable {
            public C118314a() {
            }

            public void run() {
                C117407d.INSTANCE.idkeyStat(625, 3, 1, false);
                if (C115778q.m162832a(MMApplicationContext.getContext()) && C115778q.m162836e()) {
                    C115758a vx02 = C118311f.this.vx0();
                    long a = vx02.mo176114a();
                    Log.m105925i("MicroMsg.Sport.DeviceStepManager", "forceUploadDeviceStep %d", Long.valueOf(a));
                    vx02.mo176117d(a);
                }
            }
        }

        public C118313b() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("com.tencent.mm.plugin.sport.uploadstep".equals(intent.getAction()) && C86709a0.m107522a()) {
                ((C119157j) C119157j.f356862d).mo183876g(new C118314a(), "UploadSportStepEventHandle");
            }
        }
    }

    public void onAccountInitialized(Context context) {
        vx0();
        wx0();
        C115769k.C115773c cVar = this.f353589f;
        C115769k.f347339d = cVar;
        C118312a aVar = (C118312a) cVar;
        aVar.getClass();
        if (C86709a0.m107522a()) {
            C118311f.this.vx0().mo176115b();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.plugin.sport.uploadstep");
        MMApplicationContext.getContext().registerReceiver(this.f353591h, intentFilter);
        C68070l.C68074c.f195661a.add(new C118310e(this));
        if (C86709a0.m107522a()) {
            ((C118311f) C86312j.m106911c(C118311f.class)).vx0().mo176116c(C115769k.m162824c().toString());
        }
    }

    public void onAccountReleased(Context context) {
        MMApplicationContext.getContext().unregisterReceiver(this.f353591h);
        C115769k.f347339d = null;
        synchronized (this.f353587d) {
            C115758a aVar = this.f353587d[0];
            if (aVar != null) {
                aVar.f347311a.mo176122b();
                if (aVar.f347313c != null) {
                    C86709a0.m107524d().mo123458d(aVar.f347313c);
                }
                this.f353587d[0] = null;
            }
        }
        synchronized (this.f353588e) {
            C115762b bVar = this.f353588e[0];
            if (bVar != null) {
                if (bVar.f347318b != null) {
                    C86709a0.m107524d().mo123458d(bVar.f347318b);
                }
                this.f353588e[0] = null;
            }
        }
    }

    public void onCreate(Context context) {
        C85480l lVar;
        C85480l lVar2;
        if (MMApplicationContext.isPushProcess()) {
            C115775n nVar = C115775n.f347342a;
            String str = C37281a.f98631a;
            if (C86013q1.m106450k(str)) {
                try {
                    lVar2 = new C85480l(str);
                } catch (OutOfMemoryError e) {
                    Log.printErrStackTrace("MicroMsg.Sport.SportKvStorage", e, "", new Object[0]);
                    String str2 = C37281a.f98631a;
                    C86013q1.m106447h(str2);
                    lVar2 = new C85480l(str2);
                }
                C115775n.C115776a aVar = new C115775n.C115776a();
                aVar.f347344a = lVar2.mo118846d(202, 0) * ((long) 10000);
                aVar.f347349f = lVar2.mo118846d(201, 0);
                aVar.f347348e = lVar2.mo118846d(203, 0);
                aVar.f347345b = lVar2.mo118846d(204, 0);
                aVar.f347347d = lVar2.mo118846d(209, 0);
                aVar.f347350g = aVar.f347349f;
                aVar.f347346c = aVar.f347345b;
                nVar.mo176130c().encode("KEY_STEP_DETAIL_INFO", aVar.toString());
                String str3 = C37281a.f98631a;
                C86013q1.m106447h(str3);
                Log.m105924i("MicroMsg.Sport.SportKvStorage", "compat first file:" + str3 + " detailInfo:" + aVar);
            }
            String str4 = C37281a.f98632b;
            if (C86013q1.m106450k(str4)) {
                try {
                    lVar = new C85480l(str4);
                } catch (OutOfMemoryError e2) {
                    Log.printErrStackTrace("MicroMsg.Sport.SportKvStorage", e2, "", new Object[0]);
                    String str5 = C37281a.f98632b;
                    C86013q1.m106447h(str5);
                    lVar = new C85480l(str5);
                }
                String str6 = "";
                synchronized (lVar) {
                    if (lVar.mo119668i()) {
                        ConfigFileStorageProxyMMKV configFileStorageProxyMMKV = lVar.f249888i;
                        if (configFileStorageProxyMMKV.mo119638c(301, str6) instanceof String) {
                            str6 = (String) configFileStorageProxyMMKV.mo119638c(301, str6);
                        }
                    } else {
                        try {
                            Object a = lVar.mo119660a(301);
                            if (a instanceof String) {
                                String str7 = (String) a;
                                str6 = str7;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                C115775n.C115776a aVar2 = new C115775n.C115776a();
                C87412m.m108593f(str6, "info");
                aVar2.mo176133a(str6);
                nVar.mo176130c().encode("KEY_STEP_DETAIL_INFO", aVar2.toString());
                String str8 = C37281a.f98632b;
                C86013q1.m106447h(str8);
                Log.m105924i("MicroMsg.Sport.SportKvStorage", "compat second file:" + str8 + " detailInfo:" + aVar2);
            }
        }
        if (!MMApplicationContext.isMainProcess() && MMApplicationContext.isPushProcess()) {
            SportForegroundService.m105485b();
        }
    }

    public C115758a vx0() {
        if (this.f353587d[0] == null && C86709a0.m107522a()) {
            synchronized (this.f353587d) {
                C115758a[] aVarArr = this.f353587d;
                if (aVarArr[0] == null) {
                    aVarArr[0] = new C115758a();
                }
            }
        }
        return this.f353587d[0];
    }

    public C115762b wx0() {
        if (this.f353588e[0] == null && C86709a0.m107522a()) {
            synchronized (this.f353588e) {
                C115762b[] bVarArr = this.f353588e;
                if (bVarArr[0] == null) {
                    bVarArr[0] = new C115762b();
                }
            }
        }
        return this.f353588e[0];
    }

    public PushSportStepDetector xx0() {
        if (MMApplicationContext.isPushProcess() && this.f353590g == null) {
            this.f353590g = new PushSportStepDetector();
        }
        return this.f353590g;
    }
}
