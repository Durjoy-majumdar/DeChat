package qs0;

import android.os.Handler;
import com.tencent.p014mm.plugin.appbrand.utils.C29680s;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import in0.C87761e;
import kn0.C88236n;
import ns0.C89083d;
import ns0.C89084e;

/* renamed from: qs0.b */
public final class C89831b implements C89083d {

    /* renamed from: a */
    public final /* synthetic */ Handler f258243a;

    public C89831b(Handler handler) {
        this.f258243a = handler;
    }

    /* renamed from: a */
    public final C87761e mo123095a(C89084e eVar) {
        C87412m.m108594g(eVar, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.AppBrandThumbExoCompositeMediaPlayerProvider", "provide, LuggageExoMediaPlayer");
        return new C88236n(this.f258243a, C29680s.m38858c(), C29680s.m38857b(), C29680s.m38856a());
    }
}
