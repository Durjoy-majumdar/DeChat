package dl0;

import android.os.Bundle;
import com.tencent.p014mm.openim.model.OpenImKefuStartChattingResultReceiver;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: dl0.a */
public final class C86339a implements OpenImKefuStartChattingResultReceiver.C40388a {

    /* renamed from: a */
    public boolean f251032a;

    /* renamed from: b */
    public final /* synthetic */ C86341b f251033b;

    /* renamed from: c */
    public final /* synthetic */ C81925i2 f251034c;

    /* renamed from: d */
    public final /* synthetic */ int f251035d;

    /* renamed from: dl0.a$a */
    public static final class C86340a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86341b f251036d;

        /* renamed from: e */
        public final /* synthetic */ C81925i2 f251037e;

        /* renamed from: f */
        public final /* synthetic */ int f251038f;

        /* renamed from: g */
        public final /* synthetic */ int f251039g;

        /* renamed from: h */
        public final /* synthetic */ String f251040h;

        public C86340a(C86341b bVar, C81925i2 i2Var, int i, int i2, String str) {
            this.f251036d = bVar;
            this.f251037e = i2Var;
            this.f251038f = i;
            this.f251039g = i2;
            this.f251040h = str;
        }

        public final void run() {
            this.f251036d.mo120730y(this.f251037e, this.f251038f, this.f251039g, this.f251040h);
        }
    }

    public C86339a(C86341b bVar, C81925i2 i2Var, int i) {
        this.f251033b = bVar;
        this.f251034c = i2Var;
        this.f251035d = i;
    }

    /* renamed from: a */
    public void mo63102a(Bundle bundle) {
        int i;
        if (bundle != null && (i = bundle.getInt("result_key_action", -1)) >= 0) {
            int i2 = bundle.getInt("result_key_err_code", -1);
            String string = bundle.getString("result_key_err_msg");
            if (string == null) {
                string = "";
            }
            String str = string;
            Log.m105924i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat onReceiveResult action: " + i + ", errCode: " + i2 + ", errMsg: " + str);
            if (i == 2) {
                this.f251033b.mo120730y(this.f251034c, this.f251035d, i2, str);
            } else if (i == 3) {
                C119179t tVar = C119157j.f356862d;
                C86340a aVar = new C86340a(this.f251033b, this.f251034c, this.f251035d, i2, str);
                long j = this.f251032a ? 0 : 1000;
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, j, false);
            } else if (i == 4) {
                this.f251033b.mo120730y(this.f251034c, this.f251035d, i2, str);
            } else if (i == 5) {
                this.f251032a = true;
            } else if (i == 6) {
                this.f251033b.mo120730y(this.f251034c, this.f251035d, i2, str);
            } else if (i == 8) {
                this.f251033b.mo120730y(this.f251034c, this.f251035d, i2, str);
            }
        }
    }
}
