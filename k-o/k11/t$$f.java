package k11;

import android.app.ProgressDialog;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingDetailUI;

public final /* synthetic */ class t$$f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingDetailUI f290492d;

    /* renamed from: e */
    public final /* synthetic */ int f290493e;

    /* renamed from: f */
    public final /* synthetic */ int f290494f;

    public /* synthetic */ t$$f(CleanChattingDetailUI cleanChattingDetailUI, int i, int i2) {
        this.f290492d = cleanChattingDetailUI;
        this.f290493e = i;
        this.f290494f = i2;
    }

    public final void run() {
        CleanChattingDetailUI cleanChattingDetailUI = this.f290492d;
        int i = this.f290493e;
        int i2 = this.f290494f;
        int i3 = CleanChattingDetailUI.f267875s;
        cleanChattingDetailUI.getClass();
        if (i > 0 && i2 <= i) {
            ProgressDialog progressDialog = cleanChattingDetailUI.f267880h;
            progressDialog.setMessage(cleanChattingDetailUI.getString(C0966R.string.beu, new Object[]{((i2 * 100) / i) + "%"}));
        }
    }
}
