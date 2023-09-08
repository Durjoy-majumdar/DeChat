package com.tencent.p014mm.plugin.xlabeffect;

import ac3.C27862u0;
import ac3.C39538h0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/xlabeffect/WeVisUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-xlabeffect_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.xlabeffect.WeVisUpdateReceiver */
public final class WeVisUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f82449a = 0;

    public void onReceive(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        String action = intent.getAction();
        if (C87412m.m108589b("com.tencent.mm.WeVisUpdate", action)) {
            String stringExtra = intent.getStringExtra("type");
            Log.m105924i("MicroMsg.WeVisUpdateReceiver", "onReceive: " + action + ", " + stringExtra);
            if (C87412m.m108589b(stringExtra, "wevis_model")) {
                C27862u0.f77002a.mo55648c();
            } else if (C87412m.m108589b(stringExtra, "effect_config")) {
                C39538h0.f106157d.wx0();
            }
        }
    }
}
