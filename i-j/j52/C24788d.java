package j52;

import com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner;
import com.tencent.p014mm.autogen.mmdata.rpt.MagicBootsPkgRecordStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MagicBrushCardPerformanceReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MagicBrushMonitorStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MagicBrushReportRuntimeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MagicBrushReportTimeCostStruct;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import eb0.C31543z5;
import ei3.C86522b;
import gy3.C87412m;
import java.util.List;
import org.json.JSONObject;
import z04.C112551y;

@C86522b
/* renamed from: j52.d */
public final class C24788d extends C86301e implements IMagicBrushMonitor {
    /* renamed from: Io */
    public void mo51764Io(String str, String str2, IMagicBrushMonitor.TimeCostScene timeCostScene, long j, String str3) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "bizName");
        C87412m.m108594g(timeCostScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(str3, "extras");
        long j2 = AppUIForegroundOwner.INSTANCE.isForeground() ? 1 : 2;
        MagicBrushReportTimeCostStruct magicBrushReportTimeCostStruct = new MagicBrushReportTimeCostStruct();
        magicBrushReportTimeCostStruct.f69568d = magicBrushReportTimeCostStruct.mo86045b("SessionID", str, true);
        magicBrushReportTimeCostStruct.f69569e = magicBrushReportTimeCostStruct.mo86045b("BizName", str2, true);
        magicBrushReportTimeCostStruct.f69570f = (long) timeCostScene.getValue();
        magicBrushReportTimeCostStruct.f69571g = j;
        magicBrushReportTimeCostStruct.f69572h = magicBrushReportTimeCostStruct.mo86045b("Extras", str3, false);
        magicBrushReportTimeCostStruct.f69573i = j2;
        magicBrushReportTimeCostStruct.mo86054n();
    }

    public void Ov0(String str, int i, String str2) {
        C87412m.m108594g(str, "key");
        long a = C31543z5.m39451a();
        if (a <= 0) {
            a = System.currentTimeMillis();
        }
        Log.m105924i("MicroMsg.MagicBrushMonitor", "MagicBrushMonitor kvReport key[" + str + "] value[" + i + "] extra[" + str2 + "] time[" + a + ']');
        MagicBrushMonitorStruct magicBrushMonitorStruct = new MagicBrushMonitorStruct();
        magicBrushMonitorStruct.f343753d = magicBrushMonitorStruct.mo86045b("key", str, true);
        magicBrushMonitorStruct.f343754e = i;
        magicBrushMonitorStruct.f343755f = magicBrushMonitorStruct.mo86045b("extra", str2, true);
        magicBrushMonitorStruct.f343752F0 = a;
        magicBrushMonitorStruct.mo86054n();
    }

    public void R80(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "type");
        C87412m.m108594g(str3, "content");
        C87412m.m108594g(str4, "extras");
        MagicBrushReportRuntimeStruct magicBrushReportRuntimeStruct = new MagicBrushReportRuntimeStruct();
        magicBrushReportRuntimeStruct.f69564d = magicBrushReportRuntimeStruct.mo86045b("BizName", str, true);
        magicBrushReportRuntimeStruct.f69565e = magicBrushReportRuntimeStruct.mo86045b("Type", str2, true);
        magicBrushReportRuntimeStruct.f69566f = magicBrushReportRuntimeStruct.mo86045b("Content", str3, false);
        magicBrushReportRuntimeStruct.f69567g = magicBrushReportRuntimeStruct.mo86045b("Extras", str4, false);
        magicBrushReportRuntimeStruct.mo86054n();
    }

    public void ir0(String str, String str2, String str3, String str4, int i, IMagicBrushMonitor.MagicPkgScene magicPkgScene, int i2, int i3) {
        C87412m.m108594g(magicPkgScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        MagicBootsPkgRecordStruct magicBootsPkgRecordStruct = new MagicBootsPkgRecordStruct();
        magicBootsPkgRecordStruct.f69546d = magicBootsPkgRecordStruct.mo86045b("PkgId", str, true);
        magicBootsPkgRecordStruct.f69547e = magicBootsPkgRecordStruct.mo86045b("BaseId", str2, true);
        magicBootsPkgRecordStruct.f69548f = magicBootsPkgRecordStruct.mo86045b("Version", str3, true);
        magicBootsPkgRecordStruct.f69549g = magicBootsPkgRecordStruct.mo86045b("Md5", str4, true);
        magicBootsPkgRecordStruct.f69550h = (long) i;
        magicBootsPkgRecordStruct.f69551i = (long) magicPkgScene.getValue();
        magicBootsPkgRecordStruct.f69552j = (long) i2;
        magicBootsPkgRecordStruct.f69553k = (long) i3;
        magicBootsPkgRecordStruct.mo86054n();
    }

    public void u40(String str, String str2, IMagicBrushMonitor.PerformanceScene performanceScene, long j, List<String> list, JSONObject jSONObject) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "cardName");
        C87412m.m108594g(performanceScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        MagicBrushCardPerformanceReportStruct magicBrushCardPerformanceReportStruct = new MagicBrushCardPerformanceReportStruct();
        magicBrushCardPerformanceReportStruct.f69554d = magicBrushCardPerformanceReportStruct.mo86045b("SessionID", str, true);
        magicBrushCardPerformanceReportStruct.f69555e = magicBrushCardPerformanceReportStruct.mo86045b("CardName", str2, true);
        magicBrushCardPerformanceReportStruct.f69556f = (long) performanceScene.getValue();
        magicBrushCardPerformanceReportStruct.f69557g = j;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    magicBrushCardPerformanceReportStruct.f69558h = magicBrushCardPerformanceReportStruct.mo86045b("Extra0", list.get(i), true);
                } else if (i == 1) {
                    magicBrushCardPerformanceReportStruct.f69559i = magicBrushCardPerformanceReportStruct.mo86045b("Extra1", list.get(i), true);
                } else if (i == 2) {
                    magicBrushCardPerformanceReportStruct.f69560j = magicBrushCardPerformanceReportStruct.mo86045b("Extra2", list.get(i), true);
                } else if (i == 3) {
                    magicBrushCardPerformanceReportStruct.f69561k = magicBrushCardPerformanceReportStruct.mo86045b("Extra3", list.get(i), true);
                } else if (i == 4) {
                    magicBrushCardPerformanceReportStruct.f69562l = magicBrushCardPerformanceReportStruct.mo86045b("Extra4", list.get(i), true);
                }
            }
        }
        if (jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "it.toString()");
            magicBrushCardPerformanceReportStruct.f69563m = magicBrushCardPerformanceReportStruct.mo86045b("Extra5", C112551y.m153815o(jSONObject2, ',', ';', false, 4, (Object) null), true);
        }
        magicBrushCardPerformanceReportStruct.mo86054n();
    }
}
