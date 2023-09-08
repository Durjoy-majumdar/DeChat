package fg2;

import android.view.View;
import com.tencent.p014mm.plugin.radar.p091ui.RadarSpecialGridView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: fg2.a */
public final class C8028a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75748b f26725d;

    /* renamed from: e */
    public final /* synthetic */ int f26726e;

    public C8028a(C75748b bVar, int i) {
        this.f26725d = bVar;
        this.f26726e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/radar/ui/GridDataAdapter$fillDataToTable$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        RadarSpecialGridView.C5030a onItemClickListener = this.f26725d.f222347a.getOnItemClickListener();
        if (onItemClickListener != null) {
            int i = this.f26726e;
            C87412m.m108593f(view, "v");
            onItemClickListener.mo5988a(i, view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/radar/ui/GridDataAdapter$fillDataToTable$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
