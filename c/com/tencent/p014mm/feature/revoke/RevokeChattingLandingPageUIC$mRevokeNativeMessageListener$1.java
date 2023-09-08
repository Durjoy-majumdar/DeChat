package com.tencent.p014mm.feature.revoke;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/feature/revoke/RevokeChattingLandingPageUIC$mRevokeNativeMessageListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/RevokeNativeMsgEvent;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC$mRevokeNativeMessageListener$1 */
public final class RevokeChattingLandingPageUIC$mRevokeNativeMessageListener$1 extends IListener<RevokeNativeMsgEvent> {

    /* renamed from: d */
    public final /* synthetic */ RevokeChattingLandingPageUIC f195303d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RevokeChattingLandingPageUIC$mRevokeNativeMessageListener$1(AppCompatActivity appCompatActivity, RevokeChattingLandingPageUIC revokeChattingLandingPageUIC) {
        super(appCompatActivity);
        this.f195303d = revokeChattingLandingPageUIC;
    }

    public boolean callback(IEvent iEvent) {
        RevokeNativeMsgEvent revokeNativeMsgEvent = (RevokeNativeMsgEvent) iEvent;
        C87412m.m108594g(revokeNativeMsgEvent, "event");
        Log.m105924i("MRevokeChat.LandingPageUIC", "RevokeNativeMsgEvent called with: eventMsgId:" + revokeNativeMsgEvent.f78950d.f78951a + " openMsgId:" + this.f195303d.mo93514i3() + ' ');
        RevokeChattingLandingPageUIC revokeChattingLandingPageUIC = this.f195303d;
        long j = revokeNativeMsgEvent.f78950d.f78951a;
        long i3 = revokeChattingLandingPageUIC.mo93514i3();
        if (i3 != 0 && j == i3) {
            this.f195303d.mo93515j3();
        }
        return false;
    }
}
