package fk3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: fk3.i */
public final class C59148i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f169168d;

    /* renamed from: e */
    public final /* synthetic */ C59141h f169169e;

    public C59148i(C101218e0 e0Var, C59141h hVar) {
        this.f169168d = e0Var;
        this.f169169e = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showPermissionTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f169168d.mo140680z();
        this.f169169e.mo84357d();
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI$showPermissionTipsDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
