package p690sw;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MMUncaughtExceptionHandler;
import di3.C86301e;
import ei3.C86522b;
import p212oe.C89205v;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: sw.e */
public class C90360e extends C86301e {
    public void onCreate(Context context) {
        super.onCreate(context);
        MMUncaughtExceptionHandler.setAfterReport(new e$$b(this));
        C89205v.f257038e = new e$$a();
    }
}
