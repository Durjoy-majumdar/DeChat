package x02;

import android.content.Context;
import android.content.DialogInterface;

public class n$$d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f261336d;

    /* renamed from: e */
    public final /* synthetic */ C91124n f261337e;

    public n$$d(C91124n nVar, Context context) {
        this.f261337e = nVar;
        this.f261336d = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Context context = this.f261336d;
        context.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_before_install", this.f261337e.f261324d.f248344j).apply();
    }
}
