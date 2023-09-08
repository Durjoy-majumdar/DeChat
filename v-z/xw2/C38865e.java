package xw2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xw2.e */
public class C38865e {
    /* renamed from: a */
    public static void m41967a(String str, int i, int i2, int i3, int i4) {
        Log.m105925i("MicroMsg.VoiceTransformTextReporter", "alvinluo reportTransformTextResult voiceId: %s, wordCount: %d, waitTime: %d, animationTime: %d, result: %d", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        C115669n.INSTANCE.mo160131h(14220, 0, 0, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i2 + i3), Integer.valueOf(i4), str);
    }
}
