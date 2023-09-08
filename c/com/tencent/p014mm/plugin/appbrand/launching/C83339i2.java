package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.C83606m1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import java.util.concurrent.CountDownLatch;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.i2 */
public final class C83339i2 extends C87413o implements C32227p<Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83399o2 f243533d;

    /* renamed from: e */
    public final /* synthetic */ CountDownLatch f243534e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83339i2(C83399o2 o2Var, CountDownLatch countDownLatch) {
        super(2);
        this.f243533d = o2Var;
        this.f243534e = countDownLatch;
    }

    public Object invoke(Object obj, Object obj2) {
        String str;
        int intValue = ((Number) obj).intValue();
        String str2 = (String) obj2;
        Log.m105920e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "waitForPkgList onError(" + intValue + ", " + str2 + ')');
        if (!C81289m.C81290a.m99663a(this.f243533d.f243677e) || 111 != intValue) {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            sb.append(C84737f0.m104395b(C0966R.string.f7812sb, 2, Integer.valueOf(intValue)));
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (z) {
                str = "";
            } else {
                str = 10 + str2;
            }
            sb.append(str);
            this.f243533d.mo115677f(sb.toString());
        } else {
            this.f243533d.mo115676e();
        }
        C83399o2 o2Var = this.f243533d;
        C83606m1.m102637a(o2Var.f243676d, o2Var.f243677e, o2Var.f243681i, o2Var.f243678f, intValue);
        this.f243534e.countDown();
        return C13598b0.f38549a;
    }
}
