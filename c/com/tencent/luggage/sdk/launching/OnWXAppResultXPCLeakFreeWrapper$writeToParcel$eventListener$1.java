package com.tencent.luggage.sdk.launching;

import android.os.Parcelable;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/luggage/sdk/launching/OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/luggage/sdk/launching/OnWXAppResultLocalEvent;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1 extends IListener<OnWXAppResultLocalEvent> {

    /* renamed from: d */
    public final /* synthetic */ int f234912d;

    /* renamed from: e */
    public final /* synthetic */ C80242c<Parcelable> f234913e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnWXAppResultXPCLeakFreeWrapper$writeToParcel$eventListener$1(int i, C80242c<Parcelable> cVar, C40008f fVar) {
        super(fVar);
        this.f234912d = i;
        this.f234913e = cVar;
    }

    public boolean callback(IEvent iEvent) {
        OnWXAppResultLocalEvent onWXAppResultLocalEvent = (OnWXAppResultLocalEvent) iEvent;
        C87412m.m108594g(onWXAppResultLocalEvent, "event");
        if (this.f234912d != onWXAppResultLocalEvent.f234909d) {
            return false;
        }
        int i = onWXAppResultLocalEvent.f234910e;
        if (i == 1) {
            C80242c<Parcelable> cVar = this.f234913e;
            Parcelable parcelable = onWXAppResultLocalEvent.f234911f;
            if (!(parcelable instanceof Parcelable)) {
                parcelable = null;
            }
            cVar.mo111345a(parcelable);
        } else if (i != 2) {
            return false;
        } else {
            dead();
        }
        return true;
    }
}
