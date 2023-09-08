package j52;

import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C87412m;
import java.util.List;
import org.json.JSONObject;

/* renamed from: j52.c */
public final class C87879c implements IMagicBrushMonitor {

    /* renamed from: e */
    public static final C87879c f254379e = new C87879c();

    /* renamed from: d */
    public final /* synthetic */ IMagicBrushMonitor f254380d = ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class));

    /* renamed from: Io */
    public void mo51764Io(String str, String str2, IMagicBrushMonitor.TimeCostScene timeCostScene, long j, String str3) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "bizName");
        C87412m.m108594g(timeCostScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(str3, "extras");
        this.f254380d.mo51764Io(str, str2, timeCostScene, j, str3);
    }

    public void Ov0(String str, int i, String str2) {
        C87412m.m108594g(str, "key");
        this.f254380d.Ov0(str, i, str2);
    }

    public void R80(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "bizName");
        C87412m.m108594g(str2, "type");
        C87412m.m108594g(str3, "content");
        C87412m.m108594g(str4, "extras");
        this.f254380d.R80(str, str2, str3, str4);
    }

    public void ir0(String str, String str2, String str3, String str4, int i, IMagicBrushMonitor.MagicPkgScene magicPkgScene, int i2, int i3) {
        IMagicBrushMonitor.MagicPkgScene magicPkgScene2 = magicPkgScene;
        C87412m.m108594g(magicPkgScene2, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        this.f254380d.ir0(str, str2, str3, str4, i, magicPkgScene2, i2, i3);
    }

    public void u40(String str, String str2, IMagicBrushMonitor.PerformanceScene performanceScene, long j, List<String> list, JSONObject jSONObject) {
        C87412m.m108594g(str, "sessionId");
        C87412m.m108594g(str2, "cardName");
        C87412m.m108594g(performanceScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        this.f254380d.u40(str, str2, performanceScene, j, list, jSONObject);
    }
}
