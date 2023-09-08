package zw2;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.subapp.p109ui.openapi.AddAppUI;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zw2.b */
public class C53824b implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AddAppUI f151042d;

    public C53824b(AddAppUI addAppUI) {
        this.f151042d = addAppUI;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C44561j I = this.f151042d.f116789e.mo67400I(i);
        this.f151042d.getClass();
        I.field_status = 0;
        I.field_modifyTime = System.currentTimeMillis();
        C72709y1.yx0().update(I, new String[0]);
        this.f151042d.initView();
        C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
