package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.autogen.events.C2CNYPredownloadVoiceEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.w */
public class C69270w extends IStaticListener<C2CNYPredownloadVoiceEvent> {

    /* renamed from: d */
    public long f199345d;

    /* renamed from: d */
    public static void m81641d(C69270w wVar, String str) {
        wVar.getClass();
        long l = C86013q1.m106451l(str);
        if (l < wVar.f199345d) {
            Log.m105921e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "cdn download finish, and realLength:%s < voiceFileLength:%s, need to delete", Long.valueOf(l), Long.valueOf(wVar.f199345d));
            C86013q1.m106447h(str);
            return;
        }
        Log.m105924i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "cdn download finish, file is exists");
    }

    public boolean callback(IEvent iEvent) {
        C2CNYPredownloadVoiceEvent c2CNYPredownloadVoiceEvent = (C2CNYPredownloadVoiceEvent) iEvent;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() acc not ready!");
            return false;
        } else if (!(c2CNYPredownloadVoiceEvent instanceof C2CNYPredownloadVoiceEvent)) {
            return false;
        } else {
            Log.m105924i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "ljd:callback() receive C2CNYPredownloadVoiceEvent event!");
            C2CNYPredownloadVoiceEvent.C67665a aVar = c2CNYPredownloadVoiceEvent.f193507d;
            this.f199345d = aVar.f193510c;
            C69218g1.m81556c(aVar.f193508a, aVar.f193509b, new C69268v(this));
            return false;
        }
    }
}
