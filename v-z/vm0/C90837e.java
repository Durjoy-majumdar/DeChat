package vm0;

import android.app.Activity;
import android.view.Window;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import org.json.JSONObject;

/* renamed from: vm0.e */
public class C90837e extends C82268c {
    private static final int CTRL_INDEX = 580;
    private static final String NAME = "hideVirtualBottomNavigationBar";

    /* renamed from: vm0.e$a */
    public class C90838a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f260797d;

        /* renamed from: e */
        public final /* synthetic */ int f260798e;

        public C90838a(C82381f fVar, int i) {
            this.f260797d = fVar;
            this.f260798e = i;
        }

        public void run() {
            C90837e.this.mo124938w(this.f260797d, this.f260798e);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo124938w(fVar, i);
    }

    /* renamed from: w */
    public final void mo124938w(C82381f fVar, int i) {
        if (!MMHandlerThread.isMainThread()) {
            MMHandlerThread.postToMainThread(new C90838a(fVar, i));
            return;
        }
        Log.m105924i("JsApiHideVirtualBottomNavigationBar", "hide");
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(fVar.getContext());
        if (castActivityOrNull == null) {
            Log.m105924i("JsApiHideVirtualBottomNavigationBar", "null == activity");
        } else {
            Window window = castActivityOrNull.getWindow();
            if (window == null) {
                Log.m105924i("JsApiHideVirtualBottomNavigationBar", "null == window");
            } else {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility() | 512 | 2 | 4096 | 256;
                window.getDecorView().setSystemUiVisibility(systemUiVisibility);
                window.getDecorView().setOnSystemUiVisibilityChangeListener(new C90839f(this, window, systemUiVisibility));
            }
        }
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
