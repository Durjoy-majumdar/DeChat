package xe2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;

/* renamed from: xe2.e */
public final class C102633e extends C98597b {

    /* renamed from: f */
    public MultiProcessMMKV f302223f;

    /* renamed from: g */
    public final String f302224g = "TIME";

    /* renamed from: h */
    public final String f302225h = "Buffer_";

    /* renamed from: i */
    public final String f302226i = "Quota_";

    /* renamed from: j */
    public final String f302227j = "QuotaCost_";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102633e(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "plugin");
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C87412m.m108594g(context, "context");
        this.f302223f = MultiProcessMMKV.getMMKV("PreDownloadCheckMMKV");
    }

    /* renamed from: g3 */
    public final long mo142291g3(int i) {
        MultiProcessMMKV multiProcessMMKV = this.f302223f;
        if (multiProcessMMKV == null) {
            return 0;
        }
        return multiProcessMMKV.decodeLong(this.f302226i + i, 0);
    }
}
