package fw0;

import android.content.Context;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import p875ci.C113348f;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: fw0.x */
public class C32197x extends C86301e {
    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Global_EnableNotificationSoundToolFix_Int, 0);
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_notification_sound_pool_fix, 0) == 1;
        boolean z2 = e == 0 ? z : e == 1;
        Log.m105925i("MicroMsg.PluginBigBallOfMud", "enableNotificationSoundPoolFix:%s, repairerConfig:%s", Boolean.valueOf(z), Integer.valueOf(e));
        Log.m105925i("MicroMsg.Notification.Tool.Sound", "setUseFixedSoundTool:%s", Boolean.valueOf(z2));
        C113348f.C67377c.f193241c = z2;
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        MMApplicationContext.isMainProcess();
    }
}
