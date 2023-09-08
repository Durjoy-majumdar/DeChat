package com.tencent.p014mm.plugin.finder.live.controller.screenshotshare;

import android.view.ViewGroup;
import com.tencent.p014mm.autogen.events.MMFinderUIScreenShotEvent;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gh1.C8313a;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController */
public final class EventSubscribeController extends C8313a {

    /* renamed from: j */
    public IListener<MMFinderUIScreenShotEvent> f15017j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventSubscribeController(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r6 == r1) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m3060m3(com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController r5, wx3.C15601d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof kh1.C10078b
            if (r0 == 0) goto L_0x0016
            r0 = r6
            kh1.b r0 = (kh1.C10078b) r0
            int r1 = r0.f30851f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f30851f = r1
            goto L_0x001b
        L_0x0016:
            kh1.b r0 = new kh1.b
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f30849d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f30851f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0074
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            com.tencent.mm.plugin.finder.live.view.b2 r5 = r5.f27261e
            if (r5 == 0) goto L_0x0078
            java.lang.Class<qj1.ze> r6 = qj1.C63170ze.class
            qj1.c r5 = r5.getPlugin(r6)
            qj1.ze r5 = (qj1.C63170ze) r5
            if (r5 == 0) goto L_0x0078
            r0.f30851f = r4
            com.tencent.mm.live.core.view.LiveVideoView r6 = r5.f179244r
            android.view.TextureView r6 = r6.getVideoView()
            if (r6 == 0) goto L_0x0053
            android.graphics.Bitmap r6 = r6.getBitmap()
            goto L_0x0054
        L_0x0053:
            r6 = r3
        L_0x0054:
            if (r6 == 0) goto L_0x0070
            int r2 = r6.getWidth()
            if (r2 == 0) goto L_0x0070
            int r2 = r6.getHeight()
            if (r2 != 0) goto L_0x0063
            goto L_0x0070
        L_0x0063:
            a14.h0 r2 = a14.C53872d1.f151119c
            qj1.af r4 = new qj1.af
            r4.<init>(r5, r6, r3)
            java.lang.Object r5 = a14.C53895h.m60469g(r2, r4, r0)
            r6 = r5
            goto L_0x0071
        L_0x0070:
            r6 = r3
        L_0x0071:
            if (r6 != r1) goto L_0x0074
            goto L_0x008f
        L_0x0074:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            r1 = r6
            goto L_0x0079
        L_0x0078:
            r1 = r3
        L_0x0079:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "#getStreamFrame b="
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FinderLiveScreenShotEventSubscribeController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController.m3060m3(com.tencent.mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController, wx3.d):java.lang.Object");
    }

    public void onLiveActivate() {
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        Log.m105924i("FinderLiveScreenShotEventSubscribeController", "#onViewMount");
        IListener<MMFinderUIScreenShotEvent> iListener = this.f15017j;
        if (iListener != null) {
            iListener.dead();
        }
        EventSubscribeController$onViewMount$1 eventSubscribeController$onViewMount$1 = new EventSubscribeController$onViewMount$1(this, viewGroup.getContext());
        this.f15017j = eventSubscribeController$onViewMount$1;
        eventSubscribeController$onViewMount$1.alive();
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        Log.m105924i("FinderLiveScreenShotEventSubscribeController", "#onViewUnmount");
        IListener<MMFinderUIScreenShotEvent> iListener = this.f15017j;
        if (iListener != null) {
            iListener.dead();
        }
    }
}
