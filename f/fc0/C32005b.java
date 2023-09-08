package fc0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86301e;
import ei3.C86522b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: fc0.b */
public class C32005b extends C86301e {

    /* renamed from: d */
    public static MMHandler f85212d;

    public void onAccountInitialized(Context context) {
        MMHandler mMHandler = f85212d;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
    }

    public void onAccountReleased(Context context) {
        MMHandler mMHandler = f85212d;
        if (mMHandler != null) {
            mMHandler.removeCallbacksAndMessages((Object) null);
        }
    }
}
