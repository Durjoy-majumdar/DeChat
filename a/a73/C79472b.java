package a73;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import b73.C28273c;
import b73.C67213b;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.walletlock.model.C106558g;
import com.tencent.p014mm.plugin.walletlock.model.C106561j;
import com.tencent.p014mm.plugin.walletlock.p951ui.C85509a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import js0.C88015a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: a73.b */
public class C79472b extends C86301e implements C28273c {

    /* renamed from: d */
    public final LinkedList<Activity> f233025d = new LinkedList<>();

    /* renamed from: e */
    public C67213b f233026e = new C106558g();

    /* renamed from: a73.b$a */
    public class C79473a extends C88015a {
        public C79473a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof C85509a) {
                Iterator<Activity> it = C79472b.this.f233025d.iterator();
                while (it.hasNext()) {
                    it.next().finish();
                }
                C79472b.this.f233025d.clear();
                C79472b.this.f233025d.add(activity);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof C85509a) {
                C79472b.this.f233025d.remove(activity);
            }
        }
    }

    /* renamed from: Jf */
    public C67213b mo55895Jf() {
        if (this.f233026e == null) {
            synchronized (this) {
                if (this.f233026e == null) {
                    this.f233026e = new C106558g();
                }
            }
        }
        return this.f233026e;
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105924i("MicroMsg.PluginWalletLock", "alvinluo PluginWalletLock onAccountRelease");
        HashSet<WeakReference<Activity>> hashSet = C106561j.INSTANCE.f318390g;
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C86709a0.m107531m().mo58407a().f124990c.registerActivityLifecycleCallbacks(new C79473a());
    }
}
