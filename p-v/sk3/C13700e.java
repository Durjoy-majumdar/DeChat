package sk3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;
import rk3.C63462a;

/* renamed from: sk3.e */
public final class C13700e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f38772d;

    public C13700e(C101218e0 e0Var) {
        this.f38772d = e0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f38772d.mo140680z();
        C63462a.f180011a.mo88330e(103);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showSettingPermissionDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
