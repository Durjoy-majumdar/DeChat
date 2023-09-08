package wc3;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76912y0;
import ob0.C117747y;
import p154fy.C87120h;
import te3.wj4;
import wc3.C90945m;

/* renamed from: wc3.n */
public class C53148n implements C90945m.C53147h {

    /* renamed from: a */
    public final /* synthetic */ ProgressDialog f148289a;

    /* renamed from: b */
    public final /* synthetic */ Context f148290b;

    public C53148n(ProgressDialog progressDialog, Context context) {
        this.f148289a = progressDialog;
        this.f148290b = context;
    }

    /* renamed from: c */
    public void mo62709c(int i, int i2, String str, C117747y yVar, boolean z) {
        wj4 h;
        Log.m105925i("MicroMsg.DeepLinkHelper", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(z));
        ProgressDialog progressDialog = this.f148289a;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f148289a.dismiss();
        }
        if (yVar != null && i != 0 && i2 != 0 && (yVar instanceof C87120h) && (h = ((C87120h) yVar).mo63047h()) != null && this.f148290b != null && !Util.isNullOrNil(h.f144098g)) {
            Context context = this.f148290b;
            C76912y0.makeText(context, (CharSequence) this.f148290b.getString(C0966R.string.a3h) + " : " + Util.nullAsNil(h.f144098g), 0).show();
        }
    }
}
