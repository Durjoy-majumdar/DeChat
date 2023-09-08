package a12;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;

/* renamed from: a12.a */
public class C79446a {

    /* renamed from: a */
    public Handler f232985a = new Handler(Looper.getMainLooper());

    /* renamed from: a12.a$a */
    public class C79447a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C79449c f232986d;

        public C79447a(C79446a aVar, C79449c cVar) {
            this.f232986d = cVar;
        }

        public void run() {
            if (this.f232986d != null) {
                ShareTinkerLog.m106533v("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch runnable try to start", new Object[0]);
                this.f232986d.mo109422a();
            }
        }
    }

    /* renamed from: a12.a$b */
    public class C79448b extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ Runnable f232987a;

        /* renamed from: b */
        public final /* synthetic */ long f232988b;

        public C79448b(Runnable runnable, long j) {
            this.f232987a = runnable;
            this.f232988b = j;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent == null ? "" : intent.getAction())) {
                ShareTinkerLog.m106533v("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen off now, send message now", new Object[0]);
                C79446a.this.f232985a.postDelayed(this.f232987a, this.f232988b);
                return;
            }
            ShareTinkerLog.m106533v("Tinker.ScreenOffRetryPatch", "ScreenOffRetryPatch screen on, remove pending runnable and receive", new Object[0]);
            C79446a.this.f232985a.removeCallbacks(this.f232987a);
            context.unregisterReceiver(this);
        }
    }

    /* renamed from: a12.a$c */
    public interface C79449c {
        /* renamed from: a */
        void mo109422a();
    }

    public C79446a(Context context, C79449c cVar, long j) {
        Boolean bool;
        try {
            bool = (Boolean) PowerManager.class.getMethod("isScreenOn", new Class[0]).invoke((PowerManager) context.getSystemService("power"), new Object[0]);
        } catch (Exception unused) {
            bool = null;
        }
        ShareTinkerLog.m106533v("Tinker.ScreenOffRetryPatch", "try post ScreenOffRetryPatch delay time: %d, screen: %b", Long.valueOf(j), bool);
        IntentFilter intentFilter = new IntentFilter();
        C79447a aVar = new C79447a(this, cVar);
        if (bool == null || bool.booleanValue()) {
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
        } else {
            ShareTinkerLog.m106533v("Tinker.ScreenOffRetryPatch", "screen is just off now, we can send message directly", new Object[0]);
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            this.f232985a.postDelayed(aVar, j);
        }
        context.registerReceiver(new C79448b(aVar, j), intentFilter);
    }
}
