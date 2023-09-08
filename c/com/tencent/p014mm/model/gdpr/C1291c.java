package com.tencent.p014mm.model.gdpr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.tencent.p014mm.model.gdpr.p795ui.MPGdprPolicyUI;
import hp3.C87581a;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.model.gdpr.c */
public class C1291c implements C87581a<Void, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C1290b f10393a;

    /* renamed from: b */
    public final /* synthetic */ Context f10394b;

    /* renamed from: c */
    public final /* synthetic */ C1289a f10395c;

    /* renamed from: d */
    public final /* synthetic */ String f10396d;

    public C1291c(C1290b bVar, Context context, C1289a aVar, String str) {
        this.f10393a = bVar;
        this.f10394b = context;
        this.f10395c = aVar;
        this.f10396d = str;
    }

    public Object call(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        Intent putExtra = new Intent(this.f10394b, MPGdprPolicyUI.class).putExtra("MPGdprPolicyUI_KEY_BUSINESS", this.f10395c.f10391d).putExtra("MPGdprPolicyUI_KEY_APPID", this.f10396d).putExtra("MPGdprPolicyUI_KEY_RECEIVER", new MPGdprPolicyUtil$1$1(this, new Handler(Looper.getMainLooper())));
        if (!(this.f10394b instanceof Activity)) {
            putExtra.addFlags(268435456);
        }
        Context context = this.f10394b;
        C9556a aVar = new C9556a();
        aVar.mo10233c(putExtra);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/model/gdpr/MPGdprPolicyUtil$1", "call", "(Ljava/lang/Boolean;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/model/gdpr/MPGdprPolicyUtil$1", "call", "(Ljava/lang/Boolean;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }
}
