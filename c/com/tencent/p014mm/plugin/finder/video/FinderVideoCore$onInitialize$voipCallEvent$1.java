package com.tencent.p014mm.plugin.finder.video;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/video/FinderVideoCore$onInitialize$voipCallEvent$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/VoipEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderVideoCore$onInitialize$voipCallEvent$1 */
public final class FinderVideoCore$onInitialize$voipCallEvent$1 extends IListener<VoipEvent> {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f161842d;

    /* renamed from: e */
    public final /* synthetic */ FinderVideoCore f161843e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderVideoCore$onInitialize$voipCallEvent$1(AppCompatActivity appCompatActivity, FinderVideoCore finderVideoCore) {
        super(appCompatActivity);
        this.f161842d = appCompatActivity;
        this.f161843e = finderVideoCore;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r6) {
        /*
            r5 = this;
            com.tencent.mm.autogen.events.VoipEvent r6 = (com.tencent.p014mm.autogen.events.VoipEvent) r6
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r6, r0)
            boolean r0 = f40.C86709a0.m107522a()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            goto L_0x0081
        L_0x0011:
            com.tencent.mm.autogen.events.VoipEvent$a r6 = r6.f194019d
            int r6 = r6.f194022b
            r0 = 11
            if (r6 != r0) goto L_0x0076
            com.tencent.mm.plugin.finder.video.FinderVideoCore r6 = r5.f161843e
            rs1.lb r6 = r6.mo79538z1()
            androidx.appcompat.app.AppCompatActivity r0 = r5.f161842d
            gr1.o2 r6 = r6.mo80085x(r0)
            r0 = 0
            if (r6 == 0) goto L_0x002d
            android.view.ViewParent r3 = r6.getParentView()
            goto L_0x002e
        L_0x002d:
            r3 = r0
        L_0x002e:
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.video.FinderVideoLayout
            if (r4 == 0) goto L_0x0035
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r3
            goto L_0x0036
        L_0x0035:
            r3 = r0
        L_0x0036:
            if (r3 == 0) goto L_0x003e
            boolean r3 = r3.f161849E
            if (r3 != r2) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            if (r3 != 0) goto L_0x0061
            com.tencent.mm.plugin.finder.video.FinderVideoCore r3 = r5.f161843e
            r3.getClass()
            boolean r3 = p182kk.C61104a.m71641A()
            if (r3 != 0) goto L_0x005b
            boolean r0 = p182kk.C61104a.m71642B(r0, r1)
            if (r0 != 0) goto L_0x005b
            boolean r0 = p182kk.C61104a.m71644D()
            if (r0 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = 0
            goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r0 = 0
            goto L_0x0062
        L_0x0061:
            r0 = 1
        L_0x0062:
            if (r6 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x0068
            r0 = 1
            goto L_0x006e
        L_0x0068:
            com.tencent.mm.plugin.finder.video.FinderVideoCore r0 = r5.f161843e
            boolean r0 = r0.mo79534B1()
        L_0x006e:
            r6.setMute(r0)
        L_0x0071:
            com.tencent.mm.plugin.finder.video.FinderVideoCore r6 = r5.f161843e
            r6.f161836v = r1
            goto L_0x0080
        L_0x0076:
            r0 = 3
            if (r6 == r0) goto L_0x007c
            r0 = 7
            if (r6 != r0) goto L_0x0080
        L_0x007c:
            com.tencent.mm.plugin.finder.video.FinderVideoCore r6 = r5.f161843e
            r6.f161836v = r2
        L_0x0080:
            r1 = 1
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.video.FinderVideoCore$onInitialize$voipCallEvent$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
