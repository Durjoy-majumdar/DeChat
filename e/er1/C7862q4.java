package er1;

import android.app.Activity;
import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import hp3.C87581a;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C51123rl0;

/* renamed from: er1.q4 */
public final class C7862q4<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ Activity f26462a;

    /* renamed from: b */
    public final /* synthetic */ int f26463b;

    /* renamed from: c */
    public final /* synthetic */ C32224a<C13598b0> f26464c;

    /* renamed from: d */
    public final /* synthetic */ C32227p<Boolean, Boolean, C13598b0> f26465d;

    public C7862q4(Activity activity, int i, C32224a<C13598b0> aVar, C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
        this.f26462a = activity;
        this.f26463b = i;
        this.f26464c = aVar;
        this.f26465d = pVar;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256794b == -5002) {
            C7872s4 s4Var = C7872s4.f26479a;
            Activity activity = this.f26462a;
            int i = this.f26463b;
            String str = cVar.f256795c;
            C32224a<C13598b0> aVar = this.f26464c;
            C32227p<Boolean, Boolean, C13598b0> pVar = this.f26465d;
            Log.m105924i("FinderUtilsCmdUtils", "[handleJumpError] errMsg: " + str);
            if (Util.isNullOrNil(str)) {
                s4Var.mo8985e(2, true, false, pVar);
            } else {
                try {
                    C104289g gVar = new C104289g(str);
                    int optInt = gVar.optInt("show_type");
                    if (optInt == 0) {
                        C104289g k = gVar.getJSONObject("toast_config");
                        C87412m.m108593f(k, "toastConfig");
                        C51123rl0 g = s4Var.mo8987g(k);
                        if (g != null) {
                            aVar.invoke();
                            s4Var.mo8992m(activity, i, g, pVar);
                        }
                        s4Var.mo8985e(0, true, false, pVar);
                    } else if (optInt != 1) {
                        s4Var.mo8985e(0, true, false, pVar);
                    } else {
                        s4Var.mo8982b(activity, str);
                        s4Var.mo8985e(3, false, false, pVar);
                    }
                } catch (Exception e) {
                    Log.m105920e("FinderUtilsCmdUtils", "[handleJumpError] catch exception:" + e.getMessage());
                }
            }
        } else {
            C32227p<Boolean, Boolean, C13598b0> pVar2 = this.f26465d;
            Log.m105924i("FinderUtilsCmdUtils", "[handleOnEndCheck] enterType:1 confirm:true fromDialog:false");
            pVar2.invoke(Boolean.TRUE, Boolean.FALSE);
        }
        return C13598b0.f38549a;
    }
}
