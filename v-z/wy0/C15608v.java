package wy0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;

/* renamed from: wy0.v */
public final class C15608v {

    /* renamed from: a */
    public long f42231a = System.currentTimeMillis();

    /* renamed from: a */
    public final void mo14358a(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, StateEvent.Name.MESSAGE);
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i(str, '(' + (currentTimeMillis - this.f42231a) + " ms) " + str2);
        this.f42231a = currentTimeMillis;
    }
}
