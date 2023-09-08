package ps2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import p749xh.C102646h;
import rx3.C13598b0;

/* renamed from: ps2.t */
public class C100893t implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f295457d;

    /* renamed from: e */
    public final /* synthetic */ Context f295458e;

    /* renamed from: f */
    public final /* synthetic */ int f295459f;

    public C100893t(String str, Context context, int i) {
        this.f295457d = str;
        this.f295458e = context;
        this.f295459f = i;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$2");
        String str = (String) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$2");
        Log.m105924i("AdLandingPagesParseHelper", "jumpNative() use old xml");
        C100894u.m132243w(this.f295457d, C102646h.COL_ADXML, this.f295458e, false, this.f295459f);
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$2");
        return b0Var;
    }
}
