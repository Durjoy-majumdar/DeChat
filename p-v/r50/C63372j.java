package r50;

import android.content.Intent;
import b50.C54407c;
import com.tencent.p014mm.live.core.mini.LiveForegroundService;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import p206nj.C11171e;
import z40.C66733d;

/* renamed from: r50.j */
public final class C63372j {

    /* renamed from: a */
    public static final C63372j f179760a = new C63372j();

    /* renamed from: b */
    public static boolean f179761b;

    /* renamed from: a */
    public final void mo88278a(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "content");
        C87412m.m108594g(str3, "tickerContent");
        C87412m.m108594g(str4, "activityName");
        C66733d dVar = C66733d.f191763a;
        C54407c cVar = C66733d.f191764b;
        boolean z = cVar != null && cVar.B30();
        Log.m105924i("MicroMsg.LiveMiniNotificationHelper", "bindForegroundServiceIfNeed isEnableLiveNotification: " + z + " isBindForegroundService: " + f179761b + " activityName: " + str4);
        if (C11171e.m11046c(26) && !f179761b && z) {
            if (str4.length() > 0) {
                f179761b = true;
                Intent intent = new Intent();
                intent.setClass(MMApplicationContext.getContext(), LiveForegroundService.class);
                intent.putExtra("PARAM_ACTIVITY_NAME", str4);
                intent.putExtra("PARAM_TICKER", str3);
                intent.putExtra("PARAM_CONTENT", str2);
                intent.putExtra("PARAM_TITLE", str);
                try {
                    MMApplicationContext.getContext().startService(intent);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.LiveMiniNotificationHelper", e, "using start service to bindForegroundServiceIfNeed error: %s", e.getMessage());
                    try {
                        MMApplicationContext.getContext().startForegroundService(intent);
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.LiveMiniNotificationHelper", e2, "using start foreground service to bindForegroundServiceIfNeed error: %s", e2.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo88279b() {
        Log.m105924i("MicroMsg.LiveMiniNotificationHelper", "unBindForegroundServiceIfNeed, isBindForegroundService:" + f179761b);
        if (C11171e.m11046c(26) && f179761b) {
            boolean z = true;
            try {
                Intent intent = new Intent();
                intent.setClass(MMApplicationContext.getContext(), LiveForegroundService.class);
                MMApplicationContext.getContext().stopService(intent);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LiveMiniNotificationHelper", e, "unBind foreground service error: %s", e.getMessage());
                z = false;
            }
            if (z) {
                f179761b = false;
            }
        }
    }
}
