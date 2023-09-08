package qv2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import pv2.C77292s;
import ut3.C22662b;
import yt3.C112486e;
import yt3.C23353r;

/* renamed from: qv2.i */
public class C110479i extends C23353r {
    public C110479i(Context context, C112486e eVar) {
        super(context, eVar);
    }

    /* renamed from: h */
    public void mo36847h(String str, int[] iArr) {
        Log.m105926v("MicroMsg.SoterTaskInitForWX", "alvinluo generateAuthKeyNames");
        for (int i : iArr) {
            String d = C77292s.m93117d(i);
            Log.m105925i("MicroMsg.SoterTaskInitForWX", "alvinluo scene: %d, authKeyName: %s", Integer.valueOf(i), d);
            C22662b.m26538b().mo35774a().put(i, d);
        }
    }
}
