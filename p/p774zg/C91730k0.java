package p774zg;

import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.JavaVoidCallback;
import com.eclipsesource.mmv8.V8Array;
import com.eclipsesource.mmv8.V8Object;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.C84073q2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Locale;
import java.util.Objects;

/* renamed from: zg.k0 */
public class C91730k0 implements JavaVoidCallback {

    /* renamed from: a */
    public final /* synthetic */ int f262754a;

    /* renamed from: b */
    public final /* synthetic */ C80681o f262755b;

    public C91730k0(C80681o oVar, int i) {
        this.f262755b = oVar;
        this.f262754a = i;
    }

    public void invoke(V8Object v8Object, V8Array v8Array) {
        C81925i2 i2Var;
        if (v8Array.length() >= 1 && v8Array.getType(0) == 4) {
            C91735n0 n0Var = this.f262755b.f236077c;
            int i = this.f262754a;
            String string = v8Array.getString(0);
            C84073q2.C84077d dVar = (C84073q2.C84077d) n0Var;
            if (C84073q2.this.f245485j.get()) {
                i2Var = null;
            } else {
                i2Var = C84073q2.this.f245476a;
                Objects.requireNonNull(i2Var);
            }
            C83165i jsRuntime = i2Var != null ? i2Var.getJsRuntime() : null;
            if (jsRuntime == null) {
                Log.m105929w("MicroMsg.AppBrandWorkerContainer", "onWorkerMessage(appId:%s, id:%d, msg:%s), mService.getJsRuntime() is null", C84073q2.this.f245480e, Integer.valueOf(i), string);
            } else {
                jsRuntime.evaluateJavascript(String.format(Locale.ENGLISH, "typeof WeixinWorker.workerMsgHandler !== 'undefined' && WeixinWorker.workerMsgHandler(%d, %s);", new Object[]{Integer.valueOf(i), string}), (ValueCallback<String>) null);
            }
        }
    }
}
