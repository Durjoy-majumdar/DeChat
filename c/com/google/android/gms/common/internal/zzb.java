package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

final class zzb extends DialogRedirect {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ Intent zzsh;

    public zzb(Intent intent, Activity activity, int i) {
        this.zzsh = intent;
        this.val$activity = activity;
        this.val$requestCode = i;
    }

    public final void redirect() {
        Intent intent = this.zzsh;
        if (intent != null) {
            Activity activity = this.val$activity;
            int i = this.val$requestCode;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/google/android/gms/common/internal/zzb", "redirect", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
