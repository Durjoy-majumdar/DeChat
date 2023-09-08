package sh3;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: sh3.h */
public final class C13680h extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bundle f38726d;

    /* renamed from: e */
    public final /* synthetic */ C1256g<Bundle> f38727e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13680h(Bundle bundle, C1256g<Bundle> gVar) {
        super(1);
        this.f38726d = bundle;
        this.f38727e = gVar;
    }

    public Object invoke(Object obj) {
        this.f38726d.putBoolean("task_result", ((Boolean) obj).booleanValue());
        C1256g<Bundle> gVar = this.f38727e;
        if (gVar != null) {
            gVar.mo894a(this.f38726d);
        }
        return C13598b0.f38549a;
    }
}
