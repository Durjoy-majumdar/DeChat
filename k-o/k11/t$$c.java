package k11;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingDetailUI;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

public final /* synthetic */ class t$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingDetailUI f290489d;

    public /* synthetic */ t$$c(CleanChattingDetailUI cleanChattingDetailUI) {
        this.f290489d = cleanChattingDetailUI;
    }

    public final void onClick(View view) {
        CleanChattingDetailUI cleanChattingDetailUI = this.f290489d;
        int i = CleanChattingDetailUI.f267875s;
        cleanChattingDetailUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingDetailUI, array);
        C76879j.m92707A(cleanChattingDetailUI, cleanChattingDetailUI.getString(C0966R.string.bj7), "", cleanChattingDetailUI.getString(C0966R.string.f360335by3), cleanChattingDetailUI.getString(C0966R.string.auj), new t$$g(cleanChattingDetailUI), new t$$h());
        C117292a.m165361g(cleanChattingDetailUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
