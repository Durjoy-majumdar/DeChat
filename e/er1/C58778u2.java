package er1;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7888v2;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import te3.C64287ci1;

/* renamed from: er1.u2 */
public final class C58778u2 implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ C64287ci1 f168285a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<List<String>, C13598b0> f168286b;

    public C58778u2(C64287ci1 ci12, C32226l<? super List<String>, C13598b0> lVar) {
        this.f168285a = ci12;
        this.f168286b = lVar;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>(0);
        }
        if (i2 == -1) {
            C7888v2.C7889a.f26514a.getClass();
            String str = C7888v2.C7889a.f26515b;
            Log.m105924i(str, "share finderObject " + this.f168285a.f182502n + " to " + stringArrayListExtra);
        } else {
            C7888v2.C7889a.f26514a.getClass();
            String str2 = C7888v2.C7889a.f26515b;
            Log.m105924i(str2, "share finderObject " + this.f168285a.f182502n + " cancel");
        }
        C32226l<List<String>, C13598b0> lVar = this.f168286b;
        if (lVar != null) {
            lVar.invoke(stringArrayListExtra);
        }
    }
}
