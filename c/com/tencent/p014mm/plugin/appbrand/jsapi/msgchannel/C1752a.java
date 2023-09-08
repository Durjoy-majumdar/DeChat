package com.tencent.p014mm.plugin.appbrand.jsapi.msgchannel;

import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.message.WxaAppMsgChannel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgchannel.a */
public final class C1752a extends C87413o implements C32226l<C80264l, LuggageClientProcessMessage<?>> {

    /* renamed from: d */
    public final /* synthetic */ String f11491d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<WxaAppMsgChannel> f11492e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1752a(String str, ArrayList<WxaAppMsgChannel> arrayList) {
        super(1);
        this.f11491d = str;
        this.f11492e = arrayList;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C80264l) obj, LocaleUtil.ITALIAN);
        return new AppBrandOnReceiveCacheMsgChannelBatchIPCMessage(this.f11491d, this.f11492e);
    }
}
