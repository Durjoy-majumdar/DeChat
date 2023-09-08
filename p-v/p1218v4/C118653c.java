package p1218v4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p1014o4.C117693m;
import p1169a5.C112757a;

/* renamed from: v4.c */
public abstract class C118653c<T> extends C118655d<T> {

    /* renamed from: h */
    public static final String f355043h = C117693m.m165967e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final BroadcastReceiver f355044g = new C118654a();

    /* renamed from: v4.c$a */
    public class C118654a extends BroadcastReceiver {
        public C118654a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C118653c.this.mo183376f(context, intent);
            }
        }
    }

    public C118653c(Context context, C112757a aVar) {
        super(context, aVar);
    }

    /* renamed from: c */
    public void mo183377c() {
        C117693m.m165966c().mo182389a(f355043h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f355048b.registerReceiver(this.f355044g, mo183375e());
    }

    /* renamed from: d */
    public void mo183378d() {
        C117693m.m165966c().mo182389a(f355043h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f355048b.unregisterReceiver(this.f355044g);
    }

    /* renamed from: e */
    public abstract IntentFilter mo183375e();

    /* renamed from: f */
    public abstract void mo183376f(Context context, Intent intent);
}
