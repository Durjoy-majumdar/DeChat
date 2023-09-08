package k11;

import android.view.View;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class v$$u implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290526d;

    public /* synthetic */ v$$u(CleanChattingUI cleanChattingUI) {
        this.f290526d = cleanChattingUI;
    }

    public final void onClick(View view) {
        CleanChattingUI cleanChattingUI = this.f290526d;
        long[] jArr = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanChattingUI, array);
        if (cleanChattingUI.f267910v == 0) {
            cleanChattingUI.mo127434J7(1, cleanChattingUI.f267903o, cleanChattingUI.f267902n);
        } else {
            cleanChattingUI.mo127434J7(cleanChattingUI.f267910v, cleanChattingUI.f267902n, 0);
        }
        C117292a.m165361g(cleanChattingUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
