package com.tencent.luggage.sdk.launching;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper;

/* renamed from: com.tencent.luggage.sdk.launching.g */
public class C80246g extends C80242c<Parcelable> {

    /* renamed from: b */
    public final /* synthetic */ OnWXAppResultXPCWrapper f234924b;

    public C80246g(OnWXAppResultXPCWrapper onWXAppResultXPCWrapper) {
        this.f234924b = onWXAppResultXPCWrapper;
    }

    /* renamed from: a */
    public void mo111345a(Parcelable parcelable) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("parcel", new OnWXAppResultXPCWrapper.SafeParcelableWrapper(parcelable));
        this.f234924b.f234915e.send(-1, bundle);
    }
}
