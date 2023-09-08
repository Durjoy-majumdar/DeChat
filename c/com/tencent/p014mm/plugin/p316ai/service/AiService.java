package com.tencent.p014mm.plugin.p316ai.service;

import android.content.Context;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RunAiEvent;
import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.CalendarStatisticsStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PFloat;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import gh0.C59438b;
import h81.C32735h;
import hh0.C20942f;
import ht1.C60200t1;
import ih0.C108461a;
import ih0.C117197j;
import ih0.C21092b;
import ih0.C21093g;
import ih0.C21095o;
import ih0.C33329e;
import kh0.C88149b;
import ky2.C10432i;
import lh0.C34262g;
import org.json.JSONObject;
import p204mr.C34645j;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.ai.service.AiService */
public class AiService extends C86301e implements C59438b {
    public AiService() {
        new IListener<RunAiEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1923791991;
            }

            public boolean callback(IEvent iEvent) {
                RunAiEvent runAiEvent = (RunAiEvent) iEvent;
                if (ChannelUtil.isGPVersion()) {
                    C115669n.INSTANCE.mo175911u(1559, 38);
                    return false;
                } else if (!AiService.this.k90() || C20942f.yx0().Fx0()) {
                    return false;
                } else {
                    ((C119157j) C119157j.f356862d).mo183876g(new C29087a(this, runAiEvent), "Ai_thread");
                    return false;
                }
            }
        };
        new C88149b();
    }

    /* renamed from: Le */
    public String mo22079Le() {
        String str;
        Class cls = C60200t1.class;
        long currentTicks = Util.currentTicks();
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_finder_aiinfo_pass_svr, false);
        String str2 = "";
        if (wf) {
            C21092b i = C21092b.m23349i();
            i.getClass();
            long currentTicks2 = Util.currentTicks();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, i.mo32858l());
                C34262g vx02 = C34262g.vx0();
                vx02.requireAccountInitialized();
                str = str2;
                try {
                    jSONObject.put("7", vx02.f92371i.mo33600a("last_expose_finder_reddot_ms", 0));
                    jSONObject.put("8", i.mo32857k());
                    jSONObject.put("9", ((C60200t1) C86312j.m106911c(cls)).mo76889vp());
                    jSONObject.put(PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, i.mo32860n() ? 1 : 0);
                    C34262g vx03 = C34262g.vx0();
                    vx03.requireAccountInitialized();
                    jSONObject.put("18", vx03.f92371i.mo33600a("rece_finder_live_reddot_ms", 0));
                    C34262g vx04 = C34262g.vx0();
                    vx04.requireAccountInitialized();
                    jSONObject.put("19", vx04.f92371i.mo33600a("last_expose_finder_live_reddot_ms", 0));
                    jSONObject.put("20", i.mo32856j());
                    jSONObject.put("21", ((C60200t1) C86312j.m106911c(cls)).mo76855hR());
                    jSONObject.put("22", i.mo32861o() ? 1 : 0);
                    jSONObject.put("27", C33329e.xx0().wx0());
                    jSONObject.put("28", NetStatusUtil.getIOSOldNetType(MMApplicationContext.getContext()));
                    jSONObject.put("29", C117197j.wx0().f351082e ? 1 : 0);
                    C34262g vx05 = C34262g.vx0();
                    vx05.requireAccountInitialized();
                    CalendarStatisticsStruct c = vx05.f92371i.mo33602c("calendar_statistics_discover");
                    jSONObject.put("37", c.f48235e);
                    jSONObject.put("38", c.f48237g);
                    C34262g vx06 = C34262g.vx0();
                    vx06.requireAccountInitialized();
                    CalendarStatisticsStruct c2 = vx06.f92371i.mo33602c("calendar_statistics_finder");
                    jSONObject.put("39", c2.f48235e);
                    jSONObject.put("41", c2.f48237g);
                    jSONObject.put("42", c2.f48240j);
                    jSONObject.put("43", c2.f48241k);
                    jSONObject.put("44", c2.f48242l);
                    jSONObject.put("45", c2.f48238h);
                    jSONObject.put("66", c2.f48243m);
                    jSONObject.put("67", c2.f48244n);
                    jSONObject.put("68", c2.f48245o);
                    jSONObject.put("69", c2.f48246p);
                    C34262g vx07 = C34262g.vx0();
                    vx07.requireAccountInitialized();
                    CalendarStatisticsStruct c3 = vx07.f92371i.mo33602c("calendar_statistics_live");
                    jSONObject.put("46", c3.f48235e);
                    jSONObject.put("48", c3.f48237g);
                    jSONObject.put("49", c3.f48240j);
                    jSONObject.put("50", c3.f48241k);
                    jSONObject.put("51", c3.f48242l);
                    jSONObject.put("52", c3.f48238h);
                    jSONObject.put("58", C108461a.m146963b() >= 3 ? 1 : 0);
                    PFloat pFloat = new PFloat();
                    C108461a.m146962a(pFloat);
                    jSONObject.put("59", (int) (pFloat.value * 100.0f));
                    jSONObject.put("60", i.mo32849b());
                    jSONObject.put("61", i.mo32848a());
                    C21095o oVar = ((C21093g) C86312j.m106911c(C21093g.class)).f59648e;
                    int i2 = -1;
                    if (oVar != null) {
                        i2 = Util.getInt(oVar.f59651a, -1);
                    }
                    jSONObject.put("62", i2);
                    PString pString = new PString();
                    PString pString2 = new PString();
                    i.mo32863q(new int[]{5, 30, 60}, pString, pString2);
                    jSONObject.put("63", pString.value);
                    jSONObject.put("64", pString2.value);
                    C34262g vx08 = C34262g.vx0();
                    vx08.requireAccountInitialized();
                    jSONObject.put("65", vx08.f92371i.mo33600a("calendar_first_enter_app_time", 0));
                    C34262g vx09 = C34262g.vx0();
                    vx09.requireAccountInitialized();
                    jSONObject.put("70", vx09.f92371i.mo33600a("last_enter_finder_time", 0));
                    C34262g vx010 = C34262g.vx0();
                    vx010.requireAccountInitialized();
                    jSONObject.put("71", vx010.f92371i.mo33600a("last_exit_finder_time", 0));
                    C34262g vx011 = C34262g.vx0();
                    vx011.requireAccountInitialized();
                    jSONObject.put("72", vx011.f92371i.mo33600a("last_finder_vv", 0));
                    jSONObject.put("9998", ((C34645j) C86312j.m106911c(C34645j.class)).mo59665N() ? 1 : 0);
                    jSONObject.put("9999", Util.ticksToNow(currentTicks2));
                    str2 = jSONObject.toString();
                } catch (Exception unused) {
                    str2 = str;
                    Log.m105919d("MicroMsg.AiFinderData", "checkToReturnAiFinderInfo json:%s", str2);
                    Log.m105925i("MicroMsg.AiService", "checkToReturnAiFinderInfo flag[%b] cost[%d] json[%d]", Boolean.valueOf(wf), Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(str2.length()));
                    return str2;
                }
            } catch (Exception unused2) {
                str = str2;
                str2 = str;
                Log.m105919d("MicroMsg.AiFinderData", "checkToReturnAiFinderInfo json:%s", str2);
                Log.m105925i("MicroMsg.AiService", "checkToReturnAiFinderInfo flag[%b] cost[%d] json[%d]", Boolean.valueOf(wf), Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(str2.length()));
                return str2;
            }
            Log.m105919d("MicroMsg.AiFinderData", "checkToReturnAiFinderInfo json:%s", str2);
        } else {
            String str3 = str2;
        }
        Log.m105925i("MicroMsg.AiService", "checkToReturnAiFinderInfo flag[%b] cost[%d] json[%d]", Boolean.valueOf(wf), Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(str2.length()));
        return str2;
    }

    public boolean i10() {
        WeChatTabRedDotEvent.C28853a aVar = C33329e.xx0().f90355f.get(2);
        return aVar == null || aVar.f79064b || aVar.f79065c > 0;
    }

    public boolean k90() {
        Class cls = C10432i.class;
        boolean sF = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        boolean z = !((C75592q0.m90781k() & 34359738368L) != 0);
        boolean z2 = ((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2;
        Log.m105925i("MicroMsg.AiService", "[isShowFinderEntrance] show:%s open:%s, isTeenModeAndNothing:%s", Boolean.valueOf(sF), Boolean.valueOf(z), Boolean.valueOf(z2));
        return sF && z && !z2;
    }

    public void onAccountInitialized(Context context) {
        Log.m105925i("MicroMsg.AiService", "AiService onAccountInitialized [%d]", Integer.valueOf(hashCode()));
        C20942f.yx0().Dx0();
    }

    public void onAccountReleased(Context context) {
        Log.m105925i("MicroMsg.AiService", "AiService onAccountRelease [%d]", Integer.valueOf(hashCode()));
        C20942f.yx0().f59381p.removeCallbacksAndMessages((Object) null);
    }
}
