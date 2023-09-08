package d01;

import com.tencent.p014mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: d01.f */
public final class C58009f extends IStaticListener<ScanQrcodeLiveScreenCastAuthorizationEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r9) {
        /*
            r8 = this;
            com.tencent.mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent r9 = (com.tencent.p014mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent) r9
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.String r1 = "event"
            gy3.C87412m.m108594g(r9, r1)
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_finder_screec_cast_pc_debug_ignore_scan
            gj.m r2 = p156gj.C107835h0.f322856m
            int r2 = r2.f322869I
            r3 = -1
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x0026
            if (r2 == r5) goto L_0x0024
            r3 = 2
            if (r2 == r3) goto L_0x003a
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            boolean r1 = r2.mo58784wf(r1, r4)
            goto L_0x003b
        L_0x0024:
            r1 = 1
            goto L_0x003b
        L_0x0026:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r2 != 0) goto L_0x003a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 == 0) goto L_0x002f
            goto L_0x003a
        L_0x002f:
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            boolean r1 = r2.mo58784wf(r1, r4)
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            r2 = 0
            java.lang.String r3 = ".ui.ScreenCastActivity"
            java.lang.String r6 = "cast"
            if (r1 == 0) goto L_0x0084
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r0 = "remoteConfig"
            java.lang.String r1 = "{\"AudioChannelCnt\":2,\"AudioRecordUseAndroidMic\":1,\"AudioSampleRate\":44100,\"VideoBitRate\":4000,\"VideoFrameRate\":30,\"VideoIFrameInterval\":4,\"VideoSolution\":\"0*0\",\"business\":\"screenCast\",\"ip\":\"192.168.11.129\",\"port\":8088}"
            r9.putExtra(r0, r1)
            java.lang.String r0 = "0"
            java.lang.String r1 = "pc_ip"
            r9.putExtra(r1, r0)
            java.lang.String r1 = "phone_ip"
            r9.putExtra(r1, r0)
            e01.a r0 = yz0.C112509d.f336921e
            if (r0 != 0) goto L_0x0069
            e01.a r0 = new e01.a
            r0.<init>()
            yz0.C112509d.f336921e = r0
        L_0x0069:
            e01.a r0 = yz0.C112509d.f336921e
            if (r0 != 0) goto L_0x006e
            goto L_0x007c
        L_0x006e:
            java.lang.Class<yz0.d> r1 = yz0.C112509d.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            yz0.d r1 = (yz0.C112509d) r1
            a01.b r1 = r1.wx0(r9)
            r0.f320495a = r1
        L_0x007c:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ke3.C88144b.m109791i(r0, r6, r3, r9, r2)
            goto L_0x00cc
        L_0x0084:
            java.lang.String r1 = eb0.C75592q0.m90778h()
            java.lang.String r7 = "getDefaultFinderUsername()"
            gy3.C87412m.m108593f(r1, r7)
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0095
            r1 = 1
            goto L_0x0096
        L_0x0095:
            r1 = 0
        L_0x0096:
            if (r1 != 0) goto L_0x00c0
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_finder_screen_cast_pc_forbidden
            boolean r0 = r0.mo58784wf(r1, r4)
            if (r0 == 0) goto L_0x00a7
            goto L_0x00c0
        L_0x00a7:
            com.tencent.mm.autogen.events.ScanQrcodeLiveScreenCastAuthorizationEvent$a r9 = r9.f154870d
            if (r9 == 0) goto L_0x00cc
            java.lang.String r9 = r9.f154871a
            if (r9 == 0) goto L_0x00cc
            f01.a r0 = new f01.a
            r0.<init>(r9)
            ob0.b0 r9 = f40.C86709a0.m107524d()
            com.tencent.mm.network.g r9 = r9.f256809d
            d01.e r1 = d01.C58008e.f165928d
            r0.doScene(r9, r1)
            goto L_0x00cc
        L_0x00c0:
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ke3.C88144b.m109791i(r0, r6, r3, r9, r2)
        L_0x00cc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d01.C58009f.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
