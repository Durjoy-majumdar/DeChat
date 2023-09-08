package uo3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;

/* renamed from: uo3.b */
public class C78264b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f229274d;

    /* renamed from: e */
    public final /* synthetic */ C78253a f229275e;

    public C78264b(C78253a aVar, int i) {
        this.f229275e = aVar;
        this.f229274d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/menu/MMPopupMenu$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C78253a aVar = this.f229275e;
        C11184p0 p0Var = aVar.f229251t;
        if (p0Var != null) {
            p0Var.onMMMenuItemSelected(aVar.f229254w.getItem(this.f229274d), this.f229274d);
        }
        C78253a aVar2 = this.f229275e;
        C11184p0 p0Var2 = aVar2.f229252u;
        if (p0Var2 != null) {
            p0Var2.onMMMenuItemSelected(aVar2.f229254w.getItem(this.f229274d), this.f229274d);
        }
        this.f229275e.f229243i.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
