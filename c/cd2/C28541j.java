package cd2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.booter.notification.C67843i;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.notification.p1186ui.FailSendMsgNotification;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import eb0.C86492u2;
import eb0.C97625j3;
import ei3.C86522b;
import p645pj.C77095h;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: cd2.j */
public class C28541j extends C86301e {

    /* renamed from: d */
    public volatile C28535f f78387d = null;

    /* renamed from: e */
    public volatile C28539i f78388e = null;

    public static C28541j vx0() {
        return (C28541j) C86312j.m106911c(C28541j.class);
    }

    public static FailSendMsgNotification wx0(int i) {
        if (i == 2 && vx0().yx0() != null) {
            Log.m105918d("MicroMsg.SubCoreNotification", "get sns notificaiton");
            return vx0().yx0().f346877b;
        } else if (i != 1 || vx0().xx0() == null) {
            return null;
        } else {
            Log.m105918d("MicroMsg.SubCoreNotification", "get msg notificaiton");
            return vx0().xx0().f346877b;
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C86492u2 f = C97625j3.m125816f();
        int b = C77095h.m93059b();
        ((MMNotification) f).getClass();
        C67843i.m80207d(b);
        ((MMNotification) C97625j3.m125816f()).getClass();
        C67843i.m80206c(false);
        Log.m105918d("MicroMsg.SubCoreNotification", "onAccountPostReset");
    }

    public void onAccountReleased(Context context) {
        ((MMNotification) C97625j3.m125816f()).getClass();
        C67843i.m80207d(0);
        ((MMNotification) C97625j3.m125816f()).getClass();
        C67843i.m80206c(true);
        Log.m105918d("MicroMsg.SubCoreNotification", "onAccountRelease");
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        Log.m105918d("MicroMsg.FailMsgFileCache", "init FailMsgFileCache");
    }

    public C28535f xx0() {
        if (this.f78387d == null) {
            synchronized (this) {
                if (this.f78387d == null) {
                    this.f78387d = new C28535f();
                }
            }
        }
        return this.f78387d;
    }

    public C28539i yx0() {
        if (this.f78388e == null) {
            synchronized (this) {
                if (this.f78388e == null) {
                    this.f78388e = new C28539i();
                }
            }
        }
        return this.f78388e;
    }
}
