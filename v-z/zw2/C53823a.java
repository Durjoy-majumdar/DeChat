package zw2;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.subapp.p109ui.openapi.AddAppUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zw2.a */
public class C53823a implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddAppUI f151041d;

    public C53823a(AddAppUI addAppUI) {
        this.f151041d = addAppUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        AddAppUI.m46737H7(this.f151041d, this.f151041d.f116789e.mo67400I(i).field_appId);
        C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
