package wd3;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: wd3.h0 */
public class C78570h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f230179d;

    /* renamed from: e */
    public final /* synthetic */ int f230180e;

    /* renamed from: f */
    public final /* synthetic */ C78569g0 f230181f;

    public C78570h0(C78569g0 g0Var, ViewGroup viewGroup, int i) {
        this.f230181f = g0Var;
        this.f230179d = viewGroup;
        this.f230180e = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ContactListRow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C72741a.C72742c) this.f230181f.f230176g).mo100311a(this.f230179d, view, this.f230180e);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/ContactListRow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
