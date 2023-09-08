package rl0;

import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$NativeToWxa$OnNativePostDataMessage;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: rl0.f */
public final class C90005f extends C87413o implements C32226l<C80264l, LuggageClientProcessMessage<?>> {

    /* renamed from: d */
    public final /* synthetic */ String f258593d;

    /* renamed from: e */
    public final /* synthetic */ String f258594e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90005f(String str, String str2) {
        super(1);
        this.f258593d = str;
        this.f258594e = str2;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((C80264l) obj, LocaleUtil.ITALIAN);
        return new NativeDataChannel$NativeToWxa$OnNativePostDataMessage(this.f258593d, this.f258594e);
    }
}
