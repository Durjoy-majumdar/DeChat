package cw0;

import android.content.Context;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

public class c$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f349521d;

    /* renamed from: e */
    public final /* synthetic */ int f349522e;

    /* renamed from: f */
    public final /* synthetic */ String f349523f;

    /* renamed from: g */
    public final /* synthetic */ boolean f349524g;

    public c$$e(Context context, int i, String str, boolean z) {
        this.f349521d = context;
        this.f349522e = i;
        this.f349523f = str;
        this.f349524g = z;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/base/model/ShortcutUtil$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C116542c.m164364a(this.f349521d, false, this.f349522e, this.f349523f, this.f349524g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/base/model/ShortcutUtil$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
