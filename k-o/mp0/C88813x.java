package mp0;

import android.content.Context;
import android.widget.Toast;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: mp0.x */
public class C88813x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f256215d;

    /* renamed from: e */
    public final /* synthetic */ C88814y f256216e;

    public C88813x(C88814y yVar, String str) {
        this.f256216e = yVar;
        this.f256215d = str;
    }

    public void run() {
        Context context = this.f256216e.f256217a;
        Toast.makeText(context, "stop v8 tracing: " + this.f256215d, 1).show();
        Log.m105924i("MiroMsg.V8Tracing", "stop v8 tracing: " + this.f256215d);
    }
}
