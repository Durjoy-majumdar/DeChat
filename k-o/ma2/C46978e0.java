package ma2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import qo3.C47883u;

/* renamed from: ma2.e0 */
public final class C46978e0 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Context f126303a;

    /* renamed from: b */
    public final /* synthetic */ Intent f126304b;

    /* renamed from: c */
    public final /* synthetic */ C44580q1 f126305c;

    public C46978e0(Context context, Intent intent, C44580q1 q1Var) {
        this.f126303a = context;
        this.f126304b = intent;
        this.f126305c = q1Var;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        try {
            Context context = this.f126303a;
            Intent intent = this.f126304b;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/music/model/MusicUIUtil$doJumpToQQMusicPayment$4", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/music/model/MusicUIUtil$doJumpToQQMusicPayment$4", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C44580q1 q1Var = this.f126305c;
            if (q1Var != null) {
                q1Var.mo1579a(true, false);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MusicUIUtil", e, "launchQQMusic exception", new Object[0]);
            C44580q1 q1Var2 = this.f126305c;
            if (q1Var2 != null) {
                q1Var2.mo1579a(false, false);
            }
        }
    }
}
