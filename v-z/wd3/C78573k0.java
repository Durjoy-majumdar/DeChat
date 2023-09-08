package wd3;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import j20.C117292a;
import java.util.ArrayList;
import p609mp.C76805e;

/* renamed from: wd3.k0 */
public class C78573k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f230186d;

    /* renamed from: e */
    public final /* synthetic */ int f230187e;

    /* renamed from: f */
    public final /* synthetic */ C78569g0 f230188f;

    public C78573k0(C78569g0 g0Var, ViewGroup viewGroup, int i) {
        this.f230188f = g0Var;
        this.f230186d = viewGroup;
        this.f230187e = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ContactListRow$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76805e.C76806a aVar = this.f230188f.f230176g;
        if (aVar != null) {
            ((C72741a.C72742c) aVar).mo100311a(this.f230186d, view, this.f230187e);
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/ContactListRow$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
