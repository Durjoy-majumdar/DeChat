package qr2;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tavkit.component.TAVExporter;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import org.json.JSONObject;
import p564iq.C87790d;
import xb0.C102609h;

/* renamed from: qr2.a */
public final class C36069a {

    /* renamed from: a */
    public static final C36069a f96150a = new C36069a();

    /* renamed from: a */
    public final VideoTransPara mo60516a() {
        SnsMethodCalculate.markStartTimeMs("getCoverVideoParam", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        VideoTransPara ai02 = C102609h.Fx0().ai0();
        ai02.f267179t = 960;
        ai02.f267170h = 30;
        try {
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_sns_cover_finder_video_config, "");
            Log.m105924i("MicroMsg.SnsCoverConfig", "getCoverVideoParam:" + Y60);
            JSONObject jSONObject = new JSONObject(Y60);
            if (jSONObject.optInt("width", 0) > 0 && jSONObject.optInt("height", 0) > 0) {
                ai02.f267166d = jSONObject.optInt("width", TAVExporter.VIDEO_EXPORT_WIDTH);
                ai02.f267167e = jSONObject.optInt("height", 1280);
                if (jSONObject.optInt("thumbSize", 0) > 0) {
                    ai02.f267179t = jSONObject.optInt("thumbSize", 960);
                }
                if (jSONObject.optInt("duration", 0) > 0) {
                    ai02.f267170h = jSONObject.optInt("duration", 30);
                }
                SnsMethodCalculate.markEndTimeMs("getCoverVideoParam", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
                return ai02;
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.SnsCoverConfig", "getCoverImageParam get config error");
        }
        SnsMethodCalculate.markEndTimeMs("getCoverVideoParam", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        return ai02;
    }

    /* renamed from: b */
    public final boolean mo60517b() {
        SnsMethodCalculate.markStartTimeMs("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        boolean z = false;
        if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled("xlab")) {
            Log.m105928w("MicroMsg.SnsCoverConfig", "Expansions not yet installed, do not use new version");
            SnsMethodCalculate.markEndTimeMs("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
            return false;
        }
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_COVER_NEW_INT_SYNC, 0);
        if (j == 1) {
            z = true;
        } else if (j != 2) {
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_cover_enable, false);
            SnsMethodCalculate.markEndTimeMs("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
            return wf;
        }
        SnsMethodCalculate.markEndTimeMs("useNewVersion", "com.tencent.mm.plugin.sns.cover.config.SnsCoverConfig");
        return z;
    }
}
