package p518fb;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import org.json.JSONObject;

/* renamed from: fb.f */
public class C86784f extends C82268c<C81925i2> {
    private static final int CTRL_INDEX = 70;
    private static final String NAME = "hideKeyboard";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C81925i2 i2Var = (C81925i2) fVar;
        MMHandlerThread.postToMainThread(new C86783e(this, i2Var));
        i2Var.mo109647a(i, mo115109j("ok"));
    }
}
