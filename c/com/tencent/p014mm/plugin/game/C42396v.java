package com.tencent.p014mm.plugin.game;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.game.model.silent_download.GameSilentDownloadListener;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86723g;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import jy1.C46587e;
import kotlin.Result;
import kotlin.ResultKt;
import mp3.C88824h;
import my1.C100028c;
import ob0.C89137b0;
import p232rw.C48089i;
import rx3.C13598b0;
import sx1.C48493b;
import uy1.C52642c;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.game.v */
public class C42396v extends C86301e {
    public void onAccountInitialized(Context context) {
        C13598b0 b0Var;
        C13598b0 b0Var2;
        C89137b0 b0Var3;
        C114770g gVar;
        super.onAccountInitialized(context);
        Log.m105924i("MicroMsg.PluginGame", "onAccountInitialized");
        C100028c cVar = GameEventListener.f112095E;
        C46587e eVar = C46587e.f125495a;
        try {
            Result.Companion companion = Result.Companion;
            C86723g k = C86709a0.m107529k();
            if (k == null || (b0Var3 = k.f251779b) == null || (gVar = b0Var3.f256809d) == null) {
                b0Var2 = null;
            } else {
                gVar.mo55461T2(C46587e.f125496b);
                b0Var2 = C13598b0.f38549a;
            }
            Result.m168114constructorimpl(b0Var2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        try {
            C86723g k2 = C86709a0.m107529k();
            if (k2 != null) {
                k2.mo121126a(C46587e.f125497c);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            Result.m168114constructorimpl(b0Var);
        } catch (Throwable th4) {
            Result.Companion companion3 = Result.Companion;
            Result.m168114constructorimpl(ResultKt.createFailure(th4));
        }
        try {
            if (GameSilentDownloadListener.f113407d == null) {
                GameSilentDownloadListener.f113407d = new GameSilentDownloadListener.C42099c((GameSilentDownloadListener.C42097a) null);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            MMApplicationContext.getContext().registerReceiver(GameSilentDownloadListener.f113407d, intentFilter);
        } catch (Exception e) {
            Log.m105925i("MicroMsg.GameSilentDownloadListener", "registerNetChange err:%s", e.getMessage());
        }
        try {
            if (GameSilentDownloadListener.f113408e == null) {
                GameSilentDownloadListener.f113408e = new GameSilentDownloadListener.C42098b((GameSilentDownloadListener.C42097a) null);
            }
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
            intentFilter2.addAction("android.intent.action.BATTERY_LOW");
            MMApplicationContext.getContext().registerReceiver(GameSilentDownloadListener.f113408e, intentFilter2);
        } catch (Exception e2) {
            Log.m105925i("MicroMsg.GameSilentDownloadListener", "registerBatteryChange err:%s", e2.getMessage());
        }
        GameSilentDownloadListener.f113410g.alive();
        GameEventListener.f112097G.alive();
        ((C48089i) C86312j.m106911c(C48089i.class)).mo72633UA(5, GameEventListener.f112095E);
        ((C119157j) C119157j.f356862d).mo183878i(new C42397w(this), 500);
        C48493b.m53856b().mo73124a("game_resource_check", new v$$b(this));
        ((C119157j) C119157j.f356862d).mo183878i(new v$$a(), 1000);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105924i("MicroMsg.PluginGame", "onAccountRelease");
        if (C52642c.f146980a != null) {
            synchronized (C52642c.f146981b) {
                if (C52642c.f146980a != null) {
                    ((ConcurrentHashMap) C88824h.f256226a).remove("SubCoreGameCenter#WorkThread".toUpperCase(Locale.ENGLISH));
                    C52642c.f146980a.quit();
                    C52642c.f146980a = null;
                }
            }
        }
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        if (MMApplicationContext.isToolsProcess()) {
            C115669n.INSTANCE.mo175913w(939, 1, 1);
        }
    }
}
