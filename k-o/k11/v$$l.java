package k11;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class v$$l implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290509d;

    public /* synthetic */ v$$l(CleanChattingUI cleanChattingUI) {
        this.f290509d = cleanChattingUI;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CleanChattingUI cleanChattingUI = this.f290509d;
        long[] jArr = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", cleanChattingUI, array);
        C99084r rVar = cleanChattingUI.f267895d;
        if (!rVar.f290441e.add(Integer.valueOf(i))) {
            rVar.f290441e.remove(Integer.valueOf(i));
        }
        rVar.notifyDataSetChanged();
        cleanChattingUI.mo127433I7();
        C117292a.m165361g(cleanChattingUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
