package gm3;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.matrix.MatrixSettingUI;
import com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity;
import j20.C117292a;
import k20.C9556a;

public final /* synthetic */ class c$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f27324d;

    public /* synthetic */ c$$c(Context context) {
        this.f27324d = context;
    }

    public final void run() {
        Context context = this.f27324d;
        if (MatrixSettingUI.m106233H7()) {
            Intent intent = new Intent(context, MMBatteryStatsActivity.class);
            intent.addFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/matrix/MatrixSettingUI", "lambda$showTopThreadIndicator$3", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/ui/matrix/MatrixSettingUI", "lambda$showTopThreadIndicator$3", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
