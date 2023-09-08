package dk0;

import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.concurrent.TimeUnit;
import rx3.C13604l;

/* renamed from: dk0.b */
public final class C7356b {

    /* renamed from: a */
    public static final C7356b f25481a = new C7356b();

    /* renamed from: b */
    public static final long f25482b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: c */
    public static final MultiProcessMMKV f25483c = MultiProcessMMKV.getMMKV("jsapi_ipc_big_data_transfer");

    /* renamed from: a */
    public final byte[] mo8528a(String str, boolean z) {
        C87412m.m108594g(str, "key");
        MultiProcessMMKV multiProcessMMKV = f25483c;
        byte[] decodeBytes = multiProcessMMKV.decodeBytes(str);
        if (z) {
            multiProcessMMKV.remove(str);
        }
        C87412m.m108593f(decodeBytes, "mmkv.decodeBytes(key).al…mkv.remove(key)\n        }");
        return decodeBytes;
    }

    /* renamed from: b */
    public final C13604l<Boolean, String> mo8529b(byte[] bArr) {
        C87412m.m108594g(bArr, "data");
        if (bArr.length < 102400) {
            return new C13604l<>(Boolean.FALSE, "");
        }
        String str = SystemClock.elapsedRealtimeNanos() + "";
        f25483c.encode(str, bArr);
        return new C13604l<>(Boolean.TRUE, str);
    }
}
