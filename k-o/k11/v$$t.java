package k11;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingDetailUI;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import wy0.C102506a;

public final /* synthetic */ class v$$t implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290525d;

    public /* synthetic */ v$$t(CleanChattingUI cleanChattingUI) {
        this.f290525d = cleanChattingUI;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CleanChattingUI cleanChattingUI = this.f290525d;
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
        C99086u a = cleanChattingUI.f267895d.getItem(i);
        if (a == null) {
            C117292a.m165361g(cleanChattingUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (a.f290497b[1] > 0) {
            long[] H7 = cleanChattingUI.mo127432H7();
            Intent intent = new Intent(cleanChattingUI, CleanChattingDetailUI.class);
            intent.putExtra("key_username", a.f290496a);
            intent.putExtra("key_subtype", CleanChattingUI.f267891G[cleanChattingUI.f267910v]);
            intent.putExtra("key_min_time", H7[0]);
            intent.putExtra("key_max_time", H7[1]);
            cleanChattingUI.startActivityForResult(intent, 0);
            C102506a.m135309i(8, 0, new Long[0]);
            C115669n.INSTANCE.idkeyStat(714, 21, 1, false);
        } else {
            C76879j.m92738i(cleanChattingUI, C0966R.string.m2u, C0966R.string.f361465k34);
        }
        C117292a.m165361g(cleanChattingUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
