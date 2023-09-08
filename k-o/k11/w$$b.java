package k11;

import android.app.ProgressDialog;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import h11.C98311d;
import nj3.C76912y0;

public final /* synthetic */ class w$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI.C93016a f290535d;

    public /* synthetic */ w$$b(CleanChattingUI.C93016a aVar) {
        this.f290535d = aVar;
    }

    public final void run() {
        String str;
        CleanChattingUI.C93016a aVar = this.f290535d;
        ProgressDialog progressDialog = CleanChattingUI.this.f267904p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (aVar.f267925q) {
            str = CleanChattingUI.this.getString(C0966R.string.n0r);
        } else {
            str = CleanChattingUI.this.getString(C0966R.string.beb, new Object[]{C98311d.m127053b(aVar.f267917f)});
        }
        C76912y0.m92768g(CleanChattingUI.this, str);
    }
}
