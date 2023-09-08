package zp0;

import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.plugin.appbrand.networking.AppBrandWeakNetReceiver$WeakNetNotifyMessage;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: zp0.e */
public final class C91827e extends C87413o implements C32226l<C80264l, LuggageClientProcessMessage<?>> {

    /* renamed from: d */
    public final /* synthetic */ boolean f262933d;

    /* renamed from: e */
    public final /* synthetic */ int f262934e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91827e(boolean z, int i) {
        super(1);
        this.f262933d = z;
        this.f262934e = i;
    }

    public Object invoke(Object obj) {
        C80264l lVar = (C80264l) obj;
        C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
        return new AppBrandWeakNetReceiver$WeakNetNotifyMessage(lVar.f234965a, this.f262933d, this.f262934e);
    }
}
