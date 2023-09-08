package lk3;

import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import p753xp.C102704b;
import p867wp.C102479b;

/* renamed from: lk3.a */
public final class C61302a extends PipelineComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61302a(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public void onDestroy() {
        int i = stateCenter().getState().getInt("KeyAppMsgSubType", 0);
        String string = stateCenter().getState().getString("Common_ImageKey", "");
        String string2 = stateCenter().getState().getString("Common_TargetPath", "");
        String string3 = stateCenter().getState().getString("KeyFileMd5", "");
        C7335d c = C86312j.m106911c(C102704b.class);
        C87412m.m108593f(c, "getService(IDupCheckFeatureService::class.java)");
        C102479b Bg = ((C102704b) c).mo138748Bg(string2, i, string3, (byte[]) null);
        Log.m105924i("MicroMsg.C2CImageLoaderAppMsgCheckDupPPC", "onDestroy " + string + ' ' + Bg.f301760a + ' ' + Bg.f301761b);
    }
}
