package vm0;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import org.json.JSONObject;

/* renamed from: vm0.h */
public class C90841h extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 580;
    private static final String NAME = "showVirtualBottomNavigationBar";

    /* renamed from: vm0.h$a */
    public class C90842a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f260802d;

        /* renamed from: e */
        public final /* synthetic */ int f260803e;

        public C90842a(C82381f fVar, int i) {
            this.f260802d = fVar;
            this.f260803e = i;
        }

        public void run() {
            C90841h.this.mo124941w(this.f260802d, this.f260803e);
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        mo124941w(fVar, i);
    }

    /* renamed from: w */
    public final void mo124941w(C82381f fVar, int i) {
        if (!MMHandlerThread.isMainThread()) {
            MMHandlerThread.postToMainThread(new C90842a(fVar, i));
            return;
        }
        Log.m105924i("JsApiShowVirtualBottomNavigationBar", "show");
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(fVar.getContext());
        if (castActivityOrNull == null) {
            Log.m105924i("JsApiShowVirtualBottomNavigationBar", "null == activity");
        } else {
            Window window = castActivityOrNull.getWindow();
            if (window == null) {
                Log.m105924i("JsApiShowVirtualBottomNavigationBar", "null == window");
            } else {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -513 & -3 & -4097 & -257);
                window.getDecorView().setOnSystemUiVisibilityChangeListener((View.OnSystemUiVisibilityChangeListener) null);
            }
        }
        fVar.mo109647a(i, mo115109j("ok"));
    }
}
