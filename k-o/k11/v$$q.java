package k11;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import com.tencent.wcdb.support.CancellationSignal;
import i11.C98589j;
import qo3.C77426q;

public final /* synthetic */ class v$$q implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290521d;

    /* renamed from: e */
    public final /* synthetic */ CancellationSignal f290522e;

    public /* synthetic */ v$$q(CleanChattingUI cleanChattingUI, CancellationSignal cancellationSignal) {
        this.f290521d = cleanChattingUI;
        this.f290522e = cancellationSignal;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        CleanChattingUI cleanChattingUI = this.f290521d;
        CancellationSignal cancellationSignal = this.f290522e;
        long[] jArr = CleanChattingUI.f267888D;
        cleanChattingUI.getClass();
        C77426q qVar = new C77426q(cleanChattingUI);
        qVar.mo107589a(false);
        qVar.mo107590b(new v$$s(cleanChattingUI, cancellationSignal));
        if (C98589j.f289084a) {
            qVar.mo107595g(cleanChattingUI.getString(C0966R.string.n0p));
            qVar.mo107602n(cleanChattingUI.getString(C0966R.string.n0q));
        } else {
            qVar.mo107595g(cleanChattingUI.getString(C0966R.string.be7));
            qVar.mo107602n(cleanChattingUI.getString(C0966R.string.be9));
            qVar.mo107598j(cleanChattingUI.getString(C0966R.string.be8));
        }
        qVar.mo107603o();
    }
}
