package z33;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: z33.a */
public class C112581a {

    /* renamed from: a */
    public static C112583b f337113a;

    /* renamed from: z33.a$b */
    public static class C112583b extends BroadcastReceiver {
        public C112583b(C112582a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && !"android.intent.action.BATTERY_OKAY".equals(intent.getAction())) {
                "android.intent.action.BATTERY_LOW".equals(intent.getAction());
            }
        }
    }

    /* renamed from: a */
    public static void m153848a() {
        if (f337113a == null) {
            f337113a = new C112583b((C112582a) null);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        MMApplicationContext.getContext().registerReceiver(f337113a, intentFilter);
    }
}
