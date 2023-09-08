package com.tencent.p014mm.p136ui.tools;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.p136ui.tools.FilterImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.k0 */
public class C116155k0 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FilterImageView f348607d;

    public C116155k0(FilterImageView filterImageView) {
        this.f348607d = filterImageView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/FilterImageView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        FilterImageView.C116128a aVar = this.f348607d.f348526n;
        aVar.f348530d = i;
        aVar.notifyDataSetChanged();
        try {
            FilterImageView filterImageView = this.f348607d;
            FilterImageView.C116131c cVar = FilterImageView.f348518r[i];
            filterImageView.f348527o = cVar.f348543f;
            FilterImageView.m163410a(filterImageView, cVar.f348539b, cVar.f348540c, cVar.f348541d);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FilterView", e.toString());
            Log.printErrStackTrace("MicroMsg.FilterView", e, "", new Object[0]);
        } catch (OutOfMemoryError e2) {
            Log.m105920e("MicroMsg.FilterView", e2.toString());
            Log.printErrStackTrace("MicroMsg.FilterView", e2, "", new Object[0]);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/tools/FilterImageView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
