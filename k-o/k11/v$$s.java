package k11;

import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import com.tencent.wcdb.support.CancellationSignal;
import qo3.C47883u;

public final /* synthetic */ class v$$s implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ CleanChattingUI f290523a;

    /* renamed from: b */
    public final /* synthetic */ CancellationSignal f290524b;

    public /* synthetic */ v$$s(CleanChattingUI cleanChattingUI, CancellationSignal cancellationSignal) {
        this.f290523a = cleanChattingUI;
        this.f290524b = cancellationSignal;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        CleanChattingUI cleanChattingUI = this.f290523a;
        CancellationSignal cancellationSignal = this.f290524b;
        if (!z) {
            long[] jArr = CleanChattingUI.f267888D;
            cleanChattingUI.getClass();
            cancellationSignal.cancel();
        }
        cleanChattingUI.f267904p.show();
    }
}
