package bj2;

import android.content.ContentValues;
import android.view.View;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import eb0.C31543z5;
import gy3.C24560g0;
import i40.C60247c;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bj2.g */
public final class C54465g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C54471p f152731d;

    public C54465g(C54471p pVar) {
        this.f152731d = pVar;
    }

    public final void onClick(View view) {
        Class cls = C54472r.class;
        Class cls2 = C54468j.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/DemoConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C60247c.C60248a aVar = C60247c.f171775g;
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", this.f152731d.f152734d.mo90394l2());
        C54473v vVar = (C54473v) ((C54472r) ((C54468j) aVar.mo85234a(cls2)).mo85233d3(cls)).get(contentValues, C24560g0.m30725a(C54473v.class));
        if (vVar != null) {
            vVar.mo90402u2(C31543z5.m39453c());
            MvvmStorage.update$default(((C54468j) aVar.mo85234a(cls2)).mo85233d3(cls), vVar, false, false, 6, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/DemoConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
