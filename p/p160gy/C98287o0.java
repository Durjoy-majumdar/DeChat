package p160gy;

import android.os.Bundle;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C30420b;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import h81.C32735h;
import p166hy.C98561h0;
import p599lr.C61381b;

@C86522b
/* renamed from: gy.o0 */
public final class C98287o0 extends C86301e implements C98561h0 {
    public RecordConfigProvider rs0(String str, int i, String str2, String str3, int i2) {
        SnsMethodCalculate.markStartTimeMs("getSnsEditRecordConfigProvider", "com.tencent.mm.feature.sns.RecordConfigProviderService");
        C87412m.m108594g(str, "inputPath");
        C87412m.m108594g(str2, "outputVideo");
        C87412m.m108594g(str3, "outputThumb");
        SnsMethodCalculate.markStartTimeMs("getSnsEditRecordConfigProvider", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        RecordConfigProvider c = RecordConfigProvider.m119433c(str, str2, str3);
        c.f272935w = i;
        C30420b bVar = C30420b.f82051a;
        c.f272933u = Boolean.valueOf(!bVar.mo57380d());
        c.f272905F = 2;
        Bundle bundle = c.f272912M;
        bundle.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", i2);
        bundle.putBoolean("key_fix_aspect_ratio", ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_composition_fix_aspect_ratio_enable, true));
        C7335d c2 = C86312j.m106911c(C61381b.class);
        C87412m.m108593f(c2, "getService(com.tencent.m…atureService::class.java)");
        if (((C61381b) c2).mo78537Cb(false)) {
            c.f272912M.putBoolean("key_save_composition_info", true);
        }
        c.f272912M.putBoolean("key_edit_enable_emoji_search", true);
        SnsMethodCalculate.markStartTimeMs("getSnsAlbumVideoCompositionProvider", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        if (bVar.mo57377a()) {
            c.mo129804a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAlbumVideoCompositionProvider", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        SnsMethodCalculate.markEndTimeMs("getSnsEditRecordConfigProvider", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        SnsMethodCalculate.markEndTimeMs("getSnsEditRecordConfigProvider", "com.tencent.mm.feature.sns.RecordConfigProviderService");
        return c;
    }
}
