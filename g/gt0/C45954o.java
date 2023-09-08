package gt0;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gt0.o */
public class C45954o implements ValueCallback<String> {

    /* renamed from: a */
    public final /* synthetic */ C84926a f123961a;

    public C45954o(C84926a aVar) {
        this.f123961a = aVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        Log.m105925i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "onReceiveValue, value:%s", str);
        if (!Util.isNullOrNil(str)) {
            try {
                String optString = new JSONObject(str).optString("type", "");
                if (!Util.isNullOrNil(optString) && optString.equalsIgnoreCase("ok")) {
                    Log.m105924i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "onReceiveValue, type:ok");
                    this.f123961a.mo117756c(5, 1);
                    this.f123961a.mo117754a();
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", e, "launchCommentApplication exception:%s", e);
            }
        }
    }
}
