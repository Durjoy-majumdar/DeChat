package lv2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86301e;
import ei3.C86522b;
import pv2.C77292s;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: lv2.c */
public class C34385c extends C86301e {

    /* renamed from: d */
    public int f92602d = 0;

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C77292s.m93119f();
        new MTimerHandler(new C34383b(this), true).startTimer(100, 1000);
    }
}
