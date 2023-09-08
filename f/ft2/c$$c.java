package ft2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

public class c$$c implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97979c f169620d;

    public c$$c(C97979c cVar) {
        this.f169620d = cVar;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/adapter/SnsTimeLineVendingAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$2");
        C97979c.m126542a(this.f169620d).clear();
        C97979c.m126542a(this.f169620d).put(0, 1);
        this.f169620d.mo137296l(view, 1);
        for (int i = 0; i < C97979c.m126542a(this.f169620d).size(); i++) {
            Log.m105925i("leex-debug", "level:%d count:%d", Integer.valueOf(i), C97979c.m126542a(this.f169620d).get(i));
        }
        SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$2");
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/adapter/SnsTimeLineVendingAdapter$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
