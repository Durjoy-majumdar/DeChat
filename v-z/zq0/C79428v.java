package zq0;

import android.view.View;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: zq0.v */
public final class C79428v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79426u f232959d;

    /* renamed from: e */
    public final /* synthetic */ PhoneItem f232960e;

    public C79428v(C79426u uVar, PhoneItem phoneItem) {
        this.f232959d = uVar;
        this.f232960e = phoneItem;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Iterator<PhoneItem> it = this.f232959d.f232954e.iterator();
        while (it.hasNext()) {
            it.next().f245279o = false;
        }
        this.f232960e.f245279o = true;
        this.f232959d.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/ItemAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
