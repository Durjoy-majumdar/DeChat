package k11;

import com.tencent.p014mm.p136ui.widget.dialog.MMFilterDialog;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import zt3.C119157j;

public final /* synthetic */ class v$$b implements MMFilterDialog.C74985f {

    /* renamed from: a */
    public final /* synthetic */ CleanChattingUI f290501a;

    public /* synthetic */ v$$b(CleanChattingUI cleanChattingUI) {
        this.f290501a = cleanChattingUI;
    }

    /* renamed from: a */
    public final void mo31857a(int i) {
        CleanChattingUI cleanChattingUI = this.f290501a;
        cleanChattingUI.f267914z = true;
        cleanChattingUI.f267910v = CleanChattingUI.f267889E[i];
        ((C119157j) C119157j.f356862d).mo183871b(new v$$o(cleanChattingUI), "CleanChattingLoad");
    }
}
