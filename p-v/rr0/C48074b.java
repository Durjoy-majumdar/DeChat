package rr0;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C40492b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: rr0.b */
public final class C48074b implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ String f128921d;

    /* renamed from: e */
    public final /* synthetic */ MMActivity f128922e;

    public C48074b(String str, MMActivity mMActivity) {
        this.f128921d = str;
        this.f128922e = mMActivity;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        String str = this.f128921d;
        C87412m.m108594g(str, "uuid");
        new C40492b(str, 5, "{\"errMsg\":\"standaloneFunctionalDirectApi:ok\"}").mo9225i();
        Log.m105924i("MicroMsg.StandaloneFunctionalDirectApiHandler", "openFeedback: uuid(" + this.f128921d + ") feedback finished");
        this.f128922e.finish();
    }
}
