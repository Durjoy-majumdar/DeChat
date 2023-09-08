package wl0;

import android.content.ComponentName;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import hr0.C87584b;
import java.util.ArrayList;
import java.util.List;
import js0.C88024r;
import p224ra.C89909e;
import xl0.C91280a;
import xl0.C91281b;

/* renamed from: wl0.h */
public class C91030h {

    /* renamed from: l */
    public static final byte[] f261167l = {0, 0};

    /* renamed from: m */
    public static long f261168m = -1;

    /* renamed from: n */
    public static C91030h f261169n;

    /* renamed from: a */
    public String f261170a = null;

    /* renamed from: b */
    public ArrayList<String> f261171b;

    /* renamed from: c */
    public int f261172c;

    /* renamed from: d */
    public boolean f261173d = false;

    /* renamed from: e */
    public boolean f261174e = true;

    /* renamed from: f */
    public boolean f261175f = false;

    /* renamed from: g */
    public boolean f261176g = false;

    /* renamed from: h */
    public C91280a f261177h = new C91032b((C91031a) null);

    /* renamed from: i */
    public C91281b f261178i = new C91033c((C91031a) null);

    /* renamed from: j */
    public ResultReceiver f261179j;

    /* renamed from: k */
    public HostApduService f261180k;

    /* renamed from: wl0.h$b */
    public class C91032b implements C91280a {
        public C91032b(C91031a aVar) {
        }
    }

    /* renamed from: wl0.h$c */
    public class C91033c implements C91281b {
        public C91033c(C91031a aVar) {
        }
    }

    static {
        f261169n = null;
        f261169n = new C91030h();
    }

