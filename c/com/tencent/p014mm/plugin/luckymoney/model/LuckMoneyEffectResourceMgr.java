package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.LuckMoneyEffectResourceMgr */
public class LuckMoneyEffectResourceMgr {

    /* renamed from: a */
    public static IListener<CheckResUpdateCacheFileEvent> f81526a = new IListener<CheckResUpdateCacheFileEvent>(C40008f.f107254d) {
        {
            this.__eventId = 905296653;
        }

        public boolean callback(IEvent iEvent) {
            int i;
            CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
            CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
            if (aVar != null && (i = aVar.f78744a) == 53) {
                Log.m105925i("MicroMsg.LuckMoneyEffectResourceMgr", "luckyMoney resource file update, type: %s, subType: %s, filePath: %s", Integer.valueOf(i), Integer.valueOf(checkResUpdateCacheFileEvent.f78743d.f78745b), checkResUpdateCacheFileEvent.f78743d.f78746c);
                if (!Util.isNullOrNil(checkResUpdateCacheFileEvent.f78743d.f78746c) && C86013q1.m106450k(checkResUpdateCacheFileEvent.f78743d.f78746c)) {
                    CheckResUpdateCacheFileEvent.C28720a aVar2 = checkResUpdateCacheFileEvent.f78743d;
                    String str = aVar2.f78746c;
                    int i2 = aVar2.f78744a;
                    int i3 = aVar2.f78745b;
                    IListener<CheckResUpdateCacheFileEvent> iListener = LuckMoneyEffectResourceMgr.f81526a;
                    Log.m105925i("MicroMsg.LuckMoneyEffectResourceMgr", "start saveEffectResource %s %s %s", str, Integer.valueOf(i2), Integer.valueOf(i3));
                    ThreadPool.post(new C4834r(str, i2, i3), "LuckMoneyEffectResourceMgr_saveEffectResource");
                }
            }
            return false;
        }
    };
}
