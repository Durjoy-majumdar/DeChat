package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C49335eu3;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.s */
public final class C2131s extends C87413o implements C32229r<Integer, Integer, String, C49335eu3, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C1256g<Bundle> f12101d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2131s(C1256g<Bundle> gVar) {
        super(4);
        this.f12101d = gVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        String str = (String) obj3;
        C49335eu3 eu32 = (C49335eu3) obj4;
        C87412m.m108594g(str, "errMsg");
        C87412m.m108594g(eu32, "resp");
        Bundle bundle = new Bundle();
        bundle.putInt("errType", intValue);
        bundle.putInt("errCode", intValue2);
        bundle.putString("errMsg", str);
        bundle.putByteArray("resp", eu32.toByteArray());
        this.f12101d.mo894a(bundle);
        return C13598b0.f38549a;
    }
}
