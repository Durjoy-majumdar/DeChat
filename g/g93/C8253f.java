package g93;

import android.os.Bundle;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Map;
import o40.C61926c;
import rx3.C13598b0;
import t83.C13851h1;
import wd3.C15153w0;

/* renamed from: g93.f */
public final class C8253f implements C15153w0 {

    /* renamed from: a */
    public final /* synthetic */ int f27184a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler f27185b;

    /* renamed from: c */
    public final /* synthetic */ C13851h1 f27186c;

    /* renamed from: d */
    public final /* synthetic */ C6107m f27187d;

    /* renamed from: g93.f$a */
    public static final class C8254a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13851h1 f27188d;

        /* renamed from: e */
        public final /* synthetic */ C6107m f27189e;

        /* renamed from: f */
        public final /* synthetic */ MsgHandler f27190f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8254a(C13851h1 h1Var, C6107m mVar, MsgHandler msgHandler) {
            super(0);
            this.f27188d = h1Var;
            this.f27189e = mVar;
            this.f27190f = msgHandler;
        }

        public Object invoke() {
            try {
                Bundle b = C13851h1.m13139b(this.f27188d.f38983a);
                C6107m mVar = this.f27189e;
                if (mVar != null) {
                    mVar.Ef0();
                }
                C6107m mVar2 = this.f27189e;
                if (mVar2 != null) {
                    mVar2.mo7036d(b);
                }
                MsgHandler msgHandler = this.f27190f;
                C13851h1 h1Var = this.f27188d;
                msgHandler.mo7210k5(h1Var, this.f27188d.f38996i + ":ok", (Map<String, Object>) null);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WebViewNativePageUtil", "closeWindow ex " + e.getMessage());
                MsgHandler msgHandler2 = this.f27190f;
                C13851h1 h1Var2 = this.f27188d;
                msgHandler2.mo7210k5(h1Var2, this.f27188d.f38996i + ":fail", (Map<String, Object>) null);
            }
            return C13598b0.f38549a;
        }
    }

    public C8253f(int i, MsgHandler msgHandler, C13851h1 h1Var, C6107m mVar) {
        this.f27184a = i;
        this.f27185b = msgHandler;
        this.f27186c = h1Var;
        this.f27187d = mVar;
    }

    /* renamed from: a */
    public final void mo5557a(boolean z) {
        if (!z || this.f27184a != 2) {
            MsgHandler msgHandler = this.f27185b;
            C13851h1 h1Var = this.f27186c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f27186c.f38996i);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(z ? "ok" : "fail");
            msgHandler.mo7210k5(h1Var, sb.toString(), (Map<String, Object>) null);
            return;
        }
        C61926c.m72666K(1500, new C8254a(this.f27186c, this.f27187d, this.f27185b));
    }
}
