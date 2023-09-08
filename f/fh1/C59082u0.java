package fh1;

import android.view.View;
import cj1.C0581o5;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import wo1.C66157k;

/* renamed from: fh1.u0 */
public final class C59082u0 extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59046m0 f169037d;

    /* renamed from: e */
    public final /* synthetic */ C0581o5 f169038e;

    /* renamed from: f */
    public final /* synthetic */ View f169039f;

    /* renamed from: g */
    public final /* synthetic */ C66157k f169040g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59082u0(C59046m0 m0Var, C0581o5 o5Var, View view, C66157k kVar) {
        super(1);
        this.f169037d = m0Var;
        this.f169038e = o5Var;
        this.f169039f = view;
        this.f169040g = kVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        String str = this.f169037d.f168949j;
        Log.m105924i(str, "choose popupType:" + intValue + '!');
        if (intValue == 165 || intValue == 166) {
            C59046m0.m68966m3(this.f169037d, this.f169038e, this.f169039f, this.f169040g);
        }
        return C13598b0.f38549a;
    }
}
