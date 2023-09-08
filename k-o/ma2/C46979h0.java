package ma2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import qo3.C47883u;

/* renamed from: ma2.h0 */
public final class C46979h0 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Context f126306a;

    /* renamed from: b */
    public final /* synthetic */ Intent f126307b;

    /* renamed from: c */
    public final /* synthetic */ C44580q1 f126308c;

    public C46979h0(Context context, Intent intent, C44580q1 q1Var) {
        this.f126306a = context;
        this.f126307b = intent;
        this.f126308c = q1Var;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        try {
            Context context = this.f126306a;
            Intent intent = this.f126307b;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/music/model/MusicUIUtil$launchQQMusic$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/music/model/MusicUIUtil$launchQQMusic$1", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C44580q1 q1Var = this.f126308c;
            if (q1Var != null) {
                q1Var.mo1579a(true, false);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MusicUIUtil", e, "launchQQMusic exception", new Object[0]);
            C44580q1 q1Var2 = this.f126308c;
            if (q1Var2 != null) {
                q1Var2.mo1579a(false, false);
            }
        }
    }
}
