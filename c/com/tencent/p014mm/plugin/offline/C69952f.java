package com.tencent.p014mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.offline.C69959k;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75105d;
import f40.C86709a0;
import id2.C76311p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import kd2.C76559f;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.tencent.mm.plugin.offline.f */
public class C69952f extends C69944a<C69945c> {

    /* renamed from: b */
    public String f201767b = "";

    /* renamed from: c */
    public C69959k.C69961c f201768c = new C69953a();

    /* renamed from: com.tencent.mm.plugin.offline.f$a */
    public class C69953a implements C69959k.C69961c {
        public C69953a() {
        }

        /* renamed from: a */
        public void mo96261a() {
            C69945c cVar;
            C69952f fVar = C69952f.this;
            if (fVar.f201762a != null) {
                for (int i = 0; i < ((ArrayList) fVar.f201762a).size(); i++) {
                    WeakReference weakReference = (WeakReference) ((ArrayList) fVar.f201762a).get(i);
                    if (!(weakReference == null || (cVar = (C69945c) weakReference.get()) == null)) {
                        cVar.mo96258C();
                    }
                }
            }
        }
    }

    public C69952f() {
        if (C69963m.wx0().Bx0() != null) {
            C69963m.wx0().Bx0().f201780g = this.f201768c;
        }
    }

    /* renamed from: a */
    public String mo96259a(int i, int i2, String str) {
        boolean z;
        String str2;
        String str3;
        int b = mo96260b();
        if (b > 0) {
            if (b < C69963m.xx0()) {
                Log.m105925i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount < %s", Integer.valueOf(C69963m.xx0()));
                C69963m.wx0().Bx0().mo96268c(2, 2);
            }
            String zx02 = C69963m.wx0().zx0(196617);
            if (TextUtils.isEmpty(zx02)) {
                Log.m105920e("MicroMsg.OfflineCodesMgr", "generateKey_V3 cn is null, the csr is not exist! cn:" + zx02);
                return "";
            }
            String g = C75105d.m90074e().mo104803g(zx02);
            if (TextUtils.isEmpty(g)) {
                C69963m.wx0().Bx0().mo96267b(1, 1);
                Log.m105924i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null");
                return "";
            }
            long j = 0;
            if (Util.isNullOrNil(g)) {
                z = false;
            } else {
                long parseLong = Long.parseLong(g);
                z = (4503599627370496L & parseLong) == 0;
                Log.m105919d("MicroMsg.WalletOfflineUtil", "is online code: %s, %s", Boolean.valueOf(z), Long.toBinaryString(parseLong));
            }
            C76559f.m92125u(z ? 2 : 1);
            C76559f.m92116l();
            if (g != null) {
                Log.m105925i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code length : %s ext_business_attach %s %s", Integer.valueOf(g.length()), str, g);
            }
            int i3 = b - 1;
            C76311p pVar = new C76311p(i3, i, i2, 0, str, z ? "1" : "0");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(pVar);
            Log.m105924i("MicroMsg.OfflineCodesMgr", "doNetSceneShowCode count " + i3);
            if (C76559f.m92114j(g)) {
                long longValue = Long.valueOf(g, 10).longValue();
                if (!z) {
                    if (!TextUtils.isEmpty(C76559f.f224085c)) {
                        str2 = C76559f.f224085c;
                    } else if (TextUtils.isEmpty(C76559f.f224085c)) {
                        str2 = C69963m.wx0().zx0(196656);
                        C76559f.f224085c = str2;
                    } else {
                        if (TextUtils.isEmpty(C76559f.f224085c)) {
                            Log.m105920e("MicroMsg.WalletOfflineUtil", "offline_card_list is null");
                        }
                        str2 = C76559f.f224085c;
                    }
                    LinkedList<C76559f.C76561b> linkedList = null;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            linkedList = C76559f.m92119o(new JSONArray(str2));
                        } catch (JSONException e) {
                            Log.printErrStackTrace("MicroMsg.WalletOfflineUtil", e, "", new Object[0]);
                        }
                    }
                    if (linkedList == null || linkedList.size() == 0) {
                        Log.m105924i("MicroMsg.OfflineCodesMgr", "generateKey_V3 cardList is null");
                        C69963m.wx0().Bx0().mo96267b(1, 1);
                        return "";
                    }
                    for (int i4 = 0; i4 < linkedList.size(); i4++) {
                        C76559f.C76561b bVar = linkedList.get(i4);
                        if (bVar != null && (str3 = bVar.f224097b) != null) {
                            if (str3.equals(this.f201767b)) {
                                j = (long) bVar.f224096a;
                            }
                        }
                    }
                    longValue |= j << 48;
                } else {
                    Log.m105924i("MicroMsg.OfflineCodesMgr", "is online code");
                }
                String str4 = "" + longValue;
                if (str4.length() == 15) {
                    str4 = "0" + str4;
                } else if (str4.length() == 14) {
                    str4 = "00" + str4;
                } else if (str4.length() == 13) {
                    str4 = "000" + str4;
                } else if (str4.length() == 12) {
                    str4 = "0000" + str4;
                }
                if (!TextUtils.isEmpty(C69963m.wx0().zx0(196647))) {
                    return C69963m.wx0().zx0(196647) + str4;
                }
                return "12" + str4;
            }
            Log.m105924i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null or is not isNumeric");
            return "";
        }
        C115669n nVar = C115669n.INSTANCE;
        MMApplicationContext.getContext();
        nVar.mo160131h(14163, 2, Integer.valueOf(AppForegroundDelegate.INSTANCE.f343454n ^ true ? 1 : 0), Integer.valueOf(NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext()) ? 1 : 0));
        nVar.idkeyStat(135, 29, 1, true);
        if (NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext())) {
            nVar.idkeyStat(135, 31, 1, true);
        } else {
            nVar.idkeyStat(135, 30, 1, true);
        }
        C69963m.wx0().Bx0().mo96267b(1, 1);
        Log.m105924i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount is 0");
        return "";
    }

    /* renamed from: b */
    public int mo96260b() {
        return C69963m.wx0().Bx0().mo96269d(true);
    }
}
