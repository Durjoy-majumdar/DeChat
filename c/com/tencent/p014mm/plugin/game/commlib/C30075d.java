package com.tencent.p014mm.plugin.game.commlib;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.game.commlib.d */
public class C30075d implements C11385n {

    /* renamed from: f */
    public static C30075d f81348f;

    /* renamed from: d */
    public boolean f81349d = false;

    /* renamed from: e */
    public boolean f81350e = false;

    /* renamed from: a */
    public static C30075d m38954a() {
        if (f81348f == null) {
            synchronized (C30075d.class) {
                if (f81348f == null) {
                    f81348f = new C30075d();
                }
            }
        }
        return f81348f;
    }

    /* renamed from: b */
    public synchronized void mo57102b(boolean z, int i) {
        boolean z2;
        if (!z) {
            if (Math.abs(Util.secondsToNow(Long.valueOf(Util.nullAsNil((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_GLOBAL_CONFIG_UPDATE_TIME_LONG, 0L))).longValue())) <= 86400) {
                z2 = false;
                if ((z2 || (!C86013q1.m106450k(C41853c.m45369c()))) && !this.f81349d) {
                    Log.m105925i("MicroMsg.GameConfigUpdater", "Game config start update. force update(%b)", Boolean.valueOf(z));
                    this.f81349d = false;
                    C86709a0.m107524d().mo123470p(1311, this);
                    this.f81349d = true;
                    this.f81350e = z;
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG, 0L);
                    C86709a0.m107524d().mo123455a(1311, this);
                    C86709a0.m107524d().mo123460f(new C41854e(i));
                }
            }
        }
        z2 = true;
        Log.m105925i("MicroMsg.GameConfigUpdater", "Game config start update. force update(%b)", Boolean.valueOf(z));
        this.f81349d = false;
        C86709a0.m107524d().mo123470p(1311, this);
        this.f81349d = true;
        this.f81350e = z;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG, 0L);
        C86709a0.m107524d().mo123455a(1311, this);
        C86709a0.m107524d().mo123460f(new C41854e(i));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 1311) {
            Log.m105925i("MicroMsg.GameConfigUpdater", "getGameCenterGlobalSetting sceneEnd, %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
            if (!C86709a0.m107523b().mo121114l()) {
                Log.m105928w("MicroMsg.GameConfigUpdater", "account not init.");
            } else {
                Log.m105925i("MicroMsg.GameConfigUpdater", "updateTime, isForceUpdate: %b", Boolean.valueOf(this.f81350e));
                if (!this.f81350e) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GAME_GLOBAL_CONFIG_UPDATE_TIME_LONG, Long.valueOf(Util.nowSecond()));
                }
            }
            this.f81349d = false;
            C86709a0.m107524d().mo123470p(1311, this);
        }
    }
}
