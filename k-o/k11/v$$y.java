package k11;

import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import java.util.Comparator;

public final /* synthetic */ class v$$y implements Comparator {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290531d;

    public /* synthetic */ v$$y(CleanChattingUI cleanChattingUI) {
        this.f290531d = cleanChattingUI;
    }

    public final int compare(Object obj, Object obj2) {
        CleanChattingUI cleanChattingUI = this.f290531d;
        C99086u uVar = (C99086u) obj;
        C99086u uVar2 = (C99086u) obj2;
        return cleanChattingUI.f267913y == 0 ? Long.compare(uVar2.f290497b[cleanChattingUI.f267910v], uVar.f290497b[cleanChattingUI.f267910v]) : Long.compare(uVar.f290498c[cleanChattingUI.f267910v], uVar2.f290498c[cleanChattingUI.f267910v]);
    }
}
