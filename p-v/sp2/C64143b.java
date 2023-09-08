package sp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58087u0;
import fy3.C32226l;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: sp2.b */
public final class C64143b extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f181854d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64143b(String str) {
        super(1);
        this.f181854d = str;
    }

    /* JADX INFO: finally extract failed */
    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$2");
        Log.m105924i("AdPullRequestHelper", "task of " + this.f181854d + " is end! cause = " + ((Throwable) obj));
        Map b = C101690c.m133572b();
        String str = this.f181854d;
        synchronized (b) {
            try {
                C58087u0 u0Var = (C58087u0) C101690c.m133572b().remove(str);
            } catch (Throwable th) {
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$2");
                throw th;
            }
        }
        Map a = C101690c.m133571a();
        String str2 = this.f181854d;
        synchronized (a) {
            try {
                C101690c.m133571a().remove(str2);
                C13598b0 b0Var = C13598b0.f38549a;
            } catch (Throwable th4) {
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$2");
                throw th4;
            }
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$2");
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$2");
        return b0Var2;
    }
}
