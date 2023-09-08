package com.tencent.p014mm.plugin.flutter.base;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FlutterIsInitializedEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/flutter/base/CachedFlutterEngines$checkWarmupListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FlutterIsInitializedEvent;", "plugin-flutter_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$checkWarmupListener$1 */
public final class CachedFlutterEngines$checkWarmupListener$1 extends IListener<FlutterIsInitializedEvent> {
    public CachedFlutterEngines$checkWarmupListener$1(C40008f fVar) {
        super(fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((((a14.C53884f2) r0).mo74530c()) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r4) {
        /*
            r3 = this;
            com.tencent.mm.autogen.events.FlutterIsInitializedEvent r4 = (com.tencent.p014mm.autogen.events.FlutterIsInitializedEvent) r4
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r4, r0)
            com.tencent.mm.autogen.events.FlutterIsInitializedEvent$a r4 = r4.f343560d
            a14.z1 r0 = com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines.f346099c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            a14.f2 r0 = (a14.C53884f2) r0
            boolean r0 = r0.mo74530c()
            if (r0 != r1) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r4.f343561a = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines$checkWarmupListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
