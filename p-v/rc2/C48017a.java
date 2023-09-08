package rc2;

import android.content.ComponentName;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import qc2.C47801a;
import te3.C49581gn;
import te3.C50604nx;
import te3.C51322t00;
import te3.C51473u00;
import te3.C52063y33;

/* renamed from: rc2.a */
public class C48017a implements C11385n {

    /* renamed from: d */
    public C52063y33 f128801d;

    public C48017a() {
        mo72800a();
    }

    /* renamed from: a */
    public final void mo72800a() {
        this.f128801d = new C52063y33();
        String valueOf = String.valueOf(C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_NFC_CPU_CARD_CONFIG_STRING, (Object) null));
        if (Util.isNullOrNil(valueOf)) {
            this.f128801d.f145097d = new LinkedList<>();
            C52063y33 y332 = this.f128801d;
            y332.f145101h = 0;
            y332.f145099f = 86400;
            y332.f145098e = 0;
            return;
        }
        try {
            this.f128801d.parseFrom(valueOf.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
            Log.m105925i("MicroMsg.CpuCardConfigManager", "alvinluo nfcConfig version: %d", Integer.valueOf(this.f128801d.f145098e));
        } catch (Exception e) {
            Log.m105928w("MicroMsg.CpuCardConfigManager", "parseConfig exp, " + e.getLocalizedMessage());
            this.f128801d.f145097d = new LinkedList<>();
            C52063y33 y333 = this.f128801d;
            y333.f145101h = 0;
            y333.f145099f = 86400;
            y333.f145098e = 0;
        }
    }

    /* renamed from: b */
    public void mo72801b(C52063y33 y332) {
        if (!C97625j3.m125811a()) {
            Log.m105924i("MicroMsg.CpuCardConfigManager", "setConfig account not ready");
        } else if (y332 != null) {
            Log.m105924i("MicroMsg.CpuCardConfigManager", "setConfig config");
            this.f128801d = y332;
            try {
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_NFC_CPU_CARD_CONFIG_STRING, new String(y332.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET));
            } catch (UnsupportedEncodingException e) {
                Log.m105928w("MicroMsg.CpuCardConfigManager", "save config exp, " + e.getLocalizedMessage());
            } catch (IOException e2) {
                Log.m105928w("MicroMsg.CpuCardConfigManager", "save config exp, " + e2.getLocalizedMessage());
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C51322t00 t002;
        C97625j3.m125815e().mo123470p(1561, this);
        if (yVar instanceof C47801a) {
            if (this.f128801d == null) {
                mo72800a();
            }
            C52063y33 y332 = this.f128801d;
            y332.f145101h = Util.nowSecond();
            if (i == 0 && i2 == 0 && (t002 = (C51322t00) ((C47801a) yVar).f128357e.f127056b.f127083a) != null) {
                y332.f145099f = t002.f141868f;
                y332.f145100g = t002.f141869g;
                if (((Integer) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 0)).intValue() == 0) {
                    if (t002.f141869g == 1) {
                        Util.setComponentEnabledSetting(MMApplicationContext.getContext(), new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
                    } else {
                        Util.setComponentEnabledSetting(MMApplicationContext.getContext(), new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
                    }
                }
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC, Integer.valueOf(t002.f141869g));
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_NFC_OPEN_SWITCH_WORDING_STRING_SYNC, t002.f141870h);
                int i3 = y332.f145098e;
                int i4 = t002.f141867e;
                if (i3 == i4) {
                    Log.m105924i("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd no config change return version = " + t002.f141867e);
                    mo72801b(y332);
                    return;
                }
                y332.f145098e = i4;
                Log.m105925i("MicroMsg.CpuCardConfigManager", "alvinluo nfc-onSceneEnd config new version: %d", Integer.valueOf(i4));
                LinkedList<C49581gn> linkedList = t002.f141866d;
                if (linkedList == null || linkedList.isEmpty()) {
                    y332.f145097d.clear();
                } else {
                    LinkedList<C49581gn> linkedList2 = y332.f145097d;
                    if (linkedList2 == null) {
                        y332.f145097d = new LinkedList<>();
                    } else {
                        linkedList2.clear();
                    }
                    for (int i5 = 0; i5 < t002.f141866d.size(); i5++) {
                        C49581gn gnVar = new C49581gn();
                        gnVar.f134129e = t002.f141866d.get(i5).f134129e;
                        gnVar.f134130f = t002.f141866d.get(i5).f134130f;
                        Log.m105918d("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd sflag=" + Util.nullAsNil(Integer.valueOf(gnVar.f134130f)) + ", url=" + Util.nullAsNil(gnVar.f134129e));
                        LinkedList<C51473u00> linkedList3 = gnVar.f134128d;
                        if (linkedList3 == null) {
                            gnVar.f134128d = new LinkedList<>();
                        } else {
                            linkedList3.clear();
                        }
                        for (int i6 = 0; i6 < t002.f141866d.get(i5).f134128d.size(); i6++) {
                            C51473u00 u002 = new C51473u00();
                            LinkedList<C50604nx> linkedList4 = u002.f142513d;
                            if (linkedList4 == null) {
                                u002.f142513d = new LinkedList<>();
                            } else {
                                linkedList4.clear();
                            }
                            for (int i7 = 0; i7 < t002.f141866d.get(i5).f134128d.get(i6).f142513d.size(); i7++) {
                                C50604nx nxVar = new C50604nx();
                                nxVar.f138810d = t002.f141866d.get(i5).f134128d.get(i6).f142513d.get(i7).f138810d;
                                nxVar.f138811e = t002.f141866d.get(i5).f134128d.get(i6).f142513d.get(i7).f138811e;
                                Log.m105918d("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd cmd=" + Util.nullAsNil(nxVar.f138810d) + ", answer=" + Util.nullAsNil(nxVar.f138811e));
                                u002.f142513d.add(nxVar);
                            }
                            gnVar.f134128d.add(u002);
                        }
                        y332.f145097d.add(gnVar);
                    }
                }
            }
            mo72801b(y332);
        }
    }
}
