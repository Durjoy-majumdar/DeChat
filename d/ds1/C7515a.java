package ds1;

import android.content.Context;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C7865r3;
import up1.C37521f;

/* renamed from: ds1.a */
public final class C7515a {

    /* renamed from: a */
    public static final C7515a f25777a = new C7515a();

    /* renamed from: b */
    public static float f25778b;

    /* renamed from: a */
    public final float mo8637a(Context context) {
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        int c = C75044y4.m89991c(context);
        C7865r3 r3Var = C7865r3.f26468a;
        int c2 = r3Var.mo8970c();
        int a = r3Var.mo8968a() - c;
        float f = ((float) c2) * 0.5625f;
        float f2 = (float) a;
        float f3 = f2 - f;
        float f4 = f25778b;
        boolean z = false;
        if (!(f4 == 0.0f) && f3 < f4) {
            f = f2 - f4;
            Log.m105928w("FinderHalfScreenConstants", "getHalfScreenRatio change from:" + f3 + " to:" + f25778b);
        }
        float f5 = f / f2;
        C37521f.f99374d.getClass();
        if (C37521f.f99579z7.mo60266n().intValue() == 1) {
            z = true;
        }
        if (!z || f5 <= 0.0f || f5 >= 1.0f) {
            return 0.75f;
        }
        return ((float) 1) - f5;
    }
}
