package p674ri;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import f40.C86709a0;
import ke3.C88144b;
import lc3.C10485b;

/* renamed from: ri.d */
public final class C77528d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77520a f226048d;

    public C77528d(C77520a aVar) {
        this.f226048d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C77520a aVar = this.f226048d;
        MMActivity mMActivity = aVar.f226029a;
        if (mMActivity != null) {
            if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ChatroomGlobalSwitch"), 1) == 1) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", aVar.mo107678d(C0966R.string.b5y, LocaleUtil.getApplicationLanguage()));
                intent.putExtra("geta8key_username", C75592q0.m90789s());
                intent.putExtra("showShare", false);
                C88144b.m109791i(mMActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }
}
