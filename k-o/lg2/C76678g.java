package lg2;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.recharge.p093ui.form.InstantAutoCompleteTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: lg2.g */
public class C76678g implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ InstantAutoCompleteTextView f224365d;

    /* renamed from: e */
    public final /* synthetic */ C76681j f224366e;

    public C76678g(C76681j jVar, InstantAutoCompleteTextView instantAutoCompleteTextView) {
        this.f224366e = jVar;
        this.f224365d = instantAutoCompleteTextView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C76681j jVar = this.f224366e;
        jVar.f224371b = jVar.f224373d.getItem(i);
        if (this.f224366e.f224371b != null) {
            Log.m105924i("MicroMsg.CommonHintViewConfig", "onItemClick record.record " + this.f224366e.f224371b.f224103a + ", record.name " + this.f224366e.f224371b.f224104b);
            C76681j jVar2 = this.f224366e;
            jVar2.f224374e = true;
            jVar2.mo106950b(jVar2.f224371b);
        } else {
            Log.m105928w("MicroMsg.CommonHintViewConfig", "record is null");
        }
        this.f224365d.dismissDropDown();
        C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
