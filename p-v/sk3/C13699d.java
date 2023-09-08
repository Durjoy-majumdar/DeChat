package sk3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: sk3.d */
public final class C13699d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f38770d;

    /* renamed from: e */
    public final /* synthetic */ C13703i f38771e;

    public C13699d(C101218e0 e0Var, C13703i iVar) {
        this.f38770d = e0Var;
        this.f38771e = iVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showPermissionTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f38770d.mo140680z();
        C13703i.m13006c3(this.f38771e);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiImageQueryOpenUIC$showPermissionTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
