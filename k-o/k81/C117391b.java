package k81;

import com.tencent.p014mm.sdk.platformtools.Log;
import l81.C117464a;
import l81.C117465b;

/* renamed from: k81.b */
public class C117391b {
    /* renamed from: a */
    public static C117392c m165531a(int i) {
        if (i == 1) {
            return new C117465b();
        }
        if (i == 2) {
            return new C117464a();
        }
        Log.m105920e("EdgeComputingDataCacheFactory", "[EdgeComputingDataCacheFactory] create error type : " + i);
        return null;
    }
}
