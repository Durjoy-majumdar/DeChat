package wd3;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import p609mp.C76805e;

/* renamed from: wd3.g0 */
public class C78569g0 implements C76805e {

    /* renamed from: a */
    public C78565f0 f230170a;

    /* renamed from: b */
    public int f230171b;

    /* renamed from: c */
    public int f230172c;

    /* renamed from: d */
    public boolean f230173d;

    /* renamed from: e */
    public boolean f230174e;

    /* renamed from: f */
    public View f230175f;

    /* renamed from: g */
    public C76805e.C76806a f230176g;

    /* renamed from: h */
    public C76805e.C76807b f230177h;

    /* renamed from: i */
    public View.OnClickListener f230178i = new C15147a(this);

    /* renamed from: wd3.g0$a */
    public class C15147a implements View.OnClickListener {
        public C15147a(C78569g0 g0Var) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/applet/ContactListRow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/applet/ContactListRow$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
