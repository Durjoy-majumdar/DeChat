package er1;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7888v2;
import java.util.ArrayList;
import te3.C64831xk1;

/* renamed from: er1.y2 */
public final class C58793y2 implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ C64831xk1 f168326a;

    public C58793y2(C64831xk1 xk12) {
        this.f168326a = xk12;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>(0);
        }
        if (i2 == -1) {
            C7888v2.C7889a.f26514a.getClass();
            String str = C7888v2.C7889a.f26515b;
            Log.m105924i(str, "share showWindow " + this.f168326a.f186326d + " to " + stringArrayListExtra);
            return;
        }
        C7888v2.C7889a.f26514a.getClass();
        String str2 = C7888v2.C7889a.f26515b;
        Log.m105924i(str2, "share showWindow " + this.f168326a.f186326d + " cancel");
    }
}
