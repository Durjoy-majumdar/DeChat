package ka0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.locks.ReentrantLock;
import rx3.C13598b0;

/* renamed from: ka0.h */
public final class C33854h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C33854h f91496d = new C33854h();

    public C33854h() {
        super(0);
    }

    public Object invoke() {
        String str = "";
        ReentrantLock reentrantLock = C33848g.f91490d;
        reentrantLock.lock();
        try {
            Log.m105924i("MicroMsg.MaasSdkResMgr", "checkSoSha1: ");
            C33848g gVar = C33848g.f91487a;
            String d = gVar.mo59324d(gVar.mo59325e());
            StringBuilder sb = new StringBuilder();
            sb.append("checkSoSha1: so:");
            sb.append(d);
            sb.append(" record:");
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("maas_sdk");
            C87412m.m108593f(mmkv, "getMMKV(kvName)");
            String string = mmkv.getString("KEY_SDK_SHA1", str);
            if (string == null) {
                string = str;
            }
            sb.append(string);
            Log.m105924i("MicroMsg.MaasSdkResMgr", sb.toString());
            MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("maas_sdk");
            C87412m.m108593f(mmkv2, "getMMKV(kvName)");
            String string2 = mmkv2.getString("KEY_SDK_SHA1", str);
            if (string2 != null) {
                str = string2;
            }
            if (!C87412m.m108589b(d, str)) {
                C86013q1.m106447h(gVar.mo59325e());
            }
            reentrantLock.unlock();
            return C13598b0.f38549a;
        } catch (Throwable th) {
            C33848g.f91490d.unlock();
            throw th;
        }
    }
}
