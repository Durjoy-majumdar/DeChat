package com.tencent.p014mm.msgsubscription.voice;

import android.media.AudioManager;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ea2.C31443g;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import nb0.C88912b;
import nb0.C88913c;

/* renamed from: com.tencent.mm.msgsubscription.voice.MsgSubscriptionVoicePlayHelperMM */
public final class MsgSubscriptionVoicePlayHelperMM {

    /* renamed from: a */
    public static final MsgSubscriptionVoicePlayHelperMM f238026a = new MsgSubscriptionVoicePlayHelperMM();

    /* renamed from: b */
    public static final LinkedHashMap<Long, String> f238027b = new LinkedHashMap<>();

    /* renamed from: c */
    public static final Map<String, Long> f238028c = new LinkedHashMap();

    /* renamed from: d */
    public static final byte[] f238029d = new byte[0];

    /* renamed from: e */
    public static int f238030e = -1;

    /* renamed from: f */
    public static final AudioManager f238031f;

    static {
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        f238031f = (AudioManager) systemService;
        new MsgSubscriptionVoicePlayHelperMM$mAudioPlayerEventListener$1(C40008f.f107254d).alive();
    }

    /* renamed from: a */
    public final void mo112915a(String str, long j) {
        Log.m105924i("MicroMsg.MsgSubscriptionVoicePlayer", "[innerPlay] id[" + j + "]  url[" + str + ']');
        C88912b bVar = new C88912b();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(f238026a.hashCode());
        String a = C88913c.m111003a(sb.toString(), C31443g.m39405a());
        Long valueOf = Long.valueOf(j);
        Map<String, Long> map = f238028c;
        C87412m.m108593f(a, LocaleUtil.ITALIAN);
        map.put(a, valueOf);
        bVar.f256416a = a;
        bVar.f256417b = str;
        bVar.f256422g = true;
        AudioManager audioManager = f238031f;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (((double) ((((float) streamVolume) * 1.0f) / ((float) streamMaxVolume))) < 0.4d) {
            if (f238030e == -1) {
                f238030e = streamVolume;
            }
            audioManager.setStreamVolume(3, (int) (((double) streamMaxVolume) * 0.4d), 5);
        }
        C88913c.m111010h(bVar);
    }
}
