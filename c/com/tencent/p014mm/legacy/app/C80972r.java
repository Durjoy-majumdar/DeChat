package com.tencent.p014mm.legacy.app;

import android.content.DialogInterface;
import com.tencent.p014mm.legacy.app.WeChatSplashStartup;

/* renamed from: com.tencent.mm.legacy.app.r */
public class C80972r implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f237827d;

    public C80972r(WeChatSplashStartup.C80946c cVar, Runnable runnable) {
        this.f237827d = runnable;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f237827d.run();
    }
}
