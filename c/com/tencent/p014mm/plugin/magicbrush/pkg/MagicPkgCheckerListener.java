package com.tencent.p014mm.plugin.magicbrush.pkg;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$PublicServiceNames;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import i52.C33206a;
import i52.C33207b;
import i52.C33209f;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.magicbrush.pkg.MagicPkgCheckerListener */
public class MagicPkgCheckerListener extends IListener<ActivateEvent> {

    /* renamed from: d */
    public static long f81660d;

    /* renamed from: e */
    public static Set<String> f81661e = new CopyOnWriteArraySet();

    public MagicPkgCheckerListener() {
        super(C40008f.f107254d);
        Log.m105924i("MicroMsg.MagicPkgCheckerListener", "[MagicPkgCheckerListener]");
        ((CopyOnWriteArraySet) f81661e).add("magicemo");
        ((CopyOnWriteArraySet) f81661e).add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_EMOJI_COCOS.toLowerCase());
        ((CopyOnWriteArraySet) f81661e).add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE.toLowerCase());
        ((CopyOnWriteArraySet) f81661e).add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE.toLowerCase());
        ((CopyOnWriteArraySet) f81661e).add(MagicBrushConstants$PublicServiceNames.BIZ_SCL_PUBLIC_SERVICE.toLowerCase());
        ((CopyOnWriteArraySet) f81661e).add(MagicBrushConstants$PublicServiceNames.BIZ_AD_PUBLIC_SERVICE.toLowerCase());
        ((CopyOnWriteArraySet) f81661e).add(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_LAND_PAGE.toLowerCase());
        MultiProcessMMKV multiDefault = MultiProcessMMKV.getMultiDefault();
        if (multiDefault == null) {
            Log.m105928w("MicroMsg.MagicPkgCheckerListener", "getMultiDefault failed, sp is null.");
            this.__eventId = -1435144905;
            return;
        }
        Set<String> stringSet = multiDefault.getStringSet("MagicPkgPreLoadPkgId", new HashSet());
        if (stringSet != null && !stringSet.isEmpty()) {
            for (String next : stringSet) {
                if (!((CopyOnWriteArraySet) f81661e).contains(next)) {
                    ((CopyOnWriteArraySet) f81661e).add(next);
                }
                Log.m105925i("MicroMsg.MagicPkgCheckerListener", "preload add pkgId:%s", next);
            }
        }
        String e = C33209f.m39989e();
        if (e != null) {
            boolean v = C86013q1.m106461v(e);
            Log.m105925i("MicroMsg.MagicPkgCheckerListener", "mkdir %s ret:%b", e, Boolean.valueOf(v));
            if (v) {
                C86013q1.m106460u(e);
            }
        }
        this.__eventId = -1435144905;
    }

    public boolean callback(IEvent iEvent) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MAGIC_PKG_CLEAN_LAST_TIME_LONG;
        if (!((ActivateEvent) iEvent).f78706d.f78707a) {
            if (!C86709a0.m107522a()) {
                Log.m105928w("MicroMsg.MagicPkgCheckerListener", "callback fail. account not ready.");
            } else {
                if (f81660d == 0) {
                    f81660d = ((Long) C86709a0.m107535s().mo121142i().mo119685f(aVar, 0L)).longValue();
                }
                long currentTimeMillis = System.currentTimeMillis();
                ((C119157j) C119157j.f356862d).mo183875f(new C33206a(this));
                long j = currentTimeMillis - f81660d;
                if (j >= 1209600000) {
                    Log.m105924i("MicroMsg.MagicPkgCheckerListener", "It's time to clean magic pkg.");
                    f81660d = currentTimeMillis;
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis));
                    ((C119157j) C119157j.f356862d).mo183875f(new C33207b(this));
                } else {
                    Log.m105925i("MicroMsg.MagicPkgCheckerListener", "It's not time to clean magic pkg. please wait %d hour", Long.valueOf((1209600000 - j) / 3600000));
                }
            }
        }
        return false;
    }
}
