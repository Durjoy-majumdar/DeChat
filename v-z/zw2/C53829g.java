package zw2;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.subapp.p109ui.openapi.ServiceAppUI;
import com.tencent.p014mm.plugin.subapp.p109ui.openapi.ServicePreference;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zw2.g */
public class C53829g implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ServiceAppUI f151052d;

    public C53829g(ServiceAppUI serviceAppUI) {
        this.f151052d = serviceAppUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        ServicePreference servicePreference = this.f151052d.f116816e;
        if (servicePreference == null) {
            Log.m105920e("MicroMsg.ServiceAppUI", "wx onItemClick wxServicePref null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        C44561j jVar = (i < 0 || i >= servicePreference.f116827K.getCount()) ? null : (C44561j) servicePreference.f116827K.getItem(i);
        if (jVar == null) {
            Log.m105920e("MicroMsg.ServiceAppUI", "wx onItemClick app is null");
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        Log.m105925i("MicroMsg.ServiceAppUI", "onItemClick, jumpType[%d], package[%s], appid[%s]", Integer.valueOf(jVar.f149251R0), jVar.field_packageName, jVar.field_appId);
        ServiceAppUI.m46744H7(this.f151052d, jVar);
        C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/openapi/ServiceAppUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
