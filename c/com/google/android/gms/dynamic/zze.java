package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import j20.C117292a;
import k20.C9556a;

final class zze implements View.OnClickListener {
    private byte _hellAccFlag_;
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ Intent zzabl;

    public zze(Context context, Intent intent) {
        this.val$context = context;
        this.zzabl = intent;
    }

    public final void onClick(View view) {
        try {
            Context context = this.val$context;
            Intent intent = this.zzabl;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/google/android/gms/dynamic/zze", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/google/android/gms/dynamic/zze", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (ActivityNotFoundException unused) {
        }
    }
}
