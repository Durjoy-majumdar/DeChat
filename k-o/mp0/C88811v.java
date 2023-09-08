package mp0;

import android.widget.Toast;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: mp0.v */
public class C88811v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C88812w f256213d;

    public C88811v(C88812w wVar) {
        this.f256213d = wVar;
    }

    public void run() {
        Toast.makeText(this.f256213d.f256214a, "start v8 tracing...", 1).show();
        Log.m105924i("MiroMsg.V8Tracing", "start v8 tracing...");
    }
}
