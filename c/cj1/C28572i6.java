package cj1;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;

/* renamed from: cj1.i6 */
public final class C28572i6 implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C28574j6 f78436d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f78437e;

    public C28572i6(C28574j6 j6Var, Runnable runnable) {
        this.f78436d = j6Var;
        this.f78437e = runnable;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        int i = message.what;
        C28574j6 j6Var = this.f78436d;
        j6Var.getClass();
        if (i == 1) {
            Object obj = message.obj;
            if (obj instanceof Long) {
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj).longValue();
                this.f78436d.getClass();
                Log.m105924i("MicroMsg.SingleTaskLooper", this.f78436d.f78439a + " MSG_DISPATCH finish:" + this.f78436d.f78440b + " delay:" + longValue);
                if (this.f78436d.f78440b) {
                    this.f78436d.f78442d.sendEmptyMessageDelayed(0, longValue);
                    this.f78436d.f78440b = false;
                }
            }
        } else if (i == 2) {
            j6Var.f78440b = true;
            this.f78436d.getClass();
            Log.m105924i("MicroMsg.SingleTaskLooper", this.f78436d.f78439a + " MSG_FINISH finish:" + this.f78436d.f78440b);
        } else if (i == 0) {
            this.f78436d.getClass();
            Log.m105924i("MicroMsg.SingleTaskLooper", this.f78436d.f78439a + " MSG_RUN finish:" + this.f78436d.f78440b);
            Runnable runnable = this.f78437e;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            this.f78436d.getClass();
            Log.m105924i("MicroMsg.SingleTaskLooper", this.f78436d.f78439a + " invalid msg:" + message.what);
        }
        return true;
    }
}
