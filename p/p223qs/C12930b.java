package p223qs;

import android.content.Context;
import com.tencent.p014mm.model.gdpr.C1289a;
import com.tencent.p014mm.model.gdpr.C1290b;
import com.tencent.p014mm.model.gdpr.C1291c;
import com.tencent.p014mm.model.gdpr.C1292f;
import com.tencent.p014mm.model.gdpr.C40344e;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import nr3.C89060f;
import p229rs.C13102b;

@C86522b
/* renamed from: qs.b */
public class C12930b extends C86301e implements C13102b {
    public boolean cb0() {
        return C1292f.m1381a();
    }

    /* renamed from: mY */
    public void mo12480mY(Context context, C1289a aVar, String str, C1290b bVar) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        if (!C1292f.m1381a()) {
            bVar.mo1216a(0);
        } else if (Util.isNullOrNil(str)) {
            bVar.mo1216a(1);
        } else {
            C89060f.m111322a().mo123064p(new C40344e(aVar, str, bVar)).mo123420E(new C1291c(bVar, context, aVar, str));
        }
    }
}
