package wz0;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import k20.C9556a;

/* renamed from: wz0.e */
public class C15613e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f42237d;

    public C15613e(MMActivity mMActivity) {
        this.f42237d = mMActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        MMActivity mMActivity = this.f42237d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        MMActivity mMActivity2 = mMActivity;
        C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/card/util/CardDialogHelper$6", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/card/util/CardDialogHelper$6", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
