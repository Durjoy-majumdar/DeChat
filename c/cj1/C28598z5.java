package cj1;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;

/* renamed from: cj1.z5 */
public final class C28598z5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f78486d;

    public C28598z5(Intent intent) {
        this.f78486d = intent;
    }

    public final void run() {
        Intent intent = this.f78486d;
        if (intent != null) {
            MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("live_exception_monitor");
            if (C87412m.m108589b("android.intent.action.SCREEN_ON", intent.getAction())) {
                singleMMKV.putBoolean("PARAM_IS_SCREEN_OFF", false);
                singleMMKV.commit();
            } else if (C87412m.m108589b("android.intent.action.SCREEN_OFF", intent.getAction())) {
                singleMMKV.putBoolean("PARAM_IS_SCREEN_OFF", true);
                singleMMKV.commit();
            }
        }
    }
}
