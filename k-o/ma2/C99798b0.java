package ma2;

import android.content.Context;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import qc0.C101106m;
import qo3.C47883u;
import te3.C64488kb1;

/* renamed from: ma2.b0 */
public final class C99798b0 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Context f292477a;

    /* renamed from: b */
    public final /* synthetic */ C101106m f292478b;

    /* renamed from: c */
    public final /* synthetic */ C64488kb1 f292479c;

    /* renamed from: d */
    public final /* synthetic */ C44580q1 f292480d;

    public C99798b0(Context context, C101106m mVar, C64488kb1 kb12, C44580q1 q1Var) {
        this.f292477a = context;
        this.f292478b = mVar;
        this.f292479c = kb12;
        this.f292480d = q1Var;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        try {
            C99811k0.f292499a.mo139169c(this.f292477a, this.f292478b, this.f292479c);
            C44580q1 q1Var = this.f292480d;
            if (q1Var != null) {
                q1Var.mo1579a(true, false);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MusicUIUtil", e, "launchQQMusic exception", new Object[0]);
            C44580q1 q1Var2 = this.f292480d;
            if (q1Var2 != null) {
                q1Var2.mo1579a(false, false);
            }
        }
    }
}
