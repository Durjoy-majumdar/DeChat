package wd3;

import android.view.View;
import android.view.ViewGroup;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wd3.i0 */
public class C78571i0 implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f230182d;

    /* renamed from: e */
    public final /* synthetic */ int f230183e;

    /* renamed from: f */
    public final /* synthetic */ C78569g0 f230184f;

    public C78571i0(C78569g0 g0Var, ViewGroup viewGroup, int i) {
        this.f230184f = g0Var;
        this.f230182d = viewGroup;
        this.f230183e = i;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ContactListRow$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        boolean a = this.f230184f.f230177h.mo1069a(this.f230182d, view, this.f230183e);
        C117292a.m165362h(a, this, "com/tencent/mm/pluginsdk/ui/applet/ContactListRow$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return a;
    }
}
