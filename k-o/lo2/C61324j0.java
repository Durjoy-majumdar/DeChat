package lo2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ht1.C60214y3;
import java.util.ArrayList;

/* renamed from: lo2.j0 */
public class C61324j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f174445d;

    /* renamed from: e */
    public final /* synthetic */ long f174446e;

    /* renamed from: f */
    public final /* synthetic */ FinderObject f174447f;

    public C61324j0(String str, long j, FinderObject finderObject) {
        this.f174445d = str;
        this.f174446e = j;
        this.f174447f = finderObject;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$2");
        try {
            MMApplicationContext.getContext().getSharedPreferences("ad_finder_feeds_preload_id_app_related", 0).edit().putLong(this.f174445d, this.f174446e).commit();
            Log.m105924i("FinderAdPreloadHelper", "reqFinderFeedsObjectIds received, encryptedObjectId is " + this.f174445d + ", objectId is " + this.f174446e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f174447f);
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            C60214y3 y3Var = C99544i0.f291801c;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper");
            y3Var.mo78736c(42, arrayList, 0);
        } catch (Throwable th) {
            Log.m105920e("FinderAdPreloadHelper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.FinderAdPreloadHelper$2");
    }
}
