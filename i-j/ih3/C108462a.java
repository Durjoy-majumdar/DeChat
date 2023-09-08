package ih3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bh3.C113177k;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sensitive.p135ui.PermissionDialogUI;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: ih3.a */
public final class C108462a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f324779d;

    /* renamed from: e */
    public final /* synthetic */ C113177k.C113179b f324780e;

    /* renamed from: f */
    public final /* synthetic */ C113177k.C113178a f324781f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108462a(C32226l<? super Boolean, C13598b0> lVar, C113177k.C113179b bVar, C113177k.C113178a aVar) {
        super(0);
        this.f324779d = lVar;
        this.f324780e = bVar;
        this.f324781f = aVar;
    }

    public Object invoke() {
        Context context;
        WeakReference<Activity> e = AppForegroundDelegate.INSTANCE.mo174211e();
        if (e == null || (context = e.get()) == null) {
            context = MMApplicationContext.getContext();
        }
        Intent intent = new Intent();
        C113177k.C113179b bVar = this.f324780e;
        C113177k.C113178a aVar = this.f324781f;
        C32226l<? super Boolean, C13598b0> lVar = PermissionDialogUI.f318526d;
        intent.putExtra("KEY_PERMISSION", bVar.f338672d);
        intent.putExtra("KEY_BUSINESS", aVar.f338661d);
        if (((context instanceof Activity) ^ true ? context : null) != null) {
            intent.addFlags(268435456);
        }
        intent.setClass(context, PermissionDialogUI.class);
        PermissionDialogUI.f318526d = this.f324779d;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return C13598b0.f38549a;
    }
}
