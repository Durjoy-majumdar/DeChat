package com.tencent.p014mm.p136ui.transmit;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.p136ui.LauncherUI;
import j20.C117292a;
import k20.C9556a;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.ui.transmit.TaskRedirectUI */
public class TaskRedirectUI extends HellActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, LauncherUI.class);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/transmit/TaskRedirectUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/ui/transmit/TaskRedirectUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }
}
