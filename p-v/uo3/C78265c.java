package uo3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;

/* renamed from: uo3.c */
public class C78265c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f229276d;

    /* renamed from: e */
    public final /* synthetic */ C78253a f229277e;

    public C78265c(C78253a aVar, int i) {
        this.f229277e = aVar;
        this.f229276d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/menu/MMPopupMenu$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C78253a aVar = this.f229277e;
        C11184p0 p0Var = aVar.f229251t;
        if (p0Var != null) {
            p0Var.onMMMenuItemSelected(aVar.f229254w.getItem(this.f229276d), this.f229276d);
        }
        C78253a aVar2 = this.f229277e;
        C11184p0 p0Var2 = aVar2.f229252u;
        if (p0Var2 != null) {
            p0Var2.onMMMenuItemSelected(aVar2.f229254w.getItem(this.f229276d), this.f229276d);
        }
        this.f229277e.f229244j.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
