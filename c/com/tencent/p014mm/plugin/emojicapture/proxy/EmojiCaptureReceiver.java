package com.tencent.p014mm.plugin.emojicapture.proxy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import p911ml.C76778b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureReceiver */
public final class EmojiCaptureReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public final String f197886a = "MicroMsg.EmojiCaptureReceiver";

    public void onReceive(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "intent");
        String action = intent.getAction();
        String str = this.f197886a;
        Log.m105924i(str, "onReceive: " + action);
        if (C87412m.m108589b(action, "com.tencent.mm.Emoji_Capture_Res")) {
            int intExtra = intent.getIntExtra("res_sub_type", 0);
            boolean booleanExtra = intent.getBooleanExtra("res_result", false);
            String str2 = this.f197886a;
            Log.m105924i(str2, "onReceive: res update " + intExtra + ' ' + booleanExtra);
        } else if (C87412m.m108589b(action, "com.tencent.mm.Emoji_Capture_Upload")) {
            long longExtra = intent.getLongExtra("upload_time_enter", 0);
            boolean booleanExtra2 = intent.getBooleanExtra("upload_success", false);
            String stringExtra = intent.getStringExtra("upload_md5");
            C76778b.f224582a.mo107030a(longExtra, booleanExtra2, stringExtra);
            String str3 = this.f197886a;
            Log.m105924i(str3, "onReceive: upload " + longExtra + ", " + booleanExtra2 + ", " + stringExtra);
        }
    }
}
