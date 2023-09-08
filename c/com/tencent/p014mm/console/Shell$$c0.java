package com.tencent.p014mm.console;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.console.Shell$$c0 */
public class Shell$$c0 implements Shell$$s1 {
    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (WeChatEnvironment.hasDebugger() || WeChatEnvironment.isMonkeyEnv()) {
            int intExtra = intent.getIntExtra("ratio", -1);
            if (intExtra < 1 || intExtra > 10) {
                Context context = MMApplicationContext.getContext();
                C76701a.makeText(context, (CharSequence) "Timer ratio should be [1, 10], actual: " + intExtra, 1).show();
                return;
            }
            Log.m105924i("MicroMsg.Shell", "#RECOVERY_EXERCISE_SET_TIMER_RATIO, ratio = " + intExtra);
            Context context2 = MMApplicationContext.getContext();
            C76701a.makeText(context2, (CharSequence) "设置 Recovery 演练 Timer Ratio: " + intExtra, 1).show();
            MMApplicationContext.getContext();
            return;
        }
        Log.m105920e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
    }
}