    /* renamed from: a */
    public static void m114195a(C91030h hVar, byte[] bArr, boolean z, HostApduService hostApduService) {
        synchronized (hVar) {
            Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND sendResponseCommandToSystem isDefaultCommand: %b, hasCommandNotResponded: %b", Boolean.valueOf(z), Boolean.valueOf(hVar.f261174e));
            if (hVar.f261174e) {
                hVar.f261174e = false;
                long currentTimeMillis = System.currentTimeMillis();
                Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND send response command time: %d, cost: %d", Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis - f261168m));
                if (hostApduService != null) {
                    hostApduService.sendResponseApdu(bArr);
                } else {
                    Log.m105920e("MicroMsg.HCEServiceMgr", "alvinluo sendResponseCommandToSystem hceService is null");
                }
                if (z) {
                    String str = hVar.f261170a;
                    Log.m105925i("MicroMsg.HCEReportManager", "alvinluo reportHCEtimeExceeded appId: %s", str);
                    ((C87584b) C89909e.m112439d(C87584b.class, true)).kvStat(14838, str);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo125083b(Intent intent) {
        int intExtra = intent.getIntExtra("key_time_limit", 1500);
        this.f261172c = intExtra;
        if (intExtra < 1500) {
            Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo HCEService timeLimit: %d smaller than: %d and set a valid value", Integer.valueOf(intExtra), 1500);
            this.f261172c = 1500;
        }
        int i = this.f261172c;
        if (i > 60000) {
            Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo HCEService timeLimit: %d, bigger than: %d and set a valid value", Integer.valueOf(i), Integer.valueOf(CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
            this.f261172c = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        }
        Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo HCEService valid timeLimit: %d", Integer.valueOf(this.f261172c));
    }

    /* renamed from: c */
    public void mo125084c(int i, String str, Bundle bundle) {
        Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo genCallHCEService type = %d", Integer.valueOf(i));
        if (i == 13) {
            mo125088g();
            HostApduService hostApduService = this.f261180k;
            if (hostApduService != null) {
                hostApduService.stopSelf();
            }
        } else if (i != 31) {
            if (i != 32) {
                switch (i) {
                    case 21:
                        C91281b bVar = this.f261178i;
                        if (bVar != null) {
                            ((C91033c) bVar).getClass();
                            Log.m105924i("MicroMsg.HCEServiceMgr", "alvinluo HCELifeCycle AppBrandUI onCreate");
                            return;
                        }
                        return;
                    case 22:
                        C91281b bVar2 = this.f261178i;
                        if (bVar2 != null) {
                            C91033c cVar = (C91033c) bVar2;
                            cVar.getClass();
                            Log.m105924i("MicroMsg.HCEServiceMgr", "alvinluo HCELifeCycle AppBrandUI onResume");
                            C91030h hVar = C91030h.this;
                            if (hVar.f261173d) {
                                hVar.mo125086e();
                                C91030h.this.f261173d = false;
                                return;
                            }
                            return;
                        }
                        return;
                    case 23:
                        C91281b bVar3 = this.f261178i;
                        if (bVar3 != null) {
                            C91033c cVar2 = (C91033c) bVar3;
                            cVar2.getClass();
                            Log.m105924i("MicroMsg.HCEServiceMgr", "alvinluo HCELifeCycle AppBrandUI onPause");
                            C91030h.this.mo125088g();
                            C91030h.this.f261173d = true;
                            return;
                        }
                        return;
                    case 24:
                        C91281b bVar4 = this.f261178i;
                        if (bVar4 != null) {
                            ((C91033c) bVar4).getClass();
                            Log.m105924i("MicroMsg.HCEServiceMgr", "alvinluo HCELifeCycle AppBrandUI onDestroy");
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else if (this.f261177h != null) {
                String string = bundle.getString("key_apdu_command");
                C91032b bVar5 = (C91032b) this.f261177h;
                String str2 = C91030h.this.f261170a;
                if (str2 == null || !str2.equals(str) || Util.isNullOrNil(string)) {
                    Log.m105921e("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND not the same appId, or invalid response command, mAppId: %s, appId: %s, responseCommand: %s", C91030h.this.f261170a, str, string);
                    return;
                }
                byte[] decode = Base64.decode(string, 2);
                Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND response from AppBrand, appId: %s, command in base64: %s, send to system: %s, hasCommandNotResponded: %b", str, string, C53186j.m59593a(decode), Boolean.valueOf(C91030h.this.f261174e));
                C91030h hVar2 = C91030h.this;
                m114195a(hVar2, decode, false, hVar2.f261180k);
            }
        } else if (this.f261177h != null) {
            String string2 = bundle.getString("key_apdu_command");
            C91032b bVar6 = (C91032b) this.f261177h;
            bVar6.getClass();
            Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND send to AppBrand, appId: %s, command: %s", str, string2);
            if (Util.isNullOrNil(str) || Util.isNullOrNil(string2)) {
                Log.m105920e("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND invalid appId or command when send request command to AppBrand");
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("key_apdu_command", string2);
            C91030h.this.mo125087f(str, 31, bundle2);
            C91030h hVar3 = C91030h.this;
            hVar3.f261174e = true;
            if (!hVar3.f261175f) {
                hVar3.f261175f = true;
                hVar3.f261176g = false;
                f261168m = System.currentTimeMillis();
                C88024r.m109571a().mo122468a(new C91034i(bVar6), (long) C91030h.this.f261172c);
            } else if (hVar3.f261176g) {
                Log.m105928w("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND TimeExceeded, just return default command");
                C91030h hVar4 = C91030h.this;
                m114195a(hVar4, f261167l, true, hVar4.f261180k);
                C91030h.this.f261176g = false;
            }
        }
    }

    /* renamed from: d */
    public void mo125085d(boolean z) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putInt("errCode", 0);
            bundle.putString("errMsg", "");
        } else {
            bundle.putInt("errCode", 13006);
            bundle.putString("errMsg", "register aids failed");
        }
        mo125087f(this.f261170a, 12, bundle);
    }

    /* renamed from: e */
    public void mo125086e() {
        HostApduService hostApduService;
        if (this.f261171b == null || (hostApduService = this.f261180k) == null) {
            Log.m105920e("MicroMsg.HCEServiceMgr", "alvinluo mAidList is null, or mHceService is null fail to register");
            return;
        }
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(hostApduService);
        if (defaultAdapter == null) {
            Log.m105920e("MicroMsg.HCEServiceMgr", "alvinluo NfcAdapter is null when register aids");
            return;
        }
        CardEmulation instance = CardEmulation.getInstance(defaultAdapter);
        if (instance != null) {
            try {
                HostApduService hostApduService2 = this.f261180k;
                ComponentName componentName = new ComponentName(hostApduService2, hostApduService2.getClass());
                boolean registerAidsForService = instance.registerAidsForService(componentName, "payment", this.f261171b);
                Log.m105925i("MicroMsg.HCEServiceMgr", "alvinluo register aids result: %b", Boolean.valueOf(registerAidsForService));
                if (registerAidsForService) {
                    mo125085d(true);
                    List<String> aidsForService = instance.getAidsForService(componentName, "payment");
                    if (aidsForService != null && aidsForService.size() > 0) {
                        for (int i = 0; i < aidsForService.size(); i++) {
                            Log.m105920e("MicroMsg.HCEServiceMgr", "dynamicAIDList aid=" + aidsForService.get(i));
                        }
                        return;
                    }
                    return;
                }
                mo125085d(false);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.HCEServiceMgr", e, "alvinluo HCEService register aid exception", new Object[0]);
                mo125085d(false);
            }
        }
    }

    /* renamed from: f */
    public void mo125087f(String str, int i, Bundle bundle) {
        bundle.putString("key_appid", str);
        bundle.putInt("key_event_type", i);
        Log.m105924i("MicroMsg.HCEServiceMgr", "alvinluo HCE EVENT mm to AppBrand");
        ResultReceiver resultReceiver = this.f261179j;
        if (resultReceiver != null) {
            resultReceiver.send(10002, bundle);
        }
    }

    /* renamed from: g */
    public void mo125088g() {
        CardEmulation instance;
        HostApduService hostApduService = this.f261180k;
        if (hostApduService == null) {
            Log.m105920e("MicroMsg.HCEServiceMgr", "alvinluo mHceService is null fail to unregisterAids");
            return;
        }
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(hostApduService);
        if (defaultAdapter != null && (instance = CardEmulation.getInstance(defaultAdapter)) != null) {
            HostApduService hostApduService2 = this.f261180k;
            ComponentName componentName = new ComponentName(hostApduService2, hostApduService2.getClass());
            Log.m105924i("MicroMsg.HCEServiceMgr", "alvinluo HCEService unregister aids");
            instance.removeAidsForService(componentName, "payment");
        }
    }
}
