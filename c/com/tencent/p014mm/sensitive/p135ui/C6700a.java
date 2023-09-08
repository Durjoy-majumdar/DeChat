package com.tencent.p014mm.sensitive.p135ui;

import android.app.Activity;
import android.content.Intent;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.sensitive.ui.a */
public final class C6700a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f24101d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6700a(Activity activity) {
        super(0);
        this.f24101d = activity;
    }

    public Object invoke() {
        Activity activity = this.f24101d;
        Intent intent = activity.getIntent();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$2$realShow$1$1$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$2$realShow$1$1$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return C13598b0.f38549a;
    }
}
