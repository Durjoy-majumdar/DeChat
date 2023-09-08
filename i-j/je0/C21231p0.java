package je0;

import android.os.Bundle;
import android.os.ResultReceiver;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: je0.p0 */
public final class C21231p0 {
    /* renamed from: a */
    public static final void m23719a(ResultReceiver resultReceiver, long j, boolean z, int i, String str) {
        C87412m.m108594g(str, "errMsg");
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("result_key_err_code", i);
            bundle.putString("result_key_err_msg", str);
            bundle.putInt("result_key_action", z ? 7 : 8);
            C13598b0 b0Var = C13598b0.f38549a;
            resultReceiver.send(i, bundle);
        }
    }

    /* renamed from: b */
    public static final void m23720b(ResultReceiver resultReceiver, long j, boolean z, int i, String str) {
        C87412m.m108594g(str, "errMsg");
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("result_key_err_code", i);
            bundle.putString("result_key_err_msg", str);
            bundle.putInt("result_key_action", z ? 3 : 4);
            C13598b0 b0Var = C13598b0.f38549a;
            resultReceiver.send(i, bundle);
        }
    }

    /* renamed from: c */
    public static final void m23721c(ResultReceiver resultReceiver, long j, boolean z, int i, String str) {
        C87412m.m108594g(str, "errMsg");
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("result_key_err_code", i);
            bundle.putString("result_key_err_msg", str);
            bundle.putInt("result_key_action", z ? 1 : 2);
            C13598b0 b0Var = C13598b0.f38549a;
            resultReceiver.send(i, bundle);
        }
    }
}
