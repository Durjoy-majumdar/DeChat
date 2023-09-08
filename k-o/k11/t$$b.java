package k11;

import android.view.View;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingDetailUI;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class t$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingDetailUI f290488d;

    public /* synthetic */ t$$b(CleanChattingDetailUI cleanChattingDetailUI) {
        this.f290488d = cleanChattingDetailUI;
    }

    public final void onClick(View view) {
        CleanChattingDetailUI cleanChattingDetailUI = this.f290488d;
        int i = CleanChattingDetailUI.f267875s;
        cleanChattingDetailUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingDetailUI, array);
        C99085s sVar = cleanChattingDetailUI.f267876d;
        if (sVar.f290454d.size() == sVar.f290456f.size()) {
            sVar.f290454d.clear();
        } else {
            for (int i2 = 0; i2 < sVar.f290456f.size(); i2++) {
                sVar.f290454d.add(Integer.valueOf(i2));
            }
        }
        sVar.mo138425a();
        cleanChattingDetailUI.f267876d.notifyDataSetChanged();
        C117292a.m165361g(cleanChattingDetailUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
