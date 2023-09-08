package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19556e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import qo3.C47883u;

/* renamed from: com.tencent.mm.pluginsdk.model.f1$$a */
public final /* synthetic */ class f1$$a implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ String f54918a;

    /* renamed from: b */
    public final /* synthetic */ String f54919b;

    /* renamed from: c */
    public final /* synthetic */ String f54920c;

    /* renamed from: d */
    public final /* synthetic */ String f54921d;

    /* renamed from: e */
    public final /* synthetic */ String f54922e;

    /* renamed from: f */
    public final /* synthetic */ Context f54923f;

    /* renamed from: g */
    public final /* synthetic */ int f54924g;

    public /* synthetic */ f1$$a(String str, String str2, String str3, String str4, String str5, Context context, int i) {
        this.f54918a = str;
        this.f54919b = str2;
        this.f54920c = str3;
        this.f54921d = str4;
        this.f54922e = str5;
        this.f54923f = context;
        this.f54924g = i;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        String str2 = this.f54918a;
        String str3 = this.f54919b;
        String str4 = this.f54920c;
        String str5 = this.f54921d;
        String str6 = this.f54922e;
        Context context = this.f54923f;
        int i = this.f54924g;
        if (!z) {
            return;
        }
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str3) || Util.isNullOrNil(str4)) {
            Log.m105920e("MicroMsg.QQBrowserHelper", "launchOrInstallQQBrowser: fail by NPE");
            return;
        }
        C19441d1.m20770b(str5, str4, str6, 152, context);
        Intent c = C19556e.m20956c(context, C19556e.m20958e(str4), str2, str3, i);
        if (Util.isIntentAvailable(context, c, false)) {
            Context context2 = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(c);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/pluginsdk/model/QQBrowserHelper", "lambda$launchOrInstallQQBrowser$0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/pluginsdk/model/QQBrowserHelper", "lambda$launchOrInstallQQBrowser$0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
