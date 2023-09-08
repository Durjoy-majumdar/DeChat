package com.tencent.p014mm.plugin.game.commlib;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.game.commlib.util.C41859a;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.commlib.util.C41870e;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86718e;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import mp3.C88824h;
import sx1.C48493b;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.game.commlib.h */
public class C41855h extends C86301e {

    /* renamed from: d */
    public C114668z.C104589a f112801d = new C41856a(this);

    /* renamed from: com.tencent.mm.plugin.game.commlib.h$a */
    public class C41856a extends C114668z.C104589a {
        public C41856a(C41855h hVar) {
        }

        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    String str2 = C41872f.f112815a;
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GAME_FILE_CLEAN_TIME_LONG;
                    if (Util.secondsToNow(Long.valueOf(Util.nullAsNil((Long) i.mo119685f(aVar, 0L))).longValue()) > 86400) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(Util.nowSecond()));
                        C48493b.m53856b().mo73124a("game_cache_clean", new C41870e());
                    }
                }
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                C86718e.m107551r();
            }
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        this.f112801d.alive();
        if (C41859a.f112805b == null) {
            C41859a.f112805b = new C41859a.C41861b((C41859a.C41860a) null);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        MMApplicationContext.getContext().registerReceiver(C41859a.f112805b, intentFilter);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        if (C41864d.f112810a != null) {
            synchronized (C41864d.f112811b) {
                try {
                    if (C41864d.f112810a != null) {
                        ((ConcurrentHashMap) C88824h.f256226a).remove("GameCommLib#WorkThread".toUpperCase(Locale.ENGLISH));
                        C41864d.f112810a.quit();
                        C41864d.f112810a = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
        this.f112801d.dead();
        if (C41859a.f112805b != null) {
            MMApplicationContext.getContext().unregisterReceiver(C41859a.f112805b);
        }
        C41859a.f112805b = null;
    }
}
