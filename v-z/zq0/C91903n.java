package zq0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import j20.C117292a;
import java.util.ArrayList;
import zq0.C91905o;

/* renamed from: zq0.n */
public final class C91903n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91905o.C91906a f263145d;

    /* renamed from: e */
    public final /* synthetic */ PhoneItem f263146e;

    public C91903n(C91905o.C91906a aVar, PhoneItem phoneItem) {
        this.f263145d = aVar;
        this.f263146e = phoneItem;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/DeleteItemAdapter$ViewHolder$fillItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f263145d.f263155z.f263150f.invoke(this.f263146e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/DeleteItemAdapter$ViewHolder$fillItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
