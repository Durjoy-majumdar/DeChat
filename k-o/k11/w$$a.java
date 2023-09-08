package k11;

import android.app.ProgressDialog;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;

public final /* synthetic */ class w$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI.C93016a f290534d;

    public /* synthetic */ w$$a(CleanChattingUI.C93016a aVar) {
        this.f290534d = aVar;
    }

    public final void run() {
        CleanChattingUI.C93016a aVar = this.f290534d;
        CleanChattingUI cleanChattingUI = CleanChattingUI.this;
        ProgressDialog progressDialog = cleanChattingUI.f267904p;
        progressDialog.setMessage(cleanChattingUI.getString(C0966R.string.beu, new Object[]{Math.min(100, ((aVar.f267922n + aVar.f267923o) * 100) / aVar.f267924p) + "%"}));
    }
}
