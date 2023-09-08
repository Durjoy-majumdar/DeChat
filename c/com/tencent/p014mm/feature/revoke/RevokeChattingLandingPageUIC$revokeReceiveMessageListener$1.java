package com.tencent.p014mm.feature.revoke;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/feature/revoke/RevokeChattingLandingPageUIC$revokeReceiveMessageListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/RevokeMsgEvent;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$revokeReceiveMessageListener$1 */
public final class RevokeChattingLandingPageUIC$revokeReceiveMessageListener$1 extends IListener<RevokeMsgEvent> {

    /* renamed from: d */
    public final /* synthetic */ RevokeChattingLandingPageUIC f195304d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RevokeChattingLandingPageUIC$revokeReceiveMessageListener$1(AppCompatActivity appCompatActivity, RevokeChattingLandingPageUIC revokeChattingLandingPageUIC) {
        super(appCompatActivity);
        this.f195304d = revokeChattingLandingPageUIC;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008e, code lost:
        if (r0 != false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
        /*
            r10 = this;
            com.tencent.mm.autogen.events.RevokeMsgEvent r11 = (com.tencent.p014mm.autogen.events.RevokeMsgEvent) r11
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RevokeMsgEvent called with: eventMsgId:"
            r0.append(r1)
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r1 = r11.f78943d
            long r1 = r1.f78944a
            r0.append(r1)
            java.lang.String r1 = " openMsgId:"
            r0.append(r1)
            com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC r1 = r10.f195304d
            long r1 = r1.mo93514i3()
            r0.append(r1)
            java.lang.String r1 = " eventMsgSrvId:"
            r0.append(r1)
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r1 = r11.f78943d
            long r1 = r1.f78948e
            r0.append(r1)
            java.lang.String r1 = " openMsgSrvId:"
            r0.append(r1)
            com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC r1 = r10.f195304d
            rx3.g r1 = r1.f195290e
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MRevokeChat.LandingPageUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC r0 = r10.f195304d
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r1 = r11.f78943d
            long r1 = r1.f78944a
            long r3 = r0.mo93514i3()
            r0 = 1
            r5 = 0
            r7 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x006c
            r1 = 1
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            if (r1 != 0) goto L_0x0090
            com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC r1 = r10.f195304d
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r11 = r11.f78943d
            long r2 = r11.f78948e
            rx3.g r11 = r1.f195290e
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            long r8 = r11.longValue()
            int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            if (r0 == 0) goto L_0x0095
        L_0x0090:
            com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC r11 = r10.f195304d
            r11.mo93515j3()
        L_0x0095:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.feature.revoke.RevokeChattingLandingPageUIC$revokeReceiveMessageListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
