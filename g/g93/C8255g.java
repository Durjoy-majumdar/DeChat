package g93;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler;
import java.util.Map;
import t83.C13851h1;

/* renamed from: g93.g */
public final class C8255g implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f27191d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f27192e;

    public C8255g(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f27191d = msgHandler;
        this.f27192e = h1Var;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        MsgHandler msgHandler = this.f27191d;
        C13851h1 h1Var = this.f27192e;
        msgHandler.mo7210k5(h1Var, this.f27192e.f38996i + ":ok", (Map<String, Object>) null);
    }
}
