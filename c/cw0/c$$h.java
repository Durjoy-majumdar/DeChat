package cw0;

import android.content.Context;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

public class c$$h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f349536d;

    /* renamed from: e */
    public final /* synthetic */ int f349537e;

    /* renamed from: f */
    public final /* synthetic */ String f349538f;

    /* renamed from: g */
    public final /* synthetic */ boolean f349539g;

    public c$$h(Context context, int i, String str, boolean z) {
        this.f349536d = context;
        this.f349537e = i;
        this.f349538f = str;
        this.f349539g = z;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/base/model/ShortcutUtil$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C116542c.m164364a(this.f349536d, false, this.f349537e, this.f349538f, this.f349539g);
        C117292a.m165361g(this, "com/tencent/mm/plugin/base/model/ShortcutUtil$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
