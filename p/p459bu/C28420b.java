package p459bu;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import m42.C34467a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: bu.b */
public final class C28420b extends C86301e {
    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        if (WeChatEnvironment.hasDebugger()) {
            Log.m105924i("MicroMsg.MagicBrushDemoFeatureService", "MagicBrushDemoFeatureService onCreate");
            Log.m105924i("MagicBrushProcessorCommand", "register");
            C30650a.m39147b(new C34467a(), "//mb");
        }
    }
}
