package dk0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;

/* renamed from: dk0.a */
public final class C7355a implements Runnable {

    /* renamed from: d */
    public static final C7355a f25480d = new C7355a();

    public final void run() {
        C85801v1 i;
        long nowMilliSecond;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_APPBRAND_JSAPI_BIG_DATA_TRANSFER_MMKV_CHECK_CLEAN_TIMESTAMP_LONG;
        try {
            if (C86709a0.m107535s().mo121142i().mo119673G(aVar, 0) + C7356b.f25482b <= Util.nowMilliSecond()) {
                MultiProcessMMKV multiProcessMMKV = C7356b.f25483c;
                boolean z = multiProcessMMKV.totalSize() >= 20971520;
                Log.m105925i("JsApiIpcBigDataTransfer", "do check  mmkv file too large, needClear[%b]", Boolean.valueOf(z));
                if (z) {
                    multiProcessMMKV.clearAll();
                }
                i = C86709a0.m107535s().mo121142i();
                nowMilliSecond = Util.nowMilliSecond();
                i.mo119677K(aVar, Long.valueOf(nowMilliSecond));
            }
        } catch (Throwable unused) {
        }
    }
}
