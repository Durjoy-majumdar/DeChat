package com.tencent.p014mm.plugin.appbrand.msg.dyeingtemplate;

import android.text.TextUtils;
import ce0.C54715a;
import ce0.C80017c;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DyeingTemplateMsgReceiveEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.msgsubscription.voice.PlayVoiceData;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import p687sr.C64152d;
import p687sr.C64153e;
import pp0.C62421a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/msg/dyeingtemplate/DyeingTemplateMsgHandler$initialize$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/DyeingTemplateMsgReceiveEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.msg.dyeingtemplate.DyeingTemplateMsgHandler$initialize$1 */
public final class DyeingTemplateMsgHandler$initialize$1 extends IListener<DyeingTemplateMsgReceiveEvent> {
    public DyeingTemplateMsgHandler$initialize$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        boolean z;
        boolean z2;
        DyeingTemplateMsgReceiveEvent dyeingTemplateMsgReceiveEvent = (DyeingTemplateMsgReceiveEvent) iEvent;
        Class cls = C64153e.class;
        C87412m.m108594g(dyeingTemplateMsgReceiveEvent, "event");
        C62421a aVar = C62421a.f177387a;
        String d = aVar.mo87476d(dyeingTemplateMsgReceiveEvent.f154743d.f154744a);
        boolean z3 = true;
        if (!TextUtils.isEmpty(d)) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new PlayVoiceData(System.nanoTime(), d, 0), C80017c.class, C54715a.f153352d);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler] handSubscribeMsgVoiceBroadcast done");
        } else {
            DyeingTemplateMsgReceiveEvent.C55116a aVar2 = dyeingTemplateMsgReceiveEvent.f154743d;
            C64152d b = aVar.mo87474b(aVar2.f154744a, aVar2.f154745b);
            if (b != null) {
                ((C64153e) C86312j.m106911c(cls)).mo88358Et(b);
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler] handForceNotify done");
            } else {
                Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "handle game force notify");
                DyeingTemplateMsgReceiveEvent.C55116a aVar3 = dyeingTemplateMsgReceiveEvent.f154743d;
                C64152d c = aVar.mo87475c(aVar3.f154746c, aVar3.f154745b);
                if (c != null) {
                    Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "pre call force push service");
                    ((C64153e) C86312j.m106911c(cls)).mo88358Et(c);
                } else {
                    z3 = false;
                }
                if (z3) {
                    Log.m105924i("MicroMsg.DyeingTemplateMsgHandler", "[DyeingTemplateMsgHandler] handGameForceNotify done");
                }
            }
        }
        return false;
    }
}
