package k11;

import android.view.View;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class v$$v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290527d;

    public /* synthetic */ v$$v(CleanChattingUI cleanChattingUI) {
        this.f290527d = cleanChattingUI;
    }

    public final void onClick(View view) {
        CleanChattingUI cleanChattingUI = this.f290527d;
        long[] jArr = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingUI, array);
        C99084r rVar = cleanChattingUI.f267895d;
        if (rVar.f290441e.size() == rVar.getCount()) {
            rVar.f290441e.clear();
        } else {
            for (int i = 0; i < rVar.getCount(); i++) {
                rVar.f290441e.add(Integer.valueOf(i));
            }
        }
        rVar.notifyDataSetChanged();
        cleanChattingUI.mo127433I7();
        C117292a.m165361g(cleanChattingUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
