package hf2;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoMoreInofUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;

/* renamed from: hf2.c */
public class C8517c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f27554d;

    /* renamed from: e */
    public final /* synthetic */ NewBizInfoMoreInofUI f27555e;

    public C8517c(NewBizInfoMoreInofUI newBizInfoMoreInofUI, String str) {
        this.f27555e = newBizInfoMoreInofUI;
        this.f27554d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("tel:" + this.f27554d));
        if (Util.isIntentAvailable(this.f27555e, intent, true)) {
            try {
                NewBizInfoMoreInofUI newBizInfoMoreInofUI = this.f27555e;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(newBizInfoMoreInofUI, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                newBizInfoMoreInofUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(newBizInfoMoreInofUI, "com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI$4", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NewBizInfoMoreInofUI", e, "", new Object[0]);
            }
        }
    }
}
