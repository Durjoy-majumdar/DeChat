package mp0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import p910lj.C76701a;

/* renamed from: mp0.q */
public class C34626q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C34627r f93129d;

    public C34626q(C34627r rVar) {
        this.f93129d = rVar;
    }

    public void run() {
        Context context = this.f93129d.f93130a;
        C76701a.makeText(context, (CharSequence) this.f93129d.f93131b + " exported.", 1).show();
        Log.m105925i("MiroMsg.GameHeapProfile", "v8DumpSnapshot to :%s", this.f93129d.f93131b);
    }
}
