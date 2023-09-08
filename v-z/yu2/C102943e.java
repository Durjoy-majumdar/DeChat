package yu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import yu2.C102923d;

/* renamed from: yu2.e */
public final class C102943e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102923d f303822d;

    /* renamed from: e */
    public final /* synthetic */ C102944e0 f303823e;

    /* renamed from: f */
    public final /* synthetic */ C102923d.C102929e f303824f;

    public C102943e(C102923d dVar, C102944e0 e0Var, C102923d.C102929e eVar) {
        this.f303822d = dVar;
        this.f303823e = e0Var;
        this.f303824f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1");
        C102923d dVar = this.f303822d;
        dVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getMOnGridMediaClickListener", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        C102923d.C102924a aVar = dVar.f303793p;
        SnsMethodCalculate.markEndTimeMs("getMOnGridMediaClickListener", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        if (aVar != null) {
            C102944e0 e0Var = this.f303823e;
            View view2 = this.f303824f.f44854d;
            C87412m.m108593f(view2, "itemView");
            aVar.mo142649a(e0Var, view2);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
